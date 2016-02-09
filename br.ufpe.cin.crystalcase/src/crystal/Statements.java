/**
 */
package crystal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crystal.Statements#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see crystal.CrystalPackage#getStatements()
 * @model abstract="true"
 *        annotation="gmf.node label='description' label.icon='true' label.placement='internal'"
 * @generated
 */
public interface Statements extends EObject {
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
	 * @see crystal.CrystalPackage#getStatements_Description()
	 * @model default="Description"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link crystal.Statements#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Statements
