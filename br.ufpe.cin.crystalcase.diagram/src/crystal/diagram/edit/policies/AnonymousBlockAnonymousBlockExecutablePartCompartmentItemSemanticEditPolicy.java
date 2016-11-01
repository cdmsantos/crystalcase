/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction3CreateCommand;
import crystal.diagram.edit.commands.CallFunction4CreateCommand;
import crystal.diagram.edit.commands.CallFunction7CreateCommand;
import crystal.diagram.edit.commands.CallFunction9CreateCommand;
import crystal.diagram.edit.commands.CallFunctionCreateCommand;
import crystal.diagram.edit.commands.CallProcedure3CreateCommand;
import crystal.diagram.edit.commands.CallProcedure4CreateCommand;
import crystal.diagram.edit.commands.CallProcedure7CreateCommand;
import crystal.diagram.edit.commands.CallProcedure9CreateCommand;
import crystal.diagram.edit.commands.CallProcedureCreateCommand;
import crystal.diagram.edit.commands.Case3CreateCommand;
import crystal.diagram.edit.commands.Case4CreateCommand;
import crystal.diagram.edit.commands.Case7CreateCommand;
import crystal.diagram.edit.commands.Case9CreateCommand;
import crystal.diagram.edit.commands.CaseCreateCommand;
import crystal.diagram.edit.commands.Close3CreateCommand;
import crystal.diagram.edit.commands.Close4CreateCommand;
import crystal.diagram.edit.commands.Close7CreateCommand;
import crystal.diagram.edit.commands.Close9CreateCommand;
import crystal.diagram.edit.commands.CloseCreateCommand;
import crystal.diagram.edit.commands.Delete3CreateCommand;
import crystal.diagram.edit.commands.Delete4CreateCommand;
import crystal.diagram.edit.commands.Delete7CreateCommand;
import crystal.diagram.edit.commands.Delete9CreateCommand;
import crystal.diagram.edit.commands.DeleteCreateCommand;
import crystal.diagram.edit.commands.Exception3CreateCommand;
import crystal.diagram.edit.commands.Exception4CreateCommand;
import crystal.diagram.edit.commands.Exception7CreateCommand;
import crystal.diagram.edit.commands.Exception9CreateCommand;
import crystal.diagram.edit.commands.ExceptionCreateCommand;
import crystal.diagram.edit.commands.Expression9CreateCommand;
import crystal.diagram.edit.commands.Fetch3CreateCommand;
import crystal.diagram.edit.commands.Fetch4CreateCommand;
import crystal.diagram.edit.commands.Fetch7CreateCommand;
import crystal.diagram.edit.commands.Fetch9CreateCommand;
import crystal.diagram.edit.commands.FetchCreateCommand;
import crystal.diagram.edit.commands.For3CreateCommand;
import crystal.diagram.edit.commands.For4CreateCommand;
import crystal.diagram.edit.commands.For7CreateCommand;
import crystal.diagram.edit.commands.For9CreateCommand;
import crystal.diagram.edit.commands.ForCreateCommand;
import crystal.diagram.edit.commands.If3CreateCommand;
import crystal.diagram.edit.commands.If4CreateCommand;
import crystal.diagram.edit.commands.If7CreateCommand;
import crystal.diagram.edit.commands.If9CreateCommand;
import crystal.diagram.edit.commands.IfCreateCommand;
import crystal.diagram.edit.commands.Insert3CreateCommand;
import crystal.diagram.edit.commands.Insert4CreateCommand;
import crystal.diagram.edit.commands.Insert7CreateCommand;
import crystal.diagram.edit.commands.Insert9CreateCommand;
import crystal.diagram.edit.commands.InsertCreateCommand;
import crystal.diagram.edit.commands.Loop3CreateCommand;
import crystal.diagram.edit.commands.Loop4CreateCommand;
import crystal.diagram.edit.commands.Loop7CreateCommand;
import crystal.diagram.edit.commands.Loop9CreateCommand;
import crystal.diagram.edit.commands.LoopCreateCommand;
import crystal.diagram.edit.commands.Open3CreateCommand;
import crystal.diagram.edit.commands.Open4CreateCommand;
import crystal.diagram.edit.commands.Open7CreateCommand;
import crystal.diagram.edit.commands.Open9CreateCommand;
import crystal.diagram.edit.commands.OpenCreateCommand;
import crystal.diagram.edit.commands.Select3CreateCommand;
import crystal.diagram.edit.commands.Select4CreateCommand;
import crystal.diagram.edit.commands.Select7CreateCommand;
import crystal.diagram.edit.commands.Select9CreateCommand;
import crystal.diagram.edit.commands.SelectCreateCommand;
import crystal.diagram.edit.commands.Update3CreateCommand;
import crystal.diagram.edit.commands.Update4CreateCommand;
import crystal.diagram.edit.commands.Update7CreateCommand;
import crystal.diagram.edit.commands.Update9CreateCommand;
import crystal.diagram.edit.commands.UpdateCreateCommand;
import crystal.diagram.edit.commands.While3CreateCommand;
import crystal.diagram.edit.commands.While4CreateCommand;
import crystal.diagram.edit.commands.While7CreateCommand;
import crystal.diagram.edit.commands.While9CreateCommand;
import crystal.diagram.edit.commands.WhileCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class AnonymousBlockAnonymousBlockExecutablePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AnonymousBlockAnonymousBlockExecutablePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.AnonymousBlock_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Exception_3037 == req.getElementType()) {
			return getGEFWrapper(new Exception9CreateCommand(req));
		}
		if (CrystalElementTypes.If_3038 == req.getElementType()) {
			return getGEFWrapper(new If9CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3039 == req.getElementType()) {
			return getGEFWrapper(new Case9CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3040 == req.getElementType()) {
			return getGEFWrapper(new Insert9CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3041 == req.getElementType()) {
			return getGEFWrapper(new Update9CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3042 == req.getElementType()) {
			return getGEFWrapper(new Delete9CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3043 == req.getElementType()) {
			return getGEFWrapper(new Select9CreateCommand(req));
		}
		if (CrystalElementTypes.While_3044 == req.getElementType()) {
			return getGEFWrapper(new While9CreateCommand(req));
		}
		if (CrystalElementTypes.For_3045 == req.getElementType()) {
			return getGEFWrapper(new For9CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3046 == req.getElementType()) {
			return getGEFWrapper(new Loop9CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3047 == req.getElementType()) {
			return getGEFWrapper(new Open9CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3048 == req.getElementType()) {
			return getGEFWrapper(new Fetch9CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3049 == req.getElementType()) {
			return getGEFWrapper(new Close9CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3050 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure9CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3051 == req.getElementType()) {
			return getGEFWrapper(new CallFunction9CreateCommand(req));
		}
		if (CrystalElementTypes.Expression_3219 == req.getElementType()) {
			return getGEFWrapper(new Expression9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
