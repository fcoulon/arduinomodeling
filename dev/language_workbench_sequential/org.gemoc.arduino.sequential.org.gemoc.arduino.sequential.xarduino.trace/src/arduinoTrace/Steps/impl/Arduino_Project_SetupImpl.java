/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.sequential.model.arduino.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Project Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_Project_SetupImpl extends SpecificStepImpl implements Arduino_Project_Setup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_Project_SetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_PROJECT_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getCaller() {
		return (org.gemoc.sequential.model.arduino.Project) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_Project_SetupImpl
