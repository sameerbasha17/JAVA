/* 15 : Compound Interest
=========================
Concept: A = P × (1 + R/100)^T ; CI = A − P. Math.pow() computes the exponentiation. */
import java.util.Scanner;
public class CompoundInterest 
{
    public static void main(String[] args)
    {
        System.out.println("\nProgram : Compound Interest.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter Rate of Interest(%) : ");
        byte r = sc.nextByte();
        System.out.print("Enter time in years : ");
        byte t = sc.nextByte();

        double amount = p * Math.pow(1+r/100.0,t);

        double ci = amount - p;

        System.out.printf("Amount : %.2f%n",amount);
        System.out.printf("Compound Interest : %.2f", ci);

        sc.close();
    }    
}

/*
Output :
========
Program : Compound Interest.
Enter Principal Amount : 1000
Enter Rate of Interest(%) : 10
Enter time in years : 2
Amount : 1210.00
Compound Interest : 210.00
*/