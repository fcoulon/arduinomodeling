package org.gemoc.arduino.sequential.org.gemoc.arduino.sequential.xarduino.trace2.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.gemoc.api.IStateManager;
import org.eclipse.gemoc.trace.gemoc.api.IStepFactory;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.gemoc.api.ITraceConstructor;
import org.eclipse.gemoc.trace.gemoc.traceaddon.AbstractTraceAddon;
import org.eclipse.gemoc.trace.gemoc.api.IModelAccessor;
import org.eclipse.gemoc.executionframework.debugger.IMutableFieldExtractor;
import org.eclipse.gemoc.executionframework.debugger.MutableField;

public class ArduinoTraceEngineAddon extends AbstractTraceAddon implements IModelAccessor {

	private ArduinoTraceStepFactory factory = null;

	private IMutableFieldExtractor extractor;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, TracedObject<?>> exeToTraced) {
		return new ArduinoTraceConstructor(modelResource, traceResource, exeToTraced, this);
	}

	@Override
	public IStateManager<State<?, ?>> constructStateManager(Resource modelResource,
			Map<TracedObject<?>, EObject> tracedToExe) {
		return new ArduinoTraceStateManager(modelResource, tracedToExe, this);
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new ArduinoTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof arduinoTrace.SpecificTrace;
	}

	@Override
	public void setIMutableFieldExtractor(IMutableFieldExtractor extractor) {
		this.extractor = extractor;
	}

	@Override
	public Object getValue(EObject object, String featureName) {
		Object res = null;
		for (MutableField field : extractor.extractMutableField(object)) {
			if (field.getMutableProperty().getName().equals(featureName)) {
				return field.getValue();
			}
		}
		return res;
	}

	@Override
	public void setValue(EObject object, String featureName, Object value) {
		for (MutableField field : extractor.extractMutableField(object)) {
			if (field.getMutableProperty().getName().equals(featureName)) {
				field.setValue(value);
			}
		}
	}

}