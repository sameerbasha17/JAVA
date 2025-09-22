 /* 
 ✮ This java program demonstrates the naming rules of variables in java (variables-part02)
 ✮ In the previous program we have seen how to declare and print the variables, in this program we will see how each naming rule works.
 */

public class VariablesPart02 {
    //Main method
    public static void main(String[] args){

        //  1. A variable name must start with a letter (A-Z or a-z), dollar sign ($), or underscore (_). It cannot start with a number.

        int number = 7;               // valid variable name
        int $number = 10;            // valid variable name
        int _number =  25789;         // valid variable name

        /* 
        int 1number = 75;          // invalid variable name, cannot start with a number

        ✬ Error message at console :
        VariablesPart02.java:17: error: not a statement
        int 1number = 75;          // invalid variable name, cannot start with a number
        ^

        Similar errors for below invalid variable names -
        int #number = 100;         // invalid variable name, cannot start with a special
        int @number = 150;         // invalid variable name, cannot start with a special
        */

        System.out.println("Valid variable names:");
        System.out.println("number: " + number);    
        System.out.println("$number: " + $number);
        System.out.println("_number: " + _number);

        /* Output:

         Valid variable names:
         number: 7
         $number: 10
         _number: 25789

         */

        // 2. After the first character, variable names can include letters, numbers (0-9), dollar signs, or underscores.

        int number1 = 2000;          // valid variable name 
        int number_2 = 3000;         // valid variable name
        int number$3 = 4000;         // valid variable name

        /* 
        int number-4 = 5000;       // invalid variable name, cannot include special

        ✬ Error message at console:
         * VariablesPart02.java:50: error: ';' expected
        int number-4 = 5000;       // invalid variable name, cannot include special
                  ^
        Similar errors for below invalid variable names -
        int number@5 = 6000;       // invalid variable name, cannot include special
        int number#6 = 7000;       // invalid variable name, cannot include special
        */

        System.out.println("number1: " + number1);
        System.out.println("number_2: " + number_2);
        System.out.println("number$3: " + number$3);

        /* Output:

         number1: 2000
         number_2: 3000
         number$3: 4000

         */

        // 3. Variable names are case-sensitive, meaning that "myVariable" and "myvariable" would be considered different variables.

        int myVariable = 8000;      // valid variable name
        int myvariable = 9000;      // valid variable name

        System.out.println("myVariable: " + myVariable);
        System.out.println("myvariable: " + myvariable);

        /*Output:

        myVariable: 8000
        myvariable: 9000

         */

        // 4. Variable names cannot be the same as Java reserved keywords (like int, class, public, etc.)

        int intvar = 10000;        // valid variable name
        byte classroom = 104;      // valid variable name
        int publicVar = 30000;     // valid variable name

        System.out.println("intvar : " + intvar);
        System.out.println("classroom : " + classroom);
        System.out.println("publicVar : " + publicVar);

        /* Output:

        intvar : 10000
        classroom: 104
        publicVar : 30000

         */
        
        /*
        int int = 11000;              // invalid variable name, cannot use reserved keyword
        int class = 12000;            // invalid variable name, cannot use reserved keyword
        int public = 13000;           // invalid variable name, cannot use reserved keyword

        ✬ Error message at console:
        VariablesPart02.java:107: error: not a statement
        int int = 11000;              // invalid variable name, cannot use reserved keyword
            ^
        Similar errors for below invalid variable names -
        int class = 12000;            // invalid variable name, cannot use reserved keyword
        int public = 13000;           // invalid variable name, cannot use reserved keyword
        */

        // 5. Variable names should be meaningful and descriptive to enhance code readability.

        int a = 50;                  // not a meaningful variable name
        int age = 25;                // meaningful variable name

        System.out.println("a: " + a);
        System.out.println("age: " + age);

        /* Output:

        a: 50
        age: 25

         */


        /* 6. By convention, variable names in Java typically start with a lowercase letter and use camelCase for multi-word names (e.g., myVariableName). 
        Note : Camel case means the first letter of each word is capitalized except for the first word. */

        int MyVariableName = 70000;      // not following convention
        int myVariableName = 80000;      // following convention

        System.out.println("MyVariableName: " + MyVariableName);
        System.out.println("myVariableName: " + myVariableName);

        /* Output:

        MyVariableName: 70000
        myVariableName: 80000

         */


        // 7. Avoid using special characters (like @, #, %, etc.) in variable names, as they are not allowed.

        int number$ = 90000;         // valid variable name
        int number_ = 100000;        // valid variable name4

        System.out.println("number$: " + number$);
        System.out.println("number_: " + number_);
        /* Output:

        number$: 90000
        number_: 100000

         */


        /*

        int number@ = 110000;       // invalid variable name, cannot include special
        int number# = 120000;       // invalid variable name, cannot include special
        int number% = 130000;       // invalid variable name, cannot include special
        ✬ Error message at console:
        VariablesPart02.java:170: error: ';' expected
        int number@ = 110000;       // invalid variable name, cannot include special
                  ^
        Similar errors for below invalid variable names -
        int number# = 120000;       // invalid variable name, cannot include special
        int number% = 130000;       // invalid variable name, cannot include special

        */

        // 8. There is no limit to the length of a variable name, but it is advisable to keep it concise yet descriptive.

        int aVeryLongVariableNameThatDescribesItsPurposeClearly = 140000;    // valid but not concise
        int marks = 99;                                                      // valid and concise

        System.out.println("aVeryLongVariableNameThatDescribesItsPurposeClearly: " + aVeryLongVariableNameThatDescribesItsPurposeClearly);  
        System.out.println("marks: " + marks);


        /* Output:

        aVeryLongVariableNameThatDescribesItsPurposeClearly: 140000
        marks: 99

         */

        

    }
    
}

/* Note: You can uncomment the invalid variable names one by one to see the error messages at the console. This will help you understand why those variable names are invalid according to the naming rules of variables in Java. */

// Compile : javac VariablesPart02.java
// Run     : java VariablesPart02
