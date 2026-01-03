// TASK : Check a number is a palindrome.

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String [] args)    
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int temp = number, rem = 0, rev = 0;

        while(number != 0)
        {
            rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }

        if(temp == rev)
            System.out.println(temp+ " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");

        sc.close();
    }
}

/*
Output : 
========
Case - 1 :
----------
Enter a number : 
6767676
6767676 is a palindrome.

Case - 2 :
----------
Enter a number : 
67909
67909 is not a palindrome.
*/