import java.util.Scanner;

public class Pattern19 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();

        // Print pattern

        //First half
        for(int i = 1; i <= n/2; i++)
        {
            //stars
            for(int j = 1; j <= (n/2 - i + 1); j++)
            {
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= (i - 1); j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i - 1); j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= (n/2 - i + 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // remaining half
        for(int i = 1; i <= n/2; i++)
        {
            //stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= n/2 - i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= n/2 - i; j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }    
}

/*
Output :
========
Enter number of lines : 10
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