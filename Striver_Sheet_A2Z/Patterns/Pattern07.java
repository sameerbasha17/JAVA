package Patterns;
/*

    * 
   ***
  *****
 *******
*********

*/

import java.util.Scanner;

public class Pattern07
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Take input from the user 
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
    
        // print pattern
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= (n - i); j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= (i * 2 - 1); j++)
            {
                System.out.print("*");
            }

            for(int j = 1; j <= (n - i); j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }

        sc.close();
    }
}