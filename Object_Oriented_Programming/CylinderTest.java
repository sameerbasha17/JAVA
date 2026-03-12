// Design a class for a cylinder with data members and member functions(methods).
package JAVA.Object_Oriented_Programming;

public class CylinderTest 
{
    public static void main(String ...args)
    {
        Cylinder c = new Cylinder();
        c.radius = 4.32443;
        c.height = 11.22;

        System.out.printf("Lid Area : %.2f%n" , c.lidArea(c.radius));
        System.out.println("Circumference : " + c.circumference());
        System.out.println("Surface Area : " + c.surfaceArea());
        System.out.println("Volume : " + c.volume());
    }
}

class Cylinder
{
    public double radius;
    public double height;

    public double lidArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public double surfaceArea()
    {
        return 2 * lidArea(radius) + (circumference() * height);
    }

    public double volume()
    {
        return Math.PI * radius * radius * height;
    }
}

/*
Output :
========
Lid Area : 58.75
Circumference : 27.17119503792662
Surface Area : 422.3607392833977
Volume : 659.1746126736003

*/