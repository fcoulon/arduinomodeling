package org.gemoc.arduino.sequential.org.gemoc.arduino.sequential.xarduino.trace2.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gemoc.executionframework.engine.core.CommandExecution;

import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.gemoc.api.IStateManager;
import org.eclipse.gemoc.trace.gemoc.api.IModelAccessor;

public class ArduinoTraceStateManager implements IStateManager<State<?, ?>> {

	private final Resource modelResource;

	private final Map<TracedObject<?>, EObject> tracedToExe;

	IModelAccessor modelAccessor;

	public ArduinoTraceStateManager(Resource modelResource, Map<TracedObject<?>, EObject> tracedToExe,
			IModelAccessor modelAccessor) {
		this.modelResource = modelResource;
		this.tracedToExe = tracedToExe;
		this.modelAccessor = modelAccessor;
	}

	@Override
	public void restoreState(State<?, ?> state) {
		if (modelResource != null && state instanceof arduinoTrace.States.SpecificState) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							restoreStateExecute((arduinoTrace.States.SpecificState) state);
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(tracedToExe.get(tracedObject));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private void restoreStateExecute(arduinoTrace.States.SpecificState state) {
		for (arduinoTrace.States.SpecificValue value : state.getValues()) {
			if (value instanceof arduinoTrace.States.BluetoothTransceiver_dataReceived_Value) {
				final arduinoTrace.States.arduino.TracedBluetoothTransceiver tracedObject = (arduinoTrace.States.arduino.TracedBluetoothTransceiver) value
						.eContainer().eContainer();
				org.gemoc.sequential.model.arduino.BluetoothTransceiver exeObject = (org.gemoc.sequential.model.arduino.BluetoothTransceiver) getTracedToExe(
						tracedObject);
				modelAccessor.setValue(exeObject, "dataReceived",
						((arduinoTrace.States.BluetoothTransceiver_dataReceived_Value) value).getDataReceived());
			} else if (value instanceof arduinoTrace.States.BluetoothTransceiver_dataToSend_Value) {
				final arduinoTrace.States.arduino.TracedBluetoothTransceiver tracedObject = (arduinoTrace.States.arduino.TracedBluetoothTransceiver) value
						.eContainer().eContainer();
				org.gemoc.sequential.model.arduino.BluetoothTransceiver exeObject = (org.gemoc.sequential.model.arduino.BluetoothTransceiver) getTracedToExe(
						tracedObject);
				modelAccessor.setValue(exeObject, "dataToSend",
						((arduinoTrace.States.BluetoothTransceiver_dataToSend_Value) value).getDataToSend());
			} else if (value instanceof arduinoTrace.States.BooleanVariable_value_Value) {
				final arduinoTrace.States.arduino.TracedBooleanVariable tracedObject = (arduinoTrace.States.arduino.TracedBooleanVariable) value
						.eContainer().eContainer();
				org.gemoc.sequential.model.arduino.BooleanVariable exeObject = (org.gemoc.sequential.model.arduino.BooleanVariable) getTracedToExe(
						tracedObject);
				modelAccessor.setValue(exeObject, "value",
						((arduinoTrace.States.BooleanVariable_value_Value) value).isValue());
			} else if (value instanceof arduinoTrace.States.IntegerVariable_value_Value) {
				final arduinoTrace.States.arduino.TracedIntegerVariable tracedObject = (arduinoTrace.States.arduino.TracedIntegerVariable) value
						.eContainer().eContainer();
				org.gemoc.sequential.model.arduino.IntegerVariable exeObject = (org.gemoc.sequential.model.arduino.IntegerVariable) getTracedToExe(
						tracedObject);
				modelAccessor.setValue(exeObject, "value",
						((arduinoTrace.States.IntegerVariable_value_Value) value).getValue());
			} else if (value instanceof arduinoTrace.States.Pin_level_Value) {
				final arduinoTrace.States.arduino.TracedPin tracedObject = (arduinoTrace.States.arduino.TracedPin) value
						.eContainer().eContainer();
				org.gemoc.sequential.model.arduino.Pin exeObject = (org.gemoc.sequential.model.arduino.Pin) getTracedToExe(
						tracedObject);
				modelAccessor.setValue(exeObject, "level", ((arduinoTrace.States.Pin_level_Value) value).getLevel());
			} else if (value instanceof arduinoTrace.States.Repeat_i_Value) {
				final arduinoTrace.States.arduino.TracedRepeat tracedObject = (arduinoTrace.States.arduino.TracedRepeat) value
						.eContainer().eContainer();
				org.gemoc.sequential.model.arduino.Repeat exeObject = (org.gemoc.sequential.model.arduino.Repeat) getTracedToExe(
						tracedObject);
				modelAccessor.setValue(exeObject, "i", ((arduinoTrace.States.Repeat_i_Value) value).getI());
			}
		}
	}
}
