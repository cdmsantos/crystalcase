/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.For#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.For#getCounter <em>Counter</em>}</li>
 *   <li>{@link crystal.For#getTypeCounter <em>Type Counter</em>}</li>
 *   <li>{@link crystal.For#getLowestNumber <em>Lowest Number</em>}</li>
 *   <li>{@link crystal.For#getHighestNumber <em>Highest Number</em>}</li>
 *   <li>{@link crystal.For#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getFor()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface For extends Statements {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"For"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see crystal.CrystalPackage#getFor_ClassName()
	 * @model default="For" changeable="false"
	 * @generated
	 */
	String getClassName();

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * The default value is <code>"Type the name of the FOR counter"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(String)
	 * @see crystal.CrystalPackage#getFor_Counter()
	 * @model default="Type the name of the FOR counter"
	 * @generated
	 */
	String getCounter();

	/**
	 * Sets the value of the '{@link crystal.For#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(String value);

	/**
	 * Returns the value of the '<em><b>Type Counter</b></em>' attribute.
	 * The literals are from the enumeration {@link crystal.ForCounter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Counter</em>' attribute.
	 * @see crystal.ForCounter
	 * @see #setTypeCounter(ForCounter)
	 * @see crystal.CrystalPackage#getFor_TypeCounter()
	 * @model
	 * @generated
	 */
	ForCounter getTypeCounter();

	/**
	 * Sets the value of the '{@link crystal.For#getTypeCounter <em>Type Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Counter</em>' attribute.
	 * @see crystal.ForCounter
	 * @see #getTypeCounter()
	 * @generated
	 */
	void setTypeCounter(ForCounter value);

	/**
	 * Returns the value of the '<em><b>Lowest Number</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lowest Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowest Number</em>' attribute.
	 * @see #setLowestNumber(int)
	 * @see crystal.CrystalPackage#getFor_LowestNumber()
	 * @model default="0"
	 * @generated
	 */
	int getLowestNumber();

	/**
	 * Sets the value of the '{@link crystal.For#getLowestNumber <em>Lowest Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowest Number</em>' attribute.
	 * @see #getLowestNumber()
	 * @generated
	 */
	void setLowestNumber(int value);

	/**
	 * Returns the value of the '<em><b>Highest Number</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highest Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highest Number</em>' attribute.
	 * @see #setHighestNumber(int)
	 * @see crystal.CrystalPackage#getFor_HighestNumber()
	 * @model default="0"
	 * @generated
	 */
	int getHighestNumber();

	/**
	 * Sets the value of the '{@link crystal.For#getHighestNumber <em>Highest Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highest Number</em>' attribute.
	 * @see #getHighestNumber()
	 * @generated
	 */
	void setHighestNumber(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"Type the FOR code"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see crystal.CrystalPackage#getFor_Code()
	 * @model default="Type the FOR code"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link crystal.For#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // For
