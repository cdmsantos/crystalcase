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
import crystal.Statements;
import crystal.Transition;
import crystal.Update;
import crystal.While;
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
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureParametersCompartment_7015SemanticChildren(view);
		case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureDeclarativePartCompartment_7020SemanticChildren(view);
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureExecutablePartCompartment_7021SemanticChildren(view);
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParametersCompartment_7016SemanticChildren(view);
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionReturnPartCompartment_7017SemanticChildren(view);
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionDeclarativePartCompartment_7022SemanticChildren(view);
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionExecutablePartCompartment_7023SemanticChildren(view);
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockDeclarativePartCompartment_7018SemanticChildren(view);
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockExecutablePartCompartment_7019SemanticChildren(view);
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureParametersCompartment_7015SemanticChildren(
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureDeclarativePartCompartment_7020SemanticChildren(
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionParametersCompartment_7016SemanticChildren(View view) {
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionReturnPartCompartment_7017SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReturnPart().iterator(); it.hasNext();) {
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionDeclarativePartCompartment_7022SemanticChildren(
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
			if (visualID == DataType5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Collections5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Records5EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Cursor5EditPart.VISUAL_ID) {
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
			if (visualID == Exception2EditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == If2EditPart.VISUAL_ID) {
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
			if (visualID == For3EditPart.VISUAL_ID) {
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
			return getDataType_3018ContainedLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3019ContainedLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3020ContainedLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3021ContainedLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3052ContainedLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3053ContainedLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3054ContainedLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3055ContainedLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057ContainedLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3058ContainedLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3059ContainedLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3060ContainedLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3061ContainedLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3062ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3063ContainedLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3064ContainedLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3065ContainedLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3066ContainedLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3067ContainedLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3068ContainedLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3069ContainedLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3070ContainedLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3022ContainedLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3023ContainedLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3024ContainedLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3025ContainedLinks(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3026ContainedLinks(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3027ContainedLinks(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3028ContainedLinks(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3029ContainedLinks(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3071ContainedLinks(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3072ContainedLinks(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3073ContainedLinks(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3074ContainedLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3075ContainedLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3076ContainedLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3077ContainedLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3078ContainedLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3079ContainedLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3080ContainedLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3081ContainedLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3082ContainedLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3083ContainedLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3084ContainedLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3085ContainedLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3086ContainedLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3087ContainedLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3088ContainedLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3089ContainedLinks(view);
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033ContainedLinks(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034ContainedLinks(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035ContainedLinks(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036ContainedLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3037ContainedLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3038ContainedLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3039ContainedLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3040ContainedLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3041ContainedLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3042ContainedLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3043ContainedLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3044ContainedLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3045ContainedLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3046ContainedLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3047ContainedLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3048ContainedLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3049ContainedLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3050ContainedLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3051ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
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
			return getDataType_3018IncomingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3019IncomingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3020IncomingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3021IncomingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3052IncomingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3053IncomingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3054IncomingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3055IncomingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057IncomingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3058IncomingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3059IncomingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3060IncomingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3061IncomingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3062IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3063IncomingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3064IncomingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3065IncomingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3066IncomingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3067IncomingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3068IncomingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3069IncomingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3070IncomingLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3022IncomingLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3023IncomingLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3024IncomingLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3025IncomingLinks(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3026IncomingLinks(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3027IncomingLinks(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3028IncomingLinks(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3029IncomingLinks(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3071IncomingLinks(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3072IncomingLinks(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3073IncomingLinks(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3074IncomingLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3075IncomingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3076IncomingLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3077IncomingLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3078IncomingLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3079IncomingLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3080IncomingLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3081IncomingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3082IncomingLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3083IncomingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3084IncomingLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3085IncomingLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3086IncomingLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3087IncomingLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3088IncomingLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3089IncomingLinks(view);
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033IncomingLinks(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034IncomingLinks(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035IncomingLinks(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036IncomingLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3037IncomingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3038IncomingLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3039IncomingLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3040IncomingLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3041IncomingLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3042IncomingLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3043IncomingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3044IncomingLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3045IncomingLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3046IncomingLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3047IncomingLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3048IncomingLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3049IncomingLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3050IncomingLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3051IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
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
			return getDataType_3018OutgoingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3019OutgoingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3020OutgoingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3021OutgoingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3052OutgoingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3053OutgoingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3054OutgoingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3055OutgoingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3056OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3057OutgoingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3058OutgoingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3059OutgoingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3060OutgoingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3061OutgoingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3062OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3063OutgoingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3064OutgoingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3065OutgoingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3066OutgoingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3067OutgoingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3068OutgoingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3069OutgoingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3070OutgoingLinks(view);
		case DataType3EditPart.VISUAL_ID:
			return getDataType_3022OutgoingLinks(view);
		case Collections3EditPart.VISUAL_ID:
			return getCollections_3023OutgoingLinks(view);
		case Records3EditPart.VISUAL_ID:
			return getRecords_3024OutgoingLinks(view);
		case Cursor3EditPart.VISUAL_ID:
			return getCursor_3025OutgoingLinks(view);
		case DataType4EditPart.VISUAL_ID:
			return getDataType_3026OutgoingLinks(view);
		case Collections4EditPart.VISUAL_ID:
			return getCollections_3027OutgoingLinks(view);
		case Records4EditPart.VISUAL_ID:
			return getRecords_3028OutgoingLinks(view);
		case Cursor4EditPart.VISUAL_ID:
			return getCursor_3029OutgoingLinks(view);
		case DataType5EditPart.VISUAL_ID:
			return getDataType_3071OutgoingLinks(view);
		case Collections5EditPart.VISUAL_ID:
			return getCollections_3072OutgoingLinks(view);
		case Records5EditPart.VISUAL_ID:
			return getRecords_3073OutgoingLinks(view);
		case Cursor5EditPart.VISUAL_ID:
			return getCursor_3074OutgoingLinks(view);
		case Exception2EditPart.VISUAL_ID:
			return getException_3075OutgoingLinks(view);
		case If2EditPart.VISUAL_ID:
			return getIf_3076OutgoingLinks(view);
		case Case2EditPart.VISUAL_ID:
			return getCase_3077OutgoingLinks(view);
		case Insert2EditPart.VISUAL_ID:
			return getInsert_3078OutgoingLinks(view);
		case Update2EditPart.VISUAL_ID:
			return getUpdate_3079OutgoingLinks(view);
		case Delete2EditPart.VISUAL_ID:
			return getDelete_3080OutgoingLinks(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3081OutgoingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3082OutgoingLinks(view);
		case For2EditPart.VISUAL_ID:
			return getFor_3083OutgoingLinks(view);
		case Loop2EditPart.VISUAL_ID:
			return getLoop_3084OutgoingLinks(view);
		case Open2EditPart.VISUAL_ID:
			return getOpen_3085OutgoingLinks(view);
		case Fetch2EditPart.VISUAL_ID:
			return getFetch_3086OutgoingLinks(view);
		case Close2EditPart.VISUAL_ID:
			return getClose_3087OutgoingLinks(view);
		case CallProcedure2EditPart.VISUAL_ID:
			return getCallProcedure_3088OutgoingLinks(view);
		case CallFunction2EditPart.VISUAL_ID:
			return getCallFunction_3089OutgoingLinks(view);
		case DataType6EditPart.VISUAL_ID:
			return getDataType_3033OutgoingLinks(view);
		case Collections6EditPart.VISUAL_ID:
			return getCollections_3034OutgoingLinks(view);
		case Records6EditPart.VISUAL_ID:
			return getRecords_3035OutgoingLinks(view);
		case Cursor6EditPart.VISUAL_ID:
			return getCursor_3036OutgoingLinks(view);
		case Exception3EditPart.VISUAL_ID:
			return getException_3037OutgoingLinks(view);
		case If3EditPart.VISUAL_ID:
			return getIf_3038OutgoingLinks(view);
		case Case3EditPart.VISUAL_ID:
			return getCase_3039OutgoingLinks(view);
		case Insert3EditPart.VISUAL_ID:
			return getInsert_3040OutgoingLinks(view);
		case Update3EditPart.VISUAL_ID:
			return getUpdate_3041OutgoingLinks(view);
		case Delete3EditPart.VISUAL_ID:
			return getDelete_3042OutgoingLinks(view);
		case Select3EditPart.VISUAL_ID:
			return getSelect_3043OutgoingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3044OutgoingLinks(view);
		case For3EditPart.VISUAL_ID:
			return getFor_3045OutgoingLinks(view);
		case Loop3EditPart.VISUAL_ID:
			return getLoop_3046OutgoingLinks(view);
		case Open3EditPart.VISUAL_ID:
			return getOpen_3047OutgoingLinks(view);
		case Fetch3EditPart.VISUAL_ID:
			return getFetch_3048OutgoingLinks(view);
		case Close3EditPart.VISUAL_ID:
			return getClose_3049OutgoingLinks(view);
		case CallProcedure3EditPart.VISUAL_ID:
			return getCallProcedure_3050OutgoingLinks(view);
		case CallFunction3EditPart.VISUAL_ID:
			return getCallFunction_3051OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
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
