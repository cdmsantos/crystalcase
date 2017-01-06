/**
 */
package crystal.impl;

import crystal.AnonymousBlock;
import crystal.Crystal;
import crystal.CrystalPackage;
import crystal.Function;
import crystal.Links;
import crystal.Procedure;
import crystal.SelectorTransition;
import crystal.Subprograms;
import crystal.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crystal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crystal.impl.CrystalImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link crystal.impl.CrystalImpl#getSubprograms <em>Subprograms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrystalImpl extends EObjectImpl implements Crystal {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Links> links;

	/**
	 * The cached value of the '{@link #getSubprograms() <em>Subprograms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Subprograms> subprograms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrystalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrystalPackage.Literals.CRYSTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Links> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Links>(Links.class, this, CrystalPackage.CRYSTAL__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subprograms> getSubprograms() {
		if (subprograms == null) {
			subprograms = new EObjectContainmentEList<Subprograms>(Subprograms.class, this, CrystalPackage.CRYSTAL__SUBPROGRAMS);
		}
		return subprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrystalPackage.CRYSTAL__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case CrystalPackage.CRYSTAL__SUBPROGRAMS:
				return ((InternalEList<?>)getSubprograms()).basicRemove(otherEnd, msgs);
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
			case CrystalPackage.CRYSTAL__LINKS:
				return getLinks();
			case CrystalPackage.CRYSTAL__SUBPROGRAMS:
				return getSubprograms();
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
			case CrystalPackage.CRYSTAL__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Links>)newValue);
				return;
			case CrystalPackage.CRYSTAL__SUBPROGRAMS:
				getSubprograms().clear();
				getSubprograms().addAll((Collection<? extends Subprograms>)newValue);
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
			case CrystalPackage.CRYSTAL__LINKS:
				getLinks().clear();
				return;
			case CrystalPackage.CRYSTAL__SUBPROGRAMS:
				getSubprograms().clear();
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
			case CrystalPackage.CRYSTAL__LINKS:
				return links != null && !links.isEmpty();
			case CrystalPackage.CRYSTAL__SUBPROGRAMS:
				return subprograms != null && !subprograms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CrystalImpl
