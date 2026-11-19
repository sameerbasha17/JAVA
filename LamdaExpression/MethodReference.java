package JAVA.LamdaExpression;

interface Imy7
{
    void show(String str);
}

public class MethodReference 
{
    MethodReference()
    {
        System.out.println("a");
    }
    public static void reverse(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] as) 
    {
        Imy7 obj = System.out::println;    

        obj.show("HI man");

        Imy7 obj2 = MethodReference :: reverse;
        obj2.show("Comfort Zone");

        Imy2 obj3 = MethodReference :: new;  // Used Imy2 interface (it is present in AsObject.java)
        obj3.show();
    }
}

/*
Output :
========
HI man
enoZ trofmoC
a
*/