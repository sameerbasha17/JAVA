import java.util.Scanner;

public class Pattern22 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        // Print pattern (Tricky - Observe)
        for(int i = 0; i < (n * 2 - 1); i++)  // I have taken 0-based index of simplicity for this program.
        {
            for(int j = 0; j < (n * 2 - 1); j++)
            {
                int top  = i;
                int left = j;
                int right = (n * 2 - 2) - j;
                int bottom = (n * 2 - 2) - i;
                
                System.out.print(n - Math.min(Math.min(top,left), Math.min(right,bottom)));
            }
            System.out.println();
        }

        sc.close();
    }    
}

/*
Output : 
=========
Enter n value : 
4
4444444
4333334
4322234
4321234
4322234
4333334
4444444

*/