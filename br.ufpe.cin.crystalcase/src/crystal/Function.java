/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link crystal.Function#getReturnPart <em>Return Part</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getFunction()
 * @model annotation="gmf.node label='name' label.text='Function' border.color='25,191,108'"
 * @generated
 */
public interface Function extends Subprograms {
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
	 * @see crystal.CrystalPackage#getFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Part</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Part</em>' containment reference list.
	 * @see crystal.CrystalPackage#getFunction_ReturnPart()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getReturnPart();

} // Function
