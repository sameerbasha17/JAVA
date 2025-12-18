// A simple java program to demonstrate Arthimetic Operators in java.
/*
✮ Arthimetic Operators are used to perform basic mathematical operations like addition, subtraction, multiplication, division and modulus.
✮ The Arthimetic Operators in java are : +, -, *, /, %
✮ The Arthimetic Operators can be used with all numeric data types like int, float, double, long, short, byte.
✮ The Arthimetic Operators can also be used with char data type as char is internally represented as integer values.
✮ The Arthimetic Operators follow the BODMAS rule (Brackets, Orders, Division, Multiplication, Addition, Subtraction) for evaluating expressions. ( Precedence should be considered while evaluating expressions )
*/
public class ArthimeticOperators {
    public static void main(String[] args)
    {
        int a = 23;
        int b = 17;

        int sum = a + b;               // Addition
        int difference = a - b;        // Subtraction
        int product = a * b;           // Multiplication
        int quotient = a / b;          // Division
        int remainder = a % b;         // Modulus

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("\n --- Arthimetic Operations ---\n");
        System.out.println("Sum (a +b ) : " + sum);
        System.out.println("Difference (a - b) : " + difference);
        System.out.println("Product (a * b) : " + product);
        System.out.println("Quotient (a / b) : " + quotient);
        System.out.println("Remainder (a % b) : " + remainder);

        // Demonstrating Arthimetic Operators with different data types
        double x = 5.5;
        double y = 2.0;
        double doubleSum = x + y;

        System.out.println("\n --- Arthimetic Operations with Different Data Types ---\n");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Sum (x + y) : " + doubleSum);
        System.out.println("Product of int and double (a * x) : " + (a * x));       // int and double multiplication
        System.out.println("Division of double by int (x / b) : " + (x / b));       // double and int division
        System.out.println("Modulus of double by int (x % b) : " + (x % b));        // double and int modulus
        System.out.println("Modulus of int by double (a % y) : " + (a % y));        // int and double modulus
        System.out.println("Sum of char and int ('A' + a) : " + ('A' + a));         // char and int addition
        System.out.println("Difference of char and int ('Z' - b) : " + ('Z' - b));  // char and int subtraction
        System.out.println("Product of char and int ('C' * b) : " + ('C' * b));     // char and int multiplication
        System.out.println("Quotient of char by int ('D' / b) : " + ('D' / b));     // char and int division
        System.out.println("Remainder of char by int ('E' % b) : " + ('E' % b));    // char and int modulus


        // Demonstrating BODMAS rule

        int result = (a + b) * (a - b) / b; // (23 + 17) * (23 - 17) / 17 = 40 * 6 / 17 = 240 / 17 = 14
        System.out.println("\n --- Demonstrating BODMAS Rule ---\n");
        System.out.println("Result of (a + b) * (a - b) / b : " + result);


        // Without brackets, the expression would be evaluated as a + b * a - b / b

        int resultWithoutBrackets = a + b * a - b / b; // 23 + 17 * 23 - 17 / 17 = 23 + 391 - 1 = 413
        System.out.println("Result of a + b * a - b / b (without brackets) : " + resultWithoutBrackets);

        // Note : In integer division, the fractional part is discarded. For example, 5 / 2 = 2 and not 2.5
        // To get the precise result, we can cast one of the operands to double.

        double preciseQuotient = (double)a / b;                                                 // Casting a to double
        System.out.println("\n Precise Quotient of a / b (with casting) : " + preciseQuotient);



    }
}


// To compile : javac ArthimeticOperators.java
// To run : java ArthimeticOperators
/* 
E.g.:
PS C:\Users\Sameer\OneDrive\Desktop\java\JAVA> javac ArthimeticOperators.java
PS C:\Users\Sameer\OneDrive\Desktop\java\JAVA> java ArthimeticOperators
*/


/* Output :
a = 23, b = 17

 --- Arthimetic Operations ---

Sum (a +b ) : 40
Difference (a - b) : 6
Product (a * b) : 391
Quotient (a / b) : 1
Remainder (a % b) : 6

 --- Arthimetic Operations with Different Data Types ---

x = 5.5, y = 2.0
Sum (x + y) : 7.5
Product of int and double (a * x) : 126.5
Division of double by int (x / b) : 0.3235294117647059
Modulus of double by int (x % b) : 5.5
Modulus of int by double (a % y) : 1.0
Sum of char and int ('A' + a) : 88
Difference of char and int ('Z' - b) : 73
Product of char and int ('C' * b) : 1139
Quotient of char by int ('D' / b) : 4
Remainder of char by int ('E' % b) : 1

 --- Demonstrating BODMAS Rule ---

Result of (a + b) * (a - b) / b : 14
Result of a + b * a - b / b (without brackets) : 413

Precise Quotient of a / b (with casting) : 1.3529411764705883
*/