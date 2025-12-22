// TASK : Write a program in which a sample of 8 random numbers is generated and an average value is determined.

public class RandomAvg 
{
    public static void main(String [] args)
    {
        int randomNumber;

        double sum = 0, avg;

        System.out.print("Random numbers are : ");
        for(int i = 1; i<= 8; i++)
        {
            randomNumber = (int)(Math.random() * 100);
            System.out.print(randomNumber + " ");
            sum += randomNumber;
        }

        avg = sum/8;
        System.out.println("\nAverage : " + avg);
    }   
}
