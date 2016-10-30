/**
 */
package crystal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.SelectorTransition#getName <em>Name</em>}</li>
 *   <li>{@link crystal.SelectorTransition#getSource <em>Source</em>}</li>
 *   <li>{@link crystal.SelectorTransition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getSelectorTransition()
 * @model annotation="gmf.link source='source' target='target' incoming='true' target.decoration='arrow' color='0,0,0' width='1' label='name' label.text='Case Connection' label.icon='true'"
 * @generated
 */
public interface SelectorTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Connection"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crystal.CrystalPackage#getSelectorTransition_Name()
	 * @model default="Connection"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crystal.SelectorTransition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Selector)
	 * @see crystal.CrystalPackage#getSelectorTransition_Source()
	 * @model
	 * @generated
	 */
	Selector getSource();

	/**
	 * Sets the value of the '{@link crystal.SelectorTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Selector value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Selector)
	 * @see crystal.CrystalPackage#getSelectorTransition_Target()
	 * @model
	 * @generated
	 */
	Selector getTarget();

	/**
	 * Sets the value of the '{@link crystal.SelectorTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Selector value);

} // SelectorTransition
