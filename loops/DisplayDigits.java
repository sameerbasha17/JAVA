// TASK : Display digits of a number.

import java.util.Scanner;

public class DisplayDigits 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int rem;
        while(number > 0)
        {
            rem = number %10;   
            System.out.println(rem);
            number = number/10;
        }

        sc.close();
    }    
}

/*
Output :
========
Enter a number : 
12345
5
4
3
2
1

*/