/* Find the errors in the following program; debug it and run the program.
class Operator
{public static void main(String[] args)
{
double x = 5.5, y = 10.5, p = 4.0;
int n = 40, m = 50.2;
Boolean A,B';
A = x>y;
B = y>p;
System.out.println("A = +" A +" and B = " + B);
}}

*/

class Operator
{
    public static void main(String [] args)
    {
        double x = 5.5, y = 10.5, p = 4.0, m = 50.2;
        int n = 40;
        boolean A,B;
        A = x > y;
        B = y > p;
        System.out.println("A = " + A + " and B = " + B);
    }
}

/*
Output :
========
A = false and B = true
*/