public class Demo 
{
    public static void main(String [] args)
    {
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 9;
        
        System.out.println("Area : " + c.area(c.radius));
        System.out.println("Volume : " + c.volume(c.height));
    }
}

class Circle
{
    public double radius;
    
    public double area(double r)
    {
        return Math.PI * r * r;
    }
    public double perimeter(double r)
    {
        return 2 * Math.PI * r;
    }
    public double circumference(double r)
    {
        return perimeter(r);
    }
}

class Cylinder extends Circle
{
    public double height;

    public double volume(double h)
    {
        return area(radius) * h;
    }
}

/*
Output : 
========
Area : 153.93804002589985
Volume : 1385.4423602330987

*/