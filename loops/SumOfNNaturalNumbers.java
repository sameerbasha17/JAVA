// TASK : Sum of first n natural numbers.

import java.util.Scanner;

public class SumOfNNaturalNumbers 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n ; ++i)
            sum = sum + i;
        System.out.println("Sum of first " +n + " natural numbers is : " +sum);

        sc.close();
    }    
}

/*
Output :
========
Enter n value : 
8
Sum of first 8 natural numbers is : 36

*/