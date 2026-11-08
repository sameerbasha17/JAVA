package JAVA.StaticAndFinal;

// Making the class to have only one object. More than one object creation is not possible.

class Test7
{
    private int variable1;
    private int variable2;
    private int variable3;

    static public Test7 check = null;

    private Test7()
    {
        variable1 = 1;
        variable2 = 2;
        variable3 = 3;
    }

    public double multiplication()
    {
        return variable1 * variable2 * variable3;
    }

    static public Test7 getInstance()
    {
        if(check == null)
            check = new Test7();
        return check;
    }
}

public class Singleton 
{
    public static void main(String[] as) 
    {
        Test7 obj1 = Test7.getInstance();
        Test7 obj2 = Test7.getInstance();
        Test7 obj3 = Test7.getInstance();
        
        System.out.println(obj1 + "  " + obj2 + "  " + obj3);

        if(obj1 == obj2 && obj2 == obj3)
        {
            System.out.println("Same Reference. Only one object is created.");
        }

        obj2.multiplication();
    }
}

/*
Output :
--------
JAVA.StaticAndFinal.Test7@2f92e0f4  JAVA.StaticAndFinal.Test7@2f92e0f4  JAVA.StaticAndFinal.Test7@2f92e0f4
Same Reference. Only one object is created.

*/