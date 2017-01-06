/**
 */
package crystal.util;

import crystal.AdditionalOperations;
import crystal.AnonymousBlock;
import crystal.CallBlocks;
import crystal.CallFunction;
import crystal.CallProcedure;
import crystal.Case;
import crystal.Close;
import crystal.Collections;
import crystal.ConditionalStructures;
import crystal.Crystal;
import crystal.CrystalCase;
import crystal.CrystalPackage;
import crystal.Cursor;
import crystal.CursorOperations;
import crystal.DataAbstractions;
import crystal.DataType;
import crystal.Delete;
import crystal.Expression;
import crystal.Fetch;
import crystal.For;
import crystal.Function;
import crystal.If;
import crystal.Insert;
import crystal.IterationStructures;
import crystal.Links;
import crystal.Loop;
import crystal.NamedBlocks;
import crystal.Open;
import crystal.Options;
import crystal.OptionsTransition;
import crystal.Parameters;
import crystal.Procedure;
import crystal.Records;
import crystal.SQLOperations;
import crystal.Select;
import crystal.Selector;
import crystal.SelectorTransition;
import crystal.Statements;
import crystal.Subprograms;
import crystal.Transition;
import crystal.Update;
import crystal.While;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see crystal.CrystalPackage
 * @generated
 */
public class CrystalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CrystalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrystalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CrystalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrystalSwitch<Adapter> modelSwitch =
		new CrystalSwitch<Adapter>() {
			@Override
			public Adapter caseCrystal(Crystal object) {
				return createCrystalAdapter();
			}
			@Override
			public Adapter caseSubprograms(Subprograms object) {
				return createSubprogramsAdapter();
			}
			@Override
			public Adapter caseNamedBlocks(NamedBlocks object) {
				return createNamedBlocksAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseAnonymousBlock(AnonymousBlock object) {
				return createAnonymousBlockAdapter();
			}
			@Override
			public Adapter caseDataAbstractions(DataAbstractions object) {
				return createDataAbstractionsAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseCollections(Collections object) {
				return createCollectionsAdapter();
			}
			@Override
			public Adapter caseRecords(Records object) {
				return createRecordsAdapter();
			}
			@Override
			public Adapter caseCursor(Cursor object) {
				return createCursorAdapter();
			}
			@Override
			public Adapter caseStatements(Statements object) {
				return createStatementsAdapter();
			}
			@Override
			public Adapter caseCallBlocks(CallBlocks object) {
				return createCallBlocksAdapter();
			}
			@Override
			public Adapter caseCursorOperations(CursorOperations object) {
				return createCursorOperationsAdapter();
			}
			@Override
			public Adapter caseSQLOperations(SQLOperations object) {
				return createSQLOperationsAdapter();
			}
			@Override
			public Adapter caseIterationStructures(IterationStructures object) {
				return createIterationStructuresAdapter();
			}
			@Override
			public Adapter caseConditionalStructures(ConditionalStructures object) {
				return createConditionalStructuresAdapter();
			}
			@Override
			public Adapter caseAdditionalOperations(AdditionalOperations object) {
				return createAdditionalOperationsAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseException(crystal.Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseOptions(Options object) {
				return createOptionsAdapter();
			}
			@Override
			public Adapter caseInsert(Insert object) {
				return createInsertAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseSelect(Select object) {
				return createSelectAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseFor(For object) {
				return createForAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseOpen(Open object) {
				return createOpenAdapter();
			}
			@Override
			public Adapter caseFetch(Fetch object) {
				return createFetchAdapter();
			}
			@Override
			public Adapter caseClose(Close object) {
				return createCloseAdapter();
			}
			@Override
			public Adapter caseCallProcedure(CallProcedure object) {
				return createCallProcedureAdapter();
			}
			@Override
			public Adapter caseCallFunction(CallFunction object) {
				return createCallFunctionAdapter();
			}
			@Override
			public Adapter caseLinks(Links object) {
				return createLinksAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseOptionsTransition(OptionsTransition object) {
				return createOptionsTransitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link crystal.Crystal <em>Crystal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Crystal
	 * @generated
	 */
	public Adapter createCrystalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Subprograms <em>Subprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Subprograms
	 * @generated
	 */
	public Adapter createSubprogramsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.NamedBlocks <em>Named Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.NamedBlocks
	 * @generated
	 */
	public Adapter createNamedBlocksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.AnonymousBlock <em>Anonymous Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.AnonymousBlock
	 * @generated
	 */
	public Adapter createAnonymousBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.DataAbstractions <em>Data Abstractions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.DataAbstractions
	 * @generated
	 */
	public Adapter createDataAbstractionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Collections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Collections
	 * @generated
	 */
	public Adapter createCollectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Records <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Records
	 * @generated
	 */
	public Adapter createRecordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Cursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Cursor
	 * @generated
	 */
	public Adapter createCursorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Statements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Statements
	 * @generated
	 */
	public Adapter createStatementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.CallBlocks <em>Call Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.CallBlocks
	 * @generated
	 */
	public Adapter createCallBlocksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.CursorOperations <em>Cursor Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.CursorOperations
	 * @generated
	 */
	public Adapter createCursorOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.SQLOperations <em>SQL Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.SQLOperations
	 * @generated
	 */
	public Adapter createSQLOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.IterationStructures <em>Iteration Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.IterationStructures
	 * @generated
	 */
	public Adapter createIterationStructuresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.ConditionalStructures <em>Conditional Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.ConditionalStructures
	 * @generated
	 */
	public Adapter createConditionalStructuresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.AdditionalOperations <em>Additional Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.AdditionalOperations
	 * @generated
	 */
	public Adapter createAdditionalOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Insert
	 * @generated
	 */
	public Adapter createInsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.For
	 * @generated
	 */
	public Adapter createForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Open
	 * @generated
	 */
	public Adapter createOpenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Fetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Fetch
	 * @generated
	 */
	public Adapter createFetchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Close <em>Close</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Close
	 * @generated
	 */
	public Adapter createCloseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.CallProcedure <em>Call Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.CallProcedure
	 * @generated
	 */
	public Adapter createCallProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.CallFunction <em>Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.CallFunction
	 * @generated
	 */
	public Adapter createCallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Links
	 * @generated
	 */
	public Adapter createLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.OptionsTransition <em>Options Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.OptionsTransition
	 * @generated
	 */
	public Adapter createOptionsTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crystal.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crystal.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CrystalAdapterFactory
