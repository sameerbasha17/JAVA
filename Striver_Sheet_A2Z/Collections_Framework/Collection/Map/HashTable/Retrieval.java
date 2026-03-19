import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.*;
public class Retrieval
{
    public static void main(String[] args) 
    {
        Map <Integer,String> m = new Hashtable<>();    
        System.out.println(m);   // {}

        m.put(2006,"Sameer");
        m.put(2005,"Vishnu");
        m.put(2018,"Arhan");

        System.out.println(m);   // {2018=Arhan, 2006=Sameer, 2005=Vishnu}

        // Retrieval of keys in hashtable.
        Set <Integer> s = m.keySet();
        for(Integer x : s)
        {
            System.out.print(x + " ");   // 2018 2006 2005
        }
        System.out.println();

        // Retrieval of values in hashtable.
        Collection <String> str = m.values();
        for(String x : str)
        {
            System.out.print(x + " ");   // Arhan Sameer Vishnu
        }
        System.out.println();

        // using get method
        for(Integer x :s)
        {
            System.out.print(m.get(x) + " ");  // Arhan Sameer Vishnu
        }
        System.out.println();

        // Using Entry<>
        Set<Map.Entry<Integer, String>> entries = m.entrySet();
        for(Map.Entry<Integer,String> entry : entries)
        {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println( key+ " >>>>>>> " + value);
        }
        /*
        2018 >>>>>>> Arhan
        2006 >>>>>>> Sameer
        2005 >>>>>>> Vishnu 
        */
    }    
}
