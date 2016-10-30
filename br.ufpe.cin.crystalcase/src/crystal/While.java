/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.While#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.While#getCondition <em>Condition</em>}</li>
 *   <li>{@link crystal.While#getWhileStatements <em>While Statements</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getWhile()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface While extends Statements {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"While"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getWhile_ClassName()
	 * @model default="While"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.While#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"Type the WHILE condition"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see crystal.CrystalPackage#getWhile_Condition()
	 * @model default="Type the WHILE condition"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link crystal.While#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>While Statements</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Statements</em>' containment reference list.
	 * @see crystal.CrystalPackage#getWhile_WhileStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getWhileStatements();

} // While
