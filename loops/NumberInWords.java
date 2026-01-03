// Display a number in words even with tailing zero.

import java.util.Scanner;

public class NumberInWords
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int rem = 0;
        String str = "";

        while(number != 0)
        {
            rem = number % 10;
            str = str + rem;
            number = number/10;
        }

        for(int i = str.length()-1; i >= 0 ; i--)
        {
            switch(str.charAt(i))
            {
                case '1': System.out.print("One");
                        break;
                case '2': System.out.print("Two");
                        break;
                case '3': System.out.print("Three");
                        break;
                case '4': System.out.print("Four");
                        break;
                case '5': System.out.print("Five");
                        break;
                case '6': System.out.print("Six");
                        break;
                case '7': System.out.print("Seven");
                        break;
                case '8': System.out.print("Eight");
                        break;
                case '9': System.out.print("Nine");
                        break;
                case '0': System.out.print("Zero");
                        break;
                default : System.out.println("NAN");
            }
            System.out.print(" ");
        }
        sc.close();
    }
}

/*
Output :
=========
Enter a number : 
1234567890
One Two Three Four Five Six Seven Eight Nine Zero 

*/