/**
 */
package arduinoTrace.States.util;

import arduinoTrace.States.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.trace.commons.model.trace.Dimension;
import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.commons.model.trace.Value;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.StatesPackage
 * @generated
 */
public class StatesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatesSwitch<Adapter> modelSwitch =
		new StatesSwitch<Adapter>() {
			@Override
			public Adapter caseBluetoothTransceiver_dataReceived_Dimension(BluetoothTransceiver_dataReceived_Dimension object) {
				return createBluetoothTransceiver_dataReceived_DimensionAdapter();
			}
			@Override
			public Adapter caseBluetoothTransceiver_dataReceived_Value(BluetoothTransceiver_dataReceived_Value object) {
				return createBluetoothTransceiver_dataReceived_ValueAdapter();
			}
			@Override
			public Adapter caseBluetoothTransceiver_dataToSend_Dimension(BluetoothTransceiver_dataToSend_Dimension object) {
				return createBluetoothTransceiver_dataToSend_DimensionAdapter();
			}
			@Override
			public Adapter caseBluetoothTransceiver_dataToSend_Value(BluetoothTransceiver_dataToSend_Value object) {
				return createBluetoothTransceiver_dataToSend_ValueAdapter();
			}
			@Override
			public Adapter caseBooleanVariable_value_Dimension(BooleanVariable_value_Dimension object) {
				return createBooleanVariable_value_DimensionAdapter();
			}
			@Override
			public Adapter caseBooleanVariable_value_Value(BooleanVariable_value_Value object) {
				return createBooleanVariable_value_ValueAdapter();
			}
			@Override
			public Adapter caseIntegerVariable_value_Dimension(IntegerVariable_value_Dimension object) {
				return createIntegerVariable_value_DimensionAdapter();
			}
			@Override
			public Adapter caseIntegerVariable_value_Value(IntegerVariable_value_Value object) {
				return createIntegerVariable_value_ValueAdapter();
			}
			@Override
			public Adapter casePin_level_Dimension(Pin_level_Dimension object) {
				return createPin_level_DimensionAdapter();
			}
			@Override
			public Adapter casePin_level_Value(Pin_level_Value object) {
				return createPin_level_ValueAdapter();
			}
			@Override
			public Adapter caseRepeat_i_Dimension(Repeat_i_Dimension object) {
				return createRepeat_i_DimensionAdapter();
			}
			@Override
			public Adapter caseRepeat_i_Value(Repeat_i_Value object) {
				return createRepeat_i_ValueAdapter();
			}
			@Override
			public Adapter caseSpecificAttributeValue(SpecificAttributeValue object) {
				return createSpecificAttributeValueAdapter();
			}
			@Override
			public <ValueSubType extends SpecificValue> Adapter caseSpecificDimension(SpecificDimension<ValueSubType> object) {
				return createSpecificDimensionAdapter();
			}
			@Override
			public <T> Adapter caseSpecificReferenceValue(SpecificReferenceValue<T> object) {
				return createSpecificReferenceValueAdapter();
			}
			@Override
			public Adapter caseSpecificState(SpecificState object) {
				return createSpecificStateAdapter();
			}
			@Override
			public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> Adapter caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
				return createSpecificTracedObjectAdapter();
			}
			@Override
			public Adapter caseSpecificValue(SpecificValue object) {
				return createSpecificValueAdapter();
			}
			@Override
			public <ValueSubType extends Value<?>> Adapter caseDimension(Dimension<ValueSubType> object) {
				return createDimensionAdapter();
			}
			@Override
			public <StateSubType extends State<?, ?>> Adapter caseValue(Value<StateSubType> object) {
				return createValueAdapter();
			}
			@Override
			public <StepSubType extends Step<?>, ValueSubType extends Value<?>> Adapter caseState(State<StepSubType, ValueSubType> object) {
				return createStateAdapter();
			}
			@Override
			public <DimensionSubType extends Dimension<?>> Adapter caseTracedObject(TracedObject<DimensionSubType> object) {
				return createTracedObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Dimension <em>Bluetooth Transceiver data Received Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Dimension
	 * @generated
	 */
	public Adapter createBluetoothTransceiver_dataReceived_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value <em>Bluetooth Transceiver data Received Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value
	 * @generated
	 */
	public Adapter createBluetoothTransceiver_dataReceived_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Dimension <em>Bluetooth Transceiver data To Send Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Dimension
	 * @generated
	 */
	public Adapter createBluetoothTransceiver_dataToSend_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value <em>Bluetooth Transceiver data To Send Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value
	 * @generated
	 */
	public Adapter createBluetoothTransceiver_dataToSend_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.BooleanVariable_value_Dimension <em>Boolean Variable value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.BooleanVariable_value_Dimension
	 * @generated
	 */
	public Adapter createBooleanVariable_value_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.BooleanVariable_value_Value <em>Boolean Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.BooleanVariable_value_Value
	 * @generated
	 */
	public Adapter createBooleanVariable_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.IntegerVariable_value_Dimension <em>Integer Variable value Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.IntegerVariable_value_Dimension
	 * @generated
	 */
	public Adapter createIntegerVariable_value_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.IntegerVariable_value_Value <em>Integer Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.IntegerVariable_value_Value
	 * @generated
	 */
	public Adapter createIntegerVariable_value_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.Pin_level_Dimension <em>Pin level Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.Pin_level_Dimension
	 * @generated
	 */
	public Adapter createPin_level_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.Pin_level_Value <em>Pin level Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.Pin_level_Value
	 * @generated
	 */
	public Adapter createPin_level_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.Repeat_i_Dimension <em>Repeat iDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.Repeat_i_Dimension
	 * @generated
	 */
	public Adapter createRepeat_i_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.Repeat_i_Value <em>Repeat iValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.Repeat_i_Value
	 * @generated
	 */
	public Adapter createRepeat_i_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.SpecificAttributeValue
	 * @generated
	 */
	public Adapter createSpecificAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.SpecificDimension
	 * @generated
	 */
	public Adapter createSpecificDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.SpecificReferenceValue
	 * @generated
	 */
	public Adapter createSpecificReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.SpecificState
	 * @generated
	 */
	public Adapter createSpecificStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.SpecificTracedObject
	 * @generated
	 */
	public Adapter createSpecificTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.SpecificValue
	 * @generated
	 */
	public Adapter createSpecificValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.TracedObject <em>Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.TracedObject
	 * @generated
	 */
	public Adapter createTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StatesAdapterFactory
