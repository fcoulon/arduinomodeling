/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.arduino.TracedVariableDeclaration;

import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Variable Declaration Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_VariableDeclaration_ExecuteImpl extends SpecificStepImpl implements Arduino_VariableDeclaration_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_VariableDeclaration_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_VARIABLE_DECLARATION_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariableDeclaration getCaller() {
		return (arduinoTrace.States.arduino.TracedVariableDeclaration) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_VariableDeclaration_ExecuteImpl
