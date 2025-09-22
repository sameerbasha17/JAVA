// This is a simple java program to demonstrate the use of variables in java (variables-part01)
/* Notes :
✮ A variable is a container that holds data which can be changed during the execution of a program.
✮ Variables are used to store information to be referenced and manipulated in a program.
✮ Since java is a statically typed language, every variable must be declared with a data type.
 */
public class VariablesPart01 {
    public static void main(String[] args) {
    byte b = 5;                                     // 5 is stored in a byte variable(named as b)
    short s = 1000;                                 // 1000 is stored in a short variable(named as s)
    int i = 150000000;                              // 150000000 is stored in an integer variable(named as i)
    float f = 5.5f;                                 // 5.5 is stored in a float variable(named as f)
    System.out.println("Byte value: " + b);             // printing the value of byte variable
    System.out.println("Short value: " + s);            // printing the value of short variable
    System.out.println("Integer value: " + i);          // printing the value of integer variable
    System.out.println("Float value: " + f);            // printing the value of float variable 
    }    
}
/*Naming Rules:
  1. A variable name must start with a letter (A-Z or a-z), dollar sign ($), or underscore (_). It cannot start with a number.
  2. After the first character, variable names can include letters, numbers (0-9), dollar signs, or underscores.
  3. Variable names are case-sensitive, meaning that "myVariable" and "myvariable" would be considered different variables.
  4. Variable names cannot be the same as Java reserved keywords (like int, class, public, etc.).
  5. Variable names should be meaningful and descriptive to enhance code readability.
  6. By convention, variable names in Java typically start with a lowercase letter and use camelCase for multi-word names (e.g., myVariableName).
  7. Avoid using special characters (like @, #, %, etc.) in variable names, as they are not allowed.
  8. There is no limit to the length of a variable name, but it is advisable to keep it concise yet descriptive.
  
 */
// Output:
// Byte value: 5
// Short value: 1000
// Integer value: 150000000
// Float value: 5.5
// Note: You can change the values of the variables and re-run the program to see how it works.


/* This is a simple java program to declare and print the variables, in the next program i gonna show you how each naming rule works */
