// TASK : Write a method that returns the gcd of two numbers.
import java.util.Scanner;
public class GCDOfTwoNums 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("The GCD of " + number1 + " and " + number2 + " is : " + findGCD(number1, number2));
        sc.close();
    }    

    static int findGCD(int m, int n)
    {
        while(m != n)
        {
            if(m > n)
            {
                m = m - n;
            }
            else
            {
                n = n - m;
            }
        }
        
        return m;
    }
}

/*
Output :
=========
Case - 1 :
-----------
Enter two numbers : 
35 56
The GCD of 35 and 56 is : 7

Case - 2 :
----------
Enter two numbers : 
35 86
The GCD of 35 and 86 is : 1 

*/