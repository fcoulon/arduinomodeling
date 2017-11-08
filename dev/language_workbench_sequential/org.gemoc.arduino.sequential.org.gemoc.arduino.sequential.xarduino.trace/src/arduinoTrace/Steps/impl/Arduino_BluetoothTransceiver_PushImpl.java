/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.arduino.TracedBluetoothTransceiver;

import arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Bluetooth Transceiver Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Arduino_BluetoothTransceiver_PushImpl extends SpecificStepImpl implements Arduino_BluetoothTransceiver_Push {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_BluetoothTransceiver_PushImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBluetoothTransceiver getCaller() {
		return (arduinoTrace.States.arduino.TracedBluetoothTransceiver) this.getMseoccurrence().getMse().getCaller();
	}

} //Arduino_BluetoothTransceiver_PushImpl
