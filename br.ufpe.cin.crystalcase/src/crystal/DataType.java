/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crystal.DataType#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.DataType#getOptions <em>Options</em>}</li>
 *   <li>{@link crystal.DataType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link crystal.DataType#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see crystal.CrystalPackage#getDataType()
 * @model annotation="gmf.node label.text='Data Type'"
 * @generated
 */
public interface DataType extends Parameters { 
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"DataType"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getDataType_ClassName()
	 * @model default="DataType"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.DataType#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * The literals are from the enumeration {@link crystal.DataTypeOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see crystal.DataTypeOptions
	 * @see #setOptions(DataTypeOptions)
	 * @see crystal.CrystalPackage#getDataType_Options()
	 * @model
	 * @generated
	 */
	DataTypeOptions getOptions();

	/**
	 * Sets the value of the '{@link crystal.DataType#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see crystal.DataTypeOptions
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(DataTypeOptions value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see crystal.CrystalPackage#getDataType_Precision()
	 * @model default="1"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link crystal.DataType#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see crystal.CrystalPackage#getDataType_Scale()
	 * @model default="0"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link crystal.DataType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

} // DataType
