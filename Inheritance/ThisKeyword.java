// this Keyword Demo
class Rectangle
{
    private int length;
    private int breadth;

    Rectangle(int length, int breadth)
    {
        // length = l;
        // breadth = b;

        // length = length;
        // breadth = breadth;

        this.length = length;
        this.breadth = breadth;
    }

    public void area()
    {
        System.out.println("Area of Rectangle is " + (length * breadth));
    }
}

public class ThisKeyword
{
    public static void main(String[] as)
    {
        Rectangle r1 = new Rectangle(7, 9);
        r1.area();
    }
}

/* Output :
------------
Area of Rectangle is 63

*/