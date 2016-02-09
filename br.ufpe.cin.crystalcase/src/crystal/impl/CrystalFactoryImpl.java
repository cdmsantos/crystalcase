/**
 */
package crystal.impl;

import crystal.AnonymousBlock;
import crystal.CallFunction;
import crystal.CallProcedure;
import crystal.Case;
import crystal.Close;
import crystal.Collections;
import crystal.Crystal;
import crystal.CrystalFactory;
import crystal.CrystalPackage;
import crystal.Cursor;
import crystal.DataType;
import crystal.DataTypeOptions;
import crystal.Delete;
import crystal.Fetch;
import crystal.For;
import crystal.ForCounter;
import crystal.Function;
import crystal.If;
import crystal.Insert;
import crystal.Loop;
import crystal.Open;
import crystal.ParameterType;
import crystal.Procedure;
import crystal.Records;
import crystal.Select;
import crystal.Transition;
import crystal.Update;
import crystal.While;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrystalFactoryImpl extends EFactoryImpl implements CrystalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CrystalFactory init() {
		try {
			CrystalFactory theCrystalFactory = (CrystalFactory)EPackage.Registry.INSTANCE.getEFactory(CrystalPackage.eNS_URI);
			if (theCrystalFactory != null) {
				return theCrystalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CrystalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrystalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CrystalPackage.CRYSTAL: return createCrystal();
			case CrystalPackage.PROCEDURE: return createProcedure();
			case CrystalPackage.FUNCTION: return createFunction();
			case CrystalPackage.ANONYMOUS_BLOCK: return createAnonymousBlock();
			case CrystalPackage.DATA_TYPE: return createDataType();
			case CrystalPackage.COLLECTIONS: return createCollections();
			case CrystalPackage.RECORDS: return createRecords();
			case CrystalPackage.CURSOR: return createCursor();
			case CrystalPackage.EXCEPTION: return createException();
			case CrystalPackage.IF: return createIf();
			case CrystalPackage.CASE: return createCase();
			case CrystalPackage.INSERT: return createInsert();
			case CrystalPackage.UPDATE: return createUpdate();
			case CrystalPackage.DELETE: return createDelete();
			case CrystalPackage.SELECT: return createSelect();
			case CrystalPackage.WHILE: return createWhile();
			case CrystalPackage.FOR: return createFor();
			case CrystalPackage.LOOP: return createLoop();
			case CrystalPackage.OPEN: return createOpen();
			case CrystalPackage.FETCH: return createFetch();
			case CrystalPackage.CLOSE: return createClose();
			case CrystalPackage.CALL_PROCEDURE: return createCallProcedure();
			case CrystalPackage.CALL_FUNCTION: return createCallFunction();
			case CrystalPackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CrystalPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case CrystalPackage.FOR_COUNTER:
				return createForCounterFromString(eDataType, initialValue);
			case CrystalPackage.DATA_TYPE_OPTIONS:
				return createDataTypeOptionsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CrystalPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case CrystalPackage.FOR_COUNTER:
				return convertForCounterToString(eDataType, instanceValue);
			case CrystalPackage.DATA_TYPE_OPTIONS:
				return convertDataTypeOptionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crystal createCrystal() {
		CrystalImpl crystal = new CrystalImpl();
		return crystal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousBlock createAnonymousBlock() {
		AnonymousBlockImpl anonymousBlock = new AnonymousBlockImpl();
		return anonymousBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collections createCollections() {
		CollectionsImpl collections = new CollectionsImpl();
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Records createRecords() {
		RecordsImpl records = new RecordsImpl();
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cursor createCursor() {
		CursorImpl cursor = new CursorImpl();
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crystal.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public For createFor() {
		ForImpl for_ = new ForImpl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open createOpen() {
		OpenImpl open = new OpenImpl();
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetch() {
		FetchImpl fetch = new FetchImpl();
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Close createClose() {
		CloseImpl close = new CloseImpl();
		return close;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallProcedure createCallProcedure() {
		CallProcedureImpl callProcedure = new CallProcedureImpl();
		return callProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallFunction createCallFunction() {
		CallFunctionImpl callFunction = new CallFunctionImpl();
		return callFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForCounter createForCounterFromString(EDataType eDataType, String initialValue) {
		ForCounter result = ForCounter.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertForCounterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeOptions createDataTypeOptionsFromString(EDataType eDataType, String initialValue) {
		DataTypeOptions result = DataTypeOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrystalPackage getCrystalPackage() {
		return (CrystalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CrystalPackage getPackage() {
		return CrystalPackage.eINSTANCE;
	}

} //CrystalFactoryImpl
