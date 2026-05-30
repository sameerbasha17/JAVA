/* Program 4 — Greatest of 2 Numbers
======================================
Read two numbers and print the greater of the two. */
import java.util.Scanner;
public class GreatestOfTwoNums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();

        if(n1 >= n2)
            System.out.print("Greatest Number : " + n1);
        else
            System.out.print("Greatest Number : " + n2);

        sc.close();
    }
}

/*
Case - 1 :
===========
Enter Number 1 : 7
Enter Number 2 : 9
Greatest Number : 9

Case - 2 :
==========
Enter Number 1 : -99
Enter Number 2 : 0
Greatest Number : 0
*/