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

import crystal.diagram.edit.parts.*;
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
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsTransitionEditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ExpressionEditPart.VISUAL_ID));
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
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CollectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(RecordsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case FunctionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ExpressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ExceptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CollectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(RecordsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataType3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Collections3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AnonymousBlockEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ExpressionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ExceptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CollectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(RecordsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CrystalVisualIDRegistry
					.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ExpressionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3236_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3236_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case ExceptionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3237_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3237_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_If_3238_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3238_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Expression2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3239_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3239_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Exception2EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3240_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3240_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_If_3241_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3241_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Case_3242_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3242_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseOptionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Expression3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3243_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3243_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Exception3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3244_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3244_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_If_3245_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3245_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Insert_3246_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3246_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Update_3247_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3247_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Delete_3248_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3248_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Select_3249_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3249_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_While_3250_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3250_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Expression4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3251_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3251_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Exception4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3252_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3252_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case If4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3253_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3253_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_For_3254_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3254_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Case_3255_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3255_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseOptionsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Case_3256_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3256_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseOptionsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Insert_3257_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3257_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Update_3258_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3258_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Delete_3259_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3259_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Select_3260_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3260_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_While_3261_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3261_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Insert_3262_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3262_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Update_3263_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3263_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Delete_3264_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3264_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Select_3265_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3265_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_While_3266_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3266_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_For_3267_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3267_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Loop_3268_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3268_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Open_3269_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3269_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Fetch_3270_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3270_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Close_3271_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3271_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_CallProcedure_3272_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3272_outgoinglinks,
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
					Messages.NavigatorGroupName_CallFunction_3273_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3273_outgoinglinks,
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

		case For3EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3274_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3274_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Loop_3275_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3275_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Open_3276_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3276_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Fetch_3277_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3277_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Close_3278_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3278_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_CallProcedure_3279_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3279_outgoinglinks,
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
					Messages.NavigatorGroupName_CallFunction_3280_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3280_outgoinglinks,
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

		case OptionsEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Options_3281_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Options_3281_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Expression5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3282_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3282_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Exception5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3283_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3283_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case If5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3284_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3284_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Loop_3285_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3285_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					Messages.NavigatorGroupName_Open_3286_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3286_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Fetch_3287_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3287_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_Close_3288_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3288_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
					Messages.NavigatorGroupName_CallProcedure_3289_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3289_outgoinglinks,
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
					Messages.NavigatorGroupName_CallFunction_3290_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3290_outgoinglinks,
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

		case Expression6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3291_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Expression_3291_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Exception6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3292_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3292_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case If6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3293_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3293_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfTrue_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfIfFalse_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Case4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3294_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3294_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseOptionsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Insert4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3295_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3295_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Update4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3296_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3296_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Delete4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3297_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3297_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Select4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3298_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3298_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case While4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3299_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3299_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case For4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3300_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3300_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Loop4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3301_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3301_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Open4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3302_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3302_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Fetch4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3303_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3303_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Close4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3304_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3304_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case CallProcedure4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3305_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3305_outgoinglinks,
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

		case CallFunction4EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3306_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3306_outgoinglinks,
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

		case Case5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3307_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3307_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseOptionsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Insert5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3308_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3308_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Update5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3309_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3309_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Delete5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3310_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3310_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Select5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3311_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3311_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case While5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3312_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3312_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case For5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3313_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3313_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Loop5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3314_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3314_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Open5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3315_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3315_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Fetch5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3316_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3316_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Close5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3317_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3317_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case CallProcedure5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3318_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3318_outgoinglinks,
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

		case CallFunction5EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3319_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3319_outgoinglinks,
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

		case Case6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3320_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3320_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Loop2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Open2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Fetch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Close2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedure2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseCaseOptionsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Insert6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3321_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3321_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Update6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3322_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3322_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Delete6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3323_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3323_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Select6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3324_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3324_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case While6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3325_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3325_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case For6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3326_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3326_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForForInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Loop6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3327_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3327_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Insert3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Update3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Delete3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Select3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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

		case Open6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3328_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3328_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Fetch6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3329_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3329_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case Close6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3330_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3330_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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

		case CallProcedure6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3331_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3331_outgoinglinks,
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

		case CallFunction6EditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3332_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3332_outgoinglinks,
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
					CrystalVisualIDRegistry.getType(ExpressionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ExceptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(Expression5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
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
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ExpressionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ExceptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Expression2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Expression3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If3EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(Expression4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case3EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(For2EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(For3EditPart.VISUAL_ID));
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
					CrystalVisualIDRegistry.getType(Expression5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If5EditPart.VISUAL_ID));
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
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Expression6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Exception6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(If6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Case6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Insert6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Update6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Delete6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Select6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(While6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(For6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Loop6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Open6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Fetch6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(Close6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallProcedure6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CallFunction6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OptionsTransitionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CrystalNavigatorGroup target = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_OptionsTransition_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			CrystalNavigatorGroup source = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_OptionsTransition_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OptionsEditPart.VISUAL_ID));
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
