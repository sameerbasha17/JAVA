// Recursion demo

public class Recursion 
{
    public static void main(String [] args)
    {
        fun(3);
    }

    static void fun(int x)
    {
        if(x > 0)
        {
            System.out.println(x);
            fun(x - 1);
            // System.out.println(x);
        }
    }
}
