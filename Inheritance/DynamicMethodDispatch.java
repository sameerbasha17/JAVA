// Dynamic Method Dispatch Demo

class Telivison
{
    public void switchOn()
    {
        System.out.println("Telivison is switched on.");
    }
    public void changeChannel()
    {
        System.out.println("Telivison channel is changed.");
    }
}

class SmartTelivison extends Telivison
{
    @Override 
    public void switchOn()
    {
        System.out.println("Smart Telivison is switched ON");
    }

    @Override 
    public void changeChannel()
    {
        System.out.println("Smart Telivison channel is changed.");
    }

    public void browse()
    {
        System.out.println("Smart Telivison is browsed");
    }
}


public class DynamicMethodDispatch 
{
    public static void main(String[] as) 
    {
        // The Super class reference is holding the sub class object
        Telivison t = new SmartTelivison();
        // then, when a overrided method is called - the method of object(sub class) is called. not the object of reference.
        t.changeChannel();

        // only the methods of super class are allowed
        // t.browse();
    }
}

/* Output : 
-----------
Smart Telivison channel is changed.

*/
