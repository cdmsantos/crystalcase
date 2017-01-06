/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.Case2CreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.Delete3CreateCommand;
import crystal.diagram.edit.commands.Exception4CreateCommand;
import crystal.diagram.edit.commands.Expression4CreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.For2CreateCommand;
import crystal.diagram.edit.commands.If4CreateCommand;
import crystal.diagram.edit.commands.Insert3CreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.Select3CreateCommand;
import crystal.diagram.edit.commands.Update3CreateCommand;
import crystal.diagram.edit.commands.While3CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class ForForInterations_statementsCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ForForInterations_statementsCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.For_3254);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3251 == req.getElementType()) {
			return getGEFWrapper(new Expression4CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3252 == req.getElementType()) {
			return getGEFWrapper(new Exception4CreateCommand(req));
		}
		if (CrystalElementTypes.If_3253 == req.getElementType()) {
			return getGEFWrapper(new If4CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3255 == req.getElementType()) {
			return getGEFWrapper(new Case2CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3262 == req.getElementType()) {
			return getGEFWrapper(new Insert3CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3263 == req.getElementType()) {
			return getGEFWrapper(new Update3CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3264 == req.getElementType()) {
			return getGEFWrapper(new Delete3CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3265 == req.getElementType()) {
			return getGEFWrapper(new Select3CreateCommand(req));
		}
		if (CrystalElementTypes.While_3266 == req.getElementType()) {
			return getGEFWrapper(new While3CreateCommand(req));
		}
		if (CrystalElementTypes.For_3267 == req.getElementType()) {
			return getGEFWrapper(new For2CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3268 == req.getElementType()) {
			return getGEFWrapper(new LoopCreateCommand(req));
		}
		if (CrystalElementTypes.Open_3269 == req.getElementType()) {
			return getGEFWrapper(new OpenCreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3270 == req.getElementType()) {
			return getGEFWrapper(new FetchCreateCommand(req));
		}
		if (CrystalElementTypes.Close_3271 == req.getElementType()) {
			return getGEFWrapper(new CloseCreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3272 == req.getElementType()) {
			return getGEFWrapper(new CallProcedureCreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3273 == req.getElementType()) {
			return getGEFWrapper(new CallFunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
