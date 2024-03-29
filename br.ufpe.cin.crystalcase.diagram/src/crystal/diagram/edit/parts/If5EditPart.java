/*
 * 
 */
package crystal.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
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

import crystal.diagram.edit.policies.If5ItemSemanticEditPolicy;
import crystal.diagram.edit.policies.OpenDiagramEditPolicy;
import crystal.diagram.part.CrystalVisualIDRegistry;

/**
 * @generated
 */
public class If5EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3284;

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
	public If5EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new If5ItemSemanticEditPolicy());
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
		return primaryShape = new IfFigure();
	}

	/**
	* @generated
	*/
	public IfFigure getPrimaryShape() {
		return (IfFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IfDescription5EditPart) {
			((IfDescription5EditPart) childEditPart).setLabel(getPrimaryShape().getFigureIfLabelFigure());
			return true;
		}
		if (childEditPart instanceof IfIfTrue_statementsCompartment5EditPart) {
			IFigure pane = getPrimaryShape().getIfTrue_statementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((IfIfTrue_statementsCompartment5EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof IfIfFalse_statementsCompartment5EditPart) {
			IFigure pane = getPrimaryShape().getIfFalse_statementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((IfIfFalse_statementsCompartment5EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IfDescription5EditPart) {
			return true;
		}
		if (childEditPart instanceof IfIfTrue_statementsCompartment5EditPart) {
			IFigure pane = getPrimaryShape().getIfTrue_statementsCompartmentFigure();
			pane.remove(((IfIfTrue_statementsCompartment5EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof IfIfFalse_statementsCompartment5EditPart) {
			IFigure pane = getPrimaryShape().getIfFalse_statementsCompartmentFigure();
			pane.remove(((IfIfFalse_statementsCompartment5EditPart) childEditPart).getFigure());
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
		if (editPart instanceof IfIfTrue_statementsCompartment5EditPart) {
			return getPrimaryShape().getIfTrue_statementsCompartmentFigure();
		}
		if (editPart instanceof IfIfFalse_statementsCompartment5EditPart) {
			return getPrimaryShape().getIfFalse_statementsCompartmentFigure();
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
		return getChildBySemanticHint(CrystalVisualIDRegistry.getType(IfDescription5EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class IfFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureIfLabelFigure;
		/**
		* @generated
		*/
		private RectangleFigure fIfTrue_statementsCompartmentFigure;
		/**
		* @generated
		*/
		private RectangleFigure fIfFalse_statementsCompartmentFigure;

		/**
			 * @generated
			 */
		public IfFigure() {
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureIfLabelFigure = new WrappingLabel();

			fFigureIfLabelFigure.setText("If");
			fFigureIfLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureIfLabelFigure);

			fIfTrue_statementsCompartmentFigure = new RectangleFigure();

			fIfTrue_statementsCompartmentFigure.setOutline(false);

			this.add(fIfTrue_statementsCompartmentFigure);

			fIfFalse_statementsCompartmentFigure = new RectangleFigure();

			fIfFalse_statementsCompartmentFigure.setOutline(false);

			this.add(fIfFalse_statementsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureIfLabelFigure() {
			return fFigureIfLabelFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getIfTrue_statementsCompartmentFigure() {
			return fIfTrue_statementsCompartmentFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getIfFalse_statementsCompartmentFigure() {
			return fIfFalse_statementsCompartmentFigure;
		}

	}

}
