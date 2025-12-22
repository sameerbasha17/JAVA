/* TASK : Find the errors in the following program that calculates area of a triangle; correct them and run the program.

classAreaTriangle;
{public static void main (String Str[]);
{
int [] kim = new int [5]
int a =3, b =4, c=5;
double S = (a+b+c)/2;
double Area = Math.sqrt(S*(S-a)*(S-b)*(S-c));
System.out.println("a = " + a+ " b = " + b + " c = " + c);
System.out.println("Area of triangle = " + Area + "\n");
}}

*/

class AreaTriangle
{
    public static void main(String [] args)
    {
        int a = 3, b = 4, c = 5;
        double S = (a+b+c)/2.0;
        double area = Math.sqrt(S * (S - a) * (S - b) * (S - c));
        
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println("Area of triangle = " + area + "\n");
    }

}

/*
Output :
========
a = 3 b = 4 c = 5
Area of triangle = 6.0
*/