/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction5CreateCommand;
import crystal.diagram.edit.commands.CallFunction6CreateCommand;
import crystal.diagram.edit.commands.CallProcedure5CreateCommand;
import crystal.diagram.edit.commands.CallProcedure6CreateCommand;
import crystal.diagram.edit.commands.Case2CreateCommand;
import crystal.diagram.edit.commands.Close5CreateCommand;
import crystal.diagram.edit.commands.Close6CreateCommand;
import crystal.diagram.edit.commands.Delete2CreateCommand;
import crystal.diagram.edit.commands.Delete3CreateCommand;
import crystal.diagram.edit.commands.Exception7CreateCommand;
import crystal.diagram.edit.commands.Expression5CreateCommand;
import crystal.diagram.edit.commands.Expression7CreateCommand;
import crystal.diagram.edit.commands.Fetch5CreateCommand;
import crystal.diagram.edit.commands.Fetch6CreateCommand;
import crystal.diagram.edit.commands.For5CreateCommand;
import crystal.diagram.edit.commands.For6CreateCommand;
import crystal.diagram.edit.commands.If7CreateCommand;
import crystal.diagram.edit.commands.Insert2CreateCommand;
import crystal.diagram.edit.commands.Insert3CreateCommand;
import crystal.diagram.edit.commands.Loop5CreateCommand;
import crystal.diagram.edit.commands.Loop6CreateCommand;
import crystal.diagram.edit.commands.Open5CreateCommand;
import crystal.diagram.edit.commands.Open6CreateCommand;
import crystal.diagram.edit.commands.Select2CreateCommand;
import crystal.diagram.edit.commands.Select3CreateCommand;
import crystal.diagram.edit.commands.Update2CreateCommand;
import crystal.diagram.edit.commands.Update3CreateCommand;
import crystal.diagram.edit.commands.While2CreateCommand;
import crystal.diagram.edit.commands.While3CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class IfIfElsesCompartment5ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfIfElsesCompartment5ItemSemanticEditPolicy() {
		super(CrystalElementTypes.If_3152);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3215 == req.getElementType()) {
			return getGEFWrapper(new Expression7CreateCommand(req));
		}
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
			return getGEFWrapper(new Insert3CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3200 == req.getElementType()) {
			return getGEFWrapper(new Update3CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3201 == req.getElementType()) {
			return getGEFWrapper(new Delete3CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3202 == req.getElementType()) {
			return getGEFWrapper(new Select3CreateCommand(req));
		}
		if (CrystalElementTypes.While_3203 == req.getElementType()) {
			return getGEFWrapper(new While3CreateCommand(req));
		}
		if (CrystalElementTypes.For_3204 == req.getElementType()) {
			return getGEFWrapper(new For6CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3205 == req.getElementType()) {
			return getGEFWrapper(new Loop6CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3206 == req.getElementType()) {
			return getGEFWrapper(new Open6CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3207 == req.getElementType()) {
			return getGEFWrapper(new Fetch6CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3208 == req.getElementType()) {
			return getGEFWrapper(new Close6CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3209 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure6CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3210 == req.getElementType()) {
			return getGEFWrapper(new CallFunction6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
