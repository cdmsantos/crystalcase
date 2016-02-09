/**
 */
package crystal.impl;

import crystal.CrystalPackage;
import crystal.Parameters;
import crystal.Statements;
import crystal.Subprograms;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprograms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crystal.impl.SubprogramsImpl#getName <em>Name</em>}</li>
 *   <li>{@link crystal.impl.SubprogramsImpl#getDeclarativePart <em>Declarative Part</em>}</li>
 *   <li>{@link crystal.impl.SubprogramsImpl#getExecutablePart <em>Executable Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SubprogramsImpl extends EObjectImpl implements Subprograms {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarativePart() <em>Declarative Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarativePart()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> declarativePart;

	/**
	 * The cached value of the '{@link #getExecutablePart() <em>Executable Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutablePart()
	 * @generated
	 * @ordered
	 */
	protected EList<Statements> executablePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.SUBPROGRAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.SUBPROGRAMS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameters> getDeclarativePart() {
		if (declarativePart == null) {
			declarativePart = new EObjectContainmentEList<Parameters>(Parameters.class, this, CrystalPackage.SUBPROGRAMS__DECLARATIVE_PART);
		}
		return declarativePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statements> getExecutablePart() {
		if (executablePart == null) {
			executablePart = new EObjectContainmentEList<Statements>(Statements.class, this, CrystalPackage.SUBPROGRAMS__EXECUTABLE_PART);
		}
		return executablePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrystalPackage.SUBPROGRAMS__DECLARATIVE_PART:
				return ((InternalEList<?>)getDeclarativePart()).basicRemove(otherEnd, msgs);
			case CrystalPackage.SUBPROGRAMS__EXECUTABLE_PART:
				return ((InternalEList<?>)getExecutablePart()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrystalPackage.SUBPROGRAMS__NAME:
				return getName();
			case CrystalPackage.SUBPROGRAMS__DECLARATIVE_PART:
				return getDeclarativePart();
			case CrystalPackage.SUBPROGRAMS__EXECUTABLE_PART:
				return getExecutablePart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrystalPackage.SUBPROGRAMS__NAME:
				setName((String)newValue);
				return;
			case CrystalPackage.SUBPROGRAMS__DECLARATIVE_PART:
				getDeclarativePart().clear();
				getDeclarativePart().addAll((Collection<? extends Parameters>)newValue);
				return;
			case CrystalPackage.SUBPROGRAMS__EXECUTABLE_PART:
				getExecutablePart().clear();
				getExecutablePart().addAll((Collection<? extends Statements>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CrystalPackage.SUBPROGRAMS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrystalPackage.SUBPROGRAMS__DECLARATIVE_PART:
				getDeclarativePart().clear();
				return;
			case CrystalPackage.SUBPROGRAMS__EXECUTABLE_PART:
				getExecutablePart().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CrystalPackage.SUBPROGRAMS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CrystalPackage.SUBPROGRAMS__DECLARATIVE_PART:
				return declarativePart != null && !declarativePart.isEmpty();
			case CrystalPackage.SUBPROGRAMS__EXECUTABLE_PART:
				return executablePart != null && !executablePart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubprogramsImpl
