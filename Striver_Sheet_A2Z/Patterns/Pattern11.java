import java.util.Scanner;

public class Pattern11 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter n value(number of rows) : ");
        int n = sc.nextInt();

        // print pattern
        int start = 1;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                start = 0;
            }
            else
            {
                start = 1;
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
        
        sc.close();
    }    
}

/*
Output :
========
Enter n value(number of rows) : 6
1
01
101
0101
10101
010101

*/