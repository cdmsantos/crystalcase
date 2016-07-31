/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Collections#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Collections#getCode <em>Code</em>}</li>
 *   <li>{@link crystal.Collections#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCollections()
 * @model annotation="gmf.node label.text='Collection'"
 * @generated
 */
public interface Collections extends Parameters {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Collection"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see crystal.CrystalPackage#getCollections_ClassName()
	 * @model default="Collection" changeable="false"
	 * @generated
	 */
	String getClassName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"TYPE name IS TABLE OF NUMBER INDEX BY VARCHAR2(20)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see crystal.CrystalPackage#getCollections_Code()
	 * @model default="TYPE name IS TABLE OF NUMBER INDEX BY VARCHAR2(20)"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link crystal.Collections#getCode <em>Code</em>}' attribute.
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
	 * @see crystal.CrystalPackage#getCollections_TypeName()
	 * @model default=""
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link crystal.Collections#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // Collections
