/**
 */
package arduinoTrace.States;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

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
 * @see arduinoTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = arduinoTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.SpecificDimensionImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificDimension()
	 * @generated
	 */
	int SPECIFIC_DIMENSION = 13;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION__VALUES = TracePackage.DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Specific Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION_FEATURE_COUNT = TracePackage.DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_DimensionImpl <em>Bluetooth Transceiver data Received Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_DimensionImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataReceived_Dimension()
	 * @generated
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Bluetooth Transceiver data Received Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.SpecificValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificValue()
	 * @generated
	 */
	int SPECIFIC_VALUE = 17;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE__STATES = TracePackage.VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE_FEATURE_COUNT = TracePackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.SpecificAttributeValue
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
	 * @generated
	 */
	int SPECIFIC_ATTRIBUTE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl <em>Bluetooth Transceiver data Received Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataReceived_Value()
	 * @generated
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Data Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bluetooth Transceiver data Received Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_DimensionImpl <em>Bluetooth Transceiver data To Send Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_DimensionImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataToSend_Dimension()
	 * @generated
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Bluetooth Transceiver data To Send Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl <em>Bluetooth Transceiver data To Send Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataToSend_Value()
	 * @generated
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Data To Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bluetooth Transceiver data To Send Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BooleanVariable_value_DimensionImpl <em>Boolean Variable value Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BooleanVariable_value_DimensionImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanVariable_value_Dimension()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_VALUE_DIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Boolean Variable value Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BooleanVariable_value_ValueImpl <em>Boolean Variable value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BooleanVariable_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanVariable_value_Value()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE__VALUE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.IntegerVariable_value_DimensionImpl <em>Integer Variable value Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.IntegerVariable_value_DimensionImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getIntegerVariable_value_Dimension()
	 * @generated
	 */
	int INTEGER_VARIABLE_VALUE_DIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Integer Variable value Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.IntegerVariable_value_ValueImpl <em>Integer Variable value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.IntegerVariable_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getIntegerVariable_value_Value()
	 * @generated
	 */
	int INTEGER_VARIABLE_VALUE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE__VALUE = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.Pin_level_DimensionImpl <em>Pin level Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.Pin_level_DimensionImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Dimension()
	 * @generated
	 */
	int PIN_LEVEL_DIMENSION = 8;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Pin level Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.Pin_level_ValueImpl <em>Pin level Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.Pin_level_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Value()
	 * @generated
	 */
	int PIN_LEVEL_VALUE = 9;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__LEVEL = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pin level Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.Repeat_i_DimensionImpl <em>Repeat iDimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.Repeat_i_DimensionImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getRepeat_i_Dimension()
	 * @generated
	 */
	int REPEAT_IDIMENSION = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_IDIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Repeat iDimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_IDIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.Repeat_i_ValueImpl <em>Repeat iValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.Repeat_i_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getRepeat_i_Value()
	 * @generated
	 */
	int REPEAT_IVALUE = 11;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_IVALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_IVALUE__I = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat iValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_IVALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.SpecificReferenceValue
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
	 * @generated
	 */
	int SPECIFIC_REFERENCE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.SpecificStateImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificState()
	 * @generated
	 */
	int SPECIFIC_STATE = 15;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__STARTED_STEPS = TracePackage.STATE__STARTED_STEPS;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__ENDED_STEPS = TracePackage.STATE__ENDED_STEPS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__VALUES = TracePackage.STATE__VALUES;

	/**
	 * The number of structural features of the '<em>Specific State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE_FEATURE_COUNT = TracePackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.SpecificTracedObjectImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
	 * @generated
	 */
	int SPECIFIC_TRACED_OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT__DIMENSIONS = TracePackage.TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Specific Traced Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT_FEATURE_COUNT = TracePackage.TRACED_OBJECT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Dimension <em>Bluetooth Transceiver data Received Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Transceiver data Received Dimension</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Dimension
	 * @generated
	 */
	EClass getBluetoothTransceiver_dataReceived_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value <em>Bluetooth Transceiver data Received Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Transceiver data Received Value</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value
	 * @generated
	 */
	EClass getBluetoothTransceiver_dataReceived_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getDataReceived <em>Data Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Received</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getDataReceived()
	 * @see #getBluetoothTransceiver_dataReceived_Value()
	 * @generated
	 */
	EAttribute getBluetoothTransceiver_dataReceived_Value_DataReceived();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Dimension <em>Bluetooth Transceiver data To Send Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Transceiver data To Send Dimension</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Dimension
	 * @generated
	 */
	EClass getBluetoothTransceiver_dataToSend_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value <em>Bluetooth Transceiver data To Send Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Transceiver data To Send Value</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value
	 * @generated
	 */
	EClass getBluetoothTransceiver_dataToSend_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getDataToSend <em>Data To Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data To Send</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getDataToSend()
	 * @see #getBluetoothTransceiver_dataToSend_Value()
	 * @generated
	 */
	EAttribute getBluetoothTransceiver_dataToSend_Value_DataToSend();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BooleanVariable_value_Dimension <em>Boolean Variable value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable value Dimension</em>'.
	 * @see arduinoTrace.States.BooleanVariable_value_Dimension
	 * @generated
	 */
	EClass getBooleanVariable_value_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BooleanVariable_value_Value <em>Boolean Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable value Value</em>'.
	 * @see arduinoTrace.States.BooleanVariable_value_Value
	 * @generated
	 */
	EClass getBooleanVariable_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.BooleanVariable_value_Value#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoTrace.States.BooleanVariable_value_Value#isValue()
	 * @see #getBooleanVariable_value_Value()
	 * @generated
	 */
	EAttribute getBooleanVariable_value_Value_Value();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.IntegerVariable_value_Dimension <em>Integer Variable value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable value Dimension</em>'.
	 * @see arduinoTrace.States.IntegerVariable_value_Dimension
	 * @generated
	 */
	EClass getIntegerVariable_value_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.IntegerVariable_value_Value <em>Integer Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable value Value</em>'.
	 * @see arduinoTrace.States.IntegerVariable_value_Value
	 * @generated
	 */
	EClass getIntegerVariable_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.IntegerVariable_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoTrace.States.IntegerVariable_value_Value#getValue()
	 * @see #getIntegerVariable_value_Value()
	 * @generated
	 */
	EAttribute getIntegerVariable_value_Value_Value();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Pin_level_Dimension <em>Pin level Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin level Dimension</em>'.
	 * @see arduinoTrace.States.Pin_level_Dimension
	 * @generated
	 */
	EClass getPin_level_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Pin_level_Value <em>Pin level Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin level Value</em>'.
	 * @see arduinoTrace.States.Pin_level_Value
	 * @generated
	 */
	EClass getPin_level_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.Pin_level_Value#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see arduinoTrace.States.Pin_level_Value#getLevel()
	 * @see #getPin_level_Value()
	 * @generated
	 */
	EAttribute getPin_level_Value_Level();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Repeat_i_Dimension <em>Repeat iDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat iDimension</em>'.
	 * @see arduinoTrace.States.Repeat_i_Dimension
	 * @generated
	 */
	EClass getRepeat_i_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Repeat_i_Value <em>Repeat iValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat iValue</em>'.
	 * @see arduinoTrace.States.Repeat_i_Value
	 * @generated
	 */
	EClass getRepeat_i_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.Repeat_i_Value#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I</em>'.
	 * @see arduinoTrace.States.Repeat_i_Value#getI()
	 * @see #getRepeat_i_Value()
	 * @generated
	 */
	EAttribute getRepeat_i_Value_I();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Attribute Value</em>'.
	 * @see arduinoTrace.States.SpecificAttributeValue
	 * @generated
	 */
	EClass getSpecificAttributeValue();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Dimension</em>'.
	 * @see arduinoTrace.States.SpecificDimension
	 * @generated
	 */
	EClass getSpecificDimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Reference Value</em>'.
	 * @see arduinoTrace.States.SpecificReferenceValue
	 * @generated
	 */
	EClass getSpecificReferenceValue();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific State</em>'.
	 * @see arduinoTrace.States.SpecificState
	 * @generated
	 */
	EClass getSpecificState();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Traced Object</em>'.
	 * @see arduinoTrace.States.SpecificTracedObject
	 * @generated
	 */
	EClass getSpecificTracedObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Value</em>'.
	 * @see arduinoTrace.States.SpecificValue
	 * @generated
	 */
	EClass getSpecificValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_DimensionImpl <em>Bluetooth Transceiver data Received Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_DimensionImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataReceived_Dimension()
		 * @generated
		 */
		EClass BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION = eINSTANCE.getBluetoothTransceiver_dataReceived_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl <em>Bluetooth Transceiver data Received Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataReceived_Value()
		 * @generated
		 */
		EClass BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE = eINSTANCE.getBluetoothTransceiver_dataReceived_Value();

		/**
		 * The meta object literal for the '<em><b>Data Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED = eINSTANCE.getBluetoothTransceiver_dataReceived_Value_DataReceived();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_DimensionImpl <em>Bluetooth Transceiver data To Send Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_DimensionImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataToSend_Dimension()
		 * @generated
		 */
		EClass BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION = eINSTANCE.getBluetoothTransceiver_dataToSend_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl <em>Bluetooth Transceiver data To Send Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataToSend_Value()
		 * @generated
		 */
		EClass BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE = eINSTANCE.getBluetoothTransceiver_dataToSend_Value();

		/**
		 * The meta object literal for the '<em><b>Data To Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND = eINSTANCE.getBluetoothTransceiver_dataToSend_Value_DataToSend();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BooleanVariable_value_DimensionImpl <em>Boolean Variable value Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BooleanVariable_value_DimensionImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanVariable_value_Dimension()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_VALUE_DIMENSION = eINSTANCE.getBooleanVariable_value_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BooleanVariable_value_ValueImpl <em>Boolean Variable value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BooleanVariable_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanVariable_value_Value()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_VALUE_VALUE = eINSTANCE.getBooleanVariable_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE_VALUE_VALUE__VALUE = eINSTANCE.getBooleanVariable_value_Value_Value();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.IntegerVariable_value_DimensionImpl <em>Integer Variable value Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.IntegerVariable_value_DimensionImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getIntegerVariable_value_Dimension()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_VALUE_DIMENSION = eINSTANCE.getIntegerVariable_value_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.IntegerVariable_value_ValueImpl <em>Integer Variable value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.IntegerVariable_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getIntegerVariable_value_Value()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_VALUE_VALUE = eINSTANCE.getIntegerVariable_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VARIABLE_VALUE_VALUE__VALUE = eINSTANCE.getIntegerVariable_value_Value_Value();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.Pin_level_DimensionImpl <em>Pin level Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.Pin_level_DimensionImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Dimension()
		 * @generated
		 */
		EClass PIN_LEVEL_DIMENSION = eINSTANCE.getPin_level_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.Pin_level_ValueImpl <em>Pin level Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.Pin_level_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Value()
		 * @generated
		 */
		EClass PIN_LEVEL_VALUE = eINSTANCE.getPin_level_Value();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_LEVEL_VALUE__LEVEL = eINSTANCE.getPin_level_Value_Level();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.Repeat_i_DimensionImpl <em>Repeat iDimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.Repeat_i_DimensionImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getRepeat_i_Dimension()
		 * @generated
		 */
		EClass REPEAT_IDIMENSION = eINSTANCE.getRepeat_i_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.Repeat_i_ValueImpl <em>Repeat iValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.Repeat_i_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getRepeat_i_Value()
		 * @generated
		 */
		EClass REPEAT_IVALUE = eINSTANCE.getRepeat_i_Value();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_IVALUE__I = eINSTANCE.getRepeat_i_Value_I();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.SpecificAttributeValue
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
		 * @generated
		 */
		EClass SPECIFIC_ATTRIBUTE_VALUE = eINSTANCE.getSpecificAttributeValue();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.SpecificDimensionImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificDimension()
		 * @generated
		 */
		EClass SPECIFIC_DIMENSION = eINSTANCE.getSpecificDimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.SpecificReferenceValue
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
		 * @generated
		 */
		EClass SPECIFIC_REFERENCE_VALUE = eINSTANCE.getSpecificReferenceValue();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.SpecificStateImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificState()
		 * @generated
		 */
		EClass SPECIFIC_STATE = eINSTANCE.getSpecificState();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.SpecificTracedObjectImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
		 * @generated
		 */
		EClass SPECIFIC_TRACED_OBJECT = eINSTANCE.getSpecificTracedObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.SpecificValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getSpecificValue()
		 * @generated
		 */
		EClass SPECIFIC_VALUE = eINSTANCE.getSpecificValue();

	}

} //StatesPackage
