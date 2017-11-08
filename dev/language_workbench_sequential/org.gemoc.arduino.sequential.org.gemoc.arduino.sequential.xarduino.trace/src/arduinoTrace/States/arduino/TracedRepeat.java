/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.Repeat_i_Dimension;
import arduinoTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sequential.model.arduino.Repeat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedRepeat#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedRepeat#getRepeat_i_Dimension <em>Repeat iDimension</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedRepeat()
 * @model
 * @generated
 */
public interface TracedRepeat extends TracedControl {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Repeat)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedRepeat_OriginalObject()
	 * @model
	 * @generated
	 */
	Repeat getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedRepeat#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Repeat value);

	/**
	 * Returns the value of the '<em><b>Repeat iDimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat iDimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat iDimension</em>' containment reference.
	 * @see #setRepeat_i_Dimension(Repeat_i_Dimension)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedRepeat_Repeat_i_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Repeat_i_Dimension getRepeat_i_Dimension();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedRepeat#getRepeat_i_Dimension <em>Repeat iDimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat iDimension</em>' containment reference.
	 * @see #getRepeat_i_Dimension()
	 * @generated
	 */
	void setRepeat_i_Dimension(Repeat_i_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList&lt;SpecificDimension&lt;?&gt;&gt; result = new org.eclipse.emf.ecore.util.BasicInternalEList&lt;SpecificDimension&lt;?&gt;&gt;(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getRepeat_i_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedRepeat
