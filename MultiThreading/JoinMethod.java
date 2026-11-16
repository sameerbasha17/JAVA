package JAVA.MultiThreading;

class Test5 extends Thread
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


public class JoinMethod
{
    public static void main(String[] as) 
    {
        Test5 obj = new Test5();
        obj.setDaemon(true);
        obj.start();
        
        Thread mainThread = Thread.currentThread();
        try
        {
            mainThread.join();     // Main thread waits until all threads get's finished.
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
