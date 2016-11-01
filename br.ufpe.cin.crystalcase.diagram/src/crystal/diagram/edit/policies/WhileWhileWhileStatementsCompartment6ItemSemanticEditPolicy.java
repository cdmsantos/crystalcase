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
import crystal.diagram.edit.commands.Delete3CreateCommand;
import crystal.diagram.edit.commands.Exception4CreateCommand;
import crystal.diagram.edit.commands.Expression2CreateCommand;
import crystal.diagram.edit.commands.Fetch2CreateCommand;
import crystal.diagram.edit.commands.For2CreateCommand;
import crystal.diagram.edit.commands.If4CreateCommand;
import crystal.diagram.edit.commands.Insert3CreateCommand;
import crystal.diagram.edit.commands.Loop2CreateCommand;
import crystal.diagram.edit.commands.Open2CreateCommand;
import crystal.diagram.edit.commands.Select3CreateCommand;
import crystal.diagram.edit.commands.Update3CreateCommand;
import crystal.diagram.edit.commands.While3CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class WhileWhileWhileStatementsCompartment6ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WhileWhileWhileStatementsCompartment6ItemSemanticEditPolicy() {
		super(CrystalElementTypes.While_3143);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Exception_3090 == req.getElementType()) {
			return getGEFWrapper(new Exception4CreateCommand(req));
		}
		if (CrystalElementTypes.If_3091 == req.getElementType()) {
			return getGEFWrapper(new If4CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3092 == req.getElementType()) {
			return getGEFWrapper(new Case3CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3093 == req.getElementType()) {
			return getGEFWrapper(new Insert3CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3094 == req.getElementType()) {
			return getGEFWrapper(new Update3CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3095 == req.getElementType()) {
			return getGEFWrapper(new Delete3CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3096 == req.getElementType()) {
			return getGEFWrapper(new Select3CreateCommand(req));
		}
		if (CrystalElementTypes.While_3097 == req.getElementType()) {
			return getGEFWrapper(new While3CreateCommand(req));
		}
		if (CrystalElementTypes.For_3098 == req.getElementType()) {
			return getGEFWrapper(new For2CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3099 == req.getElementType()) {
			return getGEFWrapper(new Loop2CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3100 == req.getElementType()) {
			return getGEFWrapper(new Open2CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3101 == req.getElementType()) {
			return getGEFWrapper(new Fetch2CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3102 == req.getElementType()) {
			return getGEFWrapper(new Close2CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3103 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure2CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3104 == req.getElementType()) {
			return getGEFWrapper(new CallFunction2CreateCommand(req));
		}
		if (CrystalElementTypes.Expression_3212 == req.getElementType()) {
			return getGEFWrapper(new Expression2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}