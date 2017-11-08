/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.arduino.TracedModuleInstruction;

import arduinoTrace.Steps.Arduino_ModuleInstruction_Execute;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Module Instruction Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_ModuleInstruction_ExecuteImpl extends SpecificStepImpl implements Arduino_ModuleInstruction_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_ModuleInstruction_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_MODULE_INSTRUCTION_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedModuleInstruction getCaller() {
		return (arduinoTrace.States.arduino.TracedModuleInstruction) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_ModuleInstruction_ExecuteImpl
