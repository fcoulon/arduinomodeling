/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.SpecificDimension;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedArduinoCommunicationModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Arduino Communication Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TracedArduinoCommunicationModuleImpl extends TracedArduinoDigitalModuleImpl implements TracedArduinoCommunicationModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedArduinoCommunicationModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_ARDUINO_COMMUNICATION_MODULE;
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

} //TracedArduinoCommunicationModuleImpl
