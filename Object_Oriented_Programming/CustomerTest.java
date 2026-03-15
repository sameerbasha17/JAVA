package JAVA.Object_Oriented_Programming;

public class CustomerTest 
{
    public static void main(String []args)
    {
        System.out.println("Customer - 1 : ");
        System.out.println("====================");
        Customer c = new Customer("A001", "Tharun", "4-17, South Mopur, Nellore, 524004" , "1234567890");
        System.out.println("Customer ID : " + c.getCustomerID() +"\nCustomer Name : " + c.getName() + "\nAddress : " + c.getAddress() + "\nPhno : " + c.getPhno());
        c.setPhno("8885787828");
        c.setAddress("1-99,Komarapudi, Andhra Kesari Nagar, Nellore, 524004"); 

        System.out.println("\nCustomer ID : " + c.getCustomerID() +"\nCustomer Name : " + c.getName() + "\nAddress : " + c.getAddress() + "\nPhno : " + c.getPhno());

        System.out.println("\nCustomer - 2 : ");
        System.out.println("====================");
        Customer c2 = new Customer();
        System.out.println("Customer ID : " + c2.getCustomerID() +"\nCustomer Name : " + c2.getName() + "\nAddress : " + c2.getAddress() + "\nPhno : " + c2.getPhno());
        
    }    
}

class Customer
{
    // Properties
    private String customerID;
    private String name;
    private String address;
    private String phno;

    // Property methods
    public String getCustomerID()
    {
        return customerID;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhno()
    {
        return phno;
    }

    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public void setPhno(String newPhno)
    {
        phno = newPhno;
    }

    // Constructors
    public Customer(String id, String n, String a, String ph)
    {
        customerID = id;
        name = n;
        address = a;
        phno = ph;
    }
    public Customer()
    {}
}

/*
Output : 
=========
Customer - 1 : 
====================
Customer ID : A001
Customer Name : Tharun
Address : 4-17, South Mopur, Nellore, 524004
Phno : 1234567890

Customer ID : A001
Customer Name : Tharun
Address : 1-99,Komarapudi, Andhra Kesari Nagar, Nellore, 524004
Phno : 8885787828

Customer - 2 :
====================
Customer ID : null
Customer Name : null
Address : null
Phno : null

*/