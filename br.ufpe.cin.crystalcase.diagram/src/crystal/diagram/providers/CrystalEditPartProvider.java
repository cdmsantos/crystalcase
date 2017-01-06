/*
 * 
 */
package crystal.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import crystal.diagram.edit.parts.CrystalEditPart;
import crystal.diagram.edit.parts.CrystalEditPartFactory;
import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class CrystalEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public CrystalEditPartProvider() {
		super(new CrystalEditPartFactory(), CrystalVisualIDRegistry.TYPED_INSTANCE, CrystalEditPart.MODEL_ID);
	}

}
