// TASK : Declare a class for determining the area of any regular polygon with instance variables length of side and number of sides. Execute the class in another class with main() method.

import java.util.Scanner;

class CalculateArea
{
    int len,num;
    CalculateArea(int a, int b)
    {
        len = a;
        num = b;
    }

    double areaCal()
    {
        double area = (num * len * len)/(4 * Math.tan(3.14159/num));

        return area;
    }
}

public class RegularPolygon 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the regular polygon : ");
        int length = sc.nextInt();
        System.out.println("Enter the number of sides : ");
        int number_Of_Sides = sc.nextInt();

        CalculateArea obj = new CalculateArea(length,number_Of_Sides);

        System.out.println("The Area of the polygon is : " + obj.areaCal());

        sc.close();
    }
}
