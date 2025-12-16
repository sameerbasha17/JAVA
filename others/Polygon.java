// TASK : Calculate the perimeter and area of a polygon 
import java.util.Scanner;

public class Polygon {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides in the polygon : " + System.lineSeparator());
        int n = sc.nextInt();
        System.out.print("Enter the length of side : " + "\n");
        int len = sc.nextInt();

        double pi = 3.14159;
        double perimeter = n * len;
        double area = (n * len * len)/(4 * Math.tan(pi/n));
        
        System.out.println("Perimeter of polygon is : " + perimeter);
        System.out.print("Area of polygon : " + area);

        sc.close();

    }
}

/* Output : 
===========
Enter the number of sides in the polygon : 
6
Enter the length of side : 
10
Perimeter of polygon is : 60.0
Area of polygon : 259.8078864945142

*/
