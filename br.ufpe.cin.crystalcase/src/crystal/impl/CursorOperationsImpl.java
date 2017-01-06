/**
 */
package crystal.impl;

import crystal.CrystalPackage;
import crystal.CursorOperations;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cursor Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.CursorOperationsImpl#getCursorName <em>Cursor Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CursorOperationsImpl extends StatementsImpl implements CursorOperations {
	/**
	 * The default value of the '{@link #getCursorName() <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorName()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursorName() <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursorName()
	 * @generated
	 * @ordered
	 */
	protected String cursorName = CURSOR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CursorOperationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.CURSOR_OPERATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursorName() {
		return cursorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorName(String newCursorName) {
		String oldCursorName = cursorName;
		cursorName = newCursorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.CURSOR_OPERATIONS__CURSOR_NAME, oldCursorName, cursorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrystalPackage.CURSOR_OPERATIONS__CURSOR_NAME:
				return getCursorName();
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
			case CrystalPackage.CURSOR_OPERATIONS__CURSOR_NAME:
				setCursorName((String)newValue);
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
			case CrystalPackage.CURSOR_OPERATIONS__CURSOR_NAME:
				setCursorName(CURSOR_NAME_EDEFAULT);
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
			case CrystalPackage.CURSOR_OPERATIONS__CURSOR_NAME:
				return CURSOR_NAME_EDEFAULT == null ? cursorName != null : !CURSOR_NAME_EDEFAULT.equals(cursorName);
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
		result.append(" (cursorName: ");
		result.append(cursorName);
		result.append(')');
		return result.toString();
	}

} //CursorOperationsImpl
