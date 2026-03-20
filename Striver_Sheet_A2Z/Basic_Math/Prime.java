// TASK: Print the number is prime or not

import java.util.Scanner;

public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // check
        if(n <= 1)
        {
            System.out.println(n + " is not a prime number");
        }
        else 
        {
            boolean flag = true;
            for(int i = 2; i * i <= n; i ++)
            {
                if(n % i == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }    
}
