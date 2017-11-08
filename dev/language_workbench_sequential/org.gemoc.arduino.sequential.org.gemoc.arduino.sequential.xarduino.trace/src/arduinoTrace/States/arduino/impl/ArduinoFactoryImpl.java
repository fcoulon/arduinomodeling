/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.arduino.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoFactoryImpl extends EFactoryImpl implements ArduinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinoFactory init() {
		try {
			ArduinoFactory theArduinoFactory = (ArduinoFactory)EPackage.Registry.INSTANCE.getEFactory(ArduinoPackage.eNS_URI);
			if (theArduinoFactory != null) {
				return theArduinoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArduinoPackage.TRACED_AMBIENT_LIGHT_SENSOR: return createTracedAmbientLightSensor();
			case ArduinoPackage.TRACED_ANALOG_PIN: return createTracedAnalogPin();
			case ArduinoPackage.TRACED_ARDUINO_BOARD: return createTracedArduinoBoard();
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER: return createTracedBluetoothTransceiver();
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE: return createTracedBooleanVariable();
			case ArduinoPackage.TRACED_BUZZER: return createTracedBuzzer();
			case ArduinoPackage.TRACED_DELAY: return createTracedDelay();
			case ArduinoPackage.TRACED_DIGITAL_PIN: return createTracedDigitalPin();
			case ArduinoPackage.TRACED_FAN: return createTracedFan();
			case ArduinoPackage.TRACED_IF: return createTracedIf();
			case ArduinoPackage.TRACED_INFRA_RED_SENSOR: return createTracedInfraRedSensor();
			case ArduinoPackage.TRACED_INTEGER_VARIABLE: return createTracedIntegerVariable();
			case ArduinoPackage.TRACED_LED: return createTracedLED();
			case ArduinoPackage.TRACED_MICRO_SERVO: return createTracedMicroServo();
			case ArduinoPackage.TRACED_MODULE_ASSIGNMENT: return createTracedModuleAssignment();
			case ArduinoPackage.TRACED_MUSIC_PLAYER: return createTracedMusicPlayer();
			case ArduinoPackage.TRACED_PUSH_BUTTON: return createTracedPushButton();
			case ArduinoPackage.TRACED_REPEAT: return createTracedRepeat();
			case ArduinoPackage.TRACED_ROTATION_SENSOR: return createTracedRotationSensor();
			case ArduinoPackage.TRACED_SKETCH: return createTracedSketch();
			case ArduinoPackage.TRACED_SOUND_SENSOR: return createTracedSoundSensor();
			case ArduinoPackage.TRACED_VARIABLE_ASSIGNMENT: return createTracedVariableAssignment();
			case ArduinoPackage.TRACED_VARIABLE_DECLARATION: return createTracedVariableDeclaration();
			case ArduinoPackage.TRACED_WHILE: return createTracedWhile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAmbientLightSensor createTracedAmbientLightSensor() {
		TracedAmbientLightSensorImpl tracedAmbientLightSensor = new TracedAmbientLightSensorImpl();
		return tracedAmbientLightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAnalogPin createTracedAnalogPin() {
		TracedAnalogPinImpl tracedAnalogPin = new TracedAnalogPinImpl();
		return tracedAnalogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedArduinoBoard createTracedArduinoBoard() {
		TracedArduinoBoardImpl tracedArduinoBoard = new TracedArduinoBoardImpl();
		return tracedArduinoBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBluetoothTransceiver createTracedBluetoothTransceiver() {
		TracedBluetoothTransceiverImpl tracedBluetoothTransceiver = new TracedBluetoothTransceiverImpl();
		return tracedBluetoothTransceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable createTracedBooleanVariable() {
		TracedBooleanVariableImpl tracedBooleanVariable = new TracedBooleanVariableImpl();
		return tracedBooleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBuzzer createTracedBuzzer() {
		TracedBuzzerImpl tracedBuzzer = new TracedBuzzerImpl();
		return tracedBuzzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDelay createTracedDelay() {
		TracedDelayImpl tracedDelay = new TracedDelayImpl();
		return tracedDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDigitalPin createTracedDigitalPin() {
		TracedDigitalPinImpl tracedDigitalPin = new TracedDigitalPinImpl();
		return tracedDigitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFan createTracedFan() {
		TracedFanImpl tracedFan = new TracedFanImpl();
		return tracedFan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIf createTracedIf() {
		TracedIfImpl tracedIf = new TracedIfImpl();
		return tracedIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInfraRedSensor createTracedInfraRedSensor() {
		TracedInfraRedSensorImpl tracedInfraRedSensor = new TracedInfraRedSensorImpl();
		return tracedInfraRedSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntegerVariable createTracedIntegerVariable() {
		TracedIntegerVariableImpl tracedIntegerVariable = new TracedIntegerVariableImpl();
		return tracedIntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLED createTracedLED() {
		TracedLEDImpl tracedLED = new TracedLEDImpl();
		return tracedLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMicroServo createTracedMicroServo() {
		TracedMicroServoImpl tracedMicroServo = new TracedMicroServoImpl();
		return tracedMicroServo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedModuleAssignment createTracedModuleAssignment() {
		TracedModuleAssignmentImpl tracedModuleAssignment = new TracedModuleAssignmentImpl();
		return tracedModuleAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMusicPlayer createTracedMusicPlayer() {
		TracedMusicPlayerImpl tracedMusicPlayer = new TracedMusicPlayerImpl();
		return tracedMusicPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPushButton createTracedPushButton() {
		TracedPushButtonImpl tracedPushButton = new TracedPushButtonImpl();
		return tracedPushButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRepeat createTracedRepeat() {
		TracedRepeatImpl tracedRepeat = new TracedRepeatImpl();
		return tracedRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRotationSensor createTracedRotationSensor() {
		TracedRotationSensorImpl tracedRotationSensor = new TracedRotationSensorImpl();
		return tracedRotationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSketch createTracedSketch() {
		TracedSketchImpl tracedSketch = new TracedSketchImpl();
		return tracedSketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSoundSensor createTracedSoundSensor() {
		TracedSoundSensorImpl tracedSoundSensor = new TracedSoundSensorImpl();
		return tracedSoundSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariableAssignment createTracedVariableAssignment() {
		TracedVariableAssignmentImpl tracedVariableAssignment = new TracedVariableAssignmentImpl();
		return tracedVariableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariableDeclaration createTracedVariableDeclaration() {
		TracedVariableDeclarationImpl tracedVariableDeclaration = new TracedVariableDeclarationImpl();
		return tracedVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedWhile createTracedWhile() {
		TracedWhileImpl tracedWhile = new TracedWhileImpl();
		return tracedWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoPackage getArduinoPackage() {
		return (ArduinoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinoPackage getPackage() {
		return ArduinoPackage.eINSTANCE;
	}

} //ArduinoFactoryImpl
