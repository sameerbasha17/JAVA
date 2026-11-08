package JAVA.Packages.mypac2;
import JAVA.Packages.mypac1.Test1;
public class Test5   // Has a relationship in another package
{
    Test1 t = new Test1();
    public void show()
    {
        System.out.println(t.a+t.b+t.c+t.d);
    }
}

/*
PS C:\Users\Sameer\OneDrive\Desktop\Courses\java\java\packages> javac -d . Test5.java
Test5.java:8: error: a is not public in Test1; cannot be accessed from outside package
        System.out.println(t.a+t.b+t.c+t.d);
                            ^
Test5.java:8: error: b has private access in Test1
        System.out.println(t.a+t.b+t.c+t.d);
                                ^
Test5.java:8: error: c has protected access in Test1
        System.out.println(t.a+t.b+t.c+t.d);
                                    ^
3 errors

*/