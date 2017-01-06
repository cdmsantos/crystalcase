/**
 */
package crystal.impl;

import crystal.CrystalPackage;
import crystal.If;

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
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.IfImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link crystal.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link crystal.impl.IfImpl#getTrue_statements <em>True statements</em>}</li>
 *   <li>{@link crystal.impl.IfImpl#getFalse_statements <em>False statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends ConditionalStructuresImpl implements If {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrue_statements() <em>True statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrue_statements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statements> true_statements;

	/**
	 * The cached value of the '{@link #getFalse_statements() <em>False statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalse_statements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statements> false_statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.IF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.IF__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrystalPackage.IF__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statements> getTrue_statements() {
		if (true_statements == null) {
			true_statements = new EObjectContainmentEList<Statements>(Statements.class, this, CrystalPackage.IF__TRUE_STATEMENTS);
		}
		return true_statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statements> getFalse_statements() {
		if (false_statements == null) {
			false_statements = new EObjectContainmentEList<Statements>(Statements.class, this, CrystalPackage.IF__FALSE_STATEMENTS);
		}
		return false_statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrystalPackage.IF__TRUE_STATEMENTS:
				return ((InternalEList<?>)getTrue_statements()).basicRemove(otherEnd, msgs);
			case CrystalPackage.IF__FALSE_STATEMENTS:
				return ((InternalEList<?>)getFalse_statements()).basicRemove(otherEnd, msgs);
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
			case CrystalPackage.IF__CLASS_NAME:
				return getClassName();
			case CrystalPackage.IF__CONDITION:
				return getCondition();
			case CrystalPackage.IF__TRUE_STATEMENTS:
				return getTrue_statements();
			case CrystalPackage.IF__FALSE_STATEMENTS:
				return getFalse_statements();
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
			case CrystalPackage.IF__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case CrystalPackage.IF__CONDITION:
				setCondition((String)newValue);
				return;
			case CrystalPackage.IF__TRUE_STATEMENTS:
				getTrue_statements().clear();
				getTrue_statements().addAll((Collection<? extends Statements>)newValue);
				return;
			case CrystalPackage.IF__FALSE_STATEMENTS:
				getFalse_statements().clear();
				getFalse_statements().addAll((Collection<? extends Statements>)newValue);
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
			case CrystalPackage.IF__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case CrystalPackage.IF__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case CrystalPackage.IF__TRUE_STATEMENTS:
				getTrue_statements().clear();
				return;
			case CrystalPackage.IF__FALSE_STATEMENTS:
				getFalse_statements().clear();
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
			case CrystalPackage.IF__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case CrystalPackage.IF__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case CrystalPackage.IF__TRUE_STATEMENTS:
				return true_statements != null && !true_statements.isEmpty();
			case CrystalPackage.IF__FALSE_STATEMENTS:
				return false_statements != null && !false_statements.isEmpty();
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
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //IfImpl
