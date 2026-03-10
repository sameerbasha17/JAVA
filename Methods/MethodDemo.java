// Method : when primitive data type variables are the parameters

import java.util.Scanner;

public class MethodDemo 
{
    static int max(int x, int y)  // formal parameters
    {
        if(x >= y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
/*NOTE : The values of actual parametes are not modified due to the operations in called method. Every method has it's own members(variables). */
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = max(num1, num2);  // actual parameters

        System.out.println("The largest number is : " + result);
        sc.close();
    }
}


/*
Output : 
========
Enter two numbers : 
7 9
The largest number is : 9

*/