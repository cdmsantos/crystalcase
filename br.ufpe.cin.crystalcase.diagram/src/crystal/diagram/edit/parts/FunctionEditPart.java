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

import crystal.diagram.edit.policies.FunctionItemSemanticEditPolicy;
import crystal.diagram.edit.policies.OpenDiagramEditPolicy;
import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class FunctionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

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
	public FunctionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new FunctionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
		return primaryShape = new FunctionFigure();
	}

	/**
	 * @generated
	 */
	public FunctionFigure getPrimaryShape() {
		return (FunctionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FunctionNameEditPart) {
			((FunctionNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureFunctionLabelFigure());
			return true;
		}
		if (childEditPart instanceof FunctionFunctionParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionParametersCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((FunctionFunctionParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FunctionFunctionReturnPartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionReturnPartCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((FunctionFunctionReturnPartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FunctionFunctionDeclarativePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionDeclarativePartCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((FunctionFunctionDeclarativePartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FunctionFunctionExecutablePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionExecutablePartCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((FunctionFunctionExecutablePartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FunctionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof FunctionFunctionParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionParametersCompartmentFigure();
			pane.remove(((FunctionFunctionParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FunctionFunctionReturnPartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionReturnPartCompartmentFigure();
			pane.remove(((FunctionFunctionReturnPartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FunctionFunctionDeclarativePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionDeclarativePartCompartmentFigure();
			pane.remove(((FunctionFunctionDeclarativePartCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FunctionFunctionExecutablePartCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFunctionExecutablePartCompartmentFigure();
			pane.remove(((FunctionFunctionExecutablePartCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof FunctionFunctionParametersCompartmentEditPart) {
			return getPrimaryShape().getFunctionParametersCompartmentFigure();
		}
		if (editPart instanceof FunctionFunctionReturnPartCompartmentEditPart) {
			return getPrimaryShape().getFunctionReturnPartCompartmentFigure();
		}
		if (editPart instanceof FunctionFunctionDeclarativePartCompartmentEditPart) {
			return getPrimaryShape().getFunctionDeclarativePartCompartmentFigure();
		}
		if (editPart instanceof FunctionFunctionExecutablePartCompartmentEditPart) {
			return getPrimaryShape().getFunctionExecutablePartCompartmentFigure();
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
		return getChildBySemanticHint(CrystalVisualIDRegistry.getType(FunctionNameEditPart.VISUAL_ID));
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
	public class FunctionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFunctionLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFunctionParametersCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFunctionReturnPartCompartmentFigure;

		/**
		* @generated
		*/
		private RectangleFigure fFunctionDeclarativePartCompartmentFigure;
		/**
		* @generated
		*/
		private RectangleFigure fFunctionExecutablePartCompartmentFigure;

		/**
			 * @generated
			 */
		public FunctionFigure() {
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

			fFigureFunctionLabelFigure = new WrappingLabel();

			fFigureFunctionLabelFigure.setText("Function");
			fFigureFunctionLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureFunctionLabelFigure);

			fFunctionParametersCompartmentFigure = new RectangleFigure();

			fFunctionParametersCompartmentFigure.setOutline(false);

			this.add(fFunctionParametersCompartmentFigure);

			fFunctionReturnPartCompartmentFigure = new RectangleFigure();

			fFunctionReturnPartCompartmentFigure.setOutline(false);

			this.add(fFunctionReturnPartCompartmentFigure);

			fFunctionDeclarativePartCompartmentFigure = new RectangleFigure();

			fFunctionDeclarativePartCompartmentFigure.setOutline(false);

			this.add(fFunctionDeclarativePartCompartmentFigure);

			fFunctionExecutablePartCompartmentFigure = new RectangleFigure();

			fFunctionExecutablePartCompartmentFigure.setOutline(false);

			this.add(fFunctionExecutablePartCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFunctionLabelFigure() {
			return fFigureFunctionLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFunctionParametersCompartmentFigure() {
			return fFunctionParametersCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFunctionReturnPartCompartmentFigure() {
			return fFunctionReturnPartCompartmentFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getFunctionDeclarativePartCompartmentFigure() {
			return fFunctionDeclarativePartCompartmentFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getFunctionExecutablePartCompartmentFigure() {
			return fFunctionExecutablePartCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 25, 191, 108);

}
