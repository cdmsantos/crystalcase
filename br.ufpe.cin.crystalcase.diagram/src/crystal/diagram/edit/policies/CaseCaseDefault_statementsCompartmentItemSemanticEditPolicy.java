/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction2CreateCommand;
import crystal.diagram.edit.commands.CallProcedure2CreateCommand;
import crystal.diagram.edit.commands.Case3CreateCommand;
import crystal.diagram.edit.commands.Close2CreateCommand;
import crystal.diagram.edit.commands.Delete2CreateCommand;
import crystal.diagram.edit.commands.Exception3CreateCommand;
import crystal.diagram.edit.commands.Expression3CreateCommand;
import crystal.diagram.edit.commands.Fetch2CreateCommand;
import crystal.diagram.edit.commands.For3CreateCommand;
import crystal.diagram.edit.commands.If3CreateCommand;
import crystal.diagram.edit.commands.Insert2CreateCommand;
import crystal.diagram.edit.commands.Loop2CreateCommand;
import crystal.diagram.edit.commands.Open2CreateCommand;
import crystal.diagram.edit.commands.Select2CreateCommand;
import crystal.diagram.edit.commands.Update2CreateCommand;
import crystal.diagram.edit.commands.While2CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class CaseCaseDefault_statementsCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CaseCaseDefault_statementsCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Case_3242);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3243 == req.getElementType()) {
			return getGEFWrapper(new Expression3CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3244 == req.getElementType()) {
			return getGEFWrapper(new Exception3CreateCommand(req));
		}
		if (CrystalElementTypes.If_3245 == req.getElementType()) {
			return getGEFWrapper(new If3CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3256 == req.getElementType()) {
			return getGEFWrapper(new Case3CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3257 == req.getElementType()) {
			return getGEFWrapper(new Insert2CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3258 == req.getElementType()) {
			return getGEFWrapper(new Update2CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3259 == req.getElementType()) {
			return getGEFWrapper(new Delete2CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3260 == req.getElementType()) {
			return getGEFWrapper(new Select2CreateCommand(req));
		}
		if (CrystalElementTypes.While_3261 == req.getElementType()) {
			return getGEFWrapper(new While2CreateCommand(req));
		}
		if (CrystalElementTypes.For_3274 == req.getElementType()) {
			return getGEFWrapper(new For3CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3275 == req.getElementType()) {
			return getGEFWrapper(new Loop2CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3276 == req.getElementType()) {
			return getGEFWrapper(new Open2CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3277 == req.getElementType()) {
			return getGEFWrapper(new Fetch2CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3278 == req.getElementType()) {
			return getGEFWrapper(new Close2CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3279 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure2CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3280 == req.getElementType()) {
			return getGEFWrapper(new CallFunction2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
