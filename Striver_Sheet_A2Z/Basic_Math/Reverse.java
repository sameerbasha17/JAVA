// TASK : To Reverse the given number.
import java.util.Scanner;
public class Reverse 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // Reverse
        int rev = 0;
        while(n != 0)
        {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n = n/10;
        }

        System.out.println("Reverse number : " + rev);
    }    
}
