import java.util.Scanner;

public class CalculateAreaOfTriangle2 
{
    public static void main(String [] args)
    {
        int side1,side2,side3;
        double s,area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three sides of triangle : ");
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();

        s = (side1 + side2 + side3 )/2.0;

        area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));

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
Area of triangle is : 31.304951684997057
*/
