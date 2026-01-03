// TASK : Display Multiplication table for given number by user.

import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table number : ");
        int number = sc.nextInt();

        for(int i = 1; i <= 10 ; i++)
        {
            System.out.printf("%d X %d = %d\n",number,i,number*i);
        }
        sc.close();
    }   
}

/*
Output : 
========
Enter the table number :
9
9 X 1 = 9
9 X 2 = 18
9 X 3 = 27
9 X 4 = 36
9 X 5 = 45
9 X 6 = 54
9 X 7 = 63
9 X 8 = 72
9 X 9 = 81
9 X 10 = 90

*/