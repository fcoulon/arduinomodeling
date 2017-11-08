/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Value;
import arduinoTrace.States.StatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Transceiver data Received Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl#getDataReceived <em>Data Received</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BluetoothTransceiver_dataReceived_ValueImpl extends SpecificValueImpl implements BluetoothTransceiver_dataReceived_Value {
	/**
	 * The cached value of the '{@link #getDataReceived() <em>Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReceived()
	 * @generated
	 * @ordered
	 */
	protected EList dataReceived;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BluetoothTransceiver_dataReceived_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataReceived() {
		return dataReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataReceived(EList newDataReceived) {
		EList oldDataReceived = dataReceived;
		dataReceived = newDataReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED, oldDataReceived, dataReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				return getDataReceived();
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				setDataReceived((EList)newValue);
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				setDataReceived((EList)null);
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
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED:
				return dataReceived != null;
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
		result.append(" (dataReceived: ");
		result.append(dataReceived);
		result.append(')');
		return result.toString();
	}

} //BluetoothTransceiver_dataReceived_ValueImpl
