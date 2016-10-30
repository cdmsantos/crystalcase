/**
 */
package crystal.impl;

import crystal.CallFunction;
import crystal.CrystalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.CallFunctionImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.impl.CallFunctionImpl#getNameSubroutine <em>Name Subroutine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallFunctionImpl extends StatementsImpl implements CallFunction {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = "CallFunction";
	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;
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
	protected CallFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.CALL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.CALL_FUNCTION__CLASS_NAME, oldClassName, className));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.CALL_FUNCTION__NAME_SUBROUTINE, oldNameSubroutine, nameSubroutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrystalPackage.CALL_FUNCTION__CLASS_NAME:
				return getClassName();
			case CrystalPackage.CALL_FUNCTION__NAME_SUBROUTINE:
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
			case CrystalPackage.CALL_FUNCTION__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case CrystalPackage.CALL_FUNCTION__NAME_SUBROUTINE:
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
			case CrystalPackage.CALL_FUNCTION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case CrystalPackage.CALL_FUNCTION__NAME_SUBROUTINE:
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
			case CrystalPackage.CALL_FUNCTION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case CrystalPackage.CALL_FUNCTION__NAME_SUBROUTINE:
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
		result.append(" (className: ");
		result.append(className);
		result.append(", nameSubroutine: ");
		result.append(nameSubroutine);
		result.append(')');
		return result.toString();
	}

} //CallFunctionImpl
