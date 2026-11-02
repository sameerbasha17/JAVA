// Example 2 

class Car
{
    public void start()
    {
        System.out.println("Car's Engine started.");
    }
    public void accelerate()
    {
        System.out.println("Car is Accelerated.");
    }
    public void changeGear()
    {
        System.out.println("Car gear is changed Manually.");
    }
}

class LuxaryCar extends Car
{
    @Override 
    public void changeGear()
    {
        System.out.println("Luxary Car gear is changed Automatically.");
    }
    public void openSunRoof()
    {
        System.out.println("Luxary Car's Sun roof is opened.");
    }
}

public class MethodOverriding_ex2
{
    public static void main(String[] as) 
    {
        LuxaryCar lc = new LuxaryCar();
        lc.start();
        lc.changeGear();
        lc.openSunRoof();
    }
}


/*
Output :
--------
Car's Engine started.
Luxary Car gear is changed Automatically.
Luxary Car's Sun roof is opened.

*/