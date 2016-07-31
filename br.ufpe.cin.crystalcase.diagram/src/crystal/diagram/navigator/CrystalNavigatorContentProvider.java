/*
 * 
 */
package crystal.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import crystal.diagram.edit.parts.AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.AnonymousBlockEditPart;
import crystal.diagram.edit.parts.CallFunction2EditPart;
import crystal.diagram.edit.parts.CallFunction3EditPart;
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedure2EditPart;
import crystal.diagram.edit.parts.CallProcedure3EditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.Case2EditPart;
import crystal.diagram.edit.parts.Case3EditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.Close2EditPart;
import crystal.diagram.edit.parts.Close3EditPart;
import crystal.diagram.edit.parts.CloseEditPart;
import crystal.diagram.edit.parts.Collections2EditPart;
import crystal.diagram.edit.parts.Collections3EditPart;
import crystal.diagram.edit.parts.Collections4EditPart;
import crystal.diagram.edit.parts.Collections5EditPart;
import crystal.diagram.edit.parts.Collections6EditPart;
import crystal.diagram.edit.parts.CollectionsEditPart;
import crystal.diagram.edit.parts.CrystalEditPart;
import crystal.diagram.edit.parts.Cursor2EditPart;
import crystal.diagram.edit.parts.Cursor3EditPart;
import crystal.diagram.edit.parts.Cursor4EditPart;
import crystal.diagram.edit.parts.Cursor5EditPart;
import crystal.diagram.edit.parts.Cursor6EditPart;
import crystal.diagram.edit.parts.CursorEditPart;
import crystal.diagram.edit.parts.DataType2EditPart;
import crystal.diagram.edit.parts.DataType3EditPart;
import crystal.diagram.edit.parts.DataType4EditPart;
import crystal.diagram.edit.parts.DataType5EditPart;
import crystal.diagram.edit.parts.DataType6EditPart;
import crystal.diagram.edit.parts.DataTypeEditPart;
import crystal.diagram.edit.parts.Delete2EditPart;
import crystal.diagram.edit.parts.Delete3EditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.Exception2EditPart;
import crystal.diagram.edit.parts.Exception3EditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.Fetch2EditPart;
import crystal.diagram.edit.parts.Fetch3EditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.For2EditPart;
import crystal.diagram.edit.parts.For3EditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.FunctionEditPart;
import crystal.diagram.edit.parts.FunctionFunctionDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionParametersCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionReturnPartCompartmentEditPart;
import crystal.diagram.edit.parts.If2EditPart;
import crystal.diagram.edit.parts.If3EditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.Insert2EditPart;
import crystal.diagram.edit.parts.Insert3EditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.Loop2EditPart;
import crystal.diagram.edit.parts.Loop3EditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.Open2EditPart;
import crystal.diagram.edit.parts.Open3EditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.ProcedureEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureParametersCompartmentEditPart;
import crystal.diagram.edit.parts.Records2EditPart;
import crystal.diagram.edit.parts.Records3EditPart;
import crystal.diagram.edit.parts.Records4EditPart;
import crystal.diagram.edit.parts.Records5EditPart;
import crystal.diagram.edit.parts.Records6EditPart;
import crystal.diagram.edit.parts.RecordsEditPart;
import crystal.diagram.edit.parts.Select2EditPart;
import crystal.diagram.edit.parts.Select3EditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.TransitionEditPart;
import crystal.diagram.edit.parts.Update2EditPart;
import crystal.diagram.edit.parts.Update3EditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
import crystal.diagram.edit.parts.While2EditPart;
import crystal.diagram.edit.parts.While3EditPart;
import crystal.diagram.edit.parts.WhileEditPart;
import crystal.diagram.part.CrystalVisualIDRegistry;
import crystal.diagram.part.Messages;

/**
 * @generated
 */
public class CrystalNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public CrystalNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<CrystalNavigatorItem> result = new ArrayList<CrystalNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, CrystalEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof CrystalNavigatorGroup) {
			CrystalNavigatorGroup group = (CrystalNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CrystalNavigatorItem) {
			CrystalNavigatorItem navigatorItem = (CrystalNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {

		case CrystalEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			CrystalNavigatorGroup links = new CrystalNavigatorGroup(Messages.NavigatorGroupName_Crystal_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(AnonymousBlockEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ProcedureEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CollectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(RecordsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ExceptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case FunctionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AnonymousBlockEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Exception3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3037_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3037_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3038_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3038_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Case3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3039_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3039_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Insert3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3040_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3040_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Update3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3041_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3041_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Delete3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3042_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3042_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Select3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3043_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3043_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3044_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3044_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case For3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3045_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3045_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Loop3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3046_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3046_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Open3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3047_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3047_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Fetch3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3048_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3048_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Close3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3049_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3049_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallProcedure3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3050_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallFunction3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3051_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExceptionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3056_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3056_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IfEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3057_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3057_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CaseEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3058_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3058_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InsertEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3059_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3059_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UpdateEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3060_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3060_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DeleteEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3061_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3061_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SelectEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3062_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3062_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WhileEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3063_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3063_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ForEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3064_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3064_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LoopEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3065_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3065_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OpenEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3066_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3066_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FetchEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3067_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3067_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CloseEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3068_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3068_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallProcedureEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3069_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3069_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallFunctionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3070_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3070_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Exception2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3075_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3075_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case If2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3076_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3076_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Case2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3077_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3077_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Insert2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3078_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3078_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Update2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3079_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3079_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Delete2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3080_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3080_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Select2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3081_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3081_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3082_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3082_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case For2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3083_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3083_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Loop2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3084_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3084_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Open2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3085_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3085_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Fetch2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3086_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3086_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Close2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3087_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3087_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallProcedure2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3088_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3088_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CallFunction2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3089_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3089_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TransitionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CrystalNavigatorGroup target = new CrystalNavigatorGroup(Messages.NavigatorGroupName_Transition_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup source = new CrystalNavigatorGroup(Messages.NavigatorGroupName_Transition_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ExceptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ExceptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CrystalEditPart.MODEL_ID.equals(CrystalVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<CrystalNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<CrystalNavigatorItem> result = new ArrayList<CrystalNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new CrystalNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<CrystalNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof CrystalAbstractNavigatorItem) {
			CrystalAbstractNavigatorItem abstractNavigatorItem = (CrystalAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
