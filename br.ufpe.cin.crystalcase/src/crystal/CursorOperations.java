/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cursor Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.CursorOperations#getCursorName <em>Cursor Name</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCursorOperations()
 * @model abstract="true"
 *        annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface CursorOperations extends Statements {
	/**
	 * Returns the value of the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Name</em>' attribute.
	 * @see #setCursorName(String)
	 * @see crystal.CrystalPackage#getCursorOperations_CursorName()
	 * @model
	 * @generated
	 */
	String getCursorName();

	/**
	 * Sets the value of the '{@link crystal.CursorOperations#getCursorName <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Name</em>' attribute.
	 * @see #getCursorName()
	 * @generated
	 */
	void setCursorName(String value);

} // CursorOperations
