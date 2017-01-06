/**
 */
package crystal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Abstractions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.DataAbstractions#getName <em>Name</em>}</li>
 *   <li>{@link crystal.DataAbstractions#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getDataAbstractions()
 * @model abstract="true"
 *        annotation="gmf.node label='name' figure='rectangle' border.width='1' label.icon='true' label.readOnly='true' label.placement='internal'"
 * @generated
 */
public interface DataAbstractions extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crystal.CrystalPackage#getDataAbstractions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crystal.DataAbstractions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link crystal.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see crystal.ParameterType
	 * @see #setType(ParameterType)
	 * @see crystal.CrystalPackage#getDataAbstractions_Type()
	 * @model
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link crystal.DataAbstractions#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see crystal.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

} // DataAbstractions
