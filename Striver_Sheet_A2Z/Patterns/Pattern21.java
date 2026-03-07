import java.util.Scanner;

public class Pattern21 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        // Print the pattern
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }    
}


/*
Output : 
========
Enter number of rows : 4
****
*  *
*  *
****

*/