// TASK : Write a program to find the average of five double numbers.

import java.util.Scanner;

public class DoubleAvg 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter five double type numbers : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();

        double avg = (num1 + num2 + num3 + num4 + num5)/5;

        System.out.println("The Average is " + avg);
    }
}
