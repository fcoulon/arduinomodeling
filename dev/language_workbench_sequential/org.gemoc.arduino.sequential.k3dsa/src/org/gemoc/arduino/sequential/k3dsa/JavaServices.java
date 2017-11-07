package org.gemoc.arduino.sequential.k3dsa;

import org.eclipse.emf.ecore.EObject;

public class JavaServices {
	
	public static int getTime(EObject obj) {
		return (int) (System.nanoTime()/1000000000); // in seconds
	}
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static Integer mod(Integer left, Integer right) {
		return left % right;
	}
}
