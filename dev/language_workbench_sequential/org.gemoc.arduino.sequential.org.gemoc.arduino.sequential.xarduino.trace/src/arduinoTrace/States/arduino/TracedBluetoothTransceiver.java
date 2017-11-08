/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Dimension;
import arduinoTrace.States.BluetoothTransceiver_dataToSend_Dimension;
import arduinoTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sequential.model.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataReceived_Dimension <em>Bluetooth Transceiver data Received Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataToSend_Dimension <em>Bluetooth Transceiver data To Send Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver()
 * @model
 * @generated
 */
public interface TracedBluetoothTransceiver extends TracedArduinoAnalogModule {
	/**
	 * Returns the value of the '<em><b>Bluetooth Transceiver data Received Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bluetooth Transceiver data Received Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bluetooth Transceiver data Received Dimension</em>' containment reference.
	 * @see #setBluetoothTransceiver_dataReceived_Dimension(BluetoothTransceiver_dataReceived_Dimension)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver_BluetoothTransceiver_dataReceived_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	BluetoothTransceiver_dataReceived_Dimension getBluetoothTransceiver_dataReceived_Dimension();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataReceived_Dimension <em>Bluetooth Transceiver data Received Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bluetooth Transceiver data Received Dimension</em>' containment reference.
	 * @see #getBluetoothTransceiver_dataReceived_Dimension()
	 * @generated
	 */
	void setBluetoothTransceiver_dataReceived_Dimension(BluetoothTransceiver_dataReceived_Dimension value);

	/**
	 * Returns the value of the '<em><b>Bluetooth Transceiver data To Send Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bluetooth Transceiver data To Send Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bluetooth Transceiver data To Send Dimension</em>' containment reference.
	 * @see #setBluetoothTransceiver_dataToSend_Dimension(BluetoothTransceiver_dataToSend_Dimension)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver_BluetoothTransceiver_dataToSend_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	BluetoothTransceiver_dataToSend_Dimension getBluetoothTransceiver_dataToSend_Dimension();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getBluetoothTransceiver_dataToSend_Dimension <em>Bluetooth Transceiver data To Send Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bluetooth Transceiver data To Send Dimension</em>' containment reference.
	 * @see #getBluetoothTransceiver_dataToSend_Dimension()
	 * @generated
	 */
	void setBluetoothTransceiver_dataToSend_Dimension(BluetoothTransceiver_dataToSend_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(BluetoothTransceiver)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver_OriginalObject()
	 * @model
	 * @generated
	 */
	BluetoothTransceiver getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(BluetoothTransceiver value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList&lt;SpecificDimension&lt;?&gt;&gt; result = new org.eclipse.emf.ecore.util.BasicInternalEList&lt;SpecificDimension&lt;?&gt;&gt;(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getBluetoothTransceiver_dataReceived_Dimension());\nresult.add(getBluetoothTransceiver_dataToSend_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedBluetoothTransceiver
