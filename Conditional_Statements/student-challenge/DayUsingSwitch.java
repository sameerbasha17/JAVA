// TASK : Display name of the day using number. use switch case for this program.

import java.util.Scanner;

public class DayUsingSwitch 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number(1-7) : ");
        int number = sc.nextInt();

        switch(number)
        {
            case 1: System.out.println("Monday");
                    break;
            case 2 : System.out.println("Tuesday");
                     break;
            case 3: System.out.println("Wednesday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            case 4 : System.out.println("Thrusday");
                    break;
            default : System.out.println("INVALID input. please enter a valid input.");
                      break;
            case 5 :System.out.println("Friday");
                    break;
            case 6 :System.out.println("Saturday");
        }

        //Note : i used unordered cases still no error is raised.

        sc.close();
    }    
}

/*
Output :
========
Case - 1 :
----------
Enter a number(1-7) : 
3
Wednesday

Case - 2 :
----------
Enter a number(1-7) : 
9
INVALID input. please enter a valid input.

*/