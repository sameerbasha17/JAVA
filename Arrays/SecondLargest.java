// TASK : Find the second largest element in array.

public class SecondLargest 
{
    public static void main(String [] args)
    {
        int arr[] = {1,3,2,5,4,6,7,9};
        int max1,max2;
        max1 = max2 = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2)
            {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest element : " + max2 + "\nFirst largest element : " + max1);
    }
}
