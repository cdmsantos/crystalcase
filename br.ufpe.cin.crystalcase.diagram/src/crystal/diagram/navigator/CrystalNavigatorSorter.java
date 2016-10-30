/*
 * 
 */
package crystal.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class CrystalNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7092;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7091;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CrystalNavigatorItem) {
			CrystalNavigatorItem item = (CrystalNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CrystalVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
