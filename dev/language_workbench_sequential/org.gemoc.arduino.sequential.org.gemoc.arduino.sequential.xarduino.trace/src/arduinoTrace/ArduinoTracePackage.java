/**
 */
package arduinoTrace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see arduinoTrace.ArduinoTraceFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoTracePackage eINSTANCE = arduinoTrace.impl.ArduinoTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.impl.SpecificTraceImpl
	 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Traced Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__TRACED_OBJECTS = TracePackage.TRACE__TRACED_OBJECTS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES = TracePackage.TRACE__STATES;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Arduino Bluetooth Transceiver Push Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arduino If Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arduino Instruction Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arduino Module Assignment Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Arduino Module Instruction Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arduino Project Setup Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Arduino Utilities Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Arduino Variable Assignment Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Arduino Variable Declaration Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 11;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see arduinoTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_BluetoothTransceiver_Push_Sequence <em>Arduino Bluetooth Transceiver Push Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Bluetooth Transceiver Push Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_BluetoothTransceiver_Push_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Delay Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Delay_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Delay_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino If Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_If_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_If_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Instruction_Execute_Sequence <em>Arduino Instruction Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Instruction Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Instruction_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Instruction_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Module Assignment Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_ModuleAssignment_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_ModuleInstruction_Execute_Sequence <em>Arduino Module Instruction Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Module Instruction Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_ModuleInstruction_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_ModuleInstruction_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Project Setup Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Project_Setup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Project_Setup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Repeat Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Repeat_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Repeat_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Utilities Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Utilities_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Utilities_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Variable Assignment Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_VariableAssignment_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Variable Declaration Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_VariableDeclaration_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoTraceFactory getArduinoTraceFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.impl.SpecificTraceImpl
		 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Arduino Bluetooth Transceiver Push Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Delay_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino If Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_If_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Instruction Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Instruction_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Module Assignment Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Module Instruction Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_ModuleInstruction_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Project Setup Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Project_Setup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Repeat_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Utilities Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Utilities_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Variable Assignment Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Variable Declaration Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence();

	}

} //ArduinoTracePackage
