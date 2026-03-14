// Write the complete class(properties, property methods, constuctors) for Product class.
package JAVA.Object_Oriented_Programming;

public class ProductTest 
{
    public static void main(String [] args)
    {
        Product p = new Product("A9", "powder");
        System.out.println("Total cost : " + p.totalCost());     // Total cost : 0.0

        Product p2 = new Product("T2", "book", 56.78, 1);
        System.out.println("Total cost : " + p2.totalCost());    // Total cost : 56.78
    }    
}

class Product
{
    // Properties
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    // Property methods
    public String getItemNo()
    {
        return itemNo;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public void setQuantity(int q)
    {
        quantity = q;
    }
    public int getQuantity()
    {
        return quantity;
    }
    // Constructors
    public Product(String itemno, String n)
    {
        itemNo = itemno; 
        name = n;
        price = 0.0; 
        quantity = 0;
    }
    public Product(String itemno, String n, double p, int q)
    {
        itemNo = itemno;
        name = n;
        price = p;
        quantity = q;
    }

    // Instance methods
    public double totalCost()
    {
        return price * quantity;
    }

}