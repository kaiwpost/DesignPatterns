package org.kaiwpost.designPatterns.observer;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		
		observers.stream().forEach((o) -> o.update(ibmPrice, aaplPrice, googPrice));
	}

	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}

	public void setAAPLPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}

	public void setGOOGPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}
	
}
