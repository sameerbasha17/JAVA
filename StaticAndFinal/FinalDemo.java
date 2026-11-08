package JAVA.StaticAndFinal;

/*
Final variables are used for constant values. 
Usually we use CAPITAL letters for names.
There are three ways to declare them :
1) Direct initialisation as class members with a value
2) Using static or instance blocks
3) Using Constructor(If the class has many constructors then in every constructor the declaration should be done, because we might not know which constructor is called). */

class Test2
{
    final int A = 179;
    final float PI;
    final byte C;

    Test2()
    {
        C = 99;
    }

    {
        PI = 3.14f;
    }
}

// final Methods prevent from overriding.

class Test3
{
    final void meth1()
    {
        System.out.println("Method - 1");
    }
    public void display()
    {
        System.out.println("Display Method");
    }
}

class Test4 extends Test3
{
    /*void meth1()
    {
        System.out.println("Hello");
    }*/
}

// A final Class prevents from being inherited.

final class Test5
{
    int x = 2;

    public void myName()
    {
        System.out.println("Sameer");
    }
}

/* class Test6 extends Test5
{

} */


public class FinalDemo 
{
    public static void main(String[] as) 
    {
        Test2 obj = new Test2();
        System.out.println(obj.A + " " + obj.PI + " " + obj.C);    

        Test4 obj2 = new Test4();
        obj2.meth1();
    }    
}

/*
Output :
--------
179 3.14 99
Method - 1
*/

// The main purpose of this final keyword is to put restrictions. Maintain Policy.