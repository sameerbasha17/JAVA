package JAVA.Packages.mypac2;
import JAVA.Packages.mypac1.Test1;
public class Test6 extends Test1  // Is a Relationship in another package
{
    public void show()
    {
        System.out.println(a+b+c+d);
    }
}

/*
Test6.java:7: error: a is not public in Test1; cannot be accessed from outside package
        System.out.println(a+b+c+d);
                           ^
Test6.java:7: error: b has private access in Test1
        System.out.println(a+b+c+d);
                             ^
2 errors

*/