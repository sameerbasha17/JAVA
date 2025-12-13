import java.util.Scanner;

public class RootsOfQuadraticEquation 
{
	public static void main(String [] args)
	{
		int a,b,c;
		double r1,r2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Coefficient of x^2 : ");
		a = sc.nextInt();
		System.out.print("Enter Coefficient of x : ");
		b = sc.nextInt();
		System.out.print("Enter Constant(Coefficient of x^0) : ");
		c = sc.nextInt();

		r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);

		r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

		System.out.println("Root 1 : " + r1);

		System.out.print("Root 2 : " + r2);

		sc.close();

	}
}

/* 
Output :
========
Case - 1 :
---------
Enter Coefficient of x^2 : 1
Enter Coefficient of x : 5
Enter Constant(Coefficient of x^0) : 6
Root 1 : -2.0
Root 2 : -3.0

Case - 2 :
----------
Enter Coefficient of x^2 : 1   
Enter Coefficient of x : 1
Enter Constant(Coefficient of x^0) : 1
Root 1 : NaN
Root 2 : NaN

(here NaN means Not a Number)

Case - 3 :
----------
Enter Coefficient of x^2 : 1
Enter Coefficient of x : -4
Enter Constant(Coefficient of x^0) : 4
Root 1 : 2.0
Root 2 : 2.0

*/
