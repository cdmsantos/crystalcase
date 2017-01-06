/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Blocks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.CallBlocks#getNameSubroutine <em>Name Subroutine</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCallBlocks()
 * @model abstract="true"
 *        annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface CallBlocks extends Statements {
	/**
	 * Returns the value of the '<em><b>Name Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Subroutine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Subroutine</em>' attribute.
	 * @see #setNameSubroutine(String)
	 * @see crystal.CrystalPackage#getCallBlocks_NameSubroutine()
	 * @model
	 * @generated
	 */
	String getNameSubroutine();

	/**
	 * Sets the value of the '{@link crystal.CallBlocks#getNameSubroutine <em>Name Subroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Subroutine</em>' attribute.
	 * @see #getNameSubroutine()
	 * @generated
	 */
	void setNameSubroutine(String value);

} // CallBlocks
