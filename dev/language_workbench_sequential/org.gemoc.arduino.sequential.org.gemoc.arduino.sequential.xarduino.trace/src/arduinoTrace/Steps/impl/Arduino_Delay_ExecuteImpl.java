/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.arduino.TracedDelay;

import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Delay Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_Delay_ExecuteImpl extends SpecificStepImpl implements Arduino_Delay_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_Delay_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_DELAY_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDelay getCaller() {
		return (arduinoTrace.States.arduino.TracedDelay) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_Delay_ExecuteImpl
