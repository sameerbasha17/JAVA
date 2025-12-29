// TASK : Find if the person is young or not young. Take age as input.    

import java.util.Scanner;

public class YoungOrNot 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        byte age = sc.nextByte();

        if(age < 0)
        {
            System.out.println("Please enter a proper age.");
        }

        if(age >= 14 && age <= 55)
        {
            System.out.println("Young");
        }
        else{
            System.out.println("Not Young.");
        }

        sc.close();
    }
}

/* 
Output : 
========
Case - 1 :
----------
Enter your age : 
17
Young

Case - 2 :
----------
Enter your age : 
12
Not Young.

Note : Here i taken people as young if they have age between 14 to 55.

*/