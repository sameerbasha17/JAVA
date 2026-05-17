/* 8 Convert Days → Years, Weeks & Days
========================================
Concept: 1 year = 365 days (leap years ignored). Use integer division (/) and modulus (%) to extract
years, remaining weeks, and leftover days.
*/
import java.util.Scanner;
public class DaysConverter
{
    public static void main(String[] args)
    {
        System.out.println("Program: Days Converter");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Days : ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int weeks = (totalDays%365)/7;
        int days = (totalDays%365)%7;

        System.out.printf("Years : %d%nWeeks : %d%nRemaining days : %d",years,weeks,days);

        sc.close();
    }    
    
}

/*
Output :
Program: Days Converter
Enter Number of Days : 1109
Years : 3
Weeks : 2
Remaining days : 0
*/