/**
 */
package crystal.impl;

import crystal.CallBlocks;
import crystal.CrystalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Blocks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.CallBlocksImpl#getNameSubroutine <em>Name Subroutine</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallBlocksImpl extends StatementsImpl implements CallBlocks {
	/**
	 * The default value of the '{@link #getNameSubroutine() <em>Name Subroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSubroutine()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SUBROUTINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSubroutine() <em>Name Subroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSubroutine()
	 * @generated
	 * @ordered
	 */
	protected String nameSubroutine = NAME_SUBROUTINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBlocksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.CALL_BLOCKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSubroutine() {
		return nameSubroutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSubroutine(String newNameSubroutine) {
		String oldNameSubroutine = nameSubroutine;
		nameSubroutine = newNameSubroutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.CALL_BLOCKS__NAME_SUBROUTINE, oldNameSubroutine, nameSubroutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrystalPackage.CALL_BLOCKS__NAME_SUBROUTINE:
				return getNameSubroutine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CrystalPackage.CALL_BLOCKS__NAME_SUBROUTINE:
				setNameSubroutine((String)newValue);
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
			case CrystalPackage.CALL_BLOCKS__NAME_SUBROUTINE:
				setNameSubroutine(NAME_SUBROUTINE_EDEFAULT);
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
			case CrystalPackage.CALL_BLOCKS__NAME_SUBROUTINE:
				return NAME_SUBROUTINE_EDEFAULT == null ? nameSubroutine != null : !NAME_SUBROUTINE_EDEFAULT.equals(nameSubroutine);
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
		result.append(" (nameSubroutine: ");
		result.append(nameSubroutine);
		result.append(')');
		return result.toString();
	}

} //CallBlocksImpl
