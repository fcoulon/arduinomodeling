/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.BluetoothTransceiver_dataToSend_Value;
import arduinoTrace.States.StatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Transceiver data To Send Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl#getDataToSend <em>Data To Send</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BluetoothTransceiver_dataToSend_ValueImpl extends SpecificValueImpl implements BluetoothTransceiver_dataToSend_Value {
	/**
	 * The cached value of the '{@link #getDataToSend() <em>Data To Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataToSend()
	 * @generated
	 * @ordered
	 */
	protected EList dataToSend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BluetoothTransceiver_dataToSend_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataToSend() {
		return dataToSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataToSend(EList newDataToSend) {
		EList oldDataToSend = dataToSend;
		dataToSend = newDataToSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND, oldDataToSend, dataToSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND:
				return getDataToSend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND:
				setDataToSend((EList)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND:
				setDataToSend((EList)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND:
				return dataToSend != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataToSend: ");
		result.append(dataToSend);
		result.append(')');
		return result.toString();
	}

} //BluetoothTransceiver_dataToSend_ValueImpl
