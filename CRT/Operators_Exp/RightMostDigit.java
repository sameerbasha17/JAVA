/* 4. Right-Most Digit of Integral Part
=======================================
Concept: Cast the float to int to drop the decimal, then apply % 10 (modulus operator) to extract the
last digit.
*/
import java.util.Scanner;
public class RightMostDigit 
{
    public static void main(String[] args)
    {
        System.out.println("Program: Find Right most digit of Integral part of floating-point value.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the floating-point number : ");
        double num = sc.nextDouble();

        int rightMostDigit = ((int)num) % 10;
        rightMostDigit = Math.abs(rightMostDigit); // To avoid sign when -ve

        System.out.print("Right Most digit is : " + rightMostDigit);

        sc.close();
    }
}

/*
Output :
========
Program: Find Right most digit of Integral part of floating-point value.
Enter the floating-point number : 123.45 
Right Most digit is : 3
*/