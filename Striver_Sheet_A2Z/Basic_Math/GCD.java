// TASK : Calculate the gcd/hcf of two numbers
import java.util.Scanner;

public class GCD 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // compute
        while ( a > 0 && b > 0)
        {
            if(a > b)
                a = a % b;
            else
                b = b % a;
        }
        if(a == 0)
            System.out.println("GCD is : " + b);
        else
            System.out.println("GCD is : " + a);

        sc.close();
    }    
}