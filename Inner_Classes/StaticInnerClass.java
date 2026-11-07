package JAVA.Inner_Classes;

class Bayata
{
    int x = 17;
    static int z = 20;

    static class Lopala
    {
        int y = 9;

        public void display()
        {
            System.out.println("Static class - Lopala Display Method");
            System.out.println(y);
            // System.out.print(x);  Not possible only static members are accessible
            System.out.println(z); // Due to z is static it is accessible.
        }
    }
}

public class StaticInnerClass 
{
    public static void main(String[] as) 
    {       
        Bayata.Lopala bl = new Bayata.Lopala();
        bl.display();
    }   
}

/*
Output :
--------
Static class - Lopala Display Method
9
20

*/