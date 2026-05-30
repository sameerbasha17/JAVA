/* Program 7 — Leap Year
=========================
Read a year and determine whether it is a leap year. A year is a leap year if it is divisible by 4, except for century
years, which must be divisible by 400. */
import java.util.Scanner;
public class LeapYear 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year : ");
        short year = sc.nextShort();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.print("Leap Year");
        else
            System.out.print("Non leap year");

        sc.close();
    }
}

/*
Case - 1 :
==========
Enter a year : 2006
Non leap year

Case - 2 :
==========
Enter a year : 2016
Leap Year
*/