// Create a complete class i.e.: constructors, property methods, instance methods.
package JAVA.Object_Oriented_Programming;

public class CylinderClass   // application class
{
    public static void main(String [] args)
    {
        Cylinders  c = new Cylinders(5,3);
        System.out.println(c.volume());
    }
}

class Cylinders
{
    private double radius;
    private double height;

    // Constructors
    public Cylinders()
    {
        radius = 0;
        height = 0;
    }

    public Cylinders(double r)
    {
        radius = r;
        height = 1;
    }
    
    public Cylinders(double r, double h)
    {
        radius = r;
        height = h;
    }

    // Property methods
    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    public void setHeight(double h)
    {
        height = h;
    }

    // Instance methods
    public double lidArea()
    {
        return Math.PI * radius * radius;
    }
    public double circumference()
    {
        return 2 * Math.PI * radius;
    }
    public double totalSurfaceArea()
    {
        return 2 * lidArea() + (circumference() * height);
    }
    public double volume()
    {
        return Math.PI * radius * radius * height;
    }
}

