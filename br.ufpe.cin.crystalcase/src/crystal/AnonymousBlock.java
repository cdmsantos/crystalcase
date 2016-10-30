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
 *   <li>{@link crystal.AnonymousBlock#getDeclarativePart <em>Declarative Part</em>}</li>
 *   <li>{@link crystal.AnonymousBlock#getExecutablePart <em>Executable Part</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getAnonymousBlock()
 * @model annotation="gmf.node label='name' label.text='Anonymous Block' border.color='43,106,215' border.style='dash'"
 * @generated
 */
public interface AnonymousBlock extends Subprograms {

	/**
	 * Returns the value of the '<em><b>Declarative Part</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarative Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarative Part</em>' containment reference list.
	 * @see crystal.CrystalPackage#getAnonymousBlock_DeclarativePart()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getDeclarativePart();

	/**
	 * Returns the value of the '<em><b>Executable Part</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Part</em>' containment reference list.
	 * @see crystal.CrystalPackage#getAnonymousBlock_ExecutablePart()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getExecutablePart();
} // AnonymousBlock
