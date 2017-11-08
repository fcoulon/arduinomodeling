/**
 */
package arduinoTrace.States;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.BooleanVariable_value_Value#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.StatesPackage#getBooleanVariable_value_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BooleanVariable_value_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see arduinoTrace.States.StatesPackage#getBooleanVariable_value_Value_Value()
	 * @model unique="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.BooleanVariable_value_Value#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanVariable_value_Value
