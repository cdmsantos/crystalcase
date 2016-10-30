/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CallFunction4CreateCommand;
import crystal.diagram.edit.commands.CallFunction6CreateCommand;
import crystal.diagram.edit.commands.CallProcedure4CreateCommand;
import crystal.diagram.edit.commands.CallProcedure6CreateCommand;
import crystal.diagram.edit.commands.Case4CreateCommand;
import crystal.diagram.edit.commands.Case6CreateCommand;
import crystal.diagram.edit.commands.Close4CreateCommand;
import crystal.diagram.edit.commands.Close6CreateCommand;
import crystal.diagram.edit.commands.Delete4CreateCommand;
import crystal.diagram.edit.commands.Delete6CreateCommand;
import crystal.diagram.edit.commands.Exception3CreateCommand;
import crystal.diagram.edit.commands.Fetch4CreateCommand;
import crystal.diagram.edit.commands.Fetch6CreateCommand;
import crystal.diagram.edit.commands.For4CreateCommand;
import crystal.diagram.edit.commands.For6CreateCommand;
import crystal.diagram.edit.commands.If3CreateCommand;
import crystal.diagram.edit.commands.Insert4CreateCommand;
import crystal.diagram.edit.commands.Insert6CreateCommand;
import crystal.diagram.edit.commands.Loop4CreateCommand;
import crystal.diagram.edit.commands.Loop6CreateCommand;
import crystal.diagram.edit.commands.Open4CreateCommand;
import crystal.diagram.edit.commands.Open6CreateCommand;
import crystal.diagram.edit.commands.Select4CreateCommand;
import crystal.diagram.edit.commands.Select6CreateCommand;
import crystal.diagram.edit.commands.Update4CreateCommand;
import crystal.diagram.edit.commands.Update6CreateCommand;
import crystal.diagram.edit.commands.While4CreateCommand;
import crystal.diagram.edit.commands.While6CreateCommand;
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
		if (CrystalElementTypes.Exception_3109 == req.getElementType()) {
			return getGEFWrapper(new Exception3CreateCommand(req));
		}
		if (CrystalElementTypes.If_3110 == req.getElementType()) {
			return getGEFWrapper(new If3CreateCommand(req));
		}
		if (CrystalElementTypes.Case_3138 == req.getElementType()) {
			return getGEFWrapper(new Case6CreateCommand(req));
		}
		if (CrystalElementTypes.Insert_3139 == req.getElementType()) {
			return getGEFWrapper(new Insert6CreateCommand(req));
		}
		if (CrystalElementTypes.Update_3140 == req.getElementType()) {
			return getGEFWrapper(new Update6CreateCommand(req));
		}
		if (CrystalElementTypes.Delete_3141 == req.getElementType()) {
			return getGEFWrapper(new Delete6CreateCommand(req));
		}
		if (CrystalElementTypes.Select_3142 == req.getElementType()) {
			return getGEFWrapper(new Select6CreateCommand(req));
		}
		if (CrystalElementTypes.While_3143 == req.getElementType()) {
			return getGEFWrapper(new While6CreateCommand(req));
		}
		if (CrystalElementTypes.For_3144 == req.getElementType()) {
			return getGEFWrapper(new For6CreateCommand(req));
		}
		if (CrystalElementTypes.Loop_3145 == req.getElementType()) {
			return getGEFWrapper(new Loop6CreateCommand(req));
		}
		if (CrystalElementTypes.Open_3146 == req.getElementType()) {
			return getGEFWrapper(new Open6CreateCommand(req));
		}
		if (CrystalElementTypes.Fetch_3147 == req.getElementType()) {
			return getGEFWrapper(new Fetch6CreateCommand(req));
		}
		if (CrystalElementTypes.Close_3148 == req.getElementType()) {
			return getGEFWrapper(new Close6CreateCommand(req));
		}
		if (CrystalElementTypes.CallProcedure_3149 == req.getElementType()) {
			return getGEFWrapper(new CallProcedure6CreateCommand(req));
		}
		if (CrystalElementTypes.CallFunction_3150 == req.getElementType()) {
			return getGEFWrapper(new CallFunction6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
