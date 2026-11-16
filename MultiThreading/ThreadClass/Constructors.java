
class Test1 extends Thread
{
    Test1(String name)
    {
        super(name);
    }
}


public class Constructors 
{
    public static void main(String[] as)
    {
        Test1 obj = new Test1("Thread 1");
        obj.start();

        System.out.println(obj.getId());    // 29

        System.out.println(obj.getName());  // Thread 1
    }
}
