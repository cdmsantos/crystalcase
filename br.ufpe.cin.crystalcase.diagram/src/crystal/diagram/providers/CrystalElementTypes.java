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
	public static final IElementType Procedure_2010 = getElementType("br.ufpe.cin.crystalcase.diagram.Procedure_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_2011 = getElementType("br.ufpe.cin.crystalcase.diagram.Function_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AnonymousBlock_2012 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.AnonymousBlock_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Expression_3236 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3236"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Exception_3237 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3237"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3238 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3238"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Expression_3239 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3239"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Exception_3240 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3240"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3241 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3241"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Case_3242 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3242"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Expression_3243 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3243"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Exception_3244 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3244"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3245 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3245"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Insert_3246 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3246"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Update_3247 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3247"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Delete_3248 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3248"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3249 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3249"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType While_3250 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3250"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Expression_3251 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3251"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Exception_3252 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3252"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3253 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3253"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType For_3254 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3254"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Case_3255 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3255"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Case_3256 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3256"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Insert_3257 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3257"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Update_3258 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3258"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Delete_3259 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3259"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3260 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3260"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType While_3261 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3261"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Insert_3262 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3262"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Update_3263 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3263"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Delete_3264 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3264"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3265 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3265"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType While_3266 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3266"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType For_3267 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3267"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_3268 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3268"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Open_3269 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3269"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fetch_3270 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3270"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Close_3271 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3271"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3272 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3272"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallFunction_3273 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3273"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType For_3274 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3274"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_3275 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3275"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Open_3276 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3276"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fetch_3277 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3277"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Close_3278 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3278"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3279 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3279"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallFunction_3280 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3280"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Options_3281 = getElementType("br.ufpe.cin.crystalcase.diagram.Options_3281"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Expression_3282 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3282"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Exception_3283 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3283"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3284 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3284"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_3285 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3285"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Open_3286 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3286"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fetch_3287 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3287"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Close_3288 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3288"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3289 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3289"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallFunction_3290 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3290"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Expression_3291 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Expression_3291"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Exception_3292 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3292"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType If_3293 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3293"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Case_3294 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3294"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Insert_3295 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3295"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Update_3296 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3296"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Delete_3297 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3297"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3298 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3298"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType While_3299 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3299"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType For_3300 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3300"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_3301 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3301"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Open_3302 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3302"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fetch_3303 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3303"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Close_3304 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3304"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3305 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3305"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallFunction_3306 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3306"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Case_3307 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3307"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Insert_3308 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3308"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Update_3309 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3309"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Delete_3310 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3310"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3311 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3311"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType While_3312 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3312"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType For_3313 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3313"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_3314 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3314"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Open_3315 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3315"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fetch_3316 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3316"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Close_3317 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3317"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3318 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3318"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallFunction_3319 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3319"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Case_3320 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3320"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Insert_3321 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3321"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Update_3322 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3322"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Delete_3323 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3323"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Select_3324 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3324"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType While_3325 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3325"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType For_3326 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3326"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Loop_3327 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3327"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Open_3328 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3328"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fetch_3329 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3329"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Close_3330 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3330"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallProcedure_3331 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallProcedure_3331"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CallFunction_3332 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.CallFunction_3332"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataType_3333 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3333"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Collections_3334 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3334"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Records_3335 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3335"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Cursor_3336 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3336"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataType_3337 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3337"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Collections_3338 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Collections_3338"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Records_3339 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3339"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Cursor_3340 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3340"); //$NON-NLS-1$
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
	public static final IElementType Transition_4001 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.Transition_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OptionsTransition_4003 = getElementType(
			"br.ufpe.cin.crystalcase.diagram.OptionsTransition_4003"); //$NON-NLS-1$

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

			elements.put(Procedure_2010, CrystalPackage.eINSTANCE.getProcedure());

			elements.put(Function_2011, CrystalPackage.eINSTANCE.getFunction());

			elements.put(AnonymousBlock_2012, CrystalPackage.eINSTANCE.getAnonymousBlock());

			elements.put(Expression_3236, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3237, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3238, CrystalPackage.eINSTANCE.getIf());

			elements.put(Expression_3239, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3240, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3241, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3242, CrystalPackage.eINSTANCE.getCase());

			elements.put(Expression_3243, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3244, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3245, CrystalPackage.eINSTANCE.getIf());

			elements.put(Insert_3246, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3247, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3248, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3249, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3250, CrystalPackage.eINSTANCE.getWhile());

			elements.put(Expression_3251, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3252, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3253, CrystalPackage.eINSTANCE.getIf());

			elements.put(For_3254, CrystalPackage.eINSTANCE.getFor());

			elements.put(Case_3255, CrystalPackage.eINSTANCE.getCase());

			elements.put(Case_3256, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3257, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3258, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3259, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3260, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3261, CrystalPackage.eINSTANCE.getWhile());

			elements.put(Insert_3262, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3263, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3264, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3265, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3266, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3267, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3268, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3269, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3270, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3271, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3272, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3273, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(For_3274, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3275, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3276, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3277, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3278, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3279, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3280, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Options_3281, CrystalPackage.eINSTANCE.getOptions());

			elements.put(Expression_3282, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3283, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3284, CrystalPackage.eINSTANCE.getIf());

			elements.put(Loop_3285, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3286, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3287, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3288, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3289, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3290, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Expression_3291, CrystalPackage.eINSTANCE.getExpression());

			elements.put(Exception_3292, CrystalPackage.eINSTANCE.getException());

			elements.put(If_3293, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3294, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3295, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3296, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3297, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3298, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3299, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3300, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3301, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3302, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3303, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3304, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3305, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3306, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Case_3307, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3308, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3309, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3310, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3311, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3312, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3313, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3314, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3315, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3316, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3317, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3318, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3319, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(Case_3320, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3321, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3322, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3323, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3324, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3325, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3326, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3327, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3328, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3329, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3330, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3331, CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3332, CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(DataType_3333, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3334, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3335, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3336, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3337, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3338, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3339, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3340, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3026, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3027, CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3028, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3029, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Transition_4001, CrystalPackage.eINSTANCE.getTransition());

			elements.put(OptionsTransition_4003, CrystalPackage.eINSTANCE.getOptionsTransition());
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
			KNOWN_ELEMENT_TYPES.add(Procedure_2010);
			KNOWN_ELEMENT_TYPES.add(Function_2011);
			KNOWN_ELEMENT_TYPES.add(AnonymousBlock_2012);
			KNOWN_ELEMENT_TYPES.add(Expression_3236);
			KNOWN_ELEMENT_TYPES.add(Exception_3237);
			KNOWN_ELEMENT_TYPES.add(If_3238);
			KNOWN_ELEMENT_TYPES.add(Expression_3239);
			KNOWN_ELEMENT_TYPES.add(Exception_3240);
			KNOWN_ELEMENT_TYPES.add(If_3241);
			KNOWN_ELEMENT_TYPES.add(Case_3242);
			KNOWN_ELEMENT_TYPES.add(Expression_3243);
			KNOWN_ELEMENT_TYPES.add(Exception_3244);
			KNOWN_ELEMENT_TYPES.add(If_3245);
			KNOWN_ELEMENT_TYPES.add(Insert_3246);
			KNOWN_ELEMENT_TYPES.add(Update_3247);
			KNOWN_ELEMENT_TYPES.add(Delete_3248);
			KNOWN_ELEMENT_TYPES.add(Select_3249);
			KNOWN_ELEMENT_TYPES.add(While_3250);
			KNOWN_ELEMENT_TYPES.add(Expression_3251);
			KNOWN_ELEMENT_TYPES.add(Exception_3252);
			KNOWN_ELEMENT_TYPES.add(If_3253);
			KNOWN_ELEMENT_TYPES.add(For_3254);
			KNOWN_ELEMENT_TYPES.add(Case_3255);
			KNOWN_ELEMENT_TYPES.add(Case_3256);
			KNOWN_ELEMENT_TYPES.add(Insert_3257);
			KNOWN_ELEMENT_TYPES.add(Update_3258);
			KNOWN_ELEMENT_TYPES.add(Delete_3259);
			KNOWN_ELEMENT_TYPES.add(Select_3260);
			KNOWN_ELEMENT_TYPES.add(While_3261);
			KNOWN_ELEMENT_TYPES.add(Insert_3262);
			KNOWN_ELEMENT_TYPES.add(Update_3263);
			KNOWN_ELEMENT_TYPES.add(Delete_3264);
			KNOWN_ELEMENT_TYPES.add(Select_3265);
			KNOWN_ELEMENT_TYPES.add(While_3266);
			KNOWN_ELEMENT_TYPES.add(For_3267);
			KNOWN_ELEMENT_TYPES.add(Loop_3268);
			KNOWN_ELEMENT_TYPES.add(Open_3269);
			KNOWN_ELEMENT_TYPES.add(Fetch_3270);
			KNOWN_ELEMENT_TYPES.add(Close_3271);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3272);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3273);
			KNOWN_ELEMENT_TYPES.add(For_3274);
			KNOWN_ELEMENT_TYPES.add(Loop_3275);
			KNOWN_ELEMENT_TYPES.add(Open_3276);
			KNOWN_ELEMENT_TYPES.add(Fetch_3277);
			KNOWN_ELEMENT_TYPES.add(Close_3278);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3279);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3280);
			KNOWN_ELEMENT_TYPES.add(Options_3281);
			KNOWN_ELEMENT_TYPES.add(Expression_3282);
			KNOWN_ELEMENT_TYPES.add(Exception_3283);
			KNOWN_ELEMENT_TYPES.add(If_3284);
			KNOWN_ELEMENT_TYPES.add(Loop_3285);
			KNOWN_ELEMENT_TYPES.add(Open_3286);
			KNOWN_ELEMENT_TYPES.add(Fetch_3287);
			KNOWN_ELEMENT_TYPES.add(Close_3288);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3289);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3290);
			KNOWN_ELEMENT_TYPES.add(Expression_3291);
			KNOWN_ELEMENT_TYPES.add(Exception_3292);
			KNOWN_ELEMENT_TYPES.add(If_3293);
			KNOWN_ELEMENT_TYPES.add(Case_3294);
			KNOWN_ELEMENT_TYPES.add(Insert_3295);
			KNOWN_ELEMENT_TYPES.add(Update_3296);
			KNOWN_ELEMENT_TYPES.add(Delete_3297);
			KNOWN_ELEMENT_TYPES.add(Select_3298);
			KNOWN_ELEMENT_TYPES.add(While_3299);
			KNOWN_ELEMENT_TYPES.add(For_3300);
			KNOWN_ELEMENT_TYPES.add(Loop_3301);
			KNOWN_ELEMENT_TYPES.add(Open_3302);
			KNOWN_ELEMENT_TYPES.add(Fetch_3303);
			KNOWN_ELEMENT_TYPES.add(Close_3304);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3305);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3306);
			KNOWN_ELEMENT_TYPES.add(Case_3307);
			KNOWN_ELEMENT_TYPES.add(Insert_3308);
			KNOWN_ELEMENT_TYPES.add(Update_3309);
			KNOWN_ELEMENT_TYPES.add(Delete_3310);
			KNOWN_ELEMENT_TYPES.add(Select_3311);
			KNOWN_ELEMENT_TYPES.add(While_3312);
			KNOWN_ELEMENT_TYPES.add(For_3313);
			KNOWN_ELEMENT_TYPES.add(Loop_3314);
			KNOWN_ELEMENT_TYPES.add(Open_3315);
			KNOWN_ELEMENT_TYPES.add(Fetch_3316);
			KNOWN_ELEMENT_TYPES.add(Close_3317);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3318);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3319);
			KNOWN_ELEMENT_TYPES.add(Case_3320);
			KNOWN_ELEMENT_TYPES.add(Insert_3321);
			KNOWN_ELEMENT_TYPES.add(Update_3322);
			KNOWN_ELEMENT_TYPES.add(Delete_3323);
			KNOWN_ELEMENT_TYPES.add(Select_3324);
			KNOWN_ELEMENT_TYPES.add(While_3325);
			KNOWN_ELEMENT_TYPES.add(For_3326);
			KNOWN_ELEMENT_TYPES.add(Loop_3327);
			KNOWN_ELEMENT_TYPES.add(Open_3328);
			KNOWN_ELEMENT_TYPES.add(Fetch_3329);
			KNOWN_ELEMENT_TYPES.add(Close_3330);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3331);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3332);
			KNOWN_ELEMENT_TYPES.add(DataType_3333);
			KNOWN_ELEMENT_TYPES.add(Collections_3334);
			KNOWN_ELEMENT_TYPES.add(Records_3335);
			KNOWN_ELEMENT_TYPES.add(Cursor_3336);
			KNOWN_ELEMENT_TYPES.add(DataType_3337);
			KNOWN_ELEMENT_TYPES.add(Collections_3338);
			KNOWN_ELEMENT_TYPES.add(Records_3339);
			KNOWN_ELEMENT_TYPES.add(Cursor_3340);
			KNOWN_ELEMENT_TYPES.add(DataType_3026);
			KNOWN_ELEMENT_TYPES.add(Collections_3027);
			KNOWN_ELEMENT_TYPES.add(Records_3028);
			KNOWN_ELEMENT_TYPES.add(Cursor_3029);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
			KNOWN_ELEMENT_TYPES.add(OptionsTransition_4003);
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
			return Procedure_2010;
		case FunctionEditPart.VISUAL_ID:
			return Function_2011;
		case AnonymousBlockEditPart.VISUAL_ID:
			return AnonymousBlock_2012;
		case ExpressionEditPart.VISUAL_ID:
			return Expression_3236;
		case ExceptionEditPart.VISUAL_ID:
			return Exception_3237;
		case IfEditPart.VISUAL_ID:
			return If_3238;
		case Expression2EditPart.VISUAL_ID:
			return Expression_3239;
		case Exception2EditPart.VISUAL_ID:
			return Exception_3240;
		case If2EditPart.VISUAL_ID:
			return If_3241;
		case CaseEditPart.VISUAL_ID:
			return Case_3242;
		case Expression3EditPart.VISUAL_ID:
			return Expression_3243;
		case Exception3EditPart.VISUAL_ID:
			return Exception_3244;
		case If3EditPart.VISUAL_ID:
			return If_3245;
		case InsertEditPart.VISUAL_ID:
			return Insert_3246;
		case UpdateEditPart.VISUAL_ID:
			return Update_3247;
		case DeleteEditPart.VISUAL_ID:
			return Delete_3248;
		case SelectEditPart.VISUAL_ID:
			return Select_3249;
		case WhileEditPart.VISUAL_ID:
			return While_3250;
		case Expression4EditPart.VISUAL_ID:
			return Expression_3251;
		case Exception4EditPart.VISUAL_ID:
			return Exception_3252;
		case If4EditPart.VISUAL_ID:
			return If_3253;
		case ForEditPart.VISUAL_ID:
			return For_3254;
		case Case2EditPart.VISUAL_ID:
			return Case_3255;
		case Case3EditPart.VISUAL_ID:
			return Case_3256;
		case Insert2EditPart.VISUAL_ID:
			return Insert_3257;
		case Update2EditPart.VISUAL_ID:
			return Update_3258;
		case Delete2EditPart.VISUAL_ID:
			return Delete_3259;
		case Select2EditPart.VISUAL_ID:
			return Select_3260;
		case While2EditPart.VISUAL_ID:
			return While_3261;
		case Insert3EditPart.VISUAL_ID:
			return Insert_3262;
		case Update3EditPart.VISUAL_ID:
			return Update_3263;
		case Delete3EditPart.VISUAL_ID:
			return Delete_3264;
		case Select3EditPart.VISUAL_ID:
			return Select_3265;
		case While3EditPart.VISUAL_ID:
			return While_3266;
		case For2EditPart.VISUAL_ID:
			return For_3267;
		case LoopEditPart.VISUAL_ID:
			return Loop_3268;
		case OpenEditPart.VISUAL_ID:
			return Open_3269;
		case FetchEditPart.VISUAL_ID:
			return Fetch_3270;
		case CloseEditPart.VISUAL_ID:
			return Close_3271;
		case CallProcedureEditPart.VISUAL_ID:
			return CallProcedure_3272;
		case CallFunctionEditPart.VISUAL_ID:
			return CallFunction_3273;
		case For3EditPart.VISUAL_ID:
			return For_3274;
		case Loop2EditPart.VISUAL_ID:
			return Loop_3275;
		case Open2EditPart.VISUAL_ID:
			return Open_3276;
		case Fetch2EditPart.VISUAL_ID:
			return Fetch_3277;
		case Close2EditPart.VISUAL_ID:
			return Close_3278;
		case CallProcedure2EditPart.VISUAL_ID:
			return CallProcedure_3279;
		case CallFunction2EditPart.VISUAL_ID:
			return CallFunction_3280;
		case OptionsEditPart.VISUAL_ID:
			return Options_3281;
		case Expression5EditPart.VISUAL_ID:
			return Expression_3282;
		case Exception5EditPart.VISUAL_ID:
			return Exception_3283;
		case If5EditPart.VISUAL_ID:
			return If_3284;
		case Loop3EditPart.VISUAL_ID:
			return Loop_3285;
		case Open3EditPart.VISUAL_ID:
			return Open_3286;
		case Fetch3EditPart.VISUAL_ID:
			return Fetch_3287;
		case Close3EditPart.VISUAL_ID:
			return Close_3288;
		case CallProcedure3EditPart.VISUAL_ID:
			return CallProcedure_3289;
		case CallFunction3EditPart.VISUAL_ID:
			return CallFunction_3290;
		case Expression6EditPart.VISUAL_ID:
			return Expression_3291;
		case Exception6EditPart.VISUAL_ID:
			return Exception_3292;
		case If6EditPart.VISUAL_ID:
			return If_3293;
		case Case4EditPart.VISUAL_ID:
			return Case_3294;
		case Insert4EditPart.VISUAL_ID:
			return Insert_3295;
		case Update4EditPart.VISUAL_ID:
			return Update_3296;
		case Delete4EditPart.VISUAL_ID:
			return Delete_3297;
		case Select4EditPart.VISUAL_ID:
			return Select_3298;
		case While4EditPart.VISUAL_ID:
			return While_3299;
		case For4EditPart.VISUAL_ID:
			return For_3300;
		case Loop4EditPart.VISUAL_ID:
			return Loop_3301;
		case Open4EditPart.VISUAL_ID:
			return Open_3302;
		case Fetch4EditPart.VISUAL_ID:
			return Fetch_3303;
		case Close4EditPart.VISUAL_ID:
			return Close_3304;
		case CallProcedure4EditPart.VISUAL_ID:
			return CallProcedure_3305;
		case CallFunction4EditPart.VISUAL_ID:
			return CallFunction_3306;
		case Case5EditPart.VISUAL_ID:
			return Case_3307;
		case Insert5EditPart.VISUAL_ID:
			return Insert_3308;
		case Update5EditPart.VISUAL_ID:
			return Update_3309;
		case Delete5EditPart.VISUAL_ID:
			return Delete_3310;
		case Select5EditPart.VISUAL_ID:
			return Select_3311;
		case While5EditPart.VISUAL_ID:
			return While_3312;
		case For5EditPart.VISUAL_ID:
			return For_3313;
		case Loop5EditPart.VISUAL_ID:
			return Loop_3314;
		case Open5EditPart.VISUAL_ID:
			return Open_3315;
		case Fetch5EditPart.VISUAL_ID:
			return Fetch_3316;
		case Close5EditPart.VISUAL_ID:
			return Close_3317;
		case CallProcedure5EditPart.VISUAL_ID:
			return CallProcedure_3318;
		case CallFunction5EditPart.VISUAL_ID:
			return CallFunction_3319;
		case Case6EditPart.VISUAL_ID:
			return Case_3320;
		case Insert6EditPart.VISUAL_ID:
			return Insert_3321;
		case Update6EditPart.VISUAL_ID:
			return Update_3322;
		case Delete6EditPart.VISUAL_ID:
			return Delete_3323;
		case Select6EditPart.VISUAL_ID:
			return Select_3324;
		case While6EditPart.VISUAL_ID:
			return While_3325;
		case For6EditPart.VISUAL_ID:
			return For_3326;
		case Loop6EditPart.VISUAL_ID:
			return Loop_3327;
		case Open6EditPart.VISUAL_ID:
			return Open_3328;
		case Fetch6EditPart.VISUAL_ID:
			return Fetch_3329;
		case Close6EditPart.VISUAL_ID:
			return Close_3330;
		case CallProcedure6EditPart.VISUAL_ID:
			return CallProcedure_3331;
		case CallFunction6EditPart.VISUAL_ID:
			return CallFunction_3332;
		case DataTypeEditPart.VISUAL_ID:
			return DataType_3333;
		case CollectionsEditPart.VISUAL_ID:
			return Collections_3334;
		case RecordsEditPart.VISUAL_ID:
			return Records_3335;
		case CursorEditPart.VISUAL_ID:
			return Cursor_3336;
		case DataType2EditPart.VISUAL_ID:
			return DataType_3337;
		case Collections2EditPart.VISUAL_ID:
			return Collections_3338;
		case Records2EditPart.VISUAL_ID:
			return Records_3339;
		case Cursor2EditPart.VISUAL_ID:
			return Cursor_3340;
		case DataType3EditPart.VISUAL_ID:
			return DataType_3026;
		case Collections3EditPart.VISUAL_ID:
			return Collections_3027;
		case Records3EditPart.VISUAL_ID:
			return Records_3028;
		case Cursor3EditPart.VISUAL_ID:
			return Cursor_3029;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		case OptionsTransitionEditPart.VISUAL_ID:
			return OptionsTransition_4003;
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
