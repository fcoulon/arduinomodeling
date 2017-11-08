/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.SpecificDimension;
import arduinoTrace.States.SpecificTracedObject;
import arduinoTrace.States.SpecificValue;
import arduinoTrace.States.StatesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.trace.commons.model.trace.impl.TracedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Traced Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SpecificTracedObjectImpl<DimensionSubType extends SpecificDimension<? extends SpecificValue>> extends TracedObjectImpl<DimensionSubType> implements SpecificTracedObject<DimensionSubType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTracedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.SPECIFIC_TRACED_OBJECT;
	}

} //SpecificTracedObjectImpl
