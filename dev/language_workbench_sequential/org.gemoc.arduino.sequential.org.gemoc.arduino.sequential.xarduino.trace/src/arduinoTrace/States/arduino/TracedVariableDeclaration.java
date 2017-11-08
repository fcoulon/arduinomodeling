/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sequential.model.arduino.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedVariableDeclaration#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedVariableDeclaration()
 * @model
 * @generated
 */
public interface TracedVariableDeclaration extends TracedInstruction {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(VariableDeclaration)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedVariableDeclaration_OriginalObject()
	 * @model
	 * @generated
	 */
	VariableDeclaration getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedVariableDeclaration#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(VariableDeclaration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList&lt;SpecificDimension&lt;?&gt;&gt; result = new org.eclipse.emf.ecore.util.BasicInternalEList&lt;SpecificDimension&lt;?&gt;&gt;(Object.class);\nresult.addAll(super.getDimensionsInternal());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedVariableDeclaration
