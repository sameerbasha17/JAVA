// TASK : Write a program to display arthimetic progression.

import java.util.Scanner;

public class ArthimeticProgression 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term in series(a) : ");
        int a = sc.nextInt();
        System.out.print("Enter difference between numbers(d) : ");
        int d = sc.nextInt();
        System.out.print("Enter number of terms(n) : ");
        int n = sc.nextInt();

        /*System.out.print("\n"+a);
        
        int nextTerm;
        for(int i = 2; i <= n ; i++)
        {
            nextTerm = a+d;
            System.out.print(" " +nextTerm);
            a = nextTerm;
        }
        */

        // Arthimetic progression : a + ad + a2d + a3d + a4d + ....
       int term;
       for(int i =0; i<n; i++)
       {
        term = a + (i*d);
        System.out.print(term + " ");
       }
        sc.close();
    }    
}

/*
Output :
========
Enter first term in series(a) : 2
Enter difference between numbers(d) : 3
Enter number of terms(n) : 5

2 5 8 11 14

*/