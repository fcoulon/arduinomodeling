/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.SpecificState;

import arduinoTrace.States.arduino.TracedRepeat;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Repeat Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Repeat_Execute()
 * @model
 * @generated
 */
public interface Arduino_Repeat_Execute extends SpecificStep, SequentialStep<Arduino_Repeat_Execute_AbstractSubStep, SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (arduinoTrace.States.arduino.TracedRepeat) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedRepeat getCaller();

} // Arduino_Repeat_Execute
