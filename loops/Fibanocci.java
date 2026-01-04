// TASK : Display Fibanocci series.

import java.util.Scanner;

public class Fibanocci
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms in series(n>=2) : ");
        int n = sc.nextInt();

        int a = 0, b = 1,term;

        System.out.print(a + "," + b);

        for(int i = 1; i <= n-2 ; i++)
        {
            term = a + b;
            System.out.print("," + term);
            a = b;
            b = term;
        }

        sc.close();

    }
}

/*
Output :
========
Enter number of terms in series(n>=2) : 
7
0,1,1,2,3,5,8

*/