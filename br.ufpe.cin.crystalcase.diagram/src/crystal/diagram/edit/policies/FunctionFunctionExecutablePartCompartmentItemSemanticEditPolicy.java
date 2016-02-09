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
public class FunctionFunctionExecutablePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FunctionFunctionExecutablePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Function_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Exception_3005 == req.getElementType()) {
			return getGEFWrapper(new ExceptionCreateCommand(req));
		}
		if (CrystalElementTypes.If_3006 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (CrystalElementTypes.Case_3007 == req.getElementType()) {
			return getGEFWrapper(new CaseCreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3008 == req.getElementType()) {
			return getGEFWrapper(new InsertCreateCommand(req));
		}
		if (CrystalElementTypes.Update_3009 == req.getElementType()) {
			return getGEFWrapper(new UpdateCreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3010 == req.getElementType()) {
			return getGEFWrapper(new DeleteCreateCommand(req));
		}
		if (CrystalElementTypes.Select_3011 == req.getElementType()) {
			return getGEFWrapper(new SelectCreateCommand(req));
		}
		if (CrystalElementTypes.While_3012 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (CrystalElementTypes.For_3013 == req.getElementType()) {
			return getGEFWrapper(new ForCreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3014 == req.getElementType()) {
			return getGEFWrapper(new LoopCreateCommand(req));
		}
		if (CrystalElementTypes.Open_3015 == req.getElementType()) {
			return getGEFWrapper(new OpenCreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3016 == req.getElementType()) {
			return getGEFWrapper(new FetchCreateCommand(req));
		}
		if (CrystalElementTypes.Close_3017 == req.getElementType()) {
			return getGEFWrapper(new CloseCreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3031 == req.getElementType()) {
			return getGEFWrapper(new CallProcedureCreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3032 == req.getElementType()) {
			return getGEFWrapper(new CallFunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
