// TASK: Overload a method which " Reverse the given number or array ".
package JAVA.Methods.Student_Challenge;

public class Reverse 
{
    public static void main(String [] args)
    {
        int a = 143;
        int[] arr = {1,2,3,4,5};
        
        System.out.println("After reversing " + a + " , we get : " + reverse(a));

        int revArr[] = reverse(arr);
        for(int ele : revArr)
        {
            System.out.println(ele + " ");
        }
    }

    static int reverse(int number)
    {
        int rev = 0;
        while(number != 0)
        {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }

        return rev;
    }

    static int[] reverse(int arr[])
    {
        int rev[] = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i --, j++)
        {
            rev[j] = arr[i];
        }

        return rev;
    }
}

/*
A new way(i didn't used till now) to compile and run java program with hierarchy : 
PS C:\Users\Sameer\Desktop\Courses\java\java\methods\student_challenge> javac -d . Reverse.java
PS C:\Users\Sameer\Desktop\Courses\java\java\methods\student_challenge> java JAVA.Methods.Student_Challenge.Reverse


Output : 
=========
After reversing 143 , we get : 341
5 
4 
3 
2 
0  */