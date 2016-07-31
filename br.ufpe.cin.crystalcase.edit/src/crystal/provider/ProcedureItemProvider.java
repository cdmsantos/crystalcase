/**
 */
package crystal.provider;


import crystal.CrystalFactory;
import crystal.CrystalPackage;
import crystal.Procedure;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link crystal.Procedure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcedureItemProvider extends SubprogramsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CrystalPackage.Literals.PROCEDURE__PARAMETERS);
			childrenFeatures.add(CrystalPackage.Literals.PROCEDURE__DECLARATIVE_PART);
			childrenFeatures.add(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART);
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
	 * This returns Procedure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Procedure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Procedure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Procedure_type") :
			getString("_UI_Procedure_type") + " " + label;
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

		switch (notification.getFeatureID(Procedure.class)) {
			case CrystalPackage.PROCEDURE__PARAMETERS:
			case CrystalPackage.PROCEDURE__DECLARATIVE_PART:
			case CrystalPackage.PROCEDURE__EXECUTABLE_PART:
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
				(CrystalPackage.Literals.PROCEDURE__PARAMETERS,
				 CrystalFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__PARAMETERS,
				 CrystalFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__PARAMETERS,
				 CrystalFactory.eINSTANCE.createRecords()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__PARAMETERS,
				 CrystalFactory.eINSTANCE.createCursor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createRecords()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__DECLARATIVE_PART,
				 CrystalFactory.eINSTANCE.createCursor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createException()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createCase()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createInsert()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createFor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createOpen()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createFetch()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createClose()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createCallProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.PROCEDURE__EXECUTABLE_PART,
				 CrystalFactory.eINSTANCE.createCallFunction()));
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
			childFeature == CrystalPackage.Literals.PROCEDURE__PARAMETERS ||
			childFeature == CrystalPackage.Literals.PROCEDURE__DECLARATIVE_PART;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
