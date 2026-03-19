import java.util.HashMap;
import java.util.Map;

public class Update
{
    public static void main(String[] args) 
    {
        Map <Integer, String> m = new HashMap<>();  
        m.put(1, "One");
        m.put(2, "Two");
        m.put(3, "Three");
        
        System.out.println(m);  // {1=One, 2=Two, 3=Three}
        m.put(3,"Four");
        System.out.println(m);  // {1=One, 2=Two, 3=Four}

        m.putIfAbsent(2,"Five");
        System.out.println(m);  // {1=One, 2=Two, 3=Four}

        m.replace(1,"Seven");
        System.out.println(m);  // {1=Seven, 2=Two, 3=Four}
    }
}