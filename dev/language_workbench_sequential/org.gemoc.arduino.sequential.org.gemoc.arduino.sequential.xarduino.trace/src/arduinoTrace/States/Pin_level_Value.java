/**
 */
package arduinoTrace.States;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin level Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.Pin_level_Value#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.StatesPackage#getPin_level_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Pin_level_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see arduinoTrace.States.StatesPackage#getPin_level_Value_Level()
	 * @model unique="false"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.Pin_level_Value#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // Pin_level_Value
