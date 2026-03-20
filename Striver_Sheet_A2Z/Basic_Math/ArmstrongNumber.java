// TASk: Check whether the given number is armstrong or not
import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a number(Three Digit only) : ");
        int n = sc.nextInt();

        // check for armstrong
        int dup = n;
        int sum = 0;

        while(n > 0 )
        {
            int last_digit = n % 10;
            sum += last_digit * last_digit * last_digit;
            n = n/10;
        }
        
        if(dup == sum)
            System.out.println(dup + " is an armstrong number.");
        else
            System.out.println(dup + " is not a armstrong number.");
    }    
}
