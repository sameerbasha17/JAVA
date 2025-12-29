// TASK : Find radix of a number given in a string.

import java.util.Scanner;

public class Radix 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String number = sc.next();

        if(number.matches("[01]+"))
        {
            System.out.println("Radix : 2");
        }
        else if(number.matches("[0-7]+"))
        {
            System.out.println("Radix : 8");
        }
        else if(number.matches("[0-9]+"))
        {
            System.out.println("Radix : 10");
        }
        else if(number.matches("[0-9A-F]+"))
        {
            System.out.println("Radix : 16");
        }
        else
        {
            System.out.println("Invalid input. Please enter a valid input.");
        }

        sc.close();

    }    
}

/*
Output :
========
Case - 1 :
----------
Enter a number : 
676
Radix : 8

Case - 2 :
----------
Enter a number : 
7098
Radix : 10

Case - 3 :
----------
Enter a number : 
1
Radix : 2

Case - 4 :
----------
Enter a number : 
10A
Radix : 16

Case - 5 :
----------
Enter a number : 
6M  
Invalid input. Please enter a valid input.

*/