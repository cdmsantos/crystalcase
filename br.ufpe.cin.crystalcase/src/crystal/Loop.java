/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crystal.Loop#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see crystal.CrystalPackage#getLoop()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface Loop extends Statements {

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"Type the code of the Loop statement"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see crystal.CrystalPackage#getLoop_Code()
	 * @model default="Type the code of the Loop statement"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link crystal.Loop#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);
} // Loop
