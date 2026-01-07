// TASK : Rotate an array.

public class Rotation 
{
    public static void main(String [] args)
    {
        int arr[] = {1,3,5,6,3,3,2,4,6,5,2,4,6};

        // Initial array :
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        // left rotation

        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1]; // arr[i-1] = arr[i]  if loop starts from 1 to < arr.length
        }
        arr[arr.length - 1] = temp;

        for(int x : arr)
        {
            System.out.print(x + " ");
        }

        // Right rotation

        System.out.println();

        temp = arr[arr.length - 1];
        for(int i = arr.length-1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }    
}
