// TASK : To check whether the given number is a palindrome or not
import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        int dup = number;
        int rev = 0;

        // reverse the number
        while(number != 0)
        {
            int last_digit = number % 10;
            rev = rev * 10 + last_digit;
            number = number/10;
        }
        if(dup == rev)
        {
            System.out.println(dup + " is a palindrome.");
        }
        else
            System.out.println(dup + " is not a palindrome.");
    }    
}
