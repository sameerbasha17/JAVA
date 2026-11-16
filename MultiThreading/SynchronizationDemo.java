package JAVA.MultiThreading;

class MyData
{
    synchronized public void display(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}

class Thread1 extends Thread
{
    MyData d;
    public Thread1(MyData d)
    {
        this.d = d;
    }

    public void run()
    {
        d.display("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
    }
}

class Thread2 extends Thread
{
    MyData dat;
    public Thread2(MyData d)
    {
        dat = d;
    }

    @Override
    public void run()
    {
        dat.display("1234567890123456789012345678901234567890123456789012345678901234567890");
    }
}

public class SynchronizationDemo 
{
    public static void main(String[] as)
    {
        MyData obj = new MyData();
        Thread1 th1 = new Thread1(obj);
        Thread2 th2 = new Thread2(obj);

        th1.start();
        th2.start();
    }
}

/*
Output : (without synchronization)
==================================
12abcdefghijklmnopqrs3tuvwxyzabc456789012345defghijklm67890123456789012345678nopqrstuvwx90123456789012345678901234567890yzabcdefghijklmnopqrstuvwxyz

Output : (with Synchronization)
===============================
abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz1234567890123456789012345678901234567890123456789012345678901234567890
*/