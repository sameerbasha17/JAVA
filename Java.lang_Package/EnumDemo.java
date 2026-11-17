package JAVA.Java.lang_Package;

enum TrafficLight      // Useful for type safe, readability, keep related behavior in one place.
{
    RED, YELLOW, GREEN;

    // Can have Constructor (only private and default are allowed)
    private TrafficLight()
    {
        System.out.println(this.name());
    }

    public String display()
    {
        String message = switch(this)
        {
            case RED -> "Stop !";
            case YELLOW -> "Get Ready !";
            case GREEN -> "Go !!";
        };

        return message;
    }
}

public class EnumDemo 
{
    public static void main(String[] as) 
    {
        TrafficLight tl = TrafficLight.GREEN;
        System.out.println(tl.display());
    }
}
