// TASK : Count the number of digits in the given number
import java.util.Scanner;

public class CountDigits 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // count digits
        int count = 0, dup = n;
        n = Math.abs(n);
        if(n == 0)
        {
            count = 1;
        }
        else
        {
            while(n > 0)
            {
                count ++;
                n = n/10;
            }
        }
            
        System.out.println("The number of digits in " + dup + " is : " + count);
        
        sc.close();
    }    
}
