/**
 */
package crystal.impl;

import crystal.CrystalPackage;
import crystal.DataAbstractions;
import crystal.Function;
import crystal.Parameters;

import crystal.Statements;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.FunctionImpl#getReturnPart <em>Return Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends NamedBlocksImpl implements Function {
	/**
	 * The cached value of the '{@link #getReturnPart() <em>Return Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnPart()
	 * @generated
	 * @ordered
	 */
	protected DataAbstractions returnPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAbstractions getReturnPart() {
		return returnPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnPart(DataAbstractions newReturnPart, NotificationChain msgs) {
		DataAbstractions oldReturnPart = returnPart;
		returnPart = newReturnPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrystalPackage.FUNCTION__RETURN_PART, oldReturnPart, newReturnPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnPart(DataAbstractions newReturnPart) {
		if (newReturnPart != returnPart) {
			NotificationChain msgs = null;
			if (returnPart != null)
				msgs = ((InternalEObject)returnPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrystalPackage.FUNCTION__RETURN_PART, null, msgs);
			if (newReturnPart != null)
				msgs = ((InternalEObject)newReturnPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrystalPackage.FUNCTION__RETURN_PART, null, msgs);
			msgs = basicSetReturnPart(newReturnPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.FUNCTION__RETURN_PART, newReturnPart, newReturnPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrystalPackage.FUNCTION__RETURN_PART:
				return basicSetReturnPart(null, msgs);
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
			case CrystalPackage.FUNCTION__RETURN_PART:
				return getReturnPart();
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
			case CrystalPackage.FUNCTION__RETURN_PART:
				setReturnPart((DataAbstractions)newValue);
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
			case CrystalPackage.FUNCTION__RETURN_PART:
				setReturnPart((DataAbstractions)null);
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
			case CrystalPackage.FUNCTION__RETURN_PART:
				return returnPart != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
