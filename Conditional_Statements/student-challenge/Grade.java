/* TASK : Find grades for given marks. Take three subject marks and display grades
ex : 
average >= 70  : A
60 <= average < 70 : B
50 <= average < 60 : C
40 <= average < 50 : D
average < 40 : F
*/

import java.util.Scanner;

public class Grade 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of three subjects : ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        double average = (sub1 + sub2 + sub3)/3.0;
        System.out.println("Average : " + average);

        if(average >= 70)
        {
            System.out.println("A Grade");
        }
        else if(average >= 60 && average < 70)
        {
            System.out.println("B Grade");
        }
        else if(average >=50 && average < 60)
        {
            System.out.println("C Grade");
        }
        else if(average >= 40 && average < 50)
        {
            System.out.println("D Grade");
        }
        else{
            System.out.println("F Grade");
        }

        sc.close();
    }
}

/* 
Output : 
========
Case - 1 :
----------
Enter the marks of three subjects : 
56 79 80
Average : 71.66666666666667
A Grade

Case - 2 :
----------
Enter the marks of three subjects : 
23 78 45
Average : 48.666666666666664
D Grade

Note : all test cases are not tested.*/
