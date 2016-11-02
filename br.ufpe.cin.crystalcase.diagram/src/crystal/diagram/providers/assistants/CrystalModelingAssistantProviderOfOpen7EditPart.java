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

import crystal.diagram.edit.parts.*;
import crystal.diagram.providers.CrystalElementTypes;
import crystal.diagram.providers.CrystalModelingAssistantProvider;

/**
 * @generated
 */
public class CrystalModelingAssistantProviderOfOpen7EditPart extends CrystalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Open7EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Open7EditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((Open7EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Open7EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ExpressionEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ExceptionEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof IfEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Expression2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CaseEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Expression3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If3EditPart) {
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
		if (targetEditPart instanceof Expression4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ForEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Expression5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof LoopEditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Expression6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If6EditPart) {
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
		if (targetEditPart instanceof Expression7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case3EditPart) {
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
		if (targetEditPart instanceof Case4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop2EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case6EditPart) {
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
		if (targetEditPart instanceof Expression8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If8EditPart) {
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
		if (targetEditPart instanceof Insert4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop3EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While6EditPart) {
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
		if (targetEditPart instanceof For4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction7EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction8EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Expression9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction9EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Expression10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Insert10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Update10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Delete10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Select10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof While10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof For10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Open10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Fetch10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Close10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallProcedure10EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof CallFunction10EditPart) {
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
		return doGetTypesForTarget((Open7EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Open7EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Expression_3217);
			types.add(CrystalElementTypes.Exception_3056);
			types.add(CrystalElementTypes.If_3057);
			types.add(CrystalElementTypes.Expression_3211);
			types.add(CrystalElementTypes.Exception_3181);
			types.add(CrystalElementTypes.If_3182);
			types.add(CrystalElementTypes.Case_3183);
			types.add(CrystalElementTypes.Expression_3220);
			types.add(CrystalElementTypes.Exception_3221);
			types.add(CrystalElementTypes.If_3222);
			types.add(CrystalElementTypes.Insert_3184);
			types.add(CrystalElementTypes.Update_3185);
			types.add(CrystalElementTypes.Delete_3186);
			types.add(CrystalElementTypes.Select_3187);
			types.add(CrystalElementTypes.While_3188);
			types.add(CrystalElementTypes.Expression_3212);
			types.add(CrystalElementTypes.Exception_3090);
			types.add(CrystalElementTypes.If_3091);
			types.add(CrystalElementTypes.For_3189);
			types.add(CrystalElementTypes.Expression_3214);
			types.add(CrystalElementTypes.Exception_3151);
			types.add(CrystalElementTypes.If_3152);
			types.add(CrystalElementTypes.Loop_3190);
			types.add(CrystalElementTypes.Expression_3213);
			types.add(CrystalElementTypes.Exception_3153);
			types.add(CrystalElementTypes.If_3154);
			types.add(CrystalElementTypes.Open_3191);
			types.add(CrystalElementTypes.Fetch_3192);
			types.add(CrystalElementTypes.Close_3193);
			types.add(CrystalElementTypes.CallProcedure_3194);
			types.add(CrystalElementTypes.CallFunction_3195);
			types.add(CrystalElementTypes.Expression_3215);
			types.add(CrystalElementTypes.Exception_3196);
			types.add(CrystalElementTypes.If_3197);
			types.add(CrystalElementTypes.Case_3198);
			types.add(CrystalElementTypes.Case_3223);
			types.add(CrystalElementTypes.Insert_3224);
			types.add(CrystalElementTypes.Update_3225);
			types.add(CrystalElementTypes.Delete_3226);
			types.add(CrystalElementTypes.Select_3227);
			types.add(CrystalElementTypes.While_3228);
			types.add(CrystalElementTypes.Case_3092);
			types.add(CrystalElementTypes.For_3229);
			types.add(CrystalElementTypes.Case_3155);
			types.add(CrystalElementTypes.Loop_3230);
			types.add(CrystalElementTypes.Case_3161);
			types.add(CrystalElementTypes.Open_3231);
			types.add(CrystalElementTypes.Fetch_3232);
			types.add(CrystalElementTypes.Close_3233);
			types.add(CrystalElementTypes.CallProcedure_3234);
			types.add(CrystalElementTypes.CallFunction_3235);
			types.add(CrystalElementTypes.Expression_3216);
			types.add(CrystalElementTypes.Exception_3109);
			types.add(CrystalElementTypes.If_3110);
			types.add(CrystalElementTypes.Insert_3199);
			types.add(CrystalElementTypes.Update_3200);
			types.add(CrystalElementTypes.Delete_3201);
			types.add(CrystalElementTypes.Select_3202);
			types.add(CrystalElementTypes.While_3203);
			types.add(CrystalElementTypes.Insert_3093);
			types.add(CrystalElementTypes.Update_3094);
			types.add(CrystalElementTypes.Delete_3095);
			types.add(CrystalElementTypes.Select_3096);
			types.add(CrystalElementTypes.While_3097);
			types.add(CrystalElementTypes.For_3098);
			types.add(CrystalElementTypes.Insert_3156);
			types.add(CrystalElementTypes.Update_3157);
			types.add(CrystalElementTypes.Delete_3158);
			types.add(CrystalElementTypes.Select_3159);
			types.add(CrystalElementTypes.While_3160);
			types.add(CrystalElementTypes.Loop_3099);
			types.add(CrystalElementTypes.Insert_3162);
			types.add(CrystalElementTypes.Update_3163);
			types.add(CrystalElementTypes.Delete_3164);
			types.add(CrystalElementTypes.Select_3165);
			types.add(CrystalElementTypes.While_3166);
			types.add(CrystalElementTypes.Open_3100);
			types.add(CrystalElementTypes.Fetch_3101);
			types.add(CrystalElementTypes.Close_3102);
			types.add(CrystalElementTypes.CallProcedure_3103);
			types.add(CrystalElementTypes.CallFunction_3104);
			types.add(CrystalElementTypes.For_3167);
			types.add(CrystalElementTypes.For_3168);
			types.add(CrystalElementTypes.Loop_3169);
			types.add(CrystalElementTypes.Loop_3170);
			types.add(CrystalElementTypes.Open_3171);
			types.add(CrystalElementTypes.Fetch_3172);
			types.add(CrystalElementTypes.Close_3173);
			types.add(CrystalElementTypes.CallProcedure_3174);
			types.add(CrystalElementTypes.CallFunction_3175);
			types.add(CrystalElementTypes.Open_3176);
			types.add(CrystalElementTypes.Fetch_3177);
			types.add(CrystalElementTypes.Close_3178);
			types.add(CrystalElementTypes.CallProcedure_3179);
			types.add(CrystalElementTypes.CallFunction_3180);
			types.add(CrystalElementTypes.For_3204);
			types.add(CrystalElementTypes.Loop_3205);
			types.add(CrystalElementTypes.Open_3206);
			types.add(CrystalElementTypes.Fetch_3207);
			types.add(CrystalElementTypes.Close_3208);
			types.add(CrystalElementTypes.CallProcedure_3209);
			types.add(CrystalElementTypes.CallFunction_3210);
			types.add(CrystalElementTypes.Case_3138);
			types.add(CrystalElementTypes.Insert_3139);
			types.add(CrystalElementTypes.Update_3140);
			types.add(CrystalElementTypes.Delete_3141);
			types.add(CrystalElementTypes.Select_3142);
			types.add(CrystalElementTypes.While_3143);
			types.add(CrystalElementTypes.For_3144);
			types.add(CrystalElementTypes.Loop_3145);
			types.add(CrystalElementTypes.Open_3146);
			types.add(CrystalElementTypes.Fetch_3147);
			types.add(CrystalElementTypes.Close_3148);
			types.add(CrystalElementTypes.CallProcedure_3149);
			types.add(CrystalElementTypes.CallFunction_3150);
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
			types.add(CrystalElementTypes.Expression_3218);
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
			types.add(CrystalElementTypes.Expression_3219);
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
		return doGetRelTypesOnTarget((Open7EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Open7EditPart target) {
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
		return doGetTypesForSource((Open7EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Open7EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Expression_3217);
			types.add(CrystalElementTypes.Exception_3056);
			types.add(CrystalElementTypes.If_3057);
			types.add(CrystalElementTypes.Expression_3211);
			types.add(CrystalElementTypes.Exception_3181);
			types.add(CrystalElementTypes.If_3182);
			types.add(CrystalElementTypes.Case_3183);
			types.add(CrystalElementTypes.Expression_3220);
			types.add(CrystalElementTypes.Exception_3221);
			types.add(CrystalElementTypes.If_3222);
			types.add(CrystalElementTypes.Insert_3184);
			types.add(CrystalElementTypes.Update_3185);
			types.add(CrystalElementTypes.Delete_3186);
			types.add(CrystalElementTypes.Select_3187);
			types.add(CrystalElementTypes.While_3188);
			types.add(CrystalElementTypes.Expression_3212);
			types.add(CrystalElementTypes.Exception_3090);
			types.add(CrystalElementTypes.If_3091);
			types.add(CrystalElementTypes.For_3189);
			types.add(CrystalElementTypes.Expression_3214);
			types.add(CrystalElementTypes.Exception_3151);
			types.add(CrystalElementTypes.If_3152);
			types.add(CrystalElementTypes.Loop_3190);
			types.add(CrystalElementTypes.Expression_3213);
			types.add(CrystalElementTypes.Exception_3153);
			types.add(CrystalElementTypes.If_3154);
			types.add(CrystalElementTypes.Open_3191);
			types.add(CrystalElementTypes.Fetch_3192);
			types.add(CrystalElementTypes.Close_3193);
			types.add(CrystalElementTypes.CallProcedure_3194);
			types.add(CrystalElementTypes.CallFunction_3195);
			types.add(CrystalElementTypes.Expression_3215);
			types.add(CrystalElementTypes.Exception_3196);
			types.add(CrystalElementTypes.If_3197);
			types.add(CrystalElementTypes.Case_3198);
			types.add(CrystalElementTypes.Case_3223);
			types.add(CrystalElementTypes.Insert_3224);
			types.add(CrystalElementTypes.Update_3225);
			types.add(CrystalElementTypes.Delete_3226);
			types.add(CrystalElementTypes.Select_3227);
			types.add(CrystalElementTypes.While_3228);
			types.add(CrystalElementTypes.Case_3092);
			types.add(CrystalElementTypes.For_3229);
			types.add(CrystalElementTypes.Case_3155);
			types.add(CrystalElementTypes.Loop_3230);
			types.add(CrystalElementTypes.Case_3161);
			types.add(CrystalElementTypes.Open_3231);
			types.add(CrystalElementTypes.Fetch_3232);
			types.add(CrystalElementTypes.Close_3233);
			types.add(CrystalElementTypes.CallProcedure_3234);
			types.add(CrystalElementTypes.CallFunction_3235);
			types.add(CrystalElementTypes.Expression_3216);
			types.add(CrystalElementTypes.Exception_3109);
			types.add(CrystalElementTypes.If_3110);
			types.add(CrystalElementTypes.Insert_3199);
			types.add(CrystalElementTypes.Update_3200);
			types.add(CrystalElementTypes.Delete_3201);
			types.add(CrystalElementTypes.Select_3202);
			types.add(CrystalElementTypes.While_3203);
			types.add(CrystalElementTypes.Insert_3093);
			types.add(CrystalElementTypes.Update_3094);
			types.add(CrystalElementTypes.Delete_3095);
			types.add(CrystalElementTypes.Select_3096);
			types.add(CrystalElementTypes.While_3097);
			types.add(CrystalElementTypes.For_3098);
			types.add(CrystalElementTypes.Insert_3156);
			types.add(CrystalElementTypes.Update_3157);
			types.add(CrystalElementTypes.Delete_3158);
			types.add(CrystalElementTypes.Select_3159);
			types.add(CrystalElementTypes.While_3160);
			types.add(CrystalElementTypes.Loop_3099);
			types.add(CrystalElementTypes.Insert_3162);
			types.add(CrystalElementTypes.Update_3163);
			types.add(CrystalElementTypes.Delete_3164);
			types.add(CrystalElementTypes.Select_3165);
			types.add(CrystalElementTypes.While_3166);
			types.add(CrystalElementTypes.Open_3100);
			types.add(CrystalElementTypes.Fetch_3101);
			types.add(CrystalElementTypes.Close_3102);
			types.add(CrystalElementTypes.CallProcedure_3103);
			types.add(CrystalElementTypes.CallFunction_3104);
			types.add(CrystalElementTypes.For_3167);
			types.add(CrystalElementTypes.For_3168);
			types.add(CrystalElementTypes.Loop_3169);
			types.add(CrystalElementTypes.Loop_3170);
			types.add(CrystalElementTypes.Open_3171);
			types.add(CrystalElementTypes.Fetch_3172);
			types.add(CrystalElementTypes.Close_3173);
			types.add(CrystalElementTypes.CallProcedure_3174);
			types.add(CrystalElementTypes.CallFunction_3175);
			types.add(CrystalElementTypes.Open_3176);
			types.add(CrystalElementTypes.Fetch_3177);
			types.add(CrystalElementTypes.Close_3178);
			types.add(CrystalElementTypes.CallProcedure_3179);
			types.add(CrystalElementTypes.CallFunction_3180);
			types.add(CrystalElementTypes.For_3204);
			types.add(CrystalElementTypes.Loop_3205);
			types.add(CrystalElementTypes.Open_3206);
			types.add(CrystalElementTypes.Fetch_3207);
			types.add(CrystalElementTypes.Close_3208);
			types.add(CrystalElementTypes.CallProcedure_3209);
			types.add(CrystalElementTypes.CallFunction_3210);
			types.add(CrystalElementTypes.Case_3138);
			types.add(CrystalElementTypes.Insert_3139);
			types.add(CrystalElementTypes.Update_3140);
			types.add(CrystalElementTypes.Delete_3141);
			types.add(CrystalElementTypes.Select_3142);
			types.add(CrystalElementTypes.While_3143);
			types.add(CrystalElementTypes.For_3144);
			types.add(CrystalElementTypes.Loop_3145);
			types.add(CrystalElementTypes.Open_3146);
			types.add(CrystalElementTypes.Fetch_3147);
			types.add(CrystalElementTypes.Close_3148);
			types.add(CrystalElementTypes.CallProcedure_3149);
			types.add(CrystalElementTypes.CallFunction_3150);
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
			types.add(CrystalElementTypes.Expression_3218);
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
			types.add(CrystalElementTypes.Expression_3219);
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
