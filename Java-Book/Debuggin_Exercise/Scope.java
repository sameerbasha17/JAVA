/* TASK : Find errors in the following gprogram; cebug it and run the program.

classmathcal{
int Prod(){return ++x*--y;}
int x;
int y; }
class Scope{
public static void main(String arg[]){
calc p = new calc();
p.x = 15;
p.y = 23;
System.out.println("Product of x and y = " + p.prod());
}}

*/

class MathCal
{
    int prod()
    {
        return ++x * --y;
    }
    int x,y;
}

public class Scope
{
    public static void main(String [] args)
    {
        MathCal p = new MathCal();
        p.x = 15;
        p.y = 23;
        System.out.println("Product of x and y = " + p.prod());
    }
}

/*
Output :
========
Product of x and y = 352

*/