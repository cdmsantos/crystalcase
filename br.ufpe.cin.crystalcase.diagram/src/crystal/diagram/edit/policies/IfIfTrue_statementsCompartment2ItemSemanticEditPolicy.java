/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction3CreateCommand;
import crystal.diagram.edit.commands.CallProcedure3CreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.Close3CreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.Exception2CreateCommand;
import crystal.diagram.edit.commands.Expression2CreateCommand;
import crystal.diagram.edit.commands.Fetch3CreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.If2CreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.Loop3CreateCommand;
import crystal.diagram.edit.commands.Open3CreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
import crystal.diagram.edit.commands.WhileCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class IfIfTrue_statementsCompartment2ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfIfTrue_statementsCompartment2ItemSemanticEditPolicy() {
		super(CrystalElementTypes.If_3241);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3239 == req.getElementType()) {
			return getGEFWrapper(new Expression2CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3240 == req.getElementType()) {
			return getGEFWrapper(new Exception2CreateCommand(req));
		}
		if (CrystalElementTypes.If_3241 == req.getElementType()) {
			return getGEFWrapper(new If2CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3242 == req.getElementType()) {
			return getGEFWrapper(new CaseCreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3246 == req.getElementType()) {
			return getGEFWrapper(new InsertCreateCommand(req));
		}
		if (CrystalElementTypes.Update_3247 == req.getElementType()) {
			return getGEFWrapper(new UpdateCreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3248 == req.getElementType()) {
			return getGEFWrapper(new DeleteCreateCommand(req));
		}
		if (CrystalElementTypes.Select_3249 == req.getElementType()) {
			return getGEFWrapper(new SelectCreateCommand(req));
		}
		if (CrystalElementTypes.While_3250 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (CrystalElementTypes.For_3254 == req.getElementType()) {
			return getGEFWrapper(new ForCreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3285 == req.getElementType()) {
			return getGEFWrapper(new Loop3CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3286 == req.getElementType()) {
			return getGEFWrapper(new Open3CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3287 == req.getElementType()) {
			return getGEFWrapper(new Fetch3CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3288 == req.getElementType()) {
			return getGEFWrapper(new Close3CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3289 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure3CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3290 == req.getElementType()) {
			return getGEFWrapper(new CallFunction3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
