/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.arduino.TracedVariableAssignment;

import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Variable Assignment Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_VariableAssignment_ExecuteImpl extends SpecificStepImpl implements Arduino_VariableAssignment_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_VariableAssignment_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariableAssignment getCaller() {
		return (arduinoTrace.States.arduino.TracedVariableAssignment) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_VariableAssignment_ExecuteImpl
