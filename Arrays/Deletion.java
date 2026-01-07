// TASK : Delete an element in array.

import java.util.Scanner;
public class Deletion 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};

        for(int x : arr)
        {
            System.out.print(x + " ");
        }

        System.out.println("\nEnter the element to be deleted.");
        int delEle = sc.nextInt();
        int index = -1;

        for(int i = 0; i < arr.length; i ++)
        {
            if(arr[i] == delEle)
            {
                index = i;
                break; // takes first occurance of element if duplicates are present
            }
        }
        if(index == -1)
        {
            System.out.println("The given array does not have "+ delEle+" as element.");
            System.exit(0);
        }
        
        for(int i = index; i < arr.length-1; i ++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        
        // display

        for(int x : arr)
        {
            System.out.print(x + " ");
        }

        sc.close();
    }    
}

/*
Output :
Enter the element to be deleted.
3
1 2 4 5 6 0 

*/
