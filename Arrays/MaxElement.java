// TASK : Find the maximum element in the array.

import java.util.Scanner;

public class MaxElement
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for ( int x : arr)
        {
            System.out.print(x + " ");
        }

        int max = 0;

        for(int x : arr)
        {
            if(x > max)
                max = x;
        }
        System.out.println("\nMaximum element is " + max);
        sc.close();
    }
}