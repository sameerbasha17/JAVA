
// Example to demonstrate different data types in Java

/* Notes :
 1. Java is a statically typed language, which means that every variable must be declared with a data type.
 2. Java has two main categories of data types: primitive data types and reference data types.
 3. Primitive data types include int, byte, short, long, float, double, char, and boolean.
 4. Reference data types include classes, interfaces, and arrays.
*/

public class DataTypes {
	public static void main(String[] args)
	{
		//Primitive data types
    		byte age=20;                       //size : 1 byte , Range :-128 to 127 , Default value : 0
    		short year=2006;                   //size : 2 byte , Range :-32,768 to 32,767 , Default value : 0
    		int pin = 524004;                  //size : 4 byte , Range :-2,147,483,648 to 2,147,483,647 , Default value : 0
    		long population=123456789;         //size : 8 byte , Range :-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 , Default value : 0

    		System.out.println("Age : " + age);                         //Printing the values
    		System.out.println("DOB Year : " + year);
    		System.out.println("pin : " + pin);
    		System.out.println("population : " + population);

        //Floating point data types
        //Used to represent numbers with fractional parts
        // float and double are the two floating point data types in java

        float price =100.778F;                        /*size : 4 byte , Range : 1.4E-45 to 3.4028235E38 , Default value : 0.0f
                                                      Note : By default, Java treats decimal numbers as double. To specify a float literal, you need to append 'f' or 'F' to the number.*/        
        double pi=3.14159265;                         //size : 8 byte , Range : 4.9E-324 to 1.7976931348623157E308 , Default value : 0.0d

        System.out.println("Price : "+price);        //Printing the values
        System.out.println("pi : "+pi);

        //Character data type
        //Used to represent single 16-bit Unicode character

        char grade='A';                              //size : 2 byte , Range : '\u0000' (or 0) to '\uffff' (or 65,535) , Default value : '\u0000'
        System.out.println("grade : "+grade);        //Printing the values


        //Boolean data type
        //Used to represent one of two values: true or false

        boolean isJavaFun=true;                     //size : not precisely defined , Default value : false
        boolean AmIBadCoder=false;             

        System.out.println("Is java is fun ?? : " +isJavaFun);       //Printing the values
        System.out.println("Am i a bad coder ? : "+AmIBadCoder);

        //Reference data types
        //Used to refer to objects

        String name = "Sameer Basha";                  //String is a class in java
        System.out.println("My name is : "+name);      //Printing the message

        
	}

}

/*  output :
Age : 20
DOB Year : 2025  
pin : 524004
population : 123456789
Price : 100.778
pi : 3.14159265
grade : A
Is java is fun ?? : true
Am i a bad coder ? : false
My name is : Sameer Basha
*/

/* point to remember :
 1. Primitive data types are predefined by the language and named by a reserved keyword.
 2. Reference data types are created by the programmer and are not defined by the language.
 3. Primitive data types hold their values in memory where the variable is allocated.
 4. Reference data types hold a reference to the memory location where the object is stored
 5. Primitive data types are faster and require less memory compared to reference data types.
 6. Reference data types can be null, while primitive data types cannot be null.
 7. Primitive data types have a default value, while reference data types have a default value of null.
 8. Primitive data types are passed by value, while reference data types are passed by reference.
*/

/* This is a basic java program to understand the Primitive and Reference data types.
 * Author : Sameer Basha
 * Date : 20-06-2024
 */
