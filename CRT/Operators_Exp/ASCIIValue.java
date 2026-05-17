/* 6. ASCII Value of a Character
=================================
Concept: Casting a char to int yields its ASCII value. E.g. (int)'A' → 65.
*/
import java.util.Scanner;
public class ASCIIValue 
{
    public static void main(String[] args)
    {
        System.out.println("Program: ASCII Value of a character.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char ch = sc.nextLine().charAt(0);

        int ASCII_Value = ch;

        System.out.print("ASCII value of '" + ch + "' is : " + ASCII_Value);

        sc.close();

    }    
}

/*
Output :
========
Program: ASCII Value of a character.
Enter a character : a
ASCII value of 'a' is : 97
*/