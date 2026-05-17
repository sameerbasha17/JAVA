/* 11 : Convert String to Integer
=================================
Concept: Integer.parseInt(str) parses a numeric string. Wrap in try-catch to handle invalid input
gracefully.
*/
import java.util.Scanner;
public class StringToInt 
{
    public static void main(String[] args)
    {
        System.out.println("Program : Convert String to Integer.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String str = sc.next();

        try
        {
            int num = Integer.parseInt(str);
            System.out.print("Integer value : " + num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid String, make sure the string contains all digits.");
        }
    }    
}

/*
Case - 1 :
Program : Convert String to Integer.
Enter a number as a string: 917
Integer value : 917

Case - 2 :
Program : Convert String to Integer.
Enter a number as a string: 12l3
Invalid String, make sure the string contains all digits.
*/