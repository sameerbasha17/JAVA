/* TASK : Find the errors in the following program; debug it and run the program.

classarithcal
 {public static void main(String Str[])
  {int dis = 255, m =4, n = 17, Angle = 30;
doubleisValue =math.sqrt(dis);
double x = 8.0,y,k;
 z = math.Pow(x,m);
 k = math.max(m,n);
s = Math.sin(Angle);
System.out.println("disvalue + " + disvalue);
System.out.println("z = " + z);
System.out.println("k = " +k);
}}

*/

public class ArithCal
{
  public static void main(String str[])
  {
    int dis = 255, m = 4, n = 17;
    double disValue = Math.sqrt(dis);
    double x = 8.0,z,k;
    z = Math.pow(x,m);
    k = Math.max(m,n);
    System.out.println("disValue = " + disValue);
    System.out.println("z = " + z);
    System.out.println("k = " + k);
  }
}

/*
Output :
========
disValue = 15.968719422671311
z = 4096.0
k = 17.0

*/