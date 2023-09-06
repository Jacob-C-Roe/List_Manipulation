/*
 * Created by: Jacob Roe
 * Created On: 11/9/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 11/9/2022	Jacob Roe		Initial Implementation
 * 
 * Description: This program creates list for the user to fill with Strings then allows the removal of said strings until a key is entered
 * or the list is empty.
 */
package lists;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListManipulation {

	public static void main(String[] args) {
		//Create scanner object
		Scanner keyboard = new Scanner(System.in);
		//Create a String ArrayList
		ArrayList<String> strings = new ArrayList<String>();
		//Create String object to hold the keyboard input
		String string;
		//Create boolean to exit the add and remove loops
		boolean add = true;
		boolean remove = true;
		//Continually prompt user for Strings to add to the list
		while (add == true) {
			//Prompt
			System.out.println("Please input a String to add it to the list!");
			//Sentinel value to stop adding prompt
			System.out.println("press Q if you would like to quit adding");
			//Capture input
			string = keyboard.next();
			//Add to list
			strings.add(string);
			//if statement to change add to false to break the while loop
			if (string.equals("q") || string.equals("Q")) {
					//Remove q from the list upon exiting the add loop
					strings.remove("q");
					strings.remove("Q");
					//Change add to false to break while loop
					add = false;
				}
			}
		//Iterator to display all the Strings in the List
		ListIterator<String> iterator = strings.listIterator();
		while (iterator.hasNext()) {
			 
            // Print all elements of List strings
            System.out.println(iterator.next());
        }
		//Continually prompt user for Strings to remove from the list
		while (remove == true) {
			//Prompt
			System.out.println("Please input the String you would like to remove from the list!");
			//Sentinel value to stop adding prompt
			System.out.println("press Q if you would like to quit adding");
			//Capture input
			string = keyboard.next();
			//Add to list
			strings.remove(string);
			//Print the list to update after each removed String
			System.out.println(strings);
			//if statement to change add to false to break the while loop
			if (string.equals("q") || string.equals("Q")) {
					//Change add to false to break while loop
					remove = false;
			}
			if (strings.isEmpty()) {
				//When list is empty display appropriate message
				System.out.println("The List is now empty.");
				System.out.println("Goodbye!");
				remove = false;
			}
		}
	}
}
