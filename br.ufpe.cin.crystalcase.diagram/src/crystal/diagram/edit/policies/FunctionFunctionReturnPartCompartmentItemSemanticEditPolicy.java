/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.Collections4CreateCommand;
import crystal.diagram.edit.commands.Cursor4CreateCommand;
import crystal.diagram.edit.commands.DataType4CreateCommand;
import crystal.diagram.edit.commands.Records4CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class FunctionFunctionReturnPartCompartmentItemSemanticEditPolicy extends
		CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FunctionFunctionReturnPartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Function_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3026 == req.getElementType()) {
			return getGEFWrapper(new DataType4CreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3027 == req.getElementType()) {
			return getGEFWrapper(new Collections4CreateCommand(req));
		}
		if (CrystalElementTypes.Records_3028 == req.getElementType()) {
			return getGEFWrapper(new Records4CreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3029 == req.getElementType()) {
			return getGEFWrapper(new Cursor4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
