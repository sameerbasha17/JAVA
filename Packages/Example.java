import JAVA.Packages.mypac1.Test1;

public class Example
{
    Test1 t = new Test1();

    public void show()
    {
        System.out.println(t.a+t.b+t.c+t.d);
    }
}

/*

Example.java:9: error: a is not public in Test1; cannot be accessed from outside package
        System.out.println(t.a+t.b+t.c+t.d);
                            ^
Example.java:9: error: b has private access in Test1
        System.out.println(t.a+t.b+t.c+t.d);
                                ^
Example.java:9: error: c has protected access in Test1
        System.out.println(t.a+t.b+t.c+t.d);
                                    ^
*/