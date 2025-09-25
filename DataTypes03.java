// How integer datatypes store the integer values  in binary form and how to convert integer values to different number systems.
public class DataTypes03 {
    
    public static void main(String[] args)
    {
        int x = 7; // 7 in decimal

        System.out.println("7 in binary : " + Integer.toBinaryString(x)); // prints 111 which is 7 in binary

        // Negative integers use two's complement representation internally.

        int y = -7; // -7 in decimal
        System.out.println("-7 in binary : " + Integer.toBinaryString(y)); // prints 11111111111111111111111111111001 which is -7 in binary (2's complement representation)

        // Note : Integer.toBinaryString() method returns the binary representation of the integer as a string.


        // Other methods to convert integer to different number systems
        int num = 47;
        System.out.println("47 in Octal : " + Integer.toOctalString(num));
        
        System.out.println("47 in Hexadecimal : " + Integer.toHexString(num));

        num = -47;
        System.out.println("-47 in Octal : " + Integer.toOctalString(num));
        System.out.println("-47 in Hexadecimal : " + Integer.toHexString(num));

        // Note : For negative numbers, the methods return the two's complement representation.

    }
}

// To compile : javac DataTypes03.java
// To run : java DataTypes03


/* Output :

7 in binary : 111
-7 in binary : 11111111111111111111111111111001
47 in Octal : 57
47 in Hexadecimal : 2f
-47 in Octal : 37777777721
-47 in Hexadecimal : ffffffd1

 */
