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
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Subprograms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL__SUBPROGRAMS = 1;

	/**
	 * The number of structural features of the '<em>Crystal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYSTAL_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAMS__DECLARATIVE_PART = 0;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAMS__EXECUTABLE_PART = 1;

	/**
	 * The number of structural features of the '<em>Subprograms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAMS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crystal.impl.NamedBlocksImpl <em>Named Blocks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.NamedBlocksImpl
	 * @see crystal.impl.CrystalPackageImpl#getNamedBlocks()
	 * @generated
	 */
	int NAMED_BLOCKS = 2;

	/**
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCKS__DECLARATIVE_PART = SUBPROGRAMS__DECLARATIVE_PART;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCKS__EXECUTABLE_PART = SUBPROGRAMS__EXECUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCKS__NAME = SUBPROGRAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCKS__PARAMETERS = SUBPROGRAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCKS_FEATURE_COUNT = SUBPROGRAMS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link crystal.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ProcedureImpl
	 * @see crystal.impl.CrystalPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 3;

	/**
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DECLARATIVE_PART = NAMED_BLOCKS__DECLARATIVE_PART;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__EXECUTABLE_PART = NAMED_BLOCKS__EXECUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = NAMED_BLOCKS__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARAMETERS = NAMED_BLOCKS__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = NAMED_BLOCKS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link crystal.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.FunctionImpl
	 * @see crystal.impl.CrystalPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DECLARATIVE_PART = NAMED_BLOCKS__DECLARATIVE_PART;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXECUTABLE_PART = NAMED_BLOCKS__EXECUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_BLOCKS__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = NAMED_BLOCKS__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Return Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_PART = NAMED_BLOCKS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_BLOCKS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link crystal.impl.AnonymousBlockImpl <em>Anonymous Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.AnonymousBlockImpl
	 * @see crystal.impl.CrystalPackageImpl#getAnonymousBlock()
	 * @generated
	 */
	int ANONYMOUS_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Declarative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK__DECLARATIVE_PART = SUBPROGRAMS__DECLARATIVE_PART;

	/**
	 * The feature id for the '<em><b>Executable Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK__EXECUTABLE_PART = SUBPROGRAMS__EXECUTABLE_PART;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK__DESCRIPTION = SUBPROGRAMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anonymous Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_BLOCK_FEATURE_COUNT = SUBPROGRAMS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link crystal.impl.DataAbstractionsImpl <em>Data Abstractions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.DataAbstractionsImpl
	 * @see crystal.impl.CrystalPackageImpl#getDataAbstractions()
	 * @generated
	 */
	int DATA_ABSTRACTIONS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ABSTRACTIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ABSTRACTIONS__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Abstractions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ABSTRACTIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crystal.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.DataTypeImpl
	 * @see crystal.impl.CrystalPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = DATA_ABSTRACTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE = DATA_ABSTRACTIONS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CLASS_NAME = DATA_ABSTRACTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OPTIONS = DATA_ABSTRACTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PRECISION = DATA_ABSTRACTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SCALE = DATA_ABSTRACTIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = DATA_ABSTRACTIONS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link crystal.impl.CollectionsImpl <em>Collections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CollectionsImpl
	 * @see crystal.impl.CrystalPackageImpl#getCollections()
	 * @generated
	 */
	int COLLECTIONS = 8;


	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__NAME = DATA_ABSTRACTIONS__NAME;

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
	int COLLECTIONS__TYPE = DATA_ABSTRACTIONS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__CLASS_NAME = DATA_ABSTRACTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__CODE = DATA_ABSTRACTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS__TYPE_NAME = DATA_ABSTRACTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIONS_FEATURE_COUNT = DATA_ABSTRACTIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link crystal.impl.RecordsImpl <em>Records</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.RecordsImpl
	 * @see crystal.impl.CrystalPackageImpl#getRecords()
	 * @generated
	 */
	int RECORDS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__NAME = DATA_ABSTRACTIONS__NAME;

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
	int RECORDS__TYPE = DATA_ABSTRACTIONS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__CLASS_NAME = DATA_ABSTRACTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__CODE = DATA_ABSTRACTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS__TYPE_NAME = DATA_ABSTRACTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Records</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDS_FEATURE_COUNT = DATA_ABSTRACTIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link crystal.impl.CursorImpl <em>Cursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CursorImpl
	 * @see crystal.impl.CrystalPackageImpl#getCursor()
	 * @generated
	 */
	int CURSOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__NAME = DATA_ABSTRACTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__TYPE = DATA_ABSTRACTIONS__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__CLASS_NAME = DATA_ABSTRACTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cursor Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR__CURSOR_QUERY = DATA_ABSTRACTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_FEATURE_COUNT = DATA_ABSTRACTIONS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link crystal.impl.StatementsImpl <em>Statements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.StatementsImpl
	 * @see crystal.impl.CrystalPackageImpl#getStatements()
	 * @generated
	 */
	int STATEMENTS = 11;

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
	 * The meta object id for the '{@link crystal.impl.CallBlocksImpl <em>Call Blocks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CallBlocksImpl
	 * @see crystal.impl.CrystalPackageImpl#getCallBlocks()
	 * @generated
	 */
	int CALL_BLOCKS = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BLOCKS__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BLOCKS__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Name Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BLOCKS__NAME_SUBROUTINE = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BLOCKS_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link crystal.impl.CursorOperationsImpl <em>Cursor Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CursorOperationsImpl
	 * @see crystal.impl.CrystalPackageImpl#getCursorOperations()
	 * @generated
	 */
	int CURSOR_OPERATIONS = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_OPERATIONS__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_OPERATIONS__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_OPERATIONS__CURSOR_NAME = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cursor Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_OPERATIONS_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link crystal.impl.SQLOperationsImpl <em>SQL Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.SQLOperationsImpl
	 * @see crystal.impl.CrystalPackageImpl#getSQLOperations()
	 * @generated
	 */
	int SQL_OPERATIONS = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_OPERATIONS__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_OPERATIONS__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_OPERATIONS__CODE = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SQL Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_OPERATIONS_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link crystal.impl.IterationStructuresImpl <em>Iteration Structures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.IterationStructuresImpl
	 * @see crystal.impl.CrystalPackageImpl#getIterationStructures()
	 * @generated
	 */
	int ITERATION_STRUCTURES = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_STRUCTURES__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_STRUCTURES__IS_START = STATEMENTS__IS_START;

	/**
	 * The feature id for the '<em><b>Interations statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_STRUCTURES__INTERATIONS_STATEMENTS = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iteration Structures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_STRUCTURES_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link crystal.impl.ConditionalStructuresImpl <em>Conditional Structures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ConditionalStructuresImpl
	 * @see crystal.impl.CrystalPackageImpl#getConditionalStructures()
	 * @generated
	 */
	int CONDITIONAL_STRUCTURES = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STRUCTURES__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STRUCTURES__IS_START = STATEMENTS__IS_START;

	/**
	 * The number of structural features of the '<em>Conditional Structures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STRUCTURES_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link crystal.impl.AdditionalOperationsImpl <em>Additional Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.AdditionalOperationsImpl
	 * @see crystal.impl.CrystalPackageImpl#getAdditionalOperations()
	 * @generated
	 */
	int ADDITIONAL_OPERATIONS = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OPERATIONS__DESCRIPTION = STATEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OPERATIONS__IS_START = STATEMENTS__IS_START;

	/**
	 * The number of structural features of the '<em>Additional Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OPERATIONS_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link crystal.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ExceptionImpl
	 * @see crystal.impl.CrystalPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 19;

	/**
	 * The meta object id for the '{@link crystal.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.IfImpl
	 * @see crystal.impl.CrystalPackageImpl#getIf()
	 * @generated
	 */
	int IF = 20;

	/**
	 * The meta object id for the '{@link crystal.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CaseImpl
	 * @see crystal.impl.CrystalPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 21;

	/**
	 * The meta object id for the '{@link crystal.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.InsertImpl
	 * @see crystal.impl.CrystalPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 23;

	/**
	 * The meta object id for the '{@link crystal.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.UpdateImpl
	 * @see crystal.impl.CrystalPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 24;

	/**
	 * The meta object id for the '{@link crystal.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.DeleteImpl
	 * @see crystal.impl.CrystalPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 25;

	/**
	 * The meta object id for the '{@link crystal.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.SelectImpl
	 * @see crystal.impl.CrystalPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 26;

	/**
	 * The meta object id for the '{@link crystal.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.WhileImpl
	 * @see crystal.impl.CrystalPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 27;

	/**
	 * The meta object id for the '{@link crystal.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ForImpl
	 * @see crystal.impl.CrystalPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 28;

	/**
	 * The meta object id for the '{@link crystal.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.LoopImpl
	 * @see crystal.impl.CrystalPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 29;

	/**
	 * The meta object id for the '{@link crystal.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.OpenImpl
	 * @see crystal.impl.CrystalPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 30;

	/**
	 * The meta object id for the '{@link crystal.impl.FetchImpl <em>Fetch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.FetchImpl
	 * @see crystal.impl.CrystalPackageImpl#getFetch()
	 * @generated
	 */
	int FETCH = 31;

	/**
	 * The meta object id for the '{@link crystal.impl.CloseImpl <em>Close</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CloseImpl
	 * @see crystal.impl.CrystalPackageImpl#getClose()
	 * @generated
	 */
	int CLOSE = 32;

	/**
	 * The meta object id for the '{@link crystal.impl.CallProcedureImpl <em>Call Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CallProcedureImpl
	 * @see crystal.impl.CrystalPackageImpl#getCallProcedure()
	 * @generated
	 */
	int CALL_PROCEDURE = 33;

	/**
	 * The meta object id for the '{@link crystal.impl.CallFunctionImpl <em>Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.CallFunctionImpl
	 * @see crystal.impl.CrystalPackageImpl#getCallFunction()
	 * @generated
	 */
	int CALL_FUNCTION = 34;

	/**
	 * The meta object id for the '{@link crystal.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.TransitionImpl
	 * @see crystal.impl.CrystalPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 36;

	/**
	 * The meta object id for the '{@link crystal.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.ExpressionImpl
	 * @see crystal.impl.CrystalPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = ADDITIONAL_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_START = ADDITIONAL_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CLASS_NAME = ADDITIONAL_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = ADDITIONAL_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ADDITIONAL_OPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__DESCRIPTION = ADDITIONAL_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__IS_START = ADDITIONAL_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__CLASS_NAME = ADDITIONAL_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__CODE = ADDITIONAL_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = ADDITIONAL_OPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DESCRIPTION = CONDITIONAL_STRUCTURES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IS_START = CONDITIONAL_STRUCTURES__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CLASS_NAME = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>True statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__TRUE_STATEMENTS = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>False statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FALSE_STATEMENTS = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DESCRIPTION = CONDITIONAL_STRUCTURES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__IS_START = CONDITIONAL_STRUCTURES__IS_START;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CLASS_NAME = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__OPTIONS = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DEFAULT_STATEMENTS = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = CONDITIONAL_STRUCTURES_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link crystal.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.OptionsImpl
	 * @see crystal.impl.CrystalPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 22;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Case statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__CASE_STATEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__DESCRIPTION = SQL_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__IS_START = SQL_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__CODE = SQL_OPERATIONS__CODE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__CLASS_NAME = SQL_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = SQL_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__DESCRIPTION = SQL_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__IS_START = SQL_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CODE = SQL_OPERATIONS__CODE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CLASS_NAME = SQL_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = SQL_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DESCRIPTION = SQL_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_START = SQL_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CODE = SQL_OPERATIONS__CODE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CLASS_NAME = SQL_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = SQL_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__DESCRIPTION = SQL_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__IS_START = SQL_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CODE = SQL_OPERATIONS__CODE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CLASS_NAME = SQL_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = SQL_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DESCRIPTION = ITERATION_STRUCTURES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__IS_START = ITERATION_STRUCTURES__IS_START;

	/**
	 * The feature id for the '<em><b>Interations statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__INTERATIONS_STATEMENTS = ITERATION_STRUCTURES__INTERATIONS_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CLASS_NAME = ITERATION_STRUCTURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = ITERATION_STRUCTURES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = ITERATION_STRUCTURES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__DESCRIPTION = ITERATION_STRUCTURES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__IS_START = ITERATION_STRUCTURES__IS_START;

	/**
	 * The feature id for the '<em><b>Interations statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__INTERATIONS_STATEMENTS = ITERATION_STRUCTURES__INTERATIONS_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__CLASS_NAME = ITERATION_STRUCTURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__COUNTER = ITERATION_STRUCTURES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__TYPE_COUNTER = ITERATION_STRUCTURES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lowest Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__LOWEST_NUMBER = ITERATION_STRUCTURES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Highest Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__HIGHEST_NUMBER = ITERATION_STRUCTURES_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = ITERATION_STRUCTURES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__DESCRIPTION = ITERATION_STRUCTURES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__IS_START = ITERATION_STRUCTURES__IS_START;

	/**
	 * The feature id for the '<em><b>Interations statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__INTERATIONS_STATEMENTS = ITERATION_STRUCTURES__INTERATIONS_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CLASS_NAME = ITERATION_STRUCTURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Break Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BREAK_CONDITION = ITERATION_STRUCTURES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ITERATION_STRUCTURES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__DESCRIPTION = CURSOR_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__IS_START = CURSOR_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__CURSOR_NAME = CURSOR_OPERATIONS__CURSOR_NAME;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__CLASS_NAME = CURSOR_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = CURSOR_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__DESCRIPTION = CURSOR_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__IS_START = CURSOR_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__CURSOR_NAME = CURSOR_OPERATIONS__CURSOR_NAME;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__CLASS_NAME = CURSOR_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__VARIABLE_NAME = CURSOR_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fetch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_FEATURE_COUNT = CURSOR_OPERATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__DESCRIPTION = CURSOR_OPERATIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__IS_START = CURSOR_OPERATIONS__IS_START;

	/**
	 * The feature id for the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__CURSOR_NAME = CURSOR_OPERATIONS__CURSOR_NAME;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__CLASS_NAME = CURSOR_OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Close</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_FEATURE_COUNT = CURSOR_OPERATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__DESCRIPTION = CALL_BLOCKS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__IS_START = CALL_BLOCKS__IS_START;

	/**
	 * The feature id for the '<em><b>Name Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__NAME_SUBROUTINE = CALL_BLOCKS__NAME_SUBROUTINE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE__CLASS_NAME = CALL_BLOCKS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_PROCEDURE_FEATURE_COUNT = CALL_BLOCKS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__DESCRIPTION = CALL_BLOCKS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__IS_START = CALL_BLOCKS__IS_START;

	/**
	 * The feature id for the '<em><b>Name Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__NAME_SUBROUTINE = CALL_BLOCKS__NAME_SUBROUTINE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__CLASS_NAME = CALL_BLOCKS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_FEATURE_COUNT = CALL_BLOCKS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link crystal.impl.LinksImpl <em>Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.LinksImpl
	 * @see crystal.impl.CrystalPackageImpl#getLinks()
	 * @generated
	 */
	int LINKS = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = LINKS__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = LINKS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = LINKS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = LINKS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link crystal.impl.OptionsTransitionImpl <em>Options Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.OptionsTransitionImpl
	 * @see crystal.impl.CrystalPackageImpl#getOptionsTransition()
	 * @generated
	 */
	int OPTIONS_TRANSITION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TRANSITION__NAME = LINKS__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TRANSITION__SOURCE = LINKS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TRANSITION__TARGET = LINKS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Options Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TRANSITION_FEATURE_COUNT = LINKS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link crystal.impl.NewEClass39Impl <em>New EClass39</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.NewEClass39Impl
	 * @see crystal.impl.CrystalPackageImpl#getNewEClass39()
	 * @generated
	 */
	int NEW_ECLASS39 = 38;

	/**
	 * The number of structural features of the '<em>New EClass39</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS39_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link crystal.impl.NewEClass40Impl <em>New EClass40</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.impl.NewEClass40Impl
	 * @see crystal.impl.CrystalPackageImpl#getNewEClass40()
	 * @generated
	 */
	int NEW_ECLASS40 = 39;

	/**
	 * The number of structural features of the '<em>New EClass40</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS40_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link crystal.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.ParameterType
	 * @see crystal.impl.CrystalPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 40;

	/**
	 * The meta object id for the '{@link crystal.ForCounter <em>For Counter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.ForCounter
	 * @see crystal.impl.CrystalPackageImpl#getForCounter()
	 * @generated
	 */
	int FOR_COUNTER = 41;

	/**
	 * The meta object id for the '{@link crystal.DataTypeOptions <em>Data Type Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crystal.DataTypeOptions
	 * @see crystal.impl.CrystalPackageImpl#getDataTypeOptions()
	 * @generated
	 */
	int DATA_TYPE_OPTIONS = 42;


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
	 * Returns the meta object for the containment reference list '{@link crystal.Crystal#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see crystal.Crystal#getLinks()
	 * @see #getCrystal()
	 * @generated
	 */
	EReference getCrystal_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Crystal#getSubprograms <em>Subprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subprograms</em>'.
	 * @see crystal.Crystal#getSubprograms()
	 * @see #getCrystal()
	 * @generated
	 */
	EReference getCrystal_Subprograms();

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
	 * Returns the meta object for the containment reference list '{@link crystal.Subprograms#getDeclarativePart <em>Declarative Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarative Part</em>'.
	 * @see crystal.Subprograms#getDeclarativePart()
	 * @see #getSubprograms()
	 * @generated
	 */
	EReference getSubprograms_DeclarativePart();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Subprograms#getExecutablePart <em>Executable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executable Part</em>'.
	 * @see crystal.Subprograms#getExecutablePart()
	 * @see #getSubprograms()
	 * @generated
	 */
	EReference getSubprograms_ExecutablePart();

	/**
	 * Returns the meta object for class '{@link crystal.NamedBlocks <em>Named Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Blocks</em>'.
	 * @see crystal.NamedBlocks
	 * @generated
	 */
	EClass getNamedBlocks();

	/**
	 * Returns the meta object for the attribute '{@link crystal.NamedBlocks#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crystal.NamedBlocks#getName()
	 * @see #getNamedBlocks()
	 * @generated
	 */
	EAttribute getNamedBlocks_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.NamedBlocks#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see crystal.NamedBlocks#getParameters()
	 * @see #getNamedBlocks()
	 * @generated
	 */
	EReference getNamedBlocks_Parameters();

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
	 * Returns the meta object for class '{@link crystal.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see crystal.Function
	 * @generated
	 */
	EClass getFunction();

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
	 * Returns the meta object for class '{@link crystal.AnonymousBlock <em>Anonymous Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Block</em>'.
	 * @see crystal.AnonymousBlock
	 * @generated
	 */
	EClass getAnonymousBlock();

	/**
	 * Returns the meta object for the attribute '{@link crystal.AnonymousBlock#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crystal.AnonymousBlock#getDescription()
	 * @see #getAnonymousBlock()
	 * @generated
	 */
	EAttribute getAnonymousBlock_Description();

	/**
	 * Returns the meta object for class '{@link crystal.DataAbstractions <em>Data Abstractions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Abstractions</em>'.
	 * @see crystal.DataAbstractions
	 * @generated
	 */
	EClass getDataAbstractions();

	/**
	 * Returns the meta object for the attribute '{@link crystal.DataAbstractions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crystal.DataAbstractions#getName()
	 * @see #getDataAbstractions()
	 * @generated
	 */
	EAttribute getDataAbstractions_Name();

	/**
	 * Returns the meta object for the attribute '{@link crystal.DataAbstractions#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see crystal.DataAbstractions#getType()
	 * @see #getDataAbstractions()
	 * @generated
	 */
	EAttribute getDataAbstractions_Type();

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
	 * Returns the meta object for class '{@link crystal.CallBlocks <em>Call Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Blocks</em>'.
	 * @see crystal.CallBlocks
	 * @generated
	 */
	EClass getCallBlocks();

	/**
	 * Returns the meta object for the attribute '{@link crystal.CallBlocks#getNameSubroutine <em>Name Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Subroutine</em>'.
	 * @see crystal.CallBlocks#getNameSubroutine()
	 * @see #getCallBlocks()
	 * @generated
	 */
	EAttribute getCallBlocks_NameSubroutine();

	/**
	 * Returns the meta object for class '{@link crystal.CursorOperations <em>Cursor Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cursor Operations</em>'.
	 * @see crystal.CursorOperations
	 * @generated
	 */
	EClass getCursorOperations();

	/**
	 * Returns the meta object for the attribute '{@link crystal.CursorOperations#getCursorName <em>Cursor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Name</em>'.
	 * @see crystal.CursorOperations#getCursorName()
	 * @see #getCursorOperations()
	 * @generated
	 */
	EAttribute getCursorOperations_CursorName();

	/**
	 * Returns the meta object for class '{@link crystal.SQLOperations <em>SQL Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Operations</em>'.
	 * @see crystal.SQLOperations
	 * @generated
	 */
	EClass getSQLOperations();

	/**
	 * Returns the meta object for the attribute '{@link crystal.SQLOperations#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see crystal.SQLOperations#getCode()
	 * @see #getSQLOperations()
	 * @generated
	 */
	EAttribute getSQLOperations_Code();

	/**
	 * Returns the meta object for class '{@link crystal.IterationStructures <em>Iteration Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Structures</em>'.
	 * @see crystal.IterationStructures
	 * @generated
	 */
	EClass getIterationStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.IterationStructures#getInterations_statements <em>Interations statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interations statements</em>'.
	 * @see crystal.IterationStructures#getInterations_statements()
	 * @see #getIterationStructures()
	 * @generated
	 */
	EReference getIterationStructures_Interations_statements();

	/**
	 * Returns the meta object for class '{@link crystal.ConditionalStructures <em>Conditional Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Structures</em>'.
	 * @see crystal.ConditionalStructures
	 * @generated
	 */
	EClass getConditionalStructures();

	/**
	 * Returns the meta object for class '{@link crystal.AdditionalOperations <em>Additional Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Operations</em>'.
	 * @see crystal.AdditionalOperations
	 * @generated
	 */
	EClass getAdditionalOperations();

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
	 * Returns the meta object for the containment reference list '{@link crystal.If#getTrue_statements <em>True statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>True statements</em>'.
	 * @see crystal.If#getTrue_statements()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_True_statements();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.If#getFalse_statements <em>False statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>False statements</em>'.
	 * @see crystal.If#getFalse_statements()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_False_statements();

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
	 * Returns the meta object for the containment reference list '{@link crystal.Case#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see crystal.Case#getOptions()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Case#getDefault_statements <em>Default statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default statements</em>'.
	 * @see crystal.Case#getDefault_statements()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Default_statements();

	/**
	 * Returns the meta object for class '{@link crystal.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see crystal.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Options#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see crystal.Options#getClassName()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Options#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see crystal.Options#getCondition()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Condition();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Options#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crystal.Options#getDescription()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link crystal.Options#getCase_statements <em>Case statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case statements</em>'.
	 * @see crystal.Options#getCase_statements()
	 * @see #getOptions()
	 * @generated
	 */
	EReference getOptions_Case_statements();

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
	 * Returns the meta object for class '{@link crystal.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links</em>'.
	 * @see crystal.Links
	 * @generated
	 */
	EClass getLinks();

	/**
	 * Returns the meta object for the attribute '{@link crystal.Links#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crystal.Links#getName()
	 * @see #getLinks()
	 * @generated
	 */
	EAttribute getLinks_Name();

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
	 * Returns the meta object for class '{@link crystal.OptionsTransition <em>Options Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Transition</em>'.
	 * @see crystal.OptionsTransition
	 * @generated
	 */
	EClass getOptionsTransition();

	/**
	 * Returns the meta object for the reference '{@link crystal.OptionsTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see crystal.OptionsTransition#getSource()
	 * @see #getOptionsTransition()
	 * @generated
	 */
	EReference getOptionsTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link crystal.OptionsTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see crystal.OptionsTransition#getTarget()
	 * @see #getOptionsTransition()
	 * @generated
	 */
	EReference getOptionsTransition_Target();

	/**
	 * Returns the meta object for class '{@link crystal.NewEClass39 <em>New EClass39</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass39</em>'.
	 * @see crystal.NewEClass39
	 * @generated
	 */
	EClass getNewEClass39();

	/**
	 * Returns the meta object for class '{@link crystal.NewEClass40 <em>New EClass40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass40</em>'.
	 * @see crystal.NewEClass40
	 * @generated
	 */
	EClass getNewEClass40();

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
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYSTAL__LINKS = eINSTANCE.getCrystal_Links();

		/**
		 * The meta object literal for the '<em><b>Subprograms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYSTAL__SUBPROGRAMS = eINSTANCE.getCrystal_Subprograms();

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
		 * The meta object literal for the '<em><b>Declarative Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAMS__DECLARATIVE_PART = eINSTANCE.getSubprograms_DeclarativePart();

		/**
		 * The meta object literal for the '<em><b>Executable Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAMS__EXECUTABLE_PART = eINSTANCE.getSubprograms_ExecutablePart();

		/**
		 * The meta object literal for the '{@link crystal.impl.NamedBlocksImpl <em>Named Blocks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.NamedBlocksImpl
		 * @see crystal.impl.CrystalPackageImpl#getNamedBlocks()
		 * @generated
		 */
		EClass NAMED_BLOCKS = eINSTANCE.getNamedBlocks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_BLOCKS__NAME = eINSTANCE.getNamedBlocks_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_BLOCKS__PARAMETERS = eINSTANCE.getNamedBlocks_Parameters();

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
		 * The meta object literal for the '{@link crystal.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.FunctionImpl
		 * @see crystal.impl.CrystalPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Return Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_PART = eINSTANCE.getFunction_ReturnPart();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMOUS_BLOCK__DESCRIPTION = eINSTANCE.getAnonymousBlock_Description();

		/**
		 * The meta object literal for the '{@link crystal.impl.DataAbstractionsImpl <em>Data Abstractions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.DataAbstractionsImpl
		 * @see crystal.impl.CrystalPackageImpl#getDataAbstractions()
		 * @generated
		 */
		EClass DATA_ABSTRACTIONS = eINSTANCE.getDataAbstractions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ABSTRACTIONS__NAME = eINSTANCE.getDataAbstractions_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ABSTRACTIONS__TYPE = eINSTANCE.getDataAbstractions_Type();

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
		 * The meta object literal for the '{@link crystal.impl.CallBlocksImpl <em>Call Blocks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CallBlocksImpl
		 * @see crystal.impl.CrystalPackageImpl#getCallBlocks()
		 * @generated
		 */
		EClass CALL_BLOCKS = eINSTANCE.getCallBlocks();

		/**
		 * The meta object literal for the '<em><b>Name Subroutine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_BLOCKS__NAME_SUBROUTINE = eINSTANCE.getCallBlocks_NameSubroutine();

		/**
		 * The meta object literal for the '{@link crystal.impl.CursorOperationsImpl <em>Cursor Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.CursorOperationsImpl
		 * @see crystal.impl.CrystalPackageImpl#getCursorOperations()
		 * @generated
		 */
		EClass CURSOR_OPERATIONS = eINSTANCE.getCursorOperations();

		/**
		 * The meta object literal for the '<em><b>Cursor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURSOR_OPERATIONS__CURSOR_NAME = eINSTANCE.getCursorOperations_CursorName();

		/**
		 * The meta object literal for the '{@link crystal.impl.SQLOperationsImpl <em>SQL Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.SQLOperationsImpl
		 * @see crystal.impl.CrystalPackageImpl#getSQLOperations()
		 * @generated
		 */
		EClass SQL_OPERATIONS = eINSTANCE.getSQLOperations();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_OPERATIONS__CODE = eINSTANCE.getSQLOperations_Code();

		/**
		 * The meta object literal for the '{@link crystal.impl.IterationStructuresImpl <em>Iteration Structures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.IterationStructuresImpl
		 * @see crystal.impl.CrystalPackageImpl#getIterationStructures()
		 * @generated
		 */
		EClass ITERATION_STRUCTURES = eINSTANCE.getIterationStructures();

		/**
		 * The meta object literal for the '<em><b>Interations statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_STRUCTURES__INTERATIONS_STATEMENTS = eINSTANCE.getIterationStructures_Interations_statements();

		/**
		 * The meta object literal for the '{@link crystal.impl.ConditionalStructuresImpl <em>Conditional Structures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.ConditionalStructuresImpl
		 * @see crystal.impl.CrystalPackageImpl#getConditionalStructures()
		 * @generated
		 */
		EClass CONDITIONAL_STRUCTURES = eINSTANCE.getConditionalStructures();

		/**
		 * The meta object literal for the '{@link crystal.impl.AdditionalOperationsImpl <em>Additional Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.AdditionalOperationsImpl
		 * @see crystal.impl.CrystalPackageImpl#getAdditionalOperations()
		 * @generated
		 */
		EClass ADDITIONAL_OPERATIONS = eINSTANCE.getAdditionalOperations();

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
		 * The meta object literal for the '<em><b>True statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__TRUE_STATEMENTS = eINSTANCE.getIf_True_statements();

		/**
		 * The meta object literal for the '<em><b>False statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__FALSE_STATEMENTS = eINSTANCE.getIf_False_statements();

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
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__OPTIONS = eINSTANCE.getCase_Options();

		/**
		 * The meta object literal for the '<em><b>Default statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__DEFAULT_STATEMENTS = eINSTANCE.getCase_Default_statements();

		/**
		 * The meta object literal for the '{@link crystal.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.OptionsImpl
		 * @see crystal.impl.CrystalPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__CLASS_NAME = eINSTANCE.getOptions_ClassName();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__CONDITION = eINSTANCE.getOptions_Condition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__DESCRIPTION = eINSTANCE.getOptions_Description();

		/**
		 * The meta object literal for the '<em><b>Case statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS__CASE_STATEMENTS = eINSTANCE.getOptions_Case_statements();

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
		 * The meta object literal for the '{@link crystal.impl.LinksImpl <em>Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.LinksImpl
		 * @see crystal.impl.CrystalPackageImpl#getLinks()
		 * @generated
		 */
		EClass LINKS = eINSTANCE.getLinks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKS__NAME = eINSTANCE.getLinks_Name();

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
		 * The meta object literal for the '{@link crystal.impl.OptionsTransitionImpl <em>Options Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.OptionsTransitionImpl
		 * @see crystal.impl.CrystalPackageImpl#getOptionsTransition()
		 * @generated
		 */
		EClass OPTIONS_TRANSITION = eINSTANCE.getOptionsTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_TRANSITION__SOURCE = eINSTANCE.getOptionsTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_TRANSITION__TARGET = eINSTANCE.getOptionsTransition_Target();

		/**
		 * The meta object literal for the '{@link crystal.impl.NewEClass39Impl <em>New EClass39</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.NewEClass39Impl
		 * @see crystal.impl.CrystalPackageImpl#getNewEClass39()
		 * @generated
		 */
		EClass NEW_ECLASS39 = eINSTANCE.getNewEClass39();

		/**
		 * The meta object literal for the '{@link crystal.impl.NewEClass40Impl <em>New EClass40</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crystal.impl.NewEClass40Impl
		 * @see crystal.impl.CrystalPackageImpl#getNewEClass40()
		 * @generated
		 */
		EClass NEW_ECLASS40 = eINSTANCE.getNewEClass40();

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
