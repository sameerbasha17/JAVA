import java.util.Scanner;

public class Pattern20 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        // Print the pattern
        for(int i = 1; i <= n; i++)
        {
            int space = n * 2 - i*2;
            // stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            // Space
            for(int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            // Stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }

        for(int i = 1; i <= n - 1; i ++)
        {
            // Star
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("*");
            }
            // Space
            for(int j = 1; j <= i * 2; j++)
            {
                System.out.print(" ");
            }
            // Star
            for(int j = 1; j <= n - i; j++)
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
Enter n value : 5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/