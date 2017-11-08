/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.BooleanVariable_value_Dimension;
import arduinoTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sequential.model.arduino.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedBooleanVariable#getBooleanVariable_value_Dimension <em>Boolean Variable value Dimension</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBooleanVariable()
 * @model
 * @generated
 */
public interface TracedBooleanVariable extends TracedVariable {
	/**
	 * Returns the value of the '<em><b>Boolean Variable value Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Variable value Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Variable value Dimension</em>' containment reference.
	 * @see #setBooleanVariable_value_Dimension(BooleanVariable_value_Dimension)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBooleanVariable_BooleanVariable_value_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVariable_value_Dimension getBooleanVariable_value_Dimension();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getBooleanVariable_value_Dimension <em>Boolean Variable value Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Variable value Dimension</em>' containment reference.
	 * @see #getBooleanVariable_value_Dimension()
	 * @generated
	 */
	void setBooleanVariable_value_Dimension(BooleanVariable_value_Dimension value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(BooleanVariable)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBooleanVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	BooleanVariable getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(BooleanVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList&lt;SpecificDimension&lt;?&gt;&gt; result = new org.eclipse.emf.ecore.util.BasicInternalEList&lt;SpecificDimension&lt;?&gt;&gt;(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getBooleanVariable_value_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedBooleanVariable
