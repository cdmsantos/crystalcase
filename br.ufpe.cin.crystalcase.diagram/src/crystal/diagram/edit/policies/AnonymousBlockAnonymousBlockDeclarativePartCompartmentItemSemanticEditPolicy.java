/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.CollectionsCreateCommand;
import crystal.diagram.edit.commands.CursorCreateCommand;
import crystal.diagram.edit.commands.DataTypeCreateCommand;
import crystal.diagram.edit.commands.RecordsCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class AnonymousBlockAnonymousBlockDeclarativePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AnonymousBlockAnonymousBlockDeclarativePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.AnonymousBlock_2012);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3333 == req.getElementType()) {
			return getGEFWrapper(new DataTypeCreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3334 == req.getElementType()) {
			return getGEFWrapper(new CollectionsCreateCommand(req));
		}
		if (CrystalElementTypes.Records_3335 == req.getElementType()) {
			return getGEFWrapper(new RecordsCreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3336 == req.getElementType()) {
			return getGEFWrapper(new CursorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
