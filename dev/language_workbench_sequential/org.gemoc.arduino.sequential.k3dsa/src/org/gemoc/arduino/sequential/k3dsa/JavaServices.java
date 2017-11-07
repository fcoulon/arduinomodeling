package org.gemoc.arduino.sequential.k3dsa;

import org.eclipse.emf.ecore.EObject;

public class JavaServices {
	
	public static long getTime(EObject obj) {
		return System.nanoTime();
	}
	
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
