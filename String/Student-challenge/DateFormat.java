// TASK : Find if the given date is in date format(dd/mm/yyyy) or not.

import java.util.Scanner;

public class DateFormat 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date(use forward slash) : ");
        String date = sc.nextLine();

        System.out.print("Is the date in format (dd/mm/yyyy) : ");

        // Using regular expression

        System.out.println(date.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[1-2][0-9]{3}"));

        sc.close();
    }    
}

/*
Output :
========
Case - 1 :
----------
Enter date(use forward slash) : 
17/01/2006
Is the date in format (dd/mm/yyyy) : true

Case - 2 :
----------
Enter date(use forward slash) : 
08/04/2006
Is the date in format (dd/mm/yyyy) : true

Case - 3 :
----------
Enter date(use forward slash) : 
10/05/25
Is the date in format (dd/mm/yyyy) : false
*/
