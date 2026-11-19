package JAVA.JavaDoc_Annotations;
import java.util.*;
/*
Built-In Annotations : 

1) Ovverride
2) Depricated
3) SuppressWarnings
4) SafeVarargs
5) FunctionalInterface  */

@FunctionalInterface
interface Test2
{
    public void message();
    //public int demo();      Only one method is allowed if FunctionalInteface annotation is used.
}

class Test
{
    public void show()
    {
        System.out.println("Show Method from Test Class.");
    }

    @Deprecated
    public int max(int x, int y)
    {
        return (x>y)? x : y;
    }
}

public class Annotations extends Test
{

    static List l;
    //@SuppressWarnings("deprecation")
    @SuppressWarnings("unchecked")
    public static void main(String[] as) 
    {
        Annotations obj = new Annotations();
        obj.show();

        System.out.println(obj.max(1,2));

        l.add(1);

    }

    @Override 
    public void show()
    {
        System.out.println("Show Method Overrided.");
        super.show();
    }

    
}
