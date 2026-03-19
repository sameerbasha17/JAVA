import java.util.Hashtable;
import java.util.Map;

public class Delete 
{
    public static void main(String[] args) 
    {
        Map <Integer, String> m = new Hashtable<>();
        
        m.put(1, "Telugu");
        m.put(2, "Hindi");
        m.put(3, "English");
        m.put(4, "Maths");
        m.put(5, "Science");
        m.put(6, "Social");

        System.out.println(m);

        m.remove(5);
        System.out.println(m);

        m.remove(4,"Maths");
        System.out.println(m);

        m.clear();
        System.out.println(m); // {}
    }    
}

/*
Output :
========
{6=Social, 5=Science, 4=Maths, 3=English, 2=Hindi, 1=Telugu}
{6=Social, 4=Maths, 3=English, 2=Hindi, 1=Telugu}
{6=Social, 3=English, 2=Hindi, 1=Telugu}
{}
*/