/*
* 
*/
package crystal.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crystal.diagram.edit.commands.Collections3CreateCommand;
import crystal.diagram.edit.commands.Cursor3CreateCommand;
import crystal.diagram.edit.commands.DataType3CreateCommand;
import crystal.diagram.edit.commands.Records3CreateCommand;
import crystal.diagram.providers.CrystalElementTypes;

/**
 * @generated
 */
public class FunctionFunctionReturnPartCompartmentItemSemanticEditPolicy extends CrystalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FunctionFunctionReturnPartCompartmentItemSemanticEditPolicy() {
		super(CrystalElementTypes.Function_2011);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrystalElementTypes.DataType_3026 == req.getElementType()) {
			return getGEFWrapper(new DataType3CreateCommand(req));
		}
		if (CrystalElementTypes.Collections_3027 == req.getElementType()) {
			return getGEFWrapper(new Collections3CreateCommand(req));
		}
		if (CrystalElementTypes.Records_3028 == req.getElementType()) {
			return getGEFWrapper(new Records3CreateCommand(req));
		}
		if (CrystalElementTypes.Cursor_3029 == req.getElementType()) {
			return getGEFWrapper(new Cursor3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
