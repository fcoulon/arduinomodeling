/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.Pin_level_Dimension;
import arduinoTrace.States.SpecificDimension;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedPin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedPinImpl#getPin_level_Dimension <em>Pin level Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedPinImpl extends TracedNamedElementImpl implements TracedPin {
	/**
	 * The cached value of the '{@link #getPin_level_Dimension() <em>Pin level Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin_level_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Pin_level_Dimension pin_level_Dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin_level_Dimension getPin_level_Dimension() {
		return pin_level_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPin_level_Dimension(Pin_level_Dimension newPin_level_Dimension, NotificationChain msgs) {
		Pin_level_Dimension oldPin_level_Dimension = pin_level_Dimension;
		pin_level_Dimension = newPin_level_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION, oldPin_level_Dimension, newPin_level_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin_level_Dimension(Pin_level_Dimension newPin_level_Dimension) {
		if (newPin_level_Dimension != pin_level_Dimension) {
			NotificationChain msgs = null;
			if (pin_level_Dimension != null)
				msgs = ((InternalEObject)pin_level_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION, null, msgs);
			if (newPin_level_Dimension != null)
				msgs = ((InternalEObject)newPin_level_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION, null, msgs);
			msgs = basicSetPin_level_Dimension(newPin_level_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION, newPin_level_Dimension, newPin_level_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getPin_level_Dimension());
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
			case ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION:
				return basicSetPin_level_Dimension(null, msgs);
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
			case ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION:
				return getPin_level_Dimension();
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
			case ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION:
				setPin_level_Dimension((Pin_level_Dimension)newValue);
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
			case ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION:
				setPin_level_Dimension((Pin_level_Dimension)null);
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
			case ArduinoPackage.TRACED_PIN__PIN_LEVEL_DIMENSION:
				return pin_level_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedPinImpl
