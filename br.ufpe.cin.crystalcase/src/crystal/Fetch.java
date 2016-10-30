/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Fetch#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Fetch#getCursorName <em>Cursor Name</em>}</li>
 *   <li>{@link crystal.Fetch#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getFetch()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface Fetch extends Statements {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Fetch"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getFetch_ClassName()
	 * @model default="Fetch"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.Fetch#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Cursor Name</b></em>' attribute.
	 * The default value is <code>"FETCH cursorName INTO variableCursor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Name</em>' attribute.
	 * @see #setCursorName(String)
	 * @see crystal.CrystalPackage#getFetch_CursorName()
	 * @model default="FETCH cursorName INTO variableCursor"
	 * @generated
	 */
	String getCursorName();

	/**
	 * Sets the value of the '{@link crystal.Fetch#getCursorName <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Name</em>' attribute.
	 * @see #getCursorName()
	 * @generated
	 */
	void setCursorName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * The default value is <code>"FETCH cursorName INTO variableCursor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see crystal.CrystalPackage#getFetch_VariableName()
	 * @model default="FETCH cursorName INTO variableCursor"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link crystal.Fetch#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

} // Fetch
