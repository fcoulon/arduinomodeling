/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.SpecificState;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import org.gemoc.sequential.model.arduino.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Project Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Project_Setup()
 * @model
 * @generated
 */
public interface Arduino_Project_Setup extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.sequential.model.arduino.Project) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Project getCaller();

} // Arduino_Project_Setup
