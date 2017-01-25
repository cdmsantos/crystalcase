/**
 */
package crystal;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Loop#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.Loop#getBreakCondition <em>Break Condition</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getLoop()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface Loop extends IterationStructures {

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Loop"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getLoop_ClassName()
	 * @model default="Loop"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.Loop#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Break Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Condition</em>' attribute.
	 * @see #setBreakCondition(String)
	 * @see crystal.CrystalPackage#getLoop_BreakCondition()
	 * @model
	 * @generated
	 */
	String getBreakCondition();

	/**
	 * Sets the value of the '{@link crystal.Loop#getBreakCondition <em>Break Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Condition</em>' attribute.
	 * @see #getBreakCondition()
	 * @generated
	 */
	void setBreakCondition(String value);
} // Loop
