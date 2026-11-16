package JAVA.MultiThreading;

class Test4 extends Thread
{
    public void run()     
    {
        int i = 1;
        while(true)
        {
            System.out.println(i +  " Hello");
            i++;
        }
    }
}


public class YieldMethod
{
    public static void main(String[] as) 
    {
        Test4 obj = new Test4();
        obj.start();

        int j = 1;
        while(true)
        {
            System.out.println(j + " World");
            Thread.yield();   // 22907 World  35841 Hello
            j++;
        }
    }
}
