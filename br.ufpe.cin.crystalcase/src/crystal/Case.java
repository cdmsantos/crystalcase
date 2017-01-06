/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Case#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Case#getOptions <em>Options</em>}</li>
 *   <li>{@link crystal.Case#getDefault_statements <em>Default statements</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCase()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface Case extends ConditionalStructures {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getCase_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.Case#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Options}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCase_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Options> getOptions();

	/**
	 * Returns the value of the '<em><b>Default statements</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default statements</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCase_Default_statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getDefault_statements();

} // Case
