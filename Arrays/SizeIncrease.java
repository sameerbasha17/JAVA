// TASK : Increase the size of an array.

public class SizeIncrease 
{
    public static void main(String [] args)
    {
        int a[] = {1,2,3,4,5};
        System.out.println("Size of the array A is " + a.length);

        int b[] = new int[2 * a.length];

        for(int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        
        a = b;
        b = null;

        System.out.println("Now, the size of the array A is " + a.length);
    }    
}

/*
Output : 
========
Size of the array A is 5
Now, the size of the array A is 10

*/
