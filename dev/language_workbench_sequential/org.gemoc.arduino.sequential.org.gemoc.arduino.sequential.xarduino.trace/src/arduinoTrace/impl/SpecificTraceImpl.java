/**
 */
package arduinoTrace.impl;

import arduinoTrace.ArduinoTracePackage;
import arduinoTrace.SpecificTrace;

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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import org.eclipse.gemoc.trace.commons.model.trace.impl.TraceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_BluetoothTransceiver_Push_Sequence <em>Arduino Bluetooth Transceiver Push Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Instruction_Execute_Sequence <em>Arduino Instruction Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_ModuleInstruction_Execute_Sequence <em>Arduino Module Instruction Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getArduino_BluetoothTransceiver_Push_Sequence() <em>Arduino Bluetooth Transceiver Push Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_BluetoothTransceiver_Push_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_BluetoothTransceiver_Push> arduino_BluetoothTransceiver_Push_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Delay_Execute_Sequence() <em>Arduino Delay Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Delay_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Delay_Execute> arduino_Delay_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_If_Execute_Sequence() <em>Arduino If Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_If_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_If_Execute> arduino_If_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Instruction_Execute_Sequence() <em>Arduino Instruction Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Instruction_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Instruction_Execute> arduino_Instruction_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_ModuleAssignment_Execute_Sequence() <em>Arduino Module Assignment Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_ModuleAssignment_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_ModuleAssignment_Execute> arduino_ModuleAssignment_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_ModuleInstruction_Execute_Sequence() <em>Arduino Module Instruction Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_ModuleInstruction_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_ModuleInstruction_Execute> arduino_ModuleInstruction_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Project_Setup_Sequence() <em>Arduino Project Setup Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Project_Setup_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Project_Setup> arduino_Project_Setup_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Repeat_Execute_Sequence() <em>Arduino Repeat Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Repeat_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Repeat_Execute> arduino_Repeat_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Utilities_Execute_Sequence() <em>Arduino Utilities Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Utilities_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Utilities_Execute> arduino_Utilities_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_VariableAssignment_Execute_Sequence() <em>Arduino Variable Assignment Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_VariableAssignment_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableAssignment_Execute> arduino_VariableAssignment_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_VariableDeclaration_Execute_Sequence() <em>Arduino Variable Declaration Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_VariableDeclaration_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableDeclaration_Execute> arduino_VariableDeclaration_Execute_Sequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<? extends SpecificStep, ? extends SpecificState> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>> getTracedObjects() {
		if (tracedObjects == null) {
			tracedObjects = new EObjectContainmentEList<SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>>(SpecificTracedObject.class, this, ArduinoTracePackage.SPECIFIC_TRACE__TRACED_OBJECTS);
		}
		return tracedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SpecificState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<SpecificState>(SpecificState.class, this, ArduinoTracePackage.SPECIFIC_TRACE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_BluetoothTransceiver_Push> getArduino_BluetoothTransceiver_Push_Sequence() {
		if (arduino_BluetoothTransceiver_Push_Sequence == null) {
			arduino_BluetoothTransceiver_Push_Sequence = new EObjectResolvingEList<Arduino_BluetoothTransceiver_Push>(Arduino_BluetoothTransceiver_Push.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE);
		}
		return arduino_BluetoothTransceiver_Push_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Sequence() {
		if (arduino_Delay_Execute_Sequence == null) {
			arduino_Delay_Execute_Sequence = new EObjectResolvingEList<Arduino_Delay_Execute>(Arduino_Delay_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE);
		}
		return arduino_Delay_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_If_Execute> getArduino_If_Execute_Sequence() {
		if (arduino_If_Execute_Sequence == null) {
			arduino_If_Execute_Sequence = new EObjectResolvingEList<Arduino_If_Execute>(Arduino_If_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE);
		}
		return arduino_If_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Instruction_Execute> getArduino_Instruction_Execute_Sequence() {
		if (arduino_Instruction_Execute_Sequence == null) {
			arduino_Instruction_Execute_Sequence = new EObjectResolvingEList<Arduino_Instruction_Execute>(Arduino_Instruction_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE);
		}
		return arduino_Instruction_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_ModuleAssignment_Execute> getArduino_ModuleAssignment_Execute_Sequence() {
		if (arduino_ModuleAssignment_Execute_Sequence == null) {
			arduino_ModuleAssignment_Execute_Sequence = new EObjectResolvingEList<Arduino_ModuleAssignment_Execute>(Arduino_ModuleAssignment_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE);
		}
		return arduino_ModuleAssignment_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_ModuleInstruction_Execute> getArduino_ModuleInstruction_Execute_Sequence() {
		if (arduino_ModuleInstruction_Execute_Sequence == null) {
			arduino_ModuleInstruction_Execute_Sequence = new EObjectResolvingEList<Arduino_ModuleInstruction_Execute>(Arduino_ModuleInstruction_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE);
		}
		return arduino_ModuleInstruction_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Project_Setup> getArduino_Project_Setup_Sequence() {
		if (arduino_Project_Setup_Sequence == null) {
			arduino_Project_Setup_Sequence = new EObjectResolvingEList<Arduino_Project_Setup>(Arduino_Project_Setup.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE);
		}
		return arduino_Project_Setup_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Sequence() {
		if (arduino_Repeat_Execute_Sequence == null) {
			arduino_Repeat_Execute_Sequence = new EObjectResolvingEList<Arduino_Repeat_Execute>(Arduino_Repeat_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE);
		}
		return arduino_Repeat_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Utilities_Execute> getArduino_Utilities_Execute_Sequence() {
		if (arduino_Utilities_Execute_Sequence == null) {
			arduino_Utilities_Execute_Sequence = new EObjectResolvingEList<Arduino_Utilities_Execute>(Arduino_Utilities_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE);
		}
		return arduino_Utilities_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_VariableAssignment_Execute> getArduino_VariableAssignment_Execute_Sequence() {
		if (arduino_VariableAssignment_Execute_Sequence == null) {
			arduino_VariableAssignment_Execute_Sequence = new EObjectResolvingEList<Arduino_VariableAssignment_Execute>(Arduino_VariableAssignment_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE);
		}
		return arduino_VariableAssignment_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_VariableDeclaration_Execute> getArduino_VariableDeclaration_Execute_Sequence() {
		if (arduino_VariableDeclaration_Execute_Sequence == null) {
			arduino_VariableDeclaration_Execute_Sequence = new EObjectResolvingEList<Arduino_VariableDeclaration_Execute>(Arduino_VariableDeclaration_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE);
		}
		return arduino_VariableDeclaration_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				return getArduino_BluetoothTransceiver_Push_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return getArduino_Delay_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return getArduino_If_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE:
				return getArduino_Instruction_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_ModuleAssignment_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE:
				return getArduino_ModuleInstruction_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return getArduino_Project_Setup_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return getArduino_Repeat_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				return getArduino_Utilities_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_VariableAssignment_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return getArduino_VariableDeclaration_Execute_Sequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				getArduino_BluetoothTransceiver_Push_Sequence().clear();
				getArduino_BluetoothTransceiver_Push_Sequence().addAll((Collection<? extends Arduino_BluetoothTransceiver_Push>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				getArduino_Delay_Execute_Sequence().addAll((Collection<? extends Arduino_Delay_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				getArduino_If_Execute_Sequence().addAll((Collection<? extends Arduino_If_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE:
				getArduino_Instruction_Execute_Sequence().clear();
				getArduino_Instruction_Execute_Sequence().addAll((Collection<? extends Arduino_Instruction_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				getArduino_ModuleAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_ModuleAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE:
				getArduino_ModuleInstruction_Execute_Sequence().clear();
				getArduino_ModuleInstruction_Execute_Sequence().addAll((Collection<? extends Arduino_ModuleInstruction_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				getArduino_Project_Setup_Sequence().addAll((Collection<? extends Arduino_Project_Setup>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				getArduino_Repeat_Execute_Sequence().addAll((Collection<? extends Arduino_Repeat_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				getArduino_Utilities_Execute_Sequence().clear();
				getArduino_Utilities_Execute_Sequence().addAll((Collection<? extends Arduino_Utilities_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				getArduino_VariableAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_VariableAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				getArduino_VariableDeclaration_Execute_Sequence().addAll((Collection<? extends Arduino_VariableDeclaration_Execute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				getArduino_BluetoothTransceiver_Push_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE:
				getArduino_Instruction_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE:
				getArduino_ModuleInstruction_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				getArduino_Utilities_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				return arduino_BluetoothTransceiver_Push_Sequence != null && !arduino_BluetoothTransceiver_Push_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return arduino_Delay_Execute_Sequence != null && !arduino_Delay_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return arduino_If_Execute_Sequence != null && !arduino_If_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE:
				return arduino_Instruction_Execute_Sequence != null && !arduino_Instruction_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_ModuleAssignment_Execute_Sequence != null && !arduino_ModuleAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE:
				return arduino_ModuleInstruction_Execute_Sequence != null && !arduino_ModuleInstruction_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return arduino_Project_Setup_Sequence != null && !arduino_Project_Setup_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return arduino_Repeat_Execute_Sequence != null && !arduino_Repeat_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				return arduino_Utilities_Execute_Sequence != null && !arduino_Utilities_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_VariableAssignment_Execute_Sequence != null && !arduino_VariableAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return arduino_VariableDeclaration_Execute_Sequence != null && !arduino_VariableDeclaration_Execute_Sequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
