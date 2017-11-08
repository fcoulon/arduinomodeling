/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.BooleanVariable_value_Dimension;
import arduinoTrace.States.SpecificDimension;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedBooleanVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sequential.model.arduino.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl#getBooleanVariable_value_Dimension <em>Boolean Variable value Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedBooleanVariableImpl extends TracedVariableImpl implements TracedBooleanVariable {
	/**
	 * The cached value of the '{@link #getBooleanVariable_value_Dimension() <em>Boolean Variable value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanVariable_value_Dimension()
	 * @generated
	 * @ordered
	 */
	protected BooleanVariable_value_Dimension booleanVariable_value_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected BooleanVariable originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBooleanVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_BOOLEAN_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_value_Dimension getBooleanVariable_value_Dimension() {
		return booleanVariable_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanVariable_value_Dimension(BooleanVariable_value_Dimension newBooleanVariable_value_Dimension, NotificationChain msgs) {
		BooleanVariable_value_Dimension oldBooleanVariable_value_Dimension = booleanVariable_value_Dimension;
		booleanVariable_value_Dimension = newBooleanVariable_value_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION, oldBooleanVariable_value_Dimension, newBooleanVariable_value_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanVariable_value_Dimension(BooleanVariable_value_Dimension newBooleanVariable_value_Dimension) {
		if (newBooleanVariable_value_Dimension != booleanVariable_value_Dimension) {
			NotificationChain msgs = null;
			if (booleanVariable_value_Dimension != null)
				msgs = ((InternalEObject)booleanVariable_value_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION, null, msgs);
			if (newBooleanVariable_value_Dimension != null)
				msgs = ((InternalEObject)newBooleanVariable_value_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION, null, msgs);
			msgs = basicSetBooleanVariable_value_Dimension(newBooleanVariable_value_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION, newBooleanVariable_value_Dimension, newBooleanVariable_value_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (BooleanVariable)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(BooleanVariable newOriginalObject) {
		BooleanVariable oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getBooleanVariable_value_Dimension());
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
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION:
				return basicSetBooleanVariable_value_Dimension(null, msgs);
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
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION:
				return getBooleanVariable_value_Dimension();
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
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
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION:
				setBooleanVariable_value_Dimension((BooleanVariable_value_Dimension)newValue);
				return;
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((BooleanVariable)newValue);
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
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION:
				setBooleanVariable_value_Dimension((BooleanVariable_value_Dimension)null);
				return;
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((BooleanVariable)null);
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
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION:
				return booleanVariable_value_Dimension != null;
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedBooleanVariableImpl
