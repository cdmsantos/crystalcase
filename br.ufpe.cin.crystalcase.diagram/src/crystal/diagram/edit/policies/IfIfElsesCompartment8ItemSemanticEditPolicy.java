/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction5CreateCommand;
import crystal.diagram.edit.commands.CallProcedure5CreateCommand;
import crystal.diagram.edit.commands.Case2CreateCommand;
import crystal.diagram.edit.commands.Close5CreateCommand;
import crystal.diagram.edit.commands.Delete2CreateCommand;
import crystal.diagram.edit.commands.Exception7CreateCommand;
import crystal.diagram.edit.commands.Fetch5CreateCommand;
import crystal.diagram.edit.commands.For5CreateCommand;
import crystal.diagram.edit.commands.If7CreateCommand;
import crystal.diagram.edit.commands.Insert2CreateCommand;
import crystal.diagram.edit.commands.Loop5CreateCommand;
import crystal.diagram.edit.commands.Open5CreateCommand;
import crystal.diagram.edit.commands.Select2CreateCommand;
import crystal.diagram.edit.commands.Update2CreateCommand;
import crystal.diagram.edit.commands.While2CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class IfIfElsesCompartment8ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfIfElsesCompartment8ItemSemanticEditPolicy() {
		super(CrystalElementTypes.If_3076);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Exception_3196 == req.getElementType()) {
			return getGEFWrapper(new Exception7CreateCommand(req));
		}
		if (CrystalElementTypes.If_3197 == req.getElementType()) {
			return getGEFWrapper(new If7CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3198 == req.getElementType()) {
			return getGEFWrapper(new Case2CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3199 == req.getElementType()) {
			return getGEFWrapper(new Insert2CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3200 == req.getElementType()) {
			return getGEFWrapper(new Update2CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3201 == req.getElementType()) {
			return getGEFWrapper(new Delete2CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3202 == req.getElementType()) {
			return getGEFWrapper(new Select2CreateCommand(req));
		}
		if (CrystalElementTypes.While_3203 == req.getElementType()) {
			return getGEFWrapper(new While2CreateCommand(req));
		}
		if (CrystalElementTypes.For_3204 == req.getElementType()) {
			return getGEFWrapper(new For5CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3205 == req.getElementType()) {
			return getGEFWrapper(new Loop5CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3206 == req.getElementType()) {
			return getGEFWrapper(new Open5CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3207 == req.getElementType()) {
			return getGEFWrapper(new Fetch5CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3208 == req.getElementType()) {
			return getGEFWrapper(new Close5CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3209 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure5CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3210 == req.getElementType()) {
			return getGEFWrapper(new CallFunction5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
