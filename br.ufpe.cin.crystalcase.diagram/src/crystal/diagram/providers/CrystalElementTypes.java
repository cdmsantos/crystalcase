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
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.CloseEditPart;
import crystal.diagram.edit.parts.Collections2EditPart;
import crystal.diagram.edit.parts.Collections3EditPart;
import crystal.diagram.edit.parts.Collections4EditPart;
import crystal.diagram.edit.parts.CollectionsEditPart;
import crystal.diagram.edit.parts.CrystalEditPart;
import crystal.diagram.edit.parts.Cursor2EditPart;
import crystal.diagram.edit.parts.Cursor3EditPart;
import crystal.diagram.edit.parts.Cursor4EditPart;
import crystal.diagram.edit.parts.CursorEditPart;
import crystal.diagram.edit.parts.DataType2EditPart;
import crystal.diagram.edit.parts.DataType3EditPart;
import crystal.diagram.edit.parts.DataType4EditPart;
import crystal.diagram.edit.parts.DataTypeEditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.FunctionEditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.ProcedureEditPart;
import crystal.diagram.edit.parts.Records2EditPart;
import crystal.diagram.edit.parts.Records3EditPart;
import crystal.diagram.edit.parts.Records4EditPart;
import crystal.diagram.edit.parts.RecordsEditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.TransitionEditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
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
			CrystalDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

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
	public static final IElementType Procedure_2001 = getElementType("br.ufpe.cin.crystalcase.diagram.Procedure_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Function_2002 = getElementType("br.ufpe.cin.crystalcase.diagram.Function_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnonymousBlock_2003 = getElementType("br.ufpe.cin.crystalcase.diagram.AnonymousBlock_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataType_3001 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collections_3002 = getElementType("br.ufpe.cin.crystalcase.diagram.Collections_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Records_3003 = getElementType("br.ufpe.cin.crystalcase.diagram.Records_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cursor_3004 = getElementType("br.ufpe.cin.crystalcase.diagram.Cursor_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Exception_3005 = getElementType("br.ufpe.cin.crystalcase.diagram.Exception_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_3006 = getElementType("br.ufpe.cin.crystalcase.diagram.If_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Case_3007 = getElementType("br.ufpe.cin.crystalcase.diagram.Case_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Insert_3008 = getElementType("br.ufpe.cin.crystalcase.diagram.Insert_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Update_3009 = getElementType("br.ufpe.cin.crystalcase.diagram.Update_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Delete_3010 = getElementType("br.ufpe.cin.crystalcase.diagram.Delete_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Select_3011 = getElementType("br.ufpe.cin.crystalcase.diagram.Select_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType While_3012 = getElementType("br.ufpe.cin.crystalcase.diagram.While_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType For_3013 = getElementType("br.ufpe.cin.crystalcase.diagram.For_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Loop_3014 = getElementType("br.ufpe.cin.crystalcase.diagram.Loop_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Open_3015 = getElementType("br.ufpe.cin.crystalcase.diagram.Open_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fetch_3016 = getElementType("br.ufpe.cin.crystalcase.diagram.Fetch_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Close_3017 = getElementType("br.ufpe.cin.crystalcase.diagram.Close_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CallProcedure_3031 = getElementType("br.ufpe.cin.crystalcase.diagram.CallProcedure_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallFunction_3032 = getElementType("br.ufpe.cin.crystalcase.diagram.CallFunction_3032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataType_3018 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collections_3019 = getElementType("br.ufpe.cin.crystalcase.diagram.Collections_3019"); //$NON-NLS-1$
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
	public static final IElementType DataType_3022 = getElementType("br.ufpe.cin.crystalcase.diagram.DataType_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collections_3023 = getElementType("br.ufpe.cin.crystalcase.diagram.Collections_3023"); //$NON-NLS-1$
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
	public static final IElementType Collections_3027 = getElementType("br.ufpe.cin.crystalcase.diagram.Collections_3027"); //$NON-NLS-1$
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
	public static final IElementType Transition_4001 = getElementType("br.ufpe.cin.crystalcase.diagram.Transition_4001"); //$NON-NLS-1$

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

			elements.put(Procedure_2001,
					CrystalPackage.eINSTANCE.getProcedure());

			elements.put(Function_2002, CrystalPackage.eINSTANCE.getFunction());

			elements.put(AnonymousBlock_2003,
					CrystalPackage.eINSTANCE.getAnonymousBlock());

			elements.put(DataType_3001, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3002,
					CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3003, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3004, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Exception_3005,
					CrystalPackage.eINSTANCE.getException());

			elements.put(If_3006, CrystalPackage.eINSTANCE.getIf());

			elements.put(Case_3007, CrystalPackage.eINSTANCE.getCase());

			elements.put(Insert_3008, CrystalPackage.eINSTANCE.getInsert());

			elements.put(Update_3009, CrystalPackage.eINSTANCE.getUpdate());

			elements.put(Delete_3010, CrystalPackage.eINSTANCE.getDelete());

			elements.put(Select_3011, CrystalPackage.eINSTANCE.getSelect());

			elements.put(While_3012, CrystalPackage.eINSTANCE.getWhile());

			elements.put(For_3013, CrystalPackage.eINSTANCE.getFor());

			elements.put(Loop_3014, CrystalPackage.eINSTANCE.getLoop());

			elements.put(Open_3015, CrystalPackage.eINSTANCE.getOpen());

			elements.put(Fetch_3016, CrystalPackage.eINSTANCE.getFetch());

			elements.put(Close_3017, CrystalPackage.eINSTANCE.getClose());

			elements.put(CallProcedure_3031,
					CrystalPackage.eINSTANCE.getCallProcedure());

			elements.put(CallFunction_3032,
					CrystalPackage.eINSTANCE.getCallFunction());

			elements.put(DataType_3018, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3019,
					CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3020, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3021, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3022, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3023,
					CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3024, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3025, CrystalPackage.eINSTANCE.getCursor());

			elements.put(DataType_3026, CrystalPackage.eINSTANCE.getDataType());

			elements.put(Collections_3027,
					CrystalPackage.eINSTANCE.getCollections());

			elements.put(Records_3028, CrystalPackage.eINSTANCE.getRecords());

			elements.put(Cursor_3029, CrystalPackage.eINSTANCE.getCursor());

			elements.put(Transition_4001,
					CrystalPackage.eINSTANCE.getTransition());
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
			KNOWN_ELEMENT_TYPES.add(Procedure_2001);
			KNOWN_ELEMENT_TYPES.add(Function_2002);
			KNOWN_ELEMENT_TYPES.add(AnonymousBlock_2003);
			KNOWN_ELEMENT_TYPES.add(DataType_3001);
			KNOWN_ELEMENT_TYPES.add(Collections_3002);
			KNOWN_ELEMENT_TYPES.add(Records_3003);
			KNOWN_ELEMENT_TYPES.add(Cursor_3004);
			KNOWN_ELEMENT_TYPES.add(Exception_3005);
			KNOWN_ELEMENT_TYPES.add(If_3006);
			KNOWN_ELEMENT_TYPES.add(Case_3007);
			KNOWN_ELEMENT_TYPES.add(Insert_3008);
			KNOWN_ELEMENT_TYPES.add(Update_3009);
			KNOWN_ELEMENT_TYPES.add(Delete_3010);
			KNOWN_ELEMENT_TYPES.add(Select_3011);
			KNOWN_ELEMENT_TYPES.add(While_3012);
			KNOWN_ELEMENT_TYPES.add(For_3013);
			KNOWN_ELEMENT_TYPES.add(Loop_3014);
			KNOWN_ELEMENT_TYPES.add(Open_3015);
			KNOWN_ELEMENT_TYPES.add(Fetch_3016);
			KNOWN_ELEMENT_TYPES.add(Close_3017);
			KNOWN_ELEMENT_TYPES.add(CallProcedure_3031);
			KNOWN_ELEMENT_TYPES.add(CallFunction_3032);
			KNOWN_ELEMENT_TYPES.add(DataType_3018);
			KNOWN_ELEMENT_TYPES.add(Collections_3019);
			KNOWN_ELEMENT_TYPES.add(Records_3020);
			KNOWN_ELEMENT_TYPES.add(Cursor_3021);
			KNOWN_ELEMENT_TYPES.add(DataType_3022);
			KNOWN_ELEMENT_TYPES.add(Collections_3023);
			KNOWN_ELEMENT_TYPES.add(Records_3024);
			KNOWN_ELEMENT_TYPES.add(Cursor_3025);
			KNOWN_ELEMENT_TYPES.add(DataType_3026);
			KNOWN_ELEMENT_TYPES.add(Collections_3027);
			KNOWN_ELEMENT_TYPES.add(Records_3028);
			KNOWN_ELEMENT_TYPES.add(Cursor_3029);
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
			return Procedure_2001;
		case FunctionEditPart.VISUAL_ID:
			return Function_2002;
		case AnonymousBlockEditPart.VISUAL_ID:
			return AnonymousBlock_2003;
		case DataTypeEditPart.VISUAL_ID:
			return DataType_3001;
		case CollectionsEditPart.VISUAL_ID:
			return Collections_3002;
		case RecordsEditPart.VISUAL_ID:
			return Records_3003;
		case CursorEditPart.VISUAL_ID:
			return Cursor_3004;
		case ExceptionEditPart.VISUAL_ID:
			return Exception_3005;
		case IfEditPart.VISUAL_ID:
			return If_3006;
		case CaseEditPart.VISUAL_ID:
			return Case_3007;
		case InsertEditPart.VISUAL_ID:
			return Insert_3008;
		case UpdateEditPart.VISUAL_ID:
			return Update_3009;
		case DeleteEditPart.VISUAL_ID:
			return Delete_3010;
		case SelectEditPart.VISUAL_ID:
			return Select_3011;
		case WhileEditPart.VISUAL_ID:
			return While_3012;
		case ForEditPart.VISUAL_ID:
			return For_3013;
		case LoopEditPart.VISUAL_ID:
			return Loop_3014;
		case OpenEditPart.VISUAL_ID:
			return Open_3015;
		case FetchEditPart.VISUAL_ID:
			return Fetch_3016;
		case CloseEditPart.VISUAL_ID:
			return Close_3017;
		case CallProcedureEditPart.VISUAL_ID:
			return CallProcedure_3031;
		case CallFunctionEditPart.VISUAL_ID:
			return CallFunction_3032;
		case DataType2EditPart.VISUAL_ID:
			return DataType_3018;
		case Collections2EditPart.VISUAL_ID:
			return Collections_3019;
		case Records2EditPart.VISUAL_ID:
			return Records_3020;
		case Cursor2EditPart.VISUAL_ID:
			return Cursor_3021;
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
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return crystal.diagram.providers.CrystalElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return crystal.diagram.providers.CrystalElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return crystal.diagram.providers.CrystalElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
