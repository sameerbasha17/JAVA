import java.util.Hashtable;
import java.util.Map;

public class Verification 
{
    public static void main(String[] args) 
    {
        Map <Integer, String> m = new Hashtable<>();
        m.put(1, "Komarapudi");
        m.put(2, "South Mopur");
        m.put(3, "Devara palem");
        
        System.out.println(m.containsKey(3));  // true
        System.out.println(m.containsKey(5));  // false

        System.out.println(m.containsValue("Komarapudi"));   // true
        System.out.println(m.containsValue("Mulmudi"));      // false
    }    
}
