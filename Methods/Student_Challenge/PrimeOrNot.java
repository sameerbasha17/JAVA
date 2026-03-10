// TASK : Write a method which checks whether a number is Prime or not.
import java.util.Scanner;

public class PrimeOrNot 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        PrimeOrNot obj = new PrimeOrNot();

        if(obj.isPrime(num))
        {
            System.out.println("The number " + num + " is a prime number.");
        }
        else
        {
            System.out.println("The number " + num + " is not a prime number.");
        }
        sc.close();
    }

    boolean isPrime(int number)
    {
        for(int i = 2; i <= (int)Math.sqrt(number); i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

/*
Output : 
========
Case - 1 :
----------
Enter a number : 
17
The number 17 is a prime number.

Case - 2 :
-----------
Enter a number : 
91
The number 91 is not a prime number.

*/