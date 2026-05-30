/* Program 8 — Electricity Bill
===============================
Calculate electricity bill based on slab-rate pricing: 0-200 units: Rs.0.50/unit | 201-400: Rs.100 + Rs.0.65/unit
over 200 | 401-600: Rs.230 + Rs.0.80/unit over 400 | 601+: Rs.390 + Rs.1.00/unit over 600. */
import java.util.Scanner;
public class ElectricityBill 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed : ");
        int units = sc.nextInt();

        if(units < 0)
            System.out.print("Invalid Input");
        else if(units >= 601)
            System.out.printf("Price : Rs.%.2f", (390 + 1.00 * (units - 600)));
        else if(units >= 401)
            System.out.printf("Price : Rs.%.2f",(230 + 0.80 * (units - 400)));
        else if(units >= 201)
            System.out.printf("Price : Rs.%.2f",(100 + 0.65 * (units - 200)));
        else 
            System.out.printf("Price : Rs.%.2f",(0.50 * units));

        sc.close();
    }
}

/*
Output :
========
Enter units consumed : 787
Price : Rs.577.00
*/