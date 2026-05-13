public class BankAccounts 
{
    public static void main(String [] args)
    {
       // Account ac = new Account("123123", "Vishnu", "9123456789", "South Mopur, Nellore", "25/09/2005", 999999999);
    }    
}

class Account
{
    private String accNo;  // private keyword - only accessible to it's class not even it's subclass.
    private String name;
    private String phno;
    private String address;
    private String dob;
    protected long balance; // protected keyword - accessible to it's class and subclass.

    // Property methods
    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getPhno() { return phno; }
    public String getAdress() { return address; }
    public String getDob() { return dob; }
    public long getBalance() { return balance; }

    public void setAddress(String a)
    {
        address = a;
    }
    public void setPhno(String phno)
    {
        this.phno = phno;
    }

    // Constuctor
    public Account(String accNo, String name, String phno, String address, String dob, long balance)
    {
        this.accNo = accNo;
        this.name = name;
        this.phno = phno;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
    }

    public void close()
    {
        accNo = name = phno = address = dob = null;
        balance = 0;
    }
}

class SavingsAccount extends Account
{
    public void deposit(long amount)
    {
        balance += amount;
    }
    public void withdraw(long amount)
    {
        balance -= amount;
    }
}

class LoanAccount extends Account
{
    public void payEMI(long amount)
    {
        balance -= amount;
    }
    public void repay(long amount)
    {
        if(balance == amount)
        {
            balance = 0;
        }
    }
}