// TASK : write a program to display geometic progression.

import java.util.Scanner;

public class GP 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first term in series(a) : ");
        int a = sc.nextInt();
        System.out.print("Enter ratio(r) : ");
        int r = sc.nextInt();
        System.out.print("Enter number of terms(n) value : ");
        int n = sc.nextInt();

        int term = a;

        for(int i = 1; i <= n; i++)
        {
            System.out.print(term + " ");
            term = term * r;
        }

        sc.close();
    }    
}

/*
Output :
========
Enter first term in series(a) : 
5
Enter ratio(r) : 2
Enter number of terms(n) value : 6
5 10 20 40 80 160 

*/
