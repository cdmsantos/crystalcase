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
import crystal.Statements;
import crystal.Transition;
import crystal.diagram.edit.policies.CrystalBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransitionReorientCommand extends EditElementCommand {

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
	public TransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Transition) {
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
		if (!(oldEnd instanceof Statements && newEnd instanceof Statements)) {
			return false;
		}
		Statements target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Crystal)) {
			return false;
		}
		Crystal container = (Crystal) getLink().eContainer();
		return CrystalBaseItemSemanticEditPolicy.getLinkConstraints().canExistTransition_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Statements && newEnd instanceof Statements)) {
			return false;
		}
		Statements source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Crystal)) {
			return false;
		}
		Crystal container = (Crystal) getLink().eContainer();
		return CrystalBaseItemSemanticEditPolicy.getLinkConstraints().canExistTransition_4001(container, getLink(),
				source, getNewTarget());
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
	protected Transition getLink() {
		return (Transition) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Statements getOldSource() {
		return (Statements) oldEnd;
	}

	/**
	* @generated
	*/
	protected Statements getNewSource() {
		return (Statements) newEnd;
	}

	/**
	* @generated
	*/
	protected Statements getOldTarget() {
		return (Statements) oldEnd;
	}

	/**
	* @generated
	*/
	protected Statements getNewTarget() {
		return (Statements) newEnd;
	}
}
