import java.util.Scanner;

public class Pattern09 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // input : number of lines
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();

        // print pattern using loops
        for(int i = 1; i <= n ; i++)      // for rows
        {
            for(int j = 1; j <= n - i; j++)   //for spaces(col)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i * 2 - 1); j++)    // for stars(col)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= n - i; j++)   //for spaces(col)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n ; i++)      // for rows
        {
            for(int j = 1; j <= i - 1; j++)   //for spaces(col)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (n * 2 - i * 2 + 1); j++)    // for stars(col)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= i - 1; j++)   //for spaces(col)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }    
}


/*
Output :
---------
Enter number of lines : 4
   *   
  ***
 *****
*******
*******
 *****
  ***
   *

  */