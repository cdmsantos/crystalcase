/**
 */
package crystal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type Options</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see crystal.CrystalPackage#getDataTypeOptions()
 * @model
 * @generated
 */
public enum DataTypeOptions implements Enumerator {
	/**
	 * The '<em><b>CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(0, "CHAR", "CHAR"),

	/**
	 * The '<em><b>NCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	NCHAR(1, "NCHAR", "NCHAR"),

	/**
	 * The '<em><b>NVARCHAR2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NVARCHAR2_VALUE
	 * @generated
	 * @ordered
	 */
	NVARCHAR2(2, "NVARCHAR2", "NVARCHAR2"),

	/**
	 * The '<em><b>VARCHAR2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARCHAR2_VALUE
	 * @generated
	 * @ordered
	 */
	VARCHAR2(3, "VARCHAR2", "VARCHAR2"),

	/**
	 * The '<em><b>LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(4, "LONG", "LONG"),

	/**
	 * The '<em><b>RAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW_VALUE
	 * @generated
	 * @ordered
	 */
	RAW(5, "RAW", "RAW"),

	/**
	 * The '<em><b>LONG RAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_RAW_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_RAW(6, "LONG_RAW", "LONG_RAW"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(7, "NUMBER", "NUMBER"),

	/**
	 * The '<em><b>NUMERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC(8, "NUMERIC", "NUMERIC"),

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(9, "FLOAT", "FLOAT"),

	/**
	 * The '<em><b>DEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEC_VALUE
	 * @generated
	 * @ordered
	 */
	DEC(10, "DEC", "DEC"),

	/**
	 * The '<em><b>DECIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(11, "DECIMAL", "DECIMAL"),

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(12, "INTEGER", "INTEGER"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(13, "INT", "INT"),

	/**
	 * The '<em><b>SMALLINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLINT_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLINT(14, "SMALLINT", "SMALLINT"),

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(15, "REAL", "REAL"),

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(16, "DOUBLE", "DOUBLE"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(17, "DATE", "DATE"),

	/**
	 * The '<em><b>TIMESTAMP WITH TIME ZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_WITH_TIME_ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP_WITH_TIME_ZONE(18, "TIMESTAMP_WITH_TIME_ZONE", "TIMESTAMP_WITH_TIME_ZONE"),

	/**
	 * The '<em><b>TIMESTAMP WITH LOCAL TIME ZONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_WITH_LOCAL_TIME_ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP_WITH_LOCAL_TIME_ZONE(19, "TIMESTAMP_WITH_LOCAL_TIME_ZONE", "TIMESTAMP_WITH_LOCAL_TIME_ZONE"),

	/**
	 * The '<em><b>INTERVAL YEAR TO MONTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_YEAR_TO_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_YEAR_TO_MONTH(20, "INTERVAL_YEAR_TO_MONTH", "INTERVAL_YEAR_TO_MONTH"),

	/**
	 * The '<em><b>INTERVAL DAY TO SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_DAY_TO_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_DAY_TO_SECOND(21, "INTERVAL_DAY_TO_SECOND", "INTERVAL_DAY_TO_SECOND"),

	/**
	 * The '<em><b>BFILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BFILE_VALUE
	 * @generated
	 * @ordered
	 */
	BFILE(22, "BFILE", "BFILE"),

	/**
	 * The '<em><b>BLOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOB_VALUE
	 * @generated
	 * @ordered
	 */
	BLOB(23, "BLOB", "BLOB"),

	/**
	 * The '<em><b>CLOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOB_VALUE
	 * @generated
	 * @ordered
	 */
	CLOB(24, "CLOB", "CLOB"),

	/**
	 * The '<em><b>NCLOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCLOB_VALUE
	 * @generated
	 * @ordered
	 */
	NCLOB(25, "NCLOB", "NCLOB"),

	/**
	 * The '<em><b>ROWID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROWID_VALUE
	 * @generated
	 * @ordered
	 */
	ROWID(26, "ROWID", "ROWID"),

	/**
	 * The '<em><b>UROWID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UROWID_VALUE
	 * @generated
	 * @ordered
	 */
	UROWID(27, "UROWID", "UROWID");

	/**
	 * The '<em><b>CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 0;

	/**
	 * The '<em><b>NCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NCHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCHAR_VALUE = 1;

	/**
	 * The '<em><b>NVARCHAR2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NVARCHAR2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NVARCHAR2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NVARCHAR2_VALUE = 2;

	/**
	 * The '<em><b>VARCHAR2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARCHAR2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARCHAR2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARCHAR2_VALUE = 3;

	/**
	 * The '<em><b>LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 4;

	/**
	 * The '<em><b>RAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAW_VALUE = 5;

	/**
	 * The '<em><b>LONG RAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG RAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_RAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_RAW_VALUE = 6;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 7;

	/**
	 * The '<em><b>NUMERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMERIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_VALUE = 8;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 9;

	/**
	 * The '<em><b>DEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEC_VALUE = 10;

	/**
	 * The '<em><b>DECIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECIMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 11;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 12;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 13;

	/**
	 * The '<em><b>SMALLINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALLINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALLINT_VALUE = 14;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 15;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 16;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 17;

	/**
	 * The '<em><b>TIMESTAMP WITH TIME ZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMP WITH TIME ZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_WITH_TIME_ZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_WITH_TIME_ZONE_VALUE = 18;

	/**
	 * The '<em><b>TIMESTAMP WITH LOCAL TIME ZONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMP WITH LOCAL TIME ZONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_WITH_LOCAL_TIME_ZONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_WITH_LOCAL_TIME_ZONE_VALUE = 19;

	/**
	 * The '<em><b>INTERVAL YEAR TO MONTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERVAL YEAR TO MONTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_YEAR_TO_MONTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_YEAR_TO_MONTH_VALUE = 20;

	/**
	 * The '<em><b>INTERVAL DAY TO SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERVAL DAY TO SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_DAY_TO_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_DAY_TO_SECOND_VALUE = 21;

	/**
	 * The '<em><b>BFILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BFILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BFILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BFILE_VALUE = 22;

	/**
	 * The '<em><b>BLOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOB_VALUE = 23;

	/**
	 * The '<em><b>CLOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOB_VALUE = 24;

	/**
	 * The '<em><b>NCLOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NCLOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NCLOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCLOB_VALUE = 25;

	/**
	 * The '<em><b>ROWID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROWID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROWID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROWID_VALUE = 26;

	/**
	 * The '<em><b>UROWID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UROWID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UROWID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UROWID_VALUE = 27;

	/**
	 * An array of all the '<em><b>Data Type Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTypeOptions[] VALUES_ARRAY =
		new DataTypeOptions[] {
			CHAR,
			NCHAR,
			NVARCHAR2,
			VARCHAR2,
			LONG,
			RAW,
			LONG_RAW,
			NUMBER,
			NUMERIC,
			FLOAT,
			DEC,
			DECIMAL,
			INTEGER,
			INT,
			SMALLINT,
			REAL,
			DOUBLE,
			DATE,
			TIMESTAMP_WITH_TIME_ZONE,
			TIMESTAMP_WITH_LOCAL_TIME_ZONE,
			INTERVAL_YEAR_TO_MONTH,
			INTERVAL_DAY_TO_SECOND,
			BFILE,
			BLOB,
			CLOB,
			NCLOB,
			ROWID,
			UROWID,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTypeOptions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type Options</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeOptions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeOptions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type Options</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeOptions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeOptions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type Options</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeOptions get(int value) {
		switch (value) {
			case CHAR_VALUE: return CHAR;
			case NCHAR_VALUE: return NCHAR;
			case NVARCHAR2_VALUE: return NVARCHAR2;
			case VARCHAR2_VALUE: return VARCHAR2;
			case LONG_VALUE: return LONG;
			case RAW_VALUE: return RAW;
			case LONG_RAW_VALUE: return LONG_RAW;
			case NUMBER_VALUE: return NUMBER;
			case NUMERIC_VALUE: return NUMERIC;
			case FLOAT_VALUE: return FLOAT;
			case DEC_VALUE: return DEC;
			case DECIMAL_VALUE: return DECIMAL;
			case INTEGER_VALUE: return INTEGER;
			case INT_VALUE: return INT;
			case SMALLINT_VALUE: return SMALLINT;
			case REAL_VALUE: return REAL;
			case DOUBLE_VALUE: return DOUBLE;
			case DATE_VALUE: return DATE;
			case TIMESTAMP_WITH_TIME_ZONE_VALUE: return TIMESTAMP_WITH_TIME_ZONE;
			case TIMESTAMP_WITH_LOCAL_TIME_ZONE_VALUE: return TIMESTAMP_WITH_LOCAL_TIME_ZONE;
			case INTERVAL_YEAR_TO_MONTH_VALUE: return INTERVAL_YEAR_TO_MONTH;
			case INTERVAL_DAY_TO_SECOND_VALUE: return INTERVAL_DAY_TO_SECOND;
			case BFILE_VALUE: return BFILE;
			case BLOB_VALUE: return BLOB;
			case CLOB_VALUE: return CLOB;
			case NCLOB_VALUE: return NCLOB;
			case ROWID_VALUE: return ROWID;
			case UROWID_VALUE: return UROWID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataTypeOptions(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DataTypeOptions
