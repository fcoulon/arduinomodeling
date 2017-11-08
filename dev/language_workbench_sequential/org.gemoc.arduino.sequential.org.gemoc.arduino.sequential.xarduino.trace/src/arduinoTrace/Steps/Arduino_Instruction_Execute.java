/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.SpecificState;

import arduinoTrace.States.arduino.TracedInstruction;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Instruction Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Instruction_Execute()
 * @model
 * @generated
 */
public interface Arduino_Instruction_Execute extends Arduino_If_Execute_AbstractSubStep, Arduino_Repeat_Execute_AbstractSubStep, SpecificStep, SequentialStep<Arduino_Instruction_Execute_AbstractSubStep, SpecificState>, Arduino_Instruction_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (arduinoTrace.States.arduino.TracedInstruction) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedInstruction getCaller();

} // Arduino_Instruction_Execute
