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
import crystal.NewEClass39;
import crystal.NewEClass40;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see crystal.CrystalPackage
 * @generated
 */
public class CrystalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CrystalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrystalSwitch() {
		if (modelPackage == null) {
			modelPackage = CrystalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CrystalPackage.CRYSTAL: {
				Crystal crystal = (Crystal)theEObject;
				T result = caseCrystal(crystal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.SUBPROGRAMS: {
				Subprograms subprograms = (Subprograms)theEObject;
				T result = caseSubprograms(subprograms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.NAMED_BLOCKS: {
				NamedBlocks namedBlocks = (NamedBlocks)theEObject;
				T result = caseNamedBlocks(namedBlocks);
				if (result == null) result = caseSubprograms(namedBlocks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseNamedBlocks(procedure);
				if (result == null) result = caseSubprograms(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseNamedBlocks(function);
				if (result == null) result = caseSubprograms(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.ANONYMOUS_BLOCK: {
				AnonymousBlock anonymousBlock = (AnonymousBlock)theEObject;
				T result = caseAnonymousBlock(anonymousBlock);
				if (result == null) result = caseSubprograms(anonymousBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.DATA_ABSTRACTIONS: {
				DataAbstractions dataAbstractions = (DataAbstractions)theEObject;
				T result = caseDataAbstractions(dataAbstractions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseDataAbstractions(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.COLLECTIONS: {
				Collections collections = (Collections)theEObject;
				T result = caseCollections(collections);
				if (result == null) result = caseDataAbstractions(collections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.RECORDS: {
				Records records = (Records)theEObject;
				T result = caseRecords(records);
				if (result == null) result = caseDataAbstractions(records);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CURSOR: {
				Cursor cursor = (Cursor)theEObject;
				T result = caseCursor(cursor);
				if (result == null) result = caseDataAbstractions(cursor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.STATEMENTS: {
				Statements statements = (Statements)theEObject;
				T result = caseStatements(statements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CALL_BLOCKS: {
				CallBlocks callBlocks = (CallBlocks)theEObject;
				T result = caseCallBlocks(callBlocks);
				if (result == null) result = caseStatements(callBlocks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CURSOR_OPERATIONS: {
				CursorOperations cursorOperations = (CursorOperations)theEObject;
				T result = caseCursorOperations(cursorOperations);
				if (result == null) result = caseStatements(cursorOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.SQL_OPERATIONS: {
				SQLOperations sqlOperations = (SQLOperations)theEObject;
				T result = caseSQLOperations(sqlOperations);
				if (result == null) result = caseStatements(sqlOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.ITERATION_STRUCTURES: {
				IterationStructures iterationStructures = (IterationStructures)theEObject;
				T result = caseIterationStructures(iterationStructures);
				if (result == null) result = caseStatements(iterationStructures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CONDITIONAL_STRUCTURES: {
				ConditionalStructures conditionalStructures = (ConditionalStructures)theEObject;
				T result = caseConditionalStructures(conditionalStructures);
				if (result == null) result = caseStatements(conditionalStructures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.ADDITIONAL_OPERATIONS: {
				AdditionalOperations additionalOperations = (AdditionalOperations)theEObject;
				T result = caseAdditionalOperations(additionalOperations);
				if (result == null) result = caseStatements(additionalOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseAdditionalOperations(expression);
				if (result == null) result = caseStatements(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.EXCEPTION: {
				crystal.Exception exception = (crystal.Exception)theEObject;
				T result = caseException(exception);
				if (result == null) result = caseAdditionalOperations(exception);
				if (result == null) result = caseStatements(exception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseConditionalStructures(if_);
				if (result == null) result = caseStatements(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = caseConditionalStructures(case_);
				if (result == null) result = caseStatements(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.OPTIONS: {
				Options options = (Options)theEObject;
				T result = caseOptions(options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.INSERT: {
				Insert insert = (Insert)theEObject;
				T result = caseInsert(insert);
				if (result == null) result = caseSQLOperations(insert);
				if (result == null) result = caseStatements(insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = caseSQLOperations(update);
				if (result == null) result = caseStatements(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseSQLOperations(delete);
				if (result == null) result = caseStatements(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseSQLOperations(select);
				if (result == null) result = caseStatements(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseIterationStructures(while_);
				if (result == null) result = caseStatements(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.FOR: {
				For for_ = (For)theEObject;
				T result = caseFor(for_);
				if (result == null) result = caseIterationStructures(for_);
				if (result == null) result = caseStatements(for_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseIterationStructures(loop);
				if (result == null) result = caseStatements(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.OPEN: {
				Open open = (Open)theEObject;
				T result = caseOpen(open);
				if (result == null) result = caseCursorOperations(open);
				if (result == null) result = caseStatements(open);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.FETCH: {
				Fetch fetch = (Fetch)theEObject;
				T result = caseFetch(fetch);
				if (result == null) result = caseCursorOperations(fetch);
				if (result == null) result = caseStatements(fetch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CLOSE: {
				Close close = (Close)theEObject;
				T result = caseClose(close);
				if (result == null) result = caseCursorOperations(close);
				if (result == null) result = caseStatements(close);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CALL_PROCEDURE: {
				CallProcedure callProcedure = (CallProcedure)theEObject;
				T result = caseCallProcedure(callProcedure);
				if (result == null) result = caseCallBlocks(callProcedure);
				if (result == null) result = caseStatements(callProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.CALL_FUNCTION: {
				CallFunction callFunction = (CallFunction)theEObject;
				T result = caseCallFunction(callFunction);
				if (result == null) result = caseCallBlocks(callFunction);
				if (result == null) result = caseStatements(callFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.LINKS: {
				Links links = (Links)theEObject;
				T result = caseLinks(links);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseLinks(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.OPTIONS_TRANSITION: {
				OptionsTransition optionsTransition = (OptionsTransition)theEObject;
				T result = caseOptionsTransition(optionsTransition);
				if (result == null) result = caseLinks(optionsTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.NEW_ECLASS39: {
				NewEClass39 newEClass39 = (NewEClass39)theEObject;
				T result = caseNewEClass39(newEClass39);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrystalPackage.NEW_ECLASS40: {
				NewEClass40 newEClass40 = (NewEClass40)theEObject;
				T result = caseNewEClass40(newEClass40);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crystal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crystal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrystal(Crystal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprograms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprograms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprograms(Subprograms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Blocks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Blocks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedBlocks(NamedBlocks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousBlock(AnonymousBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Abstractions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Abstractions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAbstractions(DataAbstractions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollections(Collections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Records</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Records</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecords(Records object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cursor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cursor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCursor(Cursor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatements(Statements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Blocks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Blocks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBlocks(CallBlocks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cursor Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cursor Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCursorOperations(CursorOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLOperations(SQLOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Structures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Structures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationStructures(IterationStructures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Structures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Structures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalStructures(ConditionalStructures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalOperations(AdditionalOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(crystal.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptions(Options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsert(Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFor(For object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpen(Open object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fetch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fetch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFetch(Fetch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClose(Close object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallProcedure(CallProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallFunction(CallFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinks(Links object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionsTransition(OptionsTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass39</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass39</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass39(NewEClass39 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass40</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass40</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass40(NewEClass40 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CrystalSwitch
