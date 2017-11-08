/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.SpecificDimension;
import arduinoTrace.States.SpecificTracedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface TracedNamedElement extends SpecificTracedObject<SpecificDimension<?>> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList&lt;SpecificDimension&lt;?&gt;&gt; result = new org.eclipse.emf.ecore.util.BasicInternalEList&lt;SpecificDimension&lt;?&gt;&gt;(Object.class);\nresult.addAll(super.getDimensionsInternal());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedNamedElement
