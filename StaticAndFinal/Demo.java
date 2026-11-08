package JAVA.StaticAndFinal;

// Demonstration of Static members.

class A
{
    static int x = 10;
    int y = 20;

    static public void show()
    {
        System.out.print(x); // Allowed
        //System.out.print(y); // Not Allowed
    }
}

public class Demo 
{
    public static void main(String[] as) 
    {
        A obj = new A();
        System.out.println(obj.x);
        System.out.println(obj.y);

        System.out.println(A.x);

        A obj2 = new A();
        A obj3 = new A();

        System.out.println(obj2.x);
        System.out.println(obj3.x);
        obj2.x = 9;
        System.out.println(obj3.x);
        System.out.println(obj2.x);
    }
}

/*
Output :
--------
10
20
10
10
10
9
9

*/

/*
Notes :
--------
1. A static member is acessed by it's class name and object reference.
2. A static member should present inside a class
3. A static method only access the static members of same or different class.
4. Static member means a single copy. Modifying it effects to changing it's value in all other objects too.

*/