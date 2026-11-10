package JAVA.ExceptionHandling;

class NegativeDimensionException extends Exception
{
    @Override 
    public String toString()
    {
        return "The length and breath of rectangle can't be negative.";
    }
}

public class ThrowAndThrows 
{
    public static int area(int l, int b) throws NegativeDimensionException
    {
        if(l < 0 || b < 0) throw new NegativeDimensionException();
        return l * b;
    }

    public static void meth1() throws NegativeDimensionException
    {
        //System.out.println("Area is " +  area(7,9)); // Output : Area is 63

        System.out.println("Area is " +  area(-17,9));  // Output : The length and breath of rectangle can't be negative.
    }

    public static void main(String[] as)
    {
        try
        {
            meth1();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
}

/*
Notes :
-------
We can propagate the exception to calling methods by using throws keyword in method signature and throw key word where the exception arised, but they should be handled by the calling method.
we Can create own exceptions by inheriting the Exception Class. */