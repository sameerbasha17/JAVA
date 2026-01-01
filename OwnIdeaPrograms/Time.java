// TASK : converting input minutes into hours and minutes.
import java.util.Scanner;

public class Time
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in minutes : ");
        int inputTime = sc.nextInt();

        int temp = 0,countHrs = 0,countMin = 0;
        while(temp == 0)
        {
            if(inputTime >= 60)
            {
                countHrs++;
                inputTime -= 60;
            }
            else{
                countMin = inputTime;
                temp = -1;
            }
        }

        System.out.println("Time : "+ countHrs + " hr " + countMin + " minutes.");
        sc.close();
    }
}

/*
Output : 
========
Case - 1 :
----------
Enter time in minutes : 
170
Time : 2 hr 50 minutes.

Case - 2 :
----------
Enter time in minutes : 
9
Time : 0 hr 9 minutes.

*/