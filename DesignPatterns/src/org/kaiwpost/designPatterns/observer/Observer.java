package org.kaiwpost.designPatterns.observer;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public interface Observer {

	public void update(double ibmPrice, double aaplPrice, double googPrice);
	
}
