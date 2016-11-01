/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.Exception2CreateCommand;
import crystal.diagram.edit.commands.ExpressionCreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.If2CreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
import crystal.diagram.edit.commands.WhileCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class IfIfIfsCompartment3ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfIfIfsCompartment3ItemSemanticEditPolicy() {
		super(CrystalElementTypes.If_3110);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Exception_3181 == req.getElementType()) {
			return getGEFWrapper(new Exception2CreateCommand(req));
		}
		if (CrystalElementTypes.If_3182 == req.getElementType()) {
			return getGEFWrapper(new If2CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3183 == req.getElementType()) {
			return getGEFWrapper(new CaseCreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3184 == req.getElementType()) {
			return getGEFWrapper(new InsertCreateCommand(req));
		}
		if (CrystalElementTypes.Update_3185 == req.getElementType()) {
			return getGEFWrapper(new UpdateCreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3186 == req.getElementType()) {
			return getGEFWrapper(new DeleteCreateCommand(req));
		}
		if (CrystalElementTypes.Select_3187 == req.getElementType()) {
			return getGEFWrapper(new SelectCreateCommand(req));
		}
		if (CrystalElementTypes.While_3188 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (CrystalElementTypes.For_3189 == req.getElementType()) {
			return getGEFWrapper(new ForCreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3190 == req.getElementType()) {
			return getGEFWrapper(new LoopCreateCommand(req));
		}
		if (CrystalElementTypes.Open_3191 == req.getElementType()) {
			return getGEFWrapper(new OpenCreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3192 == req.getElementType()) {
			return getGEFWrapper(new FetchCreateCommand(req));
		}
		if (CrystalElementTypes.Close_3193 == req.getElementType()) {
			return getGEFWrapper(new CloseCreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3194 == req.getElementType()) {
			return getGEFWrapper(new CallProcedureCreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3195 == req.getElementType()) {
			return getGEFWrapper(new CallFunctionCreateCommand(req));
		}
		if (CrystalElementTypes.Expression_3211 == req.getElementType()) {
			return getGEFWrapper(new ExpressionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
