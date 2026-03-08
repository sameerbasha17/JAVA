// Search for an element in the Vector
import java.util.*;

public class VectorSearch
{
    public static void main(String [] args)
    {
        Vector<String> v1 = new Vector<>();
        v1.add("Computer");
        v1.add("Mouse");
        
        System.out.println(v1.contains("Computer"));    // true

        // Search for another collection in a collection using containsAll

        Vector <String> v2 = new Vector<>();
        v2.add("Keyboard");
        v2.add("Chair");

        System.out.println(v1.containsAll(v2));     // false

        v1.addAll(v2);
        System.out.println(v1.containsAll(v2));     // true
    }
}