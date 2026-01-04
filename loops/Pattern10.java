/* TASK : Display the following pattern 
         *        
       * * *     
     * * * * *
   * * * * * * *
* * * * * * * * *
    


        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/

public class Pattern10 
{
    public static void main(String [] args)
    {
        for(int i = 1; i <= 5; i ++)
        {
            for(int j = 1; j <=5; j++)
            {
                if(j <= 5-i)
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int k = 1 ;k<= 4; k++)
            {
                if(k <= i-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
       
        // If you include below code you get dimond pattern.
        for(int i = 1; i <= 4; i ++)
        {
            for(int j = 1; j <=5; j++)
            {
                if(j <= i)
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int k = 1 ;k<= 4; k++)
            {
                if(k <= 4-i)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
        //
    }
}
