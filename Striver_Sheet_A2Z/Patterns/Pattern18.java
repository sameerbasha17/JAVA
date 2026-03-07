import java.util.Scanner;

public class Pattern18 
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
            char ch = (char)('A' + n - i);
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch++ + " ");
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
D 
C D
B C D
A B C D

*/