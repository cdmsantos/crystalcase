/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Structures</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.IterationStructures#getInterations_statements <em>Interations statements</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getIterationStructures()
 * @model abstract="true"
 *        annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface IterationStructures extends Statements {
	/**
	 * Returns the value of the '<em><b>Interations statements</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Statements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interations statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interations statements</em>' containment reference list.
	 * @see crystal.CrystalPackage#getIterationStructures_Interations_statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statements> getInterations_statements();

} // IterationStructures
