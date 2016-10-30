/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.CallProcedure#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.CallProcedure#getNameSubroutine <em>Name Subroutine</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCallProcedure()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface CallProcedure extends Statements {

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"CallProcedure"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getCallProcedure_ClassName()
	 * @model default="CallProcedure"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.CallProcedure#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

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
	 * @see crystal.CrystalPackage#getCallProcedure_NameSubroutine()
	 * @model
	 * @generated
	 */
	String getNameSubroutine();

	/**
	 * Sets the value of the '{@link crystal.CallProcedure#getNameSubroutine <em>Name Subroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Subroutine</em>' attribute.
	 * @see #getNameSubroutine()
	 * @generated
	 */
	void setNameSubroutine(String value);
} // CallProcedure
