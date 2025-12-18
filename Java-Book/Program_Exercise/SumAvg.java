// Task : Write a program which sums up for numbers and finds an average value.

import java.util.Scanner;

public class SumAvg 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four numbers(int) : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        
        int sum = num1 + num2 + num3 + num4 ;

        float avg = sum/4f;  // f is necessary.Because any one value in the expression must be float.

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + avg);
    }
}

/*
Output :
========
Enter four numbers(int) : 
3 2 5 1 3
Sum is 11
Average is 2.75
*/