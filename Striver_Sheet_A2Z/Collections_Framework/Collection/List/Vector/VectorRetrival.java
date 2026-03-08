// Accessing Elements in the Vector
import java.util.Vector;

public class VectorRetrival
{
    public static void main(String [] args)
    {
        Vector<Integer> v = new Vector<Integer>();   // right side <Integer> is optional.

        v.add(200);
        v.add(100);
        v.add(1);
        v.add(2,2);

        System.out.println(v);   // [200, 100, 2, 1]

        System.out.println(v.get(0));   // 200
        System.out.println(v.get(3));   // 1
    }
}