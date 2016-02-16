package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.execarduino.arduino.MusicPlayer;

@SuppressWarnings("all")
public class MusicPlayerAdapter extends EObjectAdapter<MusicPlayer> implements org.gemoc.arduino.arduinomt.arduino.MusicPlayer {
  private org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public MusicPlayerAdapter() {
    super(org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public boolean isLevel() {
    return adaptee.isLevel() ;
  }
  
  @Override
  public void setLevel(final boolean o) {
    adaptee.setLevel(o) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getMusicPlayer();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MUSIC_PLAYER__NAME:
    		return getName();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MUSIC_PLAYER__LEVEL:
    		return isLevel();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MUSIC_PLAYER__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MUSIC_PLAYER__LEVEL:
    		setLevel((boolean) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MUSIC_PLAYER__NAME:
    		setName((java.lang.String) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MUSIC_PLAYER__LEVEL:
    		setLevel((Boolean) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}