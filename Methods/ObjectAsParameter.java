// Methods : when object(reference) is passed as parameter.
import java.util.Scanner;

public class ObjectAsParameter 
{
    static void changeValue(int A[], int i, int value)  // argument
    {
        A[i] = value;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " array elements : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
           arr[i] =  sc.nextInt();
        }

        // Ask user the change a value in the array using index
        System.out.println("Enter the index and value of the element you want to change : ");
        int index = sc.nextInt();
        int value = sc.nextInt();

        // call the static method
        changeValue(arr,index,value);

        // Print After change
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }    
}

/*
Output :
========
Enter the size of the array : 
2
Enter the 2 array elements : 
0 1
Enter the index and value of the element you want to change : 
0 9
9 1 
PS C:

*/