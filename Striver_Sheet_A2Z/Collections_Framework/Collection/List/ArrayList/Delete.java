// Delete/remove element in the ArrayList.
import java.util.*;

public class Delete 
{
    public static void main(String [] args)
    {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);  // [1, 2, 3, 4]

        al.remove(3);

        System.out.println(al); // [1, 2, 3]

        // Second array list 
        Integer[] arr = new Integer[]{7,9};
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(arr));

        al.addAll(al2);
        System.out.println(al);     // [1, 2, 3, 7, 9]

        al.removeAll(al2);
        System.out.println(al);     // [1, 2, 3]

        al.clear();  // removes entire elements in al - arrayList collection
        System.out.println(al);  // []
    }    
}
