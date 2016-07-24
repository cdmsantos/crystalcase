/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprograms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Subprograms#getName <em>Name</em>}</li>
 *   <li>{@link crystal.Subprograms#getDeclarativePart <em>Declarative Part</em>}</li>
 *   <li>{@link crystal.Subprograms#getExecutablePart <em>Executable Part</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getSubprograms()
 * @model abstract="true"
 *        annotation="gmf.node figure='rectangle' border.style='dash' border.width='1' label.readOnly='true'"
 * @generated
 */
public interface Subprograms extends EObject {
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
	 * @see crystal.CrystalPackage#getSubprograms_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crystal.Subprograms#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Declarative Part</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarative Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarative Part</em>' containment reference list.
	 * @see crystal.CrystalPackage#getSubprograms_DeclarativePart()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getDeclarativePart();

	/**
	 * Returns the value of the '<em><b>Executable Part</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Part</em>' containment reference list.
	 * @see crystal.CrystalPackage#getSubprograms_ExecutablePart()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getExecutablePart();

} // Subprograms
