DSL org.gemoc.arduino.sequential.XArduino {
	
	abstract-syntax {
		ecore = "platform:/resource/org.gemoc.arduino.sequential.model/model/arduino.ecore"
	}
	
	semantic {
		ale = "platform:/resource/org.gemoc.arduino.sequential.k3dsa/src/org/gemoc/arduino/sequential/k3dsa/OperationalSemantics.ale"
	}
}