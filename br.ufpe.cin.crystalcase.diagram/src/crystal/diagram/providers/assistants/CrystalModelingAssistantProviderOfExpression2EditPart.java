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
import crystal.diagram.edit.parts.CallFunction4EditPart;
import crystal.diagram.edit.parts.CallFunction5EditPart;
import crystal.diagram.edit.parts.CallFunction6EditPart;
import crystal.diagram.edit.parts.CallFunctionEditPart;
import crystal.diagram.edit.parts.CallProcedure2EditPart;
import crystal.diagram.edit.parts.CallProcedure3EditPart;
import crystal.diagram.edit.parts.CallProcedure4EditPart;
import crystal.diagram.edit.parts.CallProcedure5EditPart;
import crystal.diagram.edit.parts.CallProcedure6EditPart;
import crystal.diagram.edit.parts.CallProcedureEditPart;
import crystal.diagram.edit.parts.Case2EditPart;
import crystal.diagram.edit.parts.Case3EditPart;
import crystal.diagram.edit.parts.Case4EditPart;
import crystal.diagram.edit.parts.Case5EditPart;
import crystal.diagram.edit.parts.Case6EditPart;
import crystal.diagram.edit.parts.CaseEditPart;
import crystal.diagram.edit.parts.Close2EditPart;
import crystal.diagram.edit.parts.Close3EditPart;
import crystal.diagram.edit.parts.Close4EditPart;
import crystal.diagram.edit.parts.Close5EditPart;
import crystal.diagram.edit.parts.Close6EditPart;
import crystal.diagram.edit.parts.CloseEditPart;
import crystal.diagram.edit.parts.Delete2EditPart;
import crystal.diagram.edit.parts.Delete3EditPart;
import crystal.diagram.edit.parts.Delete4EditPart;
import crystal.diagram.edit.parts.Delete5EditPart;
import crystal.diagram.edit.parts.Delete6EditPart;
import crystal.diagram.edit.parts.DeleteEditPart;
import crystal.diagram.edit.parts.Exception2EditPart;
import crystal.diagram.edit.parts.Exception3EditPart;
import crystal.diagram.edit.parts.Exception4EditPart;
import crystal.diagram.edit.parts.Exception5EditPart;
import crystal.diagram.edit.parts.Exception6EditPart;
import crystal.diagram.edit.parts.ExceptionEditPart;
import crystal.diagram.edit.parts.Expression2EditPart;
import crystal.diagram.edit.parts.Expression3EditPart;
import crystal.diagram.edit.parts.Expression4EditPart;
import crystal.diagram.edit.parts.Expression5EditPart;
import crystal.diagram.edit.parts.Expression6EditPart;
import crystal.diagram.edit.parts.ExpressionEditPart;
import crystal.diagram.edit.parts.Fetch2EditPart;
import crystal.diagram.edit.parts.Fetch3EditPart;
import crystal.diagram.edit.parts.Fetch4EditPart;
import crystal.diagram.edit.parts.Fetch5EditPart;
import crystal.diagram.edit.parts.Fetch6EditPart;
import crystal.diagram.edit.parts.FetchEditPart;
import crystal.diagram.edit.parts.For2EditPart;
import crystal.diagram.edit.parts.For3EditPart;
import crystal.diagram.edit.parts.For4EditPart;
import crystal.diagram.edit.parts.For5EditPart;
import crystal.diagram.edit.parts.For6EditPart;
import crystal.diagram.edit.parts.ForEditPart;
import crystal.diagram.edit.parts.If2EditPart;
import crystal.diagram.edit.parts.If3EditPart;
import crystal.diagram.edit.parts.If4EditPart;
import crystal.diagram.edit.parts.If5EditPart;
import crystal.diagram.edit.parts.If6EditPart;
import crystal.diagram.edit.parts.IfEditPart;
import crystal.diagram.edit.parts.Insert2EditPart;
import crystal.diagram.edit.parts.Insert3EditPart;
import crystal.diagram.edit.parts.Insert4EditPart;
import crystal.diagram.edit.parts.Insert5EditPart;
import crystal.diagram.edit.parts.Insert6EditPart;
import crystal.diagram.edit.parts.InsertEditPart;
import crystal.diagram.edit.parts.Loop2EditPart;
import crystal.diagram.edit.parts.Loop3EditPart;
import crystal.diagram.edit.parts.Loop4EditPart;
import crystal.diagram.edit.parts.Loop5EditPart;
import crystal.diagram.edit.parts.Loop6EditPart;
import crystal.diagram.edit.parts.LoopEditPart;
import crystal.diagram.edit.parts.Open2EditPart;
import crystal.diagram.edit.parts.Open3EditPart;
import crystal.diagram.edit.parts.Open4EditPart;
import crystal.diagram.edit.parts.Open5EditPart;
import crystal.diagram.edit.parts.Open6EditPart;
import crystal.diagram.edit.parts.OpenEditPart;
import crystal.diagram.edit.parts.Select2EditPart;
import crystal.diagram.edit.parts.Select3EditPart;
import crystal.diagram.edit.parts.Select4EditPart;
import crystal.diagram.edit.parts.Select5EditPart;
import crystal.diagram.edit.parts.Select6EditPart;
import crystal.diagram.edit.parts.SelectEditPart;
import crystal.diagram.edit.parts.Update2EditPart;
import crystal.diagram.edit.parts.Update3EditPart;
import crystal.diagram.edit.parts.Update4EditPart;
import crystal.diagram.edit.parts.Update5EditPart;
import crystal.diagram.edit.parts.Update6EditPart;
import crystal.diagram.edit.parts.UpdateEditPart;
import crystal.diagram.edit.parts.While2EditPart;
import crystal.diagram.edit.parts.While3EditPart;
import crystal.diagram.edit.parts.While4EditPart;
import crystal.diagram.edit.parts.While5EditPart;
import crystal.diagram.edit.parts.While6EditPart;
import crystal.diagram.edit.parts.WhileEditPart;
import crystal.diagram.providers.CrystalElementTypes;
import crystal.diagram.providers.CrystalModelingAssistantProvider;

/**
 * @generated
 */
public class CrystalModelingAssistantProviderOfExpression2EditPart extends CrystalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Expression2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Expression2EditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((Expression2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Expression2EditPart source,
			IGraphicalEditPart targetEditPart) {
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
		if (targetEditPart instanceof For2EditPart) {
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
		if (targetEditPart instanceof For3EditPart) {
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
		if (targetEditPart instanceof Expression5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If5EditPart) {
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
		if (targetEditPart instanceof Expression6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Exception6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof If6EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Case4EditPart) {
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
		if (targetEditPart instanceof For4EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop4EditPart) {
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
		if (targetEditPart instanceof Case5EditPart) {
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
		if (targetEditPart instanceof For5EditPart) {
			types.add(CrystalElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Loop5EditPart) {
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
		if (targetEditPart instanceof Case6EditPart) {
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
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Expression2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Expression2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Expression_3236);
			types.add(CrystalElementTypes.Exception_3237);
			types.add(CrystalElementTypes.If_3238);
			types.add(CrystalElementTypes.Expression_3239);
			types.add(CrystalElementTypes.Exception_3240);
			types.add(CrystalElementTypes.If_3241);
			types.add(CrystalElementTypes.Case_3242);
			types.add(CrystalElementTypes.Expression_3243);
			types.add(CrystalElementTypes.Exception_3244);
			types.add(CrystalElementTypes.If_3245);
			types.add(CrystalElementTypes.Insert_3246);
			types.add(CrystalElementTypes.Update_3247);
			types.add(CrystalElementTypes.Delete_3248);
			types.add(CrystalElementTypes.Select_3249);
			types.add(CrystalElementTypes.While_3250);
			types.add(CrystalElementTypes.Expression_3251);
			types.add(CrystalElementTypes.Exception_3252);
			types.add(CrystalElementTypes.If_3253);
			types.add(CrystalElementTypes.For_3254);
			types.add(CrystalElementTypes.Case_3255);
			types.add(CrystalElementTypes.Case_3256);
			types.add(CrystalElementTypes.Insert_3257);
			types.add(CrystalElementTypes.Update_3258);
			types.add(CrystalElementTypes.Delete_3259);
			types.add(CrystalElementTypes.Select_3260);
			types.add(CrystalElementTypes.While_3261);
			types.add(CrystalElementTypes.Insert_3262);
			types.add(CrystalElementTypes.Update_3263);
			types.add(CrystalElementTypes.Delete_3264);
			types.add(CrystalElementTypes.Select_3265);
			types.add(CrystalElementTypes.While_3266);
			types.add(CrystalElementTypes.For_3267);
			types.add(CrystalElementTypes.Loop_3268);
			types.add(CrystalElementTypes.Open_3269);
			types.add(CrystalElementTypes.Fetch_3270);
			types.add(CrystalElementTypes.Close_3271);
			types.add(CrystalElementTypes.CallProcedure_3272);
			types.add(CrystalElementTypes.CallFunction_3273);
			types.add(CrystalElementTypes.For_3274);
			types.add(CrystalElementTypes.Loop_3275);
			types.add(CrystalElementTypes.Open_3276);
			types.add(CrystalElementTypes.Fetch_3277);
			types.add(CrystalElementTypes.Close_3278);
			types.add(CrystalElementTypes.CallProcedure_3279);
			types.add(CrystalElementTypes.CallFunction_3280);
			types.add(CrystalElementTypes.Expression_3282);
			types.add(CrystalElementTypes.Exception_3283);
			types.add(CrystalElementTypes.If_3284);
			types.add(CrystalElementTypes.Loop_3285);
			types.add(CrystalElementTypes.Open_3286);
			types.add(CrystalElementTypes.Fetch_3287);
			types.add(CrystalElementTypes.Close_3288);
			types.add(CrystalElementTypes.CallProcedure_3289);
			types.add(CrystalElementTypes.CallFunction_3290);
			types.add(CrystalElementTypes.Expression_3291);
			types.add(CrystalElementTypes.Exception_3292);
			types.add(CrystalElementTypes.If_3293);
			types.add(CrystalElementTypes.Case_3294);
			types.add(CrystalElementTypes.Insert_3295);
			types.add(CrystalElementTypes.Update_3296);
			types.add(CrystalElementTypes.Delete_3297);
			types.add(CrystalElementTypes.Select_3298);
			types.add(CrystalElementTypes.While_3299);
			types.add(CrystalElementTypes.For_3300);
			types.add(CrystalElementTypes.Loop_3301);
			types.add(CrystalElementTypes.Open_3302);
			types.add(CrystalElementTypes.Fetch_3303);
			types.add(CrystalElementTypes.Close_3304);
			types.add(CrystalElementTypes.CallProcedure_3305);
			types.add(CrystalElementTypes.CallFunction_3306);
			types.add(CrystalElementTypes.Case_3307);
			types.add(CrystalElementTypes.Insert_3308);
			types.add(CrystalElementTypes.Update_3309);
			types.add(CrystalElementTypes.Delete_3310);
			types.add(CrystalElementTypes.Select_3311);
			types.add(CrystalElementTypes.While_3312);
			types.add(CrystalElementTypes.For_3313);
			types.add(CrystalElementTypes.Loop_3314);
			types.add(CrystalElementTypes.Open_3315);
			types.add(CrystalElementTypes.Fetch_3316);
			types.add(CrystalElementTypes.Close_3317);
			types.add(CrystalElementTypes.CallProcedure_3318);
			types.add(CrystalElementTypes.CallFunction_3319);
			types.add(CrystalElementTypes.Case_3320);
			types.add(CrystalElementTypes.Insert_3321);
			types.add(CrystalElementTypes.Update_3322);
			types.add(CrystalElementTypes.Delete_3323);
			types.add(CrystalElementTypes.Select_3324);
			types.add(CrystalElementTypes.While_3325);
			types.add(CrystalElementTypes.For_3326);
			types.add(CrystalElementTypes.Loop_3327);
			types.add(CrystalElementTypes.Open_3328);
			types.add(CrystalElementTypes.Fetch_3329);
			types.add(CrystalElementTypes.Close_3330);
			types.add(CrystalElementTypes.CallProcedure_3331);
			types.add(CrystalElementTypes.CallFunction_3332);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Expression2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Expression2EditPart target) {
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
		return doGetTypesForSource((Expression2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Expression2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CrystalElementTypes.Transition_4001) {
			types.add(CrystalElementTypes.Expression_3236);
			types.add(CrystalElementTypes.Exception_3237);
			types.add(CrystalElementTypes.If_3238);
			types.add(CrystalElementTypes.Expression_3239);
			types.add(CrystalElementTypes.Exception_3240);
			types.add(CrystalElementTypes.If_3241);
			types.add(CrystalElementTypes.Case_3242);
			types.add(CrystalElementTypes.Expression_3243);
			types.add(CrystalElementTypes.Exception_3244);
			types.add(CrystalElementTypes.If_3245);
			types.add(CrystalElementTypes.Insert_3246);
			types.add(CrystalElementTypes.Update_3247);
			types.add(CrystalElementTypes.Delete_3248);
			types.add(CrystalElementTypes.Select_3249);
			types.add(CrystalElementTypes.While_3250);
			types.add(CrystalElementTypes.Expression_3251);
			types.add(CrystalElementTypes.Exception_3252);
			types.add(CrystalElementTypes.If_3253);
			types.add(CrystalElementTypes.For_3254);
			types.add(CrystalElementTypes.Case_3255);
			types.add(CrystalElementTypes.Case_3256);
			types.add(CrystalElementTypes.Insert_3257);
			types.add(CrystalElementTypes.Update_3258);
			types.add(CrystalElementTypes.Delete_3259);
			types.add(CrystalElementTypes.Select_3260);
			types.add(CrystalElementTypes.While_3261);
			types.add(CrystalElementTypes.Insert_3262);
			types.add(CrystalElementTypes.Update_3263);
			types.add(CrystalElementTypes.Delete_3264);
			types.add(CrystalElementTypes.Select_3265);
			types.add(CrystalElementTypes.While_3266);
			types.add(CrystalElementTypes.For_3267);
			types.add(CrystalElementTypes.Loop_3268);
			types.add(CrystalElementTypes.Open_3269);
			types.add(CrystalElementTypes.Fetch_3270);
			types.add(CrystalElementTypes.Close_3271);
			types.add(CrystalElementTypes.CallProcedure_3272);
			types.add(CrystalElementTypes.CallFunction_3273);
			types.add(CrystalElementTypes.For_3274);
			types.add(CrystalElementTypes.Loop_3275);
			types.add(CrystalElementTypes.Open_3276);
			types.add(CrystalElementTypes.Fetch_3277);
			types.add(CrystalElementTypes.Close_3278);
			types.add(CrystalElementTypes.CallProcedure_3279);
			types.add(CrystalElementTypes.CallFunction_3280);
			types.add(CrystalElementTypes.Expression_3282);
			types.add(CrystalElementTypes.Exception_3283);
			types.add(CrystalElementTypes.If_3284);
			types.add(CrystalElementTypes.Loop_3285);
			types.add(CrystalElementTypes.Open_3286);
			types.add(CrystalElementTypes.Fetch_3287);
			types.add(CrystalElementTypes.Close_3288);
			types.add(CrystalElementTypes.CallProcedure_3289);
			types.add(CrystalElementTypes.CallFunction_3290);
			types.add(CrystalElementTypes.Expression_3291);
			types.add(CrystalElementTypes.Exception_3292);
			types.add(CrystalElementTypes.If_3293);
			types.add(CrystalElementTypes.Case_3294);
			types.add(CrystalElementTypes.Insert_3295);
			types.add(CrystalElementTypes.Update_3296);
			types.add(CrystalElementTypes.Delete_3297);
			types.add(CrystalElementTypes.Select_3298);
			types.add(CrystalElementTypes.While_3299);
			types.add(CrystalElementTypes.For_3300);
			types.add(CrystalElementTypes.Loop_3301);
			types.add(CrystalElementTypes.Open_3302);
			types.add(CrystalElementTypes.Fetch_3303);
			types.add(CrystalElementTypes.Close_3304);
			types.add(CrystalElementTypes.CallProcedure_3305);
			types.add(CrystalElementTypes.CallFunction_3306);
			types.add(CrystalElementTypes.Case_3307);
			types.add(CrystalElementTypes.Insert_3308);
			types.add(CrystalElementTypes.Update_3309);
			types.add(CrystalElementTypes.Delete_3310);
			types.add(CrystalElementTypes.Select_3311);
			types.add(CrystalElementTypes.While_3312);
			types.add(CrystalElementTypes.For_3313);
			types.add(CrystalElementTypes.Loop_3314);
			types.add(CrystalElementTypes.Open_3315);
			types.add(CrystalElementTypes.Fetch_3316);
			types.add(CrystalElementTypes.Close_3317);
			types.add(CrystalElementTypes.CallProcedure_3318);
			types.add(CrystalElementTypes.CallFunction_3319);
			types.add(CrystalElementTypes.Case_3320);
			types.add(CrystalElementTypes.Insert_3321);
			types.add(CrystalElementTypes.Update_3322);
			types.add(CrystalElementTypes.Delete_3323);
			types.add(CrystalElementTypes.Select_3324);
			types.add(CrystalElementTypes.While_3325);
			types.add(CrystalElementTypes.For_3326);
			types.add(CrystalElementTypes.Loop_3327);
			types.add(CrystalElementTypes.Open_3328);
			types.add(CrystalElementTypes.Fetch_3329);
			types.add(CrystalElementTypes.Close_3330);
			types.add(CrystalElementTypes.CallProcedure_3331);
			types.add(CrystalElementTypes.CallFunction_3332);
		}
		return types;
	}

}
