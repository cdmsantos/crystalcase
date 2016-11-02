/*
 * 
 */
package crystal.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class CrystalPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
		paletteRoot.add(createSubprograms3Group());
		paletteRoot.add(createParameters4Group());
		paletteRoot.add(createConditionalStructures5Group());
		paletteRoot.add(createRepetitionStructures6Group());
		paletteRoot.add(createCursorManipulation7Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCallFunction1CreationTool());
		paletteContainer.add(createCallProcedure2CreationTool());
		paletteContainer.add(createDelete3CreationTool());
		paletteContainer.add(createException4CreationTool());
		paletteContainer.add(createExpression5CreationTool());
		paletteContainer.add(createInsert6CreationTool());
		paletteContainer.add(createSelect7CreationTool());
		paletteContainer.add(createUpdate8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createSelectorTransition1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Subprograms" palette tool group
	 * @generated
	 */
	private PaletteContainer createSubprograms3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Subprograms3Group_title);
		paletteContainer.setId("createSubprograms3Group"); //$NON-NLS-1$
		paletteContainer.add(createProcedure1CreationTool());
		paletteContainer.add(createFunction2CreationTool());
		paletteContainer.add(createAnonymousBlock3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Parameters" palette tool group
	 * @generated
	 */
	private PaletteContainer createParameters4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Parameters4Group_title);
		paletteContainer.setId("createParameters4Group"); //$NON-NLS-1$
		paletteContainer.add(createDataType1CreationTool());
		paletteContainer.add(createCollections2CreationTool());
		paletteContainer.add(createRecords3CreationTool());
		paletteContainer.add(createCursor4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Conditional Structures" palette tool group
	* @generated
	*/
	private PaletteContainer createConditionalStructures5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ConditionalStructures5Group_title);
		paletteContainer.setId("createConditionalStructures5Group"); //$NON-NLS-1$
		paletteContainer.add(createIf1CreationTool());
		paletteContainer.add(createCase2CreationTool());
		paletteContainer.add(createSelector3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Repetition Structures" palette tool group
	* @generated
	*/
	private PaletteContainer createRepetitionStructures6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.RepetitionStructures6Group_title);
		paletteContainer.setId("createRepetitionStructures6Group"); //$NON-NLS-1$
		paletteContainer.add(createWhile1CreationTool());
		paletteContainer.add(createLoop2CreationTool());
		paletteContainer.add(createFor3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Cursor Manipulation" palette tool group
	* @generated
	*/
	private PaletteContainer createCursorManipulation7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.CursorManipulation7Group_title);
		paletteContainer.setId("createCursorManipulation7Group"); //$NON-NLS-1$
		paletteContainer.add(createOpen1CreationTool());
		paletteContainer.add(createFetch2CreationTool());
		paletteContainer.add(createClose3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallFunction1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.CallFunction_3195);
		types.add(CrystalElementTypes.CallFunction_3235);
		types.add(CrystalElementTypes.CallFunction_3104);
		types.add(CrystalElementTypes.CallFunction_3175);
		types.add(CrystalElementTypes.CallFunction_3180);
		types.add(CrystalElementTypes.CallFunction_3210);
		types.add(CrystalElementTypes.CallFunction_3150);
		types.add(CrystalElementTypes.CallFunction_3070);
		types.add(CrystalElementTypes.CallFunction_3089);
		types.add(CrystalElementTypes.CallFunction_3051);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallFunction1CreationTool_title,
				Messages.CallFunction1CreationTool_desc, types);
		entry.setId("createCallFunction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallFunction_3195));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallProcedure2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.CallProcedure_3194);
		types.add(CrystalElementTypes.CallProcedure_3234);
		types.add(CrystalElementTypes.CallProcedure_3103);
		types.add(CrystalElementTypes.CallProcedure_3174);
		types.add(CrystalElementTypes.CallProcedure_3179);
		types.add(CrystalElementTypes.CallProcedure_3209);
		types.add(CrystalElementTypes.CallProcedure_3149);
		types.add(CrystalElementTypes.CallProcedure_3069);
		types.add(CrystalElementTypes.CallProcedure_3088);
		types.add(CrystalElementTypes.CallProcedure_3050);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallProcedure2CreationTool_title,
				Messages.CallProcedure2CreationTool_desc, types);
		entry.setId("createCallProcedure2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallProcedure_3194));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDelete3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Delete_3186);
		types.add(CrystalElementTypes.Delete_3226);
		types.add(CrystalElementTypes.Delete_3201);
		types.add(CrystalElementTypes.Delete_3095);
		types.add(CrystalElementTypes.Delete_3158);
		types.add(CrystalElementTypes.Delete_3164);
		types.add(CrystalElementTypes.Delete_3141);
		types.add(CrystalElementTypes.Delete_3061);
		types.add(CrystalElementTypes.Delete_3080);
		types.add(CrystalElementTypes.Delete_3042);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Delete3CreationTool_title,
				Messages.Delete3CreationTool_desc, types);
		entry.setId("createDelete3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Delete_3186));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createException4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Exception_3056);
		types.add(CrystalElementTypes.Exception_3181);
		types.add(CrystalElementTypes.Exception_3221);
		types.add(CrystalElementTypes.Exception_3090);
		types.add(CrystalElementTypes.Exception_3151);
		types.add(CrystalElementTypes.Exception_3153);
		types.add(CrystalElementTypes.Exception_3196);
		types.add(CrystalElementTypes.Exception_3109);
		types.add(CrystalElementTypes.Exception_3075);
		types.add(CrystalElementTypes.Exception_3037);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Exception4CreationTool_title,
				Messages.Exception4CreationTool_desc, types);
		entry.setId("createException4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Exception_3056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExpression5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Expression_3217);
		types.add(CrystalElementTypes.Expression_3211);
		types.add(CrystalElementTypes.Expression_3220);
		types.add(CrystalElementTypes.Expression_3212);
		types.add(CrystalElementTypes.Expression_3214);
		types.add(CrystalElementTypes.Expression_3213);
		types.add(CrystalElementTypes.Expression_3215);
		types.add(CrystalElementTypes.Expression_3216);
		types.add(CrystalElementTypes.Expression_3218);
		types.add(CrystalElementTypes.Expression_3219);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Expression5CreationTool_title,
				Messages.Expression5CreationTool_desc, types);
		entry.setId("createExpression5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Expression_3217));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInsert6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Insert_3184);
		types.add(CrystalElementTypes.Insert_3224);
		types.add(CrystalElementTypes.Insert_3199);
		types.add(CrystalElementTypes.Insert_3093);
		types.add(CrystalElementTypes.Insert_3156);
		types.add(CrystalElementTypes.Insert_3162);
		types.add(CrystalElementTypes.Insert_3139);
		types.add(CrystalElementTypes.Insert_3059);
		types.add(CrystalElementTypes.Insert_3078);
		types.add(CrystalElementTypes.Insert_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Insert6CreationTool_title,
				Messages.Insert6CreationTool_desc, types);
		entry.setId("createInsert6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Insert_3184));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelect7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Select_3187);
		types.add(CrystalElementTypes.Select_3227);
		types.add(CrystalElementTypes.Select_3202);
		types.add(CrystalElementTypes.Select_3096);
		types.add(CrystalElementTypes.Select_3159);
		types.add(CrystalElementTypes.Select_3165);
		types.add(CrystalElementTypes.Select_3142);
		types.add(CrystalElementTypes.Select_3062);
		types.add(CrystalElementTypes.Select_3081);
		types.add(CrystalElementTypes.Select_3043);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Select7CreationTool_title,
				Messages.Select7CreationTool_desc, types);
		entry.setId("createSelect7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Select_3187));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUpdate8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Update_3185);
		types.add(CrystalElementTypes.Update_3225);
		types.add(CrystalElementTypes.Update_3200);
		types.add(CrystalElementTypes.Update_3094);
		types.add(CrystalElementTypes.Update_3157);
		types.add(CrystalElementTypes.Update_3163);
		types.add(CrystalElementTypes.Update_3140);
		types.add(CrystalElementTypes.Update_3060);
		types.add(CrystalElementTypes.Update_3079);
		types.add(CrystalElementTypes.Update_3041);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Update8CreationTool_title,
				Messages.Update8CreationTool_desc, types);
		entry.setId("createUpdate8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Update_3185));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelectorTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SelectorTransition1CreationTool_title,
				Messages.SelectorTransition1CreationTool_desc,
				Collections.singletonList(CrystalElementTypes.SelectorTransition_4002));
		entry.setId("createSelectorTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.SelectorTransition_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransition2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Transition2CreationTool_title,
				Messages.Transition2CreationTool_desc, Collections.singletonList(CrystalElementTypes.Transition_4001));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcedure1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Procedure1CreationTool_title,
				Messages.Procedure1CreationTool_desc, Collections.singletonList(CrystalElementTypes.Procedure_2007));
		entry.setId("createProcedure1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Procedure_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFunction2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function2CreationTool_title,
				Messages.Function2CreationTool_desc, Collections.singletonList(CrystalElementTypes.Function_2008));
		entry.setId("createFunction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Function_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnonymousBlock3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AnonymousBlock3CreationTool_title,
				Messages.AnonymousBlock3CreationTool_desc,
				Collections.singletonList(CrystalElementTypes.AnonymousBlock_2009));
		entry.setId("createAnonymousBlock3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.AnonymousBlock_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataType1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.DataType_3052);
		types.add(CrystalElementTypes.DataType_3018);
		types.add(CrystalElementTypes.DataType_3071);
		types.add(CrystalElementTypes.DataType_3022);
		types.add(CrystalElementTypes.DataType_3026);
		types.add(CrystalElementTypes.DataType_3033);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataType1CreationTool_title,
				Messages.DataType1CreationTool_desc, types);
		entry.setId("createDataType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.DataType_3052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollections2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Collections_3053);
		types.add(CrystalElementTypes.Collections_3019);
		types.add(CrystalElementTypes.Collections_3072);
		types.add(CrystalElementTypes.Collections_3023);
		types.add(CrystalElementTypes.Collections_3027);
		types.add(CrystalElementTypes.Collections_3034);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Collections2CreationTool_title,
				Messages.Collections2CreationTool_desc, types);
		entry.setId("createCollections2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Collections_3053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecords3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Records_3054);
		types.add(CrystalElementTypes.Records_3020);
		types.add(CrystalElementTypes.Records_3073);
		types.add(CrystalElementTypes.Records_3024);
		types.add(CrystalElementTypes.Records_3028);
		types.add(CrystalElementTypes.Records_3035);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Records3CreationTool_title,
				Messages.Records3CreationTool_desc, types);
		entry.setId("createRecords3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Records_3054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCursor4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Cursor_3055);
		types.add(CrystalElementTypes.Cursor_3021);
		types.add(CrystalElementTypes.Cursor_3074);
		types.add(CrystalElementTypes.Cursor_3025);
		types.add(CrystalElementTypes.Cursor_3029);
		types.add(CrystalElementTypes.Cursor_3036);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Cursor4CreationTool_title,
				Messages.Cursor4CreationTool_desc, types);
		entry.setId("createCursor4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Cursor_3055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIf1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.If_3057);
		types.add(CrystalElementTypes.If_3182);
		types.add(CrystalElementTypes.If_3222);
		types.add(CrystalElementTypes.If_3091);
		types.add(CrystalElementTypes.If_3152);
		types.add(CrystalElementTypes.If_3154);
		types.add(CrystalElementTypes.If_3197);
		types.add(CrystalElementTypes.If_3110);
		types.add(CrystalElementTypes.If_3076);
		types.add(CrystalElementTypes.If_3038);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.If1CreationTool_title,
				Messages.If1CreationTool_desc, types);
		entry.setId("createIf1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.If_3057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCase2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Case_3183);
		types.add(CrystalElementTypes.Case_3198);
		types.add(CrystalElementTypes.Case_3223);
		types.add(CrystalElementTypes.Case_3092);
		types.add(CrystalElementTypes.Case_3155);
		types.add(CrystalElementTypes.Case_3161);
		types.add(CrystalElementTypes.Case_3138);
		types.add(CrystalElementTypes.Case_3058);
		types.add(CrystalElementTypes.Case_3077);
		types.add(CrystalElementTypes.Case_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Case2CreationTool_title,
				Messages.Case2CreationTool_desc, types);
		entry.setId("createCase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Case_3183));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelector3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Selector3CreationTool_title,
				Messages.Selector3CreationTool_desc, Collections.singletonList(CrystalElementTypes.Selector_3108));
		entry.setId("createSelector3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Selector_3108));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhile1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.While_3188);
		types.add(CrystalElementTypes.While_3228);
		types.add(CrystalElementTypes.While_3203);
		types.add(CrystalElementTypes.While_3097);
		types.add(CrystalElementTypes.While_3160);
		types.add(CrystalElementTypes.While_3166);
		types.add(CrystalElementTypes.While_3143);
		types.add(CrystalElementTypes.While_3063);
		types.add(CrystalElementTypes.While_3082);
		types.add(CrystalElementTypes.While_3044);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.While1CreationTool_title,
				Messages.While1CreationTool_desc, types);
		entry.setId("createWhile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.While_3188));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLoop2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Loop_3190);
		types.add(CrystalElementTypes.Loop_3230);
		types.add(CrystalElementTypes.Loop_3099);
		types.add(CrystalElementTypes.Loop_3169);
		types.add(CrystalElementTypes.Loop_3170);
		types.add(CrystalElementTypes.Loop_3205);
		types.add(CrystalElementTypes.Loop_3145);
		types.add(CrystalElementTypes.Loop_3065);
		types.add(CrystalElementTypes.Loop_3084);
		types.add(CrystalElementTypes.Loop_3046);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Loop2CreationTool_title,
				Messages.Loop2CreationTool_desc, types);
		entry.setId("createLoop2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Loop_3190));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFor3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.For_3189);
		types.add(CrystalElementTypes.For_3229);
		types.add(CrystalElementTypes.For_3098);
		types.add(CrystalElementTypes.For_3167);
		types.add(CrystalElementTypes.For_3168);
		types.add(CrystalElementTypes.For_3204);
		types.add(CrystalElementTypes.For_3144);
		types.add(CrystalElementTypes.For_3064);
		types.add(CrystalElementTypes.For_3083);
		types.add(CrystalElementTypes.For_3045);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.For3CreationTool_title,
				Messages.For3CreationTool_desc, types);
		entry.setId("createFor3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.For_3189));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOpen1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Open_3191);
		types.add(CrystalElementTypes.Open_3231);
		types.add(CrystalElementTypes.Open_3100);
		types.add(CrystalElementTypes.Open_3171);
		types.add(CrystalElementTypes.Open_3176);
		types.add(CrystalElementTypes.Open_3206);
		types.add(CrystalElementTypes.Open_3146);
		types.add(CrystalElementTypes.Open_3066);
		types.add(CrystalElementTypes.Open_3085);
		types.add(CrystalElementTypes.Open_3047);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Open1CreationTool_title,
				Messages.Open1CreationTool_desc, types);
		entry.setId("createOpen1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Open_3191));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFetch2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Fetch_3192);
		types.add(CrystalElementTypes.Fetch_3232);
		types.add(CrystalElementTypes.Fetch_3101);
		types.add(CrystalElementTypes.Fetch_3172);
		types.add(CrystalElementTypes.Fetch_3177);
		types.add(CrystalElementTypes.Fetch_3207);
		types.add(CrystalElementTypes.Fetch_3147);
		types.add(CrystalElementTypes.Fetch_3067);
		types.add(CrystalElementTypes.Fetch_3086);
		types.add(CrystalElementTypes.Fetch_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Fetch2CreationTool_title,
				Messages.Fetch2CreationTool_desc, types);
		entry.setId("createFetch2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Fetch_3192));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClose3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CrystalElementTypes.Close_3193);
		types.add(CrystalElementTypes.Close_3233);
		types.add(CrystalElementTypes.Close_3102);
		types.add(CrystalElementTypes.Close_3173);
		types.add(CrystalElementTypes.Close_3178);
		types.add(CrystalElementTypes.Close_3208);
		types.add(CrystalElementTypes.Close_3148);
		types.add(CrystalElementTypes.Close_3068);
		types.add(CrystalElementTypes.Close_3087);
		types.add(CrystalElementTypes.Close_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Close3CreationTool_title,
				Messages.Close3CreationTool_desc, types);
		entry.setId("createClose3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Close_3193));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
