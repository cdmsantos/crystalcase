/*
 * 
 */
package crystal.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import crystal.CrystalPackage;
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
import crystal.diagram.part.CrystalDiagramEditorPlugin;

/**
 * @generated
 */
public class CrystalElementTypes {

	/**
	 * @generated
	 */
	private CrystalElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CrystalDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Crystal_1000 = getElementType("br.ufpe.cin.crystalcase.diagram.Crystal_1000"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Procedure_2007 = getElementType("br.ufpe.cin.crystalcase.diagram.Procedure_2007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Function_2008 = getElementType("br.ufpe.cin.crystalcase.diagram.Function_2008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType AnonymousBlock_2009 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.AnonymousBlock_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataType_3018 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collections_3019 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Records_3020 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cursor_3021 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataType_3052 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3052"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Collections_3053 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3053"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Records_3054 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3054"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Cursor_3055 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3055"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3056 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3056"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3057 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3057"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3058 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3058"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3059 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3059"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3060 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3060"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3061 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3061"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3062 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3062"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3063 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3063"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3064 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3064"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3065 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3065"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3066 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3066"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3067 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3067"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3068 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3068"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3069 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3069"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3070 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3070"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataType_3022 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collections_3023 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Records_3024 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cursor_3025 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataType_3026 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collections_3027 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Records_3028 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cursor_3029 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataType_3071 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3071"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Collections_3072 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3072"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Records_3073 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3073"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Cursor_3074 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3074"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3075 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3075"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3076 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3076"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3077 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3077"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3078 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3078"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3079 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3079"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3080 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3080"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3081 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3081"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3082 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3082"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3083 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3083"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3084 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3084"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3085 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3085"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3086 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3086"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3087 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3087"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3088 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3088"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3089 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3089"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataType_3033 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3033"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Collections_3034 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3034"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Records_3035 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3035"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Cursor_3036 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3036"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3037 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3037"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3038 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3038"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3039 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3039"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3040 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3040"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3041 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3041"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3042 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3042"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3043 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3043"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3044 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3044"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3045 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3045"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3046 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3046"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3047 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3047"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3048 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3048"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3049 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3049"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3050 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3050"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3051 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3051"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Crystal_1000, CrystalPackage.eINSTANCE.getCrystal());

			elements.put(Procedure_2007, CrystalPackage.eINSTANCE.getProcedure());

			elements.put(Function_2008, CrystalPackage.eINSTANCE.getFunction());

			elements.put(AnonymousBlock_2009, CrystalPackage.eINSTANCE.getAnonymousBlock());

			elements.put(DataType_3018, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3019, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3020, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3021, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3052, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3053, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3054, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3055, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Exception_3056, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3057, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3058, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3059, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3060, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3061, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3062, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3063, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3064, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3065, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3066, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3067, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3068, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3069, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3070, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(DataType_3022, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3023, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3024, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3025, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3026, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3027, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3028, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3029, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3071, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3072, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3073, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3074, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Exception_3075, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3076, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3077, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3078, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3079, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3080, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3081, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3082, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3083, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3084, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3085, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3086, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3087, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3088, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3089, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(DataType_3033, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3034, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3035, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3036, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Exception_3037, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3038, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3039, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3040, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3041, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3042, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3043, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3044, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3045, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3046, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3047, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3048, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3049, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3050, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3051, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Transition_4001, CrystalPackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Crystal_1000);
			KNOWN_ELEMENT_TYPES.add(Procedure_2007);
			KNOWN_ELEMENT_TYPES.add(Function_2008);
			KNOWN_ELEMENT_TYPES.add(AnonymousBlock_2009);
			KNOWN_ELEMENT_TYPES.add(DataType_3018);
			KNOWN_ELEMENT_TYPES.add(Collections_3019);
			KNOWN_ELEMENT_TYPES.add(Records_3020);
			KNOWN_ELEMENT_TYPES.add(Cursor_3021);
			KNOWN_ELEMENT_TYPES.add(DataType_3052);
			KNOWN_ELEMENT_TYPES.add(Collections_3053);
			KNOWN_ELEMENT_TYPES.add(Records_3054);
			KNOWN_ELEMENT_TYPES.add(Cursor_3055);
			KNOWN_ELEMENT_TYPES.add(Exception_3056);
			KNOWN_ELEMENT_TYPES.add(If_3057);
			KNOWN_ELEMENT_TYPES.add(Case_3058);
			KNOWN_ELEMENT_TYPES.add(Insert_3059);
			KNOWN_ELEMENT_TYPES.add(Update_3060);
			KNOWN_ELEMENT_TYPES.add(Delete_3061);
			KNOWN_ELEMENT_TYPES.add(Select_3062);
			KNOWN_ELEMENT_TYPES.add(While_3063);
			KNOWN_ELEMENT_TYPES.add(For_3064);
			KNOWN_ELEMENT_TYPES.add(Loop_3065);
			KNOWN_ELEMENT_TYPES.add(Open_3066);
			KNOWN_ELEMENT_TYPES.add(Fetch_3067);
			KNOWN_ELEMENT_TYPES.add(Close_3068);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3069);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3070);
			KNOWN_ELEMENT_TYPES.add(DataType_3022);
			KNOWN_ELEMENT_TYPES.add(Collections_3023);
			KNOWN_ELEMENT_TYPES.add(Records_3024);
			KNOWN_ELEMENT_TYPES.add(Cursor_3025);
			KNOWN_ELEMENT_TYPES.add(DataType_3026);
			KNOWN_ELEMENT_TYPES.add(Collections_3027);
			KNOWN_ELEMENT_TYPES.add(Records_3028);
			KNOWN_ELEMENT_TYPES.add(Cursor_3029);
			KNOWN_ELEMENT_TYPES.add(DataType_3071);
			KNOWN_ELEMENT_TYPES.add(Collections_3072);
			KNOWN_ELEMENT_TYPES.add(Records_3073);
			KNOWN_ELEMENT_TYPES.add(Cursor_3074);
			KNOWN_ELEMENT_TYPES.add(Exception_3075);
			KNOWN_ELEMENT_TYPES.add(If_3076);
			KNOWN_ELEMENT_TYPES.add(Case_3077);
			KNOWN_ELEMENT_TYPES.add(Insert_3078);
			KNOWN_ELEMENT_TYPES.add(Update_3079);
			KNOWN_ELEMENT_TYPES.add(Delete_3080);
			KNOWN_ELEMENT_TYPES.add(Select_3081);
			KNOWN_ELEMENT_TYPES.add(While_3082);
			KNOWN_ELEMENT_TYPES.add(For_3083);
			KNOWN_ELEMENT_TYPES.add(Loop_3084);
			KNOWN_ELEMENT_TYPES.add(Open_3085);
			KNOWN_ELEMENT_TYPES.add(Fetch_3086);
			KNOWN_ELEMENT_TYPES.add(Close_3087);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3088);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3089);
			KNOWN_ELEMENT_TYPES.add(DataType_3033);
			KNOWN_ELEMENT_TYPES.add(Collections_3034);
			KNOWN_ELEMENT_TYPES.add(Records_3035);
			KNOWN_ELEMENT_TYPES.add(Cursor_3036);
			KNOWN_ELEMENT_TYPES.add(Exception_3037);
			KNOWN_ELEMENT_TYPES.add(If_3038);
			KNOWN_ELEMENT_TYPES.add(Case_3039);
			KNOWN_ELEMENT_TYPES.add(Insert_3040);
			KNOWN_ELEMENT_TYPES.add(Update_3041);
			KNOWN_ELEMENT_TYPES.add(Delete_3042);
			KNOWN_ELEMENT_TYPES.add(Select_3043);
			KNOWN_ELEMENT_TYPES.add(While_3044);
			KNOWN_ELEMENT_TYPES.add(For_3045);
			KNOWN_ELEMENT_TYPES.add(Loop_3046);
			KNOWN_ELEMENT_TYPES.add(Open_3047);
			KNOWN_ELEMENT_TYPES.add(Fetch_3048);
			KNOWN_ELEMENT_TYPES.add(Close_3049);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3050);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3051);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CrystalEditPart.VISUAL_ID:
			return Crystal_1000;
		case ProcedureEditPart.VISUAL_ID:
			return Procedure_2007;
		case FunctionEditPart.VISUAL_ID:
			return Function_2008;
		case AnonymousBlockEditPart.VISUAL_ID:
			return AnonymousBlock_2009;
		case DataTypeEditPart.VISUAL_ID:
			return DataType_3018;
		case CollectionsEditPart.VISUAL_ID:
			return Collections_3019;
		case RecordsEditPart.VISUAL_ID:
			return Records_3020;
		case CursorEditPart.VISUAL_ID:
			return Cursor_3021;
		case DataType2EditPart.VISUAL_ID:
			return DataType_3052;
		case Collections2EditPart.VISUAL_ID:
			return Collections_3053;
		case Records2EditPart.VISUAL_ID:
			return Records_3054;
		case Cursor2EditPart.VISUAL_ID:
			return Cursor_3055;
		case ExceptionEditPart.VISUAL_ID:
			return Exception_3056;
		case IfEditPart.VISUAL_ID:
			return If_3057;
		case CaseEditPart.VISUAL_ID:
			return Case_3058;
		case InsertEditPart.VISUAL_ID:
			return Insert_3059;
		case UpdateEditPart.VISUAL_ID:
			return Update_3060;
		case DeleteEditPart.VISUAL_ID:
			return Delete_3061;
		case SelectEditPart.VISUAL_ID:
			return Select_3062;
		case WhileEditPart.VISUAL_ID:
			return While_3063;
		case ForEditPart.VISUAL_ID:
			return For_3064;
		case LoopEditPart.VISUAL_ID:
			return Loop_3065;
		case OpenEditPart.VISUAL_ID:
			return Open_3066;
		case FetchEditPart.VISUAL_ID:
			return Fetch_3067;
		case CloseEditPart.VISUAL_ID:
			return Close_3068;
		case CallProcedureEditPart.VISUAL_ID:
			return CallProcedure_3069;
		case CallFunctionEditPart.VISUAL_ID:
			return CallFunction_3070;
		case DataType3EditPart.VISUAL_ID:
			return DataType_3022;
		case Collections3EditPart.VISUAL_ID:
			return Collections_3023;
		case Records3EditPart.VISUAL_ID:
			return Records_3024;
		case Cursor3EditPart.VISUAL_ID:
			return Cursor_3025;
		case DataType4EditPart.VISUAL_ID:
			return DataType_3026;
		case Collections4EditPart.VISUAL_ID:
			return Collections_3027;
		case Records4EditPart.VISUAL_ID:
			return Records_3028;
		case Cursor4EditPart.VISUAL_ID:
			return Cursor_3029;
		case DataType5EditPart.VISUAL_ID:
			return DataType_3071;
		case Collections5EditPart.VISUAL_ID:
			return Collections_3072;
		case Records5EditPart.VISUAL_ID:
			return Records_3073;
		case Cursor5EditPart.VISUAL_ID:
			return Cursor_3074;
		case Exception2EditPart.VISUAL_ID:
			return Exception_3075;
		case If2EditPart.VISUAL_ID:
			return If_3076;
		case Case2EditPart.VISUAL_ID:
			return Case_3077;
		case Insert2EditPart.VISUAL_ID:
			return Insert_3078;
		case Update2EditPart.VISUAL_ID:
			return Update_3079;
		case Delete2EditPart.VISUAL_ID:
			return Delete_3080;
		case Select2EditPart.VISUAL_ID:
			return Select_3081;
		case While2EditPart.VISUAL_ID:
			return While_3082;
		case For2EditPart.VISUAL_ID:
			return For_3083;
		case Loop2EditPart.VISUAL_ID:
			return Loop_3084;
		case Open2EditPart.VISUAL_ID:
			return Open_3085;
		case Fetch2EditPart.VISUAL_ID:
			return Fetch_3086;
		case Close2EditPart.VISUAL_ID:
			return Close_3087;
		case CallProcedure2EditPart.VISUAL_ID:
			return CallProcedure_3088;
		case CallFunction2EditPart.VISUAL_ID:
			return CallFunction_3089;
		case DataType6EditPart.VISUAL_ID:
			return DataType_3033;
		case Collections6EditPart.VISUAL_ID:
			return Collections_3034;
		case Records6EditPart.VISUAL_ID:
			return Records_3035;
		case Cursor6EditPart.VISUAL_ID:
			return Cursor_3036;
		case Exception3EditPart.VISUAL_ID:
			return Exception_3037;
		case If3EditPart.VISUAL_ID:
			return If_3038;
		case Case3EditPart.VISUAL_ID:
			return Case_3039;
		case Insert3EditPart.VISUAL_ID:
			return Insert_3040;
		case Update3EditPart.VISUAL_ID:
			return Update_3041;
		case Delete3EditPart.VISUAL_ID:
			return Delete_3042;
		case Select3EditPart.VISUAL_ID:
			return Select_3043;
		case While3EditPart.VISUAL_ID:
			return While_3044;
		case For3EditPart.VISUAL_ID:
			return For_3045;
		case Loop3EditPart.VISUAL_ID:
			return Loop_3046;
		case Open3EditPart.VISUAL_ID:
			return Open_3047;
		case Fetch3EditPart.VISUAL_ID:
			return Fetch_3048;
		case Close3EditPart.VISUAL_ID:
			return Close_3049;
		case CallProcedure3EditPart.VISUAL_ID:
			return CallProcedure_3050;
		case CallFunction3EditPart.VISUAL_ID:
			return CallFunction_3051;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return crystal.diagram.providers.CrystalElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return crystal.diagram.providers.CrystalElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return crystal.diagram.providers.CrystalElementTypes.getElement(elementTypeAdapter);
		}
	};

}
