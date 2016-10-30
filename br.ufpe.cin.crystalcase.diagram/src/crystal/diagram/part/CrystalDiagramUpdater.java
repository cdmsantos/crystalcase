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
import crystal.CrystalCase;
import crystal.CrystalPackage;
import crystal.Delete;
import crystal.Exception;
import crystal.Fetch;
import crystal.For;
import crystal.Function;
import crystal.If;
import crystal.Insert;
import crystal.Loop;
import crystal.Open;
import crystal.Parameters;
import crystal.Procedure;
import crystal.Select;
import crystal.Selector;
import crystal.SelectorTransition;
import crystal.Statements;
import crystal.Transition;
import crystal.Update;
import crystal.While;
import crystal.diagram.edit.parts.*;
import crystal.diagram.edit.parts.AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.AnonymousBlockEditPart;
import crystal.diagram.edit.parts.CallFunction2EditPart;
import crystal.diagram.edit.parts.CallFunction3EditPart;
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedure2EditPart;
import crystal.diagram.edit.parts.CallProcedure3EditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.Case2EditPart;
import crystal.diagram.edit.parts.Case3EditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.Close2EditPart;
import crystal.diagram.edit.parts.Close3EditPart;
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
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.Exception2EditPart;
import crystal.diagram.edit.parts.Exception3EditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.Fetch2EditPart;
import crystal.diagram.edit.parts.Fetch3EditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.For2EditPart;
import crystal.diagram.edit.parts.For3EditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.FunctionEditPart;
import crystal.diagram.edit.parts.FunctionFunctionDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionParametersCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionReturnPartCompartmentEditPart;
import crystal.diagram.edit.parts.If2EditPart;
import crystal.diagram.edit.parts.If3EditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.Insert2EditPart;
import crystal.diagram.edit.parts.Insert3EditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.Loop2EditPart;
import crystal.diagram.edit.parts.Loop3EditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.Open2EditPart;
import crystal.diagram.edit.parts.Open3EditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.ProcedureEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureParametersCompartmentEditPart;
import crystal.diagram.edit.parts.Records2EditPart;
import crystal.diagram.edit.parts.Records3EditPart;
import crystal.diagram.edit.parts.Records4EditPart;
import crystal.diagram.edit.parts.Records5EditPart;
import crystal.diagram.edit.parts.Records6EditPart;
import crystal.diagram.edit.parts.RecordsEditPart;
import crystal.diagram.edit.parts.Select2EditPart;
import crystal.diagram.edit.parts.Select3EditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.TransitionEditPart;
import crystal.diagram.edit.parts.Update2EditPart;
import crystal.diagram.edit.parts.Update3EditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
import crystal.diagram.edit.parts.While2EditPart;
import crystal.diagram.edit.parts.While3EditPart;
import crystal.diagram.edit.parts.WhileEditPart;
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
			return getProcedureProcedureDeclarativePartCompartment_7015SemanticChildren(view);
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureParametersCompartment_7020SemanticChildren(view);
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureExecutablePartCompartment_7021SemanticChildren(view);
		case IfIfIfsCompartmentEditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7028SemanticChildren(view);
		case IfIfElsesCompartmentEditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7029SemanticChildren(view);
		case IfIfIfsCompartment2EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7079SemanticChildren(view);
		case IfIfElsesCompartment2EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7080SemanticChildren(view);
		case CaseCaseCasesCompartmentEditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7081SemanticChildren(view);
		case SelectorSelectorCaseStatementsCompartmentEditPart.VISUAL_ID:
			return getSelectorSelectorCaseStatementsCompartment_7033SemanticChildren(view);
		case IfIfIfsCompartment3EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7034SemanticChildren(view);
		case IfIfElsesCompartment3EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7035SemanticChildren(view);
		case WhileWhileWhileStatementsCompartmentEditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7082SemanticChildren(view);
		case IfIfIfsCompartment4EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7037SemanticChildren(view);
		case IfIfElsesCompartment4EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7038SemanticChildren(view);
		case ForForForStatementsCompartmentEditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7083SemanticChildren(view);
		case IfIfIfsCompartment5EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7054SemanticChildren(view);
		case IfIfElsesCompartment5EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7055SemanticChildren(view);
		case LoopLoopLoopStatementsCompartmentEditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7084SemanticChildren(view);
		case IfIfIfsCompartment6EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7057SemanticChildren(view);
		case IfIfElsesCompartment6EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7058SemanticChildren(view);
		case IfIfIfsCompartment7EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7085SemanticChildren(view);
		case IfIfElsesCompartment7EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7086SemanticChildren(view);
		case CaseCaseCasesCompartment2EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7087SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment2EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7088SemanticChildren(view);
		case CaseCaseCasesCompartment3EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7043SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment3EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7025SemanticChildren(view);
		case ForForForStatementsCompartment2EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7059SemanticChildren(view);
		case CaseCaseCasesCompartment4EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7060SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment4EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7061SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment2EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7062SemanticChildren(view);
		case CaseCaseCasesCompartment5EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7063SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment5EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7064SemanticChildren(view);
		case ForForForStatementsCompartment3EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7065SemanticChildren(view);
		case ForForForStatementsCompartment4EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7066SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment3EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7067SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment4EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7068SemanticChildren(view);
		case ForForForStatementsCompartment5EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7089SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment5EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7090SemanticChildren(view);
		case CaseCaseCasesCompartment6EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7044SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment6EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7045SemanticChildren(view);
		case ForForForStatementsCompartment6EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7071SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment6EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7072SemanticChildren(view);
		case CaseCaseCasesCompartment7EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7046SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment7EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7024SemanticChildren(view);
		case ForForForStatementsCompartment7EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7073SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment7EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7074SemanticChildren(view);
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionDeclarativePartCompartment_7016SemanticChildren(view);
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParametersCompartment_7017SemanticChildren(view);
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionReturnPartCompartment_7022SemanticChildren(view);
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionExecutablePartCompartment_7023SemanticChildren(view);
		case IfIfIfsCompartment8EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7047SemanticChildren(view);
		case IfIfElsesCompartment8EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7048SemanticChildren(view);
		case CaseCaseCasesCompartment8EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7049SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment8EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7026SemanticChildren(view);
		case ForForForStatementsCompartment8EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7075SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment8EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7076SemanticChildren(view);
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockDeclarativePartCompartment_7018SemanticChildren(view);
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockExecutablePartCompartment_7019SemanticChildren(view);
		case IfIfIfsCompartment9EditPart.VISUAL_ID:
			return getIfIfIfsCompartment_7050SemanticChildren(view);
		case IfIfElsesCompartment9EditPart.VISUAL_ID:
			return getIfIfElsesCompartment_7051SemanticChildren(view);
		case CaseCaseCasesCompartment9EditPart.VISUAL_ID:
			return getCaseCaseCasesCompartment_7052SemanticChildren(view);
		case WhileWhileWhileStatementsCompartment9EditPart.VISUAL_ID:
			return getWhileWhileWhileStatementsCompartment_7027SemanticChildren(view);
		case ForForForStatementsCompartment9EditPart.VISUAL_ID:
			return getForForForStatementsCompartment_7077SemanticChildren(view);
		case LoopLoopLoopStatementsCompartment9EditPart.VISUAL_ID:
			return getLoopLoopLoopStatementsCompartment_7078SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getProcedures().iterator(); it.hasNext();) {
			Procedure childElement = (Procedure) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFunctions().iterator(); it.hasNext();) {
			Function childElement = (Function) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBlocks().iterator(); it.hasNext();) {
			AnonymousBlock childElement = (AnonymousBlock) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureDeclarativePartCompartment_7015SemanticChildren(
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
			Parameters childElement = (Parameters) it.next();
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureParametersCompartment_7020SemanticChildren(
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
			Parameters childElement = (Parameters) it.next();
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureExecutablePartCompartment_7021SemanticChildren(
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
			if (visualID == ExceptionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7028SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7029SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7079SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7080SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7081SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getSelectorSelectorCaseStatementsCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Selector modelElement = (Selector) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCaseStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7034SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7035SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7082SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7037SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7038SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7083SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7054SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7055SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7084SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7057SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7058SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7085SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7086SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7087SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7088SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7043SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7073SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7074SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionDeclarativePartCompartment_7016SemanticChildren(
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
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataType3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Collections3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Records3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Cursor3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getFunctionFunctionParametersCompartment_7017SemanticChildren(View view) {
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
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataType4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Collections4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Records4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Cursor4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getFunctionFunctionReturnPartCompartment_7022SemanticChildren(View view) {
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
			Parameters childElement = modelElement.getReturnPart();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataType5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
			if (visualID == Collections5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
			if (visualID == Records5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
			if (visualID == Cursor5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7059SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7060SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7061SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7062SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7063SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7064SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7065SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7066SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7067SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7068SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7089SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7090SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7044SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7045SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7071SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7072SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7046SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getFunctionFunctionExecutablePartCompartment_7023SemanticChildren(
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
			if (visualID == Exception8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction8EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7047SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7048SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7049SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7026SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7075SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7076SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getAnonymousBlockAnonymousBlockDeclarativePartCompartment_7018SemanticChildren(
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
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataType6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Collections6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Records6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Cursor6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getAnonymousBlockAnonymousBlockExecutablePartCompartment_7019SemanticChildren(
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
			if (visualID == Exception9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Insert9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Update9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Delete9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Select9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == For9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Open9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fetch9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Close9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallProcedure9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallFunction9EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getIfIfIfsCompartment_7050SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIfs().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
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
	public static List<CrystalNodeDescriptor> getIfIfElsesCompartment_7051SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		If modelElement = (If) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElses().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If7EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case2EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getCaseCaseCasesCompartment_7052SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Case modelElement = (Case) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCases().iterator(); it.hasNext();) {
			Selector childElement = (Selector) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectorEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalNodeDescriptor> getWhileWhileWhileStatementsCompartment_7027SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		While modelElement = (While) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWhileStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If4EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Case3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getForForForStatementsCompartment_7077SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		For modelElement = (For) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getForStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If5EditPart.VISUAL_ID) {
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
			if (visualID == Loop3EditPart.VISUAL_ID) {
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
	public static List<CrystalNodeDescriptor> getLoopLoopLoopStatementsCompartment_7078SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Loop modelElement = (Loop) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLoopStatements().iterator(); it.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Exception6EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If6EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Loop4EditPart.VISUAL_ID) {
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
	public static List<CrystalLinkDescriptor> getContainedLinks(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case CrystalEditPart.VISUAL_ID:
			return getCrystal_1000ContainedLinks(view);
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2007ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2008ContainedLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2009ContainedLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3052ContainedLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3053ContainedLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3054ContainedLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3055ContainedLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018ContainedLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019ContainedLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020ContainedLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021ContainedLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057ContainedLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3181ContainedLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3182ContainedLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3183ContainedLinks(view);
		case SelectorEditPart.VISUAL_ID:
			return getSelector_3108ContainedLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3109ContainedLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3110ContainedLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3184ContainedLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3185ContainedLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3186ContainedLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3187ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3188ContainedLinks(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3090ContainedLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3091ContainedLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3189ContainedLinks(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3151ContainedLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3152ContainedLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3190ContainedLinks(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3153ContainedLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3154ContainedLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3191ContainedLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3192ContainedLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3193ContainedLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3194ContainedLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3195ContainedLinks(view);
		case Exception7EditPart.VISUAL_ID:
			return getException_3196ContainedLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3197ContainedLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3198ContainedLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3199ContainedLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3200ContainedLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3201ContainedLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3202ContainedLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3203ContainedLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3092ContainedLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3093ContainedLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3094ContainedLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3095ContainedLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3096ContainedLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3097ContainedLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3098ContainedLinks(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3155ContainedLinks(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3156ContainedLinks(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3157ContainedLinks(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3158ContainedLinks(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3159ContainedLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3160ContainedLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3099ContainedLinks(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3161ContainedLinks(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3162ContainedLinks(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3163ContainedLinks(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3164ContainedLinks(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3165ContainedLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3166ContainedLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3100ContainedLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3101ContainedLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3102ContainedLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3103ContainedLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3104ContainedLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3167ContainedLinks(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3168ContainedLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3169ContainedLinks(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3170ContainedLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3171ContainedLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3172ContainedLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3173ContainedLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3174ContainedLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3175ContainedLinks(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3176ContainedLinks(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3177ContainedLinks(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3178ContainedLinks(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3179ContainedLinks(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3180ContainedLinks(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3204ContainedLinks(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3205ContainedLinks(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3206ContainedLinks(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3207ContainedLinks(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3208ContainedLinks(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3209ContainedLinks(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3210ContainedLinks(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3138ContainedLinks(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3139ContainedLinks(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3140ContainedLinks(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3141ContainedLinks(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3142ContainedLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3143ContainedLinks(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3144ContainedLinks(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3145ContainedLinks(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3146ContainedLinks(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3147ContainedLinks(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3148ContainedLinks(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3149ContainedLinks(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3150ContainedLinks(view);
		case Case7EditPart.VISUAL_ID:
			return getCase_3058ContainedLinks(view);
		case Insert7EditPart.VISUAL_ID:
			return getInsert_3059ContainedLinks(view);
		case Update7EditPart.VISUAL_ID:
			return getUpdate_3060ContainedLinks(view);
		case Delete7EditPart.VISUAL_ID:
			return getDelete_3061ContainedLinks(view);
		case Select7EditPart.VISUAL_ID:
			return getSelect_3062ContainedLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3063ContainedLinks(view);
		case For7EditPart.VISUAL_ID:
			return getFor_3064ContainedLinks(view);
		case Loop7EditPart.VISUAL_ID:
			return getLoop_3065ContainedLinks(view);
		case Open7EditPart.VISUAL_ID:
			return getOpen_3066ContainedLinks(view);
		case Fetch7EditPart.VISUAL_ID:
			return getFetch_3067ContainedLinks(view);
		case Close7EditPart.VISUAL_ID:
			return getClose_3068ContainedLinks(view);
		case CallProcedure7EditPart.VISUAL_ID:
			return getCallProcedure_3069ContainedLinks(view);
		case CallFunction7EditPart.VISUAL_ID:
			return getCallFunction_3070ContainedLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3071ContainedLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3072ContainedLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3073ContainedLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3074ContainedLinks(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3022ContainedLinks(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3023ContainedLinks(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3024ContainedLinks(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3025ContainedLinks(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3026ContainedLinks(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3027ContainedLinks(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3028ContainedLinks(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3029ContainedLinks(view);
		case Exception8EditPart.VISUAL_ID:
			return getException_3075ContainedLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3076ContainedLinks(view);
		case Case8EditPart.VISUAL_ID:
			return getCase_3077ContainedLinks(view);
		case Insert8EditPart.VISUAL_ID:
			return getInsert_3078ContainedLinks(view);
		case Update8EditPart.VISUAL_ID:
			return getUpdate_3079ContainedLinks(view);
		case Delete8EditPart.VISUAL_ID:
			return getDelete_3080ContainedLinks(view);
		case Select8EditPart.VISUAL_ID:
			return getSelect_3081ContainedLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3082ContainedLinks(view);
		case For8EditPart.VISUAL_ID:
			return getFor_3083ContainedLinks(view);
		case Loop8EditPart.VISUAL_ID:
			return getLoop_3084ContainedLinks(view);
		case Open8EditPart.VISUAL_ID:
			return getOpen_3085ContainedLinks(view);
		case Fetch8EditPart.VISUAL_ID:
			return getFetch_3086ContainedLinks(view);
		case Close8EditPart.VISUAL_ID:
			return getClose_3087ContainedLinks(view);
		case CallProcedure8EditPart.VISUAL_ID:
			return getCallProcedure_3088ContainedLinks(view);
		case CallFunction8EditPart.VISUAL_ID:
			return getCallFunction_3089ContainedLinks(view);
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033ContainedLinks(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034ContainedLinks(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035ContainedLinks(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036ContainedLinks(view);
		case Exception9EditPart.VISUAL_ID:
			return getException_3037ContainedLinks(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3038ContainedLinks(view);
		case Case9EditPart.VISUAL_ID:
			return getCase_3039ContainedLinks(view);
		case Insert9EditPart.VISUAL_ID:
			return getInsert_3040ContainedLinks(view);
		case Update9EditPart.VISUAL_ID:
			return getUpdate_3041ContainedLinks(view);
		case Delete9EditPart.VISUAL_ID:
			return getDelete_3042ContainedLinks(view);
		case Select9EditPart.VISUAL_ID:
			return getSelect_3043ContainedLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3044ContainedLinks(view);
		case For9EditPart.VISUAL_ID:
			return getFor_3045ContainedLinks(view);
		case Loop9EditPart.VISUAL_ID:
			return getLoop_3046ContainedLinks(view);
		case Open9EditPart.VISUAL_ID:
			return getOpen_3047ContainedLinks(view);
		case Fetch9EditPart.VISUAL_ID:
			return getFetch_3048ContainedLinks(view);
		case Close9EditPart.VISUAL_ID:
			return getClose_3049ContainedLinks(view);
		case CallProcedure9EditPart.VISUAL_ID:
			return getCallProcedure_3050ContainedLinks(view);
		case CallFunction9EditPart.VISUAL_ID:
			return getCallFunction_3051ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		case SelectorTransitionEditPart.VISUAL_ID:
			return getSelectorTransition_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIncomingLinks(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2007IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2008IncomingLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2009IncomingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3052IncomingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3053IncomingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3054IncomingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3055IncomingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018IncomingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019IncomingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020IncomingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021IncomingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057IncomingLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3181IncomingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3182IncomingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3183IncomingLinks(view);
		case SelectorEditPart.VISUAL_ID:
			return getSelector_3108IncomingLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3109IncomingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3110IncomingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3184IncomingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3185IncomingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3186IncomingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3187IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3188IncomingLinks(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3090IncomingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3091IncomingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3189IncomingLinks(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3151IncomingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3152IncomingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3190IncomingLinks(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3153IncomingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3154IncomingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3191IncomingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3192IncomingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3193IncomingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3194IncomingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3195IncomingLinks(view);
		case Exception7EditPart.VISUAL_ID:
			return getException_3196IncomingLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3197IncomingLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3198IncomingLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3199IncomingLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3200IncomingLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3201IncomingLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3202IncomingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3203IncomingLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3092IncomingLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3093IncomingLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3094IncomingLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3095IncomingLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3096IncomingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3097IncomingLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3098IncomingLinks(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3155IncomingLinks(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3156IncomingLinks(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3157IncomingLinks(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3158IncomingLinks(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3159IncomingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3160IncomingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3099IncomingLinks(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3161IncomingLinks(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3162IncomingLinks(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3163IncomingLinks(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3164IncomingLinks(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3165IncomingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3166IncomingLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3100IncomingLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3101IncomingLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3102IncomingLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3103IncomingLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3104IncomingLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3167IncomingLinks(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3168IncomingLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3169IncomingLinks(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3170IncomingLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3171IncomingLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3172IncomingLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3173IncomingLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3174IncomingLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3175IncomingLinks(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3176IncomingLinks(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3177IncomingLinks(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3178IncomingLinks(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3179IncomingLinks(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3180IncomingLinks(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3204IncomingLinks(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3205IncomingLinks(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3206IncomingLinks(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3207IncomingLinks(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3208IncomingLinks(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3209IncomingLinks(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3210IncomingLinks(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3138IncomingLinks(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3139IncomingLinks(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3140IncomingLinks(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3141IncomingLinks(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3142IncomingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3143IncomingLinks(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3144IncomingLinks(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3145IncomingLinks(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3146IncomingLinks(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3147IncomingLinks(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3148IncomingLinks(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3149IncomingLinks(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3150IncomingLinks(view);
		case Case7EditPart.VISUAL_ID:
			return getCase_3058IncomingLinks(view);
		case Insert7EditPart.VISUAL_ID:
			return getInsert_3059IncomingLinks(view);
		case Update7EditPart.VISUAL_ID:
			return getUpdate_3060IncomingLinks(view);
		case Delete7EditPart.VISUAL_ID:
			return getDelete_3061IncomingLinks(view);
		case Select7EditPart.VISUAL_ID:
			return getSelect_3062IncomingLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3063IncomingLinks(view);
		case For7EditPart.VISUAL_ID:
			return getFor_3064IncomingLinks(view);
		case Loop7EditPart.VISUAL_ID:
			return getLoop_3065IncomingLinks(view);
		case Open7EditPart.VISUAL_ID:
			return getOpen_3066IncomingLinks(view);
		case Fetch7EditPart.VISUAL_ID:
			return getFetch_3067IncomingLinks(view);
		case Close7EditPart.VISUAL_ID:
			return getClose_3068IncomingLinks(view);
		case CallProcedure7EditPart.VISUAL_ID:
			return getCallProcedure_3069IncomingLinks(view);
		case CallFunction7EditPart.VISUAL_ID:
			return getCallFunction_3070IncomingLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3071IncomingLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3072IncomingLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3073IncomingLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3074IncomingLinks(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3022IncomingLinks(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3023IncomingLinks(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3024IncomingLinks(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3025IncomingLinks(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3026IncomingLinks(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3027IncomingLinks(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3028IncomingLinks(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3029IncomingLinks(view);
		case Exception8EditPart.VISUAL_ID:
			return getException_3075IncomingLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3076IncomingLinks(view);
		case Case8EditPart.VISUAL_ID:
			return getCase_3077IncomingLinks(view);
		case Insert8EditPart.VISUAL_ID:
			return getInsert_3078IncomingLinks(view);
		case Update8EditPart.VISUAL_ID:
			return getUpdate_3079IncomingLinks(view);
		case Delete8EditPart.VISUAL_ID:
			return getDelete_3080IncomingLinks(view);
		case Select8EditPart.VISUAL_ID:
			return getSelect_3081IncomingLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3082IncomingLinks(view);
		case For8EditPart.VISUAL_ID:
			return getFor_3083IncomingLinks(view);
		case Loop8EditPart.VISUAL_ID:
			return getLoop_3084IncomingLinks(view);
		case Open8EditPart.VISUAL_ID:
			return getOpen_3085IncomingLinks(view);
		case Fetch8EditPart.VISUAL_ID:
			return getFetch_3086IncomingLinks(view);
		case Close8EditPart.VISUAL_ID:
			return getClose_3087IncomingLinks(view);
		case CallProcedure8EditPart.VISUAL_ID:
			return getCallProcedure_3088IncomingLinks(view);
		case CallFunction8EditPart.VISUAL_ID:
			return getCallFunction_3089IncomingLinks(view);
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033IncomingLinks(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034IncomingLinks(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035IncomingLinks(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036IncomingLinks(view);
		case Exception9EditPart.VISUAL_ID:
			return getException_3037IncomingLinks(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3038IncomingLinks(view);
		case Case9EditPart.VISUAL_ID:
			return getCase_3039IncomingLinks(view);
		case Insert9EditPart.VISUAL_ID:
			return getInsert_3040IncomingLinks(view);
		case Update9EditPart.VISUAL_ID:
			return getUpdate_3041IncomingLinks(view);
		case Delete9EditPart.VISUAL_ID:
			return getDelete_3042IncomingLinks(view);
		case Select9EditPart.VISUAL_ID:
			return getSelect_3043IncomingLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3044IncomingLinks(view);
		case For9EditPart.VISUAL_ID:
			return getFor_3045IncomingLinks(view);
		case Loop9EditPart.VISUAL_ID:
			return getLoop_3046IncomingLinks(view);
		case Open9EditPart.VISUAL_ID:
			return getOpen_3047IncomingLinks(view);
		case Fetch9EditPart.VISUAL_ID:
			return getFetch_3048IncomingLinks(view);
		case Close9EditPart.VISUAL_ID:
			return getClose_3049IncomingLinks(view);
		case CallProcedure9EditPart.VISUAL_ID:
			return getCallProcedure_3050IncomingLinks(view);
		case CallFunction9EditPart.VISUAL_ID:
			return getCallFunction_3051IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		case SelectorTransitionEditPart.VISUAL_ID:
			return getSelectorTransition_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOutgoingLinks(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2007OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2008OutgoingLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2009OutgoingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3052OutgoingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3053OutgoingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3054OutgoingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3055OutgoingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018OutgoingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019OutgoingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020OutgoingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021OutgoingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057OutgoingLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3181OutgoingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3182OutgoingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3183OutgoingLinks(view);
		case SelectorEditPart.VISUAL_ID:
			return getSelector_3108OutgoingLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3109OutgoingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3110OutgoingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3184OutgoingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3185OutgoingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3186OutgoingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3187OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3188OutgoingLinks(view);
		case Exception4EditPart.VISUAL_ID:
			return getException_3090OutgoingLinks(view);
		case If4EditPart.VISUAL_ID:
			return getIf_3091OutgoingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3189OutgoingLinks(view);
		case Exception5EditPart.VISUAL_ID:
			return getException_3151OutgoingLinks(view);
		case If5EditPart.VISUAL_ID:
			return getIf_3152OutgoingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3190OutgoingLinks(view);
		case Exception6EditPart.VISUAL_ID:
			return getException_3153OutgoingLinks(view);
		case If6EditPart.VISUAL_ID:
			return getIf_3154OutgoingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3191OutgoingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3192OutgoingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3193OutgoingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3194OutgoingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3195OutgoingLinks(view);
		case Exception7EditPart.VISUAL_ID:
			return getException_3196OutgoingLinks(view);
		case If7EditPart.VISUAL_ID:
			return getIf_3197OutgoingLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3198OutgoingLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3199OutgoingLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3200OutgoingLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3201OutgoingLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3202OutgoingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3203OutgoingLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3092OutgoingLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3093OutgoingLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3094OutgoingLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3095OutgoingLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3096OutgoingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3097OutgoingLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3098OutgoingLinks(view);
		case Case4EditPart.VISUAL_ID:
			return getCase_3155OutgoingLinks(view);
		case Insert4EditPart.VISUAL_ID:
			return getInsert_3156OutgoingLinks(view);
		case Update4EditPart.VISUAL_ID:
			return getUpdate_3157OutgoingLinks(view);
		case Delete4EditPart.VISUAL_ID:
			return getDelete_3158OutgoingLinks(view);
		case Select4EditPart.VISUAL_ID:
			return getSelect_3159OutgoingLinks(view);
		case While4EditPart.VISUAL_ID:
			return getWhile_3160OutgoingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3099OutgoingLinks(view);
		case Case5EditPart.VISUAL_ID:
			return getCase_3161OutgoingLinks(view);
		case Insert5EditPart.VISUAL_ID:
			return getInsert_3162OutgoingLinks(view);
		case Update5EditPart.VISUAL_ID:
			return getUpdate_3163OutgoingLinks(view);
		case Delete5EditPart.VISUAL_ID:
			return getDelete_3164OutgoingLinks(view);
		case Select5EditPart.VISUAL_ID:
			return getSelect_3165OutgoingLinks(view);
		case While5EditPart.VISUAL_ID:
			return getWhile_3166OutgoingLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3100OutgoingLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3101OutgoingLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3102OutgoingLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3103OutgoingLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3104OutgoingLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3167OutgoingLinks(view);
		case For4EditPart.VISUAL_ID:
			return getFor_3168OutgoingLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3169OutgoingLinks(view);
		case Loop4EditPart.VISUAL_ID:
			return getLoop_3170OutgoingLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3171OutgoingLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3172OutgoingLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3173OutgoingLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3174OutgoingLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3175OutgoingLinks(view);
		case Open4EditPart.VISUAL_ID:
			return getOpen_3176OutgoingLinks(view);
		case Fetch4EditPart.VISUAL_ID:
			return getFetch_3177OutgoingLinks(view);
		case Close4EditPart.VISUAL_ID:
			return getClose_3178OutgoingLinks(view);
		case CallProcedure4EditPart.VISUAL_ID:
			return getCallProcedure_3179OutgoingLinks(view);
		case CallFunction4EditPart.VISUAL_ID:
			return getCallFunction_3180OutgoingLinks(view);
		case For5EditPart.VISUAL_ID:
			return getFor_3204OutgoingLinks(view);
		case Loop5EditPart.VISUAL_ID:
			return getLoop_3205OutgoingLinks(view);
		case Open5EditPart.VISUAL_ID:
			return getOpen_3206OutgoingLinks(view);
		case Fetch5EditPart.VISUAL_ID:
			return getFetch_3207OutgoingLinks(view);
		case Close5EditPart.VISUAL_ID:
			return getClose_3208OutgoingLinks(view);
		case CallProcedure5EditPart.VISUAL_ID:
			return getCallProcedure_3209OutgoingLinks(view);
		case CallFunction5EditPart.VISUAL_ID:
			return getCallFunction_3210OutgoingLinks(view);
		case Case6EditPart.VISUAL_ID:
			return getCase_3138OutgoingLinks(view);
		case Insert6EditPart.VISUAL_ID:
			return getInsert_3139OutgoingLinks(view);
		case Update6EditPart.VISUAL_ID:
			return getUpdate_3140OutgoingLinks(view);
		case Delete6EditPart.VISUAL_ID:
			return getDelete_3141OutgoingLinks(view);
		case Select6EditPart.VISUAL_ID:
			return getSelect_3142OutgoingLinks(view);
		case While6EditPart.VISUAL_ID:
			return getWhile_3143OutgoingLinks(view);
		case For6EditPart.VISUAL_ID:
			return getFor_3144OutgoingLinks(view);
		case Loop6EditPart.VISUAL_ID:
			return getLoop_3145OutgoingLinks(view);
		case Open6EditPart.VISUAL_ID:
			return getOpen_3146OutgoingLinks(view);
		case Fetch6EditPart.VISUAL_ID:
			return getFetch_3147OutgoingLinks(view);
		case Close6EditPart.VISUAL_ID:
			return getClose_3148OutgoingLinks(view);
		case CallProcedure6EditPart.VISUAL_ID:
			return getCallProcedure_3149OutgoingLinks(view);
		case CallFunction6EditPart.VISUAL_ID:
			return getCallFunction_3150OutgoingLinks(view);
		case Case7EditPart.VISUAL_ID:
			return getCase_3058OutgoingLinks(view);
		case Insert7EditPart.VISUAL_ID:
			return getInsert_3059OutgoingLinks(view);
		case Update7EditPart.VISUAL_ID:
			return getUpdate_3060OutgoingLinks(view);
		case Delete7EditPart.VISUAL_ID:
			return getDelete_3061OutgoingLinks(view);
		case Select7EditPart.VISUAL_ID:
			return getSelect_3062OutgoingLinks(view);
		case While7EditPart.VISUAL_ID:
			return getWhile_3063OutgoingLinks(view);
		case For7EditPart.VISUAL_ID:
			return getFor_3064OutgoingLinks(view);
		case Loop7EditPart.VISUAL_ID:
			return getLoop_3065OutgoingLinks(view);
		case Open7EditPart.VISUAL_ID:
			return getOpen_3066OutgoingLinks(view);
		case Fetch7EditPart.VISUAL_ID:
			return getFetch_3067OutgoingLinks(view);
		case Close7EditPart.VISUAL_ID:
			return getClose_3068OutgoingLinks(view);
		case CallProcedure7EditPart.VISUAL_ID:
			return getCallProcedure_3069OutgoingLinks(view);
		case CallFunction7EditPart.VISUAL_ID:
			return getCallFunction_3070OutgoingLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3071OutgoingLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3072OutgoingLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3073OutgoingLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3074OutgoingLinks(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3022OutgoingLinks(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3023OutgoingLinks(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3024OutgoingLinks(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3025OutgoingLinks(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3026OutgoingLinks(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3027OutgoingLinks(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3028OutgoingLinks(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3029OutgoingLinks(view);
		case Exception8EditPart.VISUAL_ID:
			return getException_3075OutgoingLinks(view);
		case If8EditPart.VISUAL_ID:
			return getIf_3076OutgoingLinks(view);
		case Case8EditPart.VISUAL_ID:
			return getCase_3077OutgoingLinks(view);
		case Insert8EditPart.VISUAL_ID:
			return getInsert_3078OutgoingLinks(view);
		case Update8EditPart.VISUAL_ID:
			return getUpdate_3079OutgoingLinks(view);
		case Delete8EditPart.VISUAL_ID:
			return getDelete_3080OutgoingLinks(view);
		case Select8EditPart.VISUAL_ID:
			return getSelect_3081OutgoingLinks(view);
		case While8EditPart.VISUAL_ID:
			return getWhile_3082OutgoingLinks(view);
		case For8EditPart.VISUAL_ID:
			return getFor_3083OutgoingLinks(view);
		case Loop8EditPart.VISUAL_ID:
			return getLoop_3084OutgoingLinks(view);
		case Open8EditPart.VISUAL_ID:
			return getOpen_3085OutgoingLinks(view);
		case Fetch8EditPart.VISUAL_ID:
			return getFetch_3086OutgoingLinks(view);
		case Close8EditPart.VISUAL_ID:
			return getClose_3087OutgoingLinks(view);
		case CallProcedure8EditPart.VISUAL_ID:
			return getCallProcedure_3088OutgoingLinks(view);
		case CallFunction8EditPart.VISUAL_ID:
			return getCallFunction_3089OutgoingLinks(view);
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033OutgoingLinks(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034OutgoingLinks(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035OutgoingLinks(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036OutgoingLinks(view);
		case Exception9EditPart.VISUAL_ID:
			return getException_3037OutgoingLinks(view);
		case If9EditPart.VISUAL_ID:
			return getIf_3038OutgoingLinks(view);
		case Case9EditPart.VISUAL_ID:
			return getCase_3039OutgoingLinks(view);
		case Insert9EditPart.VISUAL_ID:
			return getInsert_3040OutgoingLinks(view);
		case Update9EditPart.VISUAL_ID:
			return getUpdate_3041OutgoingLinks(view);
		case Delete9EditPart.VISUAL_ID:
			return getDelete_3042OutgoingLinks(view);
		case Select9EditPart.VISUAL_ID:
			return getSelect_3043OutgoingLinks(view);
		case While9EditPart.VISUAL_ID:
			return getWhile_3044OutgoingLinks(view);
		case For9EditPart.VISUAL_ID:
			return getFor_3045OutgoingLinks(view);
		case Loop9EditPart.VISUAL_ID:
			return getLoop_3046OutgoingLinks(view);
		case Open9EditPart.VISUAL_ID:
			return getOpen_3047OutgoingLinks(view);
		case Fetch9EditPart.VISUAL_ID:
			return getFetch_3048OutgoingLinks(view);
		case Close9EditPart.VISUAL_ID:
			return getClose_3049OutgoingLinks(view);
		case CallProcedure9EditPart.VISUAL_ID:
			return getCallProcedure_3050OutgoingLinks(view);
		case CallFunction9EditPart.VISUAL_ID:
			return getCallFunction_3051OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		case SelectorTransitionEditPart.VISUAL_ID:
			return getSelectorTransition_4002OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_SelectorTransition_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getProcedure_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFunction_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDataType_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3181ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3182ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3183ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelector_3108ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3109ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3110ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3184ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3185ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3186ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3187ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3188ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3090ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3091ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3189ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3151ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3152ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3190ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3153ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3154ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3191ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3192ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3193ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3194ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3195ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3196ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3197ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3198ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3199ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3200ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3201ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3202ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3203ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3092ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3093ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3094ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3095ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3096ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3097ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3098ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3155ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3156ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3157ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3158ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3159ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3160ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3099ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3161ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3162ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3163ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3164ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3165ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3166ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3100ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3101ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3102ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3103ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3104ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3167ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3168ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3169ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3170ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3171ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3172ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3173ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3174ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3175ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3176ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3177ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3178ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3179ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3180ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3204ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3205ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3206ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3207ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3208ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3209ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3210ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3138ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3139ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3140ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3141ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3142ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3143ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3144ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3145ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3146ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3147ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3148ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3149ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3150ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3064ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3065ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3066ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3067ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3068ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3069ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3070ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3025ContainedLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDataType_3071ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3072ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3073ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3074ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3075ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3076ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3077ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3078ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3079ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3080ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3081ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3082ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3083ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3084ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3085ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3086ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3087ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3088ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3089ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDataType_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3051ContainedLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelectorTransition_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getProcedure_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFunction_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDataType_3052IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3056IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3057IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getException_3181IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3182IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3183IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelector_3108IncomingLinks(View view) {
		Selector modelElement = (Selector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SelectorTransition_4002(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3109IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3110IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3184IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3185IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3186IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3187IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3188IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3058IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3059IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3060IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3061IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3062IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3063IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getException_3090IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3091IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3189IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getException_3151IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3152IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3190IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getException_3153IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3154IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3191IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3192IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3193IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3194IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3195IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getException_3196IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3197IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3198IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3199IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3200IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3201IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3202IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3203IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3092IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3093IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3094IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3095IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3096IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3097IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3098IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3155IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3156IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3157IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3158IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3159IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3160IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3099IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3161IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3162IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3163IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3164IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3165IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3166IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3100IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3101IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3102IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3103IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3104IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3167IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3168IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3169IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3170IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3171IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3172IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3173IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3174IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3175IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3176IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3177IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3178IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3179IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3180IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3204IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3205IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3206IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3207IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3208IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3209IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3210IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3138IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3139IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3140IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3141IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3142IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3143IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3144IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3145IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3146IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3147IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3148IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3149IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3150IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3064IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3065IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3066IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3067IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3068IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3069IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3070IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDataType_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3025IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDataType_3071IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3072IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3073IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3074IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3075IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3076IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3077IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3078IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3079IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3080IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3081IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3082IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3083IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3084IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3085IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3086IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3087IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3088IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3089IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDataType_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3037IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getIf_3038IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCase_3039IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getInsert_3040IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getUpdate_3041IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDelete_3042IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getSelect_3043IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getWhile_3044IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFor_3045IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getLoop_3046IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getOpen_3047IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getFetch_3048IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getClose_3049IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallProcedure_3050IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getCallFunction_3051IncomingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getTransition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelectorTransition_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getProcedure_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFunction_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDataType_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3054OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3056OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3057OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3181OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3182OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3183OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelector_3108OutgoingLinks(View view) {
		Selector modelElement = (Selector) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SelectorTransition_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3109OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3110OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3184OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3185OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3186OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3187OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3188OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3058OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3059OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3060OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3061OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3062OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3063OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3090OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3091OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3189OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3151OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3152OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3190OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3153OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3154OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3191OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3192OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3193OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3194OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3195OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3196OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3197OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3198OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3199OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3200OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3201OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3202OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3203OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3092OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3093OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3094OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3095OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3096OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3097OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3098OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3155OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3156OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3157OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3158OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3159OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3160OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3099OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3161OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3162OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3163OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3164OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3165OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3166OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3100OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3101OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3102OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3103OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3104OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3167OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3168OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3169OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3170OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3171OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3172OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3173OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3174OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3175OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3176OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3177OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3178OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3179OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3180OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3204OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3205OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3206OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3207OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3208OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3209OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3210OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3138OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3139OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3140OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3141OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3142OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3143OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3144OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3145OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3146OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3147OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3148OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3149OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3150OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3064OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3065OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3066OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3067OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3068OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3069OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3070OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3025OutgoingLinks(View view) {
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
	public static List<CrystalLinkDescriptor> getDataType_3071OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3072OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3073OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3074OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3075OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3076OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3077OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3078OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3079OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3080OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3081OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3082OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3083OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3084OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3085OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3086OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3087OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3088OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3089OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDataType_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCollections_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getRecords_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCursor_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getException_3037OutgoingLinks(View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getIf_3038OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCase_3039OutgoingLinks(View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getInsert_3040OutgoingLinks(View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getUpdate_3041OutgoingLinks(View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getDelete_3042OutgoingLinks(View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getSelect_3043OutgoingLinks(View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getWhile_3044OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFor_3045OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getLoop_3046OutgoingLinks(View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getOpen_3047OutgoingLinks(View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getFetch_3048OutgoingLinks(View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getClose_3049OutgoingLinks(View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallProcedure_3050OutgoingLinks(View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<CrystalLinkDescriptor> getCallFunction_3051OutgoingLinks(View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
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
	public static List<CrystalLinkDescriptor> getSelectorTransition_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<CrystalLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			Crystal container) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
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
	private static Collection<CrystalLinkDescriptor> getContainedTypeModelFacetLinks_SelectorTransition_4002(
			Crystal container) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getSelectorTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SelectorTransition) {
				continue;
			}
			SelectorTransition link = (SelectorTransition) linkObject;
			if (SelectorTransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Selector dst = link.getTarget();
			Selector src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, dst, link, CrystalElementTypes.SelectorTransition_4002,
					SelectorTransitionEditPart.VISUAL_ID));
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
	private static Collection<CrystalLinkDescriptor> getIncomingTypeModelFacetLinks_SelectorTransition_4002(
			Selector target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CrystalPackage.eINSTANCE.getSelectorTransition_Target()
					|| false == setting.getEObject() instanceof SelectorTransition) {
				continue;
			}
			SelectorTransition link = (SelectorTransition) setting.getEObject();
			if (SelectorTransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Selector src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, target, link, CrystalElementTypes.SelectorTransition_4002,
					SelectorTransitionEditPart.VISUAL_ID));
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
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
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
	private static Collection<CrystalLinkDescriptor> getOutgoingTypeModelFacetLinks_SelectorTransition_4002(
			Selector source) {
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
		for (Iterator<?> links = container.getSelectorTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SelectorTransition) {
				continue;
			}
			SelectorTransition link = (SelectorTransition) linkObject;
			if (SelectorTransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Selector dst = link.getTarget();
			Selector src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CrystalLinkDescriptor(src, dst, link, CrystalElementTypes.SelectorTransition_4002,
					SelectorTransitionEditPart.VISUAL_ID));
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
