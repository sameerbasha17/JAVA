class Test1 implements Runnable
{
    public void run(){}
}

public class Constructors 
{
    public static void main(String[] as)
    {
        Test1 obj = new Test1();
        Thread th = new Thread();
        th.start();
        System.out.println(th.getId());    // 29
        System.out.println(th.getName());  // Thread-0
    }    
}
