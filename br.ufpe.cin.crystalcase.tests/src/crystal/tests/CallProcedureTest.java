/**
 */
package crystal.tests;

import crystal.CallProcedure;
import crystal.CrystalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Procedure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallProcedureTest extends CallBlocksTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallProcedureTest.class);
	}

	/**
	 * Constructs a new Call Procedure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallProcedureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Procedure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallProcedure getFixture() {
		return (CallProcedure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CrystalFactory.eINSTANCE.createCallProcedure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CallProcedureTest
