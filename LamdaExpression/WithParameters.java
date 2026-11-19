package JAVA.LamdaExpression;

@FunctionalInterface 
interface Imyinterface1
{
    void show(String str); // By default public and abstract
}

@FunctionalInterface 
interface ImyInterface2
{
    int add(int x, int y);
}

public class WithParameters
{
    public static void main(String[] as) 
    {
        Imyinterface1 i1 = (s) -> { System.out.println(s); };

        i1.show("Sri Pada");

        ImyInterface2 i2 = (x, y) -> x + y;  // see, even a expression is become a method. 

        System.out.println(i2.add(9,17));
    }
}

/*
Output :
=========
Sri Pada
26

*/