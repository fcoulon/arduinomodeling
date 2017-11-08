/**
 */
package arduinoTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = arduinoTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bluetooth Transceiver data Received Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth Transceiver data Received Dimension</em>'.
	 * @generated
	 */
	BluetoothTransceiver_dataReceived_Dimension createBluetoothTransceiver_dataReceived_Dimension();

	/**
	 * Returns a new object of class '<em>Bluetooth Transceiver data Received Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth Transceiver data Received Value</em>'.
	 * @generated
	 */
	BluetoothTransceiver_dataReceived_Value createBluetoothTransceiver_dataReceived_Value();

	/**
	 * Returns a new object of class '<em>Bluetooth Transceiver data To Send Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth Transceiver data To Send Dimension</em>'.
	 * @generated
	 */
	BluetoothTransceiver_dataToSend_Dimension createBluetoothTransceiver_dataToSend_Dimension();

	/**
	 * Returns a new object of class '<em>Bluetooth Transceiver data To Send Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth Transceiver data To Send Value</em>'.
	 * @generated
	 */
	BluetoothTransceiver_dataToSend_Value createBluetoothTransceiver_dataToSend_Value();

	/**
	 * Returns a new object of class '<em>Boolean Variable value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable value Dimension</em>'.
	 * @generated
	 */
	BooleanVariable_value_Dimension createBooleanVariable_value_Dimension();

	/**
	 * Returns a new object of class '<em>Boolean Variable value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable value Value</em>'.
	 * @generated
	 */
	BooleanVariable_value_Value createBooleanVariable_value_Value();

	/**
	 * Returns a new object of class '<em>Integer Variable value Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable value Dimension</em>'.
	 * @generated
	 */
	IntegerVariable_value_Dimension createIntegerVariable_value_Dimension();

	/**
	 * Returns a new object of class '<em>Integer Variable value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable value Value</em>'.
	 * @generated
	 */
	IntegerVariable_value_Value createIntegerVariable_value_Value();

	/**
	 * Returns a new object of class '<em>Pin level Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin level Dimension</em>'.
	 * @generated
	 */
	Pin_level_Dimension createPin_level_Dimension();

	/**
	 * Returns a new object of class '<em>Pin level Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin level Value</em>'.
	 * @generated
	 */
	Pin_level_Value createPin_level_Value();

	/**
	 * Returns a new object of class '<em>Repeat iDimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat iDimension</em>'.
	 * @generated
	 */
	Repeat_i_Dimension createRepeat_i_Dimension();

	/**
	 * Returns a new object of class '<em>Repeat iValue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat iValue</em>'.
	 * @generated
	 */
	Repeat_i_Value createRepeat_i_Value();

	/**
	 * Returns a new object of class '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific State</em>'.
	 * @generated
	 */
	SpecificState createSpecificState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
