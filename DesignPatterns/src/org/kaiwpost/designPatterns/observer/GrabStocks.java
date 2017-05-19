package org.kaiwpost.designPatterns.observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(150.37);
		stockGrabber.setAAPLPrice(156.10);
		stockGrabber.setGOOGPrice(932.22);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(150.37);
		stockGrabber.setAAPLPrice(156.10);
		stockGrabber.setGOOGPrice(932.22);
		
		stockGrabber.unregister(observer1);
		stockGrabber.unregister(observer2);
	}
}
