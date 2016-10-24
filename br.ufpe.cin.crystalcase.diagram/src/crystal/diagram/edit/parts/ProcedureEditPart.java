/*
 * 
 */
package crystal.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import crystal.diagram.edit.policies.OpenDiagramEditPolicy;
import crystal.diagram.edit.policies.ProcedureItemSemanticEditPolicy;
import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class ProcedureEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ProcedureEditPart(View view) {
		super(view);
	}

	/**
	 * @generated not
	 * Crystal Santos
	 * 17/09/2016
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ProcedureItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ProcedureFigure();
	}

	/**
	 * @generated
	 */
	public ProcedureFigure getPrimaryShape() {
		return (ProcedureFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProcedureNameEditPart) {
			((ProcedureNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureProcedureLabelFigure());
			return true;
		}
		if (childEditPart instanceof ProcedureProcedureParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProcedureParametersCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ProcedureProcedureParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ProcedureProcedureDeclarativePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProcedureDeclarativePartCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ProcedureProcedureDeclarativePartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ProcedureProcedureExecutablePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProcedureExecutablePartCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ProcedureProcedureExecutablePartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProcedureNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ProcedureProcedureParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProcedureParametersCompartmentFigure();
			pane.remove(((ProcedureProcedureParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ProcedureProcedureDeclarativePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProcedureDeclarativePartCompartmentFigure();
			pane.remove(((ProcedureProcedureDeclarativePartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ProcedureProcedureExecutablePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProcedureExecutablePartCompartmentFigure();
			pane.remove(((ProcedureProcedureExecutablePartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ProcedureProcedureParametersCompartmentEditPart) {
			return getPrimaryShape().getProcedureParametersCompartmentFigure();
		}
		if (editPart instanceof ProcedureProcedureDeclarativePartCompartmentEditPart) {
			return getPrimaryShape().getProcedureDeclarativePartCompartmentFigure();
		}
		if (editPart instanceof ProcedureProcedureExecutablePartCompartmentEditPart) {
			return getPrimaryShape().getProcedureExecutablePartCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CrystalVisualIDRegistry.getType(ProcedureNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ProcedureFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcedureLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fProcedureParametersCompartmentFigure;

		/**
		* @generated
		*/
		private RectangleFigure fProcedureDeclarativePartCompartmentFigure;
		/**
		* @generated
		*/
		private RectangleFigure fProcedureExecutablePartCompartmentFigure;

		/**
			 * @generated
			 */
		public ProcedureFigure() {
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProcedureLabelFigure = new WrappingLabel();

			fFigureProcedureLabelFigure.setText("Procedure");
			fFigureProcedureLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureProcedureLabelFigure);

			fProcedureParametersCompartmentFigure = new RectangleFigure();

			fProcedureParametersCompartmentFigure.setOutline(false);

			this.add(fProcedureParametersCompartmentFigure);

			fProcedureDeclarativePartCompartmentFigure = new RectangleFigure();

			fProcedureDeclarativePartCompartmentFigure.setOutline(false);

			this.add(fProcedureDeclarativePartCompartmentFigure);

			fProcedureExecutablePartCompartmentFigure = new RectangleFigure();

			fProcedureExecutablePartCompartmentFigure.setOutline(false);

			this.add(fProcedureExecutablePartCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcedureLabelFigure() {
			return fFigureProcedureLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getProcedureParametersCompartmentFigure() {
			return fProcedureParametersCompartmentFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getProcedureDeclarativePartCompartmentFigure() {
			return fProcedureDeclarativePartCompartmentFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getProcedureExecutablePartCompartmentFigure() {
			return fProcedureExecutablePartCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 255, 13, 13);

}
