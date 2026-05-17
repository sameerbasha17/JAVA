/* 14 : Decimal → Hex, Octal & Binary
======================================
Concept: Java's Integer class provides toHexString(), toOctalString(), and toBinaryString() utility
methods for base conversion.
*/
import java.util.Scanner;
public class BaseConversion 
{
    public static void main(String[] args)
    {
        System.out.println("\nProgram: Decimal to Hex, Octal and Binary.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal number(Base - 10) : ");
        int n = sc.nextInt();

        System.out.println("In Hex : " + Integer.toHexString(n).toUpperCase());
        System.out.println("In Octal : " + Integer.toOctalString(n));
        System.out.println("In Binary : " + Integer.toBinaryString(n));

        sc.close();
    }    
}

/*
Output :
========
Program: Decimal to Hex, Octal and Binary.
Enter a Decimal number(Base - 10) : 2208
In Hex : 8A0
In Octal : 4240
In Binary : 100010100000
*/