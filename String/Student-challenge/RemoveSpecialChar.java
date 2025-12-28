// TASK : Write a program to remove special characters in the string.

import java.util.Scanner;

public class RemoveSpecialChar 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        sc.close();
    }    
}

/*
Output :
--------
Enter a string : 
!j@@a$%v*a)(;
java

*/