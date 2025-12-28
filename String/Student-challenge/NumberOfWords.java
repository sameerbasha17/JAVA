// TASK : Count the number of words in a string.

import java.util.Scanner;

public class NumberOfWords 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s+"," ").trim();

        String words[] = str.split(" ");
        System.out.println("The number of words in the string = " + words.length);

        sc.close();
    }    
}

/*
Output :
========
Enter a string : 
  i am    a    CSE student persuing    btech in Narayana    Engineering  college 
The number of words in the string = 11
*/
