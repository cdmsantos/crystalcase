/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction4CreateCommand;
import crystal.diagram.edit.commands.CallFunction6CreateCommand;
import crystal.diagram.edit.commands.CallFunction7CreateCommand;
import crystal.diagram.edit.commands.CallProcedure4CreateCommand;
import crystal.diagram.edit.commands.CallProcedure6CreateCommand;
import crystal.diagram.edit.commands.CallProcedure7CreateCommand;
import crystal.diagram.edit.commands.Case4CreateCommand;
import crystal.diagram.edit.commands.Case6CreateCommand;
import crystal.diagram.edit.commands.Case7CreateCommand;
import crystal.diagram.edit.commands.Close4CreateCommand;
import crystal.diagram.edit.commands.Close6CreateCommand;
import crystal.diagram.edit.commands.Close7CreateCommand;
import crystal.diagram.edit.commands.Delete4CreateCommand;
import crystal.diagram.edit.commands.Delete6CreateCommand;
import crystal.diagram.edit.commands.Delete7CreateCommand;
import crystal.diagram.edit.commands.Exception3CreateCommand;
import crystal.diagram.edit.commands.Exception8CreateCommand;
import crystal.diagram.edit.commands.Expression3CreateCommand;
import crystal.diagram.edit.commands.Expression6CreateCommand;
import crystal.diagram.edit.commands.Expression8CreateCommand;
import crystal.diagram.edit.commands.Fetch4CreateCommand;
import crystal.diagram.edit.commands.Fetch6CreateCommand;
import crystal.diagram.edit.commands.Fetch7CreateCommand;
import crystal.diagram.edit.commands.For4CreateCommand;
import crystal.diagram.edit.commands.For6CreateCommand;
import crystal.diagram.edit.commands.For7CreateCommand;
import crystal.diagram.edit.commands.If3CreateCommand;
import crystal.diagram.edit.commands.If8CreateCommand;
import crystal.diagram.edit.commands.Insert4CreateCommand;
import crystal.diagram.edit.commands.Insert6CreateCommand;
import crystal.diagram.edit.commands.Insert7CreateCommand;
import crystal.diagram.edit.commands.Loop4CreateCommand;
import crystal.diagram.edit.commands.Loop6CreateCommand;
import crystal.diagram.edit.commands.Loop7CreateCommand;
import crystal.diagram.edit.commands.Open4CreateCommand;
import crystal.diagram.edit.commands.Open6CreateCommand;
import crystal.diagram.edit.commands.Open7CreateCommand;
import crystal.diagram.edit.commands.Select4CreateCommand;
import crystal.diagram.edit.commands.Select6CreateCommand;
import crystal.diagram.edit.commands.Select7CreateCommand;
import crystal.diagram.edit.commands.Update4CreateCommand;
import crystal.diagram.edit.commands.Update6CreateCommand;
import crystal.diagram.edit.commands.Update7CreateCommand;
import crystal.diagram.edit.commands.While4CreateCommand;
import crystal.diagram.edit.commands.While6CreateCommand;
import crystal.diagram.edit.commands.While7CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class SelectorSelectorCaseStatementsCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SelectorSelectorCaseStatementsCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Selector_3108);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Expression_3216 == req.getElementType()) {
			return getGEFWrapper(new Expression8CreateCommand(req));
		}
		if (CrystalElementTypes.Exception_3109 == req.getElementType()) {
			return getGEFWrapper(new Exception8CreateCommand(req));
		}
		if (CrystalElementTypes.If_3110 == req.getElementType()) {
			return getGEFWrapper(new If8CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3138 == req.getElementType()) {
			return getGEFWrapper(new Case7CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3139 == req.getElementType()) {
			return getGEFWrapper(new Insert7CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3140 == req.getElementType()) {
			return getGEFWrapper(new Update7CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3141 == req.getElementType()) {
			return getGEFWrapper(new Delete7CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3142 == req.getElementType()) {
			return getGEFWrapper(new Select7CreateCommand(req));
		}
		if (CrystalElementTypes.While_3143 == req.getElementType()) {
			return getGEFWrapper(new While7CreateCommand(req));
		}
		if (CrystalElementTypes.For_3144 == req.getElementType()) {
			return getGEFWrapper(new For7CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3145 == req.getElementType()) {
			return getGEFWrapper(new Loop7CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3146 == req.getElementType()) {
			return getGEFWrapper(new Open7CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3147 == req.getElementType()) {
			return getGEFWrapper(new Fetch7CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3148 == req.getElementType()) {
			return getGEFWrapper(new Close7CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3149 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure7CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3150 == req.getElementType()) {
			return getGEFWrapper(new CallFunction7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
