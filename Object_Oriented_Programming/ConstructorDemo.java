// Write constuctors for a class.
package JAVA.Object_Oriented_Programming;

public class ConstructorDemo 
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();  // try passing different values
        System.out.println(rect.area());
    }    
}

class Rectangle    // A complete class
{
    // Data memebers(variables)
    private double length;
    private double breadth;

    // Constructors
    public Rectangle()
    {
        length = 1;
        breadth = 1;
    }

    public Rectangle(double l, double b)
    {
        //length = l;
        //breadth = b;
        setLength(l);
        setBreadth(b);
    }

    public Rectangle(double side)
    {
        if(side >= 0)
            length = breadth = side;
        else
        {
            setLength(side);
            setBreadth(side);
        }
    }

    // geter's and setter's methods
    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public void setLength(double l)
    {
        if(l > 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b)
    {
        if(b > 0)
            breadth = b;
        else 
            breadth = 0;
    }

    // Instance methods or facilitators
    public double area()
    {
        return length * breadth;
    }
    public void perimeter()
    {
        System.out.println("Perimeter : " + 2 * (length + breadth));
    }

    // enquiry method
    public boolean isSquare()   // starts with is
    {
        return length == breadth;
    }
}