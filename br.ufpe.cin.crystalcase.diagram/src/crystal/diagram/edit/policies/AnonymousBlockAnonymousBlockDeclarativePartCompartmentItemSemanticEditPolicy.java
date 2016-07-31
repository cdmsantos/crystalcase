/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.Collections4CreateCommand;
import crystal.diagram.edit.commands.Collections6CreateCommand;
import crystal.diagram.edit.commands.CollectionsCreateCommand;
import crystal.diagram.edit.commands.Cursor4CreateCommand;
import crystal.diagram.edit.commands.Cursor6CreateCommand;
import crystal.diagram.edit.commands.CursorCreateCommand;
import crystal.diagram.edit.commands.DataType4CreateCommand;
import crystal.diagram.edit.commands.DataType6CreateCommand;
import crystal.diagram.edit.commands.DataTypeCreateCommand;
import crystal.diagram.edit.commands.Records4CreateCommand;
import crystal.diagram.edit.commands.Records6CreateCommand;
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
		super(CrystalElementTypes.AnonymousBlock_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3033 == req.getElementType()) {
			return getGEFWrapper(new DataType6CreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3034 == req.getElementType()) {
			return getGEFWrapper(new Collections6CreateCommand(req));
		}
		if (CrystalElementTypes.Records_3035 == req.getElementType()) {
			return getGEFWrapper(new Records6CreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3036 == req.getElementType()) {
			return getGEFWrapper(new Cursor6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
