package JAVA.Inner_Classes;

abstract class A
{
    abstract void display();
}

interface B
{
    public abstract void display();
}

public class AnonymusInnerClass 
{
    public static void main(String[] as) 
    {
        //B obj = new B()
        A obj = new A()  // reference is there but the name of the class is not provided.
        {
            public void display()
            {
                System.out.println("Display Method");
            }
        }  ;
        
        obj.display();
    }
}

/*
Output :
--------
Display Method

*/