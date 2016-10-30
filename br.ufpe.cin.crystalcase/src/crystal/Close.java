/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Close</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Close#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Close#getCursorName <em>Cursor Name</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getClose()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface Close extends Statements {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Close"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getClose_ClassName()
	 * @model default="Close"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.Close#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Cursor Name</b></em>' attribute.
	 * The default value is <code>"cursorName"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Name</em>' attribute.
	 * @see #setCursorName(String)
	 * @see crystal.CrystalPackage#getClose_CursorName()
	 * @model default="cursorName"
	 * @generated
	 */
	String getCursorName();

	/**
	 * Sets the value of the '{@link crystal.Close#getCursorName <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Name</em>' attribute.
	 * @see #getCursorName()
	 * @generated
	 */
	void setCursorName(String value);

} // Close
