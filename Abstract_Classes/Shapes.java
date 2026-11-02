abstract class Shape
{
    // no properties
    // abstract methods : 
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape
{
    Circle(double r)
    {
        radius = r;
    }
    private double radius;

    protected void area()
    {
        System.out.println("Area of Circle : " + (Math.PI * radius * radius));
    }

    protected void perimeter()
    {
        System.out.println("Perimeter of Circle : " + (2 * Math.PI * radius));
    }
}

class Rectangle extends Shape
{
    private int l;
    private int b;
    Rectangle(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    public void area()
    {
        System.out.println("Area of Rectangle : " + (l * b));
    }

    protected void perimeter()
    {
        System.out.println("Perimeter of Rectangle : " + (2 * (l + b)));
    } 
}

public class Shapes 
{
    public static void main(String[] args) 
    {
        //Circle c = new Circle(9);
        Shape c = new Circle(9);
        c.area();    

        Shape r = new Rectangle(17, 9);
        r.area();
        r.perimeter();
    }
}


/*
Output : 
--------
Area of Circle : 254.46900494077323
Area of Rectangle : 153
Perimeter of Rectangle : 52

*/