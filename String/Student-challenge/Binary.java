// TASK : Find if a number is a binary or not.

import java.util.Scanner;

public class Binary 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        // converting the number into the string
        String str = String.valueOf(number);

        System.out.print("Is the number is Binary : ");
        //Using the Regular expression
        System.out.println(str.matches("[01]+"));

        sc.close();
    }
}

/* 
Output :
=========
Case - 1 :
----------
Enter a number : 
101011
Is the number is Binary : true

Case - 2 :
----------
Enter a number : 
10101901
Is the number is Binary : false
*/
