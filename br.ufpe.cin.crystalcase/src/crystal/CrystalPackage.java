/**
 */
package crystal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see crystal.CrystalFactory
 * @model kind="package"
 * @generated
 */
public interface CrystalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crystal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "crystal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crystal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CrystalPackage eINSTANCE = crystal.impl.CrystalPackageImpl.init();

	/**
	 * The meta object id for the '{@link crystal.impl.CrystalImpl <em>Crystal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CrystalImpl
	 * @see crystal.impl.CrystalPackageImpl#getCrystal()
	 * @generated
	 */
	int CRYSTAL = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL__TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Selector Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL__SELECTOR_TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL__PROCEDURES = 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL__FUNCTIONS = 3;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL__BLOCKS = 4;

	/**
	 * The number of structural features of the '<em>Crystal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link crystal.impl.SubprogramsImpl <em>Subprograms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.SubprogramsImpl
	 * @see crystal.impl.CrystalPackageImpl#getSubprograms()
	 * @generated
	 */
	int SUBPROGRAMS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAMS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Subprograms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAMS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link crystal.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ProcedureImpl
	 * @see crystal.impl.CrystalPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = SUBPROGRAMS__NAME;

	/**
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DECLARATIVE_PART = SUBPROGRAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARAMETERS = SUBPROGRAMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__EXECUTABLE_PART = SUBPROGRAMS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = SUBPROGRAMS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link crystal.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.FunctionImpl
	 * @see crystal.impl.CrystalPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = SUBPROGRAMS__NAME;

	/**
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DECLARATIVE_PART = SUBPROGRAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = SUBPROGRAMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_PART = SUBPROGRAMS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXECUTABLE_PART = SUBPROGRAMS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = SUBPROGRAMS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link crystal.impl.AnonymousBlockImpl <em>Anonymous Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.AnonymousBlockImpl
	 * @see crystal.impl.CrystalPackageImpl#getAnonymousBlock()
	 * @generated
	 */
	int ANONYMOUS_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK__NAME = SUBPROGRAMS__NAME;

	/**
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK__DECLARATIVE_PART = SUBPROGRAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK__EXECUTABLE_PART = SUBPROGRAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anonymous Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK_FEATURE_COUNT = SUBPROGRAMS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link crystal.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ParametersImpl
	 * @see crystal.impl.CrystalPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crystal.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.DataTypeImpl
	 * @see crystal.impl.CrystalPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = PARAMETERS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE = PARAMETERS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CLASS_NAME = PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OPTIONS = PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PRECISION = PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SCALE = PARAMETERS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link crystal.impl.CollectionsImpl <em>Collections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CollectionsImpl
	 * @see crystal.impl.CrystalPackageImpl#getCollections()
	 * @generated
	 */
	int COLLECTIONS = 7;


	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__NAME = PARAMETERS__NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int COLLECTIONS__NAME = PARAMETERS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__TYPE = PARAMETERS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__CLASS_NAME = PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__CODE = PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__TYPE_NAME = PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link crystal.impl.RecordsImpl <em>Records</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.RecordsImpl
	 * @see crystal.impl.CrystalPackageImpl#getRecords()
	 * @generated
	 */
	int RECORDS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__NAME = PARAMETERS__NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RECORDS__NAME = PARAMETERS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__TYPE = PARAMETERS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__CLASS_NAME = PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__CODE = PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__TYPE_NAME = PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Records</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link crystal.impl.CursorImpl <em>Cursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CursorImpl
	 * @see crystal.impl.CrystalPackageImpl#getCursor()
	 * @generated
	 */
	int CURSOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__NAME = PARAMETERS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__TYPE = PARAMETERS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__CLASS_NAME = PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cursor Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__CURSOR_QUERY = PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link crystal.impl.StatementsImpl <em>Statements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.StatementsImpl
	 * @see crystal.impl.CrystalPackageImpl#getStatements()
	 * @generated
	 */
	int STATEMENTS = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS__IS_START = 1;

	/**
	 * The number of structural features of the '<em>Statements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crystal.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ExceptionImpl
	 * @see crystal.impl.CrystalPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 12;

	/**
	 * The meta object id for the '{@link crystal.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.IfImpl
	 * @see crystal.impl.CrystalPackageImpl#getIf()
	 * @generated
	 */
	int IF = 13;

	/**
	 * The meta object id for the '{@link crystal.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CaseImpl
	 * @see crystal.impl.CrystalPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 14;

	/**
	 * The meta object id for the '{@link crystal.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.InsertImpl
	 * @see crystal.impl.CrystalPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 16;

	/**
	 * The meta object id for the '{@link crystal.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.UpdateImpl
	 * @see crystal.impl.CrystalPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 17;

	/**
	 * The meta object id for the '{@link crystal.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.DeleteImpl
	 * @see crystal.impl.CrystalPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 18;

	/**
	 * The meta object id for the '{@link crystal.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.SelectImpl
	 * @see crystal.impl.CrystalPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 19;

	/**
	 * The meta object id for the '{@link crystal.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.SelectorImpl
	 * @see crystal.impl.CrystalPackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 15;

	/**
	 * The meta object id for the '{@link crystal.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.WhileImpl
	 * @see crystal.impl.CrystalPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 20;

	/**
	 * The meta object id for the '{@link crystal.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ForImpl
	 * @see crystal.impl.CrystalPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 21;

	/**
	 * The meta object id for the '{@link crystal.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.LoopImpl
	 * @see crystal.impl.CrystalPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 22;

	/**
	 * The meta object id for the '{@link crystal.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.OpenImpl
	 * @see crystal.impl.CrystalPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 23;

	/**
	 * The meta object id for the '{@link crystal.impl.FetchImpl <em>Fetch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.FetchImpl
	 * @see crystal.impl.CrystalPackageImpl#getFetch()
	 * @generated
	 */
	int FETCH = 24;

	/**
	 * The meta object id for the '{@link crystal.impl.CloseImpl <em>Close</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CloseImpl
	 * @see crystal.impl.CrystalPackageImpl#getClose()
	 * @generated
	 */
	int CLOSE = 25;

	/**
	 * The meta object id for the '{@link crystal.impl.CallProcedureImpl <em>Call Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CallProcedureImpl
	 * @see crystal.impl.CrystalPackageImpl#getCallProcedure()
	 * @generated
	 */
	int CALL_PROCEDURE = 26;

	/**
	 * The meta object id for the '{@link crystal.impl.CallFunctionImpl <em>Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CallFunctionImpl
	 * @see crystal.impl.CrystalPackageImpl#getCallFunction()
	 * @generated
	 */
	int CALL_FUNCTION = 27;

	/**
	 * The meta object id for the '{@link crystal.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.TransitionImpl
	 * @see crystal.impl.CrystalPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 28;

	/**
	 * The meta object id for the '{@link crystal.impl.SelectorTransitionImpl <em>Selector Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.SelectorTransitionImpl
	 * @see crystal.impl.CrystalPackageImpl#getSelectorTransition()
	 * @generated
	 */
	int SELECTOR_TRANSITION = 29;

	/**
	 * The meta object id for the '{@link crystal.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ExpressionImpl
	 * @see crystal.impl.CrystalPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__CODE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IFS = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSES = STATEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CASES = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ELSE_STATEMENTS = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Case Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__CASE_STATEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__CODE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CODE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CODE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CODE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>While Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__WHILE_STATEMENTS = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__COUNTER = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__TYPE_COUNTER = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lowest Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__LOWEST_NUMBER = STATEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Highest Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__HIGHEST_NUMBER = STATEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>For Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__FOR_STATEMENTS = STATEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Break Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BREAK_CONDITION = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loop Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_STATEMENTS = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__CURSOR_NAME = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__CURSOR_NAME = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__VARIABLE_NAME = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fetch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__CURSOR_NAME = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Close</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__NAME_SUBROUTINE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__CLASS_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__NAME_SUBROUTINE = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TRANSITION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Selector Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link crystal.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.ParameterType
	 * @see crystal.impl.CrystalPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 30;

	/**
	 * The meta object id for the '{@link crystal.ForCounter <em>For Counter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.ForCounter
	 * @see crystal.impl.CrystalPackageImpl#getForCounter()
	 * @generated
	 */
	int FOR_COUNTER = 31;

	/**
	 * The meta object id for the '{@link crystal.DataTypeOptions <em>Data Type Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.DataTypeOptions
	 * @see crystal.impl.CrystalPackageImpl#getDataTypeOptions()
	 * @generated
	 */
	int DATA_TYPE_OPTIONS = 32;


	/**
	 * Returns the meta object for class '{@link crystal.Crystal <em>Crystal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crystal</em>'.
	 * @see crystal.Crystal
	 * @generated
	 */
	EClass getCrystal();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Crystal#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see crystal.Crystal#getTransitions()
	 * @see #getCrystal()
	 * @generated
	 */
	EReference getCrystal_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Crystal#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedures</em>'.
	 * @see crystal.Crystal#getProcedures()
	 * @see #getCrystal()
	 * @generated
	 */
	EReference getCrystal_Procedures();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Crystal#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see crystal.Crystal#getFunctions()
	 * @see #getCrystal()
	 * @generated
	 */
	EReference getCrystal_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Crystal#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see crystal.Crystal#getBlocks()
	 * @see #getCrystal()
	 * @generated
	 */
	EReference getCrystal_Blocks();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Crystal#getSelectorTransitions <em>Selector Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selector Transitions</em>'.
	 * @see crystal.Crystal#getSelectorTransitions()
	 * @see #getCrystal()
	 * @generated
	 */
	EReference getCrystal_SelectorTransitions();

	/**
	 * Returns the meta object for class '{@link crystal.Subprograms <em>Subprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprograms</em>'.
	 * @see crystal.Subprograms
	 * @generated
	 */
	EClass getSubprograms();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Subprograms#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crystal.Subprograms#getName()
	 * @see #getSubprograms()
	 * @generated
	 */
	EAttribute getSubprograms_Name();

	/**
	 * Returns the meta object for class '{@link crystal.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see crystal.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Procedure#getDeclarativePart <em>Declarative Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarative Part</em>'.
	 * @see crystal.Procedure#getDeclarativePart()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_DeclarativePart();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Procedure#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see crystal.Procedure#getParameters()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Procedure#getExecutablePart <em>Executable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executable Part</em>'.
	 * @see crystal.Procedure#getExecutablePart()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ExecutablePart();

	/**
	 * Returns the meta object for class '{@link crystal.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see crystal.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Function#getDeclarativePart <em>Declarative Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarative Part</em>'.
	 * @see crystal.Function#getDeclarativePart()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_DeclarativePart();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see crystal.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link crystal.Function#getReturnPart <em>Return Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Part</em>'.
	 * @see crystal.Function#getReturnPart()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ReturnPart();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Function#getExecutablePart <em>Executable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executable Part</em>'.
	 * @see crystal.Function#getExecutablePart()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ExecutablePart();

	/**
	 * Returns the meta object for class '{@link crystal.AnonymousBlock <em>Anonymous Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Block</em>'.
	 * @see crystal.AnonymousBlock
	 * @generated
	 */
	EClass getAnonymousBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.AnonymousBlock#getDeclarativePart <em>Declarative Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarative Part</em>'.
	 * @see crystal.AnonymousBlock#getDeclarativePart()
	 * @see #getAnonymousBlock()
	 * @generated
	 */
	EReference getAnonymousBlock_DeclarativePart();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.AnonymousBlock#getExecutablePart <em>Executable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executable Part</em>'.
	 * @see crystal.AnonymousBlock#getExecutablePart()
	 * @see #getAnonymousBlock()
	 * @generated
	 */
	EReference getAnonymousBlock_ExecutablePart();

	/**
	 * Returns the meta object for class '{@link crystal.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see crystal.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Parameters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crystal.Parameters#getName()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Name();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Parameters#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see crystal.Parameters#getType()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Type();

	/**
	 * Returns the meta object for class '{@link crystal.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see crystal.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link crystal.DataType#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.DataType#getClassName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.DataType#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see crystal.DataType#getOptions()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Options();

	/**
	 * Returns the meta object for the attribute '{@link crystal.DataType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see crystal.DataType#getPrecision()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Precision();

	/**
	 * Returns the meta object for the attribute '{@link crystal.DataType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see crystal.DataType#getScale()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Scale();

	/**
	 * Returns the meta object for class '{@link crystal.Collections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collections</em>'.
	 * @see crystal.Collections
	 * @generated
	 */
	EClass getCollections();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Collections#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Collections#getClassName()
	 * @see #getCollections()
	 * @generated
	 */
	EAttribute getCollections_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Collections#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.Collections#getCode()
	 * @see #getCollections()
	 * @generated
	 */
	EAttribute getCollections_Code();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Collections#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see crystal.Collections#getTypeName()
	 * @see #getCollections()
	 * @generated
	 */
	EAttribute getCollections_TypeName();

	/**
	 * Returns the meta object for class '{@link crystal.Records <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Records</em>'.
	 * @see crystal.Records
	 * @generated
	 */
	EClass getRecords();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Records#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Records#getClassName()
	 * @see #getRecords()
	 * @generated
	 */
	EAttribute getRecords_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Records#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.Records#getCode()
	 * @see #getRecords()
	 * @generated
	 */
	EAttribute getRecords_Code();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Records#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see crystal.Records#getTypeName()
	 * @see #getRecords()
	 * @generated
	 */
	EAttribute getRecords_TypeName();

	/**
	 * Returns the meta object for class '{@link crystal.Cursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cursor</em>'.
	 * @see crystal.Cursor
	 * @generated
	 */
	EClass getCursor();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Cursor#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Cursor#getClassName()
	 * @see #getCursor()
	 * @generated
	 */
	EAttribute getCursor_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Cursor#getCursorQuery <em>Cursor Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Query</em>'.
	 * @see crystal.Cursor#getCursorQuery()
	 * @see #getCursor()
	 * @generated
	 */
	EAttribute getCursor_CursorQuery();

	/**
	 * Returns the meta object for class '{@link crystal.Statements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statements</em>'.
	 * @see crystal.Statements
	 * @generated
	 */
	EClass getStatements();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Statements#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crystal.Statements#getDescription()
	 * @see #getStatements()
	 * @generated
	 */
	EAttribute getStatements_Description();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Statements#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see crystal.Statements#isIsStart()
	 * @see #getStatements()
	 * @generated
	 */
	EAttribute getStatements_IsStart();

	/**
	 * Returns the meta object for class '{@link crystal.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see crystal.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Exception#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Exception#getClassName()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Exception#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.Exception#getCode()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Code();

	/**
	 * Returns the meta object for class '{@link crystal.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see crystal.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the attribute '{@link crystal.If#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.If#getClassName()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see crystal.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.If#getIfs <em>Ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ifs</em>'.
	 * @see crystal.If#getIfs()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Ifs();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.If#getElses <em>Elses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elses</em>'.
	 * @see crystal.If#getElses()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elses();

	/**
	 * Returns the meta object for class '{@link crystal.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see crystal.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Case#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Case#getClassName()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Case#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see crystal.Case#getCases()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Cases();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Case#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see crystal.Case#getElseStatements()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_ElseStatements();

	/**
	 * Returns the meta object for class '{@link crystal.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see crystal.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Insert#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Insert#getClassName()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Insert#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.Insert#getCode()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_Code();

	/**
	 * Returns the meta object for class '{@link crystal.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see crystal.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Update#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Update#getClassName()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Update#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.Update#getCode()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_Code();

	/**
	 * Returns the meta object for class '{@link crystal.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see crystal.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Delete#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Delete#getClassName()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Delete#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.Delete#getCode()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_Code();

	/**
	 * Returns the meta object for class '{@link crystal.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see crystal.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Select#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Select#getClassName()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Select#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.Select#getCode()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Code();

	/**
	 * Returns the meta object for class '{@link crystal.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see crystal.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Selector#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Selector#getClassName()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Selector#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see crystal.Selector#getCondition()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Selector#getCaseStatements <em>Case Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Statements</em>'.
	 * @see crystal.Selector#getCaseStatements()
	 * @see #getSelector()
	 * @generated
	 */
	EReference getSelector_CaseStatements();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Selector#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crystal.Selector#getDescription()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Description();

	/**
	 * Returns the meta object for class '{@link crystal.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see crystal.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the attribute '{@link crystal.While#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.While#getClassName()
	 * @see #getWhile()
	 * @generated
	 */
	EAttribute getWhile_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see crystal.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EAttribute getWhile_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.While#getWhileStatements <em>While Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>While Statements</em>'.
	 * @see crystal.While#getWhileStatements()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_WhileStatements();

	/**
	 * Returns the meta object for class '{@link crystal.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see crystal.For
	 * @generated
	 */
	EClass getFor();

	/**
	 * Returns the meta object for the attribute '{@link crystal.For#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.For#getClassName()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.For#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see crystal.For#getCounter()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_Counter();

	/**
	 * Returns the meta object for the attribute '{@link crystal.For#getTypeCounter <em>Type Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Counter</em>'.
	 * @see crystal.For#getTypeCounter()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_TypeCounter();

	/**
	 * Returns the meta object for the attribute '{@link crystal.For#getLowestNumber <em>Lowest Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lowest Number</em>'.
	 * @see crystal.For#getLowestNumber()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_LowestNumber();

	/**
	 * Returns the meta object for the attribute '{@link crystal.For#getHighestNumber <em>Highest Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highest Number</em>'.
	 * @see crystal.For#getHighestNumber()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_HighestNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.For#getForStatements <em>For Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>For Statements</em>'.
	 * @see crystal.For#getForStatements()
	 * @see #getFor()
	 * @generated
	 */
	EReference getFor_ForStatements();

	/**
	 * Returns the meta object for class '{@link crystal.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see crystal.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Loop#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Loop#getClassName()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Loop#getBreakCondition <em>Break Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Condition</em>'.
	 * @see crystal.Loop#getBreakCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_BreakCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Loop#getLoopStatements <em>Loop Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Statements</em>'.
	 * @see crystal.Loop#getLoopStatements()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopStatements();

	/**
	 * Returns the meta object for class '{@link crystal.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open</em>'.
	 * @see crystal.Open
	 * @generated
	 */
	EClass getOpen();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Open#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Open#getClassName()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Open#getCursorName <em>Cursor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Name</em>'.
	 * @see crystal.Open#getCursorName()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_CursorName();

	/**
	 * Returns the meta object for class '{@link crystal.Fetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fetch</em>'.
	 * @see crystal.Fetch
	 * @generated
	 */
	EClass getFetch();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Fetch#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Fetch#getClassName()
	 * @see #getFetch()
	 * @generated
	 */
	EAttribute getFetch_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Fetch#getCursorName <em>Cursor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Name</em>'.
	 * @see crystal.Fetch#getCursorName()
	 * @see #getFetch()
	 * @generated
	 */
	EAttribute getFetch_CursorName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Fetch#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see crystal.Fetch#getVariableName()
	 * @see #getFetch()
	 * @generated
	 */
	EAttribute getFetch_VariableName();

	/**
	 * Returns the meta object for class '{@link crystal.Close <em>Close</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close</em>'.
	 * @see crystal.Close
	 * @generated
	 */
	EClass getClose();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Close#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Close#getClassName()
	 * @see #getClose()
	 * @generated
	 */
	EAttribute getClose_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Close#getCursorName <em>Cursor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Name</em>'.
	 * @see crystal.Close#getCursorName()
	 * @see #getClose()
	 * @generated
	 */
	EAttribute getClose_CursorName();

	/**
	 * Returns the meta object for class '{@link crystal.CallProcedure <em>Call Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Procedure</em>'.
	 * @see crystal.CallProcedure
	 * @generated
	 */
	EClass getCallProcedure();

	/**
	 * Returns the meta object for the attribute '{@link crystal.CallProcedure#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.CallProcedure#getClassName()
	 * @see #getCallProcedure()
	 * @generated
	 */
	EAttribute getCallProcedure_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.CallProcedure#getNameSubroutine <em>Name Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Subroutine</em>'.
	 * @see crystal.CallProcedure#getNameSubroutine()
	 * @see #getCallProcedure()
	 * @generated
	 */
	EAttribute getCallProcedure_NameSubroutine();

	/**
	 * Returns the meta object for class '{@link crystal.CallFunction <em>Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Function</em>'.
	 * @see crystal.CallFunction
	 * @generated
	 */
	EClass getCallFunction();

	/**
	 * Returns the meta object for the attribute '{@link crystal.CallFunction#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.CallFunction#getClassName()
	 * @see #getCallFunction()
	 * @generated
	 */
	EAttribute getCallFunction_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.CallFunction#getNameSubroutine <em>Name Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Subroutine</em>'.
	 * @see crystal.CallFunction#getNameSubroutine()
	 * @see #getCallFunction()
	 * @generated
	 */
	EAttribute getCallFunction_NameSubroutine();

	/**
	 * Returns the meta object for class '{@link crystal.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see crystal.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crystal.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link crystal.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see crystal.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link crystal.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see crystal.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link crystal.SelectorTransition <em>Selector Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Transition</em>'.
	 * @see crystal.SelectorTransition
	 * @generated
	 */
	EClass getSelectorTransition();

	/**
	 * Returns the meta object for the attribute '{@link crystal.SelectorTransition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crystal.SelectorTransition#getName()
	 * @see #getSelectorTransition()
	 * @generated
	 */
	EAttribute getSelectorTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link crystal.SelectorTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see crystal.SelectorTransition#getSource()
	 * @see #getSelectorTransition()
	 * @generated
	 */
	EReference getSelectorTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link crystal.SelectorTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see crystal.SelectorTransition#getTarget()
	 * @see #getSelectorTransition()
	 * @generated
	 */
	EReference getSelectorTransition_Target();

	/**
	 * Returns the meta object for class '{@link crystal.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see crystal.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Expression#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Expression#getClassName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crystal.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for enum '{@link crystal.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see crystal.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link crystal.ForCounter <em>For Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>For Counter</em>'.
	 * @see crystal.ForCounter
	 * @generated
	 */
	EEnum getForCounter();

	/**
	 * Returns the meta object for enum '{@link crystal.DataTypeOptions <em>Data Type Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Options</em>'.
	 * @see crystal.DataTypeOptions
	 * @generated
	 */
	EEnum getDataTypeOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CrystalFactory getCrystalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link crystal.impl.CrystalImpl <em>Crystal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CrystalImpl
		 * @see crystal.impl.CrystalPackageImpl#getCrystal()
		 * @generated
		 */
		EClass CRYSTAL = eINSTANCE.getCrystal();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYSTAL__TRANSITIONS = eINSTANCE.getCrystal_Transitions();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYSTAL__PROCEDURES = eINSTANCE.getCrystal_Procedures();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYSTAL__FUNCTIONS = eINSTANCE.getCrystal_Functions();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYSTAL__BLOCKS = eINSTANCE.getCrystal_Blocks();

		/**
		 * The meta object literal for the '<em><b>Selector Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYSTAL__SELECTOR_TRANSITIONS = eINSTANCE.getCrystal_SelectorTransitions();

		/**
		 * The meta object literal for the '{@link crystal.impl.SubprogramsImpl <em>Subprograms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.SubprogramsImpl
		 * @see crystal.impl.CrystalPackageImpl#getSubprograms()
		 * @generated
		 */
		EClass SUBPROGRAMS = eINSTANCE.getSubprograms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPROGRAMS__NAME = eINSTANCE.getSubprograms_Name();

		/**
		 * The meta object literal for the '{@link crystal.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.ProcedureImpl
		 * @see crystal.impl.CrystalPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Declarative Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__DECLARATIVE_PART = eINSTANCE.getProcedure_DeclarativePart();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__PARAMETERS = eINSTANCE.getProcedure_Parameters();

		/**
		 * The meta object literal for the '<em><b>Executable Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__EXECUTABLE_PART = eINSTANCE.getProcedure_ExecutablePart();

		/**
		 * The meta object literal for the '{@link crystal.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.FunctionImpl
		 * @see crystal.impl.CrystalPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Declarative Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DECLARATIVE_PART = eINSTANCE.getFunction_DeclarativePart();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_PART = eINSTANCE.getFunction_ReturnPart();

		/**
		 * The meta object literal for the '<em><b>Executable Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__EXECUTABLE_PART = eINSTANCE.getFunction_ExecutablePart();

		/**
		 * The meta object literal for the '{@link crystal.impl.AnonymousBlockImpl <em>Anonymous Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.AnonymousBlockImpl
		 * @see crystal.impl.CrystalPackageImpl#getAnonymousBlock()
		 * @generated
		 */
		EClass ANONYMOUS_BLOCK = eINSTANCE.getAnonymousBlock();

		/**
		 * The meta object literal for the '<em><b>Declarative Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_BLOCK__DECLARATIVE_PART = eINSTANCE.getAnonymousBlock_DeclarativePart();

		/**
		 * The meta object literal for the '<em><b>Executable Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_BLOCK__EXECUTABLE_PART = eINSTANCE.getAnonymousBlock_ExecutablePart();

		/**
		 * The meta object literal for the '{@link crystal.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.ParametersImpl
		 * @see crystal.impl.CrystalPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__NAME = eINSTANCE.getParameters_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__TYPE = eINSTANCE.getParameters_Type();

		/**
		 * The meta object literal for the '{@link crystal.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.DataTypeImpl
		 * @see crystal.impl.CrystalPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__CLASS_NAME = eINSTANCE.getDataType_ClassName();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__OPTIONS = eINSTANCE.getDataType_Options();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__PRECISION = eINSTANCE.getDataType_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SCALE = eINSTANCE.getDataType_Scale();

		/**
		 * The meta object literal for the '{@link crystal.impl.CollectionsImpl <em>Collections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CollectionsImpl
		 * @see crystal.impl.CrystalPackageImpl#getCollections()
		 * @generated
		 */
		EClass COLLECTIONS = eINSTANCE.getCollections();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIONS__CLASS_NAME = eINSTANCE.getCollections_ClassName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIONS__CODE = eINSTANCE.getCollections_Code();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIONS__TYPE_NAME = eINSTANCE.getCollections_TypeName();

		/**
		 * The meta object literal for the '{@link crystal.impl.RecordsImpl <em>Records</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.RecordsImpl
		 * @see crystal.impl.CrystalPackageImpl#getRecords()
		 * @generated
		 */
		EClass RECORDS = eINSTANCE.getRecords();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDS__CLASS_NAME = eINSTANCE.getRecords_ClassName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDS__CODE = eINSTANCE.getRecords_Code();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDS__TYPE_NAME = eINSTANCE.getRecords_TypeName();

		/**
		 * The meta object literal for the '{@link crystal.impl.CursorImpl <em>Cursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CursorImpl
		 * @see crystal.impl.CrystalPackageImpl#getCursor()
		 * @generated
		 */
		EClass CURSOR = eINSTANCE.getCursor();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSOR__CLASS_NAME = eINSTANCE.getCursor_ClassName();

		/**
		 * The meta object literal for the '<em><b>Cursor Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSOR__CURSOR_QUERY = eINSTANCE.getCursor_CursorQuery();

		/**
		 * The meta object literal for the '{@link crystal.impl.StatementsImpl <em>Statements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.StatementsImpl
		 * @see crystal.impl.CrystalPackageImpl#getStatements()
		 * @generated
		 */
		EClass STATEMENTS = eINSTANCE.getStatements();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENTS__DESCRIPTION = eINSTANCE.getStatements_Description();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENTS__IS_START = eINSTANCE.getStatements_IsStart();

		/**
		 * The meta object literal for the '{@link crystal.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.ExceptionImpl
		 * @see crystal.impl.CrystalPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__CLASS_NAME = eINSTANCE.getException_ClassName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__CODE = eINSTANCE.getException_Code();

		/**
		 * The meta object literal for the '{@link crystal.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.IfImpl
		 * @see crystal.impl.CrystalPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__CLASS_NAME = eINSTANCE.getIf_ClassName();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IFS = eINSTANCE.getIf_Ifs();

		/**
		 * The meta object literal for the '<em><b>Elses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSES = eINSTANCE.getIf_Elses();

		/**
		 * The meta object literal for the '{@link crystal.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CaseImpl
		 * @see crystal.impl.CrystalPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__CLASS_NAME = eINSTANCE.getCase_ClassName();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CASES = eINSTANCE.getCase_Cases();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ELSE_STATEMENTS = eINSTANCE.getCase_ElseStatements();

		/**
		 * The meta object literal for the '{@link crystal.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.InsertImpl
		 * @see crystal.impl.CrystalPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__CLASS_NAME = eINSTANCE.getInsert_ClassName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__CODE = eINSTANCE.getInsert_Code();

		/**
		 * The meta object literal for the '{@link crystal.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.UpdateImpl
		 * @see crystal.impl.CrystalPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__CLASS_NAME = eINSTANCE.getUpdate_ClassName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__CODE = eINSTANCE.getUpdate_Code();

		/**
		 * The meta object literal for the '{@link crystal.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.DeleteImpl
		 * @see crystal.impl.CrystalPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__CLASS_NAME = eINSTANCE.getDelete_ClassName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__CODE = eINSTANCE.getDelete_Code();

		/**
		 * The meta object literal for the '{@link crystal.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.SelectImpl
		 * @see crystal.impl.CrystalPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__CLASS_NAME = eINSTANCE.getSelect_ClassName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__CODE = eINSTANCE.getSelect_Code();

		/**
		 * The meta object literal for the '{@link crystal.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.SelectorImpl
		 * @see crystal.impl.CrystalPackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR__CLASS_NAME = eINSTANCE.getSelector_ClassName();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR__CONDITION = eINSTANCE.getSelector_Condition();

		/**
		 * The meta object literal for the '<em><b>Case Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR__CASE_STATEMENTS = eINSTANCE.getSelector_CaseStatements();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR__DESCRIPTION = eINSTANCE.getSelector_Description();

		/**
		 * The meta object literal for the '{@link crystal.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.WhileImpl
		 * @see crystal.impl.CrystalPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE__CLASS_NAME = eINSTANCE.getWhile_ClassName();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '<em><b>While Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__WHILE_STATEMENTS = eINSTANCE.getWhile_WhileStatements();

		/**
		 * The meta object literal for the '{@link crystal.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.ForImpl
		 * @see crystal.impl.CrystalPackageImpl#getFor()
		 * @generated
		 */
		EClass FOR = eINSTANCE.getFor();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__CLASS_NAME = eINSTANCE.getFor_ClassName();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__COUNTER = eINSTANCE.getFor_Counter();

		/**
		 * The meta object literal for the '<em><b>Type Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__TYPE_COUNTER = eINSTANCE.getFor_TypeCounter();

		/**
		 * The meta object literal for the '<em><b>Lowest Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__LOWEST_NUMBER = eINSTANCE.getFor_LowestNumber();

		/**
		 * The meta object literal for the '<em><b>Highest Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__HIGHEST_NUMBER = eINSTANCE.getFor_HighestNumber();

		/**
		 * The meta object literal for the '<em><b>For Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR__FOR_STATEMENTS = eINSTANCE.getFor_ForStatements();

		/**
		 * The meta object literal for the '{@link crystal.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.LoopImpl
		 * @see crystal.impl.CrystalPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__CLASS_NAME = eINSTANCE.getLoop_ClassName();

		/**
		 * The meta object literal for the '<em><b>Break Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__BREAK_CONDITION = eINSTANCE.getLoop_BreakCondition();

		/**
		 * The meta object literal for the '<em><b>Loop Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_STATEMENTS = eINSTANCE.getLoop_LoopStatements();

		/**
		 * The meta object literal for the '{@link crystal.impl.OpenImpl <em>Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.OpenImpl
		 * @see crystal.impl.CrystalPackageImpl#getOpen()
		 * @generated
		 */
		EClass OPEN = eINSTANCE.getOpen();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__CLASS_NAME = eINSTANCE.getOpen_ClassName();

		/**
		 * The meta object literal for the '<em><b>Cursor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__CURSOR_NAME = eINSTANCE.getOpen_CursorName();

		/**
		 * The meta object literal for the '{@link crystal.impl.FetchImpl <em>Fetch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.FetchImpl
		 * @see crystal.impl.CrystalPackageImpl#getFetch()
		 * @generated
		 */
		EClass FETCH = eINSTANCE.getFetch();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH__CLASS_NAME = eINSTANCE.getFetch_ClassName();

		/**
		 * The meta object literal for the '<em><b>Cursor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH__CURSOR_NAME = eINSTANCE.getFetch_CursorName();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH__VARIABLE_NAME = eINSTANCE.getFetch_VariableName();

		/**
		 * The meta object literal for the '{@link crystal.impl.CloseImpl <em>Close</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CloseImpl
		 * @see crystal.impl.CrystalPackageImpl#getClose()
		 * @generated
		 */
		EClass CLOSE = eINSTANCE.getClose();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSE__CLASS_NAME = eINSTANCE.getClose_ClassName();

		/**
		 * The meta object literal for the '<em><b>Cursor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSE__CURSOR_NAME = eINSTANCE.getClose_CursorName();

		/**
		 * The meta object literal for the '{@link crystal.impl.CallProcedureImpl <em>Call Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CallProcedureImpl
		 * @see crystal.impl.CrystalPackageImpl#getCallProcedure()
		 * @generated
		 */
		EClass CALL_PROCEDURE = eINSTANCE.getCallProcedure();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_PROCEDURE__CLASS_NAME = eINSTANCE.getCallProcedure_ClassName();

		/**
		 * The meta object literal for the '<em><b>Name Subroutine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_PROCEDURE__NAME_SUBROUTINE = eINSTANCE.getCallProcedure_NameSubroutine();

		/**
		 * The meta object literal for the '{@link crystal.impl.CallFunctionImpl <em>Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CallFunctionImpl
		 * @see crystal.impl.CrystalPackageImpl#getCallFunction()
		 * @generated
		 */
		EClass CALL_FUNCTION = eINSTANCE.getCallFunction();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_FUNCTION__CLASS_NAME = eINSTANCE.getCallFunction_ClassName();

		/**
		 * The meta object literal for the '<em><b>Name Subroutine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_FUNCTION__NAME_SUBROUTINE = eINSTANCE.getCallFunction_NameSubroutine();

		/**
		 * The meta object literal for the '{@link crystal.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.TransitionImpl
		 * @see crystal.impl.CrystalPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link crystal.impl.SelectorTransitionImpl <em>Selector Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.SelectorTransitionImpl
		 * @see crystal.impl.CrystalPackageImpl#getSelectorTransition()
		 * @generated
		 */
		EClass SELECTOR_TRANSITION = eINSTANCE.getSelectorTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR_TRANSITION__NAME = eINSTANCE.getSelectorTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR_TRANSITION__SOURCE = eINSTANCE.getSelectorTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR_TRANSITION__TARGET = eINSTANCE.getSelectorTransition_Target();

		/**
		 * The meta object literal for the '{@link crystal.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.ExpressionImpl
		 * @see crystal.impl.CrystalPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__CLASS_NAME = eINSTANCE.getExpression_ClassName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '{@link crystal.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.ParameterType
		 * @see crystal.impl.CrystalPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link crystal.ForCounter <em>For Counter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.ForCounter
		 * @see crystal.impl.CrystalPackageImpl#getForCounter()
		 * @generated
		 */
		EEnum FOR_COUNTER = eINSTANCE.getForCounter();

		/**
		 * The meta object literal for the '{@link crystal.DataTypeOptions <em>Data Type Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.DataTypeOptions
		 * @see crystal.impl.CrystalPackageImpl#getDataTypeOptions()
		 * @generated
		 */
		EEnum DATA_TYPE_OPTIONS = eINSTANCE.getDataTypeOptions();

	}

} //CrystalPackage
