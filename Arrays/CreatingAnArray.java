// Creation of array

public class CreatingAnArray 
{
    public static void main(String [] args)
    {
        //int a [] = new int[7];
        int a[] = {1,2,3,4,5,6,7};
        //System.out.println(a);

        for(int i = 0; i <= a.length - 1; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int[] b = new int[6];

        int count = 1;
        for(int i = 0; i < 4; i++)
        {
            b[i] = count++;
        }

        // for-each loop

        for(int x : b) // only reading purpose(only forward direction) not for modifying the values 
        {
            System.out.print(x + " ");
        }
    }    

}
