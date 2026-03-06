import java.util.Scanner;

public class Pattern17 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++)
        {
            char ch = 'A';
            int index = i * 2 - 1;

            // space
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }

            //Alphabet
            for(int j = 1; j <= (index / 2) + 1; j++)
            {
                System.out.print(ch++ + " ");
            }
            --ch;
            for(int j = 1; j <= i - 1; j++)
            {
                System.out.print(--ch + " ");
            }

            //space
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }

            System.out.println();
        }

        sc.close();
    }    
}


/*
Output :
========
Enter n value : 4
      A       
    A B A
  A B C B A
A B C D C B A 

*/