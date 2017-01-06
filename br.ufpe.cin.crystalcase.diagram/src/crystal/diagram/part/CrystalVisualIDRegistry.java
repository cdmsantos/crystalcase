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
import crystal.diagram.edit.parts.*;

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
		return crystal.diagram.part.CrystalVisualIDRegistry.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CrystalDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
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
		if (CrystalPackage.eINSTANCE.getCrystal().isSuperTypeOf(domainElement.eClass())
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
		String containerModelID = crystal.diagram.part.CrystalVisualIDRegistry.getModelID(containerView);
		if (!CrystalEditPart.MODEL_ID.equals(containerModelID) && !"crystal".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CrystalEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crystal.diagram.part.CrystalVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CrystalEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CrystalEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getProcedure().isSuperTypeOf(domainElement.eClass())) {
				return ProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getAnonymousBlock().isSuperTypeOf(domainElement.eClass())) {
				return AnonymousBlockEditPart.VISUAL_ID;
			}
			break;
		case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(domainElement.eClass())) {
				return CollectionsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(domainElement.eClass())) {
				return RecordsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(domainElement.eClass())) {
				return CursorEditPart.VISUAL_ID;
			}
			break;
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return ExpressionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return ExceptionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction6EditPart.VISUAL_ID;
			}
			break;
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return DataType2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(domainElement.eClass())) {
				return Collections2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(domainElement.eClass())) {
				return Records2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(domainElement.eClass())) {
				return Cursor2EditPart.VISUAL_ID;
			}
			break;
		case IfIfTrue_statementsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction3EditPart.VISUAL_ID;
			}
			break;
		case IfIfFalse_statementsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction4EditPart.VISUAL_ID;
			}
			break;
		case IfIfTrue_statementsCompartment2EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction3EditPart.VISUAL_ID;
			}
			break;
		case IfIfFalse_statementsCompartment2EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction4EditPart.VISUAL_ID;
			}
			break;
		case CaseCaseOptionsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getOptions().isSuperTypeOf(domainElement.eClass())) {
				return OptionsEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction2EditPart.VISUAL_ID;
			}
			break;
		case IfIfTrue_statementsCompartment3EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction3EditPart.VISUAL_ID;
			}
			break;
		case IfIfFalse_statementsCompartment3EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction4EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case IfIfTrue_statementsCompartment4EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction3EditPart.VISUAL_ID;
			}
			break;
		case IfIfFalse_statementsCompartment4EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction4EditPart.VISUAL_ID;
			}
			break;
		case ForForInterations_statementsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseOptionsCompartment2EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getOptions().isSuperTypeOf(domainElement.eClass())) {
				return OptionsEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction2EditPart.VISUAL_ID;
			}
			break;
		case CaseCaseOptionsCompartment3EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getOptions().isSuperTypeOf(domainElement.eClass())) {
				return OptionsEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction2EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case ForForInterations_statementsCompartment2EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case ForForInterations_statementsCompartment3EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure5EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction5EditPart.VISUAL_ID;
			}
			break;
		case IfIfTrue_statementsCompartment5EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction3EditPart.VISUAL_ID;
			}
			break;
		case IfIfFalse_statementsCompartment5EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction4EditPart.VISUAL_ID;
			}
			break;
		case LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case IfIfTrue_statementsCompartment6EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return CaseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return InsertEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return UpdateEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return DeleteEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return ForEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction3EditPart.VISUAL_ID;
			}
			break;
		case IfIfFalse_statementsCompartment6EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction4EditPart.VISUAL_ID;
			}
			break;
		case CaseCaseOptionsCompartment4EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getOptions().isSuperTypeOf(domainElement.eClass())) {
				return OptionsEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction2EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case ForForInterations_statementsCompartment4EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseOptionsCompartment5EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getOptions().isSuperTypeOf(domainElement.eClass())) {
				return OptionsEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction2EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case ForForInterations_statementsCompartment5EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseOptionsCompartment6EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getOptions().isSuperTypeOf(domainElement.eClass())) {
				return OptionsEditPart.VISUAL_ID;
			}
			break;
		case CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction2EditPart.VISUAL_ID;
			}
			break;
		case WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case ForForInterations_statementsCompartment6EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return Expression4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return Exception4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return If4EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return LoopEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return OpenEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return FetchEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return CloseEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedureEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunctionEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(domainElement.eClass())) {
				return CollectionsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(domainElement.eClass())) {
				return RecordsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(domainElement.eClass())) {
				return CursorEditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return ExpressionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return ExceptionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction6EditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return DataType2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(domainElement.eClass())) {
				return Collections2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(domainElement.eClass())) {
				return Records2EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(domainElement.eClass())) {
				return Cursor2EditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return DataType3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(domainElement.eClass())) {
				return Collections3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(domainElement.eClass())) {
				return Records3EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(domainElement.eClass())) {
				return Cursor3EditPart.VISUAL_ID;
			}
			break;
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCollections().isSuperTypeOf(domainElement.eClass())) {
				return CollectionsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getRecords().isSuperTypeOf(domainElement.eClass())) {
				return RecordsEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCursor().isSuperTypeOf(domainElement.eClass())) {
				return CursorEditPart.VISUAL_ID;
			}
			break;
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			if (CrystalPackage.eINSTANCE.getExpression().isSuperTypeOf(domainElement.eClass())) {
				return ExpressionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getException().isSuperTypeOf(domainElement.eClass())) {
				return ExceptionEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getIf().isSuperTypeOf(domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCase().isSuperTypeOf(domainElement.eClass())) {
				return Case6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getInsert().isSuperTypeOf(domainElement.eClass())) {
				return Insert6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getUpdate().isSuperTypeOf(domainElement.eClass())) {
				return Update6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getDelete().isSuperTypeOf(domainElement.eClass())) {
				return Delete6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFor().isSuperTypeOf(domainElement.eClass())) {
				return For6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getLoop().isSuperTypeOf(domainElement.eClass())) {
				return Loop6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getOpen().isSuperTypeOf(domainElement.eClass())) {
				return Open6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getFetch().isSuperTypeOf(domainElement.eClass())) {
				return Fetch6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getClose().isSuperTypeOf(domainElement.eClass())) {
				return Close6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallProcedure().isSuperTypeOf(domainElement.eClass())) {
				return CallProcedure6EditPart.VISUAL_ID;
			}
			if (CrystalPackage.eINSTANCE.getCallFunction().isSuperTypeOf(domainElement.eClass())) {
				return CallFunction6EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = crystal.diagram.part.CrystalVisualIDRegistry.getModelID(containerView);
		if (!CrystalEditPart.MODEL_ID.equals(containerModelID) && !"crystal".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CrystalEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crystal.diagram.part.CrystalVisualIDRegistry.getVisualID(containerView);
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
			if (AnonymousBlockDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpressionEditPart.VISUAL_ID:
			if (ExpressionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
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
			if (IfIfTrue_statementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfFalse_statementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expression2EditPart.VISUAL_ID:
			if (ExpressionDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exception2EditPart.VISUAL_ID:
			if (ExceptionDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If2EditPart.VISUAL_ID:
			if (IfDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfTrue_statementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfFalse_statementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseEditPart.VISUAL_ID:
			if (CaseDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseOptionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expression3EditPart.VISUAL_ID:
			if (ExpressionDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exception3EditPart.VISUAL_ID:
			if (ExceptionDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If3EditPart.VISUAL_ID:
			if (IfDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfTrue_statementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfFalse_statementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
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
			if (WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expression4EditPart.VISUAL_ID:
			if (ExpressionDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exception4EditPart.VISUAL_ID:
			if (ExceptionDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If4EditPart.VISUAL_ID:
			if (IfDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfTrue_statementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfFalse_statementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForEditPart.VISUAL_ID:
			if (ForDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForForInterations_statementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Case2EditPart.VISUAL_ID:
			if (CaseDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseOptionsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Case3EditPart.VISUAL_ID:
			if (CaseDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseOptionsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Insert2EditPart.VISUAL_ID:
			if (InsertDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Update2EditPart.VISUAL_ID:
			if (UpdateDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Delete2EditPart.VISUAL_ID:
			if (DeleteDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Select2EditPart.VISUAL_ID:
			if (SelectDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While2EditPart.VISUAL_ID:
			if (WhileDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Insert3EditPart.VISUAL_ID:
			if (InsertDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Update3EditPart.VISUAL_ID:
			if (UpdateDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Delete3EditPart.VISUAL_ID:
			if (DeleteDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Select3EditPart.VISUAL_ID:
			if (SelectDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While3EditPart.VISUAL_ID:
			if (WhileDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case For2EditPart.VISUAL_ID:
			if (ForDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForForInterations_statementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopEditPart.VISUAL_ID:
			if (LoopDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case For3EditPart.VISUAL_ID:
			if (ForDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForForInterations_statementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Loop2EditPart.VISUAL_ID:
			if (LoopDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Open2EditPart.VISUAL_ID:
			if (OpenDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Fetch2EditPart.VISUAL_ID:
			if (FetchDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Close2EditPart.VISUAL_ID:
			if (CloseDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallProcedure2EditPart.VISUAL_ID:
			if (CallProcedureDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallFunction2EditPart.VISUAL_ID:
			if (CallFunctionDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OptionsEditPart.VISUAL_ID:
			if (OptionsDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expression5EditPart.VISUAL_ID:
			if (ExpressionDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exception5EditPart.VISUAL_ID:
			if (ExceptionDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If5EditPart.VISUAL_ID:
			if (IfDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfTrue_statementsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfFalse_statementsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Loop3EditPart.VISUAL_ID:
			if (LoopDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Open3EditPart.VISUAL_ID:
			if (OpenDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Fetch3EditPart.VISUAL_ID:
			if (FetchDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Close3EditPart.VISUAL_ID:
			if (CloseDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallProcedure3EditPart.VISUAL_ID:
			if (CallProcedureDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallFunction3EditPart.VISUAL_ID:
			if (CallFunctionDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Expression6EditPart.VISUAL_ID:
			if (ExpressionDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Exception6EditPart.VISUAL_ID:
			if (ExceptionDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case If6EditPart.VISUAL_ID:
			if (IfDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfTrue_statementsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfIfFalse_statementsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Case4EditPart.VISUAL_ID:
			if (CaseDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseOptionsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Insert4EditPart.VISUAL_ID:
			if (InsertDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Update4EditPart.VISUAL_ID:
			if (UpdateDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Delete4EditPart.VISUAL_ID:
			if (DeleteDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Select4EditPart.VISUAL_ID:
			if (SelectDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While4EditPart.VISUAL_ID:
			if (WhileDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case For4EditPart.VISUAL_ID:
			if (ForDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForForInterations_statementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Loop4EditPart.VISUAL_ID:
			if (LoopDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Open4EditPart.VISUAL_ID:
			if (OpenDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Fetch4EditPart.VISUAL_ID:
			if (FetchDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Close4EditPart.VISUAL_ID:
			if (CloseDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallProcedure4EditPart.VISUAL_ID:
			if (CallProcedureDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallFunction4EditPart.VISUAL_ID:
			if (CallFunctionDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Case5EditPart.VISUAL_ID:
			if (CaseDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseOptionsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Insert5EditPart.VISUAL_ID:
			if (InsertDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Update5EditPart.VISUAL_ID:
			if (UpdateDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Delete5EditPart.VISUAL_ID:
			if (DeleteDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Select5EditPart.VISUAL_ID:
			if (SelectDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While5EditPart.VISUAL_ID:
			if (WhileDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case For5EditPart.VISUAL_ID:
			if (ForDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForForInterations_statementsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Loop5EditPart.VISUAL_ID:
			if (LoopDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Open5EditPart.VISUAL_ID:
			if (OpenDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Fetch5EditPart.VISUAL_ID:
			if (FetchDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Close5EditPart.VISUAL_ID:
			if (CloseDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallProcedure5EditPart.VISUAL_ID:
			if (CallProcedureDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallFunction5EditPart.VISUAL_ID:
			if (CallFunctionDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Case6EditPart.VISUAL_ID:
			if (CaseDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseOptionsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Insert6EditPart.VISUAL_ID:
			if (InsertDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Update6EditPart.VISUAL_ID:
			if (UpdateDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Delete6EditPart.VISUAL_ID:
			if (DeleteDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Select6EditPart.VISUAL_ID:
			if (SelectDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case While6EditPart.VISUAL_ID:
			if (WhileDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case For6EditPart.VISUAL_ID:
			if (ForDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForForInterations_statementsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Loop6EditPart.VISUAL_ID:
			if (LoopDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Open6EditPart.VISUAL_ID:
			if (OpenDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Fetch6EditPart.VISUAL_ID:
			if (FetchDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Close6EditPart.VISUAL_ID:
			if (CloseDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallProcedure6EditPart.VISUAL_ID:
			if (CallProcedureDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallFunction6EditPart.VISUAL_ID:
			if (CallFunctionDescription6EditPart.VISUAL_ID == nodeVisualID) {
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
			if (ExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExceptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction6EditPart.VISUAL_ID == nodeVisualID) {
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
		case IfIfTrue_statementsCompartmentEditPart.VISUAL_ID:
			if (Expression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (Loop3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfFalse_statementsCompartmentEditPart.VISUAL_ID:
			if (Expression6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfTrue_statementsCompartment2EditPart.VISUAL_ID:
			if (Expression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (Loop3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfFalse_statementsCompartment2EditPart.VISUAL_ID:
			if (Expression6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseOptionsCompartmentEditPart.VISUAL_ID:
			if (OptionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID:
			if (Expression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfTrue_statementsCompartment3EditPart.VISUAL_ID:
			if (Expression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (Loop3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfFalse_statementsCompartment3EditPart.VISUAL_ID:
			if (Expression6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case IfIfTrue_statementsCompartment4EditPart.VISUAL_ID:
			if (Expression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (Loop3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfFalse_statementsCompartment4EditPart.VISUAL_ID:
			if (Expression6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForForInterations_statementsCompartmentEditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case CaseCaseOptionsCompartment2EditPart.VISUAL_ID:
			if (OptionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID:
			if (Expression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseOptionsCompartment3EditPart.VISUAL_ID:
			if (OptionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID:
			if (Expression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case ForForInterations_statementsCompartment2EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case ForForInterations_statementsCompartment3EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID:
			if (Expression5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfTrue_statementsCompartment5EditPart.VISUAL_ID:
			if (Expression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (Loop3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfFalse_statementsCompartment5EditPart.VISUAL_ID:
			if (Expression6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case IfIfTrue_statementsCompartment6EditPart.VISUAL_ID:
			if (Expression2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (Loop3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfIfFalse_statementsCompartment6EditPart.VISUAL_ID:
			if (Expression6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseOptionsCompartment4EditPart.VISUAL_ID:
			if (OptionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID:
			if (Expression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case ForForInterations_statementsCompartment4EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case CaseCaseOptionsCompartment5EditPart.VISUAL_ID:
			if (OptionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID:
			if (Expression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case ForForInterations_statementsCompartment5EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case CaseCaseOptionsCompartment6EditPart.VISUAL_ID:
			if (OptionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID:
			if (Expression3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case ForForInterations_statementsCompartment6EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
		case LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID:
			if (Expression4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Exception4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (If4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For2EditPart.VISUAL_ID == nodeVisualID) {
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
			if (ExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExceptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
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
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
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
			if (ExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExceptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Case6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Insert6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Update6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Delete6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (For6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Loop6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Open6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fetch6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Close6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallProcedure6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallFunction6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OptionsTransitionEditPart.VISUAL_ID:
			if (OptionsTransitionNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (CrystalPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		if (CrystalPackage.eINSTANCE.getOptionsTransition().isSuperTypeOf(domainElement.eClass())) {
			return OptionsTransitionEditPart.VISUAL_ID;
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
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
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
		case IfIfTrue_statementsCompartmentEditPart.VISUAL_ID:
		case IfIfFalse_statementsCompartmentEditPart.VISUAL_ID:
		case IfIfTrue_statementsCompartment2EditPart.VISUAL_ID:
		case IfIfFalse_statementsCompartment2EditPart.VISUAL_ID:
		case CaseCaseOptionsCompartmentEditPart.VISUAL_ID:
		case CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID:
		case IfIfTrue_statementsCompartment3EditPart.VISUAL_ID:
		case IfIfFalse_statementsCompartment3EditPart.VISUAL_ID:
		case WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID:
		case IfIfTrue_statementsCompartment4EditPart.VISUAL_ID:
		case IfIfFalse_statementsCompartment4EditPart.VISUAL_ID:
		case ForForInterations_statementsCompartmentEditPart.VISUAL_ID:
		case CaseCaseOptionsCompartment2EditPart.VISUAL_ID:
		case CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID:
		case CaseCaseOptionsCompartment3EditPart.VISUAL_ID:
		case CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID:
		case WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID:
		case WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID:
		case ForForInterations_statementsCompartment2EditPart.VISUAL_ID:
		case LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID:
		case ForForInterations_statementsCompartment3EditPart.VISUAL_ID:
		case LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID:
		case OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID:
		case IfIfTrue_statementsCompartment5EditPart.VISUAL_ID:
		case IfIfFalse_statementsCompartment5EditPart.VISUAL_ID:
		case LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID:
		case IfIfTrue_statementsCompartment6EditPart.VISUAL_ID:
		case IfIfFalse_statementsCompartment6EditPart.VISUAL_ID:
		case CaseCaseOptionsCompartment4EditPart.VISUAL_ID:
		case CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID:
		case WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID:
		case ForForInterations_statementsCompartment4EditPart.VISUAL_ID:
		case LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID:
		case CaseCaseOptionsCompartment5EditPart.VISUAL_ID:
		case CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID:
		case WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID:
		case ForForInterations_statementsCompartment5EditPart.VISUAL_ID:
		case LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID:
		case CaseCaseOptionsCompartment6EditPart.VISUAL_ID:
		case CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID:
		case WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID:
		case ForForInterations_statementsCompartment6EditPart.VISUAL_ID:
		case LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID:
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
		case DataType3EditPart.VISUAL_ID:
		case Collections3EditPart.VISUAL_ID:
		case Records3EditPart.VISUAL_ID:
		case Cursor3EditPart.VISUAL_ID:
		case ExpressionEditPart.VISUAL_ID:
		case ExceptionEditPart.VISUAL_ID:
		case Expression2EditPart.VISUAL_ID:
		case Exception2EditPart.VISUAL_ID:
		case Expression3EditPart.VISUAL_ID:
		case Exception3EditPart.VISUAL_ID:
		case InsertEditPart.VISUAL_ID:
		case UpdateEditPart.VISUAL_ID:
		case DeleteEditPart.VISUAL_ID:
		case SelectEditPart.VISUAL_ID:
		case Expression4EditPart.VISUAL_ID:
		case Exception4EditPart.VISUAL_ID:
		case Insert2EditPart.VISUAL_ID:
		case Update2EditPart.VISUAL_ID:
		case Delete2EditPart.VISUAL_ID:
		case Select2EditPart.VISUAL_ID:
		case Insert3EditPart.VISUAL_ID:
		case Update3EditPart.VISUAL_ID:
		case Delete3EditPart.VISUAL_ID:
		case Select3EditPart.VISUAL_ID:
		case OpenEditPart.VISUAL_ID:
		case FetchEditPart.VISUAL_ID:
		case CloseEditPart.VISUAL_ID:
		case CallProcedureEditPart.VISUAL_ID:
		case CallFunctionEditPart.VISUAL_ID:
		case Open2EditPart.VISUAL_ID:
		case Fetch2EditPart.VISUAL_ID:
		case Close2EditPart.VISUAL_ID:
		case CallProcedure2EditPart.VISUAL_ID:
		case CallFunction2EditPart.VISUAL_ID:
		case Expression5EditPart.VISUAL_ID:
		case Exception5EditPart.VISUAL_ID:
		case Open3EditPart.VISUAL_ID:
		case Fetch3EditPart.VISUAL_ID:
		case Close3EditPart.VISUAL_ID:
		case CallProcedure3EditPart.VISUAL_ID:
		case CallFunction3EditPart.VISUAL_ID:
		case Expression6EditPart.VISUAL_ID:
		case Exception6EditPart.VISUAL_ID:
		case Insert4EditPart.VISUAL_ID:
		case Update4EditPart.VISUAL_ID:
		case Delete4EditPart.VISUAL_ID:
		case Select4EditPart.VISUAL_ID:
		case Open4EditPart.VISUAL_ID:
		case Fetch4EditPart.VISUAL_ID:
		case Close4EditPart.VISUAL_ID:
		case CallProcedure4EditPart.VISUAL_ID:
		case CallFunction4EditPart.VISUAL_ID:
		case Insert5EditPart.VISUAL_ID:
		case Update5EditPart.VISUAL_ID:
		case Delete5EditPart.VISUAL_ID:
		case Select5EditPart.VISUAL_ID:
		case Open5EditPart.VISUAL_ID:
		case Fetch5EditPart.VISUAL_ID:
		case Close5EditPart.VISUAL_ID:
		case CallProcedure5EditPart.VISUAL_ID:
		case CallFunction5EditPart.VISUAL_ID:
		case Insert6EditPart.VISUAL_ID:
		case Update6EditPart.VISUAL_ID:
		case Delete6EditPart.VISUAL_ID:
		case Select6EditPart.VISUAL_ID:
		case Open6EditPart.VISUAL_ID:
		case Fetch6EditPart.VISUAL_ID:
		case Close6EditPart.VISUAL_ID:
		case CallProcedure6EditPart.VISUAL_ID:
		case CallFunction6EditPart.VISUAL_ID:
		case DataTypeEditPart.VISUAL_ID:
		case CollectionsEditPart.VISUAL_ID:
		case RecordsEditPart.VISUAL_ID:
		case CursorEditPart.VISUAL_ID:
		case DataType2EditPart.VISUAL_ID:
		case Collections2EditPart.VISUAL_ID:
		case Records2EditPart.VISUAL_ID:
		case Cursor2EditPart.VISUAL_ID:
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
			return crystal.diagram.part.CrystalVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return crystal.diagram.part.CrystalVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return crystal.diagram.part.CrystalVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return crystal.diagram.part.CrystalVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return crystal.diagram.part.CrystalVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return crystal.diagram.part.CrystalVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
