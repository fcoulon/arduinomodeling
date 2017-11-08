/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.SpecificDimension;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedAssignment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TracedAssignmentImpl extends TracedInstructionImpl implements TracedAssignment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		return result;
		
	}

} //TracedAssignmentImpl
