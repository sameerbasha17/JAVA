import java.util.Scanner;

public class Pattern10 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // input : Max stars in the row
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print("*"); 
            }
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n-1; i ++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Output : 
=========
Enter n value : 5
*    
**
***
****
*****
****
***
**
*


*/