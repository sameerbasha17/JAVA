// Super Keyword Demo

class Rectangle
{
    private int length;
    private int breadth;

    // Constructor
    Rectangle()
    {
        System.out.println("NO Arg Constructor");
    }
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() { return length; }
    public int getBreadth() { return breadth; }
     
    int x = 10;
}

class Cuboid extends Rectangle
{
    private int height;
    Cuboid()
    {
        super(1,1);
        height = 1;
    }
    Cuboid(int l, int b, int h)
    {
        super(l, b);
        height = h;
    }

    void display()
    {
        //System.out.println("Display Method");
        System.out.println(x);
        System.out.println(super.x);
    }
    int x = 20;
    
    void area()
    {
        System.out.println("Area : " + (getLength() * getBreadth() * height));
    }
}

public class SuperKeyword 
{
    public static void main(String[] as)
    {
        Cuboid c = new Cuboid();
        c.display();
        //System.out.println(c.x);
        c.area();

        Cuboid c2 = new Cuboid(1, 2, 3);
        c2.area();
    }    
}
