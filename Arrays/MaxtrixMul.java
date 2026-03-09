// Experimentation 

import java.util.Scanner;

public class MaxtrixMul
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1 value : ");
        int r1 = sc.nextInt();
        System.out.print("Enter c1 value : ");
        int c1 = sc.nextInt();
        System.out.print("Enter the elements : ");
        int A[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter r2 value : ");
        int r2 = sc.nextInt();
        System.out.print("Enter c2 value : ");
        int c2 = sc.nextInt();
        System.out.print("Enter the elements : ");
        int B[][] = new int[r2][c2];
        for(int i = 0; i < r2; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        if(c1 != r2)
        {
            System.out.println("Multiplication is not possible.");
            System.exit(0);
        }

        int[][] result = new int[r1][c2];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                result[i][j] = 0;
                for(int k = 0; k < c1; k++)
                {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int x[] : result)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}