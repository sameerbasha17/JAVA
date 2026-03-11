package JAVA.Methods;
// Method overloading Demo. It means two or more methods having the same method name as signature but differ in the parameter list(Number of parameters/data type). Note : Return type is not considerd.
public class MethodOverloading
{
    public static void main(String [] args)
    {
        System.out.println(max(10,20));  // 1
        System.out.println(max(3.2f,2f)); // 2
        byte a = 9, b = 0;
        System.out.println(max(a,b));   // 3
    }

    static int max(int x, int y)  // 1, 3
    {
        if(x > y) return x;
        else return y;
    }

    static float max(float x, float y)  // 2
    {
        if(x > y) return x;
        else return y;
    }
}

/*
Output :
=========
20
3.2
9

*/