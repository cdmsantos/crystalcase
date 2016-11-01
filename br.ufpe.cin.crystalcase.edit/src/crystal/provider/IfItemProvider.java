/**
 */
package crystal.provider;


import crystal.CrystalFactory;
import crystal.CrystalPackage;
import crystal.If;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link crystal.If} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfItemProvider extends StatementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addClassNamePropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_If_className_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_If_className_feature", "_UI_If_type"),
				 CrystalPackage.Literals.IF__CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_If_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_If_condition_feature", "_UI_If_type"),
				 CrystalPackage.Literals.IF__CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CrystalPackage.Literals.IF__IFS);
			childrenFeatures.add(CrystalPackage.Literals.IF__ELSES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns If.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/If"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((If)object).getClassName();
		return label == null || label.length() == 0 ?
			getString("_UI_If_type") :
			getString("_UI_If_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(If.class)) {
			case CrystalPackage.IF__CLASS_NAME:
			case CrystalPackage.IF__CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CrystalPackage.IF__IFS:
			case CrystalPackage.IF__ELSES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createException()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createCase()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createInsert()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createFor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createOpen()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createFetch()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createClose()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createCallProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__IFS,
				 CrystalFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createException()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createCase()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createInsert()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createFor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createOpen()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createFetch()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createClose()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createCallProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.IF__ELSES,
				 CrystalFactory.eINSTANCE.createExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CrystalPackage.Literals.IF__IFS ||
			childFeature == CrystalPackage.Literals.IF__ELSES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
