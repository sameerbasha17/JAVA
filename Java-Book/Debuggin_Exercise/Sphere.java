/* Task : Debug the following program and run it.
public class sphere {
public static void main(String [] args){
  double pi = 3.14159;
  double radius;
  Scanner scanin = new Scanner (System.in);
  System.out.print("Enter the radius of sphere : ");
  radius = scanin.nextDouble();
  doublesurfacearea;
  area = (4/3)*pi * radius * radius * radius;
  Circumference = 2 * pi * radius;
  System.out.println("radius = " + radius);
  System.out.println("Area of sphere = " + area );
  } 
*/

import java.util.Scanner;

public class Sphere 
{
    public static void main(String[] args)
    {
        double pi = 3.14159;
        double radius;
        
        Scanner scanin = new Scanner(System.in);
        System.out.print("Enter the radius of sphere : ");
        radius = scanin.nextDouble();
        double volume;
        volume = (4.0/3.0) * pi * radius * radius * radius;
        double circumference = 2 * pi * radius;
        System.out.println("Radius = " + radius);
        System.out.println("Volume of sphere = " + volume);
        System.out.println("Circumference of sphere = " + circumference);
    }
}

/*
Output :
========
Enter the radius of sphere : 9
Radius = 9.0
Volume of sphere = 3053.6254799999997
Circumference of sphere = 56.54862
*/