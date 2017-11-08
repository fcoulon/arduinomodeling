/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.Pin_level_Dimension;
import arduinoTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedPin#getPin_level_Dimension <em>Pin level Dimension</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedPin()
 * @model abstract="true"
 * @generated
 */
public interface TracedPin extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Pin level Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin level Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin level Dimension</em>' containment reference.
	 * @see #setPin_level_Dimension(Pin_level_Dimension)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedPin_Pin_level_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Pin_level_Dimension getPin_level_Dimension();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedPin#getPin_level_Dimension <em>Pin level Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin level Dimension</em>' containment reference.
	 * @see #getPin_level_Dimension()
	 * @generated
	 */
	void setPin_level_Dimension(Pin_level_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList&lt;SpecificDimension&lt;?&gt;&gt; result = new org.eclipse.emf.ecore.util.BasicInternalEList&lt;SpecificDimension&lt;?&gt;&gt;(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getPin_level_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedPin
