/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.ExceptionCreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.IfCreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
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
		if (CrystalElementTypes.Exception_3056 == req.getElementType()) {
			return getGEFWrapper(new ExceptionCreateCommand(req));
		}
		if (CrystalElementTypes.If_3057 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (CrystalElementTypes.Case_3058 == req.getElementType()) {
			return getGEFWrapper(new CaseCreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3059 == req.getElementType()) {
			return getGEFWrapper(new InsertCreateCommand(req));
		}
		if (CrystalElementTypes.Update_3060 == req.getElementType()) {
			return getGEFWrapper(new UpdateCreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3061 == req.getElementType()) {
			return getGEFWrapper(new DeleteCreateCommand(req));
		}
		if (CrystalElementTypes.Select_3062 == req.getElementType()) {
			return getGEFWrapper(new SelectCreateCommand(req));
		}
		if (CrystalElementTypes.While_3063 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (CrystalElementTypes.For_3064 == req.getElementType()) {
			return getGEFWrapper(new ForCreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3065 == req.getElementType()) {
			return getGEFWrapper(new LoopCreateCommand(req));
		}
		if (CrystalElementTypes.Open_3066 == req.getElementType()) {
			return getGEFWrapper(new OpenCreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3067 == req.getElementType()) {
			return getGEFWrapper(new FetchCreateCommand(req));
		}
		if (CrystalElementTypes.Close_3068 == req.getElementType()) {
			return getGEFWrapper(new CloseCreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3069 == req.getElementType()) {
			return getGEFWrapper(new CallProcedureCreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3070 == req.getElementType()) {
			return getGEFWrapper(new CallFunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
