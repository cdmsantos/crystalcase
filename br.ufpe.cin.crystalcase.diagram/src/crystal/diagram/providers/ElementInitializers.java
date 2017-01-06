/*
 * 
 */
package crystal.diagram.providers;

import crystal.diagram.part.CrystalDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CrystalDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CrystalDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
