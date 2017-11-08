/**
 */
package arduinoTrace.States;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth Transceiver data To Send Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getDataToSend <em>Data To Send</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataToSend_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BluetoothTransceiver_dataToSend_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Data To Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data To Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data To Send</em>' attribute.
	 * @see #setDataToSend(EList)
	 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataToSend_Value_DataToSend()
	 * @model unique="false" many="false"
	 * @generated
	 */
	EList getDataToSend();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getDataToSend <em>Data To Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data To Send</em>' attribute.
	 * @see #getDataToSend()
	 * @generated
	 */
	void setDataToSend(EList value);

} // BluetoothTransceiver_dataToSend_Value
