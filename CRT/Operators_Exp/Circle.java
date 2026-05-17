/* 1. Area & Circumference of a Circle 
=======================================
Concept: Uses the formulae: Area = π × r² and Circumference = 2 × π × r. Math.PI provides the
constant π. */

import java.util.Scanner;

public class Circle 
{
    public static void main(String[] args)
    {
        System.out.println("Program: Find Area and Circumference of a Circle");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        System.out.printf("Area of circle with %.2f radius is %.2f%n",r,area);
        System.out.printf("Circumference of the circle : %.2f", circumference);

        sc.close();
    }    
}

/*
Output :
========
Program: Find Area and Circumference of a Circle
Enter the radius of the Circle: 7.9
Area of circle with 7.90 radius is 196.07
Circumference of the circle : 49.64
*/