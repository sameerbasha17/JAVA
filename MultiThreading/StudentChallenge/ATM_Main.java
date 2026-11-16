package JAVA.MultiThreading.StudentChallenge;

class ATM
{
    
    public void checkBalance(String name)
    {
        System.out.println(name + " is Checking Balance in Account.");
    }

    public void withdraw(String name, int amount)
    {
        System.out.println(name + "'s account has " + amount + " Ruppes.");
    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM obj;

    public Customer(ATM obj, String name, int amount)
    {
        this.obj = obj;
        this.name = name;
        this.amount = amount;
    }

    public void run()
    {
        synchronized(obj)
        {
            obj.checkBalance(name);
            obj.withdraw(name, amount);
        }
    }
}

public class ATM_Main
{
    public static void main(String[] as) 
    {
        ATM obj = new ATM();
        Customer cust1 = new Customer(obj, "C Naveen", 9000);
        Customer cust2 = new Customer(obj, "V Madhusudhan", 8000);

        cust1.start();
        cust2.start();
    }
}

/*
Output(Without Synchronization) :
=================================
V Madhusudhan is Checking Balance in Account.
C Naveen is Checking Balance in Account.
C Naveen's account has 9000 Ruppes.
V Madhusudhan's account has 8000 Ruppes.

Output(With Synchronization) :
==============================
C Naveen is Checking Balance in Account.
C Naveen's account has 9000 Ruppes.
V Madhusudhan is Checking Balance in Account.
V Madhusudhan's account has 8000 Ruppes.
*/