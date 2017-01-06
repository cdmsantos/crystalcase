/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Blocks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.NamedBlocks#getName <em>Name</em>}</li>
 *   <li>{@link crystal.NamedBlocks#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getNamedBlocks()
 * @model abstract="true"
 *        annotation="gmf.node figure='rectangle' border.width='1' label.readOnly='true'"
 * @generated
 */
public interface NamedBlocks extends Subprograms {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crystal.CrystalPackage#getNamedBlocks_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crystal.NamedBlocks#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.DataAbstractions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see crystal.CrystalPackage#getNamedBlocks_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAbstractions> getParameters();

} // NamedBlocks
