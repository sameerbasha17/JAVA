import java.util.Scanner;

public class Pattern15 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter n number : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n; i++)
        {
            for(char ch = 'A'; ch <= 'A' + n - i; ch++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}

/*
Output :
========
Enter n number : 4
A B C D 
A B C
A B
A

*/