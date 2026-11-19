package JAVA.LamdaExpression;

@FunctionalInterface 
interface Imy2
{
    void show();
}

class Test2
{
    public void callLamda(Imy2 obj)
    {
        obj.show();
    }
}
public class AsObject 
{
    public static void main(String[] as) 
    {
        Test2 obj = new Test2();
        obj.callLamda(() -> {System.out.println("Hi");});    // Lamda expression is passed as the object of type functional interface.
    }    
}

/*
Output :
========
Hi
*/