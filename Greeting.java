// Greeting.java
// Program to take input from user and greet them
// Importing necessary packages

import java.lang.*;   
import java.util.*;					// this package is imported explicitly

public class Greeting				// class name is Greeting
{
	public static void main (String [] args)		// main method
	{
		Scanner sc = new Scanner(System.in);		// creating an object of Scanner class to take input from user
		String name;
		System.out.println("Please enter your sweet name :");		// asking user to enter their name
		name = sc.nextLine();								// reading the name entered by user
		System.out.println("Hello ! welcome " + name);		// greeting the user with their name
		sc.close();											// closing the scanner object
	}
}

// To compile : javac Greeting.java
// To run : java Greeting

// Output :
// Enter your sweet name
// Sameer
// Hello ! welcome Sameer

// Points to remember :
/*
☆ import statement is used to import packages in Java
☆ java.lang package is imported by default in every Java program
☆ java.util package is imported explicitly to use the Scanner class
☆ Scanner class is used to take input from user
☆ System.in is an InputStream object that is used to read input from the console
☆ nextLine() method of Scanner class is used to read a line of text from the console
☆ It is a good practice to close the Scanner object after use to prevent memory leaks
*/