package JAVA.ExceptionHandling;
import java.util.Scanner;

public class ExceptionConstruct
{
    public static void main(String[] as) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Divison of Two Numbers");
        
        int num1, num2, res;

        try
        {

            System.out.println("Enter Number 1 : ");
            num1 = sc.nextInt();
            System.out.println("Enter Number 2 : ");
            num2 = sc.nextInt();

            res = num1 / num2;
            System.out.println("Result = " + res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("The Number 2 Can't be Zero. Please enter non zero value.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Last Statement.");
    }
}

/*
Output : 
========
Case - 1:
---------
Divison of Two Numbers
Enter Number 1 : 
7
Enter Number 2 : 
0
The Number 2 Can't be Zero. Please enter non zero value.
Last Statement.

Case - 2 :
----------
Divison of Two Numbers
Enter Number 1 : 
9
Enter Number 2 : 
1
Result = 9
Last Statement.

*/