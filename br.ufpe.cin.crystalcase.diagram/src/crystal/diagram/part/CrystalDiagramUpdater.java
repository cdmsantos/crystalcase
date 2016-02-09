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
import crystal.diagram.edit.parts.FunctionFunctionDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionParametersCompartmentEditPart;
import crystal.diagram.edit.parts.FunctionFunctionReturnPartCompartmentEditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.ProcedureEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureDeclarativePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureExecutablePartCompartmentEditPart;
import crystal.diagram.edit.parts.ProcedureProcedureParametersCompartmentEditPart;
import crystal.diagram.edit.parts.Records2EditPart;
import crystal.diagram.edit.parts.Records3EditPart;
import crystal.diagram.edit.parts.Records4EditPart;
import crystal.diagram.edit.parts.RecordsEditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.TransitionEditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
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
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<CrystalNodeDescriptor> getSemanticChildren(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case CrystalEditPart.VISUAL_ID:
			return getCrystal_1000SemanticChildren(view);
		case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureDeclarativePartCompartment_7001SemanticChildren(view);
		case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureExecutablePartCompartment_7002SemanticChildren(view);
		case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
			return getProcedureProcedureParametersCompartment_7003SemanticChildren(view);
		case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionDeclarativePartCompartment_7004SemanticChildren(view);
		case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionExecutablePartCompartment_7005SemanticChildren(view);
		case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionParametersCompartment_7006SemanticChildren(view);
		case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionReturnPartCompartment_7007SemanticChildren(view);
		case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockDeclarativePartCompartment_7008SemanticChildren(view);
		case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
			return getAnonymousBlockAnonymousBlockExecutablePartCompartment_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalNodeDescriptor> getCrystal_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Crystal modelElement = (Crystal) view.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcedures().iterator(); it
				.hasNext();) {
			Procedure childElement = (Procedure) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProcedureEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFunctions().iterator(); it
				.hasNext();) {
			Function childElement = (Function) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new CrystalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBlocks().iterator(); it.hasNext();) {
			AnonymousBlock childElement = (AnonymousBlock) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureDeclarativePartCompartment_7001SemanticChildren(
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
		for (Iterator<?> it = modelElement.getDeclarativePart().iterator(); it
				.hasNext();) {
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureExecutablePartCompartment_7002SemanticChildren(
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
		for (Iterator<?> it = modelElement.getExecutablePart().iterator(); it
				.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getProcedureProcedureParametersCompartment_7003SemanticChildren(
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
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionDeclarativePartCompartment_7004SemanticChildren(
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
		for (Iterator<?> it = modelElement.getDeclarativePart().iterator(); it
				.hasNext();) {
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionExecutablePartCompartment_7005SemanticChildren(
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
		for (Iterator<?> it = modelElement.getExecutablePart().iterator(); it
				.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionParametersCompartment_7006SemanticChildren(
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
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getFunctionFunctionReturnPartCompartment_7007SemanticChildren(
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
		for (Iterator<?> it = modelElement.getReturnPart().iterator(); it
				.hasNext();) {
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getAnonymousBlockAnonymousBlockDeclarativePartCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AnonymousBlock modelElement = (AnonymousBlock) containerView
				.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeclarativePart().iterator(); it
				.hasNext();) {
			Parameters childElement = (Parameters) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalNodeDescriptor> getAnonymousBlockAnonymousBlockExecutablePartCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AnonymousBlock modelElement = (AnonymousBlock) containerView
				.getElement();
		LinkedList<CrystalNodeDescriptor> result = new LinkedList<CrystalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExecutablePart().iterator(); it
				.hasNext();) {
			Statements childElement = (Statements) it.next();
			int visualID = CrystalVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
	public static List<CrystalLinkDescriptor> getContainedLinks(View view) {
		switch (CrystalVisualIDRegistry.getVisualID(view)) {
		case CrystalEditPart.VISUAL_ID:
			return getCrystal_1000ContainedLinks(view);
		case ProcedureEditPart.VISUAL_ID:
			return getProcedure_2001ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2002ContainedLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2003ContainedLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3001ContainedLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3002ContainedLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3003ContainedLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3004ContainedLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3005ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3006ContainedLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3007ContainedLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3008ContainedLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3009ContainedLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3010ContainedLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3011ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3012ContainedLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3013ContainedLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3014ContainedLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3015ContainedLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3016ContainedLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3017ContainedLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3031ContainedLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3032ContainedLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018ContainedLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019ContainedLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020ContainedLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021ContainedLinks(view);
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
			return getProcedure_2001IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2002IncomingLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2003IncomingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3001IncomingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3002IncomingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3003IncomingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3004IncomingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3005IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3006IncomingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3007IncomingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3008IncomingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3009IncomingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3010IncomingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3011IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3012IncomingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3013IncomingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3014IncomingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3015IncomingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3016IncomingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3017IncomingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3031IncomingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3032IncomingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018IncomingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019IncomingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020IncomingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021IncomingLinks(view);
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
			return getProcedure_2001OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_2002OutgoingLinks(view);
		case AnonymousBlockEditPart.VISUAL_ID:
			return getAnonymousBlock_2003OutgoingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3001OutgoingLinks(view);
		case CollectionsEditPart.VISUAL_ID:
			return getCollections_3002OutgoingLinks(view);
		case RecordsEditPart.VISUAL_ID:
			return getRecords_3003OutgoingLinks(view);
		case CursorEditPart.VISUAL_ID:
			return getCursor_3004OutgoingLinks(view);
		case ExceptionEditPart.VISUAL_ID:
			return getException_3005OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_3006OutgoingLinks(view);
		case CaseEditPart.VISUAL_ID:
			return getCase_3007OutgoingLinks(view);
		case InsertEditPart.VISUAL_ID:
			return getInsert_3008OutgoingLinks(view);
		case UpdateEditPart.VISUAL_ID:
			return getUpdate_3009OutgoingLinks(view);
		case DeleteEditPart.VISUAL_ID:
			return getDelete_3010OutgoingLinks(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3011OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_3012OutgoingLinks(view);
		case ForEditPart.VISUAL_ID:
			return getFor_3013OutgoingLinks(view);
		case LoopEditPart.VISUAL_ID:
			return getLoop_3014OutgoingLinks(view);
		case OpenEditPart.VISUAL_ID:
			return getOpen_3015OutgoingLinks(view);
		case FetchEditPart.VISUAL_ID:
			return getFetch_3016OutgoingLinks(view);
		case CloseEditPart.VISUAL_ID:
			return getClose_3017OutgoingLinks(view);
		case CallProcedureEditPart.VISUAL_ID:
			return getCallProcedure_3031OutgoingLinks(view);
		case CallFunctionEditPart.VISUAL_ID:
			return getCallFunction_3032OutgoingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_3018OutgoingLinks(view);
		case Collections2EditPart.VISUAL_ID:
			return getCollections_3019OutgoingLinks(view);
		case Records2EditPart.VISUAL_ID:
			return getRecords_3020OutgoingLinks(view);
		case Cursor2EditPart.VISUAL_ID:
			return getCursor_3021OutgoingLinks(view);
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
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCrystal_1000ContainedLinks(
			View view) {
		Crystal modelElement = (Crystal) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getProcedure_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFunction_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getProcedure_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFunction_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3005IncomingLinks(
			View view) {
		Exception modelElement = (Exception) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3006IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3007IncomingLinks(
			View view) {
		Case modelElement = (Case) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3008IncomingLinks(
			View view) {
		Insert modelElement = (Insert) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3009IncomingLinks(
			View view) {
		Update modelElement = (Update) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3010IncomingLinks(
			View view) {
		Delete modelElement = (Delete) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3011IncomingLinks(
			View view) {
		Select modelElement = (Select) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3012IncomingLinks(
			View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3013IncomingLinks(View view) {
		For modelElement = (For) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3014IncomingLinks(
			View view) {
		Loop modelElement = (Loop) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3015IncomingLinks(
			View view) {
		Open modelElement = (Open) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3016IncomingLinks(
			View view) {
		Fetch modelElement = (Fetch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3017IncomingLinks(
			View view) {
		Close modelElement = (Close) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3031IncomingLinks(
			View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3032IncomingLinks(
			View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3026IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3027IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3028IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3029IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getProcedure_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFunction_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getAnonymousBlock_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getException_3005OutgoingLinks(
			View view) {
		Exception modelElement = (Exception) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getIf_3006OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCase_3007OutgoingLinks(
			View view) {
		Case modelElement = (Case) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getInsert_3008OutgoingLinks(
			View view) {
		Insert modelElement = (Insert) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getUpdate_3009OutgoingLinks(
			View view) {
		Update modelElement = (Update) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDelete_3010OutgoingLinks(
			View view) {
		Delete modelElement = (Delete) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getSelect_3011OutgoingLinks(
			View view) {
		Select modelElement = (Select) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getWhile_3012OutgoingLinks(
			View view) {
		While modelElement = (While) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFor_3013OutgoingLinks(View view) {
		For modelElement = (For) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getLoop_3014OutgoingLinks(
			View view) {
		Loop modelElement = (Loop) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getOpen_3015OutgoingLinks(
			View view) {
		Open modelElement = (Open) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getFetch_3016OutgoingLinks(
			View view) {
		Fetch modelElement = (Fetch) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getClose_3017OutgoingLinks(
			View view) {
		Close modelElement = (Close) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallProcedure_3031OutgoingLinks(
			View view) {
		CallProcedure modelElement = (CallProcedure) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCallFunction_3032OutgoingLinks(
			View view) {
		CallFunction modelElement = (CallFunction) view.getElement();
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getDataType_3026OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCollections_3027OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getRecords_3028OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getCursor_3029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrystalLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CrystalLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			Crystal container) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statements dst = link.getTarget();
			Statements src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, dst, link,
					CrystalElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrystalLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			Statements target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CrystalPackage.eINSTANCE
					.getTransition_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statements src = link.getSource();
			result.add(new CrystalLinkDescriptor(src, target, link,
					CrystalElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrystalLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			Statements source) {
		Crystal container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Crystal) {
				container = (Crystal) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CrystalLinkDescriptor> result = new LinkedList<CrystalLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != CrystalVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statements dst = link.getTarget();
			Statements src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CrystalLinkDescriptor(src, dst, link,
					CrystalElementTypes.Transition_4001,
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
