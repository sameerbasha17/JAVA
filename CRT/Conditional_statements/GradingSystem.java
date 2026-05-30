/* Program 9 — Grading System
===============================
Read a student's exam percentage and print the corresponding grade: 90-100 → A+ | 80-89 → A | 70-79 → B+ |
60-69 → B | 50-59 → C | 40-49 → D | below 40 → Failed. */
import java.util.Scanner;
public class GradingSystem 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks : ");
        short marks =sc.nextShort();

        if(marks < 0 || marks > 100)
            System.out.print("Invalid Input: Marks should be >= 0 and <= 100.");
        else if(marks >= 90)
            System.out.print("Grade : A+");
        else if(marks >= 80)
            System.out.print("Grade : A");
        else if(marks >= 70)
            System.out.print("Grade : B+");
        else if(marks >= 60)
            System.out.print("Grade : B");
        else if(marks >= 50)
            System.out.print("Grade : C");
        else if(marks >= 40)
            System.out.print("Grade : D");
        else
            System.out.print("Failed");

        sc.close();
    }
}

/*
Case - 1 :
==========
Enter the marks : 99
Grade : A+
*/