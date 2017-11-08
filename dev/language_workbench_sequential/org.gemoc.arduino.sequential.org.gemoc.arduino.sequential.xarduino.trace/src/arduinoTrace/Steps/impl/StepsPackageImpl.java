/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.States.impl.StatesPackageImpl;

import arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push;
import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep;
import arduinoTrace.Steps.Arduino_Instruction_Execute;
import arduinoTrace.Steps.Arduino_Instruction_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Instruction_Execute_ImplicitStep;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_ModuleInstruction_Execute;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Repeat_Execute_ImplicitStep;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
import arduinoTrace.Steps.RootImplicitStep;
import arduinoTrace.Steps.SpecificRootStep;
import arduinoTrace.Steps.SpecificStep;
import arduinoTrace.Steps.StepsFactory;
import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
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
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_BluetoothTransceiver_PushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Delay_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_If_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_If_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_If_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Instruction_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Instruction_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Instruction_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleAssignment_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleInstruction_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Project_SetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Repeat_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Repeat_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Repeat_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Utilities_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableAssignment_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableDeclaration_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificRootStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

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
	 * @see arduinoTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		ArduinoPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		LaunchconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.States.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theArduinoPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_BluetoothTransceiver_Push() {
		return arduino_BluetoothTransceiver_PushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Delay_Execute() {
		return arduino_Delay_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_If_Execute() {
		return arduino_If_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_If_Execute_AbstractSubStep() {
		return arduino_If_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_If_Execute_ImplicitStep() {
		return arduino_If_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Instruction_Execute() {
		return arduino_Instruction_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Instruction_Execute_AbstractSubStep() {
		return arduino_Instruction_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Instruction_Execute_ImplicitStep() {
		return arduino_Instruction_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleAssignment_Execute() {
		return arduino_ModuleAssignment_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleInstruction_Execute() {
		return arduino_ModuleInstruction_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Project_Setup() {
		return arduino_Project_SetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Repeat_Execute() {
		return arduino_Repeat_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Repeat_Execute_AbstractSubStep() {
		return arduino_Repeat_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Repeat_Execute_ImplicitStep() {
		return arduino_Repeat_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Utilities_Execute() {
		return arduino_Utilities_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableAssignment_Execute() {
		return arduino_VariableAssignment_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableDeclaration_Execute() {
		return arduino_VariableDeclaration_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificRootStep() {
		return specificRootStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
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
		arduino_BluetoothTransceiver_PushEClass = createEClass(ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH);

		arduino_Delay_ExecuteEClass = createEClass(ARDUINO_DELAY_EXECUTE);

		arduino_If_ExecuteEClass = createEClass(ARDUINO_IF_EXECUTE);

		arduino_If_Execute_AbstractSubStepEClass = createEClass(ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_If_Execute_ImplicitStepEClass = createEClass(ARDUINO_IF_EXECUTE_IMPLICIT_STEP);

		arduino_Instruction_ExecuteEClass = createEClass(ARDUINO_INSTRUCTION_EXECUTE);

		arduino_Instruction_Execute_AbstractSubStepEClass = createEClass(ARDUINO_INSTRUCTION_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Instruction_Execute_ImplicitStepEClass = createEClass(ARDUINO_INSTRUCTION_EXECUTE_IMPLICIT_STEP);

		arduino_ModuleAssignment_ExecuteEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_EXECUTE);

		arduino_ModuleInstruction_ExecuteEClass = createEClass(ARDUINO_MODULE_INSTRUCTION_EXECUTE);

		arduino_Project_SetupEClass = createEClass(ARDUINO_PROJECT_SETUP);

		arduino_Repeat_ExecuteEClass = createEClass(ARDUINO_REPEAT_EXECUTE);

		arduino_Repeat_Execute_AbstractSubStepEClass = createEClass(ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Repeat_Execute_ImplicitStepEClass = createEClass(ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP);

		arduino_Utilities_ExecuteEClass = createEClass(ARDUINO_UTILITIES_EXECUTE);

		arduino_VariableAssignment_ExecuteEClass = createEClass(ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE);

		arduino_VariableDeclaration_ExecuteEClass = createEClass(ARDUINO_VARIABLE_DECLARATION_EXECUTE);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificRootStepEClass = createEClass(SPECIFIC_ROOT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		arduinoTrace.States.arduino.ArduinoPackage theArduinoPackage_1 = (arduinoTrace.States.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI);
		ArduinoPackage theArduinoPackage = (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		arduino_BluetoothTransceiver_PushEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_BluetoothTransceiver_PushEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_Delay_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_Delay_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_If_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getArduino_If_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_If_ExecuteEClass.getEGenericSuperTypes().add(g1);
		arduino_If_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getArduino_If_Execute_AbstractSubStep());
		arduino_If_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_If_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArduino_If_Execute_AbstractSubStep());
		arduino_Instruction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_Instruction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_Instruction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getArduino_Instruction_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_Instruction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getArduino_Instruction_Execute_AbstractSubStep());
		arduino_Instruction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		arduino_Instruction_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getArduino_Instruction_Execute_AbstractSubStep());
		arduino_Instruction_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_Instruction_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_ModuleAssignment_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_ModuleAssignment_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_ModuleInstruction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_ModuleInstruction_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_Project_SetupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_Project_SetupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_Repeat_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getArduino_Repeat_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_Repeat_ExecuteEClass.getEGenericSuperTypes().add(g1);
		arduino_Repeat_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_Repeat_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_Repeat_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_Utilities_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_Utilities_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_VariableAssignment_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_VariableAssignment_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		arduino_VariableDeclaration_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		arduino_VariableDeclaration_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		rootImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificStepEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(arduino_BluetoothTransceiver_PushEClass, Arduino_BluetoothTransceiver_Push.class, "Arduino_BluetoothTransceiver_Push", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_BluetoothTransceiver_PushEClass, theArduinoPackage_1.getTracedBluetoothTransceiver(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_Delay_ExecuteEClass, Arduino_Delay_Execute.class, "Arduino_Delay_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_Delay_ExecuteEClass, theArduinoPackage_1.getTracedDelay(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_If_ExecuteEClass, Arduino_If_Execute.class, "Arduino_If_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_If_ExecuteEClass, theArduinoPackage_1.getTracedIf(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_If_Execute_AbstractSubStepEClass, Arduino_If_Execute_AbstractSubStep.class, "Arduino_If_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_If_Execute_ImplicitStepEClass, Arduino_If_Execute_ImplicitStep.class, "Arduino_If_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Instruction_ExecuteEClass, Arduino_Instruction_Execute.class, "Arduino_Instruction_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_Instruction_ExecuteEClass, theArduinoPackage_1.getTracedInstruction(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_Instruction_Execute_AbstractSubStepEClass, Arduino_Instruction_Execute_AbstractSubStep.class, "Arduino_Instruction_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Instruction_Execute_ImplicitStepEClass, Arduino_Instruction_Execute_ImplicitStep.class, "Arduino_Instruction_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_ModuleAssignment_ExecuteEClass, Arduino_ModuleAssignment_Execute.class, "Arduino_ModuleAssignment_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_ModuleAssignment_ExecuteEClass, theArduinoPackage_1.getTracedModuleAssignment(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_ModuleInstruction_ExecuteEClass, Arduino_ModuleInstruction_Execute.class, "Arduino_ModuleInstruction_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_ModuleInstruction_ExecuteEClass, theArduinoPackage_1.getTracedModuleInstruction(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_Project_SetupEClass, Arduino_Project_Setup.class, "Arduino_Project_Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_Project_SetupEClass, theArduinoPackage.getProject(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_Repeat_ExecuteEClass, Arduino_Repeat_Execute.class, "Arduino_Repeat_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_Repeat_ExecuteEClass, theArduinoPackage_1.getTracedRepeat(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_Repeat_Execute_AbstractSubStepEClass, Arduino_Repeat_Execute_AbstractSubStep.class, "Arduino_Repeat_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Repeat_Execute_ImplicitStepEClass, Arduino_Repeat_Execute_ImplicitStep.class, "Arduino_Repeat_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Utilities_ExecuteEClass, Arduino_Utilities_Execute.class, "Arduino_Utilities_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_Utilities_ExecuteEClass, theArduinoPackage_1.getTracedUtilities(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_VariableAssignment_ExecuteEClass, Arduino_VariableAssignment_Execute.class, "Arduino_VariableAssignment_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_VariableAssignment_ExecuteEClass, theArduinoPackage_1.getTracedVariableAssignment(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_VariableDeclaration_ExecuteEClass, Arduino_VariableDeclaration_Execute.class, "Arduino_VariableDeclaration_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduino_VariableDeclaration_ExecuteEClass, theArduinoPackage_1.getTracedVariableDeclaration(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificRootStepEClass, SpecificRootStep.class, "SpecificRootStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StepsPackageImpl
