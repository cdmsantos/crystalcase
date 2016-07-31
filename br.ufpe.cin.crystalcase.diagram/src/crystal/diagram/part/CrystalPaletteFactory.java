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
		paletteContainer.add(createCase3CreationTool());
		paletteContainer.add(createClose4CreationTool());
		paletteContainer.add(createDelete5CreationTool());
		paletteContainer.add(createException6CreationTool());
		paletteContainer.add(createFetch7CreationTool());
		paletteContainer.add(createFor8CreationTool());
		paletteContainer.add(createIf9CreationTool());
		paletteContainer.add(createInsert10CreationTool());
		paletteContainer.add(createLoop11CreationTool());
		paletteContainer.add(createOpen12CreationTool());
		paletteContainer.add(createSelect13CreationTool());
		paletteContainer.add(createUpdate14CreationTool());
		paletteContainer.add(createWhile15CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
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
	 * @generated
	 */
	private ToolEntry createCallFunction1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.CallFunction_3070);
		types.add(CrystalElementTypes.CallFunction_3089);
		types.add(CrystalElementTypes.CallFunction_3051);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallFunction1CreationTool_title,
				Messages.CallFunction1CreationTool_desc, types);
		entry.setId("createCallFunction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallFunction_3070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallProcedure2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.CallProcedure_3069);
		types.add(CrystalElementTypes.CallProcedure_3088);
		types.add(CrystalElementTypes.CallProcedure_3050);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CallProcedure2CreationTool_title,
				Messages.CallProcedure2CreationTool_desc, types);
		entry.setId("createCallProcedure2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.CallProcedure_3069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCase3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Case_3058);
		types.add(CrystalElementTypes.Case_3077);
		types.add(CrystalElementTypes.Case_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Case3CreationTool_title,
				Messages.Case3CreationTool_desc, types);
		entry.setId("createCase3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Case_3058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClose4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Close_3068);
		types.add(CrystalElementTypes.Close_3087);
		types.add(CrystalElementTypes.Close_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Close4CreationTool_title,
				Messages.Close4CreationTool_desc, types);
		entry.setId("createClose4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Close_3068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelete5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Delete_3061);
		types.add(CrystalElementTypes.Delete_3080);
		types.add(CrystalElementTypes.Delete_3042);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Delete5CreationTool_title,
				Messages.Delete5CreationTool_desc, types);
		entry.setId("createDelete5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Delete_3061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createException6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Exception_3056);
		types.add(CrystalElementTypes.Exception_3075);
		types.add(CrystalElementTypes.Exception_3037);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Exception6CreationTool_title,
				Messages.Exception6CreationTool_desc, types);
		entry.setId("createException6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Exception_3056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFetch7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Fetch_3067);
		types.add(CrystalElementTypes.Fetch_3086);
		types.add(CrystalElementTypes.Fetch_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Fetch7CreationTool_title,
				Messages.Fetch7CreationTool_desc, types);
		entry.setId("createFetch7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Fetch_3067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFor8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.For_3064);
		types.add(CrystalElementTypes.For_3083);
		types.add(CrystalElementTypes.For_3045);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.For8CreationTool_title,
				Messages.For8CreationTool_desc, types);
		entry.setId("createFor8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.For_3064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIf9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.If_3057);
		types.add(CrystalElementTypes.If_3076);
		types.add(CrystalElementTypes.If_3038);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.If9CreationTool_title,
				Messages.If9CreationTool_desc, types);
		entry.setId("createIf9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.If_3057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsert10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Insert_3059);
		types.add(CrystalElementTypes.Insert_3078);
		types.add(CrystalElementTypes.Insert_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Insert10CreationTool_title,
				Messages.Insert10CreationTool_desc, types);
		entry.setId("createInsert10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Insert_3059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoop11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Loop_3065);
		types.add(CrystalElementTypes.Loop_3084);
		types.add(CrystalElementTypes.Loop_3046);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Loop11CreationTool_title,
				Messages.Loop11CreationTool_desc, types);
		entry.setId("createLoop11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Loop_3065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpen12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Open_3066);
		types.add(CrystalElementTypes.Open_3085);
		types.add(CrystalElementTypes.Open_3047);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Open12CreationTool_title,
				Messages.Open12CreationTool_desc, types);
		entry.setId("createOpen12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Open_3066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelect13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Select_3062);
		types.add(CrystalElementTypes.Select_3081);
		types.add(CrystalElementTypes.Select_3043);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Select13CreationTool_title,
				Messages.Select13CreationTool_desc, types);
		entry.setId("createSelect13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Select_3062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdate14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Update_3060);
		types.add(CrystalElementTypes.Update_3079);
		types.add(CrystalElementTypes.Update_3041);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Update14CreationTool_title,
				Messages.Update14CreationTool_desc, types);
		entry.setId("createUpdate14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Update_3060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWhile15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.While_3063);
		types.add(CrystalElementTypes.While_3082);
		types.add(CrystalElementTypes.While_3044);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.While15CreationTool_title,
				Messages.While15CreationTool_desc, types);
		entry.setId("createWhile15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.While_3063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Transition1CreationTool_title,
				Messages.Transition1CreationTool_desc, Collections.singletonList(CrystalElementTypes.Transition_4001));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
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
		types.add(CrystalElementTypes.DataType_3018);
		types.add(CrystalElementTypes.DataType_3052);
		types.add(CrystalElementTypes.DataType_3022);
		types.add(CrystalElementTypes.DataType_3026);
		types.add(CrystalElementTypes.DataType_3071);
		types.add(CrystalElementTypes.DataType_3033);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataType1CreationTool_title,
				Messages.DataType1CreationTool_desc, types);
		entry.setId("createDataType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.DataType_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollections2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Collections_3019);
		types.add(CrystalElementTypes.Collections_3053);
		types.add(CrystalElementTypes.Collections_3023);
		types.add(CrystalElementTypes.Collections_3027);
		types.add(CrystalElementTypes.Collections_3072);
		types.add(CrystalElementTypes.Collections_3034);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Collections2CreationTool_title,
				Messages.Collections2CreationTool_desc, types);
		entry.setId("createCollections2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Collections_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecords3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Records_3020);
		types.add(CrystalElementTypes.Records_3054);
		types.add(CrystalElementTypes.Records_3024);
		types.add(CrystalElementTypes.Records_3028);
		types.add(CrystalElementTypes.Records_3073);
		types.add(CrystalElementTypes.Records_3035);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Records3CreationTool_title,
				Messages.Records3CreationTool_desc, types);
		entry.setId("createRecords3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Records_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCursor4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(CrystalElementTypes.Cursor_3021);
		types.add(CrystalElementTypes.Cursor_3055);
		types.add(CrystalElementTypes.Cursor_3025);
		types.add(CrystalElementTypes.Cursor_3029);
		types.add(CrystalElementTypes.Cursor_3074);
		types.add(CrystalElementTypes.Cursor_3036);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Cursor4CreationTool_title,
				Messages.Cursor4CreationTool_desc, types);
		entry.setId("createCursor4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrystalElementTypes.getImageDescriptor(CrystalElementTypes.Cursor_3021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
