/* Write a program that finds the greatest of 4 integer numbers using ternary operator. The number values are entered by the user of the program. */

import java.util.Scanner;
public class TernaryGreatestNumber 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int temp = (a > b) ? a : b;
        temp = (temp > c) ? temp : c;
        temp = (temp > d) ? temp : d;

        System.out.printf("Greatest Number among %d, %d, %d, %d is %d ",a,b,c,d,temp);
    }
}

/*
Output :
========
Enter four numbers : 
1 7 9 3 
Greatest Number among 1, 7, 9, 3 is 9
*/