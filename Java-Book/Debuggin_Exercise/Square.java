/* Task : Debug the following program and run it.

importjava.util.Scanner;
public class square{

public static void main(String[] args){
  double x, squareroot;
  System.out.print("Enter a positive number: ");
  squareroot = math.sqrt(x);
  System.out.println("Square root of " + x + " = " + squareroot);  
*/

import java.util.Scanner;
public class Square 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x, squareroot;
        System.out.println("Enter a positive number: ");
        x = sc.nextDouble();
        squareroot = Math.sqrt(x);
        System.out.println("Square root of " + x + " = " + squareroot); 
    }
}

/*
Output :
========
Enter a positive number: 
6
Square root of 6.0 = 2.449489742783178
*/