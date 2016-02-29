package crystal.diagram.custom.part.transformation;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.Bundle;

import crystal.CrystalPackage;
import crystal.diagram.part.CrystalDiagramEditor;

public class TransformationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the active editor
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		// This is only meaningful if the editor is a Friends diagram editor
		if (editor instanceof CrystalDiagramEditor) {
			CrystalDiagramEditor diagramEditor = (CrystalDiagramEditor) editor;
		
			// Get the EMF model under the editor
			Resource resource = getFirstSemanticModelResource( diagramEditor.getEditingDomain().getResourceSet());
				if (resource == null) return null;
			
			// Wrap it as an InMemoryEmfModel
			InMemoryEmfModel m = new InMemoryEmfModel("M", resource, CrystalPackage.eINSTANCE);
			
			// Construct the EGL module
			EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(new EglFileGeneratingTemplateFactory());
			
			Bundle bundle = Platform.getBundle("br.ufpe.cin.crystalcase.diagram");
			URL fileURL = bundle.getEntry("model/crystal.egl");
			
			try {
				module.parse(FileLocator.resolve(fileURL).toURI());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			module.getContext().getModelRepository().addModel(m);
			
			String out = "Erro";
			
			try {
				out = (String) module.execute();
			} catch (EolRuntimeException e) {
				e.printStackTrace();
			}
			createSQLFile(out, resource);
			
		}
		return null;
	}

	public void createSQLFile(String sqlText, Resource resource){
		int countSegments = resource.getURI().segmentCount();
		String projectName = resource.getURI().segment(1);
		String schemaName = resource.getURI().segment(countSegments-1);
		schemaName = schemaName.replaceAll(".eer", "");			
		String fileName = "";
		for(int countResource = 2; countResource < countSegments-1 ; countResource++){
			fileName = fileName +"/"+ resource.getURI().segment(countResource);
		}
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("-dd.MM.yyyy-hh.mm.ss");

		fileName = fileName+"/"+schemaName+ft.format(dNow)+".sql";
		fileName = fileName.replaceAll("%20", "\\ ");
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject myProject = myWorkspaceRoot.getProject(projectName);
		IFile newSQL = myProject.getFile(fileName);

		InputStream fileStream = new ByteArrayInputStream(sqlText.getBytes(StandardCharsets.UTF_8));

		IProgressMonitor monitor = new NullProgressMonitor();
		monitor.beginTask("create SQL File", 1);

		if(newSQL.exists()){
			try {
				newSQL.setContents(fileStream, false, true, monitor);
				monitor.worked(1);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}else{
			try {
				newSQL.create(fileStream, false, monitor);
				monitor.worked(1);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		monitor.done();
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IDE.openEditor(page, newSQL);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	public Resource getFirstSemanticModelResource(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			return resource;
		}
		return null;
	}
}
