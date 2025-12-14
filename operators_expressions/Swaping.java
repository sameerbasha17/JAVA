import java.util.Scanner;

public class Swaping 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Swaping of Two numbers Program");
        System.out.println();

        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Before Swapping a = " + a + " b = " + b );

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swapping, a = " + a + " b = " + b);
    }
}

/* 
Output :
========
Swaping of Two numbers Program

Enter two numbers : 2 9
Before Swapping a = 2 b = 9
After Swapping, a = 9 b = 2
*/
