public class SalesMain 
{
    public static void main(String [] args)
    {
        Member m = new Member();
        m.payBill(791);
        m.callBack();
    }    
}

class Customer
{
    protected String name = "Tharun";
    private String phno = "9123456789";
    
    public void payBill(long amount)
    {
        System.out.println("Customer paid RS. " + amount);
    }
    
}

class Member extends Customer
{
    private String address = "000, South Mopur, Nellore";
    private String dob = "18/06/2005";

    public void callBack()
    {
        System.out.println("Dear " + name + ", You have a special Offer! Visit our shop today.");
    }
}

/*
Output : 
========
Customer paid RS. 791
Dear Tharun, You have a special Offer! Visit our shop today.

*/