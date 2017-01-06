
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
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnonymousBlock1CreationTool());
		paletteContainer.add(createCallFunction2CreationTool());
		paletteContainer.add(createCallProcedure3CreationTool());
		paletteContainer.add(createCase4CreationTool());
		paletteContainer.add(createClose5CreationTool());
		paletteContainer.add(createCollections6CreationTool());
		paletteContainer.add(createCursor7CreationTool());
		paletteContainer.add(createDataType8CreationTool());
		paletteContainer.add(createDelete9CreationTool());
		paletteContainer.add(createException10CreationTool());
		paletteContainer.add(createExpression11CreationTool());
		paletteContainer.add(createFetch12CreationTool());
		paletteContainer.add(createFor13CreationTool());
		paletteContainer.add(createFunction14CreationTool());
		paletteContainer.add(createIf15CreationTool());
		paletteContainer.add(createInsert16CreationTool());
		paletteContainer.add(createLoop17CreationTool());
		paletteContainer.add(createOpen18CreationTool());
		paletteContainer.add(createOptions19CreationTool());
		paletteContainer.add(createProcedure20CreationTool());
		paletteContainer.add(createRecords21CreationTool());
		paletteContainer.add(createSelect22CreationTool());
		paletteContainer.add(createUpdate23CreationTool());
		paletteContainer.add(createWhile24CreationTool());
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
	* @generated
	*/
	private ToolEntry createAnonymousBlock1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AnonymousBlock1CreationTool_title,
				Messages.AnonymousBlock1CreationTool_desc,
				Collections.singletonList(CrystalElementTypes.AnonymousBlock_2012));
		entry.setId("createAnonymousBlock1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.AnonymousBlock_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCallFunction2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.CallFunction_3273);
		types.add(CrystalElementTypes.CallFunction_3280);
		types.add(CrystalElementTypes.CallFunction_3290);
		types.add(CrystalElementTypes.CallFunction_3306);
		types.add(CrystalElementTypes.CallFunction_3319);
		types.add(CrystalElementTypes.CallFunction_3332);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallFunction2CreationTool_title,
				Messages.CallFunction2CreationTool_desc, types);
		entry.setId("createCallFunction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallFunction_3273));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCallProcedure3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.CallProcedure_3272);
		types.add(CrystalElementTypes.CallProcedure_3279);
		types.add(CrystalElementTypes.CallProcedure_3289);
		types.add(CrystalElementTypes.CallProcedure_3305);
		types.add(CrystalElementTypes.CallProcedure_3318);
		types.add(CrystalElementTypes.CallProcedure_3331);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallProcedure3CreationTool_title,
				Messages.CallProcedure3CreationTool_desc, types);
		entry.setId("createCallProcedure3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallProcedure_3272));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCase4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Case_3242);
		types.add(CrystalElementTypes.Case_3255);
		types.add(CrystalElementTypes.Case_3256);
		types.add(CrystalElementTypes.Case_3294);
		types.add(CrystalElementTypes.Case_3307);
		types.add(CrystalElementTypes.Case_3320);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Case4CreationTool_title,
				Messages.Case4CreationTool_desc, types);
		entry.setId("createCase4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Case_3242));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClose5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Close_3271);
		types.add(CrystalElementTypes.Close_3278);
		types.add(CrystalElementTypes.Close_3288);
		types.add(CrystalElementTypes.Close_3304);
		types.add(CrystalElementTypes.Close_3317);
		types.add(CrystalElementTypes.Close_3330);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Close5CreationTool_title,
				Messages.Close5CreationTool_desc, types);
		entry.setId("createClose5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Close_3271));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollections6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Collections_3334);
		types.add(CrystalElementTypes.Collections_3338);
		types.add(CrystalElementTypes.Collections_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Collections6CreationTool_title,
				Messages.Collections6CreationTool_desc, types);
		entry.setId("createCollections6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Collections_3334));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCursor7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Cursor_3336);
		types.add(CrystalElementTypes.Cursor_3340);
		types.add(CrystalElementTypes.Cursor_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Cursor7CreationTool_title,
				Messages.Cursor7CreationTool_desc, types);
		entry.setId("createCursor7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Cursor_3336));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataType8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.DataType_3333);
		types.add(CrystalElementTypes.DataType_3337);
		types.add(CrystalElementTypes.DataType_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataType8CreationTool_title,
				Messages.DataType8CreationTool_desc, types);
		entry.setId("createDataType8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.DataType_3333));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDelete9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Delete_3248);
		types.add(CrystalElementTypes.Delete_3259);
		types.add(CrystalElementTypes.Delete_3264);
		types.add(CrystalElementTypes.Delete_3297);
		types.add(CrystalElementTypes.Delete_3310);
		types.add(CrystalElementTypes.Delete_3323);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Delete9CreationTool_title,
				Messages.Delete9CreationTool_desc, types);
		entry.setId("createDelete9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Delete_3248));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createException10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Exception_3237);
		types.add(CrystalElementTypes.Exception_3240);
		types.add(CrystalElementTypes.Exception_3244);
		types.add(CrystalElementTypes.Exception_3252);
		types.add(CrystalElementTypes.Exception_3283);
		types.add(CrystalElementTypes.Exception_3292);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Exception10CreationTool_title,
				Messages.Exception10CreationTool_desc, types);
		entry.setId("createException10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Exception_3237));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExpression11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Expression_3236);
		types.add(CrystalElementTypes.Expression_3239);
		types.add(CrystalElementTypes.Expression_3243);
		types.add(CrystalElementTypes.Expression_3251);
		types.add(CrystalElementTypes.Expression_3282);
		types.add(CrystalElementTypes.Expression_3291);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Expression11CreationTool_title,
				Messages.Expression11CreationTool_desc, types);
		entry.setId("createExpression11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Expression_3236));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFetch12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Fetch_3270);
		types.add(CrystalElementTypes.Fetch_3277);
		types.add(CrystalElementTypes.Fetch_3287);
		types.add(CrystalElementTypes.Fetch_3303);
		types.add(CrystalElementTypes.Fetch_3316);
		types.add(CrystalElementTypes.Fetch_3329);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Fetch12CreationTool_title,
				Messages.Fetch12CreationTool_desc, types);
		entry.setId("createFetch12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Fetch_3270));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFor13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.For_3254);
		types.add(CrystalElementTypes.For_3267);
		types.add(CrystalElementTypes.For_3274);
		types.add(CrystalElementTypes.For_3300);
		types.add(CrystalElementTypes.For_3313);
		types.add(CrystalElementTypes.For_3326);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.For13CreationTool_title,
				Messages.For13CreationTool_desc, types);
		entry.setId("createFor13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.For_3254));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunction14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function14CreationTool_title,
				Messages.Function14CreationTool_desc, Collections.singletonList(CrystalElementTypes.Function_2011));
		entry.setId("createFunction14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Function_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIf15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.If_3238);
		types.add(CrystalElementTypes.If_3241);
		types.add(CrystalElementTypes.If_3245);
		types.add(CrystalElementTypes.If_3253);
		types.add(CrystalElementTypes.If_3284);
		types.add(CrystalElementTypes.If_3293);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.If15CreationTool_title,
				Messages.If15CreationTool_desc, types);
		entry.setId("createIf15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.If_3238));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInsert16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Insert_3246);
		types.add(CrystalElementTypes.Insert_3257);
		types.add(CrystalElementTypes.Insert_3262);
		types.add(CrystalElementTypes.Insert_3295);
		types.add(CrystalElementTypes.Insert_3308);
		types.add(CrystalElementTypes.Insert_3321);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Insert16CreationTool_title,
				Messages.Insert16CreationTool_desc, types);
		entry.setId("createInsert16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Insert_3246));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLoop17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Loop_3268);
		types.add(CrystalElementTypes.Loop_3275);
		types.add(CrystalElementTypes.Loop_3285);
		types.add(CrystalElementTypes.Loop_3301);
		types.add(CrystalElementTypes.Loop_3314);
		types.add(CrystalElementTypes.Loop_3327);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Loop17CreationTool_title,
				Messages.Loop17CreationTool_desc, types);
		entry.setId("createLoop17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Loop_3268));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOpen18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Open_3269);
		types.add(CrystalElementTypes.Open_3276);
		types.add(CrystalElementTypes.Open_3286);
		types.add(CrystalElementTypes.Open_3302);
		types.add(CrystalElementTypes.Open_3315);
		types.add(CrystalElementTypes.Open_3328);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Open18CreationTool_title,
				Messages.Open18CreationTool_desc, types);
		entry.setId("createOpen18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Open_3269));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOptions19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Options19CreationTool_title,
				Messages.Options19CreationTool_desc, Collections.singletonList(CrystalElementTypes.Options_3281));
		entry.setId("createOptions19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Options_3281));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProcedure20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Procedure20CreationTool_title,
				Messages.Procedure20CreationTool_desc, Collections.singletonList(CrystalElementTypes.Procedure_2010));
		entry.setId("createProcedure20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Procedure_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecords21CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Records_3335);
		types.add(CrystalElementTypes.Records_3339);
		types.add(CrystalElementTypes.Records_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Records21CreationTool_title,
				Messages.Records21CreationTool_desc, types);
		entry.setId("createRecords21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Records_3335));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelect22CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Select_3249);
		types.add(CrystalElementTypes.Select_3260);
		types.add(CrystalElementTypes.Select_3265);
		types.add(CrystalElementTypes.Select_3298);
		types.add(CrystalElementTypes.Select_3311);
		types.add(CrystalElementTypes.Select_3324);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Select22CreationTool_title,
				Messages.Select22CreationTool_desc, types);
		entry.setId("createSelect22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Select_3249));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUpdate23CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Update_3247);
		types.add(CrystalElementTypes.Update_3258);
		types.add(CrystalElementTypes.Update_3263);
		types.add(CrystalElementTypes.Update_3296);
		types.add(CrystalElementTypes.Update_3309);
		types.add(CrystalElementTypes.Update_3322);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Update23CreationTool_title,
				Messages.Update23CreationTool_desc, types);
		entry.setId("createUpdate23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Update_3247));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhile24CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.While_3250);
		types.add(CrystalElementTypes.While_3261);
		types.add(CrystalElementTypes.While_3266);
		types.add(CrystalElementTypes.While_3299);
		types.add(CrystalElementTypes.While_3312);
		types.add(CrystalElementTypes.While_3325);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.While24CreationTool_title,
				Messages.While24CreationTool_desc, types);
		entry.setId("createWhile24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.While_3250));
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

}
