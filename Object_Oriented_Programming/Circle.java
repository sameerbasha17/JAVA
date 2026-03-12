// Write the class for circle and creation of object.
package JAVA.Object_Oriented_Programming;

public class Circle 
{
    public static void main(String [] args)
    {
        CircleDesign c1 = new CircleDesign();

        c1.radius = 4.53;
        System.out.println(c1.area(c1.radius));
        c1.perimeter(c1.radius);
        c1.circumference(4.53);
    }    
}

class CircleDesign
{
    public double radius;  // Property -> Variable

    // Behaviour(verb/actions) -> Methods
    public double area(double r)
    {
        return Math.PI * r * r;
    }

    public void perimeter(double r)
    {
        System.out.println(2 * Math.PI * r);
    }

    public void  circumference(double r)
    {
        System.out.println(2 * Math.PI * r);
    }
    
}

/*
Output :
========
64.4683086850508
28.462829441523528
28.462829441523528

*/