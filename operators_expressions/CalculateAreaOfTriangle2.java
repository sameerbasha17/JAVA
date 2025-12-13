import java.util.Scanner;

public class CalculateAreaOfTriangle2 
{
    public static void main(String [] args)
    {
        float side1,side2,side3,area,s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three sides of triangle : ");
        side1 = sc.nextFloat();
        side2 = sc.nextFloat();
        side3 = sc.nextFloat();

        s = (side1 + side2 + side3 )/2;

        area = s * (s-side1) * (s-side2) * (s-side3) * 0.5f;

        System.out.println("Area of triangle is : "+area);

        sc.close();
    }
}

/*
Output : 
=========
Enter the three sides of triangle : 
12
7
9
Area of triangle is : 490.0
*/
