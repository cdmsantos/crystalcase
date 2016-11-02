/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction3CreateCommand;
import crystal.diagram.edit.commands.CallFunction4CreateCommand;
import crystal.diagram.edit.commands.CallProcedure3CreateCommand;
import crystal.diagram.edit.commands.CallProcedure4CreateCommand;
import crystal.diagram.edit.commands.Case5CreateCommand;
import crystal.diagram.edit.commands.Case6CreateCommand;
import crystal.diagram.edit.commands.Close3CreateCommand;
import crystal.diagram.edit.commands.Close4CreateCommand;
import crystal.diagram.edit.commands.Delete5CreateCommand;
import crystal.diagram.edit.commands.Delete6CreateCommand;
import crystal.diagram.edit.commands.Exception6CreateCommand;
import crystal.diagram.edit.commands.Expression3CreateCommand;
import crystal.diagram.edit.commands.Expression6CreateCommand;
import crystal.diagram.edit.commands.Fetch3CreateCommand;
import crystal.diagram.edit.commands.Fetch4CreateCommand;
import crystal.diagram.edit.commands.For3CreateCommand;
import crystal.diagram.edit.commands.For4CreateCommand;
import crystal.diagram.edit.commands.If6CreateCommand;
import crystal.diagram.edit.commands.Insert5CreateCommand;
import crystal.diagram.edit.commands.Insert6CreateCommand;
import crystal.diagram.edit.commands.Loop4CreateCommand;
import crystal.diagram.edit.commands.Loop5CreateCommand;
import crystal.diagram.edit.commands.Open3CreateCommand;
import crystal.diagram.edit.commands.Open4CreateCommand;
import crystal.diagram.edit.commands.Select5CreateCommand;
import crystal.diagram.edit.commands.Select6CreateCommand;
import crystal.diagram.edit.commands.Update5CreateCommand;
import crystal.diagram.edit.commands.Update6CreateCommand;
import crystal.diagram.edit.commands.While5CreateCommand;
import crystal.diagram.edit.commands.While6CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class LoopLoopLoopStatementsCompartment9ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LoopLoopLoopStatementsCompartment9ItemSemanticEditPolicy() {
		super(CrystalElementTypes.Loop_3084);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3213 == req.getElementType()) {
			return getGEFWrapper(new Expression6CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3153 == req.getElementType()) {
			return getGEFWrapper(new Exception6CreateCommand(req));
		}
		if (CrystalElementTypes.If_3154 == req.getElementType()) {
			return getGEFWrapper(new If6CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3161 == req.getElementType()) {
			return getGEFWrapper(new Case6CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3162 == req.getElementType()) {
			return getGEFWrapper(new Insert6CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3163 == req.getElementType()) {
			return getGEFWrapper(new Update6CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3164 == req.getElementType()) {
			return getGEFWrapper(new Delete6CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3165 == req.getElementType()) {
			return getGEFWrapper(new Select6CreateCommand(req));
		}
		if (CrystalElementTypes.While_3166 == req.getElementType()) {
			return getGEFWrapper(new While6CreateCommand(req));
		}
		if (CrystalElementTypes.For_3167 == req.getElementType()) {
			return getGEFWrapper(new For4CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3170 == req.getElementType()) {
			return getGEFWrapper(new Loop5CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3171 == req.getElementType()) {
			return getGEFWrapper(new Open4CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3172 == req.getElementType()) {
			return getGEFWrapper(new Fetch4CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3173 == req.getElementType()) {
			return getGEFWrapper(new Close4CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3174 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure4CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3175 == req.getElementType()) {
			return getGEFWrapper(new CallFunction4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
