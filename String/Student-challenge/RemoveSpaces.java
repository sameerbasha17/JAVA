// TASK: Remove the extra spaces in the given string.

import java.util.Scanner;

public class RemoveSpaces 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        System.out.println(str.replaceAll("\\s+"," "));

        sc.close();
    }    
}

/*
Output :
========
Enter a string : 
java   one      step      ahead      by      Anita    seth and B.L.     Juneja
java one step ahead by Anita seth and B.L. Juneja

*/