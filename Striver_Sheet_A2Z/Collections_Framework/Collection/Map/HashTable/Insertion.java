import java.util.Hashtable;
import java.util.Map;

public class Insertion
{
    public static void main(String[] args) 
    {
        Map <Integer,String> m = new Hashtable<>();    
        System.out.println(m);   // {}

        m.put(2006,"Sameer");
        m.put(2005,"Vishnu");
        m.put(2018,"Arhan");

        System.out.println(m);   // {2018=Arhan, 2006=Sameer, 2005=Vishnu}
    }    
}
