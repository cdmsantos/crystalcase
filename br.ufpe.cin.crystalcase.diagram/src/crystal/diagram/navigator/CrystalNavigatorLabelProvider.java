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

import crystal.diagram.edit.parts.*;
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
			return getImage("Navigator?TopLevelNode?crystal?Procedure", CrystalElementTypes.Procedure_2010); //$NON-NLS-1$
		case FunctionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?crystal?Function", CrystalElementTypes.Function_2011); //$NON-NLS-1$
		case AnonymousBlockEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?crystal?AnonymousBlock", CrystalElementTypes.AnonymousBlock_2012); //$NON-NLS-1$
		case DataType3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3026); //$NON-NLS-1$
		case Collections3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3027); //$NON-NLS-1$
		case Records3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3028); //$NON-NLS-1$
		case Cursor3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3029); //$NON-NLS-1$
		case ExpressionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3236); //$NON-NLS-1$
		case ExceptionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3237); //$NON-NLS-1$
		case IfEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3238); //$NON-NLS-1$
		case Expression2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3239); //$NON-NLS-1$
		case Exception2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3240); //$NON-NLS-1$
		case If2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3241); //$NON-NLS-1$
		case CaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3242); //$NON-NLS-1$
		case Expression3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3243); //$NON-NLS-1$
		case Exception3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3244); //$NON-NLS-1$
		case If3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3245); //$NON-NLS-1$
		case InsertEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3246); //$NON-NLS-1$
		case UpdateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3247); //$NON-NLS-1$
		case DeleteEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3248); //$NON-NLS-1$
		case SelectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3249); //$NON-NLS-1$
		case WhileEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3250); //$NON-NLS-1$
		case Expression4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3251); //$NON-NLS-1$
		case Exception4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3252); //$NON-NLS-1$
		case If4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3253); //$NON-NLS-1$
		case ForEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3254); //$NON-NLS-1$
		case Case2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3255); //$NON-NLS-1$
		case Case3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3256); //$NON-NLS-1$
		case Insert2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3257); //$NON-NLS-1$
		case Update2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3258); //$NON-NLS-1$
		case Delete2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3259); //$NON-NLS-1$
		case Select2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3260); //$NON-NLS-1$
		case While2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3261); //$NON-NLS-1$
		case Insert3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3262); //$NON-NLS-1$
		case Update3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3263); //$NON-NLS-1$
		case Delete3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3264); //$NON-NLS-1$
		case Select3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3265); //$NON-NLS-1$
		case While3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3266); //$NON-NLS-1$
		case For2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3267); //$NON-NLS-1$
		case LoopEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3268); //$NON-NLS-1$
		case OpenEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3269); //$NON-NLS-1$
		case FetchEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3270); //$NON-NLS-1$
		case CloseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3271); //$NON-NLS-1$
		case CallProcedureEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3272); //$NON-NLS-1$
		case CallFunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3273); //$NON-NLS-1$
		case For3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3274); //$NON-NLS-1$
		case Loop2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3275); //$NON-NLS-1$
		case Open2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3276); //$NON-NLS-1$
		case Fetch2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3277); //$NON-NLS-1$
		case Close2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3278); //$NON-NLS-1$
		case CallProcedure2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3279); //$NON-NLS-1$
		case CallFunction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3280); //$NON-NLS-1$
		case OptionsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Options", CrystalElementTypes.Options_3281); //$NON-NLS-1$
		case Expression5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3282); //$NON-NLS-1$
		case Exception5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3283); //$NON-NLS-1$
		case If5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3284); //$NON-NLS-1$
		case Loop3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3285); //$NON-NLS-1$
		case Open3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3286); //$NON-NLS-1$
		case Fetch3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3287); //$NON-NLS-1$
		case Close3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3288); //$NON-NLS-1$
		case CallProcedure3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3289); //$NON-NLS-1$
		case CallFunction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3290); //$NON-NLS-1$
		case Expression6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Expression", CrystalElementTypes.Expression_3291); //$NON-NLS-1$
		case Exception6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Exception", CrystalElementTypes.Exception_3292); //$NON-NLS-1$
		case If6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?If", CrystalElementTypes.If_3293); //$NON-NLS-1$
		case Case4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3294); //$NON-NLS-1$
		case Insert4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3295); //$NON-NLS-1$
		case Update4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3296); //$NON-NLS-1$
		case Delete4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3297); //$NON-NLS-1$
		case Select4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3298); //$NON-NLS-1$
		case While4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3299); //$NON-NLS-1$
		case For4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3300); //$NON-NLS-1$
		case Loop4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3301); //$NON-NLS-1$
		case Open4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3302); //$NON-NLS-1$
		case Fetch4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3303); //$NON-NLS-1$
		case Close4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3304); //$NON-NLS-1$
		case CallProcedure4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3305); //$NON-NLS-1$
		case CallFunction4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3306); //$NON-NLS-1$
		case Case5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3307); //$NON-NLS-1$
		case Insert5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3308); //$NON-NLS-1$
		case Update5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3309); //$NON-NLS-1$
		case Delete5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3310); //$NON-NLS-1$
		case Select5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3311); //$NON-NLS-1$
		case While5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3312); //$NON-NLS-1$
		case For5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3313); //$NON-NLS-1$
		case Loop5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3314); //$NON-NLS-1$
		case Open5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3315); //$NON-NLS-1$
		case Fetch5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3316); //$NON-NLS-1$
		case Close5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3317); //$NON-NLS-1$
		case CallProcedure5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3318); //$NON-NLS-1$
		case CallFunction5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3319); //$NON-NLS-1$
		case Case6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Case", CrystalElementTypes.Case_3320); //$NON-NLS-1$
		case Insert6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Insert", CrystalElementTypes.Insert_3321); //$NON-NLS-1$
		case Update6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Update", CrystalElementTypes.Update_3322); //$NON-NLS-1$
		case Delete6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Delete", CrystalElementTypes.Delete_3323); //$NON-NLS-1$
		case Select6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Select", CrystalElementTypes.Select_3324); //$NON-NLS-1$
		case While6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?While", CrystalElementTypes.While_3325); //$NON-NLS-1$
		case For6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?For", CrystalElementTypes.For_3326); //$NON-NLS-1$
		case Loop6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Loop", CrystalElementTypes.Loop_3327); //$NON-NLS-1$
		case Open6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Open", CrystalElementTypes.Open_3328); //$NON-NLS-1$
		case Fetch6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Fetch", CrystalElementTypes.Fetch_3329); //$NON-NLS-1$
		case Close6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Close", CrystalElementTypes.Close_3330); //$NON-NLS-1$
		case CallProcedure6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallProcedure", CrystalElementTypes.CallProcedure_3331); //$NON-NLS-1$
		case CallFunction6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?CallFunction", CrystalElementTypes.CallFunction_3332); //$NON-NLS-1$
		case DataTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3333); //$NON-NLS-1$
		case CollectionsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3334); //$NON-NLS-1$
		case RecordsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3335); //$NON-NLS-1$
		case CursorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3336); //$NON-NLS-1$
		case DataType2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?DataType", CrystalElementTypes.DataType_3337); //$NON-NLS-1$
		case Collections2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Collections", CrystalElementTypes.Collections_3338); //$NON-NLS-1$
		case Records2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Records", CrystalElementTypes.Records_3339); //$NON-NLS-1$
		case Cursor2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?crystal?Cursor", CrystalElementTypes.Cursor_3340); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?crystal?Transition", CrystalElementTypes.Transition_4001); //$NON-NLS-1$
		case OptionsTransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?crystal?OptionsTransition", CrystalElementTypes.OptionsTransition_4003); //$NON-NLS-1$
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
			return getProcedure_2010Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2011Text(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2012Text(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3026Text(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3027Text(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3028Text(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3029Text(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3236Text(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3237Text(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3238Text(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3239Text(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3240Text(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3241Text(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3242Text(view);
		case Expression3EditPart.VISUAL_ID:
			return getExpression_3243Text(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3244Text(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3245Text(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3246Text(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3247Text(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3248Text(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3249Text(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3250Text(view);
		case Expression4EditPart.VISUAL_ID:
			return getExpression_3251Text(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3252Text(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3253Text(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3254Text(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3255Text(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3256Text(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3257Text(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3258Text(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3259Text(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3260Text(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3261Text(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3262Text(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3263Text(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3264Text(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3265Text(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3266Text(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3267Text(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3268Text(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3269Text(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3270Text(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3271Text(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3272Text(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3273Text(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3274Text(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3275Text(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3276Text(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3277Text(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3278Text(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3279Text(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3280Text(view);
		case OptionsEditPart.VISUAL_ID:
			return getOptions_3281Text(view);
		case Expression5EditPart.VISUAL_ID:
			return getExpression_3282Text(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3283Text(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3284Text(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3285Text(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3286Text(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3287Text(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3288Text(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3289Text(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3290Text(view);
		case Expression6EditPart.VISUAL_ID:
			return getExpression_3291Text(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3292Text(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3293Text(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3294Text(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3295Text(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3296Text(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3297Text(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3298Text(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3299Text(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3300Text(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3301Text(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3302Text(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3303Text(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3304Text(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3305Text(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3306Text(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3307Text(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3308Text(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3309Text(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3310Text(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3311Text(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3312Text(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3313Text(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3314Text(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3315Text(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3316Text(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3317Text(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3318Text(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3319Text(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3320Text(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3321Text(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3322Text(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3323Text(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3324Text(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3325Text(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3326Text(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3327Text(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3328Text(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3329Text(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3330Text(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3331Text(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3332Text(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3333Text(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3334Text(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3335Text(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3336Text(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3337Text(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3338Text(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3339Text(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3340Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		case OptionsTransitionEditPart.VISUAL_ID:
			return getOptionsTransition_4003Text(view);
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
	private String getProcedure_2010Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Procedure_2010,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ProcedureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5349); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_2011Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Function_2011,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FunctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5350); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnonymousBlock_2012Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.AnonymousBlock_2012,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(AnonymousBlockDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5351); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataType_3026Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3026,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeName3EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CollectionsName3EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(RecordsName3EditPart.VISUAL_ID));
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
				CrystalVisualIDRegistry.getType(CursorName3EditPart.VISUAL_ID));
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
	private String getExpression_3236Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3236,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5244); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3237Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3237,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5245); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3238Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3238,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5327); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3239Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3239,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5246); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3240Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3240,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5247); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3241Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3241,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5326); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3242Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3242,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5325); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3243Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3243,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5248); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3244Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3244,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5249); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3245Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3245,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5324); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3246Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3246,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5250); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3247Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3247,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5251); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3248Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3248,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5252); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3249Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3249,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5253); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3250Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3250,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5323); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3251Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3251,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5254); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3252Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3252,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5255); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3253Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3253,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5322); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3254Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3254,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5321); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3255Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3255,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5320); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3256Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3256,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5319); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3257Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3257,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5256); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3258Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3258,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5257); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3259Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3259,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5258); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3260Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3260,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5259); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3261Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3261,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5272); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3262Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3262,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5260); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3263Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3263,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5261); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3264Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3264,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5262); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3265Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3265,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5263); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3266Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3266,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5271); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3267Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3267,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5270); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3268Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3268,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5269); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3269Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3269,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5264); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3270Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3270,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5265); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3271Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3271,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5266); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3272Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3272,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5267); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3273Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3273,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5268); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3274Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3274,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5273); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3275Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3275,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5274); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3276Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3276,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5275); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3277Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3277,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5276); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3278Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3278,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5277); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3279Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3279,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5278); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3280Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3280,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5279); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOptions_3281Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Options_3281,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OptionsDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5318); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3282Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3282,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5280); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3283Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3283,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5281); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3284Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3284,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5304); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3285Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3285,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5282); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3286Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3286,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5283); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3287Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3287,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5284); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3288Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3288,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5285); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3289Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3289,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5286); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3290Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3290,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5287); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExpression_3291Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Expression_3291,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExpressionDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5288); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getException_3292Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Exception_3292,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ExceptionDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5289); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIf_3293Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.If_3293,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(IfDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5303); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3294Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3294,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5290); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3295Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3295,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5291); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3296Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3296,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5292); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3297Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3297,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5293); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3298Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3298,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5294); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3299Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3299,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5295); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3300Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3300,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5296); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3301Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3301,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5297); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3302Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3302,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5298); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3303Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3303,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5299); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3304Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3304,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5300); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3305Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3305,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5301); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3306Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3306,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5302); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3307Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3307,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5305); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3308Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3308,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5306); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3309Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3309,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5307); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3310Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3310,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5308); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3311Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3311,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5309); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3312Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3312,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5310); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3313Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3313,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5311); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3314Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3314,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5312); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3315Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3315,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5313); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3316Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3316,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5314); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3317Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3317,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5315); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3318Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3318,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5316); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3319Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3319,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5317); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCase_3320Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Case_3320,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CaseDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5328); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInsert_3321Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Insert_3321,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(InsertDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5329); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdate_3322Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Update_3322,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(UpdateDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5330); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelete_3323Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Delete_3323,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DeleteDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5331); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3324Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Select_3324,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(SelectDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5332); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhile_3325Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.While_3325,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(WhileDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5333); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFor_3326Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.For_3326,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(ForDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5334); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLoop_3327Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Loop_3327,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(LoopDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5335); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpen_3328Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Open_3328,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OpenDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5336); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFetch_3329Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Fetch_3329,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(FetchDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5337); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClose_3330Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Close_3330,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CloseDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5338); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallProcedure_3331Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallProcedure_3331,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallProcedureDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5339); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCallFunction_3332Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.CallFunction_3332,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CallFunctionDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5340); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataType_3333Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3333,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5341); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollections_3334Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3334,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5342); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecords_3335Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3335,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5343); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCursor_3336Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3336,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5344); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataType_3337Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.DataType_3337,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(DataTypeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5345); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollections_3338Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Collections_3338,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CollectionsName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5346); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecords_3339Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Records_3339,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(RecordsName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5347); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCursor_3340Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.Cursor_3340,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(CursorName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5348); //$NON-NLS-1$
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
	private String getOptionsTransition_4003Text(View view) {
		IParser parser = CrystalParserProvider.getParser(CrystalElementTypes.OptionsTransition_4003,
				view.getElement() != null ? view.getElement() : view,
				CrystalVisualIDRegistry.getType(OptionsTransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CrystalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
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
