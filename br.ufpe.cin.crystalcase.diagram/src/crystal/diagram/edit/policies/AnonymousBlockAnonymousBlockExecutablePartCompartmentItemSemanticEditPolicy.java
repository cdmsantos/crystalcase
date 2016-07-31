/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction3CreateCommand;
import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedure3CreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.Case3CreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.Close3CreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.Delete3CreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.Exception3CreateCommand;
import crystal.diagram.edit.commands.ExceptionCreateCommand;
import crystal.diagram.edit.commands.Fetch3CreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.For3CreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.If3CreateCommand;
import crystal.diagram.edit.commands.IfCreateCommand;
import crystal.diagram.edit.commands.Insert3CreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.Loop3CreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.Open3CreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.Select3CreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.Update3CreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
import crystal.diagram.edit.commands.While3CreateCommand;
import crystal.diagram.edit.commands.WhileCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class AnonymousBlockAnonymousBlockExecutablePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AnonymousBlockAnonymousBlockExecutablePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.AnonymousBlock_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Exception_3037 == req.getElementType()) {
			return getGEFWrapper(new Exception3CreateCommand(req));
		}
		if (CrystalElementTypes.If_3038 == req.getElementType()) {
			return getGEFWrapper(new If3CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3039 == req.getElementType()) {
			return getGEFWrapper(new Case3CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3040 == req.getElementType()) {
			return getGEFWrapper(new Insert3CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3041 == req.getElementType()) {
			return getGEFWrapper(new Update3CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3042 == req.getElementType()) {
			return getGEFWrapper(new Delete3CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3043 == req.getElementType()) {
			return getGEFWrapper(new Select3CreateCommand(req));
		}
		if (CrystalElementTypes.While_3044 == req.getElementType()) {
			return getGEFWrapper(new While3CreateCommand(req));
		}
		if (CrystalElementTypes.For_3045 == req.getElementType()) {
			return getGEFWrapper(new For3CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3046 == req.getElementType()) {
			return getGEFWrapper(new Loop3CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3047 == req.getElementType()) {
			return getGEFWrapper(new Open3CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3048 == req.getElementType()) {
			return getGEFWrapper(new Fetch3CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3049 == req.getElementType()) {
			return getGEFWrapper(new Close3CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3050 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure3CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3051 == req.getElementType()) {
			return getGEFWrapper(new CallFunction3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
