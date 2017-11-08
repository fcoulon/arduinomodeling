/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.SpecificState;

import arduinoTrace.States.arduino.TracedIf;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino If Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_If_Execute()
 * @model
 * @generated
 */
public interface Arduino_If_Execute extends SpecificStep, SequentialStep<Arduino_If_Execute_AbstractSubStep, SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (arduinoTrace.States.arduino.TracedIf) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedIf getCaller();

} // Arduino_If_Execute
