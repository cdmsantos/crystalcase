/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.SelectorCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class CaseCaseCasesCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CaseCaseCasesCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Case_3183);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Selector_3108 == req.getElementType()) {
			return getGEFWrapper(new SelectorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
