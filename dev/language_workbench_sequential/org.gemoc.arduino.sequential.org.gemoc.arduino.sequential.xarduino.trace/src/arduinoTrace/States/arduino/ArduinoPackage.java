/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.StatesPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see arduinoTrace.States.arduino.ArduinoFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_arduino";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoPackage eINSTANCE = arduinoTrace.States.arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedNamedElementImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedModuleImpl <em>Traced Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModule()
	 * @generated
	 */
	int TRACED_MODULE = 22;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl <em>Traced Arduino Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoModule()
	 * @generated
	 */
	int TRACED_ARDUINO_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_MODULE__DIMENSIONS = TRACED_MODULE__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Arduino Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_MODULE_FEATURE_COUNT = TRACED_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl <em>Traced Arduino Analog Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoAnalogModule()
	 * @generated
	 */
	int TRACED_ARDUINO_ANALOG_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_ANALOG_MODULE__DIMENSIONS = TRACED_ARDUINO_MODULE__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Arduino Analog Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT = TRACED_ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl <em>Traced Ambient Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAmbientLightSensor()
	 * @generated
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR__DIMENSIONS = TRACED_ARDUINO_ANALOG_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Ambient Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPin()
	 * @generated
	 */
	int TRACED_PIN = 27;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Pin level Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN__PIN_LEVEL_DIMENSION = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedAnalogPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
	 * @generated
	 */
	int TRACED_ANALOG_PIN = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__DIMENSIONS = TRACED_PIN__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Pin level Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__PIN_LEVEL_DIMENSION = TRACED_PIN__PIN_LEVEL_DIMENSION;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBoardImpl <em>Traced Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBoardImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBoard()
	 * @generated
	 */
	int TRACED_BOARD = 9;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOARD__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOARD_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl <em>Traced Arduino Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoBoard()
	 * @generated
	 */
	int TRACED_ARDUINO_BOARD = 3;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_BOARD__DIMENSIONS = TRACED_BOARD__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_BOARD__ORIGINAL_OBJECT = TRACED_BOARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Arduino Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_BOARD_FEATURE_COUNT = TRACED_BOARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl <em>Traced Arduino Digital Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoDigitalModule()
	 * @generated
	 */
	int TRACED_ARDUINO_DIGITAL_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS = TRACED_ARDUINO_MODULE__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Arduino Digital Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT = TRACED_ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl <em>Traced Arduino Communication Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoCommunicationModule()
	 * @generated
	 */
	int TRACED_ARDUINO_COMMUNICATION_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_COMMUNICATION_MODULE__DIMENSIONS = TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Arduino Communication Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_COMMUNICATION_MODULE_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedInstructionImpl <em>Traced Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedInstructionImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedInstruction()
	 * @generated
	 */
	int TRACED_INSTRUCTION = 18;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTRUCTION__DIMENSIONS = StatesPackage.SPECIFIC_TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTRUCTION_FEATURE_COUNT = StatesPackage.SPECIFIC_TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedAssignmentImpl <em>Traced Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedAssignmentImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAssignment()
	 * @generated
	 */
	int TRACED_ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSIGNMENT__DIMENSIONS = TRACED_INSTRUCTION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ASSIGNMENT_FEATURE_COUNT = TRACED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl <em>Traced Bluetooth Transceiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBluetoothTransceiver()
	 * @generated
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER = 8;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER__DIMENSIONS = TRACED_ARDUINO_ANALOG_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Bluetooth Transceiver data Received Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bluetooth Transceiver data To Send Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced Bluetooth Transceiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 34;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanVariable()
	 * @generated
	 */
	int TRACED_BOOLEAN_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__DIMENSIONS = TRACED_VARIABLE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Boolean Variable value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBuzzerImpl <em>Traced Buzzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBuzzerImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBuzzer()
	 * @generated
	 */
	int TRACED_BUZZER = 11;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUZZER__DIMENSIONS = TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUZZER__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUZZER_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedControlImpl <em>Traced Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedControlImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedControl()
	 * @generated
	 */
	int TRACED_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL__DIMENSIONS = TRACED_INSTRUCTION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_CONTROL_FEATURE_COUNT = TRACED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedUtilitiesImpl <em>Traced Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedUtilitiesImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedUtilities()
	 * @generated
	 */
	int TRACED_UTILITIES = 33;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_UTILITIES__DIMENSIONS = TRACED_INSTRUCTION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_UTILITIES_FEATURE_COUNT = TRACED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedDelayImpl <em>Traced Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedDelayImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDelay()
	 * @generated
	 */
	int TRACED_DELAY = 13;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY__DIMENSIONS = TRACED_UTILITIES__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY__ORIGINAL_OBJECT = TRACED_UTILITIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY_FEATURE_COUNT = TRACED_UTILITIES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedDigitalPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
	 * @generated
	 */
	int TRACED_DIGITAL_PIN = 14;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__DIMENSIONS = TRACED_PIN__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Pin level Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__PIN_LEVEL_DIMENSION = TRACED_PIN__PIN_LEVEL_DIMENSION;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedFanImpl <em>Traced Fan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedFanImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedFan()
	 * @generated
	 */
	int TRACED_FAN = 15;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FAN__DIMENSIONS = TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FAN__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Fan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FAN_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedIfImpl <em>Traced If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedIfImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIf()
	 * @generated
	 */
	int TRACED_IF = 16;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IF__DIMENSIONS = TRACED_CONTROL__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IF__ORIGINAL_OBJECT = TRACED_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_IF_FEATURE_COUNT = TRACED_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl <em>Traced Infra Red Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedInfraRedSensor()
	 * @generated
	 */
	int TRACED_INFRA_RED_SENSOR = 17;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFRA_RED_SENSOR__DIMENSIONS = TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFRA_RED_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Infra Red Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFRA_RED_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerVariable()
	 * @generated
	 */
	int TRACED_INTEGER_VARIABLE = 19;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__DIMENSIONS = TRACED_VARIABLE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Integer Variable value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedLEDImpl <em>Traced LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedLEDImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedLED()
	 * @generated
	 */
	int TRACED_LED = 20;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LED__DIMENSIONS = TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LED__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LED_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedMicroServoImpl <em>Traced Micro Servo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedMicroServoImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMicroServo()
	 * @generated
	 */
	int TRACED_MICRO_SERVO = 21;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MICRO_SERVO__DIMENSIONS = TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MICRO_SERVO__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Micro Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MICRO_SERVO_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedModuleInstructionImpl <em>Traced Module Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedModuleInstructionImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModuleInstruction()
	 * @generated
	 */
	int TRACED_MODULE_INSTRUCTION = 24;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_INSTRUCTION__DIMENSIONS = TRACED_INSTRUCTION__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Traced Module Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_INSTRUCTION_FEATURE_COUNT = TRACED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedModuleAssignmentImpl <em>Traced Module Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedModuleAssignmentImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModuleAssignment()
	 * @generated
	 */
	int TRACED_MODULE_ASSIGNMENT = 23;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_ASSIGNMENT__DIMENSIONS = TRACED_MODULE_INSTRUCTION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_ASSIGNMENT__ORIGINAL_OBJECT = TRACED_MODULE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Module Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_ASSIGNMENT_FEATURE_COUNT = TRACED_MODULE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl <em>Traced Music Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMusicPlayer()
	 * @generated
	 */
	int TRACED_MUSIC_PLAYER = 25;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MUSIC_PLAYER__DIMENSIONS = TRACED_ARDUINO_ANALOG_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MUSIC_PLAYER__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Music Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MUSIC_PLAYER_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedPushButtonImpl <em>Traced Push Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedPushButtonImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPushButton()
	 * @generated
	 */
	int TRACED_PUSH_BUTTON = 28;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PUSH_BUTTON__DIMENSIONS = TRACED_ARDUINO_DIGITAL_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PUSH_BUTTON__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Push Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PUSH_BUTTON_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedRepeatImpl <em>Traced Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedRepeatImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedRepeat()
	 * @generated
	 */
	int TRACED_REPEAT = 29;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPEAT__DIMENSIONS = TRACED_CONTROL__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPEAT__ORIGINAL_OBJECT = TRACED_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat iDimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPEAT__REPEAT_IDIMENSION = TRACED_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_REPEAT_FEATURE_COUNT = TRACED_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedRotationSensorImpl <em>Traced Rotation Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedRotationSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedRotationSensor()
	 * @generated
	 */
	int TRACED_ROTATION_SENSOR = 30;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ROTATION_SENSOR__DIMENSIONS = TRACED_ARDUINO_ANALOG_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ROTATION_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Rotation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ROTATION_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedSketchImpl <em>Traced Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedSketchImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSketch()
	 * @generated
	 */
	int TRACED_SKETCH = 31;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SKETCH__DIMENSIONS = TRACED_NAMED_ELEMENT__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SKETCH__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SKETCH_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedSoundSensorImpl <em>Traced Sound Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedSoundSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSoundSensor()
	 * @generated
	 */
	int TRACED_SOUND_SENSOR = 32;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SOUND_SENSOR__DIMENSIONS = TRACED_ARDUINO_ANALOG_MODULE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SOUND_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Sound Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SOUND_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedVariableAssignmentImpl <em>Traced Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedVariableAssignmentImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariableAssignment()
	 * @generated
	 */
	int TRACED_VARIABLE_ASSIGNMENT = 35;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ASSIGNMENT__DIMENSIONS = TRACED_INSTRUCTION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ASSIGNMENT__ORIGINAL_OBJECT = TRACED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_ASSIGNMENT_FEATURE_COUNT = TRACED_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedVariableDeclarationImpl <em>Traced Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedVariableDeclarationImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariableDeclaration()
	 * @generated
	 */
	int TRACED_VARIABLE_DECLARATION = 36;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_DECLARATION__DIMENSIONS = TRACED_INSTRUCTION__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_DECLARATION__ORIGINAL_OBJECT = TRACED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_DECLARATION_FEATURE_COUNT = TRACED_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedWhileImpl <em>Traced While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedWhileImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedWhile()
	 * @generated
	 */
	int TRACED_WHILE = 37;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WHILE__DIMENSIONS = TRACED_CONTROL__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WHILE__ORIGINAL_OBJECT = TRACED_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_WHILE_FEATURE_COUNT = TRACED_CONTROL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedAmbientLightSensor <em>Traced Ambient Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Ambient Light Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedAmbientLightSensor
	 * @generated
	 */
	EClass getTracedAmbientLightSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedAmbientLightSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedAmbientLightSensor#getOriginalObject()
	 * @see #getTracedAmbientLightSensor()
	 * @generated
	 */
	EReference getTracedAmbientLightSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedAnalogPin <em>Traced Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Analog Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin
	 * @generated
	 */
	EClass getTracedAnalogPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject()
	 * @see #getTracedAnalogPin()
	 * @generated
	 */
	EReference getTracedAnalogPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoAnalogModule <em>Traced Arduino Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Analog Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoAnalogModule
	 * @generated
	 */
	EClass getTracedArduinoAnalogModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoBoard <em>Traced Arduino Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Board</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoBoard
	 * @generated
	 */
	EClass getTracedArduinoBoard();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedArduinoBoard#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoBoard#getOriginalObject()
	 * @see #getTracedArduinoBoard()
	 * @generated
	 */
	EReference getTracedArduinoBoard_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoCommunicationModule <em>Traced Arduino Communication Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Communication Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoCommunicationModule
	 * @generated
	 */
	EClass getTracedArduinoCommunicationModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoDigitalModule <em>Traced Arduino Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Digital Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoDigitalModule
	 * @generated
	 */
	EClass getTracedArduinoDigitalModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoModule <em>Traced Arduino Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoModule
	 * @generated
	 */
	EClass getTracedArduinoModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedAssignment <em>Traced Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Assignment</em>'.
	 * @see arduinoTrace.States.arduino.TracedAssignment
	 * @generated
	 */
	EClass getTracedAssignment();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver <em>Traced Bluetooth Transceiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Bluetooth Transceiver</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver
	 * @generated
	 */
	EClass getTracedBluetoothTransceiver();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataReceived_Dimension <em>Bluetooth Transceiver data Received Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bluetooth Transceiver data Received Dimension</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataReceived_Dimension()
	 * @see #getTracedBluetoothTransceiver()
	 * @generated
	 */
	EReference getTracedBluetoothTransceiver_BluetoothTransceiver_dataReceived_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataToSend_Dimension <em>Bluetooth Transceiver data To Send Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bluetooth Transceiver data To Send Dimension</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataToSend_Dimension()
	 * @see #getTracedBluetoothTransceiver()
	 * @generated
	 */
	EReference getTracedBluetoothTransceiver_BluetoothTransceiver_dataToSend_Dimension();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject()
	 * @see #getTracedBluetoothTransceiver()
	 * @generated
	 */
	EReference getTracedBluetoothTransceiver_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBoard <em>Traced Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Board</em>'.
	 * @see arduinoTrace.States.arduino.TracedBoard
	 * @generated
	 */
	EClass getTracedBoard();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBooleanVariable <em>Traced Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable
	 * @generated
	 */
	EClass getTracedBooleanVariable();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getBooleanVariable_value_Dimension <em>Boolean Variable value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Variable value Dimension</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable#getBooleanVariable_value_Dimension()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_BooleanVariable_value_Dimension();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBuzzer <em>Traced Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Buzzer</em>'.
	 * @see arduinoTrace.States.arduino.TracedBuzzer
	 * @generated
	 */
	EClass getTracedBuzzer();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedBuzzer#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedBuzzer#getOriginalObject()
	 * @see #getTracedBuzzer()
	 * @generated
	 */
	EReference getTracedBuzzer_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedControl <em>Traced Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Control</em>'.
	 * @see arduinoTrace.States.arduino.TracedControl
	 * @generated
	 */
	EClass getTracedControl();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedDelay <em>Traced Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Delay</em>'.
	 * @see arduinoTrace.States.arduino.TracedDelay
	 * @generated
	 */
	EClass getTracedDelay();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedDelay#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedDelay#getOriginalObject()
	 * @see #getTracedDelay()
	 * @generated
	 */
	EReference getTracedDelay_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedDigitalPin <em>Traced Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Digital Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin
	 * @generated
	 */
	EClass getTracedDigitalPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedDigitalPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin#getOriginalObject()
	 * @see #getTracedDigitalPin()
	 * @generated
	 */
	EReference getTracedDigitalPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedFan <em>Traced Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Fan</em>'.
	 * @see arduinoTrace.States.arduino.TracedFan
	 * @generated
	 */
	EClass getTracedFan();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedFan#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedFan#getOriginalObject()
	 * @see #getTracedFan()
	 * @generated
	 */
	EReference getTracedFan_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedIf <em>Traced If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced If</em>'.
	 * @see arduinoTrace.States.arduino.TracedIf
	 * @generated
	 */
	EClass getTracedIf();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedIf#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedIf#getOriginalObject()
	 * @see #getTracedIf()
	 * @generated
	 */
	EReference getTracedIf_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedInfraRedSensor <em>Traced Infra Red Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Infra Red Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedInfraRedSensor
	 * @generated
	 */
	EClass getTracedInfraRedSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedInfraRedSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedInfraRedSensor#getOriginalObject()
	 * @see #getTracedInfraRedSensor()
	 * @generated
	 */
	EReference getTracedInfraRedSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedInstruction <em>Traced Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Instruction</em>'.
	 * @see arduinoTrace.States.arduino.TracedInstruction
	 * @generated
	 */
	EClass getTracedInstruction();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedIntegerVariable <em>Traced Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable
	 * @generated
	 */
	EClass getTracedIntegerVariable();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getIntegerVariable_value_Dimension <em>Integer Variable value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Variable value Dimension</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable#getIntegerVariable_value_Dimension()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_IntegerVariable_value_Dimension();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedLED <em>Traced LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced LED</em>'.
	 * @see arduinoTrace.States.arduino.TracedLED
	 * @generated
	 */
	EClass getTracedLED();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedLED#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedLED#getOriginalObject()
	 * @see #getTracedLED()
	 * @generated
	 */
	EReference getTracedLED_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedMicroServo <em>Traced Micro Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Micro Servo</em>'.
	 * @see arduinoTrace.States.arduino.TracedMicroServo
	 * @generated
	 */
	EClass getTracedMicroServo();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedMicroServo#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedMicroServo#getOriginalObject()
	 * @see #getTracedMicroServo()
	 * @generated
	 */
	EReference getTracedMicroServo_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedModule <em>Traced Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedModule
	 * @generated
	 */
	EClass getTracedModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedModuleAssignment <em>Traced Module Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Module Assignment</em>'.
	 * @see arduinoTrace.States.arduino.TracedModuleAssignment
	 * @generated
	 */
	EClass getTracedModuleAssignment();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedModuleAssignment#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedModuleAssignment#getOriginalObject()
	 * @see #getTracedModuleAssignment()
	 * @generated
	 */
	EReference getTracedModuleAssignment_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedModuleInstruction <em>Traced Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Module Instruction</em>'.
	 * @see arduinoTrace.States.arduino.TracedModuleInstruction
	 * @generated
	 */
	EClass getTracedModuleInstruction();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedMusicPlayer <em>Traced Music Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Music Player</em>'.
	 * @see arduinoTrace.States.arduino.TracedMusicPlayer
	 * @generated
	 */
	EClass getTracedMusicPlayer();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedMusicPlayer#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedMusicPlayer#getOriginalObject()
	 * @see #getTracedMusicPlayer()
	 * @generated
	 */
	EReference getTracedMusicPlayer_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see arduinoTrace.States.arduino.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedPin <em>Traced Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedPin
	 * @generated
	 */
	EClass getTracedPin();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoTrace.States.arduino.TracedPin#getPin_level_Dimension <em>Pin level Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pin level Dimension</em>'.
	 * @see arduinoTrace.States.arduino.TracedPin#getPin_level_Dimension()
	 * @see #getTracedPin()
	 * @generated
	 */
	EReference getTracedPin_Pin_level_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedPushButton <em>Traced Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Push Button</em>'.
	 * @see arduinoTrace.States.arduino.TracedPushButton
	 * @generated
	 */
	EClass getTracedPushButton();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedPushButton#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedPushButton#getOriginalObject()
	 * @see #getTracedPushButton()
	 * @generated
	 */
	EReference getTracedPushButton_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedRepeat <em>Traced Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Repeat</em>'.
	 * @see arduinoTrace.States.arduino.TracedRepeat
	 * @generated
	 */
	EClass getTracedRepeat();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedRepeat#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedRepeat#getOriginalObject()
	 * @see #getTracedRepeat()
	 * @generated
	 */
	EReference getTracedRepeat_OriginalObject();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoTrace.States.arduino.TracedRepeat#getRepeat_i_Dimension <em>Repeat iDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat iDimension</em>'.
	 * @see arduinoTrace.States.arduino.TracedRepeat#getRepeat_i_Dimension()
	 * @see #getTracedRepeat()
	 * @generated
	 */
	EReference getTracedRepeat_Repeat_i_Dimension();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedRotationSensor <em>Traced Rotation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Rotation Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedRotationSensor
	 * @generated
	 */
	EClass getTracedRotationSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedRotationSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedRotationSensor#getOriginalObject()
	 * @see #getTracedRotationSensor()
	 * @generated
	 */
	EReference getTracedRotationSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedSketch <em>Traced Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Sketch</em>'.
	 * @see arduinoTrace.States.arduino.TracedSketch
	 * @generated
	 */
	EClass getTracedSketch();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedSketch#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedSketch#getOriginalObject()
	 * @see #getTracedSketch()
	 * @generated
	 */
	EReference getTracedSketch_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedSoundSensor <em>Traced Sound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Sound Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedSoundSensor
	 * @generated
	 */
	EClass getTracedSoundSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedSoundSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedSoundSensor#getOriginalObject()
	 * @see #getTracedSoundSensor()
	 * @generated
	 */
	EReference getTracedSoundSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedUtilities <em>Traced Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Utilities</em>'.
	 * @see arduinoTrace.States.arduino.TracedUtilities
	 * @generated
	 */
	EClass getTracedUtilities();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedVariableAssignment <em>Traced Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable Assignment</em>'.
	 * @see arduinoTrace.States.arduino.TracedVariableAssignment
	 * @generated
	 */
	EClass getTracedVariableAssignment();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedVariableAssignment#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedVariableAssignment#getOriginalObject()
	 * @see #getTracedVariableAssignment()
	 * @generated
	 */
	EReference getTracedVariableAssignment_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedVariableDeclaration <em>Traced Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable Declaration</em>'.
	 * @see arduinoTrace.States.arduino.TracedVariableDeclaration
	 * @generated
	 */
	EClass getTracedVariableDeclaration();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedVariableDeclaration#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedVariableDeclaration#getOriginalObject()
	 * @see #getTracedVariableDeclaration()
	 * @generated
	 */
	EReference getTracedVariableDeclaration_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedWhile <em>Traced While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced While</em>'.
	 * @see arduinoTrace.States.arduino.TracedWhile
	 * @generated
	 */
	EClass getTracedWhile();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedWhile#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedWhile#getOriginalObject()
	 * @see #getTracedWhile()
	 * @generated
	 */
	EReference getTracedWhile_OriginalObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoFactory getArduinoFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl <em>Traced Ambient Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAmbientLightSensor()
		 * @generated
		 */
		EClass TRACED_AMBIENT_LIGHT_SENSOR = eINSTANCE.getTracedAmbientLightSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_AMBIENT_LIGHT_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedAmbientLightSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedAnalogPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
		 * @generated
		 */
		EClass TRACED_ANALOG_PIN = eINSTANCE.getTracedAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ANALOG_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedAnalogPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl <em>Traced Arduino Analog Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoAnalogModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_ANALOG_MODULE = eINSTANCE.getTracedArduinoAnalogModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl <em>Traced Arduino Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoBoard()
		 * @generated
		 */
		EClass TRACED_ARDUINO_BOARD = eINSTANCE.getTracedArduinoBoard();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ARDUINO_BOARD__ORIGINAL_OBJECT = eINSTANCE.getTracedArduinoBoard_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl <em>Traced Arduino Communication Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoCommunicationModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_COMMUNICATION_MODULE = eINSTANCE.getTracedArduinoCommunicationModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl <em>Traced Arduino Digital Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoDigitalModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_DIGITAL_MODULE = eINSTANCE.getTracedArduinoDigitalModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl <em>Traced Arduino Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_MODULE = eINSTANCE.getTracedArduinoModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedAssignmentImpl <em>Traced Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedAssignmentImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAssignment()
		 * @generated
		 */
		EClass TRACED_ASSIGNMENT = eINSTANCE.getTracedAssignment();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl <em>Traced Bluetooth Transceiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBluetoothTransceiver()
		 * @generated
		 */
		EClass TRACED_BLUETOOTH_TRANSCEIVER = eINSTANCE.getTracedBluetoothTransceiver();

		/**
		 * The meta object literal for the '<em><b>Bluetooth Transceiver data Received Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION = eINSTANCE.getTracedBluetoothTransceiver_BluetoothTransceiver_dataReceived_Dimension();

		/**
		 * The meta object literal for the '<em><b>Bluetooth Transceiver data To Send Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION = eINSTANCE.getTracedBluetoothTransceiver_BluetoothTransceiver_dataToSend_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT = eINSTANCE.getTracedBluetoothTransceiver_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBoardImpl <em>Traced Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBoardImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBoard()
		 * @generated
		 */
		EClass TRACED_BOARD = eINSTANCE.getTracedBoard();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanVariable()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VARIABLE = eINSTANCE.getTracedBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Boolean Variable value Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION = eINSTANCE.getTracedBooleanVariable_BooleanVariable_value_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanVariable_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBuzzerImpl <em>Traced Buzzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBuzzerImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBuzzer()
		 * @generated
		 */
		EClass TRACED_BUZZER = eINSTANCE.getTracedBuzzer();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BUZZER__ORIGINAL_OBJECT = eINSTANCE.getTracedBuzzer_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedControlImpl <em>Traced Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedControlImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedControl()
		 * @generated
		 */
		EClass TRACED_CONTROL = eINSTANCE.getTracedControl();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedDelayImpl <em>Traced Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedDelayImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDelay()
		 * @generated
		 */
		EClass TRACED_DELAY = eINSTANCE.getTracedDelay();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DELAY__ORIGINAL_OBJECT = eINSTANCE.getTracedDelay_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedDigitalPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
		 * @generated
		 */
		EClass TRACED_DIGITAL_PIN = eINSTANCE.getTracedDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedDigitalPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedFanImpl <em>Traced Fan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedFanImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedFan()
		 * @generated
		 */
		EClass TRACED_FAN = eINSTANCE.getTracedFan();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FAN__ORIGINAL_OBJECT = eINSTANCE.getTracedFan_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedIfImpl <em>Traced If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedIfImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIf()
		 * @generated
		 */
		EClass TRACED_IF = eINSTANCE.getTracedIf();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_IF__ORIGINAL_OBJECT = eINSTANCE.getTracedIf_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl <em>Traced Infra Red Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedInfraRedSensor()
		 * @generated
		 */
		EClass TRACED_INFRA_RED_SENSOR = eINSTANCE.getTracedInfraRedSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INFRA_RED_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedInfraRedSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedInstructionImpl <em>Traced Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedInstructionImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedInstruction()
		 * @generated
		 */
		EClass TRACED_INSTRUCTION = eINSTANCE.getTracedInstruction();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerVariable()
		 * @generated
		 */
		EClass TRACED_INTEGER_VARIABLE = eINSTANCE.getTracedIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Integer Variable value Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION = eINSTANCE.getTracedIntegerVariable_IntegerVariable_value_Dimension();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedIntegerVariable_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedLEDImpl <em>Traced LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedLEDImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedLED()
		 * @generated
		 */
		EClass TRACED_LED = eINSTANCE.getTracedLED();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_LED__ORIGINAL_OBJECT = eINSTANCE.getTracedLED_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedMicroServoImpl <em>Traced Micro Servo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedMicroServoImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMicroServo()
		 * @generated
		 */
		EClass TRACED_MICRO_SERVO = eINSTANCE.getTracedMicroServo();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MICRO_SERVO__ORIGINAL_OBJECT = eINSTANCE.getTracedMicroServo_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedModuleImpl <em>Traced Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModule()
		 * @generated
		 */
		EClass TRACED_MODULE = eINSTANCE.getTracedModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedModuleAssignmentImpl <em>Traced Module Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedModuleAssignmentImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModuleAssignment()
		 * @generated
		 */
		EClass TRACED_MODULE_ASSIGNMENT = eINSTANCE.getTracedModuleAssignment();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MODULE_ASSIGNMENT__ORIGINAL_OBJECT = eINSTANCE.getTracedModuleAssignment_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedModuleInstructionImpl <em>Traced Module Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedModuleInstructionImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModuleInstruction()
		 * @generated
		 */
		EClass TRACED_MODULE_INSTRUCTION = eINSTANCE.getTracedModuleInstruction();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl <em>Traced Music Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMusicPlayer()
		 * @generated
		 */
		EClass TRACED_MUSIC_PLAYER = eINSTANCE.getTracedMusicPlayer();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MUSIC_PLAYER__ORIGINAL_OBJECT = eINSTANCE.getTracedMusicPlayer_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedNamedElementImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPin()
		 * @generated
		 */
		EClass TRACED_PIN = eINSTANCE.getTracedPin();

		/**
		 * The meta object literal for the '<em><b>Pin level Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PIN__PIN_LEVEL_DIMENSION = eINSTANCE.getTracedPin_Pin_level_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedPushButtonImpl <em>Traced Push Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedPushButtonImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPushButton()
		 * @generated
		 */
		EClass TRACED_PUSH_BUTTON = eINSTANCE.getTracedPushButton();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PUSH_BUTTON__ORIGINAL_OBJECT = eINSTANCE.getTracedPushButton_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedRepeatImpl <em>Traced Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedRepeatImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedRepeat()
		 * @generated
		 */
		EClass TRACED_REPEAT = eINSTANCE.getTracedRepeat();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_REPEAT__ORIGINAL_OBJECT = eINSTANCE.getTracedRepeat_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Repeat iDimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_REPEAT__REPEAT_IDIMENSION = eINSTANCE.getTracedRepeat_Repeat_i_Dimension();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedRotationSensorImpl <em>Traced Rotation Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedRotationSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedRotationSensor()
		 * @generated
		 */
		EClass TRACED_ROTATION_SENSOR = eINSTANCE.getTracedRotationSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ROTATION_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedRotationSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedSketchImpl <em>Traced Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedSketchImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSketch()
		 * @generated
		 */
		EClass TRACED_SKETCH = eINSTANCE.getTracedSketch();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SKETCH__ORIGINAL_OBJECT = eINSTANCE.getTracedSketch_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedSoundSensorImpl <em>Traced Sound Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedSoundSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSoundSensor()
		 * @generated
		 */
		EClass TRACED_SOUND_SENSOR = eINSTANCE.getTracedSoundSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SOUND_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedSoundSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedUtilitiesImpl <em>Traced Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedUtilitiesImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedUtilities()
		 * @generated
		 */
		EClass TRACED_UTILITIES = eINSTANCE.getTracedUtilities();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedVariableAssignmentImpl <em>Traced Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedVariableAssignmentImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariableAssignment()
		 * @generated
		 */
		EClass TRACED_VARIABLE_ASSIGNMENT = eINSTANCE.getTracedVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE_ASSIGNMENT__ORIGINAL_OBJECT = eINSTANCE.getTracedVariableAssignment_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedVariableDeclarationImpl <em>Traced Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedVariableDeclarationImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariableDeclaration()
		 * @generated
		 */
		EClass TRACED_VARIABLE_DECLARATION = eINSTANCE.getTracedVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE_DECLARATION__ORIGINAL_OBJECT = eINSTANCE.getTracedVariableDeclaration_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedWhileImpl <em>Traced While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedWhileImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedWhile()
		 * @generated
		 */
		EClass TRACED_WHILE = eINSTANCE.getTracedWhile();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_WHILE__ORIGINAL_OBJECT = eINSTANCE.getTracedWhile_OriginalObject();

	}

} //ArduinoPackage
