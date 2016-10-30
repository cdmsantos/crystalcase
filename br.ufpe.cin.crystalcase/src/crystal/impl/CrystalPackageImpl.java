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
import crystal.CrystalCase;
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
import crystal.Parameters;
import crystal.Procedure;
import crystal.Records;
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
	private EClass parametersEClass = null;

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
	private EClass selectorEClass = null;

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
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorTransitionEClass = null;

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
	public EReference getCrystal_Transitions() {
		return (EReference)crystalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrystal_Procedures() {
		return (EReference)crystalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrystal_Functions() {
		return (EReference)crystalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrystal_Blocks() {
		return (EReference)crystalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrystal_SelectorTransitions() {
		return (EReference)crystalEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getSubprograms_Name() {
		return (EAttribute)subprogramsEClass.getEStructuralFeatures().get(0);
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
	public EReference getProcedure_DeclarativePart() {
		return (EReference)procedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Parameters() {
		return (EReference)procedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_ExecutablePart() {
		return (EReference)procedureEClass.getEStructuralFeatures().get(2);
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
	public EReference getFunction_DeclarativePart() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_ReturnPart() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_ExecutablePart() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
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
	public EReference getAnonymousBlock_DeclarativePart() {
		return (EReference)anonymousBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnonymousBlock_ExecutablePart() {
		return (EReference)anonymousBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters() {
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_Name() {
		return (EAttribute)parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_Type() {
		return (EAttribute)parametersEClass.getEStructuralFeatures().get(1);
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
	public EReference getIf_Ifs() {
		return (EReference)ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Elses() {
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
	public EReference getCase_Cases() {
		return (EReference)caseEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getInsert_Code() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getUpdate_Code() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDelete_Code() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSelect_Code() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelector() {
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelector_ClassName() {
		return (EAttribute)selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelector_Condition() {
		return (EAttribute)selectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelector_CaseStatements() {
		return (EReference)selectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelector_Description() {
		return (EAttribute)selectorEClass.getEStructuralFeatures().get(2);
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
	public EReference getWhile_WhileStatements() {
		return (EReference)whileEClass.getEStructuralFeatures().get(2);
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
	public EReference getFor_ForStatements() {
		return (EReference)forEClass.getEStructuralFeatures().get(5);
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
	public EReference getLoop_LoopStatements() {
		return (EReference)loopEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getOpen_CursorName() {
		return (EAttribute)openEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getFetch_CursorName() {
		return (EAttribute)fetchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetch_VariableName() {
		return (EAttribute)fetchEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getClose_CursorName() {
		return (EAttribute)closeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCallProcedure_NameSubroutine() {
		return (EAttribute)callProcedureEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCallFunction_NameSubroutine() {
		return (EAttribute)callFunctionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectorTransition() {
		return selectorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectorTransition_Name() {
		return (EAttribute)selectorTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectorTransition_Source() {
		return (EReference)selectorTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectorTransition_Target() {
		return (EReference)selectorTransitionEClass.getEStructuralFeatures().get(2);
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
		createEReference(crystalEClass, CRYSTAL__TRANSITIONS);
		createEReference(crystalEClass, CRYSTAL__PROCEDURES);
		createEReference(crystalEClass, CRYSTAL__FUNCTIONS);
		createEReference(crystalEClass, CRYSTAL__BLOCKS);
		createEReference(crystalEClass, CRYSTAL__SELECTOR_TRANSITIONS);

		subprogramsEClass = createEClass(SUBPROGRAMS);
		createEAttribute(subprogramsEClass, SUBPROGRAMS__NAME);

		procedureEClass = createEClass(PROCEDURE);
		createEReference(procedureEClass, PROCEDURE__DECLARATIVE_PART);
		createEReference(procedureEClass, PROCEDURE__PARAMETERS);
		createEReference(procedureEClass, PROCEDURE__EXECUTABLE_PART);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__DECLARATIVE_PART);
		createEReference(functionEClass, FUNCTION__PARAMETERS);
		createEReference(functionEClass, FUNCTION__RETURN_PART);
		createEReference(functionEClass, FUNCTION__EXECUTABLE_PART);

		anonymousBlockEClass = createEClass(ANONYMOUS_BLOCK);
		createEReference(anonymousBlockEClass, ANONYMOUS_BLOCK__DECLARATIVE_PART);
		createEReference(anonymousBlockEClass, ANONYMOUS_BLOCK__EXECUTABLE_PART);

		parametersEClass = createEClass(PARAMETERS);
		createEAttribute(parametersEClass, PARAMETERS__NAME);
		createEAttribute(parametersEClass, PARAMETERS__TYPE);

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

		exceptionEClass = createEClass(EXCEPTION);
		createEAttribute(exceptionEClass, EXCEPTION__CLASS_NAME);
		createEAttribute(exceptionEClass, EXCEPTION__CODE);

		ifEClass = createEClass(IF);
		createEAttribute(ifEClass, IF__CLASS_NAME);
		createEAttribute(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__IFS);
		createEReference(ifEClass, IF__ELSES);

		caseEClass = createEClass(CASE);
		createEAttribute(caseEClass, CASE__CLASS_NAME);
		createEReference(caseEClass, CASE__CASES);

		selectorEClass = createEClass(SELECTOR);
		createEAttribute(selectorEClass, SELECTOR__CLASS_NAME);
		createEAttribute(selectorEClass, SELECTOR__CONDITION);
		createEAttribute(selectorEClass, SELECTOR__DESCRIPTION);
		createEReference(selectorEClass, SELECTOR__CASE_STATEMENTS);

		insertEClass = createEClass(INSERT);
		createEAttribute(insertEClass, INSERT__CLASS_NAME);
		createEAttribute(insertEClass, INSERT__CODE);

		updateEClass = createEClass(UPDATE);
		createEAttribute(updateEClass, UPDATE__CLASS_NAME);
		createEAttribute(updateEClass, UPDATE__CODE);

		deleteEClass = createEClass(DELETE);
		createEAttribute(deleteEClass, DELETE__CLASS_NAME);
		createEAttribute(deleteEClass, DELETE__CODE);

		selectEClass = createEClass(SELECT);
		createEAttribute(selectEClass, SELECT__CLASS_NAME);
		createEAttribute(selectEClass, SELECT__CODE);

		whileEClass = createEClass(WHILE);
		createEAttribute(whileEClass, WHILE__CLASS_NAME);
		createEAttribute(whileEClass, WHILE__CONDITION);
		createEReference(whileEClass, WHILE__WHILE_STATEMENTS);

		forEClass = createEClass(FOR);
		createEAttribute(forEClass, FOR__CLASS_NAME);
		createEAttribute(forEClass, FOR__COUNTER);
		createEAttribute(forEClass, FOR__TYPE_COUNTER);
		createEAttribute(forEClass, FOR__LOWEST_NUMBER);
		createEAttribute(forEClass, FOR__HIGHEST_NUMBER);
		createEReference(forEClass, FOR__FOR_STATEMENTS);

		loopEClass = createEClass(LOOP);
		createEAttribute(loopEClass, LOOP__CLASS_NAME);
		createEAttribute(loopEClass, LOOP__BREAK_CONDITION);
		createEReference(loopEClass, LOOP__LOOP_STATEMENTS);

		openEClass = createEClass(OPEN);
		createEAttribute(openEClass, OPEN__CLASS_NAME);
		createEAttribute(openEClass, OPEN__CURSOR_NAME);

		fetchEClass = createEClass(FETCH);
		createEAttribute(fetchEClass, FETCH__CLASS_NAME);
		createEAttribute(fetchEClass, FETCH__CURSOR_NAME);
		createEAttribute(fetchEClass, FETCH__VARIABLE_NAME);

		closeEClass = createEClass(CLOSE);
		createEAttribute(closeEClass, CLOSE__CLASS_NAME);
		createEAttribute(closeEClass, CLOSE__CURSOR_NAME);

		callProcedureEClass = createEClass(CALL_PROCEDURE);
		createEAttribute(callProcedureEClass, CALL_PROCEDURE__CLASS_NAME);
		createEAttribute(callProcedureEClass, CALL_PROCEDURE__NAME_SUBROUTINE);

		callFunctionEClass = createEClass(CALL_FUNCTION);
		createEAttribute(callFunctionEClass, CALL_FUNCTION__CLASS_NAME);
		createEAttribute(callFunctionEClass, CALL_FUNCTION__NAME_SUBROUTINE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);

		selectorTransitionEClass = createEClass(SELECTOR_TRANSITION);
		createEAttribute(selectorTransitionEClass, SELECTOR_TRANSITION__NAME);
		createEReference(selectorTransitionEClass, SELECTOR_TRANSITION__SOURCE);
		createEReference(selectorTransitionEClass, SELECTOR_TRANSITION__TARGET);

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
		procedureEClass.getESuperTypes().add(this.getSubprograms());
		functionEClass.getESuperTypes().add(this.getSubprograms());
		anonymousBlockEClass.getESuperTypes().add(this.getSubprograms());
		dataTypeEClass.getESuperTypes().add(this.getParameters());
		collectionsEClass.getESuperTypes().add(this.getParameters());
		recordsEClass.getESuperTypes().add(this.getParameters());
		cursorEClass.getESuperTypes().add(this.getParameters());
		exceptionEClass.getESuperTypes().add(this.getStatements());
		ifEClass.getESuperTypes().add(this.getStatements());
		caseEClass.getESuperTypes().add(this.getStatements());
		insertEClass.getESuperTypes().add(this.getStatements());
		updateEClass.getESuperTypes().add(this.getStatements());
		deleteEClass.getESuperTypes().add(this.getStatements());
		selectEClass.getESuperTypes().add(this.getStatements());
		whileEClass.getESuperTypes().add(this.getStatements());
		forEClass.getESuperTypes().add(this.getStatements());
		loopEClass.getESuperTypes().add(this.getStatements());
		openEClass.getESuperTypes().add(this.getStatements());
		fetchEClass.getESuperTypes().add(this.getStatements());
		closeEClass.getESuperTypes().add(this.getStatements());
		callProcedureEClass.getESuperTypes().add(this.getStatements());
		callFunctionEClass.getESuperTypes().add(this.getStatements());

		// Initialize classes and features; add operations and parameters
		initEClass(crystalEClass, Crystal.class, "Crystal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrystal_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Crystal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrystal_Procedures(), this.getProcedure(), null, "procedures", null, 0, -1, Crystal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrystal_Functions(), this.getFunction(), null, "functions", null, 0, -1, Crystal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrystal_Blocks(), this.getAnonymousBlock(), null, "blocks", null, 0, -1, Crystal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrystal_SelectorTransitions(), this.getSelectorTransition(), null, "selectorTransitions", null, 0, -1, Crystal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprogramsEClass, Subprograms.class, "Subprograms", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubprograms_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subprograms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcedure_DeclarativePart(), this.getParameters(), null, "declarativePart", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedure_Parameters(), this.getParameters(), null, "parameters", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcedure_ExecutablePart(), this.getStatements(), null, "executablePart", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_DeclarativePart(), this.getParameters(), null, "declarativePart", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getParameters(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_ReturnPart(), this.getParameters(), null, "returnPart", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_ExecutablePart(), this.getStatements(), null, "executablePart", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymousBlockEClass, AnonymousBlock.class, "AnonymousBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnonymousBlock_DeclarativePart(), this.getParameters(), null, "declarativePart", null, 0, -1, AnonymousBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnonymousBlock_ExecutablePart(), this.getStatements(), null, "executablePart", null, 0, -1, AnonymousBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametersEClass, Parameters.class, "Parameters", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameters_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameters_Type(), this.getParameterType(), "type", null, 0, 1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_ClassName(), ecorePackage.getEString(), "className", "DataType", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Options(), this.getDataTypeOptions(), "options", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Precision(), ecorePackage.getEInt(), "precision", "1", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Scale(), ecorePackage.getEInt(), "scale", "0", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionsEClass, Collections.class, "Collections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollections_ClassName(), ecorePackage.getEString(), "className", "Collection", 0, 1, Collections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollections_Code(), ecorePackage.getEString(), "code", "TYPE name IS TABLE OF NUMBER INDEX BY VARCHAR2(20)", 0, 1, Collections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollections_TypeName(), ecorePackage.getEString(), "typeName", "collectionTypeName", 0, 1, Collections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordsEClass, Records.class, "Records", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecords_ClassName(), ecorePackage.getEString(), "className", "Record", 0, 1, Records.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecords_Code(), ecorePackage.getEString(), "code", "TYPE recordType IS RECORD (id number(5), name varchar2(25), lastName tableA.last_name%type)", 0, 1, Records.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecords_TypeName(), ecorePackage.getEString(), "typeName", "recordTypeName", 0, 1, Records.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cursorEClass, Cursor.class, "Cursor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCursor_ClassName(), ecorePackage.getEString(), "className", "Cursor", 0, 1, Cursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCursor_CursorQuery(), ecorePackage.getEString(), "cursorQuery", "selectStatement", 0, 1, Cursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementsEClass, Statements.class, "Statements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatements_Description(), ecorePackage.getEString(), "description", "Description", 0, 1, Statements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatements_IsStart(), ecorePackage.getEBoolean(), "isStart", null, 0, 1, Statements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, crystal.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getException_ClassName(), ecorePackage.getEString(), "className", "Exception", 0, 1, crystal.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getException_Code(), ecorePackage.getEString(), "code", "EXCEPTION WHEN no_data_found THEN DBMS_OUTPUT.PUT_LINE(\'There aren\'t data registred\')", 0, 1, crystal.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIf_ClassName(), ecorePackage.getEString(), "className", "If", 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIf_Condition(), ecorePackage.getEString(), "condition", "Type the IF condition", 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Ifs(), this.getStatements(), null, "ifs", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Elses(), this.getStatements(), null, "elses", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCase_ClassName(), ecorePackage.getEString(), "className", "Case", 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_Cases(), this.getSelector(), null, "cases", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelector_ClassName(), ecorePackage.getEString(), "className", "Selector", 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelector_Condition(), ecorePackage.getEString(), "condition", "Type the condition for this Selector", 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelector_Description(), ecorePackage.getEString(), "description", "Description", 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelector_CaseStatements(), this.getStatements(), null, "caseStatements", null, 0, -1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertEClass, Insert.class, "Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsert_ClassName(), ecorePackage.getEString(), "className", "Insert", 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsert_Code(), ecorePackage.getEString(), "code", "INSERT INTO tableA (id, name) VALUES (1, \'example\')", 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdate_ClassName(), ecorePackage.getEString(), "className", "Update", 0, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdate_Code(), ecorePackage.getEString(), "code", "UPDATE tableA SET name = \'example\' WHERE id = 1", 0, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelete_ClassName(), ecorePackage.getEString(), "className", "Delete", 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelete_Code(), ecorePackage.getEString(), "code", "DELETE FROM tableA WHERE ID = 1", 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelect_ClassName(), ecorePackage.getEString(), "className", "Select", 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Code(), ecorePackage.getEString(), "code", "SELECT * FROM tableA WHERE id = 1", 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhile_ClassName(), ecorePackage.getEString(), "className", "While", 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhile_Condition(), ecorePackage.getEString(), "condition", "Type the WHILE condition", 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhile_WhileStatements(), this.getStatements(), null, "whileStatements", null, 0, -1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEClass, For.class, "For", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFor_ClassName(), ecorePackage.getEString(), "className", "For", 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_Counter(), ecorePackage.getEString(), "counter", "Type the name of the FOR counter", 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_TypeCounter(), this.getForCounter(), "typeCounter", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_LowestNumber(), ecorePackage.getEInt(), "lowestNumber", "0", 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_HighestNumber(), ecorePackage.getEInt(), "highestNumber", "0", 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFor_ForStatements(), this.getStatements(), null, "forStatements", null, 0, -1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoop_ClassName(), ecorePackage.getEString(), "className", "Loop", 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_BreakCondition(), ecorePackage.getEString(), "breakCondition", "Type the break condition for LOOP", 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_LoopStatements(), this.getStatements(), null, "loopStatements", null, 0, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openEClass, Open.class, "Open", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpen_ClassName(), ecorePackage.getEString(), "className", "Open", 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpen_CursorName(), ecorePackage.getEString(), "cursorName", "cursorName", 0, 1, Open.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fetchEClass, Fetch.class, "Fetch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFetch_ClassName(), ecorePackage.getEString(), "className", "Fetch", 0, 1, Fetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetch_CursorName(), ecorePackage.getEString(), "cursorName", "FETCH cursorName INTO variableCursor", 0, 1, Fetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetch_VariableName(), ecorePackage.getEString(), "variableName", "FETCH cursorName INTO variableCursor", 0, 1, Fetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closeEClass, Close.class, "Close", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClose_ClassName(), ecorePackage.getEString(), "className", "Close", 0, 1, Close.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClose_CursorName(), ecorePackage.getEString(), "cursorName", "cursorName", 0, 1, Close.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callProcedureEClass, CallProcedure.class, "CallProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallProcedure_ClassName(), ecorePackage.getEString(), "className", "CallProcedure", 0, 1, CallProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallProcedure_NameSubroutine(), ecorePackage.getEString(), "nameSubroutine", null, 0, 1, CallProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callFunctionEClass, CallFunction.class, "CallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallFunction_ClassName(), ecorePackage.getEString(), "className", "CallFunction", 0, 1, CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallFunction_NameSubroutine(), ecorePackage.getEString(), "nameSubroutine", null, 0, 1, CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", "Connection", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getStatements(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getStatements(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorTransitionEClass, SelectorTransition.class, "SelectorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectorTransition_Name(), ecorePackage.getEString(), "name", "Connection", 0, 1, SelectorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectorTransition_Source(), this.getSelector(), null, "source", null, 0, 1, SelectorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectorTransition_Target(), this.getSelector(), null, "target", null, 0, 1, SelectorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "label", "name",
			 "label.text", "Anonymous Block",
			 "border.color", "43,106,215",
			 "border.style", "dash"
		   });	
		addAnnotation
		  (parametersEClass, 
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
		  (selectorEClass, 
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
		  (getProcedure_DeclarativePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProcedure_Parameters(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProcedure_ExecutablePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunction_DeclarativePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunction_Parameters(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunction_ReturnPart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunction_ExecutablePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnonymousBlock_DeclarativePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnonymousBlock_ExecutablePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIf_Ifs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIf_Elses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCase_Cases(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSelector_CaseStatements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getWhile_WhileStatements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFor_ForStatements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLoop_LoopStatements(), 
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
		  (selectorTransitionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "incoming", "true",
			 "target.decoration", "arrow",
			 "color", "0,0,0",
			 "width", "1",
			 "label", "name",
			 "label.text", "Case Connection",
			 "label.icon", "true"
		   });
	}

} //CrystalPackageImpl
