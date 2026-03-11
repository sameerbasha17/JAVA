// TASK : Overload a method which calculates the area with given input.
import java.util.Scanner;
public class Areas 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the area of : \n==================\n1. Rectangle \n2.Trapezium \n3. Circle");
        System.out.println("Enter your choice : ");
        int ch = sc.nextInt();
        /*if(ch < 1 || ch >3)           default statement in switch will be take of this.
        {
            System.out.println("INVALID INPUT !! Please enter a valid input.");
            System.exit(0);
        } */

        switch(ch)
        {
            case 1: System.out.println("Enter the length of the rectangle : ");
                    int len = sc.nextInt();
                    System.out.println("Enter the breath of the rectangle : ");
                    int breadth = sc.nextInt();
                    // call the static method outside the main method to calculate area. Method called is calculateArea(int,int)
                    int area_R = calculateArea(len, breadth);
                    System.out.println("Area of the rectangle is : " + area_R);
                    break;

            case 2: System.out.println("Enter the length of the parallel sides trapezium(a,b) : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Enter the height of the trapezium : ");
                    int h = sc.nextInt();
                    // call the static method outside the main method to calculate area. Method called is calculateArea(int,int,int)
                    int area_T = calculateArea(a, b, h);
                    System.out.println("Area of the rectangle is : " + area_T);
                    break;

            case 3: System.out.println("Enter the radius of Circle : ");
                    float r = sc.nextInt();
                    // call the static method outside the main method to calculate area. Method called is calculateArea(float)
                    float area = calculateArea(r);
                    System.out.println("Area of the rectangle is : " + area);
                    break;
            default : System.out.println("Invalid input, please enter a valid input");
        }
    }    

    static int calculateArea(int l, int b)
    {
        return l * b;
    }

    static int calculateArea(int a, int b, int h)
    {
        // return (1/2) * (a + b) * h;
        return (a + b) * h / 2;
    }

    static float calculateArea(float radius)
    {
        return (float)Math.PI * radius * radius;
    }
}
