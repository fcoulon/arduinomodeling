/**
 */
package arduinoTrace.Traced.arduino;

import fr.obeo.dsl.arduino.AnalogPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Analog Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedAnalogPin()
 * @model
 * @generated
 */
public interface TracedAnalogPin extends TracedPin {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(AnalogPin)
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedAnalogPin_OriginalObject()
	 * @model
	 * @generated
	 */
	AnalogPin getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.Traced.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(AnalogPin value);

} // TracedAnalogPin
