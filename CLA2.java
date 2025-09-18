// Demonstration of Command line arguments when integer is passed
public class CLA2 {
    public static void main(String[] args)
    {
        System.out.println("Demonstration of Command line arguments when integer is passed");
        int n = Integer.parseInt(args[0]);                          // converting string to integer
        System.out.println("You passed integer : " +n);             // printing the integer
    }
}

// To compile : javac CLA2.java
// To run : java CLA2 10

// Output :
// Demonstration of Command line arguments when integer is passed
// You passed integer : 10


// Point to remember :

/* 
☆ Command line arguments are always passed as strings
☆ If you want to pass other data types, you need to convert them explicitly
☆ Integer.parseInt() method is used to convert string to integer
☆ If you try to pass a non-integer value, you will get a NumberFormatException
☆ You can use other wrapper classes like Double, Float, Long, etc. to convert strings to other data types
☆ Wrapper classes are used to convert primitive data types to objects and vice versa

*/
