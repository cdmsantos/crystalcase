/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crystal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Crystal#getLinks <em>Links</em>}</li>
 *   <li>{@link crystal.Crystal#getSubprograms <em>Subprograms</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCrystal()
 * @model annotation="gmf.diagram foo='bar' rcp='false' onefile='true' diagram.extension='crystal'"
 * @generated
 */
public interface Crystal extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Links}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCrystal_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Links> getLinks();

	/**
	 * Returns the value of the '<em><b>Subprograms</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Subprograms}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprograms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprograms</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCrystal_Subprograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subprograms> getSubprograms();

} // Crystal
