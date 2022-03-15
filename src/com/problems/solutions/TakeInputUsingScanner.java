// Java program to read data of various types using Scanner class.
package com.problems.solutions;

import java.util.Scanner;

public class TakeInputUsingScanner {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your name: ");

	    String userName = scanner.nextLine();  // Read user input
	    System.out.println("Name is: " + userName);  // Output user input
	  }
}
