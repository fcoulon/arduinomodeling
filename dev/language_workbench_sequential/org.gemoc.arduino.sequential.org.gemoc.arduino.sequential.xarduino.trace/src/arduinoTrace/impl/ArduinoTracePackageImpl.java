/**
 */
package arduinoTrace.impl;

import arduinoTrace.ArduinoTraceFactory;
import arduinoTrace.ArduinoTracePackage;
import arduinoTrace.SpecificTrace;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.States.impl.StatesPackageImpl;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
public class ArduinoTracePackageImpl extends EPackageImpl implements ArduinoTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTraceEClass = null;

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
	 * @see arduinoTrace.ArduinoTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoTracePackageImpl() {
		super(eNS_URI, ArduinoTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArduinoTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoTracePackage init() {
		if (isInited) return (ArduinoTracePackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI);

		// Obtain or create and register package
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ArduinoPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		LaunchconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.States.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theArduinoPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoTracePackage.eNS_URI, theArduinoTracePackage);
		return theArduinoTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTrace() {
		return specificTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_Delay_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_If_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_Instruction_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_ModuleInstruction_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_Project_Setup_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_Repeat_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_Utilities_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoTraceFactory getArduinoTraceFactory() {
		return (ArduinoTraceFactory)getEFactoryInstance();
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
		specificTraceEClass = createEClass(SPECIFIC_TRACE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_INSTRUCTION_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_MODULE_INSTRUCTION_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE);
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
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTracePackage.getTrace());
		EGenericType g2 = createEGenericType(theTracePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		EGenericType g4 = createEGenericType(theStepsPackage.getSpecificStep());
		g3.setEUpperBound(g4);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g4 = createEGenericType(theStatesPackage.getSpecificState());
		g3.setEUpperBound(g4);
		g2 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g4 = createEGenericType(theStatesPackage.getSpecificDimension());
		g3.setEUpperBound(g4);
		EGenericType g5 = createEGenericType();
		g4.getETypeArguments().add(g5);
		EGenericType g6 = createEGenericType(theStatesPackage.getSpecificValue());
		g5.setEUpperBound(g6);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence(), theStepsPackage.getArduino_BluetoothTransceiver_Push(), null, "Arduino_BluetoothTransceiver_Push_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_Delay_Execute_Sequence(), theStepsPackage.getArduino_Delay_Execute(), null, "Arduino_Delay_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_If_Execute_Sequence(), theStepsPackage.getArduino_If_Execute(), null, "Arduino_If_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_Instruction_Execute_Sequence(), theStepsPackage.getArduino_Instruction_Execute(), null, "Arduino_Instruction_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence(), theStepsPackage.getArduino_ModuleAssignment_Execute(), null, "Arduino_ModuleAssignment_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_ModuleInstruction_Execute_Sequence(), theStepsPackage.getArduino_ModuleInstruction_Execute(), null, "Arduino_ModuleInstruction_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_Project_Setup_Sequence(), theStepsPackage.getArduino_Project_Setup(), null, "Arduino_Project_Setup_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_Repeat_Execute_Sequence(), theStepsPackage.getArduino_Repeat_Execute(), null, "Arduino_Repeat_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_Utilities_Execute_Sequence(), theStepsPackage.getArduino_Utilities_Execute(), null, "Arduino_Utilities_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence(), theStepsPackage.getArduino_VariableAssignment_Execute(), null, "Arduino_VariableAssignment_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence(), theStepsPackage.getArduino_VariableDeclaration_Execute(), null, "Arduino_VariableDeclaration_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArduinoTracePackageImpl
