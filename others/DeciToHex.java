// Task : Convert the decimal number into hexadecimal number

import java.util.Scanner;

public class DeciToHex 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int decimal = sc.nextInt();

        int rem = 0;
        String hex = "";

        while(decimal <  0)
        {
            rem = decimal % 16;
            hex = rem + hex;
            decimal /=16;
        }

        System.out.print("Hexadecimal : " + hex);
        sc.close();
    }
}
