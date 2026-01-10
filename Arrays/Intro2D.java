// Declarations of 2 dimentional arrays..

public class Intro2D 
{
    public static void main(String [] args)
    {
        int a[][] = new int[2][2];
        for(int x[] : a)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 

        int[][] b = new int[3][3];

        int[] c,d,e[];
        c = new int[2]; // 1d
        d = new int[3]; // 1d
        e = new int[1][2]; // 2d

        int[][] f = new int[3][];

        f[0] = new int[2];
        f[1] = new int[4];
        f[2] = new int[1];

        for(int i = 0; i < f.length; i++)
        {
            for(int j = 0; j < f[i].length; j++)
            {
                System.out.print(f[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println();

        for(int x[] : f)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }    
}
