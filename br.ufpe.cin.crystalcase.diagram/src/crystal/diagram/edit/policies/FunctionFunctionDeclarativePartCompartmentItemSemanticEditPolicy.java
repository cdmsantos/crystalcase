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
public class FunctionFunctionDeclarativePartCompartmentItemSemanticEditPolicy
		extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FunctionFunctionDeclarativePartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Function_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3001 == req.getElementType()) {
			return getGEFWrapper(new DataTypeCreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3002 == req.getElementType()) {
			return getGEFWrapper(new CollectionsCreateCommand(req));
		}
		if (CrystalElementTypes.Records_3003 == req.getElementType()) {
			return getGEFWrapper(new RecordsCreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3004 == req.getElementType()) {
			return getGEFWrapper(new CursorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
