//TASK : Write a program to determine the area of a rectangle the dimensions are entered by the user.

import java.util.Scanner;

public class Rectangle 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of the Rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of the Rectangle : ");
        int breadth = sc.nextInt();
        int area = length * breadth;

        System.out.print("Area of Rectangle is : " + area);
        sc.close();
    }   
}

/* 
Output : 
=========
Enter Length of the Rectangle : 7
Enter breadth of the Rectangle : 3
Area of Rectangle is : 21
*/
