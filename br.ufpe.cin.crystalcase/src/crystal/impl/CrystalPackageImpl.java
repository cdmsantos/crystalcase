/**
 */
package crystal.impl;

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
import crystal.CrystalFactory;
import crystal.CrystalPackage;
import crystal.Cursor;
import crystal.CursorOperations;
import crystal.DataAbstractions;
import crystal.DataType;
import crystal.DataTypeOptions;
import crystal.Delete;
import crystal.Expression;
import crystal.Fetch;
import crystal.For;
import crystal.ForCounter;
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
import crystal.ParameterType;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrystalPackageImpl extends EPackageImpl implements CrystalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crystalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedBlocksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAbstractionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBlocksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursorOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationStructuresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStructuresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fetchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass39EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass40EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum forCounterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeOptionsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see crystal.CrystalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CrystalPackageImpl() {
		super(eNS_URI, CrystalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CrystalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CrystalPackage init() {
		if (isInited) return (CrystalPackage)EPackage.Registry.INSTANCE.getEPackage(CrystalPackage.eNS_URI);

		// Obtain or create and register package
		CrystalPackageImpl theCrystalPackage = (CrystalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CrystalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CrystalPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCrystalPackage.createPackageContents();

		// Initialize created meta-data
		theCrystalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCrystalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CrystalPackage.eNS_URI, theCrystalPackage);
		return theCrystalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrystal() {
		return crystalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrystal_Links() {
		return (EReference)crystalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrystal_Subprograms() {
		return (EReference)crystalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprograms() {
		return subprogramsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprograms_DeclarativePart() {
		return (EReference)subprogramsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprograms_ExecutablePart() {
		return (EReference)subprogramsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedBlocks() {
		return namedBlocksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedBlocks_Name() {
		return (EAttribute)namedBlocksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedBlocks_Parameters() {
		return (EReference)namedBlocksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_ReturnPart() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousBlock() {
		return anonymousBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymousBlock_Description() {
		return (EAttribute)anonymousBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAbstractions() {
		return dataAbstractionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAbstractions_Name() {
		return (EAttribute)dataAbstractionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAbstractions_Type() {
		return (EAttribute)dataAbstractionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_ClassName() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Options() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Precision() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Scale() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollections() {
		return collectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollections_ClassName() {
		return (EAttribute)collectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollections_Code() {
		return (EAttribute)collectionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollections_TypeName() {
		return (EAttribute)collectionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecords() {
		return recordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecords_ClassName() {
		return (EAttribute)recordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecords_Code() {
		return (EAttribute)recordsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecords_TypeName() {
		return (EAttribute)recordsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursor() {
		return cursorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursor_ClassName() {
		return (EAttribute)cursorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursor_CursorQuery() {
		return (EAttribute)cursorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatements() {
		return statementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatements_Description() {
		return (EAttribute)statementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatements_IsStart() {
		return (EAttribute)statementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBlocks() {
		return callBlocksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallBlocks_NameSubroutine() {
		return (EAttribute)callBlocksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursorOperations() {
		return cursorOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCursorOperations_CursorName() {
		return (EAttribute)cursorOperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLOperations() {
		return sqlOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLOperations_Code() {
		return (EAttribute)sqlOperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationStructures() {
		return iterationStructuresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterationStructures_Interations_statements() {
		return (EReference)iterationStructuresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalStructures() {
		return conditionalStructuresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalOperations() {
		return additionalOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getException_ClassName() {
		return (EAttribute)exceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getException_Code() {
		return (EAttribute)exceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIf_ClassName() {
		return (EAttribute)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIf_Condition() {
		return (EAttribute)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_True_statements() {
		return (EReference)ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_False_statements() {
		return (EReference)ifEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_ClassName() {
		return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Options() {
		return (EReference)caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Default_statements() {
		return (EReference)caseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptions() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_ClassName() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_Condition() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_Description() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptions_Case_statements() {
		return (EReference)optionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsert() {
		return insertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsert_ClassName() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdate() {
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdate_ClassName() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelete_ClassName() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_ClassName() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhile_ClassName() {
		return (EAttribute)whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhile_Condition() {
		return (EAttribute)whileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFor() {
		return forEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_ClassName() {
		return (EAttribute)forEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_Counter() {
		return (EAttribute)forEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_TypeCounter() {
		return (EAttribute)forEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_LowestNumber() {
		return (EAttribute)forEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_HighestNumber() {
		return (EAttribute)forEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_ClassName() {
		return (EAttribute)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_BreakCondition() {
		return (EAttribute)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpen() {
		return openEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpen_ClassName() {
		return (EAttribute)openEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFetch() {
		return fetchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetch_ClassName() {
		return (EAttribute)fetchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetch_VariableName() {
		return (EAttribute)fetchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClose() {
		return closeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClose_ClassName() {
		return (EAttribute)closeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallProcedure() {
		return callProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallProcedure_ClassName() {
		return (EAttribute)callProcedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallFunction() {
		return callFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallFunction_ClassName() {
		return (EAttribute)callFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinks() {
		return linksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinks_Name() {
		return (EAttribute)linksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsTransition() {
		return optionsTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsTransition_Source() {
		return (EReference)optionsTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsTransition_Target() {
		return (EReference)optionsTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewEClass39() {
		return newEClass39EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewEClass40() {
		return newEClass40EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_ClassName() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Value() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getForCounter() {
		return forCounterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypeOptions() {
		return dataTypeOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrystalFactory getCrystalFactory() {
		return (CrystalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		crystalEClass = createEClass(CRYSTAL);
		createEReference(crystalEClass, CRYSTAL__LINKS);
		createEReference(crystalEClass, CRYSTAL__SUBPROGRAMS);

		subprogramsEClass = createEClass(SUBPROGRAMS);
		createEReference(subprogramsEClass, SUBPROGRAMS__DECLARATIVE_PART);
		createEReference(subprogramsEClass, SUBPROGRAMS__EXECUTABLE_PART);

		namedBlocksEClass = createEClass(NAMED_BLOCKS);
		createEAttribute(namedBlocksEClass, NAMED_BLOCKS__NAME);
		createEReference(namedBlocksEClass, NAMED_BLOCKS__PARAMETERS);

		procedureEClass = createEClass(PROCEDURE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RETURN_PART);

		anonymousBlockEClass = createEClass(ANONYMOUS_BLOCK);
		createEAttribute(anonymousBlockEClass, ANONYMOUS_BLOCK__DESCRIPTION);

		dataAbstractionsEClass = createEClass(DATA_ABSTRACTIONS);
		createEAttribute(dataAbstractionsEClass, DATA_ABSTRACTIONS__NAME);
		createEAttribute(dataAbstractionsEClass, DATA_ABSTRACTIONS__TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__CLASS_NAME);
		createEAttribute(dataTypeEClass, DATA_TYPE__OPTIONS);
		createEAttribute(dataTypeEClass, DATA_TYPE__PRECISION);
		createEAttribute(dataTypeEClass, DATA_TYPE__SCALE);

		collectionsEClass = createEClass(COLLECTIONS);
		createEAttribute(collectionsEClass, COLLECTIONS__CLASS_NAME);
		createEAttribute(collectionsEClass, COLLECTIONS__CODE);
		createEAttribute(collectionsEClass, COLLECTIONS__TYPE_NAME);

		recordsEClass = createEClass(RECORDS);
		createEAttribute(recordsEClass, RECORDS__CLASS_NAME);
		createEAttribute(recordsEClass, RECORDS__CODE);
		createEAttribute(recordsEClass, RECORDS__TYPE_NAME);

		cursorEClass = createEClass(CURSOR);
		createEAttribute(cursorEClass, CURSOR__CLASS_NAME);
		createEAttribute(cursorEClass, CURSOR__CURSOR_QUERY);

		statementsEClass = createEClass(STATEMENTS);
		createEAttribute(statementsEClass, STATEMENTS__DESCRIPTION);
		createEAttribute(statementsEClass, STATEMENTS__IS_START);

		callBlocksEClass = createEClass(CALL_BLOCKS);
		createEAttribute(callBlocksEClass, CALL_BLOCKS__NAME_SUBROUTINE);

		cursorOperationsEClass = createEClass(CURSOR_OPERATIONS);
		createEAttribute(cursorOperationsEClass, CURSOR_OPERATIONS__CURSOR_NAME);

		sqlOperationsEClass = createEClass(SQL_OPERATIONS);
		createEAttribute(sqlOperationsEClass, SQL_OPERATIONS__CODE);

		iterationStructuresEClass = createEClass(ITERATION_STRUCTURES);
		createEReference(iterationStructuresEClass, ITERATION_STRUCTURES__INTERATIONS_STATEMENTS);

		conditionalStructuresEClass = createEClass(CONDITIONAL_STRUCTURES);

		additionalOperationsEClass = createEClass(ADDITIONAL_OPERATIONS);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__CLASS_NAME);
		createEAttribute(expressionEClass, EXPRESSION__VALUE);

		exceptionEClass = createEClass(EXCEPTION);
		createEAttribute(exceptionEClass, EXCEPTION__CLASS_NAME);
		createEAttribute(exceptionEClass, EXCEPTION__CODE);

		ifEClass = createEClass(IF);
		createEAttribute(ifEClass, IF__CLASS_NAME);
		createEAttribute(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__TRUE_STATEMENTS);
		createEReference(ifEClass, IF__FALSE_STATEMENTS);

		caseEClass = createEClass(CASE);
		createEAttribute(caseEClass, CASE__CLASS_NAME);
		createEReference(caseEClass, CASE__OPTIONS);
		createEReference(caseEClass, CASE__DEFAULT_STATEMENTS);

		optionsEClass = createEClass(OPTIONS);
		createEAttribute(optionsEClass, OPTIONS__CLASS_NAME);
		createEAttribute(optionsEClass, OPTIONS__CONDITION);
		createEAttribute(optionsEClass, OPTIONS__DESCRIPTION);
		createEReference(optionsEClass, OPTIONS__CASE_STATEMENTS);

		insertEClass = createEClass(INSERT);
		createEAttribute(insertEClass, INSERT__CLASS_NAME);

		updateEClass = createEClass(UPDATE);
		createEAttribute(updateEClass, UPDATE__CLASS_NAME);

		deleteEClass = createEClass(DELETE);
		createEAttribute(deleteEClass, DELETE__CLASS_NAME);

		selectEClass = createEClass(SELECT);
		createEAttribute(selectEClass, SELECT__CLASS_NAME);

		whileEClass = createEClass(WHILE);
		createEAttribute(whileEClass, WHILE__CLASS_NAME);
		createEAttribute(whileEClass, WHILE__CONDITION);

		forEClass = createEClass(FOR);
		createEAttribute(forEClass, FOR__CLASS_NAME);
		createEAttribute(forEClass, FOR__COUNTER);
		createEAttribute(forEClass, FOR__TYPE_COUNTER);
		createEAttribute(forEClass, FOR__LOWEST_NUMBER);
		createEAttribute(forEClass, FOR__HIGHEST_NUMBER);

		loopEClass = createEClass(LOOP);
		createEAttribute(loopEClass, LOOP__CLASS_NAME);
		createEAttribute(loopEClass, LOOP__BREAK_CONDITION);

		openEClass = createEClass(OPEN);
		createEAttribute(openEClass, OPEN__CLASS_NAME);

		fetchEClass = createEClass(FETCH);
		createEAttribute(fetchEClass, FETCH__CLASS_NAME);
		createEAttribute(fetchEClass, FETCH__VARIABLE_NAME);

		closeEClass = createEClass(CLOSE);
		createEAttribute(closeEClass, CLOSE__CLASS_NAME);

		callProcedureEClass = createEClass(CALL_PROCEDURE);
		createEAttribute(callProcedureEClass, CALL_PROCEDURE__CLASS_NAME);

		callFunctionEClass = createEClass(CALL_FUNCTION);
		createEAttribute(callFunctionEClass, CALL_FUNCTION__CLASS_NAME);

		linksEClass = createEClass(LINKS);
		createEAttribute(linksEClass, LINKS__NAME);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);

		optionsTransitionEClass = createEClass(OPTIONS_TRANSITION);
		createEReference(optionsTransitionEClass, OPTIONS_TRANSITION__SOURCE);
		createEReference(optionsTransitionEClass, OPTIONS_TRANSITION__TARGET);

		newEClass39EClass = createEClass(NEW_ECLASS39);

		newEClass40EClass = createEClass(NEW_ECLASS40);

		// Create enums
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		forCounterEEnum = createEEnum(FOR_COUNTER);
		dataTypeOptionsEEnum = createEEnum(DATA_TYPE_OPTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedBlocksEClass.getESuperTypes().add(this.getSubprograms());
		procedureEClass.getESuperTypes().add(this.getNamedBlocks());
		functionEClass.getESuperTypes().add(this.getNamedBlocks());
		anonymousBlockEClass.getESuperTypes().add(this.getSubprograms());
		dataTypeEClass.getESuperTypes().add(this.getDataAbstractions());
		collectionsEClass.getESuperTypes().add(this.getDataAbstractions());
		recordsEClass.getESuperTypes().add(this.getDataAbstractions());
		cursorEClass.getESuperTypes().add(this.getDataAbstractions());
		callBlocksEClass.getESuperTypes().add(this.getStatements());
		cursorOperationsEClass.getESuperTypes().add(this.getStatements());
		sqlOperationsEClass.getESuperTypes().add(this.getStatements());
		iterationStructuresEClass.getESuperTypes().add(this.getStatements());
		conditionalStructuresEClass.getESuperTypes().add(this.getStatements());
		additionalOperationsEClass.getESuperTypes().add(this.getStatements());
		expressionEClass.getESuperTypes().add(this.getAdditionalOperations());
		exceptionEClass.getESuperTypes().add(this.getAdditionalOperations());
		ifEClass.getESuperTypes().add(this.getConditionalStructures());
		caseEClass.getESuperTypes().add(this.getConditionalStructures());
		insertEClass.getESuperTypes().add(this.getSQLOperations());
		updateEClass.getESuperTypes().add(this.getSQLOperations());
		deleteEClass.getESuperTypes().add(this.getSQLOperations());
		selectEClass.getESuperTypes().add(this.getSQLOperations());
		whileEClass.getESuperTypes().add(this.getIterationStructures());
		forEClass.getESuperTypes().add(this.getIterationStructures());
		loopEClass.getESuperTypes().add(this.getIterationStructures());
		openEClass.getESuperTypes().add(this.getCursorOperations());
		fetchEClass.getESuperTypes().add(this.getCursorOperations());
		closeEClass.getESuperTypes().add(this.getCursorOperations());
		callProcedureEClass.getESuperTypes().add(this.getCallBlocks());
		callFunctionEClass.getESuperTypes().add(this.getCallBlocks());
		transitionEClass.getESuperTypes().add(this.getLinks());
		optionsTransitionEClass.getESuperTypes().add(this.getLinks());

		// Initialize classes and features; add operations and parameters
		initEClass(crystalEClass, Crystal.class, "Crystal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrystal_Links(), this.getLinks(), null, "links", null, 0, -1, Crystal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrystal_Subprograms(), this.getSubprograms(), null, "subprograms", null, 0, -1, Crystal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprogramsEClass, Subprograms.class, "Subprograms", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprograms_DeclarativePart(), this.getDataAbstractions(), null, "declarativePart", null, 0, -1, Subprograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubprograms_ExecutablePart(), this.getStatements(), null, "executablePart", null, 0, -1, Subprograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedBlocksEClass, NamedBlocks.class, "NamedBlocks", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedBlocks_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedBlocks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedBlocks_Parameters(), this.getDataAbstractions(), null, "parameters", null, 0, -1, NamedBlocks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_ReturnPart(), this.getDataAbstractions(), null, "returnPart", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymousBlockEClass, AnonymousBlock.class, "AnonymousBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnonymousBlock_Description(), ecorePackage.getEString(), "description", null, 0, 1, AnonymousBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAbstractionsEClass, DataAbstractions.class, "DataAbstractions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAbstractions_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataAbstractions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAbstractions_Type(), this.getParameterType(), "type", null, 0, 1, DataAbstractions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Options(), this.getDataTypeOptions(), "options", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionsEClass, Collections.class, "Collections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollections_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Collections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollections_Code(), ecorePackage.getEString(), "code", null, 0, 1, Collections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollections_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, Collections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordsEClass, Records.class, "Records", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecords_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Records.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecords_Code(), ecorePackage.getEString(), "code", null, 0, 1, Records.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecords_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, Records.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cursorEClass, Cursor.class, "Cursor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCursor_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Cursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursor_CursorQuery(), ecorePackage.getEString(), "cursorQuery", null, 0, 1, Cursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementsEClass, Statements.class, "Statements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatements_Description(), ecorePackage.getEString(), "description", null, 0, 1, Statements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatements_IsStart(), ecorePackage.getEBoolean(), "isStart", null, 0, 1, Statements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callBlocksEClass, CallBlocks.class, "CallBlocks", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallBlocks_NameSubroutine(), ecorePackage.getEString(), "nameSubroutine", null, 0, 1, CallBlocks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cursorOperationsEClass, CursorOperations.class, "CursorOperations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCursorOperations_CursorName(), ecorePackage.getEString(), "cursorName", null, 0, 1, CursorOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlOperationsEClass, SQLOperations.class, "SQLOperations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSQLOperations_Code(), ecorePackage.getEString(), "code", null, 0, 1, SQLOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterationStructuresEClass, IterationStructures.class, "IterationStructures", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIterationStructures_Interations_statements(), this.getStatements(), null, "interations_statements", null, 0, -1, IterationStructures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStructuresEClass, ConditionalStructures.class, "ConditionalStructures", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionalOperationsEClass, AdditionalOperations.class, "AdditionalOperations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, crystal.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getException_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, crystal.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getException_Code(), ecorePackage.getEString(), "code", null, 0, 1, crystal.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIf_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIf_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_True_statements(), this.getStatements(), null, "true_statements", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_False_statements(), this.getStatements(), null, "false_statements", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCase_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_Options(), this.getOptions(), null, "options", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_Default_statements(), this.getStatements(), null, "default_statements", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptions_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptions_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptions_Description(), ecorePackage.getEString(), "description", null, 0, 1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptions_Case_statements(), this.getStatements(), null, "case_statements", null, 0, -1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertEClass, Insert.class, "Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsert_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdate_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelete_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelect_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhile_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhile_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEClass, For.class, "For", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFor_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_Counter(), ecorePackage.getEString(), "counter", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_TypeCounter(), this.getForCounter(), "typeCounter", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_LowestNumber(), ecorePackage.getEInt(), "lowestNumber", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_HighestNumber(), ecorePackage.getEInt(), "highestNumber", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoop_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_BreakCondition(), ecorePackage.getEString(), "breakCondition", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openEClass, Open.class, "Open", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpen_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fetchEClass, Fetch.class, "Fetch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFetch_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Fetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetch_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, Fetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closeEClass, Close.class, "Close", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClose_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Close.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callProcedureEClass, CallProcedure.class, "CallProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallProcedure_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, CallProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callFunctionEClass, CallFunction.class, "CallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallFunction_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linksEClass, Links.class, "Links", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinks_Name(), ecorePackage.getEString(), "name", null, 0, 1, Links.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getStatements(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getStatements(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsTransitionEClass, OptionsTransition.class, "OptionsTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionsTransition_Source(), this.getOptions(), null, "source", null, 0, 1, OptionsTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionsTransition_Target(), this.getOptions(), null, "target", null, 0, 1, OptionsTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newEClass39EClass, NewEClass39.class, "NewEClass39", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newEClass40EClass, NewEClass40.class, "NewEClass40", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.IN);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.OUT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.IN_OUT);

		initEEnum(forCounterEEnum, ForCounter.class, "ForCounter");
		addEEnumLiteral(forCounterEEnum, ForCounter.NORMAL);
		addEEnumLiteral(forCounterEEnum, ForCounter.REVERSE);

		initEEnum(dataTypeOptionsEEnum, DataTypeOptions.class, "DataTypeOptions");
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.CHAR);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.NCHAR);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.NVARCHAR2);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.VARCHAR2);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.LONG);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.RAW);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.LONG_RAW);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.NUMBER);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.NUMERIC);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.FLOAT);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.DEC);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.DECIMAL);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.INTEGER);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.INT);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.SMALLINT);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.REAL);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.DOUBLE);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.DATE);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.TIMESTAMP_WITH_TIME_ZONE);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.TIMESTAMP_WITH_LOCAL_TIME_ZONE);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.INTERVAL_YEAR_TO_MONTH);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.INTERVAL_DAY_TO_SECOND);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.BFILE);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.BLOB);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.CLOB);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.NCLOB);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.ROWID);
		addEEnumLiteral(dataTypeOptionsEEnum, DataTypeOptions.UROWID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (crystalEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "rcp", "false",
			 "onefile", "true",
			 "diagram.extension", "crystal"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (subprogramsEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle",
			 "border.width", "1",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (namedBlocksEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle",
			 "border.width", "1",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (procedureEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.text", "Procedure",
			 "border.color", "255,13,13"
		   });	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.text", "Function",
			 "border.color", "25,191,108"
		   });	
		addAnnotation
		  (anonymousBlockEClass, 
		   source, 
		   new String[] {
			 "label", "description",
			 "label.text", "Anonymous Block",
			 "border.color", "43,106,215",
			 "border.style", "dash"
		   });	
		addAnnotation
		  (dataAbstractionsEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle",
			 "border.width", "1",
			 "label.icon", "true",
			 "label.readOnly", "true",
			 "label.placement", "internal"
		   });	
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "label.text", "Data Type"
		   });	
		addAnnotation
		  (collectionsEClass, 
		   source, 
		   new String[] {
			 "label.text", "Collection"
		   });	
		addAnnotation
		  (recordsEClass, 
		   source, 
		   new String[] {
			 "label.text", "Record"
		   });	
		addAnnotation
		  (cursorEClass, 
		   source, 
		   new String[] {
			 "label.text", "Cursor"
		   });	
		addAnnotation
		  (statementsEClass, 
		   source, 
		   new String[] {
			 "label", "description",
			 "label.icon", "true",
			 "label.placement", "internal"
		   });	
		addAnnotation
		  (callBlocksEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (cursorOperationsEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (sqlOperationsEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (iterationStructuresEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (conditionalStructuresEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (additionalOperationsEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (expressionEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (exceptionEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (ifEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (caseEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (optionsEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle",
			 "label", "description",
			 "label.icon", "true",
			 "label.placement", "internal"
		   });	
		addAnnotation
		  (insertEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (updateEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (deleteEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (selectEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (whileEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (forEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (loopEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (openEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (fetchEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (closeEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (callProcedureEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (callFunctionEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getSubprograms_DeclarativePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSubprograms_ExecutablePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamedBlocks_Parameters(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunction_ReturnPart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIterationStructures_Interations_statements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIf_True_statements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIf_False_statements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCase_Options(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCase_Default_statements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOptions_Case_statements(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "incoming", "true",
			 "target.decoration", "arrow",
			 "color", "0,0,0",
			 "width", "1",
			 "label", "name",
			 "label.text", "Statement Connection",
			 "label.icon", "true"
		   });	
		addAnnotation
		  (optionsTransitionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "incoming", "true",
			 "target.decoration", "arrow",
			 "style", "dash",
			 "color", "0,0,0",
			 "width", "1",
			 "label", "name",
			 "label.text", "Case Connection",
			 "label.icon", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (newEClass40EClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });
	}

} //CrystalPackageImpl
