/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.Collections5CreateCommand;
import crystal.diagram.edit.commands.CollectionsCreateCommand;
import crystal.diagram.edit.commands.Cursor5CreateCommand;
import crystal.diagram.edit.commands.CursorCreateCommand;
import crystal.diagram.edit.commands.DataType5CreateCommand;
import crystal.diagram.edit.commands.DataTypeCreateCommand;
import crystal.diagram.edit.commands.Records5CreateCommand;
import crystal.diagram.edit.commands.RecordsCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class FunctionFunctionDeclarativePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FunctionFunctionDeclarativePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Function_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3071 == req.getElementType()) {
			return getGEFWrapper(new DataType5CreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3072 == req.getElementType()) {
			return getGEFWrapper(new Collections5CreateCommand(req));
		}
		if (CrystalElementTypes.Records_3073 == req.getElementType()) {
			return getGEFWrapper(new Records5CreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3074 == req.getElementType()) {
			return getGEFWrapper(new Cursor5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
