/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.SpecificState;

import arduinoTrace.States.arduino.TracedDelay;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Delay Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Delay_Execute()
 * @model
 * @generated
 */
public interface Arduino_Delay_Execute extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (arduinoTrace.States.arduino.TracedDelay) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedDelay getCaller();

} // Arduino_Delay_Execute
