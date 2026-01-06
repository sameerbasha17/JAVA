// TASK : Write a program to search an element in the array.

public class Searching 
{
    public static void main(String [] args)
    {
        int a[] = {1,2,3,4,5}; //must be unique
        int searchElement = 3; // you can test with different search element like 5,20,7,etc...
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == searchElement)
            {
                System.out.println("The " + searchElement + " element is found at index " + i);
                return ;
            }
        }
        System.out.println("The " + searchElement +" element is not found in the given array.");
    }    
}

// Ouptut : The 3 element is found at index 2