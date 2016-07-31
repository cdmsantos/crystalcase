/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.CrystalCase#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link crystal.CrystalCase#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link crystal.CrystalCase#getFunctions <em>Functions</em>}</li>
 *   <li>{@link crystal.CrystalCase#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getCrystalCase()
 * @model annotation="gmf.diagram foo='bar' rcp='false' onefile='true' diagram.extension='crystal'"
 * @generated
 */
public interface CrystalCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCrystalCase_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Procedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCrystalCase_Procedures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Procedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCrystalCase_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link crystal.AnonymousBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see crystal.CrystalPackage#getCrystalCase_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnonymousBlock> getBlocks();

} // CrystalCase
