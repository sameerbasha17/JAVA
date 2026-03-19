import java.util.LinkedList;

public class Deletion 
{
    public static void main(String[] args) 
    {
        LinkedList<Boolean> ll = new LinkedList<>();
        
        ll.add(true);
        ll.add(false);
        ll.add(true);

        System.out.println(ll);   // [true, false, true]
        ll.remove(0);

        System.out.println(ll);   // [false, true]

        ll.add(false);
        ll.add(true);
        System.out.println(ll);   // [false, true, false, true]

        ll.remove(false);
        System.out.println(ll);   // [true, false, true]
    }    
}
