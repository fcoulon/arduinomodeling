/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Dimension;
import arduinoTrace.States.BluetoothTransceiver_dataReceived_Value;
import arduinoTrace.States.BluetoothTransceiver_dataToSend_Dimension;
import arduinoTrace.States.BluetoothTransceiver_dataToSend_Value;
import arduinoTrace.States.BooleanVariable_value_Dimension;
import arduinoTrace.States.BooleanVariable_value_Value;
import arduinoTrace.States.IntegerVariable_value_Dimension;
import arduinoTrace.States.IntegerVariable_value_Value;
import arduinoTrace.States.Pin_level_Dimension;
import arduinoTrace.States.Pin_level_Value;
import arduinoTrace.States.Repeat_i_Dimension;
import arduinoTrace.States.Repeat_i_Value;
import arduinoTrace.States.SpecificAttributeValue;
import arduinoTrace.States.SpecificDimension;
import arduinoTrace.States.SpecificReferenceValue;
import arduinoTrace.States.SpecificState;
import arduinoTrace.States.SpecificTracedObject;
import arduinoTrace.States.SpecificValue;
import arduinoTrace.States.StatesFactory;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.trace.commons.model.launchconfiguration.LaunchconfigurationPackage;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import org.gemoc.sequential.model.arduino.ArduinoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothTransceiver_dataReceived_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothTransceiver_dataReceived_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothTransceiver_dataToSend_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothTransceiver_dataToSend_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariable_value_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariable_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariable_value_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariable_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pin_level_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pin_level_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeat_i_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeat_i_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTracedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificValueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arduinoTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ArduinoPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		LaunchconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.States.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theArduinoPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothTransceiver_dataReceived_Dimension() {
		return bluetoothTransceiver_dataReceived_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothTransceiver_dataReceived_Value() {
		return bluetoothTransceiver_dataReceived_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothTransceiver_dataReceived_Value_DataReceived() {
		return (EAttribute)bluetoothTransceiver_dataReceived_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothTransceiver_dataToSend_Dimension() {
		return bluetoothTransceiver_dataToSend_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothTransceiver_dataToSend_Value() {
		return bluetoothTransceiver_dataToSend_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothTransceiver_dataToSend_Value_DataToSend() {
		return (EAttribute)bluetoothTransceiver_dataToSend_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable_value_Dimension() {
		return booleanVariable_value_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable_value_Value() {
		return booleanVariable_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_value_Value_Value() {
		return (EAttribute)booleanVariable_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable_value_Dimension() {
		return integerVariable_value_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable_value_Value() {
		return integerVariable_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVariable_value_Value_Value() {
		return (EAttribute)integerVariable_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin_level_Dimension() {
		return pin_level_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin_level_Value() {
		return pin_level_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_level_Value_Level() {
		return (EAttribute)pin_level_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat_i_Dimension() {
		return repeat_i_DimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat_i_Value() {
		return repeat_i_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeat_i_Value_I() {
		return (EAttribute)repeat_i_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificAttributeValue() {
		return specificAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDimension() {
		return specificDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificReferenceValue() {
		return specificReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificState() {
		return specificStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTracedObject() {
		return specificTracedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificValue() {
		return specificValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bluetoothTransceiver_dataReceived_DimensionEClass = createEClass(BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION);

		bluetoothTransceiver_dataReceived_ValueEClass = createEClass(BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE);
		createEAttribute(bluetoothTransceiver_dataReceived_ValueEClass, BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED);

		bluetoothTransceiver_dataToSend_DimensionEClass = createEClass(BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION);

		bluetoothTransceiver_dataToSend_ValueEClass = createEClass(BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE);
		createEAttribute(bluetoothTransceiver_dataToSend_ValueEClass, BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND);

		booleanVariable_value_DimensionEClass = createEClass(BOOLEAN_VARIABLE_VALUE_DIMENSION);

		booleanVariable_value_ValueEClass = createEClass(BOOLEAN_VARIABLE_VALUE_VALUE);
		createEAttribute(booleanVariable_value_ValueEClass, BOOLEAN_VARIABLE_VALUE_VALUE__VALUE);

		integerVariable_value_DimensionEClass = createEClass(INTEGER_VARIABLE_VALUE_DIMENSION);

		integerVariable_value_ValueEClass = createEClass(INTEGER_VARIABLE_VALUE_VALUE);
		createEAttribute(integerVariable_value_ValueEClass, INTEGER_VARIABLE_VALUE_VALUE__VALUE);

		pin_level_DimensionEClass = createEClass(PIN_LEVEL_DIMENSION);

		pin_level_ValueEClass = createEClass(PIN_LEVEL_VALUE);
		createEAttribute(pin_level_ValueEClass, PIN_LEVEL_VALUE__LEVEL);

		repeat_i_DimensionEClass = createEClass(REPEAT_IDIMENSION);

		repeat_i_ValueEClass = createEClass(REPEAT_IVALUE);
		createEAttribute(repeat_i_ValueEClass, REPEAT_IVALUE__I);

		specificAttributeValueEClass = createEClass(SPECIFIC_ATTRIBUTE_VALUE);

		specificDimensionEClass = createEClass(SPECIFIC_DIMENSION);

		specificReferenceValueEClass = createEClass(SPECIFIC_REFERENCE_VALUE);

		specificStateEClass = createEClass(SPECIFIC_STATE);

		specificTracedObjectEClass = createEClass(SPECIFIC_TRACED_OBJECT);

		specificValueEClass = createEClass(SPECIFIC_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		arduinoTrace.States.arduino.ArduinoPackage theArduinoPackage_1 = (arduinoTrace.States.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theArduinoPackage_1);

		// Create type parameters
		ETypeParameter specificDimensionEClass_ValueSubType = addETypeParameter(specificDimensionEClass, "ValueSubType");
		addETypeParameter(specificReferenceValueEClass, "T");
		ETypeParameter specificTracedObjectEClass_DimensionSubType = addETypeParameter(specificTracedObjectEClass, "DimensionSubType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSpecificValue());
		specificDimensionEClass_ValueSubType.getEBounds().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getSpecificValue());
		g2.setEUpperBound(g3);
		specificTracedObjectEClass_DimensionSubType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getBluetoothTransceiver_dataReceived_Value());
		g1.getETypeArguments().add(g2);
		bluetoothTransceiver_dataReceived_DimensionEClass.getEGenericSuperTypes().add(g1);
		bluetoothTransceiver_dataReceived_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getBluetoothTransceiver_dataToSend_Value());
		g1.getETypeArguments().add(g2);
		bluetoothTransceiver_dataToSend_DimensionEClass.getEGenericSuperTypes().add(g1);
		bluetoothTransceiver_dataToSend_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getBooleanVariable_value_Value());
		g1.getETypeArguments().add(g2);
		booleanVariable_value_DimensionEClass.getEGenericSuperTypes().add(g1);
		booleanVariable_value_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getIntegerVariable_value_Value());
		g1.getETypeArguments().add(g2);
		integerVariable_value_DimensionEClass.getEGenericSuperTypes().add(g1);
		integerVariable_value_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getPin_level_Value());
		g1.getETypeArguments().add(g2);
		pin_level_DimensionEClass.getEGenericSuperTypes().add(g1);
		pin_level_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getRepeat_i_Value());
		g1.getETypeArguments().add(g2);
		repeat_i_DimensionEClass.getEGenericSuperTypes().add(g1);
		repeat_i_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		specificAttributeValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getDimension());
		g2 = createEGenericType(specificDimensionEClass_ValueSubType);
		g1.getETypeArguments().add(g2);
		specificDimensionEClass.getEGenericSuperTypes().add(g1);
		specificReferenceValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getState());
		g2 = createEGenericType(theStepsPackage.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSpecificValue());
		g1.getETypeArguments().add(g2);
		specificStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getTracedObject());
		g2 = createEGenericType(specificTracedObjectEClass_DimensionSubType);
		g1.getETypeArguments().add(g2);
		specificTracedObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getValue());
		g2 = createEGenericType(this.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificValueEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(bluetoothTransceiver_dataReceived_DimensionEClass, BluetoothTransceiver_dataReceived_Dimension.class, "BluetoothTransceiver_dataReceived_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bluetoothTransceiver_dataReceived_ValueEClass, BluetoothTransceiver_dataReceived_Value.class, "BluetoothTransceiver_dataReceived_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBluetoothTransceiver_dataReceived_Value_DataReceived(), ecorePackage.getEEList(), "dataReceived", null, 0, 1, BluetoothTransceiver_dataReceived_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bluetoothTransceiver_dataToSend_DimensionEClass, BluetoothTransceiver_dataToSend_Dimension.class, "BluetoothTransceiver_dataToSend_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bluetoothTransceiver_dataToSend_ValueEClass, BluetoothTransceiver_dataToSend_Value.class, "BluetoothTransceiver_dataToSend_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBluetoothTransceiver_dataToSend_Value_DataToSend(), ecorePackage.getEEList(), "dataToSend", null, 0, 1, BluetoothTransceiver_dataToSend_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariable_value_DimensionEClass, BooleanVariable_value_Dimension.class, "BooleanVariable_value_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariable_value_ValueEClass, BooleanVariable_value_Value.class, "BooleanVariable_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVariable_value_Value_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariable_value_DimensionEClass, IntegerVariable_value_Dimension.class, "IntegerVariable_value_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerVariable_value_ValueEClass, IntegerVariable_value_Value.class, "IntegerVariable_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVariable_value_Value_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pin_level_DimensionEClass, Pin_level_Dimension.class, "Pin_level_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pin_level_ValueEClass, Pin_level_Value.class, "Pin_level_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_level_Value_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Pin_level_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeat_i_DimensionEClass, Repeat_i_Dimension.class, "Repeat_i_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeat_i_ValueEClass, Repeat_i_Value.class, "Repeat_i_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_i_Value_I(), ecorePackage.getEInt(), "i", null, 0, 1, Repeat_i_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificAttributeValueEClass, SpecificAttributeValue.class, "SpecificAttributeValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificDimensionEClass, SpecificDimension.class, "SpecificDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificReferenceValueEClass, SpecificReferenceValue.class, "SpecificReferenceValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStateEClass, SpecificState.class, "SpecificState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificTracedObjectEClass, SpecificTracedObject.class, "SpecificTracedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificValueEClass, SpecificValue.class, "SpecificValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (bluetoothTransceiver_dataReceived_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (bluetoothTransceiver_dataToSend_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanVariable_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerVariable_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (pin_level_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (repeat_i_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

} //StatesPackageImpl
