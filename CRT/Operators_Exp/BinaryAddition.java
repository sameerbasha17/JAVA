/* 12 :Binary Addition of 2 Numbers
======================================
Concept: Read binary strings, convert to int with Integer.parseInt(s, 2), add, then convert back with
Integer.toBinaryString(). Handles carry automatically
*/
import java.util.Scanner;
public class BinaryAddition 
{
    public static void main(String[] args)
    {
        System.out.println("\nProgram : Binary Addition of 2 Numbers.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary number 1(ex: 100101) : ");
        String num1 = sc.next();
        System.out.print("Enter Binary number 2 : ");
        String num2 = sc.next();

        int n1 = Integer.parseInt(num1,2);
        int n2 = Integer.parseInt(num2,2);
        
        int sum = n1 + n2;

        System.out.printf("%s + %s = %s",num1,num2,Integer.toBinaryString(sum));

        sc.close();
    }
}

/*
Output :
========
Program : Binary Addition of 2 Numbers.
Enter Binary number 1(ex: 100101) : 1001
Enter Binary number 2 : 10001
1001 + 10001 = 11010
*/