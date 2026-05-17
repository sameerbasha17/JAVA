/* 7. Swap Two Numbers (With & Without Temp)
============================================
Concept: With temp: classic three-step swap. Without temp: arithmetic trick using addition/subtraction
to swap in-place without extra memory.
*/
import java.util.Scanner;
public class Swap 
{
    public static void main(String[] args)
    {
        System.out.println("Program: Swapping with and without third variable.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1(a) : ");
        int a = sc.nextInt();
        System.out.print("Enter number2(b) : ");
        int b = sc.nextInt();

        int x = a, y = b; // For using in without third variable method

        System.out.println("Before Swapping :\nA = " + a + ", B = " + b);

        System.out.println("\nWith using third variable :");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping:\nA = " + a + ", B = " + b);

        System.out.println("==================================================================");

        System.out.println("\nWithout using third variable(Arithmetic operations) : ");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("\nAfter Swapping:\nA = " + x + ", B = " + y);

        sc.close();
    }    
}

/*
Output :
========
Program: Swapping with and without third variable.
Enter number1(a) : 17
Enter number2(b) : 9
Before Swapping :
A = 17, B = 9

With using third variable :

After Swapping:
A = 9, B = 17
==================================================================

Without using third variable(Arithmetic operations) : 

After Swapping:
A = 9, B = 17
*/