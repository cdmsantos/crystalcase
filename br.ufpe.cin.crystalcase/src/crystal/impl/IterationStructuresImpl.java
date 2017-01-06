/**
 */
package crystal.impl;

import crystal.CrystalPackage;
import crystal.IterationStructures;
import crystal.Statements;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Structures</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.IterationStructuresImpl#getInterations_statements <em>Interations statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IterationStructuresImpl extends StatementsImpl implements IterationStructures {
	/**
	 * The cached value of the '{@link #getInterations_statements() <em>Interations statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterations_statements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statements> interations_statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationStructuresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.ITERATION_STRUCTURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statements> getInterations_statements() {
		if (interations_statements == null) {
			interations_statements = new EObjectContainmentEList<Statements>(Statements.class, this, CrystalPackage.ITERATION_STRUCTURES__INTERATIONS_STATEMENTS);
		}
		return interations_statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrystalPackage.ITERATION_STRUCTURES__INTERATIONS_STATEMENTS:
				return ((InternalEList<?>)getInterations_statements()).basicRemove(otherEnd, msgs);
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
			case CrystalPackage.ITERATION_STRUCTURES__INTERATIONS_STATEMENTS:
				return getInterations_statements();
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
			case CrystalPackage.ITERATION_STRUCTURES__INTERATIONS_STATEMENTS:
				getInterations_statements().clear();
				getInterations_statements().addAll((Collection<? extends Statements>)newValue);
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
			case CrystalPackage.ITERATION_STRUCTURES__INTERATIONS_STATEMENTS:
				getInterations_statements().clear();
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
			case CrystalPackage.ITERATION_STRUCTURES__INTERATIONS_STATEMENTS:
				return interations_statements != null && !interations_statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IterationStructuresImpl
