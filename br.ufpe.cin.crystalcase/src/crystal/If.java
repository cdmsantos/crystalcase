/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.If#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link crystal.If#getIfs <em>Ifs</em>}</li>
 *   <li>{@link crystal.If#getElses <em>Elses</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getIf()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface If extends Statements {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"If"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getIf_ClassName()
	 * @model default="If"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.If#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"Type the IF condition"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see crystal.CrystalPackage#getIf_Condition()
	 * @model default="Type the IF condition"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link crystal.If#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Ifs</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifs</em>' containment reference list.
	 * @see crystal.CrystalPackage#getIf_Ifs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getIfs();

	/**
	 * Returns the value of the '<em><b>Elses</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elses</em>' containment reference list.
	 * @see crystal.CrystalPackage#getIf_Elses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getElses();

} // If
