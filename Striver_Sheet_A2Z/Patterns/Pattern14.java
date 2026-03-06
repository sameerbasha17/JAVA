import java.util.Scanner;

public class Pattern14 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        /*for(int i = 1; i <= n; i++)
        {
            char ch = 'A';
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch++);
            }
            System.out.println();
        }
        */
       for(int i = 1; i <= n; i++)
       {
        for(char ch = 'A'; ch <= 'A' + i - 1; ch++)
        {
            System.out.print(ch +" ");
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
AB
ABC
ABCD

Enter n value : 4
A 
A B
A B C
A B C D
*/