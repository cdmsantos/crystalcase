/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.AnonymousBlock#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getAnonymousBlock()
 * @model annotation="gmf.node label='description' label.text='Anonymous Block' border.color='43,106,215' border.style='dash'"
 * @generated
 */
public interface AnonymousBlock extends Subprograms {

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see crystal.CrystalPackage#getAnonymousBlock_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link crystal.AnonymousBlock#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);
} // AnonymousBlock
