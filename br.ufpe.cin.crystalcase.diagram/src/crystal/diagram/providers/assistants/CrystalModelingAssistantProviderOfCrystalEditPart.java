/*
 * 
 */
package crystal.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import crystal.diagram.providers.CrystalElementTypes;
import crystal.diagram.providers.CrystalModelingAssistantProvider;

/**
 * @generated
 */
public class CrystalModelingAssistantProviderOfCrystalEditPart extends
		CrystalModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrystalElementTypes.Procedure_2001);
		types.add(CrystalElementTypes.Function_2002);
		types.add(CrystalElementTypes.AnonymousBlock_2003);
		return types;
	}

}
