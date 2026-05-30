/* Program 5 — Greatest of 3 Numbers
=====================================
Read three numbers and print the greatest among them. */
import java.util.Scanner;
public class GreatestOfThreeNums 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int greatest = n1;
        if(n2 > n1) greatest = n2;
        if(n3 > greatest) greatest = n3;

        System.out.print("Greatest Number : " + greatest);
        sc.close();
    }    
}

/*
Output : 
========
Enter three numbers : 3 7 9
Greatest Number : 9
*/