// TASK : Write a program that calculates cubes of numbers 1 - 5 and display output.

public class Cubes 
{
    public static void main(String [] args)
    {
        System.out.println("Number\tcubes");
        System.out.printf("-----\t-----\n");
        for(int i = 1; i<=5; i++)
        {
            System.out.printf("%d\t%d\n",i,(int)Math.pow(i,3));
        }
    }
}
