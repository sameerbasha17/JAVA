/* TASK : Write a program that sums up numbers from a to b, and both limits are included in the sum. The values a and b are entered
by the user. */ 

import java.util.Scanner;

public class RandomSum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b values(a<b) : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        
        /*
        for(int i = a; i <= b ; i++)
        {
            sum += i;
        } */

        sum = ((b - a + 1 ) * (a+b))/2;
        
        System.out.println("The total sum is " + sum);

        sc.close();
    }
}

/*
Output :
========
Enter a and b values(a<b) : 
1
9
The total sum is 45
*/
