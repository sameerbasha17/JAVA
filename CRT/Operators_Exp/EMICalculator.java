/* 13 : EMI Calculator
=======================
Concept: EMI = P × r × (1+r)^n / ((1+r)^n − 1), where r = annual rate / (12 × 100) and n = months.
Uses Math.pow() for the power.
*/
import java.util.Scanner;
public class EMICalculator 
{
    public static void main(String[] args)
    {
        System.out.println("\nProgram : EMI Calculator.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal loan Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter rate of Interest(Annual) :");
        int annual_r = sc.nextInt();
        System.out.print("Enter number of Months : ");
        int months = sc.nextInt();

        double r = annual_r/(12 * 100.0);

        double emi = (p * r * Math.pow(1+r,months))/((Math.pow(1+r,months) - 1));

        System.out.printf("EMI per Month : RS.%.2f",emi);

        sc.close();
    }
}

/* 
Program : EMI Calculator.
Enter principal loan Amount : 100000
Enter rate of Interest(Annual) :10
Enter number of Months : 24
EMI per Month : RS.4614.49
*/