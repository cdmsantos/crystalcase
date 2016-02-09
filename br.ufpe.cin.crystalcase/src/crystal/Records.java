/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Records</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crystal.Records#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see crystal.CrystalPackage#getRecords()
 * @model annotation="gmf.node label.text='Record'"
 * @generated
 */
public interface Records extends Parameters {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"TYPE recordType IS RECORD \r\n\t\t\t\t\t\t\t(id number(5), \r\n\t\t\t\t\t\t\tname varchar2(25), \r\n\t\t\t\t\t\t\tlastName tableA.last_name%type)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see crystal.CrystalPackage#getRecords_Code()
	 * @model default="TYPE recordType IS RECORD \r\n\t\t\t\t\t\t\t(id number(5), \r\n\t\t\t\t\t\t\tname varchar2(25), \r\n\t\t\t\t\t\t\tlastName tableA.last_name%type)"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link crystal.Records#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Records
