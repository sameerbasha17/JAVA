import java.util.Scanner;

public class Cubiod 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int length,breadth,height,area,volume;

        System.out.println("Enter length, breadth, height of cubiod respectively : ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        area = 2 * ((length * height) + (breadth * height) + (length * breadth));

        volume = length * breadth * height;

        System.out.println("Area of Cubiod : " + area);
        System.out.println("Volume of Cubiod : " + volume);
    }
    
}

/*
A cubiod is a 3D rectangle.

Output : 
========
Enter length, breadth, height of cubiod respectively : 
17
9
7
Area of Cubiod : 670
Volume of Cubiod : 1071
*/