/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.SpecificState;

import arduinoTrace.States.arduino.TracedBluetoothTransceiver;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Bluetooth Transceiver Push</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_BluetoothTransceiver_Push()
 * @model
 * @generated
 */
public interface Arduino_BluetoothTransceiver_Push extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (arduinoTrace.States.arduino.TracedBluetoothTransceiver) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedBluetoothTransceiver getCaller();

} // Arduino_BluetoothTransceiver_Push