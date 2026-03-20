// Task : To print all the divisors of a number
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Divisors 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        // Input 
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        // divisors
        for(int i = 1; i * i <= number; i ++)
        {
            if(number % i == 0)
            {
                al.add(i);
                
                if(number/ i != i)
                {
                    al.add(number/i);
                }
            }
            
        }
        Collections.sort(al);

        for(Integer x : al)
        {
            System.out.print(x + " ");
        }
    }    
}

/*
Output :
========
Enter a number : 
56
1 2 4 7 8 14 28 56 

*/