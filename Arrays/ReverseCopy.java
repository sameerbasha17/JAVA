// TASK : Reverse copying of an array.

public class ReverseCopy 
{
    public static void main(String [] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[a.length];

        for(int i = a.length - 1, j = 0; i >=0 ; i--,j++)
        {
            b[j] = a[i];
        }

        // diplay the reversed copied array(b)

        for(int x : b)
        {
            System.out.print(x + " ");
        }
    }    
}

// output : 10 9 8 7 6 5 4 3 2 1
