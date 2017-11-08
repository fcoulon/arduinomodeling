/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Dimension;
import arduinoTrace.States.BluetoothTransceiver_dataToSend_Dimension;
import arduinoTrace.States.SpecificDimension;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedBluetoothTransceiver;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sequential.model.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl#getBluetoothTransceiver_dataReceived_Dimension <em>Bluetooth Transceiver data Received Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl#getBluetoothTransceiver_dataToSend_Dimension <em>Bluetooth Transceiver data To Send Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedBluetoothTransceiverImpl extends TracedArduinoAnalogModuleImpl implements TracedBluetoothTransceiver {
	/**
	 * The cached value of the '{@link #getBluetoothTransceiver_dataReceived_Dimension() <em>Bluetooth Transceiver data Received Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBluetoothTransceiver_dataReceived_Dimension()
	 * @generated
	 * @ordered
	 */
	protected BluetoothTransceiver_dataReceived_Dimension bluetoothTransceiver_dataReceived_Dimension;

	/**
	 * The cached value of the '{@link #getBluetoothTransceiver_dataToSend_Dimension() <em>Bluetooth Transceiver data To Send Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBluetoothTransceiver_dataToSend_Dimension()
	 * @generated
	 * @ordered
	 */
	protected BluetoothTransceiver_dataToSend_Dimension bluetoothTransceiver_dataToSend_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected BluetoothTransceiver originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBluetoothTransceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_BLUETOOTH_TRANSCEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataReceived_Dimension getBluetoothTransceiver_dataReceived_Dimension() {
		return bluetoothTransceiver_dataReceived_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBluetoothTransceiver_dataReceived_Dimension(BluetoothTransceiver_dataReceived_Dimension newBluetoothTransceiver_dataReceived_Dimension, NotificationChain msgs) {
		BluetoothTransceiver_dataReceived_Dimension oldBluetoothTransceiver_dataReceived_Dimension = bluetoothTransceiver_dataReceived_Dimension;
		bluetoothTransceiver_dataReceived_Dimension = newBluetoothTransceiver_dataReceived_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION, oldBluetoothTransceiver_dataReceived_Dimension, newBluetoothTransceiver_dataReceived_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBluetoothTransceiver_dataReceived_Dimension(BluetoothTransceiver_dataReceived_Dimension newBluetoothTransceiver_dataReceived_Dimension) {
		if (newBluetoothTransceiver_dataReceived_Dimension != bluetoothTransceiver_dataReceived_Dimension) {
			NotificationChain msgs = null;
			if (bluetoothTransceiver_dataReceived_Dimension != null)
				msgs = ((InternalEObject)bluetoothTransceiver_dataReceived_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION, null, msgs);
			if (newBluetoothTransceiver_dataReceived_Dimension != null)
				msgs = ((InternalEObject)newBluetoothTransceiver_dataReceived_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION, null, msgs);
			msgs = basicSetBluetoothTransceiver_dataReceived_Dimension(newBluetoothTransceiver_dataReceived_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION, newBluetoothTransceiver_dataReceived_Dimension, newBluetoothTransceiver_dataReceived_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataToSend_Dimension getBluetoothTransceiver_dataToSend_Dimension() {
		return bluetoothTransceiver_dataToSend_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBluetoothTransceiver_dataToSend_Dimension(BluetoothTransceiver_dataToSend_Dimension newBluetoothTransceiver_dataToSend_Dimension, NotificationChain msgs) {
		BluetoothTransceiver_dataToSend_Dimension oldBluetoothTransceiver_dataToSend_Dimension = bluetoothTransceiver_dataToSend_Dimension;
		bluetoothTransceiver_dataToSend_Dimension = newBluetoothTransceiver_dataToSend_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION, oldBluetoothTransceiver_dataToSend_Dimension, newBluetoothTransceiver_dataToSend_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBluetoothTransceiver_dataToSend_Dimension(BluetoothTransceiver_dataToSend_Dimension newBluetoothTransceiver_dataToSend_Dimension) {
		if (newBluetoothTransceiver_dataToSend_Dimension != bluetoothTransceiver_dataToSend_Dimension) {
			NotificationChain msgs = null;
			if (bluetoothTransceiver_dataToSend_Dimension != null)
				msgs = ((InternalEObject)bluetoothTransceiver_dataToSend_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION, null, msgs);
			if (newBluetoothTransceiver_dataToSend_Dimension != null)
				msgs = ((InternalEObject)newBluetoothTransceiver_dataToSend_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION, null, msgs);
			msgs = basicSetBluetoothTransceiver_dataToSend_Dimension(newBluetoothTransceiver_dataToSend_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION, newBluetoothTransceiver_dataToSend_Dimension, newBluetoothTransceiver_dataToSend_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (BluetoothTransceiver)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(BluetoothTransceiver newOriginalObject) {
		BluetoothTransceiver oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getBluetoothTransceiver_dataReceived_Dimension());
		result.add(getBluetoothTransceiver_dataToSend_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION:
				return basicSetBluetoothTransceiver_dataReceived_Dimension(null, msgs);
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION:
				return basicSetBluetoothTransceiver_dataToSend_Dimension(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION:
				return getBluetoothTransceiver_dataReceived_Dimension();
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION:
				return getBluetoothTransceiver_dataToSend_Dimension();
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION:
				setBluetoothTransceiver_dataReceived_Dimension((BluetoothTransceiver_dataReceived_Dimension)newValue);
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION:
				setBluetoothTransceiver_dataToSend_Dimension((BluetoothTransceiver_dataToSend_Dimension)newValue);
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				setOriginalObject((BluetoothTransceiver)newValue);
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION:
				setBluetoothTransceiver_dataReceived_Dimension((BluetoothTransceiver_dataReceived_Dimension)null);
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION:
				setBluetoothTransceiver_dataToSend_Dimension((BluetoothTransceiver_dataToSend_Dimension)null);
				return;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				setOriginalObject((BluetoothTransceiver)null);
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
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION:
				return bluetoothTransceiver_dataReceived_Dimension != null;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION:
				return bluetoothTransceiver_dataToSend_Dimension != null;
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedBluetoothTransceiverImpl
