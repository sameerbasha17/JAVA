/* TASK : Find the errors in the following program; debug it and run the program.

class Typecast2
{public static void main (String Str[])
{
Char B = 7, Q = '6';
int A = 4, D, E;
D = 1+ 2 + '4';
Char F = '4' + 3;
String City = "Delhi";
System.out.println("City = " + City +"-"+ 4 + 5);
System.out.println("City = " + City + " - " +(4*5) );
E = A + B;
Long G = Q + A;
System.out.println("F = " + F + ", E = " + E);
System.out.println("D = " + D + ", G = " + G);
}}

*/

public class TypeCast2
{
    public static void main(String[] str)
    {
        char B = 7, Q = '6';
        int A = 4, D, E;
        D = 1 + 2 + '4';
        char F = '4' + 3;
        String city = "Delhi";
        System.out.println("City = " + city + " - " + 4 + 5);
        System.out.println("City = " + city + " - " + (4 * 5));
        E = A + B;
        long G = Q + A;
        System.out.println("F = " + F + ", E = " + E);
        System.out.println("D = " + D + ", G = " + G);
    }
}

/* 
Output :
========
City = Delhi - 45
City = Delhi - 20
F = 7, E = 11
D = 55, G = 58

*/