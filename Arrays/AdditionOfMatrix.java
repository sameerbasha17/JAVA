// TASK : Perform matrix addition.

import java.util.Scanner;
public class AdditionOfMatrix 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] b = new int[3][3];
        // int x[] = b[0];
        // x = {0,1,0}; not possible
        System.out.println("Enter 3 x 3 matrix elements : ");
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[0].length; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix A : ");
        for(int x[] : a)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix B : ");
        for(int x[] : b)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }


        // performing Addition :
        int[][] c = new int[a.length][a[0].length];

        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < c[0].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nMatrix C : ");
        for(int x[] : c)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }


        sc.close();
    }    
}

/*
Output :
========
Enter 3 x 3 matrix elements : 
1 2 1
1 1 0
2 1 7

Matrix A : 
1 2 3 
4 5 6 
7 8 9 
Matrix B : 
1 2 1 
1 1 0 
2 1 7 

Matrix C : 
2 4 4 
5 6 6 
9 9 16

*/