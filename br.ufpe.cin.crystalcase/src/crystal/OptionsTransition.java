/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.OptionsTransition#getSource <em>Source</em>}</li>
 *   <li>{@link crystal.OptionsTransition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getOptionsTransition()
 * @model annotation="gmf.link source='source' target='target' incoming='true' target.decoration='arrow' style='dash' color='0,0,0' width='1' label='name' label.text='Case Connection' label.icon='true'"
 * @generated
 */
public interface OptionsTransition extends Links {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Options)
	 * @see crystal.CrystalPackage#getOptionsTransition_Source()
	 * @model
	 * @generated
	 */
	Options getSource();

	/**
	 * Sets the value of the '{@link crystal.OptionsTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Options value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Options)
	 * @see crystal.CrystalPackage#getOptionsTransition_Target()
	 * @model
	 * @generated
	 */
	Options getTarget();

	/**
	 * Sets the value of the '{@link crystal.OptionsTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Options value);

} // OptionsTransition
