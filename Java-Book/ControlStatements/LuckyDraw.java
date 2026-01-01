// TASK : Write a program for a lucky draw.

import java.util.Scanner;
import java.util.Random;

public class LuckyDraw 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Lets start(Y/N) :");
        String opinion = sc.next();
        opinion = opinion.toLowerCase();

        if(opinion.equals("n"))
        {
            System.out.println("...Thank you...");
            System.exit(0);
        }
        else
        {
            int luckyNumber = (Math.abs(rand.nextInt())) % 50 +1;
            System.out.println("Your Lucky Number : " + luckyNumber);
            switch(luckyNumber)
            {
                case 1: System.out.println("You won T.V");
                        break;
                case 10: System.out.println("You win a car");
                         break;
                case 17: System.out.println("You own.");
                         break;
                case 25: System.out.println("You own a computer.");
                         break;
                case 30: System.out.println("You own smart phone");
                         break;
                case 45: System.out.println("You own A.C");

                case 47: System.out.println("Do u want to here a advice(Yes/No):");
                         String adviceChoice = sc.next();
                         char ch = adviceChoice.charAt(0);
                         if(ch == 'Y')
                         {
                            System.out.println("Be patient, Never give up on your goal and dreams.");
                         }
                         else{
                            System.out.println("Ok");
                         }
                         break;
                default: System.out.println("Sorry! Try again...");

            }
        }

        sc.close();
    }   
}
