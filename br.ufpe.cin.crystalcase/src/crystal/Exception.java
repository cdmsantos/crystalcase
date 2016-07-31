/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Exception#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Exception#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getException()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface Exception extends Statements {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Exception"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see crystal.CrystalPackage#getException_ClassName()
	 * @model default="Exception" changeable="false"
	 * @generated
	 */
	String getClassName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"EXCEPTION WHEN no_data_found THEN DBMS_OUTPUT.PUT_LINE(\'There arent data registred\')"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see crystal.CrystalPackage#getException_Code()
	 * @model default="EXCEPTION WHEN no_data_found THEN DBMS_OUTPUT.PUT_LINE(\'There arent data registred\')"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link crystal.Exception#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Exception
