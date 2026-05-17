/* 2. Area & Perimeter of a Rectangle
=====================================
Concept: Area = length × breadth, Perimeter = 2 × (length + breadth). */

import java.util.Scanner;
public class Rectangle 
{
    public static void main(String[] args)
    {
        System.out.println("Program : Area and perimeter of Rectangle.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle : ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle : ");
        double b = sc.nextDouble();

        System.out.printf("Area : %.2f%n", l * b);
        System.out.printf("Perimeter : %.2f", 2 *(l + b));

        sc.close();
    }
}

/*
Output : 
========
Program : Area and perimeter of Rectangle.
Enter the length of the rectangle : 17
Enter the breadth of the rectangle : 9
Area : 153.00
Perimeter : 52.00
*/