package org.kaiwpost.designPatterns.observer;

import java.util.Scanner;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public interface Subject {

	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObservers();
	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Input: ");
		String input = "strawberries";
		if(userInput.hasNextLine()) {
			input = userInput.nextLine();
		}
		userInput.close();
		System.out.println(input);
	}
}
