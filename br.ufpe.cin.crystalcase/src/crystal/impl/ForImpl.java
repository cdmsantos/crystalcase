/**
 */
package crystal.impl;

import crystal.CrystalPackage;
import crystal.For;
import crystal.ForCounter;

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
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.ForImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.impl.ForImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link crystal.impl.ForImpl#getTypeCounter <em>Type Counter</em>}</li>
 *   <li>{@link crystal.impl.ForImpl#getLowestNumber <em>Lowest Number</em>}</li>
 *   <li>{@link crystal.impl.ForImpl#getHighestNumber <em>Highest Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForImpl extends IterationStructuresImpl implements For {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = "For";

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
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected String counter = COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeCounter() <em>Type Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final ForCounter TYPE_COUNTER_EDEFAULT = ForCounter.NORMAL;

	/**
	 * The cached value of the '{@link #getTypeCounter() <em>Type Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCounter()
	 * @generated
	 * @ordered
	 */
	protected ForCounter typeCounter = TYPE_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowestNumber() <em>Lowest Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowestNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWEST_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowestNumber() <em>Lowest Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowestNumber()
	 * @generated
	 * @ordered
	 */
	protected int lowestNumber = LOWEST_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighestNumber() <em>Highest Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGHEST_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHighestNumber() <em>Highest Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestNumber()
	 * @generated
	 * @ordered
	 */
	protected int highestNumber = HIGHEST_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.FOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.FOR__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(String newCounter) {
		String oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.FOR__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForCounter getTypeCounter() {
		return typeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCounter(ForCounter newTypeCounter) {
		ForCounter oldTypeCounter = typeCounter;
		typeCounter = newTypeCounter == null ? TYPE_COUNTER_EDEFAULT : newTypeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.FOR__TYPE_COUNTER, oldTypeCounter, typeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowestNumber() {
		return lowestNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowestNumber(int newLowestNumber) {
		int oldLowestNumber = lowestNumber;
		lowestNumber = newLowestNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.FOR__LOWEST_NUMBER, oldLowestNumber, lowestNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHighestNumber() {
		return highestNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighestNumber(int newHighestNumber) {
		int oldHighestNumber = highestNumber;
		highestNumber = newHighestNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.FOR__HIGHEST_NUMBER, oldHighestNumber, highestNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrystalPackage.FOR__CLASS_NAME:
				return getClassName();
			case CrystalPackage.FOR__COUNTER:
				return getCounter();
			case CrystalPackage.FOR__TYPE_COUNTER:
				return getTypeCounter();
			case CrystalPackage.FOR__LOWEST_NUMBER:
				return getLowestNumber();
			case CrystalPackage.FOR__HIGHEST_NUMBER:
				return getHighestNumber();
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
			case CrystalPackage.FOR__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case CrystalPackage.FOR__COUNTER:
				setCounter((String)newValue);
				return;
			case CrystalPackage.FOR__TYPE_COUNTER:
				setTypeCounter((ForCounter)newValue);
				return;
			case CrystalPackage.FOR__LOWEST_NUMBER:
				setLowestNumber((Integer)newValue);
				return;
			case CrystalPackage.FOR__HIGHEST_NUMBER:
				setHighestNumber((Integer)newValue);
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
			case CrystalPackage.FOR__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case CrystalPackage.FOR__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case CrystalPackage.FOR__TYPE_COUNTER:
				setTypeCounter(TYPE_COUNTER_EDEFAULT);
				return;
			case CrystalPackage.FOR__LOWEST_NUMBER:
				setLowestNumber(LOWEST_NUMBER_EDEFAULT);
				return;
			case CrystalPackage.FOR__HIGHEST_NUMBER:
				setHighestNumber(HIGHEST_NUMBER_EDEFAULT);
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
			case CrystalPackage.FOR__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case CrystalPackage.FOR__COUNTER:
				return COUNTER_EDEFAULT == null ? counter != null : !COUNTER_EDEFAULT.equals(counter);
			case CrystalPackage.FOR__TYPE_COUNTER:
				return typeCounter != TYPE_COUNTER_EDEFAULT;
			case CrystalPackage.FOR__LOWEST_NUMBER:
				return lowestNumber != LOWEST_NUMBER_EDEFAULT;
			case CrystalPackage.FOR__HIGHEST_NUMBER:
				return highestNumber != HIGHEST_NUMBER_EDEFAULT;
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
		result.append(", counter: ");
		result.append(counter);
		result.append(", typeCounter: ");
		result.append(typeCounter);
		result.append(", lowestNumber: ");
		result.append(lowestNumber);
		result.append(", highestNumber: ");
		result.append(highestNumber);
		result.append(')');
		return result.toString();
	}

} //ForImpl
