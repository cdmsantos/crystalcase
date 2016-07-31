/**
 */
package crystal;


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
 *   <li>{@link crystal.If#getCode <em>Code</em>}</li>
 *   <li>{@link crystal.If#getCodeElse <em>Code Else</em>}</li>
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
	 * @see crystal.CrystalPackage#getIf_ClassName()
	 * @model default="If" changeable="false"
	 * @generated
	 */
	String getClassName();

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
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"Type de IF code"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see crystal.CrystalPackage#getIf_Code()
	 * @model default="Type de IF code"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link crystal.If#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Code Else</b></em>' attribute.
	 * The default value is <code>"Type de ELSE code"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Else</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Else</em>' attribute.
	 * @see #setCodeElse(String)
	 * @see crystal.CrystalPackage#getIf_CodeElse()
	 * @model default="Type de ELSE code"
	 * @generated
	 */
	String getCodeElse();

	/**
	 * Sets the value of the '{@link crystal.If#getCodeElse <em>Code Else</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Else</em>' attribute.
	 * @see #getCodeElse()
	 * @generated
	 */
	void setCodeElse(String value);

} // If
