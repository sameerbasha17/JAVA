package JAVA.MultiThreading;

class Test3 extends Thread
{
    public void run() 
    {
      int counter = 1;

      while(true) 
      {
        System.out.println(counter);
        counter++;
      }
   }
}

public class DaemonThread
{
    public static void main(String[] as) 
    {
      Test3 obj = new Test3();
      obj.setDaemon(true);
      obj.start();
      try
      {
        Thread.sleep(100);
      }

      catch(InterruptedException e){ System.out.println(e); }
    }
}