// Calculates the bill of items . uses command line arguments...

import java.util.Scanner;

public class NumberAddition 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0,temp = 0;
        for(int i = 0; i < args.length; i++ )
        {
            if(args[i].equals("no"))
            {
                System.out.println("Total price : " + sum);
                break;
            }
            else{
                temp = Integer.parseInt(args[i]);
                sum += temp;
            }
        }
    }   
}

/*
Output :
========
java NumberAddition 306 103 210 63 30 80 25 70 88 100 60 35 60 76 40 70 242 no        
Total price : 1658
*/