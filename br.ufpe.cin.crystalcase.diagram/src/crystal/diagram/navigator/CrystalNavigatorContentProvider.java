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
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.CloseEditPart;
import crystal.diagram.edit.parts.Collections2EditPart;
import crystal.diagram.edit.parts.Collections3EditPart;
import crystal.diagram.edit.parts.Collections4EditPart;
import crystal.diagram.edit.parts.CollectionsEditPart;
import crystal.diagram.edit.parts.CrystalEditPart;
import crystal.diagram.edit.parts.Cursor2EditPart;
import crystal.diagram.edit.parts.Cursor3EditPart;
import crystal.diagram.edit.parts.Cursor4EditPart;
import crystal.diagram.edit.parts.CursorEditPart;
import crystal.diagram.edit.parts.DataType2EditPart;
import crystal.diagram.edit.parts.DataType3EditPart;
import crystal.diagram.edit.parts.DataType4EditPart;
import crystal.diagram.edit.parts.DataTypeEditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.FunctionEditPart;
import crystal.diagram.edit.parts.FunctionFunctionDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionParametersCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionReturnPartCompartmentEditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.ProcedureEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureParametersCompartmentEditPart;
import crystal.diagram.edit.parts.Records2EditPart;
import crystal.diagram.edit.parts.Records3EditPart;
import crystal.diagram.edit.parts.Records4EditPart;
import crystal.diagram.edit.parts.RecordsEditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.TransitionEditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
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
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
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
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
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

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
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
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
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
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<CrystalNavigatorItem> result = new ArrayList<CrystalNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, CrystalEditPart.MODEL_ID),
					file, false));
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
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
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
			CrystalNavigatorGroup links = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Crystal_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
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
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CollectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(RecordsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(ExceptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(DataType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(Collections2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FunctionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CollectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(RecordsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(ExceptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(DataType3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(Collections3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(DataType4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(Collections4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Records4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(Cursor4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnonymousBlockEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CollectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(RecordsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(ExceptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CallProcedureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CrystalVisualIDRegistry
							.getType(CallFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ExceptionEditPart.VISUAL_ID: {
			LinkedList<CrystalAbstractNavigatorItem> result = new LinkedList<CrystalAbstractNavigatorItem>();
			Node sv = (Node) view;
			CrystalNavigatorGroup incominglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Exception_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_If_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_If_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Case_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Case_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Insert_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Insert_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Update_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Update_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Delete_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Delete_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Select_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Select_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_While_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_While_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_For_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_For_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Loop_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Loop_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Open_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Open_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Fetch_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Fetch_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_Close_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Close_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_CallProcedure_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallProcedure_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
					Messages.NavigatorGroupName_CallFunction_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup outgoinglinks = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_CallFunction_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
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
			CrystalNavigatorGroup target = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Transition_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CrystalNavigatorGroup source = new CrystalNavigatorGroup(
					Messages.NavigatorGroupName_Transition_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ExceptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(CallProcedureEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(CallFunctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(ExceptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(InsertEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(UpdateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(DeleteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(ForEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(LoopEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(OpenEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(FetchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry.getType(CloseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(CallProcedureEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CrystalVisualIDRegistry
							.getType(CallFunctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
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
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
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
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
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
		return CrystalEditPart.MODEL_ID.equals(CrystalVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<CrystalNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<CrystalNavigatorItem> result = new ArrayList<CrystalNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new CrystalNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<CrystalNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
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
