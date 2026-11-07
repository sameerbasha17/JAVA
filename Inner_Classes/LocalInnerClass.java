package JAVA.Inner_Classes;

class Demo
{
    int x = 30;
    public void meth1()
    {
        class Temp
        {
            int x = 10;

            public void display()
            {
                System.out.println("Display Method. X = " + x);
            }
        }
        
        Temp t = new Temp();
        t.display();
    }
}

public class LocalInnerClass 
{
    public static void main(String[] as) 
    {
        Demo obj = new Demo();
        obj.meth1();
    }
}

/*
Output :
--------
Display Method. X = 10

*/