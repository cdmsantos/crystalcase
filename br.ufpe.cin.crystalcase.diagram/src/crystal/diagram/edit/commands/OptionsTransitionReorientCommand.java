/*
 * 
 */
package crystal.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import crystal.Crystal;
import crystal.Options;
import crystal.OptionsTransition;
import crystal.diagram.edit.policies.CrystalBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OptionsTransitionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public OptionsTransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof OptionsTransition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Options && newEnd instanceof Options)) {
			return false;
		}
		Options target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Crystal)) {
			return false;
		}
		Crystal container = (Crystal) getLink().eContainer();
		return CrystalBaseItemSemanticEditPolicy.getLinkConstraints().canExistOptionsTransition_4003(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Options && newEnd instanceof Options)) {
			return false;
		}
		Options source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Crystal)) {
			return false;
		}
		Crystal container = (Crystal) getLink().eContainer();
		return CrystalBaseItemSemanticEditPolicy.getLinkConstraints().canExistOptionsTransition_4003(container,
				getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected OptionsTransition getLink() {
		return (OptionsTransition) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Options getOldSource() {
		return (Options) oldEnd;
	}

	/**
	* @generated
	*/
	protected Options getNewSource() {
		return (Options) newEnd;
	}

	/**
	* @generated
	*/
	protected Options getOldTarget() {
		return (Options) oldEnd;
	}

	/**
	* @generated
	*/
	protected Options getNewTarget() {
		return (Options) newEnd;
	}
}
