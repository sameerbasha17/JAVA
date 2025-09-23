/*  
✮ In this program i gonna show the representation of integer literals in different number systems like binary, octal, decimal and hexadecimal
✮ Also i gonna show you how to use underscores in numeric literals to make them more readable
✮ Also i use another variation of println() method to format the output
*/

public class LiteralsPart02 
{    
    public static void main(String[] args)
    {

        System.out.println("\n --- Integer Literals in Different Number Systems ---\n");

        int decimalLiteral = 10;                  // Decimal Literal
        int binaryLiteral = 0b1010;               // Binary literal (prefix 0b or 0B)
        int octalLiteral = 012;                   // Octal literal (prefix 0)
        int hexadecimalLiteral = 0xA;             // Hexadecimal literal (prefix 0x or 0X)

        System.out.printf(" Decimal Literal : %d%n Binary literal : %d%n Octal Literal : %d%n Hexadecimal Literal : %d%n", decimalLiteral,binaryLiteral,octalLiteral,hexadecimalLiteral);
        // %d is used to format integer values
        // %n is used to insert a new line
        // \n also can be used to insert a new line but %n is preferred as it is platform independent

        System.out.println("\n --- Using Underscores in Numeric Literals ---\n");

        // Using underscores to make numeric literals more readable
        int oneMillion = 1_000_000;               // One million
        long creditCardNumber = 1234_5678_9012_3456L; // Credit card number
        float pi = 3.14_15F;                      // Pi value
        double avogadroNumber = 6.022_140_76e23;  // Avogadro's number
        System.out.printf(" One Million : %d%n Credit Card Number : %d%n Pi : %.5f%n Avogadro's Number : %.8e%n", oneMillion,creditCardNumber,pi,avogadroNumber);
        // %.5f is used to format float values upto 5 decimal places
        // %.8e is used to format double values in scientific notation upto 8 decimal places
        // Note : Underscores can be used only between digits, not at the beginning or end of a number, or next to a decimal point

        /* Invalid Cases :
        ✰ int invalid1 = _1000;          // Invalid: cannot start with an underscore
        ✰ int invalid2 = 1000_;          // Invalid: cannot end with an underscore
        ✰ float invalid3 = 3_.14F;        // Invalid: cannot be adjacent to a decimal point
        ✰ float invalid4 = 3._14F;        // Invalid: cannot be adjacent to a decimal point
        ✰ int invalid5 = 0x_1A;          // Invalid: cannot be adjacent to the 'x' in hexadecimal literals
         */
    }
}

// To compile : javac LiteralsPart02.java
// To run : java LiteralsPart02

/* Output :

 --- Integer Literals in Different Number Systems ---
vDecimal Literal : 10
 Binary literal : 10
 Ocatal Literal : 10
 Hexadecimal Literal : 10

 --- Using Underscores in Numeric Literals ---
 One Million : 1000000
 Credit Card Number : 1234567890123456
 Pi : 3.14150
 Avogadro's Number : 6.02214076e+23
 */
