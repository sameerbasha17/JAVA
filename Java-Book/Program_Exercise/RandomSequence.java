// TASK : Write a program to generate a sequence of 6 random numbers in the range 10-20. Both 10 and 20 are included.

public class RandomSequence 
{
    public static void main(String [] args)
    {
        int randomNumber;
        System.out.print("Random numbers between 10 and 20 : ");
        for(int i = 1; i <=6; i++)
        {
            randomNumber = (int)(Math.random() * 11) + 10;
            System.out.print(randomNumber + " ");
        }

    }   
}
