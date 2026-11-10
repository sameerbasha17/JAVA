package JAVA.ExceptionHandling;
import java.io.*;
import java.util.*;

class Test2
{
    static FileInputStream f;
    static Scanner sc;
    
    public void meth1() throws Exception
    {
        f = new FileInputStream("/Users/Sameer/OneDrive/Desktop/Courses/java/java/exceptionhandling/sa.txt");

        sc = new Scanner(f);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + " " + y);

        f.close();     // These statements may not execute if there is an exception before this line 21. So, we generally use fianlly block or try(resources) to overcome this.
        sc.close();
    }
}

public class TryWithResources
{
    public static void main(String[] as)
    {
        Test2 obj = new Test2();
        try
        {
            obj.meth1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}