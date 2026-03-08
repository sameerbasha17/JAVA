// Delete(remove) element from the Vector.
import java.util.Vector;

public class VectorDelete
{
    public static void main(String [] args)
    {
        Vector<Integer> v = new Vector<>();
        for(int i = 0; i < 5; i++)
        {
            v.add(i,i*100);
        }

        System.out.println(v);    // [0, 100, 200, 300, 400]

        v.remove(3);
        System.out.println(v.get(3)); // 400
        System.out.println(v);   // [0, 100, 200, 400]


        // Remove when duplicates
        Vector<String> v2 = new Vector<>();
        v2.add("Home");
        v2.add("School");
        v2.add("Home");
        v2.add("Home");
        v2.add("School");
        
        System.out.println(v2);   // [Home, School, Home, Home, School]

        v2.remove(1);
        System.out.println(v2);   // [Home, Home, Home, School]

        v2.remove("Home");
        System.out.println(v2);   // [Home, Home, School]

    }
}