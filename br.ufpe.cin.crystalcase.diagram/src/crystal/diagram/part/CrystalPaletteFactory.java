
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
		paletteContainer.add(createOptionsTransition1CreationTool());
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
		paletteContainer.add(createOptions3CreationTool());
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.CallFunction_3273);
		types.add(CrystalElementTypes.CallFunction_3280);
		types.add(CrystalElementTypes.CallFunction_3290);
		types.add(CrystalElementTypes.CallFunction_3306);
		types.add(CrystalElementTypes.CallFunction_3319);
		types.add(CrystalElementTypes.CallFunction_3332);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallFunction1CreationTool_title,
				Messages.CallFunction1CreationTool_desc, types);
		entry.setId("createCallFunction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallFunction_3273));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCallProcedure2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.CallProcedure_3272);
		types.add(CrystalElementTypes.CallProcedure_3279);
		types.add(CrystalElementTypes.CallProcedure_3289);
		types.add(CrystalElementTypes.CallProcedure_3305);
		types.add(CrystalElementTypes.CallProcedure_3318);
		types.add(CrystalElementTypes.CallProcedure_3331);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallProcedure2CreationTool_title,
				Messages.CallProcedure2CreationTool_desc, types);
		entry.setId("createCallProcedure2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallProcedure_3272));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDelete3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Delete_3248);
		types.add(CrystalElementTypes.Delete_3259);
		types.add(CrystalElementTypes.Delete_3264);
		types.add(CrystalElementTypes.Delete_3297);
		types.add(CrystalElementTypes.Delete_3310);
		types.add(CrystalElementTypes.Delete_3323);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Delete3CreationTool_title,
				Messages.Delete3CreationTool_desc, types);
		entry.setId("createDelete3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Delete_3248));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createException4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Exception_3237);
		types.add(CrystalElementTypes.Exception_3240);
		types.add(CrystalElementTypes.Exception_3244);
		types.add(CrystalElementTypes.Exception_3252);
		types.add(CrystalElementTypes.Exception_3283);
		types.add(CrystalElementTypes.Exception_3292);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Exception4CreationTool_title,
				Messages.Exception4CreationTool_desc, types);
		entry.setId("createException4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Exception_3237));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExpression5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Expression_3236);
		types.add(CrystalElementTypes.Expression_3239);
		types.add(CrystalElementTypes.Expression_3243);
		types.add(CrystalElementTypes.Expression_3251);
		types.add(CrystalElementTypes.Expression_3282);
		types.add(CrystalElementTypes.Expression_3291);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Expression5CreationTool_title,
				Messages.Expression5CreationTool_desc, types);
		entry.setId("createExpression5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Expression_3236));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInsert6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Insert_3246);
		types.add(CrystalElementTypes.Insert_3257);
		types.add(CrystalElementTypes.Insert_3262);
		types.add(CrystalElementTypes.Insert_3295);
		types.add(CrystalElementTypes.Insert_3308);
		types.add(CrystalElementTypes.Insert_3321);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Insert6CreationTool_title,
				Messages.Insert6CreationTool_desc, types);
		entry.setId("createInsert6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Insert_3246));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelect7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Select_3249);
		types.add(CrystalElementTypes.Select_3260);
		types.add(CrystalElementTypes.Select_3265);
		types.add(CrystalElementTypes.Select_3298);
		types.add(CrystalElementTypes.Select_3311);
		types.add(CrystalElementTypes.Select_3324);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Select7CreationTool_title,
				Messages.Select7CreationTool_desc, types);
		entry.setId("createSelect7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Select_3249));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUpdate8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Update_3247);
		types.add(CrystalElementTypes.Update_3258);
		types.add(CrystalElementTypes.Update_3263);
		types.add(CrystalElementTypes.Update_3296);
		types.add(CrystalElementTypes.Update_3309);
		types.add(CrystalElementTypes.Update_3322);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Update8CreationTool_title,
				Messages.Update8CreationTool_desc, types);
		entry.setId("createUpdate8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Update_3247));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOptionsTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.OptionsTransition1CreationTool_title,
				Messages.OptionsTransition1CreationTool_desc,
				Collections.singletonList(CrystalElementTypes.OptionsTransition_4003));
		entry.setId("createOptionsTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.OptionsTransition_4003));
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
				Messages.Procedure1CreationTool_desc, Collections.singletonList(CrystalElementTypes.Procedure_2010));
		entry.setId("createProcedure1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Procedure_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunction2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function2CreationTool_title,
				Messages.Function2CreationTool_desc, Collections.singletonList(CrystalElementTypes.Function_2011));
		entry.setId("createFunction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Function_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnonymousBlock3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AnonymousBlock3CreationTool_title,
				Messages.AnonymousBlock3CreationTool_desc,
				Collections.singletonList(CrystalElementTypes.AnonymousBlock_2012));
		entry.setId("createAnonymousBlock3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.AnonymousBlock_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataType1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.DataType_3333);
		types.add(CrystalElementTypes.DataType_3337);
		types.add(CrystalElementTypes.DataType_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataType1CreationTool_title,
				Messages.DataType1CreationTool_desc, types);
		entry.setId("createDataType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.DataType_3333));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollections2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Collections_3334);
		types.add(CrystalElementTypes.Collections_3338);
		types.add(CrystalElementTypes.Collections_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Collections2CreationTool_title,
				Messages.Collections2CreationTool_desc, types);
		entry.setId("createCollections2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Collections_3334));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecords3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Records_3335);
		types.add(CrystalElementTypes.Records_3339);
		types.add(CrystalElementTypes.Records_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Records3CreationTool_title,
				Messages.Records3CreationTool_desc, types);
		entry.setId("createRecords3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Records_3335));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCursor4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Cursor_3336);
		types.add(CrystalElementTypes.Cursor_3340);
		types.add(CrystalElementTypes.Cursor_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Cursor4CreationTool_title,
				Messages.Cursor4CreationTool_desc, types);
		entry.setId("createCursor4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Cursor_3336));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIf1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.If_3238);
		types.add(CrystalElementTypes.If_3241);
		types.add(CrystalElementTypes.If_3245);
		types.add(CrystalElementTypes.If_3253);
		types.add(CrystalElementTypes.If_3284);
		types.add(CrystalElementTypes.If_3293);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.If1CreationTool_title,
				Messages.If1CreationTool_desc, types);
		entry.setId("createIf1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.If_3238));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCase2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Case_3242);
		types.add(CrystalElementTypes.Case_3255);
		types.add(CrystalElementTypes.Case_3256);
		types.add(CrystalElementTypes.Case_3294);
		types.add(CrystalElementTypes.Case_3307);
		types.add(CrystalElementTypes.Case_3320);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Case2CreationTool_title,
				Messages.Case2CreationTool_desc, types);
		entry.setId("createCase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Case_3242));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOptions3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Options3CreationTool_title,
				Messages.Options3CreationTool_desc, Collections.singletonList(CrystalElementTypes.Options_3281));
		entry.setId("createOptions3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Options_3281));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhile1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.While_3250);
		types.add(CrystalElementTypes.While_3261);
		types.add(CrystalElementTypes.While_3266);
		types.add(CrystalElementTypes.While_3299);
		types.add(CrystalElementTypes.While_3312);
		types.add(CrystalElementTypes.While_3325);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.While1CreationTool_title,
				Messages.While1CreationTool_desc, types);
		entry.setId("createWhile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.While_3250));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLoop2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Loop_3268);
		types.add(CrystalElementTypes.Loop_3275);
		types.add(CrystalElementTypes.Loop_3285);
		types.add(CrystalElementTypes.Loop_3301);
		types.add(CrystalElementTypes.Loop_3314);
		types.add(CrystalElementTypes.Loop_3327);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Loop2CreationTool_title,
				Messages.Loop2CreationTool_desc, types);
		entry.setId("createLoop2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Loop_3268));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFor3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.For_3254);
		types.add(CrystalElementTypes.For_3267);
		types.add(CrystalElementTypes.For_3274);
		types.add(CrystalElementTypes.For_3300);
		types.add(CrystalElementTypes.For_3313);
		types.add(CrystalElementTypes.For_3326);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.For3CreationTool_title,
				Messages.For3CreationTool_desc, types);
		entry.setId("createFor3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.For_3254));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOpen1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Open_3269);
		types.add(CrystalElementTypes.Open_3276);
		types.add(CrystalElementTypes.Open_3286);
		types.add(CrystalElementTypes.Open_3302);
		types.add(CrystalElementTypes.Open_3315);
		types.add(CrystalElementTypes.Open_3328);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Open1CreationTool_title,
				Messages.Open1CreationTool_desc, types);
		entry.setId("createOpen1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Open_3269));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFetch2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Fetch_3270);
		types.add(CrystalElementTypes.Fetch_3277);
		types.add(CrystalElementTypes.Fetch_3287);
		types.add(CrystalElementTypes.Fetch_3303);
		types.add(CrystalElementTypes.Fetch_3316);
		types.add(CrystalElementTypes.Fetch_3329);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Fetch2CreationTool_title,
				Messages.Fetch2CreationTool_desc, types);
		entry.setId("createFetch2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Fetch_3270));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClose3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Close_3271);
		types.add(CrystalElementTypes.Close_3278);
		types.add(CrystalElementTypes.Close_3288);
		types.add(CrystalElementTypes.Close_3304);
		types.add(CrystalElementTypes.Close_3317);
		types.add(CrystalElementTypes.Close_3330);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Close3CreationTool_title,
				Messages.Close3CreationTool_desc, types);
		entry.setId("createClose3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Close_3271));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
