// TASK : To find the maximum element in the array

public class MaxElementInArray 
{
    public static void main(String [] args)
    {
        int array[] = {1,2,3,2,1,4,5,1,2,3,4};
        System.out.println("The maximum element in array is : " + findMax(array));
    }    

    static int findMax(int arr[])
    {
        int max = arr[0];
        for(int x : arr)
        {
            if(max < x)
            {
                max = x;
            }
        }

        return max;
    }
}

// Output : The maximum element in array is : 5