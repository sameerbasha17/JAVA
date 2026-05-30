// Task 01 : Read an age from the user and validate whether it is a valid human age (0–120).
import java.util.Scanner;
public class Age 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age : ");
        short age = sc.nextShort();

        if(age >= 0 && age <= 120)
            System.out.print("Valid Human Age.");
        else
            System.out.print("Invalid Human age.");

        sc.close();
    }    
}

/*
Case - 1 :
===========
Enter age : 20
Valid Human Age.

Case - 2 :
==========
Enter age : 20
Valid Human Age.
*/