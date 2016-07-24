/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Procedure#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getProcedure()
 * @model annotation="gmf.node label='name' label.text='Procedure' border.color='255,13,13'"
 * @generated
 */
public interface Procedure extends Subprograms {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see crystal.CrystalPackage#getProcedure_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

} // Procedure
