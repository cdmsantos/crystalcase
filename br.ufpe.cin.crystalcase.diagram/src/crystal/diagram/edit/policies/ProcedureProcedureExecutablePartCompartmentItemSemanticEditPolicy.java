/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction6CreateCommand;
import crystal.diagram.edit.commands.CallProcedure6CreateCommand;
import crystal.diagram.edit.commands.Case6CreateCommand;
import crystal.diagram.edit.commands.Close6CreateCommand;
import crystal.diagram.edit.commands.Delete6CreateCommand;
import crystal.diagram.edit.commands.ExceptionCreateCommand;
import crystal.diagram.edit.commands.ExpressionCreateCommand;
import crystal.diagram.edit.commands.Fetch6CreateCommand;
import crystal.diagram.edit.commands.For6CreateCommand;
import crystal.diagram.edit.commands.IfCreateCommand;
import crystal.diagram.edit.commands.Insert6CreateCommand;
import crystal.diagram.edit.commands.Loop6CreateCommand;
import crystal.diagram.edit.commands.Open6CreateCommand;
import crystal.diagram.edit.commands.Select6CreateCommand;
import crystal.diagram.edit.commands.Update6CreateCommand;
import crystal.diagram.edit.commands.While6CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class ProcedureProcedureExecutablePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ProcedureProcedureExecutablePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Procedure_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3236 == req.getElementType()) {
			return getGEFWrapper(new ExpressionCreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3237 == req.getElementType()) {
			return getGEFWrapper(new ExceptionCreateCommand(req));
		}
		if (CrystalElementTypes.If_3238 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (CrystalElementTypes.Case_3320 == req.getElementType()) {
			return getGEFWrapper(new Case6CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3321 == req.getElementType()) {
			return getGEFWrapper(new Insert6CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3322 == req.getElementType()) {
			return getGEFWrapper(new Update6CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3323 == req.getElementType()) {
			return getGEFWrapper(new Delete6CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3324 == req.getElementType()) {
			return getGEFWrapper(new Select6CreateCommand(req));
		}
		if (CrystalElementTypes.While_3325 == req.getElementType()) {
			return getGEFWrapper(new While6CreateCommand(req));
		}
		if (CrystalElementTypes.For_3326 == req.getElementType()) {
			return getGEFWrapper(new For6CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3327 == req.getElementType()) {
			return getGEFWrapper(new Loop6CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3328 == req.getElementType()) {
			return getGEFWrapper(new Open6CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3329 == req.getElementType()) {
			return getGEFWrapper(new Fetch6CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3330 == req.getElementType()) {
			return getGEFWrapper(new Close6CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3331 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure6CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3332 == req.getElementType()) {
			return getGEFWrapper(new CallFunction6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
