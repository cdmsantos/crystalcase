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
		case DataType2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3018); //$NON-NLS-1$
		case Collections2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3019); //$NON-NLS-1$
		case Records2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3020); //$NON-NLS-1$
		case Cursor2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3021); //$NON-NLS-1$
		case DataType4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3022); //$NON-NLS-1$
		case Collections4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3023); //$NON-NLS-1$
		case Records4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3024); //$NON-NLS-1$
		case Cursor4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3025); //$NON-NLS-1$
		case DataType5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3026); //$NON-NLS-1$
		case Collections5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3027); //$NON-NLS-1$
		case Records5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3028); //$NON-NLS-1$
		case Cursor5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3029); //$NON-NLS-1$
		case DataType6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3033); //$NON-NLS-1$
		case Collections6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3034); //$NON-NLS-1$
		case Records6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3035); //$NON-NLS-1$
		case Cursor6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3036); //$NON-NLS-1$
		case Exception10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3037); //$NON-NLS-1$
		case If10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3038); //$NON-NLS-1$
		case Case10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3039); //$NON-NLS-1$
		case Insert10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3040); //$NON-NLS-1$
		case Update10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3041); //$NON-NLS-1$
		case Delete10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3042); //$NON-NLS-1$
		case Select10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3043); //$NON-NLS-1$
		case While10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3044); //$NON-NLS-1$
		case For10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3045); //$NON-NLS-1$
		case Loop10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3046); //$NON-NLS-1$
		case Open10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3047); //$NON-NLS-1$
		case Fetch10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3048); //$NON-NLS-1$
		case Close10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3049); //$NON-NLS-1$
		case CallProcedure10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3050); //$NON-NLS-1$
		case CallFunction10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3051); //$NON-NLS-1$
		case DataTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3052); //$NON-NLS-1$
		case CollectionsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3053); //$NON-NLS-1$
		case RecordsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3054); //$NON-NLS-1$
		case CursorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3055); //$NON-NLS-1$
		case ExceptionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3056); //$NON-NLS-1$
		case IfEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3057); //$NON-NLS-1$
		case Case8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3058); //$NON-NLS-1$
		case Insert8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3059); //$NON-NLS-1$
		case Update8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3060); //$NON-NLS-1$
		case Delete8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3061); //$NON-NLS-1$
		case Select8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3062); //$NON-NLS-1$
		case While8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3063); //$NON-NLS-1$
		case For8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3064); //$NON-NLS-1$
		case Loop8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3065); //$NON-NLS-1$
		case Open8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3066); //$NON-NLS-1$
		case Fetch8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3067); //$NON-NLS-1$
		case Close8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3068); //$NON-NLS-1$
		case CallProcedure8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3069); //$NON-NLS-1$
		case CallFunction8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3070); //$NON-NLS-1$
		case DataType3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3071); //$NON-NLS-1$
		case Collections3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3072); //$NON-NLS-1$
		case Records3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3073); //$NON-NLS-1$
		case Cursor3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3074); //$NON-NLS-1$
		case Exception9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3075); //$NON-NLS-1$
		case If9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3076); //$NON-NLS-1$
		case Case9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3077); //$NON-NLS-1$
		case Insert9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3078); //$NON-NLS-1$
		case Update9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3079); //$NON-NLS-1$
		case Delete9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3080); //$NON-NLS-1$
		case Select9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3081); //$NON-NLS-1$
		case While9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3082); //$NON-NLS-1$
		case For9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3083); //$NON-NLS-1$
		case Loop9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3084); //$NON-NLS-1$
		case Open9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3085); //$NON-NLS-1$
		case Fetch9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3086); //$NON-NLS-1$
		case Close9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3087); //$NON-NLS-1$
		case CallProcedure9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3088); //$NON-NLS-1$
		case CallFunction9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3089); //$NON-NLS-1$
		case Exception4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3090); //$NON-NLS-1$
		case If4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3091); //$NON-NLS-1$
		case Case4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3092); //$NON-NLS-1$
		case Insert4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3093); //$NON-NLS-1$
		case Update4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3094); //$NON-NLS-1$
		case Delete4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3095); //$NON-NLS-1$
		case Select4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3096); //$NON-NLS-1$
		case While4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3097); //$NON-NLS-1$
		case For3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3098); //$NON-NLS-1$
		case Loop3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3099); //$NON-NLS-1$
		case Open3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3100); //$NON-NLS-1$
		case Fetch3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3101); //$NON-NLS-1$
		case Close3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3102); //$NON-NLS-1$
		case CallProcedure3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3103); //$NON-NLS-1$
		case CallFunction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3104); //$NON-NLS-1$
		case SelectorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Selector", CrystalElementTypes.Selector_3108); //$NON-NLS-1$
		case Exception8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3109); //$NON-NLS-1$
		case If8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3110); //$NON-NLS-1$
		case Case7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3138); //$NON-NLS-1$
		case Insert7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3139); //$NON-NLS-1$
		case Update7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3140); //$NON-NLS-1$
		case Delete7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3141); //$NON-NLS-1$
		case Select7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3142); //$NON-NLS-1$
		case While7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3143); //$NON-NLS-1$
		case For7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3144); //$NON-NLS-1$
		case Loop7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3145); //$NON-NLS-1$
		case Open7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3146); //$NON-NLS-1$
		case Fetch7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3147); //$NON-NLS-1$
		case Close7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3148); //$NON-NLS-1$
		case CallProcedure7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3149); //$NON-NLS-1$
		case CallFunction7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3150); //$NON-NLS-1$
		case Exception5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3151); //$NON-NLS-1$
		case If5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3152); //$NON-NLS-1$
		case Exception6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3153); //$NON-NLS-1$
		case If6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3154); //$NON-NLS-1$
		case Case5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3155); //$NON-NLS-1$
		case Insert5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3156); //$NON-NLS-1$
		case Update5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3157); //$NON-NLS-1$
		case Delete5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3158); //$NON-NLS-1$
		case Select5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3159); //$NON-NLS-1$
		case While5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3160); //$NON-NLS-1$
		case Case6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3161); //$NON-NLS-1$
		case Insert6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3162); //$NON-NLS-1$
		case Update6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3163); //$NON-NLS-1$
		case Delete6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3164); //$NON-NLS-1$
		case Select6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3165); //$NON-NLS-1$
		case While6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3166); //$NON-NLS-1$
		case For4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3167); //$NON-NLS-1$
		case For5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3168); //$NON-NLS-1$
		case Loop4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3169); //$NON-NLS-1$
		case Loop5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3170); //$NON-NLS-1$
		case Open4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3171); //$NON-NLS-1$
		case Fetch4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3172); //$NON-NLS-1$
		case Close4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3173); //$NON-NLS-1$
		case CallProcedure4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3174); //$NON-NLS-1$
		case CallFunction4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3175); //$NON-NLS-1$
		case Open5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3176); //$NON-NLS-1$
		case Fetch5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3177); //$NON-NLS-1$
		case Close5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3178); //$NON-NLS-1$
		case CallProcedure5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3179); //$NON-NLS-1$
		case CallFunction5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3180); //$NON-NLS-1$
		case Exception2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3181); //$NON-NLS-1$
		case If2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3182); //$NON-NLS-1$
		case CaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3183); //$NON-NLS-1$
		case InsertEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3184); //$NON-NLS-1$
		case UpdateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3185); //$NON-NLS-1$
		case DeleteEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3186); //$NON-NLS-1$
		case SelectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3187); //$NON-NLS-1$
		case WhileEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3188); //$NON-NLS-1$
		case ForEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3189); //$NON-NLS-1$
		case LoopEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3190); //$NON-NLS-1$
		case OpenEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3191); //$NON-NLS-1$
		case FetchEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3192); //$NON-NLS-1$
		case CloseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3193); //$NON-NLS-1$
		case CallProcedureEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3194); //$NON-NLS-1$
		case CallFunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3195); //$NON-NLS-1$
		case Exception7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3196); //$NON-NLS-1$
		case If7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3197); //$NON-NLS-1$
		case Case2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3198); //$NON-NLS-1$
		case Insert3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3199); //$NON-NLS-1$
		case Update3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3200); //$NON-NLS-1$
		case Delete3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3201); //$NON-NLS-1$
		case Select3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3202); //$NON-NLS-1$
		case While3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3203); //$NON-NLS-1$
		case For6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3204); //$NON-NLS-1$
		case Loop6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3205); //$NON-NLS-1$
		case Open6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3206); //$NON-NLS-1$
		case Fetch6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3207); //$NON-NLS-1$
		case Close6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3208); //$NON-NLS-1$
		case CallProcedure6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3209); //$NON-NLS-1$
		case CallFunction6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3210); //$NON-NLS-1$
		case Expression2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3211); //$NON-NLS-1$
		case Expression4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3212); //$NON-NLS-1$
		case Expression6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3213); //$NON-NLS-1$
		case Expression5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3214); //$NON-NLS-1$
		case Expression7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3215); //$NON-NLS-1$
		case Expression8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3216); //$NON-NLS-1$
		case ExpressionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3217); //$NON-NLS-1$
		case Expression9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3218); //$NON-NLS-1$
		case Expression10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3219); //$NON-NLS-1$
		case Expression3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3220); //$NON-NLS-1$
		case Exception3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3221); //$NON-NLS-1$
		case If3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3222); //$NON-NLS-1$
		case Case3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3223); //$NON-NLS-1$
		case Insert2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3224); //$NON-NLS-1$
		case Update2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3225); //$NON-NLS-1$
		case Delete2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3226); //$NON-NLS-1$
		case Select2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3227); //$NON-NLS-1$
		case While2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3228); //$NON-NLS-1$
		case For2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3229); //$NON-NLS-1$
		case Loop2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3230); //$NON-NLS-1$
		case Open2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3231); //$NON-NLS-1$
		case Fetch2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3232); //$NON-NLS-1$
		case Close2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3233); //$NON-NLS-1$
		case CallProcedure2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3234); //$NON-NLS-1$
		case CallFunction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3235); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?crystal?Transition", CrystalElementTypes.Transition_4001); //$NON-NLS-1$
		case SelectorTransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?crystal?SelectorTransition", CrystalElementTypes.SelectorTransition_4002); //$NON-NLS-1$
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
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018Text(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019Text(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020Text(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021Text(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3022Text(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3023Text(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3024Text(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3025Text(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3026Text(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3027Text(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3028Text(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3029Text(view);
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033Text(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034Text(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035Text(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036Text(view);
		case Exception10EditPart.VISUAL_ID:
			return getException_3037Text(view);
		case If10EditPart.VISUAL_ID:
			return getIf_3038Text(view);
		case Case10EditPart.VISUAL_ID:
			return getCase_3039Text(view);
		case Insert10EditPart.VISUAL_ID:
			return getInsert_3040Text(view);
		case Update10EditPart.VISUAL_ID:
			return getUpdate_3041Text(view);
		case Delete10EditPart.VISUAL_ID:
			return getDelete_3042Text(view);
		case Select10EditPart.VISUAL_ID:
			return getSelect_3043Text(view);
		case While10EditPart.VISUAL_ID:
			return getWhile_3044Text(view);
		case For10EditPart.VISUAL_ID:
			return getFor_3045Text(view);
		case Loop10EditPart.VISUAL_ID:
			return getLoop_3046Text(view);
		case Open10EditPart.VISUAL_ID:
			return getOpen_3047Text(view);
		case Fetch10EditPart.VISUAL_ID:
			return getFetch_3048Text(view);
		case Close10EditPart.VISUAL_ID:
			return getClose_3049Text(view);
		case CallProcedure10EditPart.VISUAL_ID:
			return getCallProcedure_3050Text(view);
		case CallFunction10EditPart.VISUAL_ID:
			return getCallFunction_3051Text(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3052Text(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3053Text(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3054Text(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3055Text(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056Text(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057Text(view);
		case Case8EditPart.VISUAL_ID:
			return getCase_3058Text(view);
		case Insert8EditPart.VISUAL_ID:
			return getInsert_3059Text(view);
		case Update8EditPart.VISUAL_ID:
			return getUpdate_3060Text(view);
		case Delete8EditPart.VISUAL_ID:
			return getDelete_3061Text(view);
		case Select8EditPart.VISUAL_ID:
			return getSelect_3062Text(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3063Text(view);
		case For8EditPart.VISUAL_ID:
			return getFor_3064Text(view);
		case Loop8EditPart.VISUAL_ID:
			return getLoop_3065Text(view);
		case Open8EditPart.VISUAL_ID:
			return getOpen_3066Text(view);
		case Fetch8EditPart.VISUAL_ID:
			return getFetch_3067Text(view);
		case Close8EditPart.VISUAL_ID:
			return getClose_3068Text(view);
		case CallProcedure8EditPart.VISUAL_ID:
			return getCallProcedure_3069Text(view);
		case CallFunction8EditPart.VISUAL_ID:
			return getCallFunction_3070Text(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3071Text(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3072Text(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3073Text(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3074Text(view);
		case Exception9EditPart.VISUAL_ID:
			return getException_3075Text(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3076Text(view);
		case Case9EditPart.VISUAL_ID:
			return getCase_3077Text(view);
		case Insert9EditPart.VISUAL_ID:
			return getInsert_3078Text(view);
		case Update9EditPart.VISUAL_ID:
			return getUpdate_3079Text(view);
		case Delete9EditPart.VISUAL_ID:
			return getDelete_3080Text(view);
		case Select9EditPart.VISUAL_ID:
			return getSelect_3081Text(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3082Text(view);
		case For9EditPart.VISUAL_ID:
			return getFor_3083Text(view);
		case Loop9EditPart.VISUAL_ID:
			return getLoop_3084Text(view);
		case Open9EditPart.VISUAL_ID:
			return getOpen_3085Text(view);
		case Fetch9EditPart.VISUAL_ID:
			return getFetch_3086Text(view);
		case Close9EditPart.VISUAL_ID:
			return getClose_3087Text(view);
		case CallProcedure9EditPart.VISUAL_ID:
			return getCallProcedure_3088Text(view);
		case CallFunction9EditPart.VISUAL_ID:
			return getCallFunction_3089Text(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3090Text(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3091Text(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3092Text(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3093Text(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3094Text(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3095Text(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3096Text(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3097Text(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3098Text(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3099Text(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3100Text(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3101Text(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3102Text(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3103Text(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3104Text(view);
		case SelectorEditPart.VISUAL_ID:
			return getSelector_3108Text(view);
		case Exception8EditPart.VISUAL_ID:
			return getException_3109Text(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3110Text(view);
		case Case7EditPart.VISUAL_ID:
			return getCase_3138Text(view);
		case Insert7EditPart.VISUAL_ID:
			return getInsert_3139Text(view);
		case Update7EditPart.VISUAL_ID:
			return getUpdate_3140Text(view);
		case Delete7EditPart.VISUAL_ID:
			return getDelete_3141Text(view);
		case Select7EditPart.VISUAL_ID:
			return getSelect_3142Text(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3143Text(view);
		case For7EditPart.VISUAL_ID:
			return getFor_3144Text(view);
		case Loop7EditPart.VISUAL_ID:
			return getLoop_3145Text(view);
		case Open7EditPart.VISUAL_ID:
			return getOpen_3146Text(view);
		case Fetch7EditPart.VISUAL_ID:
			return getFetch_3147Text(view);
		case Close7EditPart.VISUAL_ID:
			return getClose_3148Text(view);
		case CallProcedure7EditPart.VISUAL_ID:
			return getCallProcedure_3149Text(view);
		case CallFunction7EditPart.VISUAL_ID:
			return getCallFunction_3150Text(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3151Text(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3152Text(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3153Text(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3154Text(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3155Text(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3156Text(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3157Text(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3158Text(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3159Text(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3160Text(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3161Text(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3162Text(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3163Text(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3164Text(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3165Text(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3166Text(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3167Text(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3168Text(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3169Text(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3170Text(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3171Text(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3172Text(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3173Text(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3174Text(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3175Text(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3176Text(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3177Text(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3178Text(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3179Text(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3180Text(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3181Text(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3182Text(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3183Text(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3184Text(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3185Text(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3186Text(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3187Text(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3188Text(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3189Text(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3190Text(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3191Text(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3192Text(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3193Text(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3194Text(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3195Text(view);
		case Exception7EditPart.VISUAL_ID:
			return getException_3196Text(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3197Text(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3198Text(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3199Text(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3200Text(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3201Text(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3202Text(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3203Text(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3204Text(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3205Text(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3206Text(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3207Text(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3208Text(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3209Text(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3210Text(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3211Text(view);
		case Expression4EditPart.VISUAL_ID:
			return getExpression_3212Text(view);
		case Expression6EditPart.VISUAL_ID:
			return getExpression_3213Text(view);
		case Expression5EditPart.VISUAL_ID:
			return getExpression_3214Text(view);
		case Expression7EditPart.VISUAL_ID:
			return getExpression_3215Text(view);
		case Expression8EditPart.VISUAL_ID:
			return getExpression_3216Text(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3217Text(view);
		case Expression9EditPart.VISUAL_ID:
			return getExpression_3218Text(view);
		case Expression10EditPart.VISUAL_ID:
			return getExpression_3219Text(view);
		case Expression3EditPart.VISUAL_ID:
			return getExpression_3220Text(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3221Text(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3222Text(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3223Text(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3224Text(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3225Text(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3226Text(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3227Text(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3228Text(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3229Text(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3230Text(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3231Text(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3232Text(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3233Text(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3234Text(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3235Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		case SelectorTransitionEditPart.VISUAL_ID:
			return getSelectorTransition_4002Text(view);
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
				CrystalVisualIDRegistry.getType(DataTypeName2EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CollectionsName2EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(RecordsName2EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CursorName2EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(DataTypeName4EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CollectionsName4EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(RecordsName4EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CursorName4EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(DataTypeName5EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CollectionsName5EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(RecordsName5EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CursorName5EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(ExceptionDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(IfDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CaseDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(InsertDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(UpdateDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(DeleteDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(SelectDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(WhileDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(ForDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(LoopDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(OpenDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(FetchDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CloseDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CallProcedureDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CallFunctionDescription10EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(DataTypeNameEditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CollectionsNameEditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(RecordsNameEditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CursorNameEditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CaseDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(InsertDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(UpdateDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(DeleteDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(SelectDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(WhileDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(ForDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(LoopDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(OpenDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(FetchDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CloseDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CallProcedureDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CallFunctionDescription8EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(DataTypeName3EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CollectionsName3EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(RecordsName3EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CursorName3EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(ExceptionDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(IfDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CaseDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(InsertDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(UpdateDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(DeleteDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(SelectDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(WhileDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(ForDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(LoopDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(OpenDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(FetchDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CloseDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CallProcedureDescription9EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CallFunctionDescription9EditPart.VISUAL_ID));
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
	private String getException_3090Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3090,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3091Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3091,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3092Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3092,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3093Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3093,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3094Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3094,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3095Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3095,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3096Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3096,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5104); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3097Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3097,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5112); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3098Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3098,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3099Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3099,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3100Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3100,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5107); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3101Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3101,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3102Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3102,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5109); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3103Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3103,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5110); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3104Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3104,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5111); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelector_3108Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Selector_3108,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectorDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5156); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3109Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3109,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3110Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3110,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5142); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3138Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3138,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5143); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3139Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3139,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5144); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3140Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3140,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5145); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3141Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3141,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5146); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3142Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3142,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5147); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3143Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3143,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5148); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3144Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3144,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5149); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3145Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3145,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5150); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3146Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3146,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5151); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3147Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3147,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5152); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3148Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3148,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5153); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3149Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3149,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5154); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3150Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3150,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5155); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3151Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3151,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5159); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3152Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3152,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5188); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3153Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3153,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5160); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3154Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3154,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5187); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3155Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3155,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5161); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3156Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3156,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5162); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3157Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3157,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5163); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3158Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3158,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5164); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3159Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3159,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5165); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3160Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3160,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5186); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3161Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3161,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5166); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3162Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3162,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5167); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3163Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3163,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5168); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3164Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3164,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5169); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3165Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3165,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5170); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3166Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3166,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5171); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3167Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3167,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5185); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3168Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3168,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5184); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3169Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3169,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5178); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3170Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3170,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5177); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3171Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3171,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5172); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3172Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3172,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5173); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3173Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3173,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5174); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3174Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3174,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5175); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3175Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3175,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5176); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3176Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3176,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5179); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3177Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3177,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5180); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3178Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3178,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5181); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3179Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3179,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5182); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3180Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3180,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5183); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3181Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3181,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5189); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3182Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3182,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5218); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3183Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3183,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5217); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3184Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3184,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5190); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3185Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3185,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5191); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3186Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3186,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5192); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3187Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3187,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5193); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3188Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3188,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5216); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3189Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3189,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5215); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3190Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3190,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5214); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3191Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3191,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5194); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3192Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3192,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5195); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3193Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3193,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5196); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3194Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3194,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5197); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3195Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3195,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5198); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3196Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3196,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5199); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3197Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3197,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5213); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3198Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3198,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5200); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3199Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3199,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5201); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3200Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3200,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5202); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3201Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3201,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5203); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3202Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3202,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5204); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3203Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3203,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5205); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3204Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3204,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5206); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3205Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3205,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5207); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3206Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3206,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5208); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3207Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3207,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5209); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3208Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3208,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5210); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3209Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3209,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5211); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3210Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3210,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5212); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3211Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3211,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5219); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3212Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3212,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5220); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3213Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3213,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5221); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3214Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3214,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5222); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3215Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3215,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5223); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3216Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3216,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5224); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3217Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3217,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5225); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3218Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3218,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5226); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3219Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3219,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5227); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3220Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3220,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5228); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3221Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3221,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5229); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3222Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3222,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5243); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3223Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3223,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5242); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3224Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3224,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5230); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3225Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3225,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5231); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3226Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3226,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5232); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3227Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3227,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5233); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3228Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3228,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5241); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3229Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3229,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5240); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3230Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3230,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5239); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3231Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3231,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5234); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3232Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3232,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5235); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3233Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3233,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5236); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3234Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3234,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5237); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3235Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3235,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5238); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectorTransition_4002Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.SelectorTransition_4002,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectorTransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
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
