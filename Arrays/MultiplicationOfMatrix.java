// TASK : perform multiplication of matrix.

public class MultiplicationOfMatrix 
{
    public static void main(String [] args)
    {
        int a[][] = {{1,2},{2,3}};
        int b[][] = {{3,1},{1,1}};

        System.out.println("Matrix A : ");
        for(int x[] : a)
        {
            for(int y : x)
            {
                System.out.print(y +" ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix B : ");
        for(int x[] : b)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Matrix Multiplication

        // int temp = 0;
        int c[][];

        c = new int[a.length][b[0].length];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                c[i][j] = 0;
                for(int k = 0; k < b[i].length; k++)
                {
                    //temp += a[i][k] * b[k][j];
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
                //c[i][j] = temp;
                //temp = 0;
            }
        }

        // print the resultant matrix(c)

        System.out.println("Matrix C : (Resultant Matrix) ");
        for(int x[] : c)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }    
}

/*
Output :
========
Matrix A : 
1 2 
2 3

Matrix B :
3 1
1 1

Matrix C : (Resultant Matrix)
5 3
9 5

*/