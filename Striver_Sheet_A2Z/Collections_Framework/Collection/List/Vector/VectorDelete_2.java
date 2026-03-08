// Delete collection elements from another collection using removeAll()
import java.util.Vector;
public class VectorDelete_2
{
    public static void main(String [] args)
    {
        Vector <Integer> v1 = new Vector<>();
        Vector <Integer> v2 = new Vector<>();
        v1.add(1); v1.add(2); v1.add(3); v1.add(4); v1.add(5);  
        v2.add(7); v2.add(6);

        v1.addAll(v2);
        System.out.println(v1);   // [1, 2, 3, 4, 5, 7, 6]

        v1.removeAll(v2);
        System.out.println(v1);   // [1, 2, 3, 4, 5]

        System.out.println(v2);   // [7, 6]
    }
}