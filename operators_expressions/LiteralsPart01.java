//
/* Notes :

 ☆ Literals are the fixed values assigned to variables in a program.
 ☆ Types of Literals in Java:
 1. Integer Literals: Whole numbers without a decimal point (e.g.,10, -5, 0).
 2. Floating-Point Literals: Numbers with a decimal point (e.g., 3.14,-0.001, 2.0).
 3. Character Literals: Single characters enclosed in single quotes(e.g., 'A', 'b', '1', '$').
 4. String Literals: Sequence of characters enclosed in double quotes(e.g., "Hello, World!", "Java Programming").
 5. Boolean Literals: Representing true or false values (e.g., true,false).
 6. Null Literal: Represents the absence of a value (e.g., null).
 
 */
public class LiteralsPart01 {
   public static void main (String [] args)
   {

        // For the datatypes - byte,short,int,long the default Literal is integer.

        System.out.println("\n--- Integer Literals ---");

        byte b = 10;
        short s = 20;
        int i = 50;
        long l = 2147483648L;                    // L or l is mandatory to specify long literal

        
        System.out.println("byte b1 : " + b);      
        System.out.println("short s : " + s);
        System.out.println("int i : " + i);
        System.out.println("long l : " + l);
        

        // For the datatypes - float , double the default Literal is double.

        System.out.println("\n --- Floating-Point Literals ---");

        float f = 7.77f;                        // f or F is mandatory to specify float literal
        double d = 99.99d;                      // d or D is optional to specify double literal

        System.out.println("float f : " + f);   
        System.out.println("double d : " + d);


        // For the datatype - char the default Literal is character.

        System.out.println("\n --- Character Literals ---");

        char ch='A';                     // single quotes are mandatory to specify char literal
        System.out.println("char ch : " + ch);


        // For the datatype - boolean the default Literal is boolean(true or false).

        System.out.println("\n --- Boolean Literals ---");

        boolean isActive = true;
        boolean isComplete = false;

        System.out.println("IsActive : " + isActive);
        System.out.println("IsComplete : " + isComplete);


        // For the datatype - String the default literal is null.

        System.out.println("\n --- String Literals ---");

        String str1 = "Sameer Basha";            // double quotes are mandatory to specify string literal
        String str2 = null;                     // null is used to represent the absence of a value

        System.out.println("String str1 : " + str1);
        System.out.println("String str2 : " + str2);


   } 
}

// To run this program, save it as Literals.java, then compile and run it using the following commands:
// To compile : javac LiteralsPart01.java
// To Run : java LiteralsPart01

/* Output :

--- Integer Literals ---
byte b1 : 10
short s : 20
int i : 50
long l : 2147483648

 --- Floating-Point Literals ---
float f : 7.77
double d : 99.99

 --- Character Literals ---
char ch : A

 --- Boolean Literals ---
IsActive : true
IsComplete : false

 --- String Literals ---
String str1 :Sameer Basha
String str2 : null

 */

 // This is a simple java program to demonstrate the use of literals in java (literalsPart01.java) , in next program i gonna show some other interesting things about literals in LiteralsPart02.java
