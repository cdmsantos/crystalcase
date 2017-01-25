/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cursor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Cursor#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Cursor#getCursorQuery <em>Cursor Query</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCursor()
 * @model annotation="gmf.node label.text='Cursor'"
 * @generated
 */
public interface Cursor extends DataAbstractions {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Cursor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getCursor_ClassName()
	 * @model default="Cursor"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.Cursor#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Cursor Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Query</em>' attribute.
	 * @see #setCursorQuery(String)
	 * @see crystal.CrystalPackage#getCursor_CursorQuery()
	 * @model
	 * @generated
	 */
	String getCursorQuery();

	/**
	 * Sets the value of the '{@link crystal.Cursor#getCursorQuery <em>Cursor Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Query</em>' attribute.
	 * @see #getCursorQuery()
	 * @generated
	 */
	void setCursorQuery(String value);

} // Cursor
