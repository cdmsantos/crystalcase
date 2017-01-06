/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction5CreateCommand;
import crystal.diagram.edit.commands.CallProcedure5CreateCommand;
import crystal.diagram.edit.commands.Case5CreateCommand;
import crystal.diagram.edit.commands.Close5CreateCommand;
import crystal.diagram.edit.commands.Delete5CreateCommand;
import crystal.diagram.edit.commands.Exception5CreateCommand;
import crystal.diagram.edit.commands.Expression5CreateCommand;
import crystal.diagram.edit.commands.Fetch5CreateCommand;
import crystal.diagram.edit.commands.For5CreateCommand;
import crystal.diagram.edit.commands.If5CreateCommand;
import crystal.diagram.edit.commands.Insert5CreateCommand;
import crystal.diagram.edit.commands.Loop5CreateCommand;
import crystal.diagram.edit.commands.Open5CreateCommand;
import crystal.diagram.edit.commands.Select5CreateCommand;
import crystal.diagram.edit.commands.Update5CreateCommand;
import crystal.diagram.edit.commands.While5CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class OptionsOptionsCase_statementsCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OptionsOptionsCase_statementsCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Options_3281);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3282 == req.getElementType()) {
			return getGEFWrapper(new Expression5CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3283 == req.getElementType()) {
			return getGEFWrapper(new Exception5CreateCommand(req));
		}
		if (CrystalElementTypes.If_3284 == req.getElementType()) {
			return getGEFWrapper(new If5CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3307 == req.getElementType()) {
			return getGEFWrapper(new Case5CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3308 == req.getElementType()) {
			return getGEFWrapper(new Insert5CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3309 == req.getElementType()) {
			return getGEFWrapper(new Update5CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3310 == req.getElementType()) {
			return getGEFWrapper(new Delete5CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3311 == req.getElementType()) {
			return getGEFWrapper(new Select5CreateCommand(req));
		}
		if (CrystalElementTypes.While_3312 == req.getElementType()) {
			return getGEFWrapper(new While5CreateCommand(req));
		}
		if (CrystalElementTypes.For_3313 == req.getElementType()) {
			return getGEFWrapper(new For5CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3314 == req.getElementType()) {
			return getGEFWrapper(new Loop5CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3315 == req.getElementType()) {
			return getGEFWrapper(new Open5CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3316 == req.getElementType()) {
			return getGEFWrapper(new Fetch5CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3317 == req.getElementType()) {
			return getGEFWrapper(new Close5CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3318 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure5CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3319 == req.getElementType()) {
			return getGEFWrapper(new CallFunction5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
