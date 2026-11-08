package JAVA.StaticAndFinal;

/*public class StaticBlocks 
{
    static 
    {
        System.out.println("Block - 1");
    }
    public static void main(String[] as) 
    {
        
    }

    static
    {
        System.out.println("Block - 2");
    }
}

Output :
=========
Block - 1
Block - 2

*/


/*
class Test 
{
    static 
    {
        System.out.println("Block - 1");
    }

    static
    {
        System.out.println("Block - 2");
    }
}

public class StaticBlocks 
{
    public static void main(String[] as) 
    {
        System.out.println("Main");
    }
}

OUTPUT :
========
Main
*/


/*
class Test 
{
    static 
    {
        System.out.println("Block - 1");
    }

    static
    {
        System.out.println("Block - 2");
    }
}

public class StaticBlocks 
{
    public static void main(String[] as) 
    {
        Test obj = new Test();
        System.out.println("Main");
    }
}

Output :
========
Block - 1
Block - 2
Main
*/

class Test 
{
    static 
    {
        System.out.println("Block - 1");
    }

    static
    {
        System.out.println("Block - 2");
    }
}

public class StaticBlocks 
{
    public static void main(String[] as) 
    {
        System.out.println("Main");
        Test obj = new Test();
    }
}

/*
Output :
--------
Main
Block - 1
Block - 2

*/

/*
Notes :
=======
Static Blocks are loaded when the class is loaded.
The class is loaded when it's object is created.
The application class is defaulty loaded so, it's all static blocks are loaded before the main method execution.

(It's really intersting concept)

*/