/* 16 : Simple Interest
=========================
Concept: SI = (P × R × T) / 100. Straightforward arithmetic using the three inputs. */
import java.util.Scanner;
public class SimpleInterest 
{
    public static void main(String[] args)
    {
        System.out.println("\nProgram: Simple interest.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter Time in years : ");
        byte t = sc.nextByte();
        System.out.print("Enter Rate of interest(%) : ");
        byte r = sc.nextByte();

        double si = (p * t * r)/ 100.0;

        System.out.printf("Simple Interest : %.2f",si);

        sc.close();
    }    
}

/*
Output : 
========
Program: Simple interest.
Enter Principal Amount : 1000
Enter Time in years : 3
Enter Rate of interest(%) : 5
Simple Interest : 150.00
*/