package org.kaiwpost.designPatterns.observer;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIdTracker = 0;
	
	private int observerId;
	
	@SuppressWarnings("unused")
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIdTracker;
		
		System.out.println("New Observer " + this.observerId);
		
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}

	public void printThePrices() {
		
		System.out.println(observerId + "\tIBM\t" + ibmPrice);
		System.out.println(observerId + "\tAAPL\t" + aaplPrice);
		System.out.println(observerId + "\tGOOG\t" + googPrice);
	}
}
