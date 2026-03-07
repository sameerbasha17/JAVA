import java.util.Scanner;

public class Pattern19_2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        // Print pattern
        for(int i = 1; i <= n; i ++)
        {
            if(i <= n/2) // top part
            {
                //star
                for(int j = 1; j <= n/2 - i + 1; j++)
                {
                    System.out.print("*");
                }
                // space
                for(int j = 1; j <= i * 2 - 2; j++)
                {
                    System.out.print(" ");
                }
                // Print
                for(int j = 1; j <= n/2 - i + 1; j++)
                {
                    System.out.print("*");
                }
                System.out.println(); // For new line.
            }
            else
            {
                //stars
                for(int j = 1; j <= i - n/2; j++)
                {
                    System.out.print("*");
                }
                // Space
                for(int j = 1; j <= n - (i - n/2) * 2; j++)
                {
                    System.out.print(" ");
                }
                //stars
                for(int j = 1; j <= i - (n/2); j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
        sc.close();
    }    
}

/*
Output :
=========
Enter number of rows : 10
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/