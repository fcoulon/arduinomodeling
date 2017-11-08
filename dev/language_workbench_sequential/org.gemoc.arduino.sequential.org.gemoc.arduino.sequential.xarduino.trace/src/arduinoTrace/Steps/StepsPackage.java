/**
 */
package arduinoTrace.Steps;

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
 * @see arduinoTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = arduinoTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.SpecificStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 19;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_BluetoothTransceiver_PushImpl <em>Arduino Bluetooth Transceiver Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_BluetoothTransceiver_PushImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_BluetoothTransceiver_Push()
	 * @generated
	 */
	int ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Bluetooth Transceiver Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl <em>Arduino Delay Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute()
	 * @generated
	 */
	int ARDUINO_DELAY_EXECUTE = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl <em>Arduino If Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arduino If Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep <em>Arduino If Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino If Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl <em>Arduino If Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino If Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Instruction_ExecuteImpl <em>Arduino Instruction Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Instruction_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Instruction_Execute()
	 * @generated
	 */
	int ARDUINO_INSTRUCTION_EXECUTE = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE__MSEOCCURRENCE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE__SUB_STEPS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arduino Instruction Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.Arduino_Instruction_Execute_AbstractSubStep <em>Arduino Instruction Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.Arduino_Instruction_Execute_AbstractSubStep
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Instruction_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Instruction Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Instruction_Execute_ImplicitStepImpl <em>Arduino Instruction Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Instruction_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Instruction_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_IMPLICIT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Instruction Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INSTRUCTION_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl <em>Arduino Module Assignment Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleInstruction_ExecuteImpl <em>Arduino Module Instruction Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleInstruction_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleInstruction_Execute()
	 * @generated
	 */
	int ARDUINO_MODULE_INSTRUCTION_EXECUTE = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_INSTRUCTION_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_INSTRUCTION_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_INSTRUCTION_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Module Instruction Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_INSTRUCTION_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Project_SetupImpl <em>Arduino Project Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Project_SetupImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Project_Setup()
	 * @generated
	 */
	int ARDUINO_PROJECT_SETUP = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Project Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl <em>Arduino Repeat Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arduino Repeat Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep <em>Arduino Repeat Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Repeat Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl <em>Arduino Repeat Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Repeat Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl <em>Arduino Utilities Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Execute()
	 * @generated
	 */
	int ARDUINO_UTILITIES_EXECUTE = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Utilities Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl <em>Arduino Variable Assignment Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute()
	 * @generated
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Variable Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl <em>Arduino Variable Declaration Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute()
	 * @generated
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Variable Declaration Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.RootImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 17;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = TracePackage.SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = TracePackage.SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.SpecificRootStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
	 * @generated
	 */
	int SPECIFIC_ROOT_STEP = 18;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__MSEOCCURRENCE = TracePackage.SEQUENTIAL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__STARTING_STATE = TracePackage.SEQUENTIAL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__ENDING_STATE = TracePackage.SEQUENTIAL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__SUB_STEPS = TracePackage.SEQUENTIAL_STEP__SUB_STEPS;

	/**
	 * The number of structural features of the '<em>Specific Root Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP_FEATURE_COUNT = TracePackage.SEQUENTIAL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push <em>Arduino Bluetooth Transceiver Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Bluetooth Transceiver Push</em>'.
	 * @see arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push
	 * @generated
	 */
	EClass getArduino_BluetoothTransceiver_Push();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Delay_Execute <em>Arduino Delay Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Delay Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute
	 * @generated
	 */
	EClass getArduino_Delay_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute <em>Arduino If Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute
	 * @generated
	 */
	EClass getArduino_If_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep <em>Arduino If Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_If_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep <em>Arduino If Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_If_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Instruction_Execute <em>Arduino Instruction Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Instruction Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Instruction_Execute
	 * @generated
	 */
	EClass getArduino_Instruction_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Instruction_Execute_AbstractSubStep <em>Arduino Instruction Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Instruction Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Instruction_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_Instruction_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Instruction_Execute_ImplicitStep <em>Arduino Instruction Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Instruction Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Instruction_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_Instruction_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute <em>Arduino Module Assignment Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleInstruction_Execute <em>Arduino Module Instruction Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Instruction Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleInstruction_Execute
	 * @generated
	 */
	EClass getArduino_ModuleInstruction_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Project_Setup <em>Arduino Project Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Project Setup</em>'.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup
	 * @generated
	 */
	EClass getArduino_Project_Setup();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute <em>Arduino Repeat Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Repeat Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute
	 * @generated
	 */
	EClass getArduino_Repeat_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep <em>Arduino Repeat Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Repeat Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_Repeat_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_ImplicitStep <em>Arduino Repeat Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Repeat Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_Repeat_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Utilities_Execute <em>Arduino Utilities Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Utilities Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Execute
	 * @generated
	 */
	EClass getArduino_Utilities_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute <em>Arduino Variable Assignment Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Assignment Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute
	 * @generated
	 */
	EClass getArduino_VariableAssignment_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute <em>Arduino Variable Declaration Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Declaration Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute
	 * @generated
	 */
	EClass getArduino_VariableDeclaration_Execute();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see arduinoTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.SpecificRootStep <em>Specific Root Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Root Step</em>'.
	 * @see arduinoTrace.Steps.SpecificRootStep
	 * @generated
	 */
	EClass getSpecificRootStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see arduinoTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_BluetoothTransceiver_PushImpl <em>Arduino Bluetooth Transceiver Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_BluetoothTransceiver_PushImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_BluetoothTransceiver_Push()
		 * @generated
		 */
		EClass ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH = eINSTANCE.getArduino_BluetoothTransceiver_Push();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl <em>Arduino Delay Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute()
		 * @generated
		 */
		EClass ARDUINO_DELAY_EXECUTE = eINSTANCE.getArduino_Delay_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl <em>Arduino If Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute()
		 * @generated
		 */
		EClass ARDUINO_IF_EXECUTE = eINSTANCE.getArduino_If_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep <em>Arduino If Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_If_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl <em>Arduino If Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_IF_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_If_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Instruction_ExecuteImpl <em>Arduino Instruction Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Instruction_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Instruction_Execute()
		 * @generated
		 */
		EClass ARDUINO_INSTRUCTION_EXECUTE = eINSTANCE.getArduino_Instruction_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.Arduino_Instruction_Execute_AbstractSubStep <em>Arduino Instruction Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.Arduino_Instruction_Execute_AbstractSubStep
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Instruction_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_Instruction_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Instruction_Execute_ImplicitStepImpl <em>Arduino Instruction Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Instruction_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Instruction_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_INSTRUCTION_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_Instruction_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl <em>Arduino Module Assignment Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_EXECUTE = eINSTANCE.getArduino_ModuleAssignment_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleInstruction_ExecuteImpl <em>Arduino Module Instruction Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleInstruction_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleInstruction_Execute()
		 * @generated
		 */
		EClass ARDUINO_MODULE_INSTRUCTION_EXECUTE = eINSTANCE.getArduino_ModuleInstruction_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Project_SetupImpl <em>Arduino Project Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Project_SetupImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Project_Setup()
		 * @generated
		 */
		EClass ARDUINO_PROJECT_SETUP = eINSTANCE.getArduino_Project_Setup();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl <em>Arduino Repeat Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute()
		 * @generated
		 */
		EClass ARDUINO_REPEAT_EXECUTE = eINSTANCE.getArduino_Repeat_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep <em>Arduino Repeat Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_Repeat_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl <em>Arduino Repeat Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_Repeat_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl <em>Arduino Utilities Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Execute()
		 * @generated
		 */
		EClass ARDUINO_UTILITIES_EXECUTE = eINSTANCE.getArduino_Utilities_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl <em>Arduino Variable Assignment Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE = eINSTANCE.getArduino_VariableAssignment_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl <em>Arduino Variable Declaration Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_DECLARATION_EXECUTE = eINSTANCE.getArduino_VariableDeclaration_Execute();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.RootImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.SpecificRootStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
		 * @generated
		 */
		EClass SPECIFIC_ROOT_STEP = eINSTANCE.getSpecificRootStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.SpecificStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

	}

} //StepsPackage
