package JAVA.Packages.mypac1;

public class Test4 extends Test1    // Is a relationship In same package
{
    public void show()
    {
        System.out.print(a+b+c+d);
    }
}

/*
Test4.java:7: error: b has private access in Test1
        System.out.print(a+b+c+d);
                           ^
1 error

*/