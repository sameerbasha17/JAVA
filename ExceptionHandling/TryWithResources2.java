package JAVA.ExceptionHandling;
import java.io.*;
import java.util.*;

class Test2
{
    //static FileInputStream f;  This should be declared in try(resource)
    //static Scanner sc;  This should be declared in try(resource)
    
    public void meth1() throws Exception
    {
        try(FileInputStream f = new FileInputStream("/Users/Sameer/OneDrive/Desktop/Courses/java/java/exceptionhandling/sa.txt"); Scanner sc = new Scanner(f);)
        {

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + " " + y);
        }

        /*f.close();     
        sc.close(); */
    }
}

public class TryWithResources2
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

/*
Output : 
========
10 2

*/