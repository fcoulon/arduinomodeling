/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.ArduinoFactory;
import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedAmbientLightSensor;
import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedArduinoAnalogModule;
import arduinoTrace.States.arduino.TracedArduinoBoard;
import arduinoTrace.States.arduino.TracedArduinoCommunicationModule;
import arduinoTrace.States.arduino.TracedArduinoDigitalModule;
import arduinoTrace.States.arduino.TracedArduinoModule;
import arduinoTrace.States.arduino.TracedAssignment;
import arduinoTrace.States.arduino.TracedBluetoothTransceiver;
import arduinoTrace.States.arduino.TracedBoard;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedBuzzer;
import arduinoTrace.States.arduino.TracedControl;
import arduinoTrace.States.arduino.TracedDelay;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedFan;
import arduinoTrace.States.arduino.TracedIf;
import arduinoTrace.States.arduino.TracedInfraRedSensor;
import arduinoTrace.States.arduino.TracedInstruction;
import arduinoTrace.States.arduino.TracedIntegerVariable;
import arduinoTrace.States.arduino.TracedLED;
import arduinoTrace.States.arduino.TracedMicroServo;
import arduinoTrace.States.arduino.TracedModule;
import arduinoTrace.States.arduino.TracedModuleAssignment;
import arduinoTrace.States.arduino.TracedModuleInstruction;
import arduinoTrace.States.arduino.TracedMusicPlayer;
import arduinoTrace.States.arduino.TracedNamedElement;
import arduinoTrace.States.arduino.TracedPin;
import arduinoTrace.States.arduino.TracedPushButton;
import arduinoTrace.States.arduino.TracedRepeat;
import arduinoTrace.States.arduino.TracedRotationSensor;
import arduinoTrace.States.arduino.TracedSketch;
import arduinoTrace.States.arduino.TracedSoundSensor;
import arduinoTrace.States.arduino.TracedUtilities;
import arduinoTrace.States.arduino.TracedVariable;
import arduinoTrace.States.arduino.TracedVariableAssignment;
import arduinoTrace.States.arduino.TracedVariableDeclaration;
import arduinoTrace.States.arduino.TracedWhile;

import arduinoTrace.States.impl.StatesPackageImpl;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.trace.commons.model.launchconfiguration.LaunchconfigurationPackage;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAmbientLightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAnalogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoAnalogModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoCommunicationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoDigitalModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBluetoothTransceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBuzzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDigitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInfraRedSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLEDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMicroServoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedModuleAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedModuleInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMusicPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPushButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRotationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSoundSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedUtilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedWhileEClass = null;

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
	 * @see arduinoTrace.States.arduino.ArduinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoPackageImpl() {
		super(eNS_URI, ArduinoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoPackage init() {
		if (isInited) return (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Obtain or create and register package
		ArduinoPackageImpl theArduinoPackage = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		LaunchconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
		return theArduinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAmbientLightSensor() {
		return tracedAmbientLightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAmbientLightSensor_OriginalObject() {
		return (EReference)tracedAmbientLightSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAnalogPin() {
		return tracedAnalogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAnalogPin_OriginalObject() {
		return (EReference)tracedAnalogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoAnalogModule() {
		return tracedArduinoAnalogModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoBoard() {
		return tracedArduinoBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedArduinoBoard_OriginalObject() {
		return (EReference)tracedArduinoBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoCommunicationModule() {
		return tracedArduinoCommunicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoDigitalModule() {
		return tracedArduinoDigitalModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoModule() {
		return tracedArduinoModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAssignment() {
		return tracedAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBluetoothTransceiver() {
		return tracedBluetoothTransceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_BluetoothTransceiver_dataReceived_Dimension() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_BluetoothTransceiver_dataToSend_Dimension() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_OriginalObject() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBoard() {
		return tracedBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanVariable() {
		return tracedBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_BooleanVariable_value_Dimension() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_OriginalObject() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBuzzer() {
		return tracedBuzzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBuzzer_OriginalObject() {
		return (EReference)tracedBuzzerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControl() {
		return tracedControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDelay() {
		return tracedDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDelay_OriginalObject() {
		return (EReference)tracedDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDigitalPin() {
		return tracedDigitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDigitalPin_OriginalObject() {
		return (EReference)tracedDigitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFan() {
		return tracedFanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFan_OriginalObject() {
		return (EReference)tracedFanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIf() {
		return tracedIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIf_OriginalObject() {
		return (EReference)tracedIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInfraRedSensor() {
		return tracedInfraRedSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInfraRedSensor_OriginalObject() {
		return (EReference)tracedInfraRedSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInstruction() {
		return tracedInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerVariable() {
		return tracedIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_IntegerVariable_value_Dimension() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_OriginalObject() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLED() {
		return tracedLEDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedLED_OriginalObject() {
		return (EReference)tracedLEDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMicroServo() {
		return tracedMicroServoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedMicroServo_OriginalObject() {
		return (EReference)tracedMicroServoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedModule() {
		return tracedModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedModuleAssignment() {
		return tracedModuleAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedModuleAssignment_OriginalObject() {
		return (EReference)tracedModuleAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedModuleInstruction() {
		return tracedModuleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMusicPlayer() {
		return tracedMusicPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedMusicPlayer_OriginalObject() {
		return (EReference)tracedMusicPlayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElement() {
		return tracedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPin() {
		return tracedPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPin_Pin_level_Dimension() {
		return (EReference)tracedPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPushButton() {
		return tracedPushButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPushButton_OriginalObject() {
		return (EReference)tracedPushButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRepeat() {
		return tracedRepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedRepeat_OriginalObject() {
		return (EReference)tracedRepeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedRepeat_Repeat_i_Dimension() {
		return (EReference)tracedRepeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRotationSensor() {
		return tracedRotationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedRotationSensor_OriginalObject() {
		return (EReference)tracedRotationSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSketch() {
		return tracedSketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSketch_OriginalObject() {
		return (EReference)tracedSketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSoundSensor() {
		return tracedSoundSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSoundSensor_OriginalObject() {
		return (EReference)tracedSoundSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedUtilities() {
		return tracedUtilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariable() {
		return tracedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariableAssignment() {
		return tracedVariableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariableAssignment_OriginalObject() {
		return (EReference)tracedVariableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariableDeclaration() {
		return tracedVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariableDeclaration_OriginalObject() {
		return (EReference)tracedVariableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedWhile() {
		return tracedWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedWhile_OriginalObject() {
		return (EReference)tracedWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactory getArduinoFactory() {
		return (ArduinoFactory)getEFactoryInstance();
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
		tracedAmbientLightSensorEClass = createEClass(TRACED_AMBIENT_LIGHT_SENSOR);
		createEReference(tracedAmbientLightSensorEClass, TRACED_AMBIENT_LIGHT_SENSOR__ORIGINAL_OBJECT);

		tracedAnalogPinEClass = createEClass(TRACED_ANALOG_PIN);
		createEReference(tracedAnalogPinEClass, TRACED_ANALOG_PIN__ORIGINAL_OBJECT);

		tracedArduinoAnalogModuleEClass = createEClass(TRACED_ARDUINO_ANALOG_MODULE);

		tracedArduinoBoardEClass = createEClass(TRACED_ARDUINO_BOARD);
		createEReference(tracedArduinoBoardEClass, TRACED_ARDUINO_BOARD__ORIGINAL_OBJECT);

		tracedArduinoCommunicationModuleEClass = createEClass(TRACED_ARDUINO_COMMUNICATION_MODULE);

		tracedArduinoDigitalModuleEClass = createEClass(TRACED_ARDUINO_DIGITAL_MODULE);

		tracedArduinoModuleEClass = createEClass(TRACED_ARDUINO_MODULE);

		tracedAssignmentEClass = createEClass(TRACED_ASSIGNMENT);

		tracedBluetoothTransceiverEClass = createEClass(TRACED_BLUETOOTH_TRANSCEIVER);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_DIMENSION);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_DIMENSION);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT);

		tracedBoardEClass = createEClass(TRACED_BOARD);

		tracedBooleanVariableEClass = createEClass(TRACED_BOOLEAN_VARIABLE);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__BOOLEAN_VARIABLE_VALUE_DIMENSION);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT);

		tracedBuzzerEClass = createEClass(TRACED_BUZZER);
		createEReference(tracedBuzzerEClass, TRACED_BUZZER__ORIGINAL_OBJECT);

		tracedControlEClass = createEClass(TRACED_CONTROL);

		tracedDelayEClass = createEClass(TRACED_DELAY);
		createEReference(tracedDelayEClass, TRACED_DELAY__ORIGINAL_OBJECT);

		tracedDigitalPinEClass = createEClass(TRACED_DIGITAL_PIN);
		createEReference(tracedDigitalPinEClass, TRACED_DIGITAL_PIN__ORIGINAL_OBJECT);

		tracedFanEClass = createEClass(TRACED_FAN);
		createEReference(tracedFanEClass, TRACED_FAN__ORIGINAL_OBJECT);

		tracedIfEClass = createEClass(TRACED_IF);
		createEReference(tracedIfEClass, TRACED_IF__ORIGINAL_OBJECT);

		tracedInfraRedSensorEClass = createEClass(TRACED_INFRA_RED_SENSOR);
		createEReference(tracedInfraRedSensorEClass, TRACED_INFRA_RED_SENSOR__ORIGINAL_OBJECT);

		tracedInstructionEClass = createEClass(TRACED_INSTRUCTION);

		tracedIntegerVariableEClass = createEClass(TRACED_INTEGER_VARIABLE);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__INTEGER_VARIABLE_VALUE_DIMENSION);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT);

		tracedLEDEClass = createEClass(TRACED_LED);
		createEReference(tracedLEDEClass, TRACED_LED__ORIGINAL_OBJECT);

		tracedMicroServoEClass = createEClass(TRACED_MICRO_SERVO);
		createEReference(tracedMicroServoEClass, TRACED_MICRO_SERVO__ORIGINAL_OBJECT);

		tracedModuleEClass = createEClass(TRACED_MODULE);

		tracedModuleAssignmentEClass = createEClass(TRACED_MODULE_ASSIGNMENT);
		createEReference(tracedModuleAssignmentEClass, TRACED_MODULE_ASSIGNMENT__ORIGINAL_OBJECT);

		tracedModuleInstructionEClass = createEClass(TRACED_MODULE_INSTRUCTION);

		tracedMusicPlayerEClass = createEClass(TRACED_MUSIC_PLAYER);
		createEReference(tracedMusicPlayerEClass, TRACED_MUSIC_PLAYER__ORIGINAL_OBJECT);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedPinEClass = createEClass(TRACED_PIN);
		createEReference(tracedPinEClass, TRACED_PIN__PIN_LEVEL_DIMENSION);

		tracedPushButtonEClass = createEClass(TRACED_PUSH_BUTTON);
		createEReference(tracedPushButtonEClass, TRACED_PUSH_BUTTON__ORIGINAL_OBJECT);

		tracedRepeatEClass = createEClass(TRACED_REPEAT);
		createEReference(tracedRepeatEClass, TRACED_REPEAT__ORIGINAL_OBJECT);
		createEReference(tracedRepeatEClass, TRACED_REPEAT__REPEAT_IDIMENSION);

		tracedRotationSensorEClass = createEClass(TRACED_ROTATION_SENSOR);
		createEReference(tracedRotationSensorEClass, TRACED_ROTATION_SENSOR__ORIGINAL_OBJECT);

		tracedSketchEClass = createEClass(TRACED_SKETCH);
		createEReference(tracedSketchEClass, TRACED_SKETCH__ORIGINAL_OBJECT);

		tracedSoundSensorEClass = createEClass(TRACED_SOUND_SENSOR);
		createEReference(tracedSoundSensorEClass, TRACED_SOUND_SENSOR__ORIGINAL_OBJECT);

		tracedUtilitiesEClass = createEClass(TRACED_UTILITIES);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);

		tracedVariableAssignmentEClass = createEClass(TRACED_VARIABLE_ASSIGNMENT);
		createEReference(tracedVariableAssignmentEClass, TRACED_VARIABLE_ASSIGNMENT__ORIGINAL_OBJECT);

		tracedVariableDeclarationEClass = createEClass(TRACED_VARIABLE_DECLARATION);
		createEReference(tracedVariableDeclarationEClass, TRACED_VARIABLE_DECLARATION__ORIGINAL_OBJECT);

		tracedWhileEClass = createEClass(TRACED_WHILE);
		createEReference(tracedWhileEClass, TRACED_WHILE__ORIGINAL_OBJECT);
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
		org.gemoc.sequential.model.arduino.ArduinoPackage theArduinoPackage_1 = (org.gemoc.sequential.model.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(org.gemoc.sequential.model.arduino.ArduinoPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedAmbientLightSensorEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedAnalogPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedArduinoAnalogModuleEClass.getESuperTypes().add(this.getTracedArduinoModule());
		tracedArduinoBoardEClass.getESuperTypes().add(this.getTracedBoard());
		tracedArduinoCommunicationModuleEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedArduinoDigitalModuleEClass.getESuperTypes().add(this.getTracedArduinoModule());
		tracedArduinoModuleEClass.getESuperTypes().add(this.getTracedModule());
		tracedAssignmentEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedBluetoothTransceiverEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedBoardEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedBuzzerEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedControlEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedDelayEClass.getESuperTypes().add(this.getTracedUtilities());
		tracedDigitalPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedFanEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedIfEClass.getESuperTypes().add(this.getTracedControl());
		tracedInfraRedSensorEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		EGenericType g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedInstructionEClass.getEGenericSuperTypes().add(g1);
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedLEDEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedMicroServoEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedModuleEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedModuleAssignmentEClass.getESuperTypes().add(this.getTracedModuleInstruction());
		tracedModuleAssignmentEClass.getESuperTypes().add(this.getTracedAssignment());
		tracedModuleInstructionEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedMusicPlayerEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		g1 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g2 = createEGenericType(theStatesPackage.getSpecificDimension());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		tracedNamedElementEClass.getEGenericSuperTypes().add(g1);
		tracedPinEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedPushButtonEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedRepeatEClass.getESuperTypes().add(this.getTracedControl());
		tracedRotationSensorEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedSketchEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedSoundSensorEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedUtilitiesEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedVariableEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedVariableAssignmentEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedVariableAssignmentEClass.getESuperTypes().add(this.getTracedAssignment());
		tracedVariableDeclarationEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedWhileEClass.getESuperTypes().add(this.getTracedControl());

		// Initialize classes and features; add operations and parameters
		initEClass(tracedAmbientLightSensorEClass, TracedAmbientLightSensor.class, "TracedAmbientLightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAmbientLightSensor_OriginalObject(), theArduinoPackage_1.getAmbientLightSensor(), null, "originalObject", null, 0, 1, TracedAmbientLightSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(tracedAmbientLightSensorEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedAnalogPinEClass, TracedAnalogPin.class, "TracedAnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAnalogPin_OriginalObject(), theArduinoPackage_1.getAnalogPin(), null, "originalObject", null, 0, 1, TracedAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedAnalogPinEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedArduinoAnalogModuleEClass, TracedArduinoAnalogModule.class, "TracedArduinoAnalogModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedArduinoAnalogModuleEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedArduinoBoardEClass, TracedArduinoBoard.class, "TracedArduinoBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedArduinoBoard_OriginalObject(), theArduinoPackage_1.getArduinoBoard(), null, "originalObject", null, 0, 1, TracedArduinoBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedArduinoBoardEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedArduinoCommunicationModuleEClass, TracedArduinoCommunicationModule.class, "TracedArduinoCommunicationModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedArduinoCommunicationModuleEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedArduinoDigitalModuleEClass, TracedArduinoDigitalModule.class, "TracedArduinoDigitalModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedArduinoDigitalModuleEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedArduinoModuleEClass, TracedArduinoModule.class, "TracedArduinoModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedArduinoModuleEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedAssignmentEClass, TracedAssignment.class, "TracedAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedAssignmentEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBluetoothTransceiverEClass, TracedBluetoothTransceiver.class, "TracedBluetoothTransceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBluetoothTransceiver_BluetoothTransceiver_dataReceived_Dimension(), theStatesPackage.getBluetoothTransceiver_dataReceived_Dimension(), null, "bluetoothTransceiver_dataReceived_Dimension", null, 0, 1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBluetoothTransceiver_BluetoothTransceiver_dataToSend_Dimension(), theStatesPackage.getBluetoothTransceiver_dataToSend_Dimension(), null, "bluetoothTransceiver_dataToSend_Dimension", null, 0, 1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBluetoothTransceiver_OriginalObject(), theArduinoPackage_1.getBluetoothTransceiver(), null, "originalObject", null, 0, 1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedBluetoothTransceiverEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBoardEClass, TracedBoard.class, "TracedBoard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedBoardEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBooleanVariableEClass, TracedBooleanVariable.class, "TracedBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanVariable_BooleanVariable_value_Dimension(), theStatesPackage.getBooleanVariable_value_Dimension(), null, "booleanVariable_value_Dimension", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanVariable_OriginalObject(), theArduinoPackage_1.getBooleanVariable(), null, "originalObject", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedBooleanVariableEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedBuzzerEClass, TracedBuzzer.class, "TracedBuzzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBuzzer_OriginalObject(), theArduinoPackage_1.getBuzzer(), null, "originalObject", null, 0, 1, TracedBuzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedBuzzerEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedControlEClass, TracedControl.class, "TracedControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedControlEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedDelayEClass, TracedDelay.class, "TracedDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDelay_OriginalObject(), theArduinoPackage_1.getDelay(), null, "originalObject", null, 0, 1, TracedDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedDelayEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedDigitalPinEClass, TracedDigitalPin.class, "TracedDigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDigitalPin_OriginalObject(), theArduinoPackage_1.getDigitalPin(), null, "originalObject", null, 0, 1, TracedDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedDigitalPinEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedFanEClass, TracedFan.class, "TracedFan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedFan_OriginalObject(), theArduinoPackage_1.getFan(), null, "originalObject", null, 0, 1, TracedFan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedFanEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedIfEClass, TracedIf.class, "TracedIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIf_OriginalObject(), theArduinoPackage_1.getIf(), null, "originalObject", null, 0, 1, TracedIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedIfEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedInfraRedSensorEClass, TracedInfraRedSensor.class, "TracedInfraRedSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInfraRedSensor_OriginalObject(), theArduinoPackage_1.getInfraRedSensor(), null, "originalObject", null, 0, 1, TracedInfraRedSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedInfraRedSensorEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedInstructionEClass, TracedInstruction.class, "TracedInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedInstructionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedIntegerVariableEClass, TracedIntegerVariable.class, "TracedIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerVariable_IntegerVariable_value_Dimension(), theStatesPackage.getIntegerVariable_value_Dimension(), null, "integerVariable_value_Dimension", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerVariable_OriginalObject(), theArduinoPackage_1.getIntegerVariable(), null, "originalObject", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedIntegerVariableEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedLEDEClass, TracedLED.class, "TracedLED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedLED_OriginalObject(), theArduinoPackage_1.getLED(), null, "originalObject", null, 0, 1, TracedLED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedLEDEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedMicroServoEClass, TracedMicroServo.class, "TracedMicroServo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedMicroServo_OriginalObject(), theArduinoPackage_1.getMicroServo(), null, "originalObject", null, 0, 1, TracedMicroServo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedMicroServoEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedModuleEClass, TracedModule.class, "TracedModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedModuleEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedModuleAssignmentEClass, TracedModuleAssignment.class, "TracedModuleAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedModuleAssignment_OriginalObject(), theArduinoPackage_1.getModuleAssignment(), null, "originalObject", null, 0, 1, TracedModuleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedModuleAssignmentEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedModuleInstructionEClass, TracedModuleInstruction.class, "TracedModuleInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedModuleInstructionEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedMusicPlayerEClass, TracedMusicPlayer.class, "TracedMusicPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedMusicPlayer_OriginalObject(), theArduinoPackage_1.getMusicPlayer(), null, "originalObject", null, 0, 1, TracedMusicPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedMusicPlayerEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedNamedElementEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedPinEClass, TracedPin.class, "TracedPin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPin_Pin_level_Dimension(), theStatesPackage.getPin_level_Dimension(), null, "pin_level_Dimension", null, 0, 1, TracedPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedPinEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedPushButtonEClass, TracedPushButton.class, "TracedPushButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPushButton_OriginalObject(), theArduinoPackage_1.getPushButton(), null, "originalObject", null, 0, 1, TracedPushButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedPushButtonEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedRepeatEClass, TracedRepeat.class, "TracedRepeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedRepeat_OriginalObject(), theArduinoPackage_1.getRepeat(), null, "originalObject", null, 0, 1, TracedRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedRepeat_Repeat_i_Dimension(), theStatesPackage.getRepeat_i_Dimension(), null, "repeat_i_Dimension", null, 0, 1, TracedRepeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedRepeatEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedRotationSensorEClass, TracedRotationSensor.class, "TracedRotationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedRotationSensor_OriginalObject(), theArduinoPackage_1.getRotationSensor(), null, "originalObject", null, 0, 1, TracedRotationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedRotationSensorEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedSketchEClass, TracedSketch.class, "TracedSketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSketch_OriginalObject(), theArduinoPackage_1.getSketch(), null, "originalObject", null, 0, 1, TracedSketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedSketchEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedSoundSensorEClass, TracedSoundSensor.class, "TracedSoundSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSoundSensor_OriginalObject(), theArduinoPackage_1.getSoundSensor(), null, "originalObject", null, 0, 1, TracedSoundSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedSoundSensorEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedUtilitiesEClass, TracedUtilities.class, "TracedUtilities", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedUtilitiesEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tracedVariableEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedVariableAssignmentEClass, TracedVariableAssignment.class, "TracedVariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVariableAssignment_OriginalObject(), theArduinoPackage_1.getVariableAssignment(), null, "originalObject", null, 0, 1, TracedVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedVariableAssignmentEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedVariableDeclarationEClass, TracedVariableDeclaration.class, "TracedVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVariableDeclaration_OriginalObject(), theArduinoPackage_1.getVariableDeclaration(), null, "originalObject", null, 0, 1, TracedVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedVariableDeclarationEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(tracedWhileEClass, TracedWhile.class, "TracedWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedWhile_OriginalObject(), theArduinoPackage_1.getWhile(), null, "originalObject", null, 0, 1, TracedWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tracedWhileEClass, null, "getDimensionsInternal", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStatesPackage.getSpecificDimension());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);
	}

} //ArduinoPackageImpl
