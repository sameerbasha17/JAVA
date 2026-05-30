/* Program 3 — Odd or Even
===========================
Read an integer and determine whether it is odd or even. */
import java.util.Scanner;
public class OddOrEven 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int number = sc.nextInt();

        if((number & 1) == 1)
            System.out.print("Odd number");
        else
            System.out.print("Even number");

        sc.close();
    }
}

/*
Case - 1 :
==========
Enter a integer : -8
Even number

Case - 2 :
==========
Enter a integer : 9
Odd number
*/