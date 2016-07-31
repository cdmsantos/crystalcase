/**
 */
package crystal.provider;


import crystal.AnonymousBlock;

import crystal.CrystalFactory;
import crystal.CrystalPackage;
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
 * This is the item provider adapter for a {@link crystal.AnonymousBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnonymousBlockItemProvider extends SubprogramsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousBlockItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CrystalPackage.Literals.ANONYMOUS_BLOCK__DECLARATIVE_PART);
			childrenFeatures.add(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART);
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
	 * This returns AnonymousBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnonymousBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnonymousBlock)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AnonymousBlock_type") :
			getString("_UI_AnonymousBlock_type") + " " + label;
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

		switch (notification.getFeatureID(AnonymousBlock.class)) {
			case CrystalPackage.ANONYMOUS_BLOCK__DECLARATIVE_PART:
			case CrystalPackage.ANONYMOUS_BLOCK__EXECUTABLE_PART:
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
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createRecords()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createCursor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createException()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createCase()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createInsert()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createFor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createOpen()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createFetch()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createClose()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createCallProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.ANONYMOUS_BLOCK__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createCallFunction()));
	}

}
