// TASK : Calculate the sum for the command line arguments

public class CommandLineArgs_Sum 
{
    public static void main(String [] args)
    {
        double sum = 0;
        for(String ele : args)
        {
            sum += Double.parseDouble(ele);
        }
        System.out.println("Sum : " + sum);
    }    
}

/*
Output :
========
PS C:\Users\Sameer\Desktop\Courses\java\java\methods> java CommandLineArgs_Sum
Sum : 0.0
PS C:\Users\Sameer\Desktop\Courses\java\java\methods> java CommandLineArgs_Sum  45 1 3 5
Sum : 54.0
PS C:\Users\Sameer\Desktop\Courses\java\java\methods> java CommandLineArgs_Sum  -34 34 3 24 55 -24
Sum : 58.0

*/