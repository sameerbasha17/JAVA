/* 3. Average of Five Numbers
==============================
Concept: Read five numbers into an array, sum them, then divide by 5. Uses a for-each loop for clean
iteration.
*/
import java.util.Scanner;
public class Average 
{
    public static void main(String[] args)
    {
        System.out.println("Program: Find average of five numbers.");
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[5];

        double sum = 0;

        for(int i = 0; i < 5 ; i++)
        {
            System.out.print("Enter number " + (i + 1) + " :");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        System.out.printf("The average of five numbers is : %.2f", sum/5);

        sc.close();
    }   
}

/*
Output :
========
Program: Find average of five numbers.
Enter number 1 :12
Enter number 2 :17.99
Enter number 3 :67.9
Enter number 4 :20
Enter number 5 :0.917
The average of five numbers is : 23.76
*/