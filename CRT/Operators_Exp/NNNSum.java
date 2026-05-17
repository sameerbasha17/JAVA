/* 10 :Compute n + nn + nnn
=============================
Concept: Build nn = n*10 + n and nnn = n*100 + n*10 + n using arithmetic. Alternatively use string
repetition and Integer.parseInt() */
import java.util.Scanner;
public class NNNSum 
{
    public static void main(String[] args)
    {
        System.out.println("Program : Compute n + nn + nnn\n");
        Scanner sc = new Scanner(System.in);

        //input from user
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Method - 1: Arithmetic");
        //computation
        int nn = n * 10 + n;
        int nnn = n * 100 + nn;

        //output print
        System.out.println("n + nn + nnn is : " + (n+nn+nnn));

        System.out.println("\nMethod - 2: String");
        String n2 = ""+n+n;
        String n3 = ""+n+n+n;
        int num_nn = Integer.parseInt(n2);
        int num_nnn = Integer.parseInt(n3);

        System.out.print("n + nn + nnn is : " + (n + num_nn + num_nnn));
        sc.close();
    }    
}

/*
Program : Compute n + nn + nnn

Enter a number : 5
Method - 1: Arithmetic
n + nn + nnn is : 615

Method - 2: String
n + nn + nnn is : 615
*/