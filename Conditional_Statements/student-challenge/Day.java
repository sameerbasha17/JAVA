// TASK : Display name of the day based on number.

import java.util.Scanner;

public class Day 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number(1-7) : ");
        byte number = sc.nextByte();

        if(number == 1)
        {
            System.out.println("Monday");
        }
        else if(number == 2)
        {
            System.out.println("Tuesday");
        }
        else if(number == 3)
        {
            System.out.println("Wednesday");
        }
        else if(number == 4)
        {
            System.out.println("Thrusday");
        }
        else if(number == 5)
        {
            System.out.println("Friday");
        }
        else if(number == 6)
        {
            System.out.println("Saturday");
        }
        else if(number == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid input! please enter a valid input.");
        }

        sc.close();
    }    
}

/*
Output :
========
Case - 1 :
----------
Enter a number(1-7) : 
7
Sunday

Case - 2 :
----------
Enter a number(1-7) : 
1
Monday

Case - 3 :
----------
Enter a number(1-7) : 
9
Invalid input! please enter a valid input.

*/
