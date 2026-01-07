// TASK : Insert an element in array.

import java.util.Scanner;
public class Insertion 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] =  new int[10];

        arr[0] = 1; arr[1] = 9; arr[2] = 3; arr[3]= 7; arr[4] = 4; arr[5] = 35; 
        int n = 6; // filled elements in arr

        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println("\nEnter the new element to be inserted : ");
        int element = sc.nextInt();
        System.out.println("Enter the index to be inserted : ");
        int index = sc.nextInt();

        for(int i = n; i > index /*!= index */; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = element;

        // display the modified array

        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}

/*
Output :
=========
1 9 3 7 4 35 0 0 0 0 
Enter the new element to be inserted :
9
Enter the index to be inserted : 
4
1 9 3 7 9 4 35 0 0 0 

*/
