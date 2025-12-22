/* TASK : Write a program that generates random numbers in the limits a to b. Both are included in the range and are entered by the user of the program. */

import java.util.Scanner;

public class RandomLimit 
{
    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b values(a<b) : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int randomNum = (int)((Math.random() * (b - a + 1))) + a;

        System.out.printf("Random number between %d and %d is %d",a,b,randomNum);

        sc.close();
    }
}

/* 
Output :
========
Enter a and b values(a<b) : 
0 9
Random number between 0 and 9 is 4
*/