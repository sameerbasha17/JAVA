package JAVA.Interfaces;

interface I1_Demo
{   
    void meth1();
    void meth2(); // By default these methods are abstract and public.
}

class C implements I1_Demo
{
    public void meth1() { System.out.println("Method 1"); }
    public void meth2() { System.out.println("Method 2"); }
    public void meth3() { System.out.println("Method 3"); }
}

public class Demo 
{
    public static void main(String[] as) 
    {
        C obj = new C();
        
        obj.meth1();
        obj.meth2();
        obj.meth3();

        System.out.println();
        
        I1_Demo obj2 = new C();
        obj2.meth1();
        obj2.meth2();
        // obj2.meth3();   Not possible, because the interface reference can't hold undeclared methods in it.
    }
}

/* 
Compile : javac JAVA/Interfaces/Demo.java
To Run  : java JAVA.Interfaces.Demo     */


/* Output : 
-----------
Method 1
Method 2
Method 3

Method 1
Method 2

*/
