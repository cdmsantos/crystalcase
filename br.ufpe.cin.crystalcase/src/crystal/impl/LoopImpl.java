/**
 */
package crystal.impl;

import crystal.CrystalPackage;
import crystal.Loop;

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
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.LoopImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.impl.LoopImpl#getBreakCondition <em>Break Condition</em>}</li>
 *   <li>{@link crystal.impl.LoopImpl#getLoopStatements <em>Loop Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends StatementsImpl implements Loop {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = "Loop";
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
	 * The default value of the '{@link #getBreakCondition() <em>Break Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAK_CONDITION_EDEFAULT = "Type the break condition for LOOP";
	/**
	 * The cached value of the '{@link #getBreakCondition() <em>Break Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakCondition()
	 * @generated
	 * @ordered
	 */
	protected String breakCondition = BREAK_CONDITION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getLoopStatements() <em>Loop Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statements> loopStatements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.LOOP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.LOOP__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBreakCondition() {
		return breakCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakCondition(String newBreakCondition) {
		String oldBreakCondition = breakCondition;
		breakCondition = newBreakCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.LOOP__BREAK_CONDITION, oldBreakCondition, breakCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statements> getLoopStatements() {
		if (loopStatements == null) {
			loopStatements = new EObjectContainmentEList<Statements>(Statements.class, this, CrystalPackage.LOOP__LOOP_STATEMENTS);
		}
		return loopStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrystalPackage.LOOP__LOOP_STATEMENTS:
				return ((InternalEList<?>)getLoopStatements()).basicRemove(otherEnd, msgs);
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
			case CrystalPackage.LOOP__CLASS_NAME:
				return getClassName();
			case CrystalPackage.LOOP__BREAK_CONDITION:
				return getBreakCondition();
			case CrystalPackage.LOOP__LOOP_STATEMENTS:
				return getLoopStatements();
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
			case CrystalPackage.LOOP__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case CrystalPackage.LOOP__BREAK_CONDITION:
				setBreakCondition((String)newValue);
				return;
			case CrystalPackage.LOOP__LOOP_STATEMENTS:
				getLoopStatements().clear();
				getLoopStatements().addAll((Collection<? extends Statements>)newValue);
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
			case CrystalPackage.LOOP__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case CrystalPackage.LOOP__BREAK_CONDITION:
				setBreakCondition(BREAK_CONDITION_EDEFAULT);
				return;
			case CrystalPackage.LOOP__LOOP_STATEMENTS:
				getLoopStatements().clear();
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
			case CrystalPackage.LOOP__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case CrystalPackage.LOOP__BREAK_CONDITION:
				return BREAK_CONDITION_EDEFAULT == null ? breakCondition != null : !BREAK_CONDITION_EDEFAULT.equals(breakCondition);
			case CrystalPackage.LOOP__LOOP_STATEMENTS:
				return loopStatements != null && !loopStatements.isEmpty();
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
		result.append(", breakCondition: ");
		result.append(breakCondition);
		result.append(')');
		return result.toString();
	}

} //LoopImpl
