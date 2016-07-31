/*
 * 
 */
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.Collections2CreateCommand;
import crystal.diagram.edit.commands.CollectionsCreateCommand;
import crystal.diagram.edit.commands.Cursor2CreateCommand;
import crystal.diagram.edit.commands.CursorCreateCommand;
import crystal.diagram.edit.commands.DataType2CreateCommand;
import crystal.diagram.edit.commands.DataTypeCreateCommand;
import crystal.diagram.edit.commands.Records2CreateCommand;
import crystal.diagram.edit.commands.RecordsCreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class ProcedureProcedureParametersCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcedureProcedureParametersCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Procedure_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3018 == req.getElementType()) {
			return getGEFWrapper(new DataTypeCreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3019 == req.getElementType()) {
			return getGEFWrapper(new CollectionsCreateCommand(req));
		}
		if (CrystalElementTypes.Records_3020 == req.getElementType()) {
			return getGEFWrapper(new RecordsCreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3021 == req.getElementType()) {
			return getGEFWrapper(new CursorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
