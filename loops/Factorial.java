// TASK : Find factorial of a number.

import java.util.Scanner;

public class Factorial 
{
    public static void main(String []  args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int factorial = 1;

        for(int i = number; i >= 1; i--)
        {
            factorial *= i;
        }
        System.out.println("Factorial of " + number +" is " + factorial);
        sc.close();
    }
}

/*
Output :
========
Enter a number : 
5
Factorial of 5 is 120

*/