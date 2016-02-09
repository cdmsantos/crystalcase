/*
 * 
 */
package crystal.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import crystal.Crystal;
import crystal.CrystalPackage;
import crystal.diagram.edit.parts.AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart;
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
import crystal.diagram.edit.parts.FunctionFunctionDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionParametersCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionReturnPartCompartmentEditPart;
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
import crystal.diagram.edit.parts.ProcedureProcedureDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureParametersCompartmentEditPart;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CrystalVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "br.ufpe.cin.crystalcase.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CrystalEditPart.MODEL_ID.equals(view.getType())) {
				return CrystalEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return crystal.diagram.part.CrystalVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				CrystalDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CrystalPackage.eINSTANCE.getCrystal().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Crystal) domainElement)) {
			return CrystalEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = crystal.diagram.part.CrystalVisualIDRegistry
				.getModelID(containerView);
		if (!CrystalEditPart.MODEL_ID.equals(containerModelID)
				&& !"crystal".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CrystalEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crystal.diagram.part.CrystalVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CrystalEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CrystalEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getProcedure().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getAnonymousBlock().isSuperTypeOf(
					domainElement.eClass())) {
				return AnonymousBlockEditPart.VISUAL_ID;
			}
			break;
		case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(
					domainElement.eClass())) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(
					domainElement.eClass())) {
				return CollectionsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(
					domainElement.eClass())) {
				return RecordsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(
					domainElement.eClass())) {
				return CursorEditPart.VISUAL_ID;
			}
			break;
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(
					domainElement.eClass())) {
				return ExceptionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(
					domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(
					domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(
					domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(
					domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(
					domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(
					domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(
					domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(
					domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(
					domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(
					domainElement.eClass())) {
				return DataType2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(
					domainElement.eClass())) {
				return Collections2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(
					domainElement.eClass())) {
				return Records2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(
					domainElement.eClass())) {
				return Cursor2EditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(
					domainElement.eClass())) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(
					domainElement.eClass())) {
				return CollectionsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(
					domainElement.eClass())) {
				return RecordsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(
					domainElement.eClass())) {
				return CursorEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(
					domainElement.eClass())) {
				return ExceptionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(
					domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(
					domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(
					domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(
					domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(
					domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(
					domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(
					domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(
					domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(
					domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(
					domainElement.eClass())) {
				return DataType3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(
					domainElement.eClass())) {
				return Collections3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(
					domainElement.eClass())) {
				return Records3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(
					domainElement.eClass())) {
				return Cursor3EditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(
					domainElement.eClass())) {
				return DataType4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(
					domainElement.eClass())) {
				return Collections4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(
					domainElement.eClass())) {
				return Records4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(
					domainElement.eClass())) {
				return Cursor4EditPart.VISUAL_ID;
			}
			break;
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(
					domainElement.eClass())) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(
					domainElement.eClass())) {
				return CollectionsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(
					domainElement.eClass())) {
				return RecordsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(
					domainElement.eClass())) {
				return CursorEditPart.VISUAL_ID;
			}
			break;
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(
					domainElement.eClass())) {
				return ExceptionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(
					domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(
					domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(
					domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(
					domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(
					domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(
					domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(
					domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(
					domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(
					domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(
					domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(
					domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(
					domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = crystal.diagram.part.CrystalVisualIDRegistry
				.getModelID(containerView);
		if (!CrystalEditPart.MODEL_ID.equals(containerModelID)
				&& !"crystal".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CrystalEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crystal.diagram.part.CrystalVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CrystalEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CrystalEditPart.VISUAL_ID:
			if (ProcedureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnonymousBlockEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcedureEditPart.VISUAL_ID:
			if (ProcedureNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionEditPart.VISUAL_ID:
			if (FunctionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnonymousBlockEditPart.VISUAL_ID:
			if (AnonymousBlockNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeEditPart.VISUAL_ID:
			if (DataTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionsEditPart.VISUAL_ID:
			if (CollectionsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecordsEditPart.VISUAL_ID:
			if (RecordsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CursorEditPart.VISUAL_ID:
			if (CursorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExceptionEditPart.VISUAL_ID:
			if (ExceptionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfEditPart.VISUAL_ID:
			if (IfDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseEditPart.VISUAL_ID:
			if (CaseDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InsertEditPart.VISUAL_ID:
			if (InsertDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateEditPart.VISUAL_ID:
			if (UpdateDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeleteEditPart.VISUAL_ID:
			if (DeleteDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectEditPart.VISUAL_ID:
			if (SelectDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileEditPart.VISUAL_ID:
			if (WhileDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEditPart.VISUAL_ID:
			if (ForDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopEditPart.VISUAL_ID:
			if (LoopDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpenEditPart.VISUAL_ID:
			if (OpenDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FetchEditPart.VISUAL_ID:
			if (FetchDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CloseEditPart.VISUAL_ID:
			if (CloseDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallProcedureEditPart.VISUAL_ID:
			if (CallProcedureDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallFunctionEditPart.VISUAL_ID:
			if (CallFunctionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataType2EditPart.VISUAL_ID:
			if (DataTypeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Collections2EditPart.VISUAL_ID:
			if (CollectionsName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Records2EditPart.VISUAL_ID:
			if (RecordsName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Cursor2EditPart.VISUAL_ID:
			if (CursorName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataType3EditPart.VISUAL_ID:
			if (DataTypeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Collections3EditPart.VISUAL_ID:
			if (CollectionsName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Records3EditPart.VISUAL_ID:
			if (RecordsName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Cursor3EditPart.VISUAL_ID:
			if (CursorName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataType4EditPart.VISUAL_ID:
			if (DataTypeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Collections4EditPart.VISUAL_ID:
			if (CollectionsName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Records4EditPart.VISUAL_ID:
			if (RecordsName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Cursor4EditPart.VISUAL_ID:
			if (CursorName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (DataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecordsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CursorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
			if (ExceptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InsertEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UpdateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FetchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
			if (DataType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Collections2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Records2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cursor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (DataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecordsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CursorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
			if (ExceptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InsertEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UpdateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FetchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
			if (DataType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Collections3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Records3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cursor3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
			if (DataType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Collections4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Records4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Cursor4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (DataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecordsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CursorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			if (ExceptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InsertEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UpdateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FetchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CloseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CrystalPackage.eINSTANCE.getTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Crystal element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CrystalEditPart.VISUAL_ID:
			return false;
		case DataTypeEditPart.VISUAL_ID:
		case CollectionsEditPart.VISUAL_ID:
		case RecordsEditPart.VISUAL_ID:
		case CursorEditPart.VISUAL_ID:
		case ExceptionEditPart.VISUAL_ID:
		case IfEditPart.VISUAL_ID:
		case CaseEditPart.VISUAL_ID:
		case InsertEditPart.VISUAL_ID:
		case UpdateEditPart.VISUAL_ID:
		case DeleteEditPart.VISUAL_ID:
		case SelectEditPart.VISUAL_ID:
		case WhileEditPart.VISUAL_ID:
		case ForEditPart.VISUAL_ID:
		case LoopEditPart.VISUAL_ID:
		case OpenEditPart.VISUAL_ID:
		case FetchEditPart.VISUAL_ID:
		case CloseEditPart.VISUAL_ID:
		case DataType2EditPart.VISUAL_ID:
		case Collections2EditPart.VISUAL_ID:
		case Records2EditPart.VISUAL_ID:
		case Cursor2EditPart.VISUAL_ID:
		case DataType3EditPart.VISUAL_ID:
		case Collections3EditPart.VISUAL_ID:
		case Records3EditPart.VISUAL_ID:
		case Cursor3EditPart.VISUAL_ID:
		case DataType4EditPart.VISUAL_ID:
		case Collections4EditPart.VISUAL_ID:
		case Records4EditPart.VISUAL_ID:
		case Cursor4EditPart.VISUAL_ID:
		case CallProcedureEditPart.VISUAL_ID:
		case CallFunctionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return crystal.diagram.part.CrystalVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return crystal.diagram.part.CrystalVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return crystal.diagram.part.CrystalVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return crystal.diagram.part.CrystalVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return crystal.diagram.part.CrystalVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return crystal.diagram.part.CrystalVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
