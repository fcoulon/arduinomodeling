package org.gemoc.arduino.sequential.xardunio.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.sequential.model.arduino.Board;
import org.gemoc.sequential.model.arduino.Module;
import org.gemoc.sequential.model.arduino.Pin;
import org.gemoc.sequential.model.arduino.Project;
import org.gemoc.arduino.sequential.xarduino.design.ArduinoDesignerUtils;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class ArduinoDebuggerServices extends AbstractGemocDebuggerServices{

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Hardware", "Simulator"));
		res.add(new StringCouple("Sketch", "Simulator"));
		res.add(new StringCouple("Function", "Simulator"));

		return res;
	}

//	public Integer getLevel(Pin pin) {
//		return pin.getLevel();
//	}
//
//	public Integer getLevel(Module module) {
//		return ArduinoDesignerUtils.getPin(module).getLevel();
//	}

	protected Project getUserRootProject(EObject obj){
		// not very nice, we suppose that the first loaded resource will contain the root project
		for (Resource res : obj.eResource().getResourceSet().getResources()){
			if(res.getContents().size() > 0 &&  res.getContents().get(0) instanceof Project){
				return (Project)res.getContents().get(0);
			}
		}
		return null;
	}
	
//	public Integer getLevel(Board platform) {
//		return 0;
//	}
	
//	public boolean isModuleOn(Module module) {
//		return ArduinoDesignerUtils.getPin(module).getLevel() > 0;
//	}
	
	public String getModelIdentifier() {
		return org.eclipse.gemoc.execution.sequential.javaengine.ui.Activator.PLUGIN_ID+".debugModel";
	}
}
