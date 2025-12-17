// TASK : Write a program to demonstrate the action of Operaator % on whole numbers and floating point numbers.

public class ModOperator 
{
    public static void main(String[] args)
    {
        System.out.println("6 % 2 = " + 6 % 2);
        System.out.println("6 % 2.1 = " + 6 % 2.1f);
        System.out.println("6 % 2.1 = " + -6 % 2.1f); //negative number
        System.out.println("6 % 2.1 = " + 6 % -2.1f); //no effect
        System.out.println("6.1 % 2 = " + 6.1f % 2);
        System.out.println("6.1 % 2.1 = " + 6.1f % 2.1f);
        
    }
}

/*
Output : 
========
6 % 2 = 0
6 % 2.1 = 1.8000002
6 % 2.1 = -1.8000002
6 % 2.1 = 1.8000002
6.1 % 2 = 0.099999905
6.1 % 2.1 = 1.9000001
*/