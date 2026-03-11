// TASK : Write overloaded method which validate the name and age(3 - 15)

public class Validate 
{
    public static void main(String [] args)
    {
        String name = "Vishnu T"; 
        if(validate(name))
            System.out.println("The name " + name + " is a valid name");
        else
            System.out.println("The name " + name + " is not a valid name");

        int age = 19;
        System.out.println("Is the " + age + " old boy/girl can go to school ? " + validate(age));  // Assumption value range is taken.
    }    

    static boolean validate(String n)
    {
        return n.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int num)
    {
        if(num >= 3 && num <= 15) return true;
        else return false;
    }
}

/*
Output : 
=========
Case - 1 :
-----------
The name Vishnu is a valid name
Is the 10 old boy/girl can go to school ? true

Case - 2 :
-----------
The name Vishnu1 is not a valid name
Is the 10 old boy/girl can go to school ? true

Case - 3 :
------------
The name Vishnu1 is not a valid name
Is the 19 old boy/girl can go to school ? false

*/