/* 9 Seconds → Hours : Minutes : Seconds
=========================================
Concept: Divide by 3600 for hours; take modulus then divide by 60 for minutes; final modulus gives
seconds.
*/
import java.util.Scanner;
public class TimeConverter 
{
    public static void main(String[] args)
    {
        System.out.println("Program: Time Converter");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total Seconds : ");
        int totalSec = sc.nextInt();

        int hrs = totalSec/3600;
        int min = (totalSec%3600)/60;
        int sec = (totalSec%3600)%60;

        System.out.printf("%d:%d:%d",hrs,min,sec);

        sc.close();
    }
}    

/*
Output :
========
Program: Time Converter
Enter total Seconds : 
9797
2:43:17
*/