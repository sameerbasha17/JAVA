/* TASK : Dislay the following pattern :

 * * * * *
   * * * *
     * * *
       * *
         *

*/

public class Pattern08 
{
    public static void main(String [] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j=1; j <=5; j++)
            {
                if(i <= j)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); // two spaces.
                }
            }
            System.out.println();
        }
    }
}
