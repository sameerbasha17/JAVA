package JAVA.LamdaExpression;

/* Lamda Expressions is useful to implement functional interfaces. we can write annonymus methods. Easy than writting Annonymus inner classes or implemeted by a class and creating object and calling.*/

@FunctionalInterface 
interface Imyinterface1
{
    void show(); // By default public and abstract
}

public class Demo 
{
    public static void main(String[] as) 
    {
        Imyinterface1 i1 = () -> { System.out.print("Hello"); };

        i1.show();
    }
}
