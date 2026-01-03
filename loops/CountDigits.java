// TASK : Count digits of a number.

import java.util.Scanner;

public class CountDigits 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int temp = number;

        int count = 0;
        while(number > 0)
        {
            count++;
            number /= 10;
        }

        System.out.printf("The number %2$d has %1$d digits.",count,temp);
        sc.close();
    }    
}

/*
Output : 
========
Enter a number : 
567
The number 567 has 3 digits.

*/