/**
 */
package arduinoTrace.States.util;

import arduinoTrace.States.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.trace.commons.model.trace.Dimension;
import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.commons.model.trace.Value;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.StatesPackage
 * @generated
 */
public class StatesSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesSwitch() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION: {
				BluetoothTransceiver_dataReceived_Dimension bluetoothTransceiver_dataReceived_Dimension = (BluetoothTransceiver_dataReceived_Dimension)theEObject;
				T1 result = caseBluetoothTransceiver_dataReceived_Dimension(bluetoothTransceiver_dataReceived_Dimension);
				if (result == null) result = caseSpecificDimension(bluetoothTransceiver_dataReceived_Dimension);
				if (result == null) result = caseDimension(bluetoothTransceiver_dataReceived_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE: {
				BluetoothTransceiver_dataReceived_Value bluetoothTransceiver_dataReceived_Value = (BluetoothTransceiver_dataReceived_Value)theEObject;
				T1 result = caseBluetoothTransceiver_dataReceived_Value(bluetoothTransceiver_dataReceived_Value);
				if (result == null) result = caseSpecificAttributeValue(bluetoothTransceiver_dataReceived_Value);
				if (result == null) result = caseSpecificValue(bluetoothTransceiver_dataReceived_Value);
				if (result == null) result = caseValue(bluetoothTransceiver_dataReceived_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION: {
				BluetoothTransceiver_dataToSend_Dimension bluetoothTransceiver_dataToSend_Dimension = (BluetoothTransceiver_dataToSend_Dimension)theEObject;
				T1 result = caseBluetoothTransceiver_dataToSend_Dimension(bluetoothTransceiver_dataToSend_Dimension);
				if (result == null) result = caseSpecificDimension(bluetoothTransceiver_dataToSend_Dimension);
				if (result == null) result = caseDimension(bluetoothTransceiver_dataToSend_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE: {
				BluetoothTransceiver_dataToSend_Value bluetoothTransceiver_dataToSend_Value = (BluetoothTransceiver_dataToSend_Value)theEObject;
				T1 result = caseBluetoothTransceiver_dataToSend_Value(bluetoothTransceiver_dataToSend_Value);
				if (result == null) result = caseSpecificAttributeValue(bluetoothTransceiver_dataToSend_Value);
				if (result == null) result = caseSpecificValue(bluetoothTransceiver_dataToSend_Value);
				if (result == null) result = caseValue(bluetoothTransceiver_dataToSend_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_VARIABLE_VALUE_DIMENSION: {
				BooleanVariable_value_Dimension booleanVariable_value_Dimension = (BooleanVariable_value_Dimension)theEObject;
				T1 result = caseBooleanVariable_value_Dimension(booleanVariable_value_Dimension);
				if (result == null) result = caseSpecificDimension(booleanVariable_value_Dimension);
				if (result == null) result = caseDimension(booleanVariable_value_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.BOOLEAN_VARIABLE_VALUE_VALUE: {
				BooleanVariable_value_Value booleanVariable_value_Value = (BooleanVariable_value_Value)theEObject;
				T1 result = caseBooleanVariable_value_Value(booleanVariable_value_Value);
				if (result == null) result = caseSpecificAttributeValue(booleanVariable_value_Value);
				if (result == null) result = caseSpecificValue(booleanVariable_value_Value);
				if (result == null) result = caseValue(booleanVariable_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_VARIABLE_VALUE_DIMENSION: {
				IntegerVariable_value_Dimension integerVariable_value_Dimension = (IntegerVariable_value_Dimension)theEObject;
				T1 result = caseIntegerVariable_value_Dimension(integerVariable_value_Dimension);
				if (result == null) result = caseSpecificDimension(integerVariable_value_Dimension);
				if (result == null) result = caseDimension(integerVariable_value_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.INTEGER_VARIABLE_VALUE_VALUE: {
				IntegerVariable_value_Value integerVariable_value_Value = (IntegerVariable_value_Value)theEObject;
				T1 result = caseIntegerVariable_value_Value(integerVariable_value_Value);
				if (result == null) result = caseSpecificAttributeValue(integerVariable_value_Value);
				if (result == null) result = caseSpecificValue(integerVariable_value_Value);
				if (result == null) result = caseValue(integerVariable_value_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.PIN_LEVEL_DIMENSION: {
				Pin_level_Dimension pin_level_Dimension = (Pin_level_Dimension)theEObject;
				T1 result = casePin_level_Dimension(pin_level_Dimension);
				if (result == null) result = caseSpecificDimension(pin_level_Dimension);
				if (result == null) result = caseDimension(pin_level_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.PIN_LEVEL_VALUE: {
				Pin_level_Value pin_level_Value = (Pin_level_Value)theEObject;
				T1 result = casePin_level_Value(pin_level_Value);
				if (result == null) result = caseSpecificAttributeValue(pin_level_Value);
				if (result == null) result = caseSpecificValue(pin_level_Value);
				if (result == null) result = caseValue(pin_level_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.REPEAT_IDIMENSION: {
				Repeat_i_Dimension repeat_i_Dimension = (Repeat_i_Dimension)theEObject;
				T1 result = caseRepeat_i_Dimension(repeat_i_Dimension);
				if (result == null) result = caseSpecificDimension(repeat_i_Dimension);
				if (result == null) result = caseDimension(repeat_i_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.REPEAT_IVALUE: {
				Repeat_i_Value repeat_i_Value = (Repeat_i_Value)theEObject;
				T1 result = caseRepeat_i_Value(repeat_i_Value);
				if (result == null) result = caseSpecificAttributeValue(repeat_i_Value);
				if (result == null) result = caseSpecificValue(repeat_i_Value);
				if (result == null) result = caseValue(repeat_i_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_ATTRIBUTE_VALUE: {
				SpecificAttributeValue specificAttributeValue = (SpecificAttributeValue)theEObject;
				T1 result = caseSpecificAttributeValue(specificAttributeValue);
				if (result == null) result = caseSpecificValue(specificAttributeValue);
				if (result == null) result = caseValue(specificAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_DIMENSION: {
				SpecificDimension<?> specificDimension = (SpecificDimension<?>)theEObject;
				T1 result = caseSpecificDimension(specificDimension);
				if (result == null) result = caseDimension(specificDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_REFERENCE_VALUE: {
				SpecificReferenceValue<?> specificReferenceValue = (SpecificReferenceValue<?>)theEObject;
				T1 result = caseSpecificReferenceValue(specificReferenceValue);
				if (result == null) result = caseSpecificValue(specificReferenceValue);
				if (result == null) result = caseValue(specificReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_STATE: {
				SpecificState specificState = (SpecificState)theEObject;
				T1 result = caseSpecificState(specificState);
				if (result == null) result = caseState(specificState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_TRACED_OBJECT: {
				SpecificTracedObject<?> specificTracedObject = (SpecificTracedObject<?>)theEObject;
				T1 result = caseSpecificTracedObject(specificTracedObject);
				if (result == null) result = caseTracedObject(specificTracedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_VALUE: {
				SpecificValue specificValue = (SpecificValue)theEObject;
				T1 result = caseSpecificValue(specificValue);
				if (result == null) result = caseValue(specificValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data Received Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data Received Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBluetoothTransceiver_dataReceived_Dimension(BluetoothTransceiver_dataReceived_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data Received Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data Received Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBluetoothTransceiver_dataReceived_Value(BluetoothTransceiver_dataReceived_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data To Send Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data To Send Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBluetoothTransceiver_dataToSend_Dimension(BluetoothTransceiver_dataToSend_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data To Send Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth Transceiver data To Send Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBluetoothTransceiver_dataToSend_Value(BluetoothTransceiver_dataToSend_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable value Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariable_value_Dimension(BooleanVariable_value_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanVariable_value_Value(BooleanVariable_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable value Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariable_value_Dimension(IntegerVariable_value_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerVariable_value_Value(IntegerVariable_value_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin level Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin level Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePin_level_Dimension(Pin_level_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin level Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin level Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePin_level_Value(Pin_level_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat iDimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat iDimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRepeat_i_Dimension(Repeat_i_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat iValue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat iValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRepeat_i_Value(Repeat_i_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificAttributeValue(SpecificAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ValueSubType extends SpecificValue> T1 caseSpecificDimension(SpecificDimension<ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseSpecificReferenceValue(SpecificReferenceValue<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificState(SpecificState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> T1 caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificValue(SpecificValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ValueSubType extends Value<?>> T1 caseDimension(Dimension<ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StateSubType extends State<?, ?>> T1 caseValue(Value<StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubType extends Step<?>, ValueSubType extends Value<?>> T1 caseState(State<StepSubType, ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends Dimension<?>> T1 caseTracedObject(TracedObject<DimensionSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //StatesSwitch
