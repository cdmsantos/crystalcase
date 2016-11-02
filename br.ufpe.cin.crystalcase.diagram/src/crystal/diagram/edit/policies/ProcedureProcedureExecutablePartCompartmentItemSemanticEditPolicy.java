/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction2CreateCommand;
import crystal.diagram.edit.commands.CallFunction5CreateCommand;
import crystal.diagram.edit.commands.CallFunction7CreateCommand;
import crystal.diagram.edit.commands.CallFunction8CreateCommand;
import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedure2CreateCommand;
import crystal.diagram.edit.commands.CallProcedure5CreateCommand;
import crystal.diagram.edit.commands.CallProcedure7CreateCommand;
import crystal.diagram.edit.commands.CallProcedure8CreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.Case5CreateCommand;
import crystal.diagram.edit.commands.Case7CreateCommand;
import crystal.diagram.edit.commands.Case8CreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.Close2CreateCommand;
import crystal.diagram.edit.commands.Close5CreateCommand;
import crystal.diagram.edit.commands.Close7CreateCommand;
import crystal.diagram.edit.commands.Close8CreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.Delete5CreateCommand;
import crystal.diagram.edit.commands.Delete7CreateCommand;
import crystal.diagram.edit.commands.Delete8CreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.ExceptionCreateCommand;
import crystal.diagram.edit.commands.Expression7CreateCommand;
import crystal.diagram.edit.commands.ExpressionCreateCommand;
import crystal.diagram.edit.commands.Fetch2CreateCommand;
import crystal.diagram.edit.commands.Fetch5CreateCommand;
import crystal.diagram.edit.commands.Fetch7CreateCommand;
import crystal.diagram.edit.commands.Fetch8CreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.For2CreateCommand;
import crystal.diagram.edit.commands.For5CreateCommand;
import crystal.diagram.edit.commands.For7CreateCommand;
import crystal.diagram.edit.commands.For8CreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.IfCreateCommand;
import crystal.diagram.edit.commands.Insert5CreateCommand;
import crystal.diagram.edit.commands.Insert7CreateCommand;
import crystal.diagram.edit.commands.Insert8CreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.Loop2CreateCommand;
import crystal.diagram.edit.commands.Loop5CreateCommand;
import crystal.diagram.edit.commands.Loop7CreateCommand;
import crystal.diagram.edit.commands.Loop8CreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.Open2CreateCommand;
import crystal.diagram.edit.commands.Open5CreateCommand;
import crystal.diagram.edit.commands.Open7CreateCommand;
import crystal.diagram.edit.commands.Open8CreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.Select5CreateCommand;
import crystal.diagram.edit.commands.Select7CreateCommand;
import crystal.diagram.edit.commands.Select8CreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.Update5CreateCommand;
import crystal.diagram.edit.commands.Update7CreateCommand;
import crystal.diagram.edit.commands.Update8CreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
import crystal.diagram.edit.commands.While5CreateCommand;
import crystal.diagram.edit.commands.While7CreateCommand;
import crystal.diagram.edit.commands.While8CreateCommand;
import crystal.diagram.edit.commands.WhileCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class ProcedureProcedureExecutablePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcedureProcedureExecutablePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Procedure_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3217 == req.getElementType()) {
			return getGEFWrapper(new ExpressionCreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3056 == req.getElementType()) {
			return getGEFWrapper(new ExceptionCreateCommand(req));
		}
		if (CrystalElementTypes.If_3057 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (CrystalElementTypes.Case_3058 == req.getElementType()) {
			return getGEFWrapper(new Case8CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3059 == req.getElementType()) {
			return getGEFWrapper(new Insert8CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3060 == req.getElementType()) {
			return getGEFWrapper(new Update8CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3061 == req.getElementType()) {
			return getGEFWrapper(new Delete8CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3062 == req.getElementType()) {
			return getGEFWrapper(new Select8CreateCommand(req));
		}
		if (CrystalElementTypes.While_3063 == req.getElementType()) {
			return getGEFWrapper(new While8CreateCommand(req));
		}
		if (CrystalElementTypes.For_3064 == req.getElementType()) {
			return getGEFWrapper(new For8CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3065 == req.getElementType()) {
			return getGEFWrapper(new Loop8CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3066 == req.getElementType()) {
			return getGEFWrapper(new Open8CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3067 == req.getElementType()) {
			return getGEFWrapper(new Fetch8CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3068 == req.getElementType()) {
			return getGEFWrapper(new Close8CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3069 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure8CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3070 == req.getElementType()) {
			return getGEFWrapper(new CallFunction8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
