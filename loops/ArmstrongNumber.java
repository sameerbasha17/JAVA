// TASK : Find the given three digit number is a armstrong number or not.

import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three digit number");
        int number = sc.nextInt();

        int rem =0, sum =0, temp = number;

        while(number > 0)
        {
            rem = number % 10;
            sum = sum + rem * rem * rem;
            number /= 10;
        }

        if(temp == sum)
        {
            System.out.printf("%d is a armstrong number.",temp);
        }
        else{
            System.out.println(temp + " is not a armstrong number.");
        }

        sc.close();
    }
}

/*
Output :
========
Case - 1:
---------
Enter a three digit number
153
153 is a armstrong number.

Case - 2:
---------
Enter a three digit number
345
345 is not a armstrong number.
*/