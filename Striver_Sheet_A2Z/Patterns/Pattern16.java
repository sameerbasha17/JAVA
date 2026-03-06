import java.util.Scanner;

public class Pattern16 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter n values : ");
        int n = sc.nextInt();

        char ch = 'A';

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
        sc.close();
    }    
}

/*
Output :
========
Enter n values : 4
A 
B B
C C C
D D D D

*/