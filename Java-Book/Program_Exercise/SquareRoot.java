// TASK : Write a program that calculates squareroots of numbers 1 to 10 and display output.

public class SquareRoot 
{
    public static void main(String [] args)
    {
        System.out.println("Number\tSquareroot");
        System.out.println("------\t---------");
        for(int i=1; i <= 10; i++)
        {
            System.out.printf("%d\t%.2f\n",i,Math.sqrt(i));
        }
    }
}
