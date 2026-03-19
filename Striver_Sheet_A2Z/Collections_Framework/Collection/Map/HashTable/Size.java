import java.util.HashMap;
import java.util.Map;

public class Size
{
    public static void main(String[] args) 
    {
        Map <Integer, String> m = new HashMap<>();  
        m.put(1, "One");
        m.put(2, "Two");
        m.put(3, "Three");
        
        System.out.println(m);  // {1=One, 2=Two, 3=Three}
    
        System.out.println(m.size());  // 3
    }
}