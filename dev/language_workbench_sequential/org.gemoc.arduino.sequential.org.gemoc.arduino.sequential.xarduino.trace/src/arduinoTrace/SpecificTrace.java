/**
 */
package arduinoTrace;

import arduinoTrace.States.SpecificDimension;
import arduinoTrace.States.SpecificState;
import arduinoTrace.States.SpecificTracedObject;
import arduinoTrace.States.SpecificValue;

import arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push;
import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_Instruction_Execute;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_ModuleInstruction_Execute;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
import arduinoTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_BluetoothTransceiver_Push_Sequence <em>Arduino Bluetooth Transceiver Push Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Instruction_Execute_Sequence <em>Arduino Instruction Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_ModuleInstruction_Execute_Sequence <em>Arduino Module Instruction Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> {
	/**
	 * Returns the value of the '<em><b>Arduino Bluetooth Transceiver Push Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Bluetooth Transceiver Push Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Bluetooth Transceiver Push Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_BluetoothTransceiver_Push> getArduino_BluetoothTransceiver_Push_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Delay_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Delay Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Delay Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Delay_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino If Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_If_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino If Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino If Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_If_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_If_Execute> getArduino_If_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Instruction Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Instruction_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Instruction Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Instruction Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Instruction_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Instruction_Execute> getArduino_Instruction_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Module Assignment Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Module Assignment Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Module Assignment Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_ModuleAssignment_Execute> getArduino_ModuleAssignment_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Module Instruction Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_ModuleInstruction_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Module Instruction Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Module Instruction Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_ModuleInstruction_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_ModuleInstruction_Execute> getArduino_ModuleInstruction_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Project Setup Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Project_Setup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Project Setup Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Project Setup Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Project_Setup_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Project_Setup> getArduino_Project_Setup_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Repeat_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Repeat Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Repeat Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Repeat_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Utilities Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Utilities_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Utilities Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Utilities Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Utilities_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Utilities_Execute> getArduino_Utilities_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Variable Assignment Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Variable Assignment Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Variable Assignment Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_VariableAssignment_Execute> getArduino_VariableAssignment_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Variable Declaration Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Variable Declaration Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Variable Declaration Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_VariableDeclaration_Execute> getArduino_VariableDeclaration_Execute_Sequence();

} // SpecificTrace
