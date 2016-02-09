/*
 * 
 */
package crystal.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import crystal.Transition;
import crystal.diagram.edit.parts.AnonymousBlockEditPart;
import crystal.diagram.edit.parts.AnonymousBlockNameEditPart;
import crystal.diagram.edit.parts.CallFunctionDescriptionEditPart;
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedureDescriptionEditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.CaseDescriptionEditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.CloseDescriptionEditPart;
import crystal.diagram.edit.parts.CloseEditPart;
import crystal.diagram.edit.parts.Collections2EditPart;
import crystal.diagram.edit.parts.Collections3EditPart;
import crystal.diagram.edit.parts.Collections4EditPart;
import crystal.diagram.edit.parts.CollectionsEditPart;
import crystal.diagram.edit.parts.CollectionsName2EditPart;
import crystal.diagram.edit.parts.CollectionsName3EditPart;
import crystal.diagram.edit.parts.CollectionsName4EditPart;
import crystal.diagram.edit.parts.CollectionsNameEditPart;
import crystal.diagram.edit.parts.CrystalEditPart;
import crystal.diagram.edit.parts.Cursor2EditPart;
import crystal.diagram.edit.parts.Cursor3EditPart;
import crystal.diagram.edit.parts.Cursor4EditPart;
import crystal.diagram.edit.parts.CursorEditPart;
import crystal.diagram.edit.parts.CursorName2EditPart;
import crystal.diagram.edit.parts.CursorName3EditPart;
import crystal.diagram.edit.parts.CursorName4EditPart;
import crystal.diagram.edit.parts.CursorNameEditPart;
import crystal.diagram.edit.parts.DataType2EditPart;
import crystal.diagram.edit.parts.DataType3EditPart;
import crystal.diagram.edit.parts.DataType4EditPart;
import crystal.diagram.edit.parts.DataTypeEditPart;
import crystal.diagram.edit.parts.DataTypeName2EditPart;
import crystal.diagram.edit.parts.DataTypeName3EditPart;
import crystal.diagram.edit.parts.DataTypeName4EditPart;
import crystal.diagram.edit.parts.DataTypeNameEditPart;
import crystal.diagram.edit.parts.DeleteDescriptionEditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.ExceptionDescriptionEditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.FetchDescriptionEditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.ForDescriptionEditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.FunctionEditPart;
import crystal.diagram.edit.parts.FunctionNameEditPart;
import crystal.diagram.edit.parts.IfDescriptionEditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.InsertDescriptionEditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.LoopDescriptionEditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.OpenDescriptionEditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.ProcedureEditPart;
import crystal.diagram.edit.parts.ProcedureNameEditPart;
import crystal.diagram.edit.parts.Records2EditPart;
import crystal.diagram.edit.parts.Records3EditPart;
import crystal.diagram.edit.parts.Records4EditPart;
import crystal.diagram.edit.parts.RecordsEditPart;
import crystal.diagram.edit.parts.RecordsName2EditPart;
import crystal.diagram.edit.parts.RecordsName3EditPart;
import crystal.diagram.edit.parts.RecordsName4EditPart;
import crystal.diagram.edit.parts.RecordsNameEditPart;
import crystal.diagram.edit.parts.SelectDescriptionEditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.TransitionEditPart;
import crystal.diagram.edit.parts.UpdateDescriptionEditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
import crystal.diagram.edit.parts.WhileDescriptionEditPart;
import crystal.diagram.edit.parts.WhileEditPart;
import crystal.diagram.part.CrystalDiagramEditorPlugin;
import crystal.diagram.part.CrystalVisualIDRegistry;
import crystal.diagram.providers.CrystalElementTypes;
import crystal.diagram.providers.CrystalParserProvider;

/**
 * @generated
 */
public class CrystalNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CrystalDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CrystalDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CrystalNavigatorItem
				&& !isOwnView(((CrystalNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CrystalNavigatorGroup) {
			CrystalNavigatorGroup group = (CrystalNavigatorGroup) element;
			return CrystalDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof CrystalNavigatorItem) {
			CrystalNavigatorItem navigatorItem = (CrystalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case CrystalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?crystal?Crystal", CrystalElementTypes.Crystal_1000); //$NON-NLS-1$
		case ProcedureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?crystal?Procedure", CrystalElementTypes.Procedure_2001); //$NON-NLS-1$
		case FunctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?crystal?Function", CrystalElementTypes.Function_2002); //$NON-NLS-1$
		case AnonymousBlockEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?crystal?AnonymousBlock", CrystalElementTypes.AnonymousBlock_2003); //$NON-NLS-1$
		case DataTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3001); //$NON-NLS-1$
		case CollectionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3002); //$NON-NLS-1$
		case RecordsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Records", CrystalElementTypes.Records_3003); //$NON-NLS-1$
		case CursorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3004); //$NON-NLS-1$
		case ExceptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3005); //$NON-NLS-1$
		case IfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?If", CrystalElementTypes.If_3006); //$NON-NLS-1$
		case CaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Case", CrystalElementTypes.Case_3007); //$NON-NLS-1$
		case InsertEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3008); //$NON-NLS-1$
		case UpdateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Update", CrystalElementTypes.Update_3009); //$NON-NLS-1$
		case DeleteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3010); //$NON-NLS-1$
		case SelectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Select", CrystalElementTypes.Select_3011); //$NON-NLS-1$
		case WhileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?While", CrystalElementTypes.While_3012); //$NON-NLS-1$
		case ForEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?For", CrystalElementTypes.For_3013); //$NON-NLS-1$
		case LoopEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3014); //$NON-NLS-1$
		case OpenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Open", CrystalElementTypes.Open_3015); //$NON-NLS-1$
		case FetchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3016); //$NON-NLS-1$
		case CloseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Close", CrystalElementTypes.Close_3017); //$NON-NLS-1$
		case DataType2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3018); //$NON-NLS-1$
		case Collections2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3019); //$NON-NLS-1$
		case Records2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Records", CrystalElementTypes.Records_3020); //$NON-NLS-1$
		case Cursor2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3021); //$NON-NLS-1$
		case DataType3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3022); //$NON-NLS-1$
		case Collections3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3023); //$NON-NLS-1$
		case Records3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Records", CrystalElementTypes.Records_3024); //$NON-NLS-1$
		case Cursor3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3025); //$NON-NLS-1$
		case DataType4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3026); //$NON-NLS-1$
		case Collections4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3027); //$NON-NLS-1$
		case Records4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Records", CrystalElementTypes.Records_3028); //$NON-NLS-1$
		case Cursor4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3029); //$NON-NLS-1$
		case CallProcedureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3031); //$NON-NLS-1$
		case CallFunctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3032); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?crystal?Transition", CrystalElementTypes.Transition_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CrystalDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CrystalElementTypes.isKnownElementType(elementType)) {
			image = CrystalElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CrystalNavigatorGroup) {
			CrystalNavigatorGroup group = (CrystalNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CrystalNavigatorItem) {
			CrystalNavigatorItem navigatorItem = (CrystalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case CrystalEditPart.VISUAL_ID:
			return getCrystal_1000Text(view);
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2001Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2002Text(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2003Text(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3001Text(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3002Text(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3003Text(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3004Text(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3005Text(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3006Text(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3007Text(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3008Text(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3009Text(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3010Text(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3011Text(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3012Text(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3013Text(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3014Text(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3015Text(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3016Text(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3017Text(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018Text(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019Text(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020Text(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021Text(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3022Text(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3023Text(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3024Text(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3025Text(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3026Text(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3027Text(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3028Text(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3029Text(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3031Text(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3032Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCrystal_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProcedure_2001Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Procedure_2001,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(ProcedureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFunction_2002Text(View view) {
		IParser parser = CrystalParserProvider
				.getParser(CrystalElementTypes.Function_2002,
						view.getElement() != null ? view.getElement() : view,
						CrystalVisualIDRegistry
								.getType(FunctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnonymousBlock_2003Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.AnonymousBlock_2003,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(AnonymousBlockNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3001Text(View view) {
		IParser parser = CrystalParserProvider
				.getParser(CrystalElementTypes.DataType_3001,
						view.getElement() != null ? view.getElement() : view,
						CrystalVisualIDRegistry
								.getType(DataTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollections_3002Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Collections_3002,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CollectionsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecords_3003Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Records_3003,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCursor_3004Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Cursor_3004,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getException_3005Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Exception_3005,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(ExceptionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIf_3006Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.If_3006,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(IfDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCase_3007Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Case_3007,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CaseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInsert_3008Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Insert_3008,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(InsertDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUpdate_3009Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Update_3009,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(UpdateDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelete_3010Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Delete_3010,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(DeleteDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelect_3011Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Select_3011,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(SelectDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_3012Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.While_3012,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(WhileDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFor_3013Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.For_3013,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(ForDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLoop_3014Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Loop_3014,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(LoopDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpen_3015Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Open_3015,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(OpenDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFetch_3016Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Fetch_3016,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(FetchDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClose_3017Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Close_3017,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CloseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3018Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.DataType_3018,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(DataTypeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollections_3019Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Collections_3019,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CollectionsName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecords_3020Text(View view) {
		IParser parser = CrystalParserProvider
				.getParser(CrystalElementTypes.Records_3020,
						view.getElement() != null ? view.getElement() : view,
						CrystalVisualIDRegistry
								.getType(RecordsName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCursor_3021Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Cursor_3021,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3022Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.DataType_3022,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(DataTypeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollections_3023Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Collections_3023,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CollectionsName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecords_3024Text(View view) {
		IParser parser = CrystalParserProvider
				.getParser(CrystalElementTypes.Records_3024,
						view.getElement() != null ? view.getElement() : view,
						CrystalVisualIDRegistry
								.getType(RecordsName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCursor_3025Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Cursor_3025,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3026Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.DataType_3026,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(DataTypeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollections_3027Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Collections_3027,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CollectionsName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecords_3028Text(View view) {
		IParser parser = CrystalParserProvider
				.getParser(CrystalElementTypes.Records_3028,
						view.getElement() != null ? view.getElement() : view,
						CrystalVisualIDRegistry
								.getType(RecordsName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCursor_3029Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.Cursor_3029,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCallProcedure_3031Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.CallProcedure_3031,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CallProcedureDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCallFunction_3032Text(View view) {
		IParser parser = CrystalParserProvider.getParser(
				CrystalElementTypes.CallFunction_3032,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry
						.getType(CallFunctionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		Transition domainModelElement = (Transition) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CrystalEditPart.MODEL_ID.equals(CrystalVisualIDRegistry
				.getModelID(view));
	}

}
