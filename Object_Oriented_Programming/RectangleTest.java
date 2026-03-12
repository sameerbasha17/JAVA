// Write the class for Rectangle 
package JAVA.Object_Oriented_Programming;

public class RectangleTest 
{
    public static void main(String [] args)
    {
        Rectangle rect1 = new Rectangle();

        rect1.length = 4;
        System.out.println(rect1.area(4));    // 12
        System.out.println(rect1.perimeter(5, 2));  // 14
        System.out.println(rect1.isSquare(4,4 ));   // true
        System.out.print(rect1.isSquare(3, 2));     // false
    }
}

class Rectangle
{
    public int length;
    public int breadth = 3;

    public int area(int l)
    {
        return l * breadth;
    }

    public int perimeter(int l, int b)
    {
        return 2 * (l + b);
    }

    public boolean isSquare(int l , int b)
    {
        return (l == b)? true : false;
    }
}
