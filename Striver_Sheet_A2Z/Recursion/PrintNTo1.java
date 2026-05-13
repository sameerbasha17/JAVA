// TASK : Print values from N to 1
import java.util.Scanner;

public class PrintNTo1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter N value : ");
        int n = sc.nextInt();

        // call the method
        printing(n, 1);

        sc.close();
    }

    static void printing(int num, int i)
    {
        if(num < i)
        {
            return;
        }

        System.out.println(num--);

        printing(num, i);
    }

}

/*
Output : 
=========
Enter N value : 9
9
8
7
6
5
4
3
2
1

*/