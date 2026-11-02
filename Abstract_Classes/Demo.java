// Abstract Class Demo
abstract class A
{
    A() { System.out.println("Class A - Constractor"); }

    public void method1()
    {
        System.out.println("Class - A, Method - 1");
    }

    abstract public void method2();
}

class B extends A
{
    B() { System.out.println("Class B - Constructor"); }
    public void method2()
    {
        System.out.println("Class - B, Method - 2");
    }
}

public class Demo
{
    public static void main(String[] as) 
    {
        A obj = new B();
        obj.method1();
        obj.method2();
    }
}


/* Output :
-----------
Class A - Constractor
Class B - Constructor
Class - A, Method - 1
Class - B, Method - 2

-----------------------
Notes :
-------
1. Abstract classes can have zero or more abstract methods.
2. If a class has atleast one abstract method then that class should be abstract class.
3. Abstract classes are meant for inheritance(usually by a concrete class) so declaring class and methods with static and final is not allowed.
4. Every abstract method should be overriden(provide definition) by the inherited concrete class.
5. We can not create an object for abstract class but we can create it's reference. (Dynamic dispatch is allowed).

*/