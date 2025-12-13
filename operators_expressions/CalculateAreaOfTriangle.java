import java.util.Scanner;
public class CalculateAreaOfTriangle {
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of triangle : ");
    float base = sc.nextFloat();
    System.out.println("Enter the height of triangle : ");
    float height = sc.nextFloat();
    float area = 0.5f * base * height;
    System.out.println("Area of the triangle is : " + area);
    sc.close();
  }
}


/* 
Sample Output :
===============

Enter the base of triangle : 
9
Enter the height of triangle : 
7
Area of the triangle is : 31.5

*/
