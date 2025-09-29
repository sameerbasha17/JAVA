// Demonstration of Command line arguments

public class CommandLineArguments          
{
	public static void main(String [] args)
	{
		System.out.println("Demonstration of Command line arguments");		// printing a string to the console
		System.out.println(args[0]);			// printing the first command line argument	
		System.out.println(args[1]);		   // printing the second command line argument
	}
}

// To compile : javac CommandLIneArguments.java
// To run : java CommandLIneArguments Hello World


// Output :
// Demonstration of Command line arguments	
// Hello
// World

/*points to remember :

☆ Command line arguments are passed to the main method as an array of strings
☆ args is the name of the array that stores the command line arguments
☆ args[0] is the first command line argument
☆ args[1] is the second command line argument
☆ You can pass any number of command line arguments
☆ If you try to access an index that is out of bounds, you will get an ArrayIndexOutOfBoundsException
☆ Command line arguments are always passed as strings
☆ If you want to pass other data types, you need to convert them explicitly
*/