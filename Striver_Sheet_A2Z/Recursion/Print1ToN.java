// TASK : Print 1 to N linearly.
import java.util.Scanner;

public class Print1ToN 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Take N from user
        System.out.print("Enter N value : ");
        int n = sc.nextInt();

        // call the method.
        printMethod(1, n);
    }  
    
    static void printMethod(int i , int n)
    {
        if(i > n)
        {
            return;
        }
        System.out.println(i);
        printMethod(i + 1, n);
    }
}

/*
Output : 
========
Enter N value : 4
1
2
3
4

*/