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
import crystal.diagram.edit.parts.*;
import crystal.diagram.edit.parts.AnonymousBlockEditPart;
import crystal.diagram.edit.parts.CallFunction2EditPart;
import crystal.diagram.edit.parts.CallFunction3EditPart;
import crystal.diagram.edit.parts.CallFunction4EditPart;
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedure2EditPart;
import crystal.diagram.edit.parts.CallProcedure3EditPart;
import crystal.diagram.edit.parts.CallProcedure4EditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.Case2EditPart;
import crystal.diagram.edit.parts.Case3EditPart;
import crystal.diagram.edit.parts.Case4EditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.Close2EditPart;
import crystal.diagram.edit.parts.Close3EditPart;
import crystal.diagram.edit.parts.Close4EditPart;
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
import crystal.diagram.edit.parts.Delete4EditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.Exception2EditPart;
import crystal.diagram.edit.parts.Exception3EditPart;
import crystal.diagram.edit.parts.Exception4EditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.Fetch2EditPart;
import crystal.diagram.edit.parts.Fetch3EditPart;
import crystal.diagram.edit.parts.Fetch4EditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.For2EditPart;
import crystal.diagram.edit.parts.For3EditPart;
import crystal.diagram.edit.parts.For4EditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.FunctionEditPart;
import crystal.diagram.edit.parts.If2EditPart;
import crystal.diagram.edit.parts.If3EditPart;
import crystal.diagram.edit.parts.If4EditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.Insert2EditPart;
import crystal.diagram.edit.parts.Insert3EditPart;
import crystal.diagram.edit.parts.Insert4EditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.Loop2EditPart;
import crystal.diagram.edit.parts.Loop3EditPart;
import crystal.diagram.edit.parts.Loop4EditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.Open2EditPart;
import crystal.diagram.edit.parts.Open3EditPart;
import crystal.diagram.edit.parts.Open4EditPart;
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
import crystal.diagram.edit.parts.Select4EditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.TransitionEditPart;
import crystal.diagram.edit.parts.Update2EditPart;
import crystal.diagram.edit.parts.Update3EditPart;
import crystal.diagram.edit.parts.Update4EditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
import crystal.diagram.edit.parts.While2EditPart;
import crystal.diagram.edit.parts.While3EditPart;
import crystal.diagram.edit.parts.While4EditPart;
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
	public static final IElementType Exception_3181 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3181"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3182 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3182"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3183 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3183"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Expression_3220 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3220"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3221 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3221"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3222 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3222"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Selector_3108 = getElementType("br.ufpe.cin.crystalcase.diagram.Selector_3108"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3109 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3109"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3110 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3110"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3184 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3184"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3185 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3185"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3186 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3186"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3187 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3187"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3188 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3188"); //$NON-NLS-1$

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
	public static final IElementType Exception_3090 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3090"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3091 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3091"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3189 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3189"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3151 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3151"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3152 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3152"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3190 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3190"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3153 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3153"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3154 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3154"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3191 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3191"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3192 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3192"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3193 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3193"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3194 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3194"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3195 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3195"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Expression_3211 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3211"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Exception_3196 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3196"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType If_3197 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3197"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3198 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3198"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3223 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3223"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3224 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3224"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3225 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3225"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3226 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3226"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3227 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3227"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3228 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3228"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3199 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3199"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3200 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3200"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3201 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3201"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3202 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3202"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3203 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3203"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3092 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3092"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3229 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3229"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3093 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3093"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3094 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3094"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3095 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3095"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3096 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3096"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3097 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3097"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3098 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3098"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3155 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3155"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3230 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3230"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3156 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3156"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3157 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3157"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3158 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3158"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3159 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3159"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3160 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3160"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3099 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3099"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3161 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3161"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3231 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3231"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3232 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3232"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3233 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3233"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3234 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3234"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3235 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3235"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3162 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3162"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3163 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3163"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3164 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3164"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3165 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3165"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3166 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3166"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3100 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3100"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3101 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3101"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3102 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3102"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3103 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3103"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3104 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3104"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Expression_3212 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3212"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3167 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3167"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3168 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3168"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3169 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3169"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3170 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3170"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3171 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3171"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3172 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3172"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3173 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3173"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3174 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3174"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3175 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3175"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Expression_3213 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3213"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3176 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3176"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3177 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3177"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3178 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3178"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3179 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3179"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3180 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3180"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Expression_3214 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3214"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3204 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3204"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3205 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3205"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3206 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3206"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3207 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3207"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3208 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3208"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3209 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3209"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3210 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3210"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Expression_3215 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3215"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Case_3138 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3138"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Insert_3139 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3139"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Update_3140 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3140"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Delete_3141 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3141"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3142 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3142"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType While_3143 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3143"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType For_3144 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3144"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Loop_3145 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3145"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Open_3146 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3146"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Fetch_3147 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3147"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Close_3148 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3148"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3149 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3149"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CallFunction_3150 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3150"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Expression_3216 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3216"); //$NON-NLS-1$

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
	public static final IElementType Expression_3217 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3217"); //$NON-NLS-1$

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
	public static final IElementType Expression_3218 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3218"); //$NON-NLS-1$

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
	public static final IElementType Expression_3219 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3219"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectorTransition_4002 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.SelectorTransition_4002"); //$NON-NLS-1$

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

			elements.put(DataType_3052, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3053, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3054, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3055, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3018, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3019, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3020, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3021, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Expression_3217, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3056, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3057, CrystalPackage.eINSTANCE.getIf());

			elements.put(Expression_3211, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3181, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3182, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3183, CrystalPackage.eINSTANCE.getCase());

			elements.put(Expression_3220, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3221, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3222, CrystalPackage.eINSTANCE.getIf());

			elements.put(Insert_3184, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3185, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3186, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3187, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3188, CrystalPackage.eINSTANCE.getWhile());

			elements.put(Expression_3212, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3090, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3091, CrystalPackage.eINSTANCE.getIf());

			elements.put(For_3189, CrystalPackage.eINSTANCE.getFor());

			elements.put(Expression_3214, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3151, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3152, CrystalPackage.eINSTANCE.getIf());

			elements.put(Loop_3190, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Expression_3213, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3153, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3154, CrystalPackage.eINSTANCE.getIf());

			elements.put(Open_3191, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3192, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3193, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3194, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3195, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Expression_3215, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3196, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3197, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3198, CrystalPackage.eINSTANCE.getCase());

			elements.put(Case_3223, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3224, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3225, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3226, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3227, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3228, CrystalPackage.eINSTANCE.getWhile());

			elements.put(Case_3092, CrystalPackage.eINSTANCE.getCase());

			elements.put(For_3229, CrystalPackage.eINSTANCE.getFor());

			elements.put(Case_3155, CrystalPackage.eINSTANCE.getCase());

			elements.put(Loop_3230, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Case_3161, CrystalPackage.eINSTANCE.getCase());

			elements.put(Open_3231, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3232, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3233, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3234, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3235, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Selector_3108, CrystalPackage.eINSTANCE.getSelector());

			elements.put(Expression_3216, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3109, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3110, CrystalPackage.eINSTANCE.getIf());

			elements.put(Insert_3199, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3200, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3201, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3202, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3203, CrystalPackage.eINSTANCE.getWhile());

			elements.put(Insert_3093, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3094, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3095, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3096, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3097, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3098, CrystalPackage.eINSTANCE.getFor());

			elements.put(Insert_3156, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3157, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3158, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3159, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3160, CrystalPackage.eINSTANCE.getWhile());

			elements.put(Loop_3099, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Insert_3162, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3163, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3164, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3165, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3166, CrystalPackage.eINSTANCE.getWhile());

			elements.put(Open_3100, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3101, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3102, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3103, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3104, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(For_3167, CrystalPackage.eINSTANCE.getFor());

			elements.put(For_3168, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3169, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Loop_3170, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3171, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3172, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3173, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3174, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3175, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Open_3176, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3177, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3178, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3179, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3180, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(For_3204, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3205, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3206, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3207, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3208, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3209, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3210, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Case_3138, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3139, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3140, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3141, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3142, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3143, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3144, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3145, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3146, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3147, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3148, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3149, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3150, CrystalPackage.eINSTANCE.getCallFunction());

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

			elements.put(DataType_3071, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3072, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3073, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3074, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3022, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3023, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3024, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3025, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3026, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3027, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3028, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3029, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Expression_3218, CrystalPackage.eINSTANCE.getExpression());

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

			elements.put(Expression_3219, CrystalPackage.eINSTANCE.getExpression());

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

			elements.put(SelectorTransition_4002, CrystalPackage.eINSTANCE.getSelectorTransition());
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
			KNOWN_ELEMENT_TYPES.add(DataType_3052);
			KNOWN_ELEMENT_TYPES.add(Collections_3053);
			KNOWN_ELEMENT_TYPES.add(Records_3054);
			KNOWN_ELEMENT_TYPES.add(Cursor_3055);
			KNOWN_ELEMENT_TYPES.add(DataType_3018);
			KNOWN_ELEMENT_TYPES.add(Collections_3019);
			KNOWN_ELEMENT_TYPES.add(Records_3020);
			KNOWN_ELEMENT_TYPES.add(Cursor_3021);
			KNOWN_ELEMENT_TYPES.add(Expression_3217);
			KNOWN_ELEMENT_TYPES.add(Exception_3056);
			KNOWN_ELEMENT_TYPES.add(If_3057);
			KNOWN_ELEMENT_TYPES.add(Expression_3211);
			KNOWN_ELEMENT_TYPES.add(Exception_3181);
			KNOWN_ELEMENT_TYPES.add(If_3182);
			KNOWN_ELEMENT_TYPES.add(Case_3183);
			KNOWN_ELEMENT_TYPES.add(Expression_3220);
			KNOWN_ELEMENT_TYPES.add(Exception_3221);
			KNOWN_ELEMENT_TYPES.add(If_3222);
			KNOWN_ELEMENT_TYPES.add(Insert_3184);
			KNOWN_ELEMENT_TYPES.add(Update_3185);
			KNOWN_ELEMENT_TYPES.add(Delete_3186);
			KNOWN_ELEMENT_TYPES.add(Select_3187);
			KNOWN_ELEMENT_TYPES.add(While_3188);
			KNOWN_ELEMENT_TYPES.add(Expression_3212);
			KNOWN_ELEMENT_TYPES.add(Exception_3090);
			KNOWN_ELEMENT_TYPES.add(If_3091);
			KNOWN_ELEMENT_TYPES.add(For_3189);
			KNOWN_ELEMENT_TYPES.add(Expression_3214);
			KNOWN_ELEMENT_TYPES.add(Exception_3151);
			KNOWN_ELEMENT_TYPES.add(If_3152);
			KNOWN_ELEMENT_TYPES.add(Loop_3190);
			KNOWN_ELEMENT_TYPES.add(Expression_3213);
			KNOWN_ELEMENT_TYPES.add(Exception_3153);
			KNOWN_ELEMENT_TYPES.add(If_3154);
			KNOWN_ELEMENT_TYPES.add(Open_3191);
			KNOWN_ELEMENT_TYPES.add(Fetch_3192);
			KNOWN_ELEMENT_TYPES.add(Close_3193);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3194);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3195);
			KNOWN_ELEMENT_TYPES.add(Expression_3215);
			KNOWN_ELEMENT_TYPES.add(Exception_3196);
			KNOWN_ELEMENT_TYPES.add(If_3197);
			KNOWN_ELEMENT_TYPES.add(Case_3198);
			KNOWN_ELEMENT_TYPES.add(Case_3223);
			KNOWN_ELEMENT_TYPES.add(Insert_3224);
			KNOWN_ELEMENT_TYPES.add(Update_3225);
			KNOWN_ELEMENT_TYPES.add(Delete_3226);
			KNOWN_ELEMENT_TYPES.add(Select_3227);
			KNOWN_ELEMENT_TYPES.add(While_3228);
			KNOWN_ELEMENT_TYPES.add(Case_3092);
			KNOWN_ELEMENT_TYPES.add(For_3229);
			KNOWN_ELEMENT_TYPES.add(Case_3155);
			KNOWN_ELEMENT_TYPES.add(Loop_3230);
			KNOWN_ELEMENT_TYPES.add(Case_3161);
			KNOWN_ELEMENT_TYPES.add(Open_3231);
			KNOWN_ELEMENT_TYPES.add(Fetch_3232);
			KNOWN_ELEMENT_TYPES.add(Close_3233);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3234);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3235);
			KNOWN_ELEMENT_TYPES.add(Selector_3108);
			KNOWN_ELEMENT_TYPES.add(Expression_3216);
			KNOWN_ELEMENT_TYPES.add(Exception_3109);
			KNOWN_ELEMENT_TYPES.add(If_3110);
			KNOWN_ELEMENT_TYPES.add(Insert_3199);
			KNOWN_ELEMENT_TYPES.add(Update_3200);
			KNOWN_ELEMENT_TYPES.add(Delete_3201);
			KNOWN_ELEMENT_TYPES.add(Select_3202);
			KNOWN_ELEMENT_TYPES.add(While_3203);
			KNOWN_ELEMENT_TYPES.add(Insert_3093);
			KNOWN_ELEMENT_TYPES.add(Update_3094);
			KNOWN_ELEMENT_TYPES.add(Delete_3095);
			KNOWN_ELEMENT_TYPES.add(Select_3096);
			KNOWN_ELEMENT_TYPES.add(While_3097);
			KNOWN_ELEMENT_TYPES.add(For_3098);
			KNOWN_ELEMENT_TYPES.add(Insert_3156);
			KNOWN_ELEMENT_TYPES.add(Update_3157);
			KNOWN_ELEMENT_TYPES.add(Delete_3158);
			KNOWN_ELEMENT_TYPES.add(Select_3159);
			KNOWN_ELEMENT_TYPES.add(While_3160);
			KNOWN_ELEMENT_TYPES.add(Loop_3099);
			KNOWN_ELEMENT_TYPES.add(Insert_3162);
			KNOWN_ELEMENT_TYPES.add(Update_3163);
			KNOWN_ELEMENT_TYPES.add(Delete_3164);
			KNOWN_ELEMENT_TYPES.add(Select_3165);
			KNOWN_ELEMENT_TYPES.add(While_3166);
			KNOWN_ELEMENT_TYPES.add(Open_3100);
			KNOWN_ELEMENT_TYPES.add(Fetch_3101);
			KNOWN_ELEMENT_TYPES.add(Close_3102);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3103);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3104);
			KNOWN_ELEMENT_TYPES.add(For_3167);
			KNOWN_ELEMENT_TYPES.add(For_3168);
			KNOWN_ELEMENT_TYPES.add(Loop_3169);
			KNOWN_ELEMENT_TYPES.add(Loop_3170);
			KNOWN_ELEMENT_TYPES.add(Open_3171);
			KNOWN_ELEMENT_TYPES.add(Fetch_3172);
			KNOWN_ELEMENT_TYPES.add(Close_3173);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3174);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3175);
			KNOWN_ELEMENT_TYPES.add(Open_3176);
			KNOWN_ELEMENT_TYPES.add(Fetch_3177);
			KNOWN_ELEMENT_TYPES.add(Close_3178);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3179);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3180);
			KNOWN_ELEMENT_TYPES.add(For_3204);
			KNOWN_ELEMENT_TYPES.add(Loop_3205);
			KNOWN_ELEMENT_TYPES.add(Open_3206);
			KNOWN_ELEMENT_TYPES.add(Fetch_3207);
			KNOWN_ELEMENT_TYPES.add(Close_3208);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3209);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3210);
			KNOWN_ELEMENT_TYPES.add(Case_3138);
			KNOWN_ELEMENT_TYPES.add(Insert_3139);
			KNOWN_ELEMENT_TYPES.add(Update_3140);
			KNOWN_ELEMENT_TYPES.add(Delete_3141);
			KNOWN_ELEMENT_TYPES.add(Select_3142);
			KNOWN_ELEMENT_TYPES.add(While_3143);
			KNOWN_ELEMENT_TYPES.add(For_3144);
			KNOWN_ELEMENT_TYPES.add(Loop_3145);
			KNOWN_ELEMENT_TYPES.add(Open_3146);
			KNOWN_ELEMENT_TYPES.add(Fetch_3147);
			KNOWN_ELEMENT_TYPES.add(Close_3148);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3149);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3150);
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
			KNOWN_ELEMENT_TYPES.add(DataType_3071);
			KNOWN_ELEMENT_TYPES.add(Collections_3072);
			KNOWN_ELEMENT_TYPES.add(Records_3073);
			KNOWN_ELEMENT_TYPES.add(Cursor_3074);
			KNOWN_ELEMENT_TYPES.add(DataType_3022);
			KNOWN_ELEMENT_TYPES.add(Collections_3023);
			KNOWN_ELEMENT_TYPES.add(Records_3024);
			KNOWN_ELEMENT_TYPES.add(Cursor_3025);
			KNOWN_ELEMENT_TYPES.add(DataType_3026);
			KNOWN_ELEMENT_TYPES.add(Collections_3027);
			KNOWN_ELEMENT_TYPES.add(Records_3028);
			KNOWN_ELEMENT_TYPES.add(Cursor_3029);
			KNOWN_ELEMENT_TYPES.add(Expression_3218);
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
			KNOWN_ELEMENT_TYPES.add(Expression_3219);
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
			KNOWN_ELEMENT_TYPES.add(SelectorTransition_4002);
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
			return DataType_3052;
		case CollectionsEditPart.VISUAL_ID:
			return Collections_3053;
		case RecordsEditPart.VISUAL_ID:
			return Records_3054;
		case CursorEditPart.VISUAL_ID:
			return Cursor_3055;
		case DataType2EditPart.VISUAL_ID:
			return DataType_3018;
		case Collections2EditPart.VISUAL_ID:
			return Collections_3019;
		case Records2EditPart.VISUAL_ID:
			return Records_3020;
		case Cursor2EditPart.VISUAL_ID:
			return Cursor_3021;
		case ExpressionEditPart.VISUAL_ID:
			return Expression_3217;
		case ExceptionEditPart.VISUAL_ID:
			return Exception_3056;
		case IfEditPart.VISUAL_ID:
			return If_3057;
		case Expression2EditPart.VISUAL_ID:
			return Expression_3211;
		case Exception2EditPart.VISUAL_ID:
			return Exception_3181;
		case If2EditPart.VISUAL_ID:
			return If_3182;
		case CaseEditPart.VISUAL_ID:
			return Case_3183;
		case Expression3EditPart.VISUAL_ID:
			return Expression_3220;
		case Exception3EditPart.VISUAL_ID:
			return Exception_3221;
		case If3EditPart.VISUAL_ID:
			return If_3222;
		case InsertEditPart.VISUAL_ID:
			return Insert_3184;
		case UpdateEditPart.VISUAL_ID:
			return Update_3185;
		case DeleteEditPart.VISUAL_ID:
			return Delete_3186;
		case SelectEditPart.VISUAL_ID:
			return Select_3187;
		case WhileEditPart.VISUAL_ID:
			return While_3188;
		case Expression4EditPart.VISUAL_ID:
			return Expression_3212;
		case Exception4EditPart.VISUAL_ID:
			return Exception_3090;
		case If4EditPart.VISUAL_ID:
			return If_3091;
		case ForEditPart.VISUAL_ID:
			return For_3189;
		case Expression5EditPart.VISUAL_ID:
			return Expression_3214;
		case Exception5EditPart.VISUAL_ID:
			return Exception_3151;
		case If5EditPart.VISUAL_ID:
			return If_3152;
		case LoopEditPart.VISUAL_ID:
			return Loop_3190;
		case Expression6EditPart.VISUAL_ID:
			return Expression_3213;
		case Exception6EditPart.VISUAL_ID:
			return Exception_3153;
		case If6EditPart.VISUAL_ID:
			return If_3154;
		case OpenEditPart.VISUAL_ID:
			return Open_3191;
		case FetchEditPart.VISUAL_ID:
			return Fetch_3192;
		case CloseEditPart.VISUAL_ID:
			return Close_3193;
		case CallProcedureEditPart.VISUAL_ID:
			return CallProcedure_3194;
		case CallFunctionEditPart.VISUAL_ID:
			return CallFunction_3195;
		case Expression7EditPart.VISUAL_ID:
			return Expression_3215;
		case Exception7EditPart.VISUAL_ID:
			return Exception_3196;
		case If7EditPart.VISUAL_ID:
			return If_3197;
		case Case2EditPart.VISUAL_ID:
			return Case_3198;
		case Case3EditPart.VISUAL_ID:
			return Case_3223;
		case Insert2EditPart.VISUAL_ID:
			return Insert_3224;
		case Update2EditPart.VISUAL_ID:
			return Update_3225;
		case Delete2EditPart.VISUAL_ID:
			return Delete_3226;
		case Select2EditPart.VISUAL_ID:
			return Select_3227;
		case While2EditPart.VISUAL_ID:
			return While_3228;
		case Case4EditPart.VISUAL_ID:
			return Case_3092;
		case For2EditPart.VISUAL_ID:
			return For_3229;
		case Case5EditPart.VISUAL_ID:
			return Case_3155;
		case Loop2EditPart.VISUAL_ID:
			return Loop_3230;
		case Case6EditPart.VISUAL_ID:
			return Case_3161;
		case Open2EditPart.VISUAL_ID:
			return Open_3231;
		case Fetch2EditPart.VISUAL_ID:
			return Fetch_3232;
		case Close2EditPart.VISUAL_ID:
			return Close_3233;
		case CallProcedure2EditPart.VISUAL_ID:
			return CallProcedure_3234;
		case CallFunction2EditPart.VISUAL_ID:
			return CallFunction_3235;
		case SelectorEditPart.VISUAL_ID:
			return Selector_3108;
		case Expression8EditPart.VISUAL_ID:
			return Expression_3216;
		case Exception8EditPart.VISUAL_ID:
			return Exception_3109;
		case If8EditPart.VISUAL_ID:
			return If_3110;
		case Insert3EditPart.VISUAL_ID:
			return Insert_3199;
		case Update3EditPart.VISUAL_ID:
			return Update_3200;
		case Delete3EditPart.VISUAL_ID:
			return Delete_3201;
		case Select3EditPart.VISUAL_ID:
			return Select_3202;
		case While3EditPart.VISUAL_ID:
			return While_3203;
		case Insert4EditPart.VISUAL_ID:
			return Insert_3093;
		case Update4EditPart.VISUAL_ID:
			return Update_3094;
		case Delete4EditPart.VISUAL_ID:
			return Delete_3095;
		case Select4EditPart.VISUAL_ID:
			return Select_3096;
		case While4EditPart.VISUAL_ID:
			return While_3097;
		case For3EditPart.VISUAL_ID:
			return For_3098;
		case Insert5EditPart.VISUAL_ID:
			return Insert_3156;
		case Update5EditPart.VISUAL_ID:
			return Update_3157;
		case Delete5EditPart.VISUAL_ID:
			return Delete_3158;
		case Select5EditPart.VISUAL_ID:
			return Select_3159;
		case While5EditPart.VISUAL_ID:
			return While_3160;
		case Loop3EditPart.VISUAL_ID:
			return Loop_3099;
		case Insert6EditPart.VISUAL_ID:
			return Insert_3162;
		case Update6EditPart.VISUAL_ID:
			return Update_3163;
		case Delete6EditPart.VISUAL_ID:
			return Delete_3164;
		case Select6EditPart.VISUAL_ID:
			return Select_3165;
		case While6EditPart.VISUAL_ID:
			return While_3166;
		case Open3EditPart.VISUAL_ID:
			return Open_3100;
		case Fetch3EditPart.VISUAL_ID:
			return Fetch_3101;
		case Close3EditPart.VISUAL_ID:
			return Close_3102;
		case CallProcedure3EditPart.VISUAL_ID:
			return CallProcedure_3103;
		case CallFunction3EditPart.VISUAL_ID:
			return CallFunction_3104;
		case For4EditPart.VISUAL_ID:
			return For_3167;
		case For5EditPart.VISUAL_ID:
			return For_3168;
		case Loop4EditPart.VISUAL_ID:
			return Loop_3169;
		case Loop5EditPart.VISUAL_ID:
			return Loop_3170;
		case Open4EditPart.VISUAL_ID:
			return Open_3171;
		case Fetch4EditPart.VISUAL_ID:
			return Fetch_3172;
		case Close4EditPart.VISUAL_ID:
			return Close_3173;
		case CallProcedure4EditPart.VISUAL_ID:
			return CallProcedure_3174;
		case CallFunction4EditPart.VISUAL_ID:
			return CallFunction_3175;
		case Open5EditPart.VISUAL_ID:
			return Open_3176;
		case Fetch5EditPart.VISUAL_ID:
			return Fetch_3177;
		case Close5EditPart.VISUAL_ID:
			return Close_3178;
		case CallProcedure5EditPart.VISUAL_ID:
			return CallProcedure_3179;
		case CallFunction5EditPart.VISUAL_ID:
			return CallFunction_3180;
		case For6EditPart.VISUAL_ID:
			return For_3204;
		case Loop6EditPart.VISUAL_ID:
			return Loop_3205;
		case Open6EditPart.VISUAL_ID:
			return Open_3206;
		case Fetch6EditPart.VISUAL_ID:
			return Fetch_3207;
		case Close6EditPart.VISUAL_ID:
			return Close_3208;
		case CallProcedure6EditPart.VISUAL_ID:
			return CallProcedure_3209;
		case CallFunction6EditPart.VISUAL_ID:
			return CallFunction_3210;
		case Case7EditPart.VISUAL_ID:
			return Case_3138;
		case Insert7EditPart.VISUAL_ID:
			return Insert_3139;
		case Update7EditPart.VISUAL_ID:
			return Update_3140;
		case Delete7EditPart.VISUAL_ID:
			return Delete_3141;
		case Select7EditPart.VISUAL_ID:
			return Select_3142;
		case While7EditPart.VISUAL_ID:
			return While_3143;
		case For7EditPart.VISUAL_ID:
			return For_3144;
		case Loop7EditPart.VISUAL_ID:
			return Loop_3145;
		case Open7EditPart.VISUAL_ID:
			return Open_3146;
		case Fetch7EditPart.VISUAL_ID:
			return Fetch_3147;
		case Close7EditPart.VISUAL_ID:
			return Close_3148;
		case CallProcedure7EditPart.VISUAL_ID:
			return CallProcedure_3149;
		case CallFunction7EditPart.VISUAL_ID:
			return CallFunction_3150;
		case Case8EditPart.VISUAL_ID:
			return Case_3058;
		case Insert8EditPart.VISUAL_ID:
			return Insert_3059;
		case Update8EditPart.VISUAL_ID:
			return Update_3060;
		case Delete8EditPart.VISUAL_ID:
			return Delete_3061;
		case Select8EditPart.VISUAL_ID:
			return Select_3062;
		case While8EditPart.VISUAL_ID:
			return While_3063;
		case For8EditPart.VISUAL_ID:
			return For_3064;
		case Loop8EditPart.VISUAL_ID:
			return Loop_3065;
		case Open8EditPart.VISUAL_ID:
			return Open_3066;
		case Fetch8EditPart.VISUAL_ID:
			return Fetch_3067;
		case Close8EditPart.VISUAL_ID:
			return Close_3068;
		case CallProcedure8EditPart.VISUAL_ID:
			return CallProcedure_3069;
		case CallFunction8EditPart.VISUAL_ID:
			return CallFunction_3070;
		case DataType3EditPart.VISUAL_ID:
			return DataType_3071;
		case Collections3EditPart.VISUAL_ID:
			return Collections_3072;
		case Records3EditPart.VISUAL_ID:
			return Records_3073;
		case Cursor3EditPart.VISUAL_ID:
			return Cursor_3074;
		case DataType4EditPart.VISUAL_ID:
			return DataType_3022;
		case Collections4EditPart.VISUAL_ID:
			return Collections_3023;
		case Records4EditPart.VISUAL_ID:
			return Records_3024;
		case Cursor4EditPart.VISUAL_ID:
			return Cursor_3025;
		case DataType5EditPart.VISUAL_ID:
			return DataType_3026;
		case Collections5EditPart.VISUAL_ID:
			return Collections_3027;
		case Records5EditPart.VISUAL_ID:
			return Records_3028;
		case Cursor5EditPart.VISUAL_ID:
			return Cursor_3029;
		case Expression9EditPart.VISUAL_ID:
			return Expression_3218;
		case Exception9EditPart.VISUAL_ID:
			return Exception_3075;
		case If9EditPart.VISUAL_ID:
			return If_3076;
		case Case9EditPart.VISUAL_ID:
			return Case_3077;
		case Insert9EditPart.VISUAL_ID:
			return Insert_3078;
		case Update9EditPart.VISUAL_ID:
			return Update_3079;
		case Delete9EditPart.VISUAL_ID:
			return Delete_3080;
		case Select9EditPart.VISUAL_ID:
			return Select_3081;
		case While9EditPart.VISUAL_ID:
			return While_3082;
		case For9EditPart.VISUAL_ID:
			return For_3083;
		case Loop9EditPart.VISUAL_ID:
			return Loop_3084;
		case Open9EditPart.VISUAL_ID:
			return Open_3085;
		case Fetch9EditPart.VISUAL_ID:
			return Fetch_3086;
		case Close9EditPart.VISUAL_ID:
			return Close_3087;
		case CallProcedure9EditPart.VISUAL_ID:
			return CallProcedure_3088;
		case CallFunction9EditPart.VISUAL_ID:
			return CallFunction_3089;
		case DataType6EditPart.VISUAL_ID:
			return DataType_3033;
		case Collections6EditPart.VISUAL_ID:
			return Collections_3034;
		case Records6EditPart.VISUAL_ID:
			return Records_3035;
		case Cursor6EditPart.VISUAL_ID:
			return Cursor_3036;
		case Expression10EditPart.VISUAL_ID:
			return Expression_3219;
		case Exception10EditPart.VISUAL_ID:
			return Exception_3037;
		case If10EditPart.VISUAL_ID:
			return If_3038;
		case Case10EditPart.VISUAL_ID:
			return Case_3039;
		case Insert10EditPart.VISUAL_ID:
			return Insert_3040;
		case Update10EditPart.VISUAL_ID:
			return Update_3041;
		case Delete10EditPart.VISUAL_ID:
			return Delete_3042;
		case Select10EditPart.VISUAL_ID:
			return Select_3043;
		case While10EditPart.VISUAL_ID:
			return While_3044;
		case For10EditPart.VISUAL_ID:
			return For_3045;
		case Loop10EditPart.VISUAL_ID:
			return Loop_3046;
		case Open10EditPart.VISUAL_ID:
			return Open_3047;
		case Fetch10EditPart.VISUAL_ID:
			return Fetch_3048;
		case Close10EditPart.VISUAL_ID:
			return Close_3049;
		case CallProcedure10EditPart.VISUAL_ID:
			return CallProcedure_3050;
		case CallFunction10EditPart.VISUAL_ID:
			return CallFunction_3051;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		case SelectorTransitionEditPart.VISUAL_ID:
			return SelectorTransition_4002;
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
