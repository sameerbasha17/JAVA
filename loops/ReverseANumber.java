// TASK : Reverse the given number and print it.

import java.util.Scanner;

public class ReverseANumber 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int rem=0,rev=0;

        while(number != 0)
        {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }

        System.out.println("The reversed number : " + rev);
        sc.close();
    }
}

/* 
Output : 
========
Case - 1 :
----------
Enter a number : 
6789
The reversed number : 9876

Case - 2 :
----------
Enter a number : 
090
The reversed number : 9
*/
