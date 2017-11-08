
package org.gemoc.arduino.sequential.org.gemoc.arduino.sequential.xarduino.trace2.tracemanager;

import java.util.List;
import org.eclipse.gemoc.trace.gemoc.api.IStepFactory;

public class ArduinoTraceStepFactory implements IStepFactory {

	@Override
	public org.eclipse.gemoc.trace.commons.model.trace.Step<?> createStep(
			org.eclipse.gemoc.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		org.eclipse.gemoc.trace.commons.model.trace.Step<?> step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = org.eclipse.gemoc.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("push")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
						.getBluetoothTransceiver().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_BluetoothTransceiver_Push();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.getDelay()
						.getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Delay_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.getIf()
						.getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_If_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.getAssignment()
						.getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getControl().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getDelay().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.getIf()
								.getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getInstruction().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getModuleAssignment().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getModuleInstruction().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getRepeat().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getUtilities().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getVariableAssignment().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getVariableDeclaration().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getWhile().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Instruction_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
						.getModuleAssignment().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_ModuleAssignment_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
						.getModuleAssignment().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getModuleInstruction().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_ModuleInstruction_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setup")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.getProject()
						.getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Project_Setup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.getRepeat()
						.getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Repeat_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE.getDelay()
						.getClassifierID()
						|| ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
								.getUtilities().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Utilities_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
						.getVariableAssignment().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_VariableAssignment_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.sequential.model.arduino.ArduinoPackage.eINSTANCE
						.getVariableDeclaration().getClassifierID()))

		{
			step = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_VariableDeclaration_Execute();
		}

		else {
			step = org.eclipse.gemoc.trace.commons.model.generictrace.GenerictraceFactory.eINSTANCE
					.createGenericSequentialStep();
		}

		org.eclipse.gemoc.trace.commons.model.trace.MSEOccurrence mseocc = org.eclipse.gemoc.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
