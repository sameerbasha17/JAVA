package programs;
import java.util.Scanner;
public class WaterPurifierCal {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        // water purifier price in rupees taken from the user as input
        System.out.println("Enter the price of your water purifier : ");
        float price_of_purifier = sc.nextFloat();

        // num of water cans
        System.out.println("Enter How many number of water cans you have : ");
        int num = sc.nextInt();

        //price of single water can
        System.out.println("Enter the price of one water can : ");
        float price_of_can = sc.nextFloat();

        //No.of times you fill watercans together in a week
        System.out.println("How often you fill water cans in a week (together) : ");
        int fill_can = sc.nextInt();

        float weekly_cost = fill_can*num*price_of_can; // weekly cost
        float daily_can_cost = weekly_cost/7;          // daily cost
        float days = price_of_purifier/daily_can_cost;  // total number of days
        float years = days/365;         // in years
        

        System.out.printf("For %f days(%f years) , your purifier recover %f rupees.",days,years,price_of_purifier);
        sc.close();

    }
}
