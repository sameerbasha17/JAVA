package JAVA.MultiThreading;

class SharedData
{
    int value;
    boolean flag = true;

    synchronized public void setVal(int x)
    {
        while(!flag)
        {
            try
            {
                wait();
            }
            catch(Exception e) { System.out.println(e); }
        }
        flag = false;
        value = x;

        notifyAll();
    }

    synchronized public int getVal()
    {
        while(flag)
        {
            try
            {
                wait();
            }
            catch(Exception e) { System.out.println(e); }
        }
        flag = true;
        
        notifyAll();
        return value;
    }
}

class Producer extends Thread
{
    SharedData d;
    public Producer(SharedData data)
    {
        d = data;
    }

    public void run()
    {
        int counter = 1;
        while(true)
        {
            d.setVal(counter);
            System.out.println("Producer Produced : " + counter);
            counter++;
        }
    }
}

class Consumer extends Thread
{
    SharedData d;
    public Consumer(SharedData d)
    {
        this.d = d;
    }

    @Override 
    public void run()
    {
        while(true)
        {
            System.out.println("Consumer Consumed : " + d.getVal());
        }
    }
}

public class InterProcessComm 
{
    public static void main(String[] as) 
    {
        SharedData d = new SharedData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}

/*
Output : (Middle of the output)
===============================
Producer Produced : 3522
Producer Produced : 3523
Producer Produced : 3524
Consumer Consumed : 3523
Consumer Consumed : 3524
Consumer Consumed : 3525
Producer Produced : 3525
Producer Produced : 3526
Producer Produced : 3527
Consumer Consumed : 3526
Consumer Consumed : 3527
Consumer Consumed : 3528
Producer Produced : 3528
Producer Produced : 3529
Producer Produced : 3530
Consumer Consumed : 3529
Consumer Consumed : 3530
Consumer Consumed : 3531
Producer Produced : 3531
Producer Produced : 3532
Producer Produced : 3533
Consumer Consumed : 3532
Consumer Consumed : 3533
Consumer Consumed : 3534
Producer Produced : 3534
Producer Produced : 3535
Producer Produced : 3536
Consumer Consumed : 3535
Consumer Consumed : 3536
Consumer Consumed : 3537
Producer Produced : 3537
Producer Produced : 3538
Producer Produced : 3539
Consumer Consumed : 3538
Consumer Consumed : 3539
Consumer Consumed : 3540
Producer Produced : 3540
Producer Produced : 3541
Producer Produced : 3542
Consumer Consumed : 3541
Consumer Consumed : 3542
Consumer Consumed : 3543
Producer Produced : 3543
Producer Produced : 3544
Producer Produced : 3545
Consumer Consumed : 3544
Consumer Consumed : 3545
Consumer Consumed : 3546
Producer Produced : 3546
Producer Produced : 3547
Producer Produced : 3548
Consumer Consumed : 3547
Consumer Consumed : 3548
Consumer Consumed : 3549
Producer Produced : 3549
Producer Produced : 3550
Producer Produced : 3551
Consumer Consumed : 3550
Consumer Consumed : 3551
Consumer Consumed : 3552
Producer Produced : 3552
Producer Produced : 3553
Producer Produced : 3554
Consumer Consumed : 3553
Consumer Consumed : 3554
Consumer Consumed : 3555
Producer Produced : 3555
Producer Produced : 3556
Producer Produced : 3557
Consumer Consumed : 3556
Consumer Consumed : 3557
Producer Produced : 3558
Producer Produced : 3559
Consumer Consumed : 3558
Consumer Consumed : 3559
Consumer Consumed : 3560
Producer Produced : 3560
Producer Produced : 3561
Producer Produced : 3562
Consumer Consumed : 3561
Consumer Consumed : 3562
Consumer Consumed : 3563
Producer Produced : 3563
Producer Produced : 3564
Producer Produced : 3565
Consumer Consumed : 3564
Consumer Consumed : 3565
Consumer Consumed : 3566
Producer Produced : 3566
Producer Produced : 3567
Producer Produced : 3568
Consumer Consumed : 3567
Consumer Consumed : 3568
Consumer Consumed : 3569
Producer Produced : 3569
Producer Produced : 3570
Producer Produced : 3571
Consumer Consumed : 3570
Consumer Consumed : 3571
Consumer Consumed : 3572
Producer Produced : 3572
Producer Produced : 3573
Producer Produced : 3574
Consumer Consumed : 3573

*/