/**
 */
package arduinoTrace.States;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth Transceiver data Received Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getDataReceived <em>Data Received</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataReceived_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BluetoothTransceiver_dataReceived_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Data Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Received</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Received</em>' attribute.
	 * @see #setDataReceived(EList)
	 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataReceived_Value_DataReceived()
	 * @model unique="false" many="false"
	 * @generated
	 */
	EList getDataReceived();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getDataReceived <em>Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Received</em>' attribute.
	 * @see #getDataReceived()
	 * @generated
	 */
	void setDataReceived(EList value);

} // BluetoothTransceiver_dataReceived_Value
