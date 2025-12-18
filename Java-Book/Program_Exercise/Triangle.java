// Task : Write a program to determine the area of a triangle if three sides are given.

import java.util.Scanner;

public class Triangle 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle : ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        double s = (side1 + side2 + side3)/2.00; // Calculation of semi perimeter.

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("Area of the triangle is " + area);
        sc.close();

    }
}

/*
Output :
========
Enter the three sides of triangle : 
5 5 8
Area of the triangle is 12.0
*/