/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.arduino.TracedUtilities;

import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Utilities Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_Utilities_ExecuteImpl extends SpecificStepImpl implements Arduino_Utilities_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_Utilities_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_UTILITIES_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedUtilities getCaller() {
		return (arduinoTrace.States.arduino.TracedUtilities) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_Utilities_ExecuteImpl
