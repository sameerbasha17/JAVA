// Access the elements in the ArrayList collection
import java.util.*;

public class Retrival 
{
    public static void main(String [] args)
    {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        
        for(int i = 0; i < 3; i ++)
        {
            al.add(i,i*100);
        }

        System.out.println(al);  // [0, 100, 200, 1, 2, 3]
        // Access the element using get()
        int sum = al.get(0) + al.get(al.size()-1);  // 0 + 3 = 3 (working)
        System.out.println(sum);  // 3
    }    
}
