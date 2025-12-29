// TASK : check whether the given year is a leap year or not.

import java.util.Scanner;

public class LeapYear 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        short year = sc.nextShort();

        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.printf("%d is a leap year.",year);
                }
                else{
                    System.out.printf("%d is not a leap year.",year);
                }
            }
            else
            {
                System.out.printf("%d is a leap year.",year);
            }
        }
        else{
            System.out.printf("%d is not a leap year.",year);
        }

        sc.close();
    }
}

/*
Output :
=========
Case - 1 :
----------
Enter a number : 
2006
2006 is not a leap year.

Case - 2 :
---------
Enter a number : 
2016
2016 is a leap year.

*/