package JAVA.LamdaExpression;

/*
A Lamda expression can have local variables.
A Lamda expression can use variables inside the outer method if they are final or effectively final.
A Lamda expression can use instance variables.
*/

@FunctionalInterface 
interface Imy1
{
    public abstract void show();
}

public class Demo2 
{
    static int z = 2;
    public static void main(String[] as) 
    {
        int y = 1;
        Imy1 obj = () ->
                    {
                        int x = 7; 
                        System.out.println(++x);
                        System.out.println(y);
                        //System.out.print(++y);
                        System.out.println(++z);
                    };    

        obj.show();
    }
}

/* Output :
===========
8
1
3
*/