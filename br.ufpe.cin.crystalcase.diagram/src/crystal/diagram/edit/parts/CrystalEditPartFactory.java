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

			case ExceptionEditPart.VISUAL_ID:
				return new ExceptionEditPart(view);

			case ExceptionDescriptionEditPart.VISUAL_ID:
				return new ExceptionDescriptionEditPart(view);

			case IfEditPart.VISUAL_ID:
				return new IfEditPart(view);

			case IfDescriptionEditPart.VISUAL_ID:
				return new IfDescriptionEditPart(view);

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

			case SelectorEditPart.VISUAL_ID:
				return new SelectorEditPart(view);

			case SelectorDescriptionEditPart.VISUAL_ID:
				return new SelectorDescriptionEditPart(view);

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

			case Exception5EditPart.VISUAL_ID:
				return new Exception5EditPart(view);

			case ExceptionDescription5EditPart.VISUAL_ID:
				return new ExceptionDescription5EditPart(view);

			case If5EditPart.VISUAL_ID:
				return new If5EditPart(view);

			case IfDescription5EditPart.VISUAL_ID:
				return new IfDescription5EditPart(view);

			case LoopEditPart.VISUAL_ID:
				return new LoopEditPart(view);

			case LoopDescriptionEditPart.VISUAL_ID:
				return new LoopDescriptionEditPart(view);

			case Exception6EditPart.VISUAL_ID:
				return new Exception6EditPart(view);

			case ExceptionDescription6EditPart.VISUAL_ID:
				return new ExceptionDescription6EditPart(view);

			case If6EditPart.VISUAL_ID:
				return new If6EditPart(view);

			case IfDescription6EditPart.VISUAL_ID:
				return new IfDescription6EditPart(view);

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

			case ExpressionEditPart.VISUAL_ID:
				return new ExpressionEditPart(view);

			case ExpressionDescriptionEditPart.VISUAL_ID:
				return new ExpressionDescriptionEditPart(view);

			case Exception7EditPart.VISUAL_ID:
				return new Exception7EditPart(view);

			case ExceptionDescription7EditPart.VISUAL_ID:
				return new ExceptionDescription7EditPart(view);

			case If7EditPart.VISUAL_ID:
				return new If7EditPart(view);

			case IfDescription7EditPart.VISUAL_ID:
				return new IfDescription7EditPart(view);

			case Case2EditPart.VISUAL_ID:
				return new Case2EditPart(view);

			case CaseDescription2EditPart.VISUAL_ID:
				return new CaseDescription2EditPart(view);

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

			case Case3EditPart.VISUAL_ID:
				return new Case3EditPart(view);

			case CaseDescription3EditPart.VISUAL_ID:
				return new CaseDescription3EditPart(view);

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

			case Loop2EditPart.VISUAL_ID:
				return new Loop2EditPart(view);

			case LoopDescription2EditPart.VISUAL_ID:
				return new LoopDescription2EditPart(view);

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

			case Expression2EditPart.VISUAL_ID:
				return new Expression2EditPart(view);

			case ExpressionDescription2EditPart.VISUAL_ID:
				return new ExpressionDescription2EditPart(view);

			case For3EditPart.VISUAL_ID:
				return new For3EditPart(view);

			case ForDescription3EditPart.VISUAL_ID:
				return new ForDescription3EditPart(view);

			case For4EditPart.VISUAL_ID:
				return new For4EditPart(view);

			case ForDescription4EditPart.VISUAL_ID:
				return new ForDescription4EditPart(view);

			case Loop3EditPart.VISUAL_ID:
				return new Loop3EditPart(view);

			case LoopDescription3EditPart.VISUAL_ID:
				return new LoopDescription3EditPart(view);

			case Loop4EditPart.VISUAL_ID:
				return new Loop4EditPart(view);

			case LoopDescription4EditPart.VISUAL_ID:
				return new LoopDescription4EditPart(view);

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

			case Expression3EditPart.VISUAL_ID:
				return new Expression3EditPart(view);

			case ExpressionDescription3EditPart.VISUAL_ID:
				return new ExpressionDescription3EditPart(view);

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

			case Expression4EditPart.VISUAL_ID:
				return new Expression4EditPart(view);

			case ExpressionDescription4EditPart.VISUAL_ID:
				return new ExpressionDescription4EditPart(view);

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

			case Expression5EditPart.VISUAL_ID:
				return new Expression5EditPart(view);

			case ExpressionDescription5EditPart.VISUAL_ID:
				return new ExpressionDescription5EditPart(view);

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

			case Expression6EditPart.VISUAL_ID:
				return new Expression6EditPart(view);

			case ExpressionDescription6EditPart.VISUAL_ID:
				return new ExpressionDescription6EditPart(view);

			case Case7EditPart.VISUAL_ID:
				return new Case7EditPart(view);

			case CaseDescription7EditPart.VISUAL_ID:
				return new CaseDescription7EditPart(view);

			case Insert7EditPart.VISUAL_ID:
				return new Insert7EditPart(view);

			case InsertDescription7EditPart.VISUAL_ID:
				return new InsertDescription7EditPart(view);

			case Update7EditPart.VISUAL_ID:
				return new Update7EditPart(view);

			case UpdateDescription7EditPart.VISUAL_ID:
				return new UpdateDescription7EditPart(view);

			case Delete7EditPart.VISUAL_ID:
				return new Delete7EditPart(view);

			case DeleteDescription7EditPart.VISUAL_ID:
				return new DeleteDescription7EditPart(view);

			case Select7EditPart.VISUAL_ID:
				return new Select7EditPart(view);

			case SelectDescription7EditPart.VISUAL_ID:
				return new SelectDescription7EditPart(view);

			case While7EditPart.VISUAL_ID:
				return new While7EditPart(view);

			case WhileDescription7EditPart.VISUAL_ID:
				return new WhileDescription7EditPart(view);

			case For7EditPart.VISUAL_ID:
				return new For7EditPart(view);

			case ForDescription7EditPart.VISUAL_ID:
				return new ForDescription7EditPart(view);

			case Loop7EditPart.VISUAL_ID:
				return new Loop7EditPart(view);

			case LoopDescription7EditPart.VISUAL_ID:
				return new LoopDescription7EditPart(view);

			case Open7EditPart.VISUAL_ID:
				return new Open7EditPart(view);

			case OpenDescription7EditPart.VISUAL_ID:
				return new OpenDescription7EditPart(view);

			case Fetch7EditPart.VISUAL_ID:
				return new Fetch7EditPart(view);

			case FetchDescription7EditPart.VISUAL_ID:
				return new FetchDescription7EditPart(view);

			case Close7EditPart.VISUAL_ID:
				return new Close7EditPart(view);

			case CloseDescription7EditPart.VISUAL_ID:
				return new CloseDescription7EditPart(view);

			case CallProcedure7EditPart.VISUAL_ID:
				return new CallProcedure7EditPart(view);

			case CallProcedureDescription7EditPart.VISUAL_ID:
				return new CallProcedureDescription7EditPart(view);

			case CallFunction7EditPart.VISUAL_ID:
				return new CallFunction7EditPart(view);

			case CallFunctionDescription7EditPart.VISUAL_ID:
				return new CallFunctionDescription7EditPart(view);

			case Expression7EditPart.VISUAL_ID:
				return new Expression7EditPart(view);

			case ExpressionDescription7EditPart.VISUAL_ID:
				return new ExpressionDescription7EditPart(view);

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

			case DataType5EditPart.VISUAL_ID:
				return new DataType5EditPart(view);

			case DataTypeName5EditPart.VISUAL_ID:
				return new DataTypeName5EditPart(view);

			case Collections5EditPart.VISUAL_ID:
				return new Collections5EditPart(view);

			case CollectionsName5EditPart.VISUAL_ID:
				return new CollectionsName5EditPart(view);

			case Records5EditPart.VISUAL_ID:
				return new Records5EditPart(view);

			case RecordsName5EditPart.VISUAL_ID:
				return new RecordsName5EditPart(view);

			case Cursor5EditPart.VISUAL_ID:
				return new Cursor5EditPart(view);

			case CursorName5EditPart.VISUAL_ID:
				return new CursorName5EditPart(view);

			case Exception8EditPart.VISUAL_ID:
				return new Exception8EditPart(view);

			case ExceptionDescription8EditPart.VISUAL_ID:
				return new ExceptionDescription8EditPart(view);

			case If8EditPart.VISUAL_ID:
				return new If8EditPart(view);

			case IfDescription8EditPart.VISUAL_ID:
				return new IfDescription8EditPart(view);

			case Case8EditPart.VISUAL_ID:
				return new Case8EditPart(view);

			case CaseDescription8EditPart.VISUAL_ID:
				return new CaseDescription8EditPart(view);

			case Insert8EditPart.VISUAL_ID:
				return new Insert8EditPart(view);

			case InsertDescription8EditPart.VISUAL_ID:
				return new InsertDescription8EditPart(view);

			case Update8EditPart.VISUAL_ID:
				return new Update8EditPart(view);

			case UpdateDescription8EditPart.VISUAL_ID:
				return new UpdateDescription8EditPart(view);

			case Delete8EditPart.VISUAL_ID:
				return new Delete8EditPart(view);

			case DeleteDescription8EditPart.VISUAL_ID:
				return new DeleteDescription8EditPart(view);

			case Select8EditPart.VISUAL_ID:
				return new Select8EditPart(view);

			case SelectDescription8EditPart.VISUAL_ID:
				return new SelectDescription8EditPart(view);

			case While8EditPart.VISUAL_ID:
				return new While8EditPart(view);

			case WhileDescription8EditPart.VISUAL_ID:
				return new WhileDescription8EditPart(view);

			case For8EditPart.VISUAL_ID:
				return new For8EditPart(view);

			case ForDescription8EditPart.VISUAL_ID:
				return new ForDescription8EditPart(view);

			case Loop8EditPart.VISUAL_ID:
				return new Loop8EditPart(view);

			case LoopDescription8EditPart.VISUAL_ID:
				return new LoopDescription8EditPart(view);

			case Open8EditPart.VISUAL_ID:
				return new Open8EditPart(view);

			case OpenDescription8EditPart.VISUAL_ID:
				return new OpenDescription8EditPart(view);

			case Fetch8EditPart.VISUAL_ID:
				return new Fetch8EditPart(view);

			case FetchDescription8EditPart.VISUAL_ID:
				return new FetchDescription8EditPart(view);

			case Close8EditPart.VISUAL_ID:
				return new Close8EditPart(view);

			case CloseDescription8EditPart.VISUAL_ID:
				return new CloseDescription8EditPart(view);

			case CallProcedure8EditPart.VISUAL_ID:
				return new CallProcedure8EditPart(view);

			case CallProcedureDescription8EditPart.VISUAL_ID:
				return new CallProcedureDescription8EditPart(view);

			case CallFunction8EditPart.VISUAL_ID:
				return new CallFunction8EditPart(view);

			case CallFunctionDescription8EditPart.VISUAL_ID:
				return new CallFunctionDescription8EditPart(view);

			case Expression8EditPart.VISUAL_ID:
				return new Expression8EditPart(view);

			case ExpressionDescription8EditPart.VISUAL_ID:
				return new ExpressionDescription8EditPart(view);

			case DataType6EditPart.VISUAL_ID:
				return new DataType6EditPart(view);

			case DataTypeName6EditPart.VISUAL_ID:
				return new DataTypeName6EditPart(view);

			case Collections6EditPart.VISUAL_ID:
				return new Collections6EditPart(view);

			case CollectionsName6EditPart.VISUAL_ID:
				return new CollectionsName6EditPart(view);

			case Records6EditPart.VISUAL_ID:
				return new Records6EditPart(view);

			case RecordsName6EditPart.VISUAL_ID:
				return new RecordsName6EditPart(view);

			case Cursor6EditPart.VISUAL_ID:
				return new Cursor6EditPart(view);

			case CursorName6EditPart.VISUAL_ID:
				return new CursorName6EditPart(view);

			case Exception9EditPart.VISUAL_ID:
				return new Exception9EditPart(view);

			case ExceptionDescription9EditPart.VISUAL_ID:
				return new ExceptionDescription9EditPart(view);

			case If9EditPart.VISUAL_ID:
				return new If9EditPart(view);

			case IfDescription9EditPart.VISUAL_ID:
				return new IfDescription9EditPart(view);

			case Case9EditPart.VISUAL_ID:
				return new Case9EditPart(view);

			case CaseDescription9EditPart.VISUAL_ID:
				return new CaseDescription9EditPart(view);

			case Insert9EditPart.VISUAL_ID:
				return new Insert9EditPart(view);

			case InsertDescription9EditPart.VISUAL_ID:
				return new InsertDescription9EditPart(view);

			case Update9EditPart.VISUAL_ID:
				return new Update9EditPart(view);

			case UpdateDescription9EditPart.VISUAL_ID:
				return new UpdateDescription9EditPart(view);

			case Delete9EditPart.VISUAL_ID:
				return new Delete9EditPart(view);

			case DeleteDescription9EditPart.VISUAL_ID:
				return new DeleteDescription9EditPart(view);

			case Select9EditPart.VISUAL_ID:
				return new Select9EditPart(view);

			case SelectDescription9EditPart.VISUAL_ID:
				return new SelectDescription9EditPart(view);

			case While9EditPart.VISUAL_ID:
				return new While9EditPart(view);

			case WhileDescription9EditPart.VISUAL_ID:
				return new WhileDescription9EditPart(view);

			case For9EditPart.VISUAL_ID:
				return new For9EditPart(view);

			case ForDescription9EditPart.VISUAL_ID:
				return new ForDescription9EditPart(view);

			case Loop9EditPart.VISUAL_ID:
				return new Loop9EditPart(view);

			case LoopDescription9EditPart.VISUAL_ID:
				return new LoopDescription9EditPart(view);

			case Open9EditPart.VISUAL_ID:
				return new Open9EditPart(view);

			case OpenDescription9EditPart.VISUAL_ID:
				return new OpenDescription9EditPart(view);

			case Fetch9EditPart.VISUAL_ID:
				return new Fetch9EditPart(view);

			case FetchDescription9EditPart.VISUAL_ID:
				return new FetchDescription9EditPart(view);

			case Close9EditPart.VISUAL_ID:
				return new Close9EditPart(view);

			case CloseDescription9EditPart.VISUAL_ID:
				return new CloseDescription9EditPart(view);

			case CallProcedure9EditPart.VISUAL_ID:
				return new CallProcedure9EditPart(view);

			case CallProcedureDescription9EditPart.VISUAL_ID:
				return new CallProcedureDescription9EditPart(view);

			case CallFunction9EditPart.VISUAL_ID:
				return new CallFunction9EditPart(view);

			case CallFunctionDescription9EditPart.VISUAL_ID:
				return new CallFunctionDescription9EditPart(view);

			case Expression9EditPart.VISUAL_ID:
				return new Expression9EditPart(view);

			case ExpressionDescription9EditPart.VISUAL_ID:
				return new ExpressionDescription9EditPart(view);

			case ProcedureProcedureDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureDeclarativePartCompartmentEditPart(view);

			case ProcedureProcedureParametersCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureParametersCompartmentEditPart(view);

			case ProcedureProcedureExecutablePartCompartmentEditPart.VISUAL_ID:
				return new ProcedureProcedureExecutablePartCompartmentEditPart(view);

			case IfIfIfsCompartmentEditPart.VISUAL_ID:
				return new IfIfIfsCompartmentEditPart(view);

			case IfIfElsesCompartmentEditPart.VISUAL_ID:
				return new IfIfElsesCompartmentEditPart(view);

			case IfIfIfsCompartment2EditPart.VISUAL_ID:
				return new IfIfIfsCompartment2EditPart(view);

			case IfIfElsesCompartment2EditPart.VISUAL_ID:
				return new IfIfElsesCompartment2EditPart(view);

			case CaseCaseCasesCompartmentEditPart.VISUAL_ID:
				return new CaseCaseCasesCompartmentEditPart(view);

			case SelectorSelectorCaseStatementsCompartmentEditPart.VISUAL_ID:
				return new SelectorSelectorCaseStatementsCompartmentEditPart(view);

			case IfIfIfsCompartment3EditPart.VISUAL_ID:
				return new IfIfIfsCompartment3EditPart(view);

			case IfIfElsesCompartment3EditPart.VISUAL_ID:
				return new IfIfElsesCompartment3EditPart(view);

			case WhileWhileWhileStatementsCompartmentEditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartmentEditPart(view);

			case IfIfIfsCompartment4EditPart.VISUAL_ID:
				return new IfIfIfsCompartment4EditPart(view);

			case IfIfElsesCompartment4EditPart.VISUAL_ID:
				return new IfIfElsesCompartment4EditPart(view);

			case ForForForStatementsCompartmentEditPart.VISUAL_ID:
				return new ForForForStatementsCompartmentEditPart(view);

			case IfIfIfsCompartment5EditPart.VISUAL_ID:
				return new IfIfIfsCompartment5EditPart(view);

			case IfIfElsesCompartment5EditPart.VISUAL_ID:
				return new IfIfElsesCompartment5EditPart(view);

			case LoopLoopLoopStatementsCompartmentEditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartmentEditPart(view);

			case IfIfIfsCompartment6EditPart.VISUAL_ID:
				return new IfIfIfsCompartment6EditPart(view);

			case IfIfElsesCompartment6EditPart.VISUAL_ID:
				return new IfIfElsesCompartment6EditPart(view);

			case IfIfIfsCompartment7EditPart.VISUAL_ID:
				return new IfIfIfsCompartment7EditPart(view);

			case IfIfElsesCompartment7EditPart.VISUAL_ID:
				return new IfIfElsesCompartment7EditPart(view);

			case CaseCaseCasesCompartment2EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment2EditPart(view);

			case WhileWhileWhileStatementsCompartment2EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment2EditPart(view);

			case CaseCaseCasesCompartment3EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment3EditPart(view);

			case WhileWhileWhileStatementsCompartment3EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment3EditPart(view);

			case ForForForStatementsCompartment2EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment2EditPart(view);

			case CaseCaseCasesCompartment4EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment4EditPart(view);

			case WhileWhileWhileStatementsCompartment4EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment4EditPart(view);

			case LoopLoopLoopStatementsCompartment2EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment2EditPart(view);

			case CaseCaseCasesCompartment5EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment5EditPart(view);

			case WhileWhileWhileStatementsCompartment5EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment5EditPart(view);

			case ForForForStatementsCompartment3EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment3EditPart(view);

			case ForForForStatementsCompartment4EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment4EditPart(view);

			case LoopLoopLoopStatementsCompartment3EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment3EditPart(view);

			case LoopLoopLoopStatementsCompartment4EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment4EditPart(view);

			case ForForForStatementsCompartment5EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment5EditPart(view);

			case LoopLoopLoopStatementsCompartment5EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment5EditPart(view);

			case CaseCaseCasesCompartment6EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment6EditPart(view);

			case WhileWhileWhileStatementsCompartment6EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment6EditPart(view);

			case ForForForStatementsCompartment6EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment6EditPart(view);

			case LoopLoopLoopStatementsCompartment6EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment6EditPart(view);

			case CaseCaseCasesCompartment7EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment7EditPart(view);

			case WhileWhileWhileStatementsCompartment7EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment7EditPart(view);

			case ForForForStatementsCompartment7EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment7EditPart(view);

			case LoopLoopLoopStatementsCompartment7EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment7EditPart(view);

			case FunctionFunctionDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionDeclarativePartCompartmentEditPart(view);

			case FunctionFunctionParametersCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionParametersCompartmentEditPart(view);

			case FunctionFunctionReturnPartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionReturnPartCompartmentEditPart(view);

			case FunctionFunctionExecutablePartCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionExecutablePartCompartmentEditPart(view);

			case IfIfIfsCompartment8EditPart.VISUAL_ID:
				return new IfIfIfsCompartment8EditPart(view);

			case IfIfElsesCompartment8EditPart.VISUAL_ID:
				return new IfIfElsesCompartment8EditPart(view);

			case CaseCaseCasesCompartment8EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment8EditPart(view);

			case WhileWhileWhileStatementsCompartment8EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment8EditPart(view);

			case ForForForStatementsCompartment8EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment8EditPart(view);

			case LoopLoopLoopStatementsCompartment8EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment8EditPart(view);

			case AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart.VISUAL_ID:
				return new AnonymousBlockAnonymousBlockDeclarativePartCompartmentEditPart(view);

			case AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart.VISUAL_ID:
				return new AnonymousBlockAnonymousBlockExecutablePartCompartmentEditPart(view);

			case IfIfIfsCompartment9EditPart.VISUAL_ID:
				return new IfIfIfsCompartment9EditPart(view);

			case IfIfElsesCompartment9EditPart.VISUAL_ID:
				return new IfIfElsesCompartment9EditPart(view);

			case CaseCaseCasesCompartment9EditPart.VISUAL_ID:
				return new CaseCaseCasesCompartment9EditPart(view);

			case WhileWhileWhileStatementsCompartment9EditPart.VISUAL_ID:
				return new WhileWhileWhileStatementsCompartment9EditPart(view);

			case ForForForStatementsCompartment9EditPart.VISUAL_ID:
				return new ForForForStatementsCompartment9EditPart(view);

			case LoopLoopLoopStatementsCompartment9EditPart.VISUAL_ID:
				return new LoopLoopLoopStatementsCompartment9EditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case TransitionNameEditPart.VISUAL_ID:
				return new TransitionNameEditPart(view);

			case SelectorTransitionEditPart.VISUAL_ID:
				return new SelectorTransitionEditPart(view);

			case SelectorTransitionNameEditPart.VISUAL_ID:
				return new SelectorTransitionNameEditPart(view);

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
