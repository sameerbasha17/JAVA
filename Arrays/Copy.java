// TASK : Copy an array into another array.

public class Copy 
{
    public static void main(String [] args)
    {
        int a[] = { 1, 2, 3, 4, 2};
        int b[] = new int[a.length];

        for(int i = 0; i < a.length ; i++)
        {
            b[i] = a[i];
        }
        
        for(int x : b)
        {
            System.out.print(x + " ");
        }
    }     
}


//Output : 1 2 3 4 2 