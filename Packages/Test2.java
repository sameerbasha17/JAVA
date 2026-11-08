package JAVA.Packages.mypac1;
import JAVA.Packages.mypac1.Test1;

public class Test2 
{
    Test1 t = new Test1();  // HasA relationship same package
    public void show()
    {
        System.out.println(t.a+t.b+t.c+t.d);
    }
}

/*
Test2.java:9: error: b has private access in Test1
        System.out.println(t.a+t.b+t.c+t.d);
                                ^
1 error

*/