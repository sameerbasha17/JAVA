package JAVA.ExceptionHandling;

class Test1
{
    public void meth1() throws Exception
    {
        try
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("Final statement.");
        }
    }
}

public class Finally
{
    public static void main(String[] as)
    {
        Test1 obj = new Test1();
        try
        {
            obj.meth1();
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            System.out.println(e);
        }
    }
}

/*
Output : 
========
Final statement.
java.lang.ArithmeticException: / by zero

*/