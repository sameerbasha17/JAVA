// Variable arguments : Allows a method to take any number of arguments - primitives.

public class VariableArguments 
{
    public static void main(String [] args)
    {
        // int a[] = new int[] {1,2};
        // int b[] = new int[] {3,4};
        show(1,2,3,4);
    }    

    static void show(int ... x)
    {
        /*for(int ele[] : x)
        {
            for(int e : ele)
                System.out.println(e);
        }
        */
       for(int i = 0; i < x.length; i++)
       {
        System.out.println(x[i]);
       }
       for(int element : x)
       {
        System.out.print(element + " ");
       }
    }
}
