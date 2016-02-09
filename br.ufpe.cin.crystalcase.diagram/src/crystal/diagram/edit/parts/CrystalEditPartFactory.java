/*
 * 
 */
package crystal.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class CrystalEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CrystalVisualIDRegistry.getVisualID(view)) {

			case CrystalEditPart.VISUAL_ID:
				return new CrystalEditPart(view);

			case ProcedureEditPart.VISUAL_ID:
				return new ProcedureEditPart(view);

			case ProcedureNameEditPart.VISUAL_ID:
				return new ProcedureNameEditPart(view);

			case FunctionEditPart.VISUAL_ID:
				return new FunctionEditPart(view);

			case FunctionNameEditPart.VISUAL_ID:
				return new FunctionNameEditPart(view);

			case AnonymousBlockEditPart.VISUAL_ID:
				return new AnonymousBlockEditPart(view);

			case AnonymousBlockNameEditPart.VISUAL_ID:
				return new AnonymousBlockNameEditPart(view);

			case DataTypeEditPart.VISUAL_ID:
				return new DataTypeEditPart(view);

			case DataTypeNameEditPart.VISUAL_ID:
				return new DataTypeNameEditPart(view);

			case CollectionsEditPart.VISUAL_ID:
				return new CollectionsEditPart(view);

			case CollectionsNameEditPart.VISUAL_ID:
				return new CollectionsNameEditPart(view);

			case RecordsEditPart.VISUAL_ID:
				return new RecordsEditPart(view);

			case RecordsNameEditPart.VISUAL_ID:
				return new RecordsNameEditPart(view);

			case CursorEditPart.VISUAL_ID:
				return new CursorEditPart(view);

			case CursorNameEditPart.VISUAL_ID:
				return new CursorNameEditPart(view);

			case ExceptionEditPart.VISUAL_ID:
				return new ExceptionEditPart(view);

			case ExceptionDescriptionEditPart.VISUAL_ID:
				return new ExceptionDescriptionEditPart(view);

			case IfEditPart.VISUAL_ID:
				return new IfEditPart(view);

			case IfDescriptionEditPart.VISUAL_ID:
				return new IfDescriptionEditPart(view);

			case CaseEditPart.VISUAL_ID:
				return new CaseEditPart(view);

			case CaseDescriptionEditPart.VISUAL_ID:
				return new CaseDescriptionEditPart(view);

			case InsertEditPart.VISUAL_ID:
				return new InsertEditPart(view);

			case InsertDescriptionEditPart.VISUAL_ID:
				return new InsertDescriptionEditPart(view);

			case UpdateEditPart.VISUAL_ID:
				return new UpdateEditPart(view);

			case UpdateDescriptionEditPart.VISUAL_ID:
				return new UpdateDescriptionEditPart(view);

			case DeleteEditPart.VISUAL_ID:
				return new DeleteEditPart(view);

			case DeleteDescriptionEditPart.VISUAL_ID:
				return new DeleteDescriptionEditPart(view);

			case SelectEditPart.VISUAL_ID:
				return new SelectEditPart(view);

			case SelectDescriptionEditPart.VISUAL_ID:
				return new SelectDescriptionEditPart(view);

			case WhileEditPart.VISUAL_ID:
				return new WhileEditPart(view);

			case WhileDescriptionEditPart.VISUAL_ID:
				return new WhileDescriptionEditPart(view);

			case ForEditPart.VISUAL_ID:
				return new ForEditPart(view);

			case ForDescriptionEditPart.VISUAL_ID:
				return new ForDescriptionEditPart(view);

			case LoopEditPart.VISUAL_ID:
				return new LoopEditPart(view);

			case LoopDescriptionEditPart.VISUAL_ID:
				return new LoopDescriptionEditPart(view);

			case OpenEditPart.VISUAL_ID:
				return new OpenEditPart(view);

			case OpenDescriptionEditPart.VISUAL_ID:
				return new OpenDescriptionEditPart(view);

			case FetchEditPart.VISUAL_ID:
				return new FetchEditPart(view);

			case FetchDescriptionEditPart.VISUAL_ID:
				return new FetchDescriptionEditPart(view);

			case CloseEditPart.VISUAL_ID:
				return new CloseEditPart(view);

			case CloseDescriptionEditPart.VISUAL_ID:
				return new CloseDescriptionEditPart(view);

			case CallProcedureEditPart.VISUAL_ID:
				return new CallProcedureEditPart(view);

			case CallProcedureDescriptionEditPart.VISUAL_ID:
				return new CallProcedureDescriptionEditPart(view);

			case CallFunctionEditPart.VISUAL_ID:
				return new CallFunctionEditPart(view);

			case CallFunctionDescriptionEditPart.VISUAL_ID:
				return new CallFunctionDescriptionEditPart(view);

			case DataType2EditPart.VISUAL_ID:
				return new DataType2EditPart(view);

			case DataTypeName2EditPart.VISUAL_ID:
				return new DataTypeName2EditPart(view);

			case Collections2EditPart.VISUAL_ID:
				return new Collections2EditPart(view);

			case CollectionsName2EditPart.VISUAL_ID:
				return new CollectionsName2EditPart(view);

			case Records2EditPart.VISUAL_ID:
				return new Records2EditPart(view);

			case RecordsName2EditPart.VISUAL_ID:
				return new RecordsName2EditPart(view);

			case Cursor2EditPart.VISUAL_ID:
				return new Cursor2EditPart(view);

			case CursorName2EditPart.VISUAL_ID:
				return new CursorName2EditPart(view);

			case DataType3EditPart.VISUAL_ID:
				return new DataType3EditPart(view);

			case DataTypeName3EditPart.VISUAL_ID:
				return new DataTypeName3EditPart(view);

			case Collections3EditPart.VISUAL_ID:
				return new Collections3EditPart(view);

			case CollectionsName3EditPart.VISUAL_ID:
				return new CollectionsName3EditPart(view);

			case Records3EditPart.VISUAL_ID:
				return new Records3EditPart(view);

			case RecordsName3EditPart.VISUAL_ID:
				return new RecordsName3EditPart(view);

			case Cursor3EditPart.VISUAL_ID:
				return new Cursor3EditPart(view);

			case CursorName3EditPart.VISUAL_ID:
				return new CursorName3EditPart(view);

			case DataType4EditPart.VISUAL_ID:
				return new DataType4EditPart(view);

			case DataTypeName4EditPart.VISUAL_ID:
				return new DataTypeName4EditPart(view);

			case Collections4EditPart.VISUAL_ID:
				return new Collections4EditPart(view);

			case CollectionsName4EditPart.VISUAL_ID:
				return new CollectionsName4EditPart(view);

			case Records4EditPart.VISUAL_ID:
				return new Records4EditPart(view);

			case RecordsName4EditPart.VISUAL_ID:
				return new RecordsName4EditPart(view);

			case Cursor4EditPart.VISUAL_ID:
				return new Cursor4EditPart(view);

			case CursorName4EditPart.VISUAL_ID:
				return new CursorName4EditPart(view);

			case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureDeclarativePartCompartmentEditPart(
						view);

			case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureExecutablePartCompartmentEditPart(
						view);

			case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureParametersCompartmentEditPart(view);

			case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionDeclarativePartCompartmentEditPart(
						view);

			case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionExecutablePartCompartmentEditPart(
						view);

			case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionParametersCompartmentEditPart(view);

			case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionReturnPartCompartmentEditPart(view);

			case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart(
						view);

			case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
				return new AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart(
						view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
