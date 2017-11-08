DSL org.gemoc.arduino.sequential.XArduino {
	
	abstract-syntax {
		ecore = "platform:/resource/org.gemoc.arduino.sequential.model/model/arduino.ecore"
	}
	
	semantic {
		ale = "platform:/resource/org.gemoc.arduino.sequential.k3dsa/src/org/gemoc/arduino/sequential/k3dsa/OperationalSemantics.ale"
		
/*	k3 = "org.gemoc.arduino.sequential.k3dsa.IntegerModuleGet_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Delay_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Instruction_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.BooleanVariable_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.BinaryIntegerExpression_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.While_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.ModuleAssignment_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.IntegerVariable_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.If_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.ArduinoCommunicationModule_PushAspect",
	"org.gemoc.arduino.sequential.k3dsa.Instruction_UtilitesAspect",
	"org.gemoc.arduino.sequential.k3dsa.VariableAssignment_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.If_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Pin_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.While_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.BooleanModuleGet_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Control_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.IntegerConstant_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.ModuleInstruction_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Repeat_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.BluetoothTransceiver_PushAspect",
	"org.gemoc.arduino.sequential.k3dsa.VariableDeclaration_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.VariableRef_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.BooleanConstant_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Block_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Constant_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Repeat_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Variable_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Expression_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.BinaryBooleanExpression_EvaluableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Utilities_ExecutableAspect",
	"org.gemoc.arduino.sequential.k3dsa.Control_ExecutableAspect"*/
	}
}