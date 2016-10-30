/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Selector#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Selector#getCondition <em>Condition</em>}</li>
 *   <li>{@link crystal.Selector#getDescription <em>Description</em>}</li>
 *   <li>{@link crystal.Selector#getCaseStatements <em>Case Statements</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getSelector()
 * @model annotation="gmf.node figure='rectangle' label='description' label.icon='true' label.placement='internal'"
 * @generated
 */
public interface Selector extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Selector"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getSelector_ClassName()
	 * @model default="Selector"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.Selector#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"Type the condition for this Selector"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see crystal.CrystalPackage#getSelector_Condition()
	 * @model default="Type the condition for this Selector"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link crystal.Selector#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Case Statements</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Statements</em>' containment reference list.
	 * @see crystal.CrystalPackage#getSelector_CaseStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getCaseStatements();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Description"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see crystal.CrystalPackage#getSelector_Description()
	 * @model default="Description"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link crystal.Selector#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Selector
