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
import crystal.diagram.edit.commands.For2CreateCommand;
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
public class CaseCaseElseStatementsCompartment2ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CaseCaseElseStatementsCompartment2ItemSemanticEditPolicy() {
		super(CrystalElementTypes.Case_3198);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3220 == req.getElementType()) {
			return getGEFWrapper(new Expression3CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3221 == req.getElementType()) {
			return getGEFWrapper(new Exception3CreateCommand(req));
		}
		if (CrystalElementTypes.If_3222 == req.getElementType()) {
			return getGEFWrapper(new If3CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3223 == req.getElementType()) {
			return getGEFWrapper(new Case3CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3224 == req.getElementType()) {
			return getGEFWrapper(new Insert2CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3225 == req.getElementType()) {
			return getGEFWrapper(new Update2CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3226 == req.getElementType()) {
			return getGEFWrapper(new Delete2CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3227 == req.getElementType()) {
			return getGEFWrapper(new Select2CreateCommand(req));
		}
		if (CrystalElementTypes.While_3228 == req.getElementType()) {
			return getGEFWrapper(new While2CreateCommand(req));
		}
		if (CrystalElementTypes.For_3229 == req.getElementType()) {
			return getGEFWrapper(new For2CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3230 == req.getElementType()) {
			return getGEFWrapper(new Loop2CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3231 == req.getElementType()) {
			return getGEFWrapper(new Open2CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3232 == req.getElementType()) {
			return getGEFWrapper(new Fetch2CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3233 == req.getElementType()) {
			return getGEFWrapper(new Close2CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3234 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure2CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3235 == req.getElementType()) {
			return getGEFWrapper(new CallFunction2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
