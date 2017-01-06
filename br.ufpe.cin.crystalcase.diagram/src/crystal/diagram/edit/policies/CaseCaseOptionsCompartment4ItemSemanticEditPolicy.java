/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.OptionsCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class CaseCaseOptionsCompartment4ItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CaseCaseOptionsCompartment4ItemSemanticEditPolicy() {
		super(CrystalElementTypes.Case_3294);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.Options_3281 == req.getElementType()) {
			return getGEFWrapper(new OptionsCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
