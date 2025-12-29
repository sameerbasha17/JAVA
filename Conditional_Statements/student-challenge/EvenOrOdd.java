// TASK : Find if a number is even or odd.

import java.util.Scanner;

public class EvenOrOdd 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if(number % 2 == 0)
        {
            System.out.printf("%d is a even number.",number);
        }
        else{
            System.out.printf("%d is a odd number.",number);
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
67
67 is a odd number.

Case - 2 :
----------
Enter a number : 
8
8 is a even number.
*/
