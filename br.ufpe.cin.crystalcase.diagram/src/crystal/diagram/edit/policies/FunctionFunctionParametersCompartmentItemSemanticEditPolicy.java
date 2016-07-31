/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.Collections2CreateCommand;
import crystal.diagram.edit.commands.Collections3CreateCommand;
import crystal.diagram.edit.commands.Cursor2CreateCommand;
import crystal.diagram.edit.commands.Cursor3CreateCommand;
import crystal.diagram.edit.commands.DataType2CreateCommand;
import crystal.diagram.edit.commands.DataType3CreateCommand;
import crystal.diagram.edit.commands.Records2CreateCommand;
import crystal.diagram.edit.commands.Records3CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class FunctionFunctionParametersCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FunctionFunctionParametersCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Function_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3022 == req.getElementType()) {
			return getGEFWrapper(new DataType3CreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3023 == req.getElementType()) {
			return getGEFWrapper(new Collections3CreateCommand(req));
		}
		if (CrystalElementTypes.Records_3024 == req.getElementType()) {
			return getGEFWrapper(new Records3CreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3025 == req.getElementType()) {
			return getGEFWrapper(new Cursor3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
