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
import crystal.diagram.edit.parts.*;
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
public class CrystalNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CrystalDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CrystalDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CrystalNavigatorItem && !isOwnView(((CrystalNavigatorItem) element).getView())) {
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
			return CrystalDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
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
			return getImage("Navigator?Diagram?crystal?Crystal", CrystalElementTypes.Crystal_1000); //$NON-NLS-1$
		case ProcedureEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?crystal?Procedure", CrystalElementTypes.Procedure_2007); //$NON-NLS-1$
		case FunctionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?crystal?Function", CrystalElementTypes.Function_2008); //$NON-NLS-1$
		case AnonymousBlockEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?crystal?AnonymousBlock", CrystalElementTypes.AnonymousBlock_2009); //$NON-NLS-1$
		case DataTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3018); //$NON-NLS-1$
		case CollectionsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3019); //$NON-NLS-1$
		case RecordsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3020); //$NON-NLS-1$
		case CursorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3021); //$NON-NLS-1$
		case DataType3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3022); //$NON-NLS-1$
		case Collections3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3023); //$NON-NLS-1$
		case Records3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3024); //$NON-NLS-1$
		case Cursor3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3025); //$NON-NLS-1$
		case DataType4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3026); //$NON-NLS-1$
		case Collections4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3027); //$NON-NLS-1$
		case Records4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3028); //$NON-NLS-1$
		case Cursor4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3029); //$NON-NLS-1$
		case DataType6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3033); //$NON-NLS-1$
		case Collections6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3034); //$NON-NLS-1$
		case Records6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3035); //$NON-NLS-1$
		case Cursor6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3036); //$NON-NLS-1$
		case Exception3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3037); //$NON-NLS-1$
		case If3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3038); //$NON-NLS-1$
		case Case3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3039); //$NON-NLS-1$
		case Insert3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3040); //$NON-NLS-1$
		case Update3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3041); //$NON-NLS-1$
		case Delete3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3042); //$NON-NLS-1$
		case Select3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3043); //$NON-NLS-1$
		case While3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3044); //$NON-NLS-1$
		case For3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3045); //$NON-NLS-1$
		case Loop3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3046); //$NON-NLS-1$
		case Open3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3047); //$NON-NLS-1$
		case Fetch3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3048); //$NON-NLS-1$
		case Close3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3049); //$NON-NLS-1$
		case CallProcedure3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3050); //$NON-NLS-1$
		case CallFunction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3051); //$NON-NLS-1$
		case DataType2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3052); //$NON-NLS-1$
		case Collections2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3053); //$NON-NLS-1$
		case Records2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3054); //$NON-NLS-1$
		case Cursor2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3055); //$NON-NLS-1$
		case ExceptionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3056); //$NON-NLS-1$
		case IfEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3057); //$NON-NLS-1$
		case CaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3058); //$NON-NLS-1$
		case InsertEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3059); //$NON-NLS-1$
		case UpdateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3060); //$NON-NLS-1$
		case DeleteEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3061); //$NON-NLS-1$
		case SelectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3062); //$NON-NLS-1$
		case WhileEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3063); //$NON-NLS-1$
		case ForEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3064); //$NON-NLS-1$
		case LoopEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3065); //$NON-NLS-1$
		case OpenEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3066); //$NON-NLS-1$
		case FetchEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3067); //$NON-NLS-1$
		case CloseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3068); //$NON-NLS-1$
		case CallProcedureEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3069); //$NON-NLS-1$
		case CallFunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3070); //$NON-NLS-1$
		case DataType5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3071); //$NON-NLS-1$
		case Collections5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3072); //$NON-NLS-1$
		case Records5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3073); //$NON-NLS-1$
		case Cursor5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3074); //$NON-NLS-1$
		case Exception2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3075); //$NON-NLS-1$
		case If2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3076); //$NON-NLS-1$
		case Case2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3077); //$NON-NLS-1$
		case Insert2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3078); //$NON-NLS-1$
		case Update2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3079); //$NON-NLS-1$
		case Delete2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3080); //$NON-NLS-1$
		case Select2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3081); //$NON-NLS-1$
		case While2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3082); //$NON-NLS-1$
		case For2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3083); //$NON-NLS-1$
		case Loop2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3084); //$NON-NLS-1$
		case Open2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3085); //$NON-NLS-1$
		case Fetch2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3086); //$NON-NLS-1$
		case Close2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3087); //$NON-NLS-1$
		case CallProcedure2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3088); //$NON-NLS-1$
		case CallFunction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3089); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?crystal?Transition", CrystalElementTypes.Transition_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CrystalDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CrystalElementTypes.isKnownElementType(elementType)) {
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
			return getProcedure_2007Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2008Text(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2009Text(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3018Text(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3019Text(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3020Text(view);
		case CursorEditPart.VISUAL_ID:
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
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033Text(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034Text(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035Text(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036Text(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3037Text(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3038Text(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3039Text(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3040Text(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3041Text(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3042Text(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3043Text(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3044Text(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3045Text(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3046Text(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3047Text(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3048Text(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3049Text(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3050Text(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3051Text(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3052Text(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3053Text(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3054Text(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3055Text(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056Text(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057Text(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3058Text(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3059Text(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3060Text(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3061Text(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3062Text(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3063Text(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3064Text(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3065Text(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3066Text(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3067Text(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3068Text(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3069Text(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3070Text(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3071Text(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3072Text(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3073Text(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3074Text(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3075Text(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3076Text(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3077Text(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3078Text(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3079Text(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3080Text(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3081Text(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3082Text(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3083Text(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3084Text(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3085Text(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3086Text(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3087Text(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3088Text(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3089Text(view);
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
	private String getProcedure_2007Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Procedure_2007,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ProcedureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_2008Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Function_2008,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FunctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnonymousBlock_2009Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.AnonymousBlock_2009,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(AnonymousBlockNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3018Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3018,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollections_3019Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3019,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecords_3020Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3020,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCursor_3021Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3021,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3022Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3022,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollections_3023Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3023,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecords_3024Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3024,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCursor_3025Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3025,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3026Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3026,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollections_3027Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3027,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecords_3028Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3028,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCursor_3029Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3029,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataType_3033Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3033,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollections_3034Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3034,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecords_3035Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3035,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCursor_3036Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3036,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3037Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3037,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3038Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3038,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3039Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3039,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3040Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3040,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3041Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3041,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3042Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3042,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3043Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3043,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3044Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3044,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3045Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3045,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3046Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3046,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3047Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3047,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3048Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3048,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3049Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3049,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3050Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3050,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3051Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3051,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataType_3052Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3052,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollections_3053Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3053,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecords_3054Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3054,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCursor_3055Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3055,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3056Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3056,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3057Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3057,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3058Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3058,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3059Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3059,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3060Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3060,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3061Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3061,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3062Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3062,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3063Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3063,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3064Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3064,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3065Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3065,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3066Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3066,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3067Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3067,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3068Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3068,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3069Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3069,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3070Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3070,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataType_3071Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3071,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollections_3072Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3072,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecords_3073Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3073,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCursor_3074Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3074,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3075Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3075,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3076Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3076,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3077Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3077,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3078Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3078,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3079Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3079,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3080Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3080,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5088); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3081Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3081,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5089); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3082Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3082,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3083Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3083,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3084Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3084,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5092); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3085Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3085,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3086Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3086,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3087Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3087,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3088Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3088,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3089Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3089,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5097); //$NON-NLS-1$
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
			CrystalDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
		return CrystalEditPart.MODEL_ID.equals(CrystalVisualIDRegistry.getModelID(view));
	}

}
