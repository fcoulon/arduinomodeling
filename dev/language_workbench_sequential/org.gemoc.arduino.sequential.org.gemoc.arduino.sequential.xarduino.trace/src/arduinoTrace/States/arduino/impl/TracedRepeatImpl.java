/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.Repeat_i_Dimension;
import arduinoTrace.States.SpecificDimension;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedRepeat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sequential.model.arduino.Repeat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedRepeatImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedRepeatImpl#getRepeat_i_Dimension <em>Repeat iDimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedRepeatImpl extends TracedControlImpl implements TracedRepeat {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Repeat originalObject;

	/**
	 * The cached value of the '{@link #getRepeat_i_Dimension() <em>Repeat iDimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat_i_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Repeat_i_Dimension repeat_i_Dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedRepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_REPEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Repeat)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRACED_REPEAT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Repeat newOriginalObject) {
		Repeat oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_REPEAT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat_i_Dimension getRepeat_i_Dimension() {
		return repeat_i_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeat_i_Dimension(Repeat_i_Dimension newRepeat_i_Dimension, NotificationChain msgs) {
		Repeat_i_Dimension oldRepeat_i_Dimension = repeat_i_Dimension;
		repeat_i_Dimension = newRepeat_i_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION, oldRepeat_i_Dimension, newRepeat_i_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat_i_Dimension(Repeat_i_Dimension newRepeat_i_Dimension) {
		if (newRepeat_i_Dimension != repeat_i_Dimension) {
			NotificationChain msgs = null;
			if (repeat_i_Dimension != null)
				msgs = ((InternalEObject)repeat_i_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION, null, msgs);
			if (newRepeat_i_Dimension != null)
				msgs = ((InternalEObject)newRepeat_i_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION, null, msgs);
			msgs = basicSetRepeat_i_Dimension(newRepeat_i_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION, newRepeat_i_Dimension, newRepeat_i_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getRepeat_i_Dimension());
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
			case ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION:
				return basicSetRepeat_i_Dimension(null, msgs);
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
			case ArduinoPackage.TRACED_REPEAT__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION:
				return getRepeat_i_Dimension();
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
			case ArduinoPackage.TRACED_REPEAT__ORIGINAL_OBJECT:
				setOriginalObject((Repeat)newValue);
				return;
			case ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION:
				setRepeat_i_Dimension((Repeat_i_Dimension)newValue);
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
			case ArduinoPackage.TRACED_REPEAT__ORIGINAL_OBJECT:
				setOriginalObject((Repeat)null);
				return;
			case ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION:
				setRepeat_i_Dimension((Repeat_i_Dimension)null);
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
			case ArduinoPackage.TRACED_REPEAT__ORIGINAL_OBJECT:
				return originalObject != null;
			case ArduinoPackage.TRACED_REPEAT__REPEAT_IDIMENSION:
				return repeat_i_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedRepeatImpl
