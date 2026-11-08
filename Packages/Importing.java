// By default java.util.lang package is imported.

/*
There are three ways to import a packages.
1) import java.util.*;        // import all the subpackages
2) import java.util.Scanner;  //specific path  
3) Using in the statement*/
public class Importing 
{
    public static void main(String[] as) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);  
        
        int a = sc.nextInt();

        System.out.print("a : " + a);
    }
}

/*
Output :
--------
9
a : 9

*/