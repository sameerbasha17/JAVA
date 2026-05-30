/* Program 6 — Vowel or Consonant
===================================
Read a single character and determine if it is a vowel, consonant, or not an alphabet. */
import java.util.Scanner;
public class VowelOrConsonant 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
        {
            if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
                ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
               )
               System.out.print("Vowel");
            else
                System.out.print("Consonant");

        }
        else
            System.out.print("Not an alphabet");

        sc.close();
    }
}

/*
Case - 1 :
==========
Enter a character : a
Vowel

Case - 2 :
===========
Enter a character : S
Consonant

Case - 3 :
==========
Enter a character : &
Not an alphabet
*/