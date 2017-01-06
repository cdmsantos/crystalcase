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

			case AnonymousBlockDescriptionEditPart.VISUAL_ID:
				return new AnonymousBlockDescriptionEditPart(view);

			case ExpressionEditPart.VISUAL_ID:
				return new ExpressionEditPart(view);

			case ExpressionDescriptionEditPart.VISUAL_ID:
				return new ExpressionDescriptionEditPart(view);

			case ExceptionEditPart.VISUAL_ID:
				return new ExceptionEditPart(view);

			case ExceptionDescriptionEditPart.VISUAL_ID:
				return new ExceptionDescriptionEditPart(view);

			case IfEditPart.VISUAL_ID:
				return new IfEditPart(view);

			case IfDescriptionEditPart.VISUAL_ID:
				return new IfDescriptionEditPart(view);

			case Expression2EditPart.VISUAL_ID:
				return new Expression2EditPart(view);

			case ExpressionDescription2EditPart.VISUAL_ID:
				return new ExpressionDescription2EditPart(view);

			case Exception2EditPart.VISUAL_ID:
				return new Exception2EditPart(view);

			case ExceptionDescription2EditPart.VISUAL_ID:
				return new ExceptionDescription2EditPart(view);

			case If2EditPart.VISUAL_ID:
				return new If2EditPart(view);

			case IfDescription2EditPart.VISUAL_ID:
				return new IfDescription2EditPart(view);

			case CaseEditPart.VISUAL_ID:
				return new CaseEditPart(view);

			case CaseDescriptionEditPart.VISUAL_ID:
				return new CaseDescriptionEditPart(view);

			case Expression3EditPart.VISUAL_ID:
				return new Expression3EditPart(view);

			case ExpressionDescription3EditPart.VISUAL_ID:
				return new ExpressionDescription3EditPart(view);

			case Exception3EditPart.VISUAL_ID:
				return new Exception3EditPart(view);

			case ExceptionDescription3EditPart.VISUAL_ID:
				return new ExceptionDescription3EditPart(view);

			case If3EditPart.VISUAL_ID:
				return new If3EditPart(view);

			case IfDescription3EditPart.VISUAL_ID:
				return new IfDescription3EditPart(view);

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

			case Expression4EditPart.VISUAL_ID:
				return new Expression4EditPart(view);

			case ExpressionDescription4EditPart.VISUAL_ID:
				return new ExpressionDescription4EditPart(view);

			case Exception4EditPart.VISUAL_ID:
				return new Exception4EditPart(view);

			case ExceptionDescription4EditPart.VISUAL_ID:
				return new ExceptionDescription4EditPart(view);

			case If4EditPart.VISUAL_ID:
				return new If4EditPart(view);

			case IfDescription4EditPart.VISUAL_ID:
				return new IfDescription4EditPart(view);

			case ForEditPart.VISUAL_ID:
				return new ForEditPart(view);

			case ForDescriptionEditPart.VISUAL_ID:
				return new ForDescriptionEditPart(view);

			case Case2EditPart.VISUAL_ID:
				return new Case2EditPart(view);

			case CaseDescription2EditPart.VISUAL_ID:
				return new CaseDescription2EditPart(view);

			case Case3EditPart.VISUAL_ID:
				return new Case3EditPart(view);

			case CaseDescription3EditPart.VISUAL_ID:
				return new CaseDescription3EditPart(view);

			case Insert2EditPart.VISUAL_ID:
				return new Insert2EditPart(view);

			case InsertDescription2EditPart.VISUAL_ID:
				return new InsertDescription2EditPart(view);

			case Update2EditPart.VISUAL_ID:
				return new Update2EditPart(view);

			case UpdateDescription2EditPart.VISUAL_ID:
				return new UpdateDescription2EditPart(view);

			case Delete2EditPart.VISUAL_ID:
				return new Delete2EditPart(view);

			case DeleteDescription2EditPart.VISUAL_ID:
				return new DeleteDescription2EditPart(view);

			case Select2EditPart.VISUAL_ID:
				return new Select2EditPart(view);

			case SelectDescription2EditPart.VISUAL_ID:
				return new SelectDescription2EditPart(view);

			case While2EditPart.VISUAL_ID:
				return new While2EditPart(view);

			case WhileDescription2EditPart.VISUAL_ID:
				return new WhileDescription2EditPart(view);

			case Insert3EditPart.VISUAL_ID:
				return new Insert3EditPart(view);

			case InsertDescription3EditPart.VISUAL_ID:
				return new InsertDescription3EditPart(view);

			case Update3EditPart.VISUAL_ID:
				return new Update3EditPart(view);

			case UpdateDescription3EditPart.VISUAL_ID:
				return new UpdateDescription3EditPart(view);

			case Delete3EditPart.VISUAL_ID:
				return new Delete3EditPart(view);

			case DeleteDescription3EditPart.VISUAL_ID:
				return new DeleteDescription3EditPart(view);

			case Select3EditPart.VISUAL_ID:
				return new Select3EditPart(view);

			case SelectDescription3EditPart.VISUAL_ID:
				return new SelectDescription3EditPart(view);

			case While3EditPart.VISUAL_ID:
				return new While3EditPart(view);

			case WhileDescription3EditPart.VISUAL_ID:
				return new WhileDescription3EditPart(view);

			case For2EditPart.VISUAL_ID:
				return new For2EditPart(view);

			case ForDescription2EditPart.VISUAL_ID:
				return new ForDescription2EditPart(view);

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

			case For3EditPart.VISUAL_ID:
				return new For3EditPart(view);

			case ForDescription3EditPart.VISUAL_ID:
				return new ForDescription3EditPart(view);

			case Loop2EditPart.VISUAL_ID:
				return new Loop2EditPart(view);

			case LoopDescription2EditPart.VISUAL_ID:
				return new LoopDescription2EditPart(view);

			case Open2EditPart.VISUAL_ID:
				return new Open2EditPart(view);

			case OpenDescription2EditPart.VISUAL_ID:
				return new OpenDescription2EditPart(view);

			case Fetch2EditPart.VISUAL_ID:
				return new Fetch2EditPart(view);

			case FetchDescription2EditPart.VISUAL_ID:
				return new FetchDescription2EditPart(view);

			case Close2EditPart.VISUAL_ID:
				return new Close2EditPart(view);

			case CloseDescription2EditPart.VISUAL_ID:
				return new CloseDescription2EditPart(view);

			case CallProcedure2EditPart.VISUAL_ID:
				return new CallProcedure2EditPart(view);

			case CallProcedureDescription2EditPart.VISUAL_ID:
				return new CallProcedureDescription2EditPart(view);

			case CallFunction2EditPart.VISUAL_ID:
				return new CallFunction2EditPart(view);

			case CallFunctionDescription2EditPart.VISUAL_ID:
				return new CallFunctionDescription2EditPart(view);

			case OptionsEditPart.VISUAL_ID:
				return new OptionsEditPart(view);

			case OptionsDescriptionEditPart.VISUAL_ID:
				return new OptionsDescriptionEditPart(view);

			case Expression5EditPart.VISUAL_ID:
				return new Expression5EditPart(view);

			case ExpressionDescription5EditPart.VISUAL_ID:
				return new ExpressionDescription5EditPart(view);

			case Exception5EditPart.VISUAL_ID:
				return new Exception5EditPart(view);

			case ExceptionDescription5EditPart.VISUAL_ID:
				return new ExceptionDescription5EditPart(view);

			case If5EditPart.VISUAL_ID:
				return new If5EditPart(view);

			case IfDescription5EditPart.VISUAL_ID:
				return new IfDescription5EditPart(view);

			case Loop3EditPart.VISUAL_ID:
				return new Loop3EditPart(view);

			case LoopDescription3EditPart.VISUAL_ID:
				return new LoopDescription3EditPart(view);

			case Open3EditPart.VISUAL_ID:
				return new Open3EditPart(view);

			case OpenDescription3EditPart.VISUAL_ID:
				return new OpenDescription3EditPart(view);

			case Fetch3EditPart.VISUAL_ID:
				return new Fetch3EditPart(view);

			case FetchDescription3EditPart.VISUAL_ID:
				return new FetchDescription3EditPart(view);

			case Close3EditPart.VISUAL_ID:
				return new Close3EditPart(view);

			case CloseDescription3EditPart.VISUAL_ID:
				return new CloseDescription3EditPart(view);

			case CallProcedure3EditPart.VISUAL_ID:
				return new CallProcedure3EditPart(view);

			case CallProcedureDescription3EditPart.VISUAL_ID:
				return new CallProcedureDescription3EditPart(view);

			case CallFunction3EditPart.VISUAL_ID:
				return new CallFunction3EditPart(view);

			case CallFunctionDescription3EditPart.VISUAL_ID:
				return new CallFunctionDescription3EditPart(view);

			case Expression6EditPart.VISUAL_ID:
				return new Expression6EditPart(view);

			case ExpressionDescription6EditPart.VISUAL_ID:
				return new ExpressionDescription6EditPart(view);

			case Exception6EditPart.VISUAL_ID:
				return new Exception6EditPart(view);

			case ExceptionDescription6EditPart.VISUAL_ID:
				return new ExceptionDescription6EditPart(view);

			case If6EditPart.VISUAL_ID:
				return new If6EditPart(view);

			case IfDescription6EditPart.VISUAL_ID:
				return new IfDescription6EditPart(view);

			case Case4EditPart.VISUAL_ID:
				return new Case4EditPart(view);

			case CaseDescription4EditPart.VISUAL_ID:
				return new CaseDescription4EditPart(view);

			case Insert4EditPart.VISUAL_ID:
				return new Insert4EditPart(view);

			case InsertDescription4EditPart.VISUAL_ID:
				return new InsertDescription4EditPart(view);

			case Update4EditPart.VISUAL_ID:
				return new Update4EditPart(view);

			case UpdateDescription4EditPart.VISUAL_ID:
				return new UpdateDescription4EditPart(view);

			case Delete4EditPart.VISUAL_ID:
				return new Delete4EditPart(view);

			case DeleteDescription4EditPart.VISUAL_ID:
				return new DeleteDescription4EditPart(view);

			case Select4EditPart.VISUAL_ID:
				return new Select4EditPart(view);

			case SelectDescription4EditPart.VISUAL_ID:
				return new SelectDescription4EditPart(view);

			case While4EditPart.VISUAL_ID:
				return new While4EditPart(view);

			case WhileDescription4EditPart.VISUAL_ID:
				return new WhileDescription4EditPart(view);

			case For4EditPart.VISUAL_ID:
				return new For4EditPart(view);

			case ForDescription4EditPart.VISUAL_ID:
				return new ForDescription4EditPart(view);

			case Loop4EditPart.VISUAL_ID:
				return new Loop4EditPart(view);

			case LoopDescription4EditPart.VISUAL_ID:
				return new LoopDescription4EditPart(view);

			case Open4EditPart.VISUAL_ID:
				return new Open4EditPart(view);

			case OpenDescription4EditPart.VISUAL_ID:
				return new OpenDescription4EditPart(view);

			case Fetch4EditPart.VISUAL_ID:
				return new Fetch4EditPart(view);

			case FetchDescription4EditPart.VISUAL_ID:
				return new FetchDescription4EditPart(view);

			case Close4EditPart.VISUAL_ID:
				return new Close4EditPart(view);

			case CloseDescription4EditPart.VISUAL_ID:
				return new CloseDescription4EditPart(view);

			case CallProcedure4EditPart.VISUAL_ID:
				return new CallProcedure4EditPart(view);

			case CallProcedureDescription4EditPart.VISUAL_ID:
				return new CallProcedureDescription4EditPart(view);

			case CallFunction4EditPart.VISUAL_ID:
				return new CallFunction4EditPart(view);

			case CallFunctionDescription4EditPart.VISUAL_ID:
				return new CallFunctionDescription4EditPart(view);

			case Case5EditPart.VISUAL_ID:
				return new Case5EditPart(view);

			case CaseDescription5EditPart.VISUAL_ID:
				return new CaseDescription5EditPart(view);

			case Insert5EditPart.VISUAL_ID:
				return new Insert5EditPart(view);

			case InsertDescription5EditPart.VISUAL_ID:
				return new InsertDescription5EditPart(view);

			case Update5EditPart.VISUAL_ID:
				return new Update5EditPart(view);

			case UpdateDescription5EditPart.VISUAL_ID:
				return new UpdateDescription5EditPart(view);

			case Delete5EditPart.VISUAL_ID:
				return new Delete5EditPart(view);

			case DeleteDescription5EditPart.VISUAL_ID:
				return new DeleteDescription5EditPart(view);

			case Select5EditPart.VISUAL_ID:
				return new Select5EditPart(view);

			case SelectDescription5EditPart.VISUAL_ID:
				return new SelectDescription5EditPart(view);

			case While5EditPart.VISUAL_ID:
				return new While5EditPart(view);

			case WhileDescription5EditPart.VISUAL_ID:
				return new WhileDescription5EditPart(view);

			case For5EditPart.VISUAL_ID:
				return new For5EditPart(view);

			case ForDescription5EditPart.VISUAL_ID:
				return new ForDescription5EditPart(view);

			case Loop5EditPart.VISUAL_ID:
				return new Loop5EditPart(view);

			case LoopDescription5EditPart.VISUAL_ID:
				return new LoopDescription5EditPart(view);

			case Open5EditPart.VISUAL_ID:
				return new Open5EditPart(view);

			case OpenDescription5EditPart.VISUAL_ID:
				return new OpenDescription5EditPart(view);

			case Fetch5EditPart.VISUAL_ID:
				return new Fetch5EditPart(view);

			case FetchDescription5EditPart.VISUAL_ID:
				return new FetchDescription5EditPart(view);

			case Close5EditPart.VISUAL_ID:
				return new Close5EditPart(view);

			case CloseDescription5EditPart.VISUAL_ID:
				return new CloseDescription5EditPart(view);

			case CallProcedure5EditPart.VISUAL_ID:
				return new CallProcedure5EditPart(view);

			case CallProcedureDescription5EditPart.VISUAL_ID:
				return new CallProcedureDescription5EditPart(view);

			case CallFunction5EditPart.VISUAL_ID:
				return new CallFunction5EditPart(view);

			case CallFunctionDescription5EditPart.VISUAL_ID:
				return new CallFunctionDescription5EditPart(view);

			case Case6EditPart.VISUAL_ID:
				return new Case6EditPart(view);

			case CaseDescription6EditPart.VISUAL_ID:
				return new CaseDescription6EditPart(view);

			case Insert6EditPart.VISUAL_ID:
				return new Insert6EditPart(view);

			case InsertDescription6EditPart.VISUAL_ID:
				return new InsertDescription6EditPart(view);

			case Update6EditPart.VISUAL_ID:
				return new Update6EditPart(view);

			case UpdateDescription6EditPart.VISUAL_ID:
				return new UpdateDescription6EditPart(view);

			case Delete6EditPart.VISUAL_ID:
				return new Delete6EditPart(view);

			case DeleteDescription6EditPart.VISUAL_ID:
				return new DeleteDescription6EditPart(view);

			case Select6EditPart.VISUAL_ID:
				return new Select6EditPart(view);

			case SelectDescription6EditPart.VISUAL_ID:
				return new SelectDescription6EditPart(view);

			case While6EditPart.VISUAL_ID:
				return new While6EditPart(view);

			case WhileDescription6EditPart.VISUAL_ID:
				return new WhileDescription6EditPart(view);

			case For6EditPart.VISUAL_ID:
				return new For6EditPart(view);

			case ForDescription6EditPart.VISUAL_ID:
				return new ForDescription6EditPart(view);

			case Loop6EditPart.VISUAL_ID:
				return new Loop6EditPart(view);

			case LoopDescription6EditPart.VISUAL_ID:
				return new LoopDescription6EditPart(view);

			case Open6EditPart.VISUAL_ID:
				return new Open6EditPart(view);

			case OpenDescription6EditPart.VISUAL_ID:
				return new OpenDescription6EditPart(view);

			case Fetch6EditPart.VISUAL_ID:
				return new Fetch6EditPart(view);

			case FetchDescription6EditPart.VISUAL_ID:
				return new FetchDescription6EditPart(view);

			case Close6EditPart.VISUAL_ID:
				return new Close6EditPart(view);

			case CloseDescription6EditPart.VISUAL_ID:
				return new CloseDescription6EditPart(view);

			case CallProcedure6EditPart.VISUAL_ID:
				return new CallProcedure6EditPart(view);

			case CallProcedureDescription6EditPart.VISUAL_ID:
				return new CallProcedureDescription6EditPart(view);

			case CallFunction6EditPart.VISUAL_ID:
				return new CallFunction6EditPart(view);

			case CallFunctionDescription6EditPart.VISUAL_ID:
				return new CallFunctionDescription6EditPart(view);

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

			case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureDeclarativePartCompartmentEditPart(view);

			case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureExecutablePartCompartmentEditPart(view);

			case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureParametersCompartmentEditPart(view);

			case IfIfTrue_statementsCompartmentEditPart.VISUAL_ID:
				return new IfIfTrue_statementsCompartmentEditPart(view);

			case IfIfFalse_statementsCompartmentEditPart.VISUAL_ID:
				return new IfIfFalse_statementsCompartmentEditPart(view);

			case IfIfTrue_statementsCompartment2EditPart.VISUAL_ID:
				return new IfIfTrue_statementsCompartment2EditPart(view);

			case IfIfFalse_statementsCompartment2EditPart.VISUAL_ID:
				return new IfIfFalse_statementsCompartment2EditPart(view);

			case CaseCaseOptionsCompartmentEditPart.VISUAL_ID:
				return new CaseCaseOptionsCompartmentEditPart(view);

			case CaseCaseDefault_statementsCompartmentEditPart.VISUAL_ID:
				return new CaseCaseDefault_statementsCompartmentEditPart(view);

			case IfIfTrue_statementsCompartment3EditPart.VISUAL_ID:
				return new IfIfTrue_statementsCompartment3EditPart(view);

			case IfIfFalse_statementsCompartment3EditPart.VISUAL_ID:
				return new IfIfFalse_statementsCompartment3EditPart(view);

			case WhileWhileInterations_statementsCompartmentEditPart.VISUAL_ID:
				return new WhileWhileInterations_statementsCompartmentEditPart(view);

			case IfIfTrue_statementsCompartment4EditPart.VISUAL_ID:
				return new IfIfTrue_statementsCompartment4EditPart(view);

			case IfIfFalse_statementsCompartment4EditPart.VISUAL_ID:
				return new IfIfFalse_statementsCompartment4EditPart(view);

			case ForForInterations_statementsCompartmentEditPart.VISUAL_ID:
				return new ForForInterations_statementsCompartmentEditPart(view);

			case CaseCaseOptionsCompartment2EditPart.VISUAL_ID:
				return new CaseCaseOptionsCompartment2EditPart(view);

			case CaseCaseDefault_statementsCompartment2EditPart.VISUAL_ID:
				return new CaseCaseDefault_statementsCompartment2EditPart(view);

			case CaseCaseOptionsCompartment3EditPart.VISUAL_ID:
				return new CaseCaseOptionsCompartment3EditPart(view);

			case CaseCaseDefault_statementsCompartment3EditPart.VISUAL_ID:
				return new CaseCaseDefault_statementsCompartment3EditPart(view);

			case WhileWhileInterations_statementsCompartment2EditPart.VISUAL_ID:
				return new WhileWhileInterations_statementsCompartment2EditPart(view);

			case WhileWhileInterations_statementsCompartment3EditPart.VISUAL_ID:
				return new WhileWhileInterations_statementsCompartment3EditPart(view);

			case ForForInterations_statementsCompartment2EditPart.VISUAL_ID:
				return new ForForInterations_statementsCompartment2EditPart(view);

			case LoopLoopInterations_statementsCompartmentEditPart.VISUAL_ID:
				return new LoopLoopInterations_statementsCompartmentEditPart(view);

			case ForForInterations_statementsCompartment3EditPart.VISUAL_ID:
				return new ForForInterations_statementsCompartment3EditPart(view);

			case LoopLoopInterations_statementsCompartment2EditPart.VISUAL_ID:
				return new LoopLoopInterations_statementsCompartment2EditPart(view);

			case OptionsOptionsCase_statementsCompartmentEditPart.VISUAL_ID:
				return new OptionsOptionsCase_statementsCompartmentEditPart(view);

			case IfIfTrue_statementsCompartment5EditPart.VISUAL_ID:
				return new IfIfTrue_statementsCompartment5EditPart(view);

			case IfIfFalse_statementsCompartment5EditPart.VISUAL_ID:
				return new IfIfFalse_statementsCompartment5EditPart(view);

			case LoopLoopInterations_statementsCompartment3EditPart.VISUAL_ID:
				return new LoopLoopInterations_statementsCompartment3EditPart(view);

			case IfIfTrue_statementsCompartment6EditPart.VISUAL_ID:
				return new IfIfTrue_statementsCompartment6EditPart(view);

			case IfIfFalse_statementsCompartment6EditPart.VISUAL_ID:
				return new IfIfFalse_statementsCompartment6EditPart(view);

			case CaseCaseOptionsCompartment4EditPart.VISUAL_ID:
				return new CaseCaseOptionsCompartment4EditPart(view);

			case CaseCaseDefault_statementsCompartment4EditPart.VISUAL_ID:
				return new CaseCaseDefault_statementsCompartment4EditPart(view);

			case WhileWhileInterations_statementsCompartment4EditPart.VISUAL_ID:
				return new WhileWhileInterations_statementsCompartment4EditPart(view);

			case ForForInterations_statementsCompartment4EditPart.VISUAL_ID:
				return new ForForInterations_statementsCompartment4EditPart(view);

			case LoopLoopInterations_statementsCompartment4EditPart.VISUAL_ID:
				return new LoopLoopInterations_statementsCompartment4EditPart(view);

			case CaseCaseOptionsCompartment5EditPart.VISUAL_ID:
				return new CaseCaseOptionsCompartment5EditPart(view);

			case CaseCaseDefault_statementsCompartment5EditPart.VISUAL_ID:
				return new CaseCaseDefault_statementsCompartment5EditPart(view);

			case WhileWhileInterations_statementsCompartment5EditPart.VISUAL_ID:
				return new WhileWhileInterations_statementsCompartment5EditPart(view);

			case ForForInterations_statementsCompartment5EditPart.VISUAL_ID:
				return new ForForInterations_statementsCompartment5EditPart(view);

			case LoopLoopInterations_statementsCompartment5EditPart.VISUAL_ID:
				return new LoopLoopInterations_statementsCompartment5EditPart(view);

			case CaseCaseOptionsCompartment6EditPart.VISUAL_ID:
				return new CaseCaseOptionsCompartment6EditPart(view);

			case CaseCaseDefault_statementsCompartment6EditPart.VISUAL_ID:
				return new CaseCaseDefault_statementsCompartment6EditPart(view);

			case WhileWhileInterations_statementsCompartment6EditPart.VISUAL_ID:
				return new WhileWhileInterations_statementsCompartment6EditPart(view);

			case ForForInterations_statementsCompartment6EditPart.VISUAL_ID:
				return new ForForInterations_statementsCompartment6EditPart(view);

			case LoopLoopInterations_statementsCompartment6EditPart.VISUAL_ID:
				return new LoopLoopInterations_statementsCompartment6EditPart(view);

			case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionDeclarativePartCompartmentEditPart(view);

			case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionExecutablePartCompartmentEditPart(view);

			case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionParametersCompartmentEditPart(view);

			case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionReturnPartCompartmentEditPart(view);

			case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart(view);

			case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
				return new AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case TransitionNameEditPart.VISUAL_ID:
				return new TransitionNameEditPart(view);

			case OptionsTransitionEditPart.VISUAL_ID:
				return new OptionsTransitionEditPart(view);

			case OptionsTransitionNameEditPart.VISUAL_ID:
				return new OptionsTransitionNameEditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
