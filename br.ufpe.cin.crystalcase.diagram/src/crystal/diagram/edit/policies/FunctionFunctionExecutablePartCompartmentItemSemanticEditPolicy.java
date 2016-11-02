/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction2CreateCommand;
import crystal.diagram.edit.commands.CallFunction3CreateCommand;
import crystal.diagram.edit.commands.CallFunction6CreateCommand;
import crystal.diagram.edit.commands.CallFunction8CreateCommand;
import crystal.diagram.edit.commands.CallFunction9CreateCommand;
import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedure2CreateCommand;
import crystal.diagram.edit.commands.CallProcedure3CreateCommand;
import crystal.diagram.edit.commands.CallProcedure6CreateCommand;
import crystal.diagram.edit.commands.CallProcedure8CreateCommand;
import crystal.diagram.edit.commands.CallProcedure9CreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.Case2CreateCommand;
import crystal.diagram.edit.commands.Case3CreateCommand;
import crystal.diagram.edit.commands.Case6CreateCommand;
import crystal.diagram.edit.commands.Case8CreateCommand;
import crystal.diagram.edit.commands.Case9CreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.Close2CreateCommand;
import crystal.diagram.edit.commands.Close3CreateCommand;
import crystal.diagram.edit.commands.Close6CreateCommand;
import crystal.diagram.edit.commands.Close8CreateCommand;
import crystal.diagram.edit.commands.Close9CreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.Delete2CreateCommand;
import crystal.diagram.edit.commands.Delete3CreateCommand;
import crystal.diagram.edit.commands.Delete6CreateCommand;
import crystal.diagram.edit.commands.Delete8CreateCommand;
import crystal.diagram.edit.commands.Delete9CreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.Exception2CreateCommand;
import crystal.diagram.edit.commands.Exception3CreateCommand;
import crystal.diagram.edit.commands.Exception6CreateCommand;
import crystal.diagram.edit.commands.Exception8CreateCommand;
import crystal.diagram.edit.commands.Exception9CreateCommand;
import crystal.diagram.edit.commands.ExceptionCreateCommand;
import crystal.diagram.edit.commands.Expression8CreateCommand;
import crystal.diagram.edit.commands.Expression9CreateCommand;
import crystal.diagram.edit.commands.Fetch2CreateCommand;
import crystal.diagram.edit.commands.Fetch3CreateCommand;
import crystal.diagram.edit.commands.Fetch6CreateCommand;
import crystal.diagram.edit.commands.Fetch8CreateCommand;
import crystal.diagram.edit.commands.Fetch9CreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.For2CreateCommand;
import crystal.diagram.edit.commands.For3CreateCommand;
import crystal.diagram.edit.commands.For6CreateCommand;
import crystal.diagram.edit.commands.For8CreateCommand;
import crystal.diagram.edit.commands.For9CreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.If2CreateCommand;
import crystal.diagram.edit.commands.If3CreateCommand;
import crystal.diagram.edit.commands.If6CreateCommand;
import crystal.diagram.edit.commands.If8CreateCommand;
import crystal.diagram.edit.commands.If9CreateCommand;
import crystal.diagram.edit.commands.IfCreateCommand;
import crystal.diagram.edit.commands.Insert2CreateCommand;
import crystal.diagram.edit.commands.Insert3CreateCommand;
import crystal.diagram.edit.commands.Insert6CreateCommand;
import crystal.diagram.edit.commands.Insert8CreateCommand;
import crystal.diagram.edit.commands.Insert9CreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.Loop2CreateCommand;
import crystal.diagram.edit.commands.Loop3CreateCommand;
import crystal.diagram.edit.commands.Loop6CreateCommand;
import crystal.diagram.edit.commands.Loop8CreateCommand;
import crystal.diagram.edit.commands.Loop9CreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.Open2CreateCommand;
import crystal.diagram.edit.commands.Open3CreateCommand;
import crystal.diagram.edit.commands.Open6CreateCommand;
import crystal.diagram.edit.commands.Open8CreateCommand;
import crystal.diagram.edit.commands.Open9CreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.Select2CreateCommand;
import crystal.diagram.edit.commands.Select3CreateCommand;
import crystal.diagram.edit.commands.Select6CreateCommand;
import crystal.diagram.edit.commands.Select8CreateCommand;
import crystal.diagram.edit.commands.Select9CreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.Update2CreateCommand;
import crystal.diagram.edit.commands.Update3CreateCommand;
import crystal.diagram.edit.commands.Update6CreateCommand;
import crystal.diagram.edit.commands.Update8CreateCommand;
import crystal.diagram.edit.commands.Update9CreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
import crystal.diagram.edit.commands.While2CreateCommand;
import crystal.diagram.edit.commands.While3CreateCommand;
import crystal.diagram.edit.commands.While6CreateCommand;
import crystal.diagram.edit.commands.While8CreateCommand;
import crystal.diagram.edit.commands.While9CreateCommand;
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
		if (CrystalElementTypes.Expression_3218 == req.getElementType()) {
			return getGEFWrapper(new Expression9CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3075 == req.getElementType()) {
			return getGEFWrapper(new Exception9CreateCommand(req));
		}
		if (CrystalElementTypes.If_3076 == req.getElementType()) {
			return getGEFWrapper(new If9CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3077 == req.getElementType()) {
			return getGEFWrapper(new Case9CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3078 == req.getElementType()) {
			return getGEFWrapper(new Insert9CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3079 == req.getElementType()) {
			return getGEFWrapper(new Update9CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3080 == req.getElementType()) {
			return getGEFWrapper(new Delete9CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3081 == req.getElementType()) {
			return getGEFWrapper(new Select9CreateCommand(req));
		}
		if (CrystalElementTypes.While_3082 == req.getElementType()) {
			return getGEFWrapper(new While9CreateCommand(req));
		}
		if (CrystalElementTypes.For_3083 == req.getElementType()) {
			return getGEFWrapper(new For9CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3084 == req.getElementType()) {
			return getGEFWrapper(new Loop9CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3085 == req.getElementType()) {
			return getGEFWrapper(new Open9CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3086 == req.getElementType()) {
			return getGEFWrapper(new Fetch9CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3087 == req.getElementType()) {
			return getGEFWrapper(new Close9CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3088 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure9CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3089 == req.getElementType()) {
			return getGEFWrapper(new CallFunction9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
