// Method overriding Demo

class Super
{
    public void display()
    {
        System.out.println("I'm Super Class");
    }
}

class Sub extends Super
{
    @Override 
    public void display()
    {
        System.out.println("I'm Sub Class");
    }
}

public class MethodOverriding 
{
    public static void main(String[] as) 
    {
        Sub sub_obj = new Sub();
        sub_obj.display();

        Super sp = new Super();
        sp.display();
    }
}
