package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;

@SuppressWarnings("all")
public class ConstantAdapter extends EObjectAdapter<Constant> implements fr.obeo.dsl.arduino.arduinomt.Constant {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ConstantAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public String getValue() {
    return adaptee.getValue() ;
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o) ;
  }
  
  @Override
  public Instruction getPrevious() {
    return adaptersFactory.createInstructionAdapter(adaptee.getPrevious()) ;
  }
  
  @Override
  public void setPrevious(final Instruction o) {
    adaptee.setPrevious(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Instruction getNext() {
    return adaptersFactory.createInstructionAdapter(adaptee.getNext()) ;
  }
  
  @Override
  public void setNext(final Instruction o) {
    adaptee.setNext(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public ParameterDefinition getDefinition() {
    return adaptersFactory.createParameterDefinitionAdapter(adaptee.getDefinition()) ;
  }
  
  @Override
  public void setDefinition(final ParameterDefinition o) {
    adaptee.setDefinition(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterDefinitionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public Number evaluateAsNumber() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluateAsNumber(adaptee) ;
  }
  
  @Override
  public Boolean evaluateAsBoolean() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluateAsBoolean(adaptee) ;
  }
  
  @Override
  public void call() {
    org.gemoc.arduino.operationalsemantics.Parameter_CallableAspect.call(adaptee) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute(adaptee) ;
  }
}