/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction2CreateCommand;
import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedure2CreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.Case2CreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.Close2CreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.Delete2CreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.Exception2CreateCommand;
import crystal.diagram.edit.commands.ExceptionCreateCommand;
import crystal.diagram.edit.commands.Fetch2CreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.For2CreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.If2CreateCommand;
import crystal.diagram.edit.commands.IfCreateCommand;
import crystal.diagram.edit.commands.Insert2CreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.Loop2CreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.Open2CreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.Select2CreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.Update2CreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
import crystal.diagram.edit.commands.While2CreateCommand;
import crystal.diagram.edit.commands.WhileCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class FunctionFunctionExecutablePartCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FunctionFunctionExecutablePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Function_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Exception_3075 == req.getElementType()) {
			return getGEFWrapper(new Exception2CreateCommand(req));
		}
		if (CrystalElementTypes.If_3076 == req.getElementType()) {
			return getGEFWrapper(new If2CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3077 == req.getElementType()) {
			return getGEFWrapper(new Case2CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3078 == req.getElementType()) {
			return getGEFWrapper(new Insert2CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3079 == req.getElementType()) {
			return getGEFWrapper(new Update2CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3080 == req.getElementType()) {
			return getGEFWrapper(new Delete2CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3081 == req.getElementType()) {
			return getGEFWrapper(new Select2CreateCommand(req));
		}
		if (CrystalElementTypes.While_3082 == req.getElementType()) {
			return getGEFWrapper(new While2CreateCommand(req));
		}
		if (CrystalElementTypes.For_3083 == req.getElementType()) {
			return getGEFWrapper(new For2CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3084 == req.getElementType()) {
			return getGEFWrapper(new Loop2CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3085 == req.getElementType()) {
			return getGEFWrapper(new Open2CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3086 == req.getElementType()) {
			return getGEFWrapper(new Fetch2CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3087 == req.getElementType()) {
			return getGEFWrapper(new Close2CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3088 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure2CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3089 == req.getElementType()) {
			return getGEFWrapper(new CallFunction2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
