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
 * </p>
 * <ul>
 *   <li>{@link crystal.Records#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Records#getCode <em>Code</em>}</li>
 *   <li>{@link crystal.Records#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getRecords()
 * @model annotation="gmf.node label.text='Record'"
 * @generated
 */
public interface Records extends Parameters {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Record"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see crystal.CrystalPackage#getRecords_ClassName()
	 * @model default="Record" changeable="false"
	 * @generated
	 */
	String getClassName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"TYPE recordType IS RECORD (id number(5), name varchar2(25), lastName tableA.last_name%type)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see crystal.CrystalPackage#getRecords_Code()
	 * @model default="TYPE recordType IS RECORD (id number(5), name varchar2(25), lastName tableA.last_name%type)"
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

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see crystal.CrystalPackage#getRecords_TypeName()
	 * @model default=""
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link crystal.Records#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // Records
