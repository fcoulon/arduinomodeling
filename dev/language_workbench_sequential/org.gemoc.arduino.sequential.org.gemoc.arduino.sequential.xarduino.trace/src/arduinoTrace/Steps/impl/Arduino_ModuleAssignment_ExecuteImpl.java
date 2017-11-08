/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.arduino.TracedModuleAssignment;

import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Module Assignment Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_ModuleAssignment_ExecuteImpl extends SpecificStepImpl implements Arduino_ModuleAssignment_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_ModuleAssignment_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_MODULE_ASSIGNMENT_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedModuleAssignment getCaller() {
		return (arduinoTrace.States.arduino.TracedModuleAssignment) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_ModuleAssignment_ExecuteImpl
