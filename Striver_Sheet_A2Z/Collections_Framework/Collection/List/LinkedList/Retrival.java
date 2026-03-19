import java.util.LinkedList;

public class Retrival 
{
    public static void main(String[] args) 
    {
        LinkedList <String> l = new LinkedList<>();

        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        System.out.println(l.get(1));   // Two
    }    
}
