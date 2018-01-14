package com.skaryszewski.externaljarsimulator;

import java.util.Random;

/**
 * This is a class which simulates a class from external jar file.
 * This is obviously not a Spring Managed Bean so we cannot easily inject it.
 * 
 * Do not modify this class.
 * 
 * @author Michal Skaryszewski
 *
 */
public class NumberGenerator {
	
	public NumberGenerator() {}
	
	/**
	 * 
	 * @return digit between 0 and 1000
	 */
	public int generateNumber() {
		return r.ints(0, 1000).findFirst().getAsInt();
	}
	
	private final Random r = new Random();
}
