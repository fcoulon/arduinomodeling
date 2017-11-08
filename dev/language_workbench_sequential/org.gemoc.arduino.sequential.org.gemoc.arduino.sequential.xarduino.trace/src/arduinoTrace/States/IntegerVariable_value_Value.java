/**
 */
package arduinoTrace.States;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.IntegerVariable_value_Value#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.StatesPackage#getIntegerVariable_value_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface IntegerVariable_value_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see arduinoTrace.States.StatesPackage#getIntegerVariable_value_Value_Value()
	 * @model unique="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.IntegerVariable_value_Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerVariable_value_Value
