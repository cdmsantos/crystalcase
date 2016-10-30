/**
 */
package crystal.impl;

import crystal.CrystalPackage;
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
 *   <li>{@link crystal.impl.FunctionImpl#getDeclarativePart <em>Declarative Part</em>}</li>
 *   <li>{@link crystal.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link crystal.impl.FunctionImpl#getReturnPart <em>Return Part</em>}</li>
 *   <li>{@link crystal.impl.FunctionImpl#getExecutablePart <em>Executable Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends SubprogramsImpl implements Function {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> parameters;

	/**
	 * The cached value of the '{@link #getReturnPart() <em>Return Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnPart()
	 * @generated
	 * @ordered
	 */
	protected Parameters returnPart;

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
	public EList<Parameters> getDeclarativePart() {
		if (declarativePart == null) {
			declarativePart = new EObjectContainmentEList<Parameters>(Parameters.class, this, CrystalPackage.FUNCTION__DECLARATIVE_PART);
		}
		return declarativePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameters> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this, CrystalPackage.FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getReturnPart() {
		return returnPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnPart(Parameters newReturnPart, NotificationChain msgs) {
		Parameters oldReturnPart = returnPart;
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
	public void setReturnPart(Parameters newReturnPart) {
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
	public EList<Statements> getExecutablePart() {
		if (executablePart == null) {
			executablePart = new EObjectContainmentEList<Statements>(Statements.class, this, CrystalPackage.FUNCTION__EXECUTABLE_PART);
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
			case CrystalPackage.FUNCTION__DECLARATIVE_PART:
				return ((InternalEList<?>)getDeclarativePart()).basicRemove(otherEnd, msgs);
			case CrystalPackage.FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case CrystalPackage.FUNCTION__RETURN_PART:
				return basicSetReturnPart(null, msgs);
			case CrystalPackage.FUNCTION__EXECUTABLE_PART:
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
			case CrystalPackage.FUNCTION__DECLARATIVE_PART:
				return getDeclarativePart();
			case CrystalPackage.FUNCTION__PARAMETERS:
				return getParameters();
			case CrystalPackage.FUNCTION__RETURN_PART:
				return getReturnPart();
			case CrystalPackage.FUNCTION__EXECUTABLE_PART:
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
			case CrystalPackage.FUNCTION__DECLARATIVE_PART:
				getDeclarativePart().clear();
				getDeclarativePart().addAll((Collection<? extends Parameters>)newValue);
				return;
			case CrystalPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameters>)newValue);
				return;
			case CrystalPackage.FUNCTION__RETURN_PART:
				setReturnPart((Parameters)newValue);
				return;
			case CrystalPackage.FUNCTION__EXECUTABLE_PART:
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
			case CrystalPackage.FUNCTION__DECLARATIVE_PART:
				getDeclarativePart().clear();
				return;
			case CrystalPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case CrystalPackage.FUNCTION__RETURN_PART:
				setReturnPart((Parameters)null);
				return;
			case CrystalPackage.FUNCTION__EXECUTABLE_PART:
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
			case CrystalPackage.FUNCTION__DECLARATIVE_PART:
				return declarativePart != null && !declarativePart.isEmpty();
			case CrystalPackage.FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CrystalPackage.FUNCTION__RETURN_PART:
				return returnPart != null;
			case CrystalPackage.FUNCTION__EXECUTABLE_PART:
				return executablePart != null && !executablePart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
