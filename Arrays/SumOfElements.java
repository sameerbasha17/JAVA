// TASK : Find the sum of all elements in array.

public class SumOfElements 
{
    public static void main(String [] args)
    {
        int arr[] = new int[5];
        
        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 0;
        arr[4] = 2;

        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }    
}
