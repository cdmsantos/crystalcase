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

import crystal.diagram.edit.parts.CallFunction2EditPart;
import crystal.diagram.edit.parts.CallFunction3EditPart;
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedure2EditPart;
import crystal.diagram.edit.parts.CallProcedure3EditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.Case2EditPart;
import crystal.diagram.edit.parts.Case3EditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.Close2EditPart;
import crystal.diagram.edit.parts.Close3EditPart;
import crystal.diagram.edit.parts.CloseEditPart;
import crystal.diagram.edit.parts.Delete2EditPart;
import crystal.diagram.edit.parts.Delete3EditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.Exception2EditPart;
import crystal.diagram.edit.parts.Exception3EditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.Fetch2EditPart;
import crystal.diagram.edit.parts.Fetch3EditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.For2EditPart;
import crystal.diagram.edit.parts.For3EditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.If2EditPart;
import crystal.diagram.edit.parts.If3EditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.Insert2EditPart;
import crystal.diagram.edit.parts.Insert3EditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.Loop2EditPart;
import crystal.diagram.edit.parts.Loop3EditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.Open2EditPart;
import crystal.diagram.edit.parts.Open3EditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.Select2EditPart;
import crystal.diagram.edit.parts.Select3EditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.Update2EditPart;
import crystal.diagram.edit.parts.Update3EditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
import crystal.diagram.edit.parts.While2EditPart;
import crystal.diagram.edit.parts.While3EditPart;
import crystal.diagram.edit.parts.WhileEditPart;
import crystal.diagram.providers.CrystalElementTypes;
import crystal.diagram.providers.CrystalModelingAssistantProvider;

/**
 * @generated
 */
public class CrystalModelingAssistantProviderOfCase3EditPart extends CrystalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Case3EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Case3EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CrystalElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((Case3EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Case3EditPart source, IGraphicalEditPart targetEditPart) {
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
		if (targetEditPart instanceof Exception2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Case3EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Case3EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Exception_3056);
			types.add(CrystalElementTypes.If_3057);
			types.add(CrystalElementTypes.Case_3058);
			types.add(CrystalElementTypes.Insert_3059);
			types.add(CrystalElementTypes.Update_3060);
			types.add(CrystalElementTypes.Delete_3061);
			types.add(CrystalElementTypes.Select_3062);
			types.add(CrystalElementTypes.While_3063);
			types.add(CrystalElementTypes.For_3064);
			types.add(CrystalElementTypes.Loop_3065);
			types.add(CrystalElementTypes.Open_3066);
			types.add(CrystalElementTypes.Fetch_3067);
			types.add(CrystalElementTypes.Close_3068);
			types.add(CrystalElementTypes.CallProcedure_3069);
			types.add(CrystalElementTypes.CallFunction_3070);
			types.add(CrystalElementTypes.Exception_3075);
			types.add(CrystalElementTypes.If_3076);
			types.add(CrystalElementTypes.Case_3077);
			types.add(CrystalElementTypes.Insert_3078);
			types.add(CrystalElementTypes.Update_3079);
			types.add(CrystalElementTypes.Delete_3080);
			types.add(CrystalElementTypes.Select_3081);
			types.add(CrystalElementTypes.While_3082);
			types.add(CrystalElementTypes.For_3083);
			types.add(CrystalElementTypes.Loop_3084);
			types.add(CrystalElementTypes.Open_3085);
			types.add(CrystalElementTypes.Fetch_3086);
			types.add(CrystalElementTypes.Close_3087);
			types.add(CrystalElementTypes.CallProcedure_3088);
			types.add(CrystalElementTypes.CallFunction_3089);
			types.add(CrystalElementTypes.Exception_3037);
			types.add(CrystalElementTypes.If_3038);
			types.add(CrystalElementTypes.Case_3039);
			types.add(CrystalElementTypes.Insert_3040);
			types.add(CrystalElementTypes.Update_3041);
			types.add(CrystalElementTypes.Delete_3042);
			types.add(CrystalElementTypes.Select_3043);
			types.add(CrystalElementTypes.While_3044);
			types.add(CrystalElementTypes.For_3045);
			types.add(CrystalElementTypes.Loop_3046);
			types.add(CrystalElementTypes.Open_3047);
			types.add(CrystalElementTypes.Fetch_3048);
			types.add(CrystalElementTypes.Close_3049);
			types.add(CrystalElementTypes.CallProcedure_3050);
			types.add(CrystalElementTypes.CallFunction_3051);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Case3EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Case3EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CrystalElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Case3EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Case3EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Exception_3056);
			types.add(CrystalElementTypes.If_3057);
			types.add(CrystalElementTypes.Case_3058);
			types.add(CrystalElementTypes.Insert_3059);
			types.add(CrystalElementTypes.Update_3060);
			types.add(CrystalElementTypes.Delete_3061);
			types.add(CrystalElementTypes.Select_3062);
			types.add(CrystalElementTypes.While_3063);
			types.add(CrystalElementTypes.For_3064);
			types.add(CrystalElementTypes.Loop_3065);
			types.add(CrystalElementTypes.Open_3066);
			types.add(CrystalElementTypes.Fetch_3067);
			types.add(CrystalElementTypes.Close_3068);
			types.add(CrystalElementTypes.CallProcedure_3069);
			types.add(CrystalElementTypes.CallFunction_3070);
			types.add(CrystalElementTypes.Exception_3075);
			types.add(CrystalElementTypes.If_3076);
			types.add(CrystalElementTypes.Case_3077);
			types.add(CrystalElementTypes.Insert_3078);
			types.add(CrystalElementTypes.Update_3079);
			types.add(CrystalElementTypes.Delete_3080);
			types.add(CrystalElementTypes.Select_3081);
			types.add(CrystalElementTypes.While_3082);
			types.add(CrystalElementTypes.For_3083);
			types.add(CrystalElementTypes.Loop_3084);
			types.add(CrystalElementTypes.Open_3085);
			types.add(CrystalElementTypes.Fetch_3086);
			types.add(CrystalElementTypes.Close_3087);
			types.add(CrystalElementTypes.CallProcedure_3088);
			types.add(CrystalElementTypes.CallFunction_3089);
			types.add(CrystalElementTypes.Exception_3037);
			types.add(CrystalElementTypes.If_3038);
			types.add(CrystalElementTypes.Case_3039);
			types.add(CrystalElementTypes.Insert_3040);
			types.add(CrystalElementTypes.Update_3041);
			types.add(CrystalElementTypes.Delete_3042);
			types.add(CrystalElementTypes.Select_3043);
			types.add(CrystalElementTypes.While_3044);
			types.add(CrystalElementTypes.For_3045);
			types.add(CrystalElementTypes.Loop_3046);
			types.add(CrystalElementTypes.Open_3047);
			types.add(CrystalElementTypes.Fetch_3048);
			types.add(CrystalElementTypes.Close_3049);
			types.add(CrystalElementTypes.CallProcedure_3050);
			types.add(CrystalElementTypes.CallFunction_3051);
		}
		return types;
	}

}
