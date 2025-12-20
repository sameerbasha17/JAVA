public class BooleanLogicalOperators 
{
    public static void main(String [] args)
    {
        int a = 7, b = 9;
        boolean x,y;

        x = a > b;
        y = a < b;

        System.out.println("Is \"a\" greater than \"b\" ? : " + x);
        System.out.println("Is \"a\" lessthan \"b\" ? : " + y);
        System.out.println("a == b : " + (a==b));

        boolean p,q,r,s;

        p = x & y;
        q = x | y;
        r = x ^ y;
        s = !x;
        p = x && y;
        
        System.out.println("\nx = " + x + " y = " + y);
        System.out.println("x & y : " + p);
        System.out.println("x | y : " + q);
        System.out.println("x ^ y : " + r);
        System.out.println("!x : " + s);
        System.out.println("x && y : " + p);
        System.out.println("x || y : " + (x || y));
    }
}
