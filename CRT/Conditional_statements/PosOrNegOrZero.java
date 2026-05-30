/* Task 02 : Positive or Negative
===============================================
Read a number and determine whether it is positive, negative, or zero. */
import java.util.Scanner;
public class PosOrNegOrZero 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if(number == 0)
            System.out.print("Zero");
        else if(number > 0)
            System.out.print("Positive");
        else
            System.out.print("Negative");

        sc.close();
    }    
}

/*
Case - 1 :
===========
Enter a number : 179
Positive

Case - 2 :
==========
Enter a number : 0
Zero

Case - 3 :
==========
Enter a number : -1
Negative
*/