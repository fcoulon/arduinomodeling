package org.gemoc.arduino.sequential.org.gemoc.arduino.sequential.xarduino.trace2.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gemoc.trace.commons.model.launchconfiguration.LaunchConfiguration;
import org.eclipse.gemoc.trace.commons.model.trace.MSEModel;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.gemoc.api.ITraceConstructor;
import org.eclipse.gemoc.trace.gemoc.api.IModelAccessor;

public class ArduinoTraceConstructor implements ITraceConstructor {
	private arduinoTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, TracedObject<?>> exeToTraced;

	private arduinoTrace.States.SpecificState lastState;

	private Resource traceResource;
	private final Deque<arduinoTrace.Steps.SpecificStep> context = new LinkedList<arduinoTrace.Steps.SpecificStep>();

	private IModelAccessor modelAccessor;

	public ArduinoTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, TracedObject<?>> exeToTraced,
			IModelAccessor modelAccessor) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
		this.modelAccessor = modelAccessor;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = arduinoTrace.States.StatesFactory.eINSTANCE.createSpecificState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.gemoc.sequential.model.arduino.NamedElement) {
						org.gemoc.sequential.model.arduino.NamedElement o_cast = (org.gemoc.sequential.model.arduino.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.sequential.model.arduino.Instruction) {
						org.gemoc.sequential.model.arduino.Instruction o_cast = (org.gemoc.sequential.model.arduino.Instruction) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStates().add(lastState);
		}
	}

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.AmbientLightSensor o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedAmbientLightSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedAmbientLightSensor();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.AmbientLightSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.AnalogPin o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedAnalogPin tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedAnalogPin();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.AnalogPin) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field level
			tracedObject
					.setPin_level_Dimension(arduinoTrace.States.StatesFactory.eINSTANCE.createPin_level_Dimension());
			// Creation of the first value of the field level
			arduinoTrace.States.Pin_level_Value firstValue_level = arduinoTrace.States.StatesFactory.eINSTANCE
					.createPin_level_Value();

			firstValue_level.setLevel((int) modelAccessor.getValue(o_cast, "level"));
			tracedObject.getPin_level_Dimension().getValues().add(firstValue_level);
			newState.getValues().add(firstValue_level);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.ArduinoAnalogModule o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.MusicPlayer) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.MusicPlayer) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.BluetoothTransceiver) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.BluetoothTransceiver) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.AmbientLightSensor) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.AmbientLightSensor) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.SoundSensor) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.SoundSensor) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.RotationSensor) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.RotationSensor) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.ArduinoBoard o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedArduinoBoard tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedArduinoBoard();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.ArduinoBoard) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.ArduinoDigitalModule o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.Fan) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Fan) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.LED) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.LED) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.InfraRedSensor) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.InfraRedSensor) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.MicroServo) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.MicroServo) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.PushButton) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.PushButton) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Buzzer) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Buzzer) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.ArduinoModule o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.ArduinoDigitalModule) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.ArduinoDigitalModule) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.ArduinoAnalogModule) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.ArduinoAnalogModule) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Assignment o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.VariableAssignment) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.VariableAssignment) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.ModuleAssignment) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.ModuleAssignment) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.BluetoothTransceiver o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedBluetoothTransceiver tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedBluetoothTransceiver();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.BluetoothTransceiver) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field dataReceived
			tracedObject.setBluetoothTransceiver_dataReceived_Dimension(
					arduinoTrace.States.StatesFactory.eINSTANCE.createBluetoothTransceiver_dataReceived_Dimension());
			// Creation of the first value of the field dataReceived
			arduinoTrace.States.BluetoothTransceiver_dataReceived_Value firstValue_dataReceived = arduinoTrace.States.StatesFactory.eINSTANCE
					.createBluetoothTransceiver_dataReceived_Value();

			firstValue_dataReceived.setDataReceived(
					(org.eclipse.emf.common.util.EList) modelAccessor.getValue(o_cast, "dataReceived"));
			tracedObject.getBluetoothTransceiver_dataReceived_Dimension().getValues().add(firstValue_dataReceived);
			newState.getValues().add(firstValue_dataReceived);

			// Creation of the dimension corresponding to the field dataToSend
			tracedObject.setBluetoothTransceiver_dataToSend_Dimension(
					arduinoTrace.States.StatesFactory.eINSTANCE.createBluetoothTransceiver_dataToSend_Dimension());
			// Creation of the first value of the field dataToSend
			arduinoTrace.States.BluetoothTransceiver_dataToSend_Value firstValue_dataToSend = arduinoTrace.States.StatesFactory.eINSTANCE
					.createBluetoothTransceiver_dataToSend_Value();

			firstValue_dataToSend
					.setDataToSend((org.eclipse.emf.common.util.EList) modelAccessor.getValue(o_cast, "dataToSend"));
			tracedObject.getBluetoothTransceiver_dataToSend_Dimension().getValues().add(firstValue_dataToSend);
			newState.getValues().add(firstValue_dataToSend);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Board o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.ArduinoBoard) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.ArduinoBoard) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.BooleanVariable o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedBooleanVariable tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedBooleanVariable();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.BooleanVariable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field value
			tracedObject.setBooleanVariable_value_Dimension(
					arduinoTrace.States.StatesFactory.eINSTANCE.createBooleanVariable_value_Dimension());
			// Creation of the first value of the field value
			arduinoTrace.States.BooleanVariable_value_Value firstValue_value = arduinoTrace.States.StatesFactory.eINSTANCE
					.createBooleanVariable_value_Value();

			firstValue_value.setValue((boolean) modelAccessor.getValue(o_cast, "value"));
			tracedObject.getBooleanVariable_value_Dimension().getValues().add(firstValue_value);
			newState.getValues().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Buzzer o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedBuzzer tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedBuzzer();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.Buzzer) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Control o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.Repeat) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Repeat) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.If) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.If) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.While) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.While) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Delay o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedDelay tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedDelay();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.Delay) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.DigitalPin o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedDigitalPin tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedDigitalPin();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.DigitalPin) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field level
			tracedObject
					.setPin_level_Dimension(arduinoTrace.States.StatesFactory.eINSTANCE.createPin_level_Dimension());
			// Creation of the first value of the field level
			arduinoTrace.States.Pin_level_Value firstValue_level = arduinoTrace.States.StatesFactory.eINSTANCE
					.createPin_level_Value();

			firstValue_level.setLevel((int) modelAccessor.getValue(o_cast, "level"));
			tracedObject.getPin_level_Dimension().getValues().add(firstValue_level);
			newState.getValues().add(firstValue_level);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Fan o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedFan tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedFan();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.Fan) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.If o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedIf tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedIf();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.If) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.InfraRedSensor o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedInfraRedSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedInfraRedSensor();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.InfraRedSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Instruction o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.ModuleInstruction) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.ModuleInstruction) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.VariableAssignment) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.VariableAssignment) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Utilities) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Utilities) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.VariableDeclaration) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.VariableDeclaration) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Control) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Control) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Assignment) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Assignment) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.IntegerVariable o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedIntegerVariable tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedIntegerVariable();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.IntegerVariable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field value
			tracedObject.setIntegerVariable_value_Dimension(
					arduinoTrace.States.StatesFactory.eINSTANCE.createIntegerVariable_value_Dimension());
			// Creation of the first value of the field value
			arduinoTrace.States.IntegerVariable_value_Value firstValue_value = arduinoTrace.States.StatesFactory.eINSTANCE
					.createIntegerVariable_value_Value();

			firstValue_value.setValue((int) modelAccessor.getValue(o_cast, "value"));
			tracedObject.getIntegerVariable_value_Dimension().getValues().add(firstValue_value);
			newState.getValues().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.LED o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedLED tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedLED();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.LED) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.MicroServo o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedMicroServo tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedMicroServo();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.MicroServo) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Module o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.ArduinoModule) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.ArduinoModule) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.ModuleAssignment o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedModuleAssignment tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedModuleAssignment();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.ModuleAssignment) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.ModuleInstruction o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.ModuleAssignment) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.ModuleAssignment) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.MusicPlayer o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedMusicPlayer tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedMusicPlayer();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.MusicPlayer) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.NamedElement o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.Sketch) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Sketch) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Pin) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Pin) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Board) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Board) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Variable) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Variable) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.Module) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Module) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Pin o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.AnalogPin) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.AnalogPin) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.DigitalPin) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.DigitalPin) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.PushButton o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedPushButton tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedPushButton();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.PushButton) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Repeat o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedRepeat tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedRepeat();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.Repeat) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field i
			tracedObject.setRepeat_i_Dimension(arduinoTrace.States.StatesFactory.eINSTANCE.createRepeat_i_Dimension());
			// Creation of the first value of the field i
			arduinoTrace.States.Repeat_i_Value firstValue_i = arduinoTrace.States.StatesFactory.eINSTANCE
					.createRepeat_i_Value();

			firstValue_i.setI((int) modelAccessor.getValue(o_cast, "i"));
			tracedObject.getRepeat_i_Dimension().getValues().add(firstValue_i);
			newState.getValues().add(firstValue_i);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.RotationSensor o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedRotationSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedRotationSensor();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.RotationSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Sketch o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedSketch tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedSketch();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.Sketch) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.SoundSensor o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedSoundSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedSoundSensor();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.SoundSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Utilities o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.Delay) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.Delay) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.Variable o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sequential.model.arduino.BooleanVariable) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.BooleanVariable) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sequential.model.arduino.IntegerVariable) {
			added = addNewObjectToState((org.gemoc.sequential.model.arduino.IntegerVariable) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.VariableAssignment o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedVariableAssignment tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedVariableAssignment();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.VariableAssignment) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.VariableDeclaration o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedVariableDeclaration tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedVariableDeclaration();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.VariableDeclaration) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sequential.model.arduino.While o_cast,
			arduinoTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedWhile tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedWhile();
			tracedObject.setOriginalObject((org.gemoc.sequential.model.arduino.While) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private arduinoTrace.States.SpecificState copyState(arduinoTrace.States.SpecificState oldState) {
		arduinoTrace.States.SpecificState newState = arduinoTrace.States.StatesFactory.eINSTANCE.createSpecificState();
		newState.getValues().addAll(oldState.getValues());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(
			List<org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		} else if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			arduinoTrace.States.SpecificState newState = copyState(lastState);
			for (org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.sequential.model.arduino.BluetoothTransceiver) {
						org.gemoc.sequential.model.arduino.BluetoothTransceiver o_cast = (org.gemoc.sequential.model.arduino.BluetoothTransceiver) o;

						if (p.getName().equals("dataReceived")) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedBluetoothTransceiver traced = (arduinoTrace.States.arduino.TracedBluetoothTransceiver) exeToTraced
									.get(o);
							arduinoTrace.States.BluetoothTransceiver_dataReceived_Value lastValue = traced
									.getBluetoothTransceiver_dataReceived_Dimension().getValues()
									.get(traced.getBluetoothTransceiver_dataReceived_Dimension().getValues().size()
											- 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.BluetoothTransceiver_dataReceived_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createBluetoothTransceiver_dataReceived_Value();

							org.eclipse.emf.common.util.EList value = (org.eclipse.emf.common.util.EList) modelAccessor
									.getValue(o_cast, "dataReceived");

							newValue.setDataReceived((org.eclipse.emf.common.util.EList) value);

							traced.getBluetoothTransceiver_dataReceived_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						} else

						if (p.getName().equals("dataToSend")) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedBluetoothTransceiver traced = (arduinoTrace.States.arduino.TracedBluetoothTransceiver) exeToTraced
									.get(o);
							arduinoTrace.States.BluetoothTransceiver_dataToSend_Value lastValue = traced
									.getBluetoothTransceiver_dataToSend_Dimension().getValues()
									.get(traced.getBluetoothTransceiver_dataToSend_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.BluetoothTransceiver_dataToSend_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createBluetoothTransceiver_dataToSend_Value();

							org.eclipse.emf.common.util.EList value = (org.eclipse.emf.common.util.EList) modelAccessor
									.getValue(o_cast, "dataToSend");

							newValue.setDataToSend((org.eclipse.emf.common.util.EList) value);

							traced.getBluetoothTransceiver_dataToSend_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.sequential.model.arduino.Repeat) {
						org.gemoc.sequential.model.arduino.Repeat o_cast = (org.gemoc.sequential.model.arduino.Repeat) o;

						if (p.getName().equals("i")) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedRepeat traced = (arduinoTrace.States.arduino.TracedRepeat) exeToTraced
									.get(o);
							arduinoTrace.States.Repeat_i_Value lastValue = traced.getRepeat_i_Dimension().getValues()
									.get(traced.getRepeat_i_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.Repeat_i_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createRepeat_i_Value();

							int value = (int) modelAccessor.getValue(o_cast, "i");

							newValue.setI((int) value);

							traced.getRepeat_i_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.sequential.model.arduino.BooleanVariable) {
						org.gemoc.sequential.model.arduino.BooleanVariable o_cast = (org.gemoc.sequential.model.arduino.BooleanVariable) o;

						if (p.getName().equals("value")) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedBooleanVariable traced = (arduinoTrace.States.arduino.TracedBooleanVariable) exeToTraced
									.get(o);
							arduinoTrace.States.BooleanVariable_value_Value lastValue = traced
									.getBooleanVariable_value_Dimension().getValues()
									.get(traced.getBooleanVariable_value_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.BooleanVariable_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createBooleanVariable_value_Value();

							boolean value = (boolean) modelAccessor.getValue(o_cast, "value");

							newValue.setValue((boolean) value);

							traced.getBooleanVariable_value_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.sequential.model.arduino.IntegerVariable) {
						org.gemoc.sequential.model.arduino.IntegerVariable o_cast = (org.gemoc.sequential.model.arduino.IntegerVariable) o;

						if (p.getName().equals("value")) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedIntegerVariable traced = (arduinoTrace.States.arduino.TracedIntegerVariable) exeToTraced
									.get(o);
							arduinoTrace.States.IntegerVariable_value_Value lastValue = traced
									.getIntegerVariable_value_Dimension().getValues()
									.get(traced.getIntegerVariable_value_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.IntegerVariable_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createIntegerVariable_value_Value();

							int value = (int) modelAccessor.getValue(o_cast, "value");

							newValue.setValue((int) value);

							traced.getIntegerVariable_value_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.sequential.model.arduino.Pin) {
						org.gemoc.sequential.model.arduino.Pin o_cast = (org.gemoc.sequential.model.arduino.Pin) o;

						if (p.getName().equals("level")) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedPin traced = (arduinoTrace.States.arduino.TracedPin) exeToTraced
									.get(o);
							arduinoTrace.States.Pin_level_Value lastValue = traced.getPin_level_Dimension().getValues()
									.get(traced.getPin_level_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.Pin_level_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createPin_level_Value();

							int value = (int) modelAccessor.getValue(o_cast, "level");

							newValue.setLevel((int) value);

							traced.getPin_level_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final arduinoTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof org.eclipse.gemoc.trace.commons.model.trace.BigStep) {
					final arduinoTrace.States.SpecificState startingState = lastState;
					final arduinoTrace.States.SpecificState endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStates().add(lastState);
			} else if (copiedState) {
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(org.eclipse.gemoc.trace.commons.model.trace.Step<?> step) {
		arduinoTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof arduinoTrace.Steps.SpecificStep) {
			step_cast = (arduinoTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = org.eclipse.gemoc.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			arduinoTrace.States.SpecificState state = traceRoot.getStates().get(traceRoot.getStates().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<arduinoTrace.Steps.SpecificStep, arduinoTrace.States.SpecificState>) context
						.getFirst()).getSubSteps().add(step_cast);
			} else {
				((SequentialStep<arduinoTrace.Steps.SpecificStep, arduinoTrace.States.SpecificState>) traceRoot
						.getRootStep()).getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push) {
				arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push arduino_BluetoothTransceiver_PushInstance = (arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push) step_cast;
				traceRoot.getArduino_BluetoothTransceiver_Push_Sequence()
						.add(arduino_BluetoothTransceiver_PushInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Delay_Execute) {
				arduinoTrace.Steps.Arduino_Delay_Execute arduino_Delay_ExecuteInstance = (arduinoTrace.Steps.Arduino_Delay_Execute) step_cast;
				traceRoot.getArduino_Delay_Execute_Sequence().add(arduino_Delay_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_If_Execute) {
				arduinoTrace.Steps.Arduino_If_Execute arduino_If_ExecuteInstance = (arduinoTrace.Steps.Arduino_If_Execute) step_cast;
				traceRoot.getArduino_If_Execute_Sequence().add(arduino_If_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Instruction_Execute) {
				arduinoTrace.Steps.Arduino_Instruction_Execute arduino_Instruction_ExecuteInstance = (arduinoTrace.Steps.Arduino_Instruction_Execute) step_cast;
				traceRoot.getArduino_Instruction_Execute_Sequence().add(arduino_Instruction_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_ModuleAssignment_Execute) {
				arduinoTrace.Steps.Arduino_ModuleAssignment_Execute arduino_ModuleAssignment_ExecuteInstance = (arduinoTrace.Steps.Arduino_ModuleAssignment_Execute) step_cast;
				traceRoot.getArduino_ModuleAssignment_Execute_Sequence().add(arduino_ModuleAssignment_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_ModuleInstruction_Execute) {
				arduinoTrace.Steps.Arduino_ModuleInstruction_Execute arduino_ModuleInstruction_ExecuteInstance = (arduinoTrace.Steps.Arduino_ModuleInstruction_Execute) step_cast;
				traceRoot.getArduino_ModuleInstruction_Execute_Sequence()
						.add(arduino_ModuleInstruction_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Project_Setup) {
				arduinoTrace.Steps.Arduino_Project_Setup arduino_Project_SetupInstance = (arduinoTrace.Steps.Arduino_Project_Setup) step_cast;
				traceRoot.getArduino_Project_Setup_Sequence().add(arduino_Project_SetupInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Repeat_Execute) {
				arduinoTrace.Steps.Arduino_Repeat_Execute arduino_Repeat_ExecuteInstance = (arduinoTrace.Steps.Arduino_Repeat_Execute) step_cast;
				traceRoot.getArduino_Repeat_Execute_Sequence().add(arduino_Repeat_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Utilities_Execute) {
				arduinoTrace.Steps.Arduino_Utilities_Execute arduino_Utilities_ExecuteInstance = (arduinoTrace.Steps.Arduino_Utilities_Execute) step_cast;
				traceRoot.getArduino_Utilities_Execute_Sequence().add(arduino_Utilities_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_VariableAssignment_Execute) {
				arduinoTrace.Steps.Arduino_VariableAssignment_Execute arduino_VariableAssignment_ExecuteInstance = (arduinoTrace.Steps.Arduino_VariableAssignment_Execute) step_cast;
				traceRoot.getArduino_VariableAssignment_Execute_Sequence()
						.add(arduino_VariableAssignment_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_VariableDeclaration_Execute) {
				arduinoTrace.Steps.Arduino_VariableDeclaration_Execute arduino_VariableDeclaration_ExecuteInstance = (arduinoTrace.Steps.Arduino_VariableDeclaration_Execute) step_cast;
				traceRoot.getArduino_VariableDeclaration_Execute_Sequence()
						.add(arduino_VariableDeclaration_ExecuteInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(arduinoTrace.Steps.SpecificStep currentStep,
			arduinoTrace.States.SpecificState startingState, arduinoTrace.States.SpecificState endingState) {

		arduinoTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof arduinoTrace.Steps.Arduino_If_Execute) {
			implicitStep = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_If_Execute_ImplicitStep();
		} else if (currentStep instanceof arduinoTrace.Steps.Arduino_Instruction_Execute) {
			implicitStep = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Instruction_Execute_ImplicitStep();
		} else if (currentStep instanceof arduinoTrace.Steps.Arduino_Repeat_Execute) {
			implicitStep = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Repeat_Execute_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<arduinoTrace.Steps.SpecificStep, arduinoTrace.States.SpecificState>) currentStep)
					.getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(org.eclipse.gemoc.trace.commons.model.trace.Step<?> step) {
		arduinoTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = arduinoTrace.ArduinoTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		org.eclipse.gemoc.trace.commons.model.trace.SequentialStep<arduinoTrace.Steps.SpecificStep, arduinoTrace.States.SpecificState> rootStep = arduinoTrace.Steps.StepsFactory.eINSTANCE
				.createSpecificRootStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.eclipse.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(
				r -> r == null || (r != executedModel && executedModel.getContents().contains(r.getContents().get(0))));
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
