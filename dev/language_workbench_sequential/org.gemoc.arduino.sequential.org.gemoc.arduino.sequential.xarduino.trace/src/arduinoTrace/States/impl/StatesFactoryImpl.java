/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION: return createBluetoothTransceiver_dataReceived_Dimension();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE: return createBluetoothTransceiver_dataReceived_Value();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION: return createBluetoothTransceiver_dataToSend_Dimension();
			case StatesPackage.BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE: return createBluetoothTransceiver_dataToSend_Value();
			case StatesPackage.BOOLEAN_VARIABLE_VALUE_DIMENSION: return createBooleanVariable_value_Dimension();
			case StatesPackage.BOOLEAN_VARIABLE_VALUE_VALUE: return createBooleanVariable_value_Value();
			case StatesPackage.INTEGER_VARIABLE_VALUE_DIMENSION: return createIntegerVariable_value_Dimension();
			case StatesPackage.INTEGER_VARIABLE_VALUE_VALUE: return createIntegerVariable_value_Value();
			case StatesPackage.PIN_LEVEL_DIMENSION: return createPin_level_Dimension();
			case StatesPackage.PIN_LEVEL_VALUE: return createPin_level_Value();
			case StatesPackage.REPEAT_IDIMENSION: return createRepeat_i_Dimension();
			case StatesPackage.REPEAT_IVALUE: return createRepeat_i_Value();
			case StatesPackage.SPECIFIC_STATE: return createSpecificState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataReceived_Dimension createBluetoothTransceiver_dataReceived_Dimension() {
		BluetoothTransceiver_dataReceived_DimensionImpl bluetoothTransceiver_dataReceived_Dimension = new BluetoothTransceiver_dataReceived_DimensionImpl();
		return bluetoothTransceiver_dataReceived_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataReceived_Value createBluetoothTransceiver_dataReceived_Value() {
		BluetoothTransceiver_dataReceived_ValueImpl bluetoothTransceiver_dataReceived_Value = new BluetoothTransceiver_dataReceived_ValueImpl();
		return bluetoothTransceiver_dataReceived_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataToSend_Dimension createBluetoothTransceiver_dataToSend_Dimension() {
		BluetoothTransceiver_dataToSend_DimensionImpl bluetoothTransceiver_dataToSend_Dimension = new BluetoothTransceiver_dataToSend_DimensionImpl();
		return bluetoothTransceiver_dataToSend_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver_dataToSend_Value createBluetoothTransceiver_dataToSend_Value() {
		BluetoothTransceiver_dataToSend_ValueImpl bluetoothTransceiver_dataToSend_Value = new BluetoothTransceiver_dataToSend_ValueImpl();
		return bluetoothTransceiver_dataToSend_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_value_Dimension createBooleanVariable_value_Dimension() {
		BooleanVariable_value_DimensionImpl booleanVariable_value_Dimension = new BooleanVariable_value_DimensionImpl();
		return booleanVariable_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_value_Value createBooleanVariable_value_Value() {
		BooleanVariable_value_ValueImpl booleanVariable_value_Value = new BooleanVariable_value_ValueImpl();
		return booleanVariable_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_value_Dimension createIntegerVariable_value_Dimension() {
		IntegerVariable_value_DimensionImpl integerVariable_value_Dimension = new IntegerVariable_value_DimensionImpl();
		return integerVariable_value_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_value_Value createIntegerVariable_value_Value() {
		IntegerVariable_value_ValueImpl integerVariable_value_Value = new IntegerVariable_value_ValueImpl();
		return integerVariable_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin_level_Dimension createPin_level_Dimension() {
		Pin_level_DimensionImpl pin_level_Dimension = new Pin_level_DimensionImpl();
		return pin_level_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin_level_Value createPin_level_Value() {
		Pin_level_ValueImpl pin_level_Value = new Pin_level_ValueImpl();
		return pin_level_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat_i_Dimension createRepeat_i_Dimension() {
		Repeat_i_DimensionImpl repeat_i_Dimension = new Repeat_i_DimensionImpl();
		return repeat_i_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat_i_Value createRepeat_i_Value() {
		Repeat_i_ValueImpl repeat_i_Value = new Repeat_i_ValueImpl();
		return repeat_i_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificState createSpecificState() {
		SpecificStateImpl specificState = new SpecificStateImpl();
		return specificState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
