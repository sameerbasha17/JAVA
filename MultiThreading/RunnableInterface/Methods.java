class Test1 implements Runnable
{
    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(30);         // sleep method is a static method of class Thread. And there is a chance that it throws exception.
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

            i++;
        }
    }
}

public class Methods
{
    public static void main(String[] as)
    {
        Test1 obj = new Test1();
        Thread th = new Thread(obj);

        System.out.println("State : " + th.getState());
        th.start();

        System.out.println("State : " + th.getState());
        System.out.println("Priority : " + th.getPriority());

        th.setPriority(8);

        System.out.println("Priority : " + th.getPriority());

        th.interrupt();
        
    }    
}

/*
Output :
========
State : NEW
State : RUNNABLE
1
Priority : 5
Priority : 8
java.lang.InterruptedException: sleep interrupted
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21

*/