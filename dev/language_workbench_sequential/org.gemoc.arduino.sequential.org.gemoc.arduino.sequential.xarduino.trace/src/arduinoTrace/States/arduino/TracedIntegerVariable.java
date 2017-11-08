/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.IntegerVariable_value_Dimension;
import arduinoTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sequential.model.arduino.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedIntegerVariable#getIntegerVariable_value_Dimension <em>Integer Variable value Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedIntegerVariable()
 * @model
 * @generated
 */
public interface TracedIntegerVariable extends TracedVariable {
	/**
	 * Returns the value of the '<em><b>Integer Variable value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Variable value Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Variable value Dimension</em>' containment reference.
	 * @see #setIntegerVariable_value_Dimension(IntegerVariable_value_Dimension)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedIntegerVariable_IntegerVariable_value_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	IntegerVariable_value_Dimension getIntegerVariable_value_Dimension();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getIntegerVariable_value_Dimension <em>Integer Variable value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Variable value Dimension</em>' containment reference.
	 * @see #getIntegerVariable_value_Dimension()
	 * @generated
	 */
	void setIntegerVariable_value_Dimension(IntegerVariable_value_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(IntegerVariable)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedIntegerVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	IntegerVariable getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(IntegerVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList&lt;SpecificDimension&lt;?&gt;&gt; result = new org.eclipse.emf.ecore.util.BasicInternalEList&lt;SpecificDimension&lt;?&gt;&gt;(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getIntegerVariable_value_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedIntegerVariable
