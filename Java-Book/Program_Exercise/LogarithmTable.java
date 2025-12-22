// TASK : Write a class program that creates a table of numbers and their logarithms.

public class LogarithmTable 
{
    public static void main(String [] args)
    {
        System.out.println("Logarithm Table for 0 to 10 numbers :");
        System.out.println("\nNumber\tLogarithm(log10)");

        for(int i = 0; i <= 10 ; i++)
        {
            System.out.printf("%d\t%f\n",i,Math.log10(i));
        }
    }   
}
