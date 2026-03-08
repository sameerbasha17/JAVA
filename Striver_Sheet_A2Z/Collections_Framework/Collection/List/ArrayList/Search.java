// Search for an element in ArrayList collection
import java.util.ArrayList;
import java.util.Arrays;

public class Search 
{
    public static void main(String [] args)
    {
        ArrayList <Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(4);
        al1.add(2,3);
        System.out.println(al1);   // [1, 2, 3, 4]

        // use contains() to search/contains or not for a single element
        boolean result = al1.contains(3);
        System.out.println(result);  // true

        // use containsAll() to search/contains or not for a single collection
        Integer[] arr = new Integer[]{9,1};
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(arr));
        al1.addAll(al2);

        System.out.println(al1);  // [1, 2, 3, 4, 9, 1]

        System.out.println(al1.containsAll(al2)); // true
    }    
}
