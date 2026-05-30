/* Program 10 — Weekdays
=========================
Read a weekday number (0 = Sunday, 6 = Saturday) and print the corresponding day name. Any value outside
0–6 prints 'Invalid'. */
import java.util.Scanner;
public class WeekDays 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day number(0-6) : ");
        byte day = sc.nextByte();

        switch(day)
        {
            case 0 : System.out.print("Sunday");break;
            case 1 : System.out.print("Monday");break;
            case 2 : System.out.print("Tuesday");break;
            case 3 : System.out.print("Wednesday");break;
            case 4 : System.out.print("Thrusday");break;
            case 5 : System.out.print("Friday");break;
            case 6 : System.out.print("Saturday");break;
            default : System.out.print("Invalid");
        }

        sc.close();
    }
}
/*
Case - 1 :
==========
Enter Day number(0-6) : 3
Wednesday 

Case - 2 :
==========
Enter Day number(0-6) : 9
Invalid
*/