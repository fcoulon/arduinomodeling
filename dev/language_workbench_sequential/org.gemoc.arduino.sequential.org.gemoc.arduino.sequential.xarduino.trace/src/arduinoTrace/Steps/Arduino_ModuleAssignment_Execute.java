/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.SpecificState;

import arduinoTrace.States.arduino.TracedModuleAssignment;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Module Assignment Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_ModuleAssignment_Execute()
 * @model
 * @generated
 */
public interface Arduino_ModuleAssignment_Execute extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (arduinoTrace.States.arduino.TracedModuleAssignment) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedModuleAssignment getCaller();

} // Arduino_ModuleAssignment_Execute
