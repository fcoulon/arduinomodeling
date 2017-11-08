/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.IntegerVariable_value_Dimension;
import arduinoTrace.States.SpecificDimension;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedIntegerVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sequential.model.arduino.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl#getIntegerVariable_value_Dimension <em>Integer Variable value Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedIntegerVariableImpl extends TracedVariableImpl implements TracedIntegerVariable {
	/**
	 * The cached value of the '{@link #getIntegerVariable_value_Dimension() <em>Integer Variable value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerVariable_value_Dimension()
	 * @generated
	 * @ordered
	 */
	protected IntegerVariable_value_Dimension integerVariable_value_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected IntegerVariable originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedIntegerVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_INTEGER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_value_Dimension getIntegerVariable_value_Dimension() {
		return integerVariable_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerVariable_value_Dimension(IntegerVariable_value_Dimension newIntegerVariable_value_Dimension, NotificationChain msgs) {
		IntegerVariable_value_Dimension oldIntegerVariable_value_Dimension = integerVariable_value_Dimension;
		integerVariable_value_Dimension = newIntegerVariable_value_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION, oldIntegerVariable_value_Dimension, newIntegerVariable_value_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerVariable_value_Dimension(IntegerVariable_value_Dimension newIntegerVariable_value_Dimension) {
		if (newIntegerVariable_value_Dimension != integerVariable_value_Dimension) {
			NotificationChain msgs = null;
			if (integerVariable_value_Dimension != null)
				msgs = ((InternalEObject)integerVariable_value_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION, null, msgs);
			if (newIntegerVariable_value_Dimension != null)
				msgs = ((InternalEObject)newIntegerVariable_value_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION, null, msgs);
			msgs = basicSetIntegerVariable_value_Dimension(newIntegerVariable_value_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION, newIntegerVariable_value_Dimension, newIntegerVariable_value_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (IntegerVariable)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(IntegerVariable newOriginalObject) {
		IntegerVariable oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getIntegerVariable_value_Dimension());
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION:
				return basicSetIntegerVariable_value_Dimension(null, msgs);
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION:
				return getIntegerVariable_value_Dimension();
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION:
				setIntegerVariable_value_Dimension((IntegerVariable_value_Dimension)newValue);
				return;
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((IntegerVariable)newValue);
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION:
				setIntegerVariable_value_Dimension((IntegerVariable_value_Dimension)null);
				return;
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
				setOriginalObject((IntegerVariable)null);
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION:
				return integerVariable_value_Dimension != null;
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedIntegerVariableImpl
