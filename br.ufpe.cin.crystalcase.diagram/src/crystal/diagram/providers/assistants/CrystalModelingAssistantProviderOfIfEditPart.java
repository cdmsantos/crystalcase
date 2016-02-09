/*
 * 
 */
package crystal.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import crystal.diagram.edit.parts.AnonymousBlockEditPart;
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.CloseEditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
import crystal.diagram.edit.parts.WhileEditPart;
import crystal.diagram.providers.CrystalElementTypes;
import crystal.diagram.providers.CrystalModelingAssistantProvider;

/**
 * @generated
 */
public class CrystalModelingAssistantProviderOfIfEditPart extends
		CrystalModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((IfEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(IfEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CrystalElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((IfEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(IfEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ExceptionEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof IfEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CaseEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof InsertEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof UpdateEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof DeleteEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof SelectEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof WhileEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ForEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof LoopEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof OpenEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof FetchEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CloseEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedureEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunctionEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((IfEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(IfEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Exception_3005);
			types.add(CrystalElementTypes.If_3006);
			types.add(CrystalElementTypes.Case_3007);
			types.add(CrystalElementTypes.Insert_3008);
			types.add(CrystalElementTypes.Update_3009);
			types.add(CrystalElementTypes.Delete_3010);
			types.add(CrystalElementTypes.Select_3011);
			types.add(CrystalElementTypes.While_3012);
			types.add(CrystalElementTypes.For_3013);
			types.add(CrystalElementTypes.Loop_3014);
			types.add(CrystalElementTypes.Open_3015);
			types.add(CrystalElementTypes.Fetch_3016);
			types.add(CrystalElementTypes.Close_3017);
			types.add(CrystalElementTypes.CallProcedure_3031);
			types.add(CrystalElementTypes.CallFunction_3032);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((IfEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(IfEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CrystalElementTypes.Transition_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((IfEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(IfEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Exception_3005);
			types.add(CrystalElementTypes.If_3006);
			types.add(CrystalElementTypes.Case_3007);
			types.add(CrystalElementTypes.Insert_3008);
			types.add(CrystalElementTypes.Update_3009);
			types.add(CrystalElementTypes.Delete_3010);
			types.add(CrystalElementTypes.Select_3011);
			types.add(CrystalElementTypes.While_3012);
			types.add(CrystalElementTypes.For_3013);
			types.add(CrystalElementTypes.Loop_3014);
			types.add(CrystalElementTypes.Open_3015);
			types.add(CrystalElementTypes.Fetch_3016);
			types.add(CrystalElementTypes.Close_3017);
			types.add(CrystalElementTypes.CallProcedure_3031);
			types.add(CrystalElementTypes.CallFunction_3032);
		}
		return types;
	}

}
