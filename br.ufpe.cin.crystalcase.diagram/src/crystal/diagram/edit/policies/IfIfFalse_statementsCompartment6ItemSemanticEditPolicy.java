/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction4CreateCommand;
import crystal.diagram.edit.commands.CallProcedure4CreateCommand;
import crystal.diagram.edit.commands.Case4CreateCommand;
import crystal.diagram.edit.commands.Close4CreateCommand;
import crystal.diagram.edit.commands.Delete4CreateCommand;
import crystal.diagram.edit.commands.Exception6CreateCommand;
import crystal.diagram.edit.commands.Expression6CreateCommand;
import crystal.diagram.edit.commands.Fetch4CreateCommand;
import crystal.diagram.edit.commands.For4CreateCommand;
import crystal.diagram.edit.commands.If6CreateCommand;
import crystal.diagram.edit.commands.Insert4CreateCommand;
import crystal.diagram.edit.commands.Loop4CreateCommand;
import crystal.diagram.edit.commands.Open4CreateCommand;
import crystal.diagram.edit.commands.Select4CreateCommand;
import crystal.diagram.edit.commands.Update4CreateCommand;
import crystal.diagram.edit.commands.While4CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class IfIfFalse_statementsCompartment6ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfIfFalse_statementsCompartment6ItemSemanticEditPolicy() {
		super(CrystalElementTypes.If_3293);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3291 == req.getElementType()) {
			return getGEFWrapper(new Expression6CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3292 == req.getElementType()) {
			return getGEFWrapper(new Exception6CreateCommand(req));
		}
		if (CrystalElementTypes.If_3293 == req.getElementType()) {
			return getGEFWrapper(new If6CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3294 == req.getElementType()) {
			return getGEFWrapper(new Case4CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3295 == req.getElementType()) {
			return getGEFWrapper(new Insert4CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3296 == req.getElementType()) {
			return getGEFWrapper(new Update4CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3297 == req.getElementType()) {
			return getGEFWrapper(new Delete4CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3298 == req.getElementType()) {
			return getGEFWrapper(new Select4CreateCommand(req));
		}
		if (CrystalElementTypes.While_3299 == req.getElementType()) {
			return getGEFWrapper(new While4CreateCommand(req));
		}
		if (CrystalElementTypes.For_3300 == req.getElementType()) {
			return getGEFWrapper(new For4CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3301 == req.getElementType()) {
			return getGEFWrapper(new Loop4CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3302 == req.getElementType()) {
			return getGEFWrapper(new Open4CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3303 == req.getElementType()) {
			return getGEFWrapper(new Fetch4CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3304 == req.getElementType()) {
			return getGEFWrapper(new Close4CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3305 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure4CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3306 == req.getElementType()) {
			return getGEFWrapper(new CallFunction4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
