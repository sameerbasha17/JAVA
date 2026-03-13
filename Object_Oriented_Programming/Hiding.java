// Data hiding (Getter and setter methods)
package JAVA.Object_Oriented_Programming;

public class Hiding 
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        // rect.length = 7;
        rect.setLength(7);
        rect.setBreadth(3);
        System.out.println("Length : " + rect.getLength() + ", Breadth : " + rect.getBreadth());   // LEngth : 7, Breadth : 3

        Student s = new Student();
        System.out.println("Name : " + s.getName());   // null

        Producer p = new Producer();
        p.setData(7);
    }    
}

class Rectangle  // Read and writtable
{
    private int length;
    private int breadth;

    public int getLength()
    {
        return length;
    }

    public void setLength(int l)
    {
        length = l;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int b)
    {
        breadth = b;
    }
}

class Student  // Only readable
{
    private String name;
    
    public String getName()
    {
        return name;
    }
}

class Producer  // Only write
{
    private int sharedData;

    public void setData(int d)
    {
        sharedData = d;
    }
}