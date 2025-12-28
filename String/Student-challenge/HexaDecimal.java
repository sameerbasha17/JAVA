// TASK : Find if a number is hexadecimal or not.

import java.util.Scanner;

public class HexaDecimal 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        String number = sc.nextLine();

        System.out.print("Is the number is hexadecimal : ");
        
        //Using the regular expression
        System.out.println(number.matches("[0-9A-F]+"));

        sc.close();
    }    
}

/*
Output : 
========
Case - 1:
---------
Enter a number : 
123AB
Is the number is hexadecimal : true

Case - 2 :
----------
Enter a number : 
S786A 
Is the number is hexadecimal : false

*/
