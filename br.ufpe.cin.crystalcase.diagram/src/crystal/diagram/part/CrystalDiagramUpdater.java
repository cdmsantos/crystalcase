/*
* 
*/
package crystal.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import crystal.AnonymousBlock;
import crystal.CallFunction;
import crystal.CallProcedure;
import crystal.Case;
import crystal.Close;
import crystal.Crystal;
import crystal.CrystalPackage;
import crystal.DataAbstractions;
import crystal.Delete;
import crystal.Exception;
import crystal.Expression;
import crystal.Fetch;
import crystal.For;
import crystal.Function;
import crystal.If;
import crystal.Insert;
import crystal.Loop;
import crystal.Open;
import crystal.Options;
import crystal.OptionsTransition;
import crystal.Procedure;
import crystal.Select;
import crystal.Statements;
import crystal.Subprograms;
import crystal.Transition;
import crystal.Update;
import crystal.While;
import crystal.diagram.edit.parts.*;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class CrystalDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getSemanticChildren(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case CrystalEditPart.VISUAL_ID:
			return getCrystal_1000SemanticChildren(view);
		case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureDeclarativePartCompartment_7107SemanticChildren(view);
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureExecutablePartCompartment_7108SemanticChildren(view);
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureParametersCompartment_7109SemanticChildren(view);
		case IfIfTrue_statementsCompartmentEditPart.VISUAL_ID:
			return getIfIfTrue_statementsCompartment_7110SemanticChildren(view);
		case IfIfFalse_statementsCompartmentEditPart.VISUAL_ID:
			return getIfIfFalse_statementsCompartment_7111SemanticChildren(view);
		case IfIfTrue_statementsCompartment2EditPart.VISUAL_ID:
			return getIfIfTrue_statementsCompartment_7112SemanticChildren(view);
		case IfIfFalse_statementsCompartment2EditPart.VISUAL_ID:
			return getIfIfFalse_statementsCompartment_7113SemanticChildren(view);
		case CaseCaseOptionsCompartmentEditPart.VISUAL_ID:
			return getCaseCaseOptionsCompartment_7114SemanticChildren(view);
		case CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID:
			return getCaseCaseDefault_statementsCompartment_7115SemanticChildren(view);
		case IfIfTrue_statementsCompartment3EditPart.VISUAL_ID:
			return getIfIfTrue_statementsCompartment_7116SemanticChildren(view);
		case IfIfFalse_statementsCompartment3EditPart.VISUAL_ID:
			return getIfIfFalse_statementsCompartment_7117SemanticChildren(view);
		case WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID:
			return getWhileWhileInterations_statementsCompartment_7118SemanticChildren(view);
		case IfIfTrue_statementsCompartment4EditPart.VISUAL_ID:
			return getIfIfTrue_statementsCompartment_7119SemanticChildren(view);
		case IfIfFalse_statementsCompartment4EditPart.VISUAL_ID:
			return getIfIfFalse_statementsCompartment_7120SemanticChildren(view);
		case ForForInterations_statementsCompartmentEditPart.VISUAL_ID:
			return getForForInterations_statementsCompartment_7121SemanticChildren(view);
		case CaseCaseOptionsCompartment2EditPart.VISUAL_ID:
			return getCaseCaseOptionsCompartment_7122SemanticChildren(view);
		case CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID:
			return getCaseCaseDefault_statementsCompartment_7123SemanticChildren(view);
		case CaseCaseOptionsCompartment3EditPart.VISUAL_ID:
			return getCaseCaseOptionsCompartment_7124SemanticChildren(view);
		case CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID:
			return getCaseCaseDefault_statementsCompartment_7125SemanticChildren(view);
		case WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID:
			return getWhileWhileInterations_statementsCompartment_7126SemanticChildren(view);
		case WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID:
			return getWhileWhileInterations_statementsCompartment_7127SemanticChildren(view);
		case ForForInterations_statementsCompartment2EditPart.VISUAL_ID:
			return getForForInterations_statementsCompartment_7128SemanticChildren(view);
		case LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID:
			return getLoopLoopInterations_statementsCompartment_7129SemanticChildren(view);
		case ForForInterations_statementsCompartment3EditPart.VISUAL_ID:
			return getForForInterations_statementsCompartment_7130SemanticChildren(view);
		case LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID:
			return getLoopLoopInterations_statementsCompartment_7131SemanticChildren(view);
		case OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID:
			return getOptionsOptionsCase_statementsCompartment_7132SemanticChildren(view);
		case IfIfTrue_statementsCompartment5EditPart.VISUAL_ID:
			return getIfIfTrue_statementsCompartment_7133SemanticChildren(view);
		case IfIfFalse_statementsCompartment5EditPart.VISUAL_ID:
			return getIfIfFalse_statementsCompartment_7134SemanticChildren(view);
		case LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID:
			return getLoopLoopInterations_statementsCompartment_7135SemanticChildren(view);
		case IfIfTrue_statementsCompartment6EditPart.VISUAL_ID:
			return getIfIfTrue_statementsCompartment_7136SemanticChildren(view);
		case IfIfFalse_statementsCompartment6EditPart.VISUAL_ID:
			return getIfIfFalse_statementsCompartment_7137SemanticChildren(view);
		case CaseCaseOptionsCompartment4EditPart.VISUAL_ID:
			return getCaseCaseOptionsCompartment_7138SemanticChildren(view);
		case CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID:
			return getCaseCaseDefault_statementsCompartment_7139SemanticChildren(view);
		case WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID:
			return getWhileWhileInterations_statementsCompartment_7140SemanticChildren(view);
		case ForForInterations_statementsCompartment4EditPart.VISUAL_ID:
			return getForForInterations_statementsCompartment_7141SemanticChildren(view);
		case LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID:
			return getLoopLoopInterations_statementsCompartment_7142SemanticChildren(view);
		case CaseCaseOptionsCompartment5EditPart.VISUAL_ID:
			return getCaseCaseOptionsCompartment_7143SemanticChildren(view);
		case CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID:
			return getCaseCaseDefault_statementsCompartment_7144SemanticChildren(view);
		case WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID:
			return getWhileWhileInterations_statementsCompartment_7145SemanticChildren(view);
		case ForForInterations_statementsCompartment5EditPart.VISUAL_ID:
			return getForForInterations_statementsCompartment_7146SemanticChildren(view);
		case LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID:
			return getLoopLoopInterations_statementsCompartment_7147SemanticChildren(view);
		case CaseCaseOptionsCompartment6EditPart.VISUAL_ID:
			return getCaseCaseOptionsCompartment_7148SemanticChildren(view);
		case CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID:
			return getCaseCaseDefault_statementsCompartment_7149SemanticChildren(view);
		case WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID:
			return getWhileWhileInterations_statementsCompartment_7150SemanticChildren(view);
		case ForForInterations_statementsCompartment6EditPart.VISUAL_ID:
			return getForForInterations_statementsCompartment_7151SemanticChildren(view);
		case LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID:
			return getLoopLoopInterations_statementsCompartment_7152SemanticChildren(view);
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionDeclarativePartCompartment_7153SemanticChildren(view);
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionExecutablePartCompartment_7154SemanticChildren(view);
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParametersCompartment_7155SemanticChildren(view);
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionReturnPartCompartment_7156SemanticChildren(view);
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockDeclarativePartCompartment_7157SemanticChildren(view);
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockExecutablePartCompartment_7158SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCrystal_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Crystal modelElement = (Crystal) view.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubprograms().iterator(); it.hasNext();) {
			Subprograms childElement = (Subprograms) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnonymousBlockEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getProcedureProcedureDeclarativePartCompartment_7107SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Procedure modelElement = (Procedure) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeclarativePart().iterator(); it.hasNext();) {
			DataAbstractions childElement = (DataAbstractions) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataTypeEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollectionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RecordsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CursorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getProcedureProcedureExecutablePartCompartment_7108SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Procedure modelElement = (Procedure) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExecutablePart().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExpressionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExceptionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getProcedureProcedureParametersCompartment_7109SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Procedure modelElement = (Procedure) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			DataAbstractions childElement = (DataAbstractions) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataType2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Collections2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Records2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Cursor2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfTrue_statementsCompartment_7110SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTrue_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InsertEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfFalse_statementsCompartment_7111SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFalse_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfTrue_statementsCompartment_7112SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTrue_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InsertEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfFalse_statementsCompartment_7113SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFalse_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseOptionsCompartment_7114SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOptions().iterator(); it.hasNext();) {
			Options childElement = (Options) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OptionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseDefault_statementsCompartment_7115SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDefault_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfTrue_statementsCompartment_7116SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTrue_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InsertEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfFalse_statementsCompartment_7117SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFalse_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileInterations_statementsCompartment_7118SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfTrue_statementsCompartment_7119SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTrue_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InsertEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfFalse_statementsCompartment_7120SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFalse_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getForForInterations_statementsCompartment_7121SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseOptionsCompartment_7122SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOptions().iterator(); it.hasNext();) {
			Options childElement = (Options) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OptionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseDefault_statementsCompartment_7123SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDefault_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseOptionsCompartment_7124SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOptions().iterator(); it.hasNext();) {
			Options childElement = (Options) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OptionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseDefault_statementsCompartment_7125SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDefault_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileInterations_statementsCompartment_7126SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileInterations_statementsCompartment_7127SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getForForInterations_statementsCompartment_7128SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getLoopLoopInterations_statementsCompartment_7129SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getForForInterations_statementsCompartment_7130SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getLoopLoopInterations_statementsCompartment_7131SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getOptionsOptionsCase_statementsCompartment_7132SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Options modelElement = (Options) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCase_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfTrue_statementsCompartment_7133SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTrue_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InsertEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfFalse_statementsCompartment_7134SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFalse_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getLoopLoopInterations_statementsCompartment_7135SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfTrue_statementsCompartment_7136SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTrue_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CaseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InsertEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelectEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfFalse_statementsCompartment_7137SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFalse_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseOptionsCompartment_7138SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOptions().iterator(); it.hasNext();) {
			Options childElement = (Options) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OptionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseDefault_statementsCompartment_7139SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDefault_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileInterations_statementsCompartment_7140SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getForForInterations_statementsCompartment_7141SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getLoopLoopInterations_statementsCompartment_7142SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseOptionsCompartment_7143SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOptions().iterator(); it.hasNext();) {
			Options childElement = (Options) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OptionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseDefault_statementsCompartment_7144SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDefault_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileInterations_statementsCompartment_7145SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getForForInterations_statementsCompartment_7146SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getLoopLoopInterations_statementsCompartment_7147SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseOptionsCompartment_7148SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOptions().iterator(); it.hasNext();) {
			Options childElement = (Options) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OptionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getCaseCaseDefault_statementsCompartment_7149SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDefault_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileInterations_statementsCompartment_7150SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getForForInterations_statementsCompartment_7151SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getLoopLoopInterations_statementsCompartment_7152SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInterations_statements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Expression4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LoopEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpenEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FetchEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CloseEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getFunctionFunctionDeclarativePartCompartment_7153SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeclarativePart().iterator(); it.hasNext();) {
			DataAbstractions childElement = (DataAbstractions) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataTypeEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollectionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RecordsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CursorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getFunctionFunctionExecutablePartCompartment_7154SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExecutablePart().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExpressionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExceptionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getFunctionFunctionParametersCompartment_7155SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it.hasNext();) {
			DataAbstractions childElement = (DataAbstractions) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataType2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Collections2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Records2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Cursor2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getFunctionFunctionReturnPartCompartment_7156SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		{
			DataAbstractions childElement = modelElement.getReturnPart();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataType3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
			if (visualID == Collections3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
			if (visualID == Records3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
			if (visualID == Cursor3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getAnonymousBlockAnonymousBlockDeclarativePartCompartment_7157SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AnonymousBlock modelElement = (AnonymousBlock) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeclarativePart().iterator(); it.hasNext();) {
			DataAbstractions childElement = (DataAbstractions) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataTypeEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CollectionsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RecordsEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CursorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getAnonymousBlockAnonymousBlockExecutablePartCompartment_7158SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AnonymousBlock modelElement = (AnonymousBlock) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExecutablePart().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExpressionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExceptionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getContainedLinks(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case CrystalEditPart.VISUAL_ID:
			return getCrystal_1000ContainedLinks(view);
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2010ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2011ContainedLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2012ContainedLinks(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3236ContainedLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3237ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3238ContainedLinks(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3239ContainedLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3240ContainedLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3241ContainedLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3242ContainedLinks(view);
		case Expression3EditPart.VISUAL_ID:
			return getExpression_3243ContainedLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3244ContainedLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3245ContainedLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3246ContainedLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3247ContainedLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3248ContainedLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3249ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3250ContainedLinks(view);
		case Expression4EditPart.VISUAL_ID:
			return getExpression_3251ContainedLinks(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3252ContainedLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3253ContainedLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3254ContainedLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3255ContainedLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3256ContainedLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3257ContainedLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3258ContainedLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3259ContainedLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3260ContainedLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3261ContainedLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3262ContainedLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3263ContainedLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3264ContainedLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3265ContainedLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3266ContainedLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3267ContainedLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3268ContainedLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3269ContainedLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3270ContainedLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3271ContainedLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3272ContainedLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3273ContainedLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3274ContainedLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3275ContainedLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3276ContainedLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3277ContainedLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3278ContainedLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3279ContainedLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3280ContainedLinks(view);
		case OptionsEditPart.VISUAL_ID:
			return getOptions_3281ContainedLinks(view);
		case Expression5EditPart.VISUAL_ID:
			return getExpression_3282ContainedLinks(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3283ContainedLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3284ContainedLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3285ContainedLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3286ContainedLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3287ContainedLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3288ContainedLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3289ContainedLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3290ContainedLinks(view);
		case Expression6EditPart.VISUAL_ID:
			return getExpression_3291ContainedLinks(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3292ContainedLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3293ContainedLinks(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3294ContainedLinks(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3295ContainedLinks(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3296ContainedLinks(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3297ContainedLinks(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3298ContainedLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3299ContainedLinks(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3300ContainedLinks(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3301ContainedLinks(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3302ContainedLinks(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3303ContainedLinks(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3304ContainedLinks(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3305ContainedLinks(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3306ContainedLinks(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3307ContainedLinks(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3308ContainedLinks(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3309ContainedLinks(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3310ContainedLinks(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3311ContainedLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3312ContainedLinks(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3313ContainedLinks(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3314ContainedLinks(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3315ContainedLinks(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3316ContainedLinks(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3317ContainedLinks(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3318ContainedLinks(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3319ContainedLinks(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3320ContainedLinks(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3321ContainedLinks(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3322ContainedLinks(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3323ContainedLinks(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3324ContainedLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3325ContainedLinks(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3326ContainedLinks(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3327ContainedLinks(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3328ContainedLinks(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3329ContainedLinks(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3330ContainedLinks(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3331ContainedLinks(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3332ContainedLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3333ContainedLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3334ContainedLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3335ContainedLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3336ContainedLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3337ContainedLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3338ContainedLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3339ContainedLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3340ContainedLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3026ContainedLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3027ContainedLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3028ContainedLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3029ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		case OptionsTransitionEditPart.VISUAL_ID:
			return getOptionsTransition_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIncomingLinks(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2010IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2011IncomingLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2012IncomingLinks(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3236IncomingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3237IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3238IncomingLinks(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3239IncomingLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3240IncomingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3241IncomingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3242IncomingLinks(view);
		case Expression3EditPart.VISUAL_ID:
			return getExpression_3243IncomingLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3244IncomingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3245IncomingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3246IncomingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3247IncomingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3248IncomingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3249IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3250IncomingLinks(view);
		case Expression4EditPart.VISUAL_ID:
			return getExpression_3251IncomingLinks(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3252IncomingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3253IncomingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3254IncomingLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3255IncomingLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3256IncomingLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3257IncomingLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3258IncomingLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3259IncomingLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3260IncomingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3261IncomingLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3262IncomingLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3263IncomingLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3264IncomingLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3265IncomingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3266IncomingLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3267IncomingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3268IncomingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3269IncomingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3270IncomingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3271IncomingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3272IncomingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3273IncomingLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3274IncomingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3275IncomingLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3276IncomingLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3277IncomingLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3278IncomingLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3279IncomingLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3280IncomingLinks(view);
		case OptionsEditPart.VISUAL_ID:
			return getOptions_3281IncomingLinks(view);
		case Expression5EditPart.VISUAL_ID:
			return getExpression_3282IncomingLinks(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3283IncomingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3284IncomingLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3285IncomingLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3286IncomingLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3287IncomingLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3288IncomingLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3289IncomingLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3290IncomingLinks(view);
		case Expression6EditPart.VISUAL_ID:
			return getExpression_3291IncomingLinks(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3292IncomingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3293IncomingLinks(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3294IncomingLinks(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3295IncomingLinks(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3296IncomingLinks(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3297IncomingLinks(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3298IncomingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3299IncomingLinks(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3300IncomingLinks(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3301IncomingLinks(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3302IncomingLinks(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3303IncomingLinks(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3304IncomingLinks(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3305IncomingLinks(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3306IncomingLinks(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3307IncomingLinks(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3308IncomingLinks(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3309IncomingLinks(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3310IncomingLinks(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3311IncomingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3312IncomingLinks(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3313IncomingLinks(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3314IncomingLinks(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3315IncomingLinks(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3316IncomingLinks(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3317IncomingLinks(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3318IncomingLinks(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3319IncomingLinks(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3320IncomingLinks(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3321IncomingLinks(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3322IncomingLinks(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3323IncomingLinks(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3324IncomingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3325IncomingLinks(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3326IncomingLinks(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3327IncomingLinks(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3328IncomingLinks(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3329IncomingLinks(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3330IncomingLinks(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3331IncomingLinks(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3332IncomingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3333IncomingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3334IncomingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3335IncomingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3336IncomingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3337IncomingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3338IncomingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3339IncomingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3340IncomingLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3026IncomingLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3027IncomingLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3028IncomingLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3029IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		case OptionsTransitionEditPart.VISUAL_ID:
			return getOptionsTransition_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOutgoingLinks(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2010OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2011OutgoingLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2012OutgoingLinks(view);
		case ExpressionEditPart.VISUAL_ID:
			return getExpression_3236OutgoingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3237OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3238OutgoingLinks(view);
		case Expression2EditPart.VISUAL_ID:
			return getExpression_3239OutgoingLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3240OutgoingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3241OutgoingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3242OutgoingLinks(view);
		case Expression3EditPart.VISUAL_ID:
			return getExpression_3243OutgoingLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3244OutgoingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3245OutgoingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3246OutgoingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3247OutgoingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3248OutgoingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3249OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3250OutgoingLinks(view);
		case Expression4EditPart.VISUAL_ID:
			return getExpression_3251OutgoingLinks(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3252OutgoingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3253OutgoingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3254OutgoingLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3255OutgoingLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3256OutgoingLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3257OutgoingLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3258OutgoingLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3259OutgoingLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3260OutgoingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3261OutgoingLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3262OutgoingLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3263OutgoingLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3264OutgoingLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3265OutgoingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3266OutgoingLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3267OutgoingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3268OutgoingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3269OutgoingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3270OutgoingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3271OutgoingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3272OutgoingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3273OutgoingLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3274OutgoingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3275OutgoingLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3276OutgoingLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3277OutgoingLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3278OutgoingLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3279OutgoingLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3280OutgoingLinks(view);
		case OptionsEditPart.VISUAL_ID:
			return getOptions_3281OutgoingLinks(view);
		case Expression5EditPart.VISUAL_ID:
			return getExpression_3282OutgoingLinks(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3283OutgoingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3284OutgoingLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3285OutgoingLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3286OutgoingLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3287OutgoingLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3288OutgoingLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3289OutgoingLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3290OutgoingLinks(view);
		case Expression6EditPart.VISUAL_ID:
			return getExpression_3291OutgoingLinks(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3292OutgoingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3293OutgoingLinks(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3294OutgoingLinks(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3295OutgoingLinks(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3296OutgoingLinks(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3297OutgoingLinks(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3298OutgoingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3299OutgoingLinks(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3300OutgoingLinks(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3301OutgoingLinks(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3302OutgoingLinks(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3303OutgoingLinks(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3304OutgoingLinks(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3305OutgoingLinks(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3306OutgoingLinks(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3307OutgoingLinks(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3308OutgoingLinks(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3309OutgoingLinks(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3310OutgoingLinks(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3311OutgoingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3312OutgoingLinks(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3313OutgoingLinks(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3314OutgoingLinks(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3315OutgoingLinks(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3316OutgoingLinks(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3317OutgoingLinks(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3318OutgoingLinks(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3319OutgoingLinks(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3320OutgoingLinks(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3321OutgoingLinks(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3322OutgoingLinks(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3323OutgoingLinks(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3324OutgoingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3325OutgoingLinks(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3326OutgoingLinks(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3327OutgoingLinks(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3328OutgoingLinks(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3329OutgoingLinks(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3330OutgoingLinks(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3331OutgoingLinks(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3332OutgoingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3333OutgoingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3334OutgoingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3335OutgoingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3336OutgoingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3337OutgoingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3338OutgoingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3339OutgoingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3340OutgoingLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3026OutgoingLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3027OutgoingLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3028OutgoingLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3029OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		case OptionsTransitionEditPart.VISUAL_ID:
			return getOptionsTransition_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCrystal_1000ContainedLinks(View view) {
		Crystal modelElement = (Crystal) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_OptionsTransition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getProcedure_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFunction_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3236ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3237ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3238ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3239ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3240ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3241ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3242ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3243ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3244ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3245ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3246ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3247ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3248ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3249ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3250ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3251ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3252ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3253ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3254ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3255ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3256ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3257ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3258ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3259ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3260ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3261ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3262ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3263ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3264ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3265ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3266ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3267ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3268ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3269ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3270ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3271ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3272ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3273ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3274ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3275ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3276ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3277ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3278ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3279ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3280ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOptions_3281ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3282ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3283ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3284ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3285ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3286ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3287ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3288ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3289ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3290ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3291ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3292ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3293ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3294ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3295ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3296ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3297ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3298ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3299ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3300ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3301ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3302ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3303ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3304ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3305ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3306ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3307ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3308ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3309ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3310ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3311ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3312ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3313ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3314ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3315ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3316ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3317ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3318ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3319ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3320ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3321ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3322ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3323ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3324ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3325ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3326ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3327ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3328ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3329ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3330ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3331ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3332ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3333ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3334ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3335ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3336ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3337ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3338ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3339ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3340ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getTransition_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOptionsTransition_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getProcedure_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFunction_2011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3236IncomingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3237IncomingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3238IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3239IncomingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3240IncomingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3241IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3242IncomingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3243IncomingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3244IncomingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3245IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3246IncomingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3247IncomingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3248IncomingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3249IncomingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3250IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3251IncomingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3252IncomingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3253IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3254IncomingLinks(View view) {
		For modelElement = (For) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3255IncomingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3256IncomingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3257IncomingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3258IncomingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3259IncomingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3260IncomingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3261IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3262IncomingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3263IncomingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3264IncomingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3265IncomingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3266IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3267IncomingLinks(View view) {
		For modelElement = (For) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3268IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3269IncomingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3270IncomingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3271IncomingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3272IncomingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3273IncomingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3274IncomingLinks(View view) {
		For modelElement = (For) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3275IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3276IncomingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3277IncomingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3278IncomingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3279IncomingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3280IncomingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOptions_3281IncomingLinks(View view) {
		Options modelElement = (Options) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OptionsTransition_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3282IncomingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3283IncomingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3284IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3285IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3286IncomingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3287IncomingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3288IncomingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3289IncomingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3290IncomingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3291IncomingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3292IncomingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3293IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3294IncomingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3295IncomingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3296IncomingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3297IncomingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3298IncomingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3299IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3300IncomingLinks(View view) {
		For modelElement = (For) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3301IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3302IncomingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3303IncomingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3304IncomingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3305IncomingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3306IncomingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3307IncomingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3308IncomingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3309IncomingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3310IncomingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3311IncomingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3312IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3313IncomingLinks(View view) {
		For modelElement = (For) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3314IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3315IncomingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3316IncomingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3317IncomingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3318IncomingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3319IncomingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3320IncomingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3321IncomingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3322IncomingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3323IncomingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3324IncomingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3325IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3326IncomingLinks(View view) {
		For modelElement = (For) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3327IncomingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3328IncomingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3329IncomingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3330IncomingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3331IncomingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3332IncomingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3333IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3334IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3335IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3336IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3337IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3338IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3339IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3340IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getTransition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOptionsTransition_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getProcedure_2010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFunction_2011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3236OutgoingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3237OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3238OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3239OutgoingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3240OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3241OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3242OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3243OutgoingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3244OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3245OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3246OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3247OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3248OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3249OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3250OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3251OutgoingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3252OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3253OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3254OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3255OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3256OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3257OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3258OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3259OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3260OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3261OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3262OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3263OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3264OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3265OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3266OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3267OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3268OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3269OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3270OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3271OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3272OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3273OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3274OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3275OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3276OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3277OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3278OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3279OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3280OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOptions_3281OutgoingLinks(View view) {
		Options modelElement = (Options) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OptionsTransition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3282OutgoingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3283OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3284OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3285OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3286OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3287OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3288OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3289OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3290OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getExpression_3291OutgoingLinks(View view) {
		Expression modelElement = (Expression) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3292OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3293OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3294OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3295OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3296OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3297OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3298OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3299OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3300OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3301OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3302OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3303OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3304OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3305OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3306OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3307OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3308OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3309OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3310OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3311OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3312OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3313OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3314OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3315OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3316OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3317OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3318OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3319OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3320OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3321OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3322OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3323OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3324OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3325OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3326OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3327OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3328OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3329OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3330OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3331OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3332OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3333OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3334OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3335OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3336OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3337OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3338OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3339OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3340OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getTransition_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOptionsTransition_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<CrystalLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			Crystal container) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statements dst = link.getTarget();
			Statements src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, dst, link, CrystalElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CrystalLinkDescriptor> getContainedTypeModelFacetLinks_OptionsTransition_4003(
			Crystal container) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OptionsTransition) {
				continue;
			}
			OptionsTransition link = (OptionsTransition) linkObject;
			if (OptionsTransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Options dst = link.getTarget();
			Options src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, dst, link, CrystalElementTypes.OptionsTransition_4003,
					OptionsTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrystalLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(Statements target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CrystalPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statements src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, target, link, CrystalElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrystalLinkDescriptor> getIncomingTypeModelFacetLinks_OptionsTransition_4003(
			Options target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CrystalPackage.eINSTANCE.getOptionsTransition_Target()
					|| false == setting.getEObject() instanceof OptionsTransition) {
				continue;
			}
			OptionsTransition link = (OptionsTransition) setting.getEObject();
			if (OptionsTransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Options src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, target, link, CrystalElementTypes.OptionsTransition_4003,
					OptionsTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CrystalLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(Statements source) {
		Crystal container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Crystal) {
				container = (Crystal) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statements dst = link.getTarget();
			Statements src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CrystalLinkDescriptor(src, dst, link, CrystalElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CrystalLinkDescriptor> getOutgoingTypeModelFacetLinks_OptionsTransition_4003(
			Options source) {
		Crystal container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Crystal) {
				container = (Crystal) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OptionsTransition) {
				continue;
			}
			OptionsTransition link = (OptionsTransition) linkObject;
			if (OptionsTransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Options dst = link.getTarget();
			Options src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CrystalLinkDescriptor(src, dst, link, CrystalElementTypes.OptionsTransition_4003,
					OptionsTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<CrystalNodeDescriptor> getSemanticChildren(View view) {
			return CrystalDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CrystalLinkDescriptor> getContainedLinks(View view) {
			return CrystalDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CrystalLinkDescriptor> getIncomingLinks(View view) {
			return CrystalDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CrystalLinkDescriptor> getOutgoingLinks(View view) {
			return CrystalDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
