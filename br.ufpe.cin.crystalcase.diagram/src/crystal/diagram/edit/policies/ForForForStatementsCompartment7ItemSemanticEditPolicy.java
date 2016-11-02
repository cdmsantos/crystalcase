/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction4CreateCommand;
import crystal.diagram.edit.commands.CallFunction5CreateCommand;
import crystal.diagram.edit.commands.CallProcedure4CreateCommand;
import crystal.diagram.edit.commands.CallProcedure5CreateCommand;
import crystal.diagram.edit.commands.Case4CreateCommand;
import crystal.diagram.edit.commands.Case5CreateCommand;
import crystal.diagram.edit.commands.Close4CreateCommand;
import crystal.diagram.edit.commands.Close5CreateCommand;
import crystal.diagram.edit.commands.Delete4CreateCommand;
import crystal.diagram.edit.commands.Delete5CreateCommand;
import crystal.diagram.edit.commands.Exception5CreateCommand;
import crystal.diagram.edit.commands.Expression4CreateCommand;
import crystal.diagram.edit.commands.Expression5CreateCommand;
import crystal.diagram.edit.commands.Fetch4CreateCommand;
import crystal.diagram.edit.commands.Fetch5CreateCommand;
import crystal.diagram.edit.commands.For4CreateCommand;
import crystal.diagram.edit.commands.For5CreateCommand;
import crystal.diagram.edit.commands.If5CreateCommand;
import crystal.diagram.edit.commands.Insert4CreateCommand;
import crystal.diagram.edit.commands.Insert5CreateCommand;
import crystal.diagram.edit.commands.Loop3CreateCommand;
import crystal.diagram.edit.commands.Loop4CreateCommand;
import crystal.diagram.edit.commands.Open4CreateCommand;
import crystal.diagram.edit.commands.Open5CreateCommand;
import crystal.diagram.edit.commands.Select4CreateCommand;
import crystal.diagram.edit.commands.Select5CreateCommand;
import crystal.diagram.edit.commands.Update4CreateCommand;
import crystal.diagram.edit.commands.Update5CreateCommand;
import crystal.diagram.edit.commands.While4CreateCommand;
import crystal.diagram.edit.commands.While5CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class ForForForStatementsCompartment7ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ForForForStatementsCompartment7ItemSemanticEditPolicy() {
		super(CrystalElementTypes.For_3144);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3214 == req.getElementType()) {
			return getGEFWrapper(new Expression5CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3151 == req.getElementType()) {
			return getGEFWrapper(new Exception5CreateCommand(req));
		}
		if (CrystalElementTypes.If_3152 == req.getElementType()) {
			return getGEFWrapper(new If5CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3155 == req.getElementType()) {
			return getGEFWrapper(new Case5CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3156 == req.getElementType()) {
			return getGEFWrapper(new Insert5CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3157 == req.getElementType()) {
			return getGEFWrapper(new Update5CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3158 == req.getElementType()) {
			return getGEFWrapper(new Delete5CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3159 == req.getElementType()) {
			return getGEFWrapper(new Select5CreateCommand(req));
		}
		if (CrystalElementTypes.While_3160 == req.getElementType()) {
			return getGEFWrapper(new While5CreateCommand(req));
		}
		if (CrystalElementTypes.For_3168 == req.getElementType()) {
			return getGEFWrapper(new For5CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3169 == req.getElementType()) {
			return getGEFWrapper(new Loop4CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3176 == req.getElementType()) {
			return getGEFWrapper(new Open5CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3177 == req.getElementType()) {
			return getGEFWrapper(new Fetch5CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3178 == req.getElementType()) {
			return getGEFWrapper(new Close5CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3179 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure5CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3180 == req.getElementType()) {
			return getGEFWrapper(new CallFunction5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
