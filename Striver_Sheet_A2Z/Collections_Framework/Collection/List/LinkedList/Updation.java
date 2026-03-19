import java.util.LinkedList;

public class Updation 
{
    public static void main(String[] args) 
    {
        LinkedList <Integer> obj = new LinkedList<>();
        
        obj.add(8);
        obj.add(8);
        obj.add(8);
        obj.add(5);
        obj.add(7);
        obj.add(8);
        obj.add(7);

        System.out.println(obj);   // [8, 8, 8, 5, 7, 8, 7]

        obj.set(2,9);

        System.out.println(obj);   //  [8, 8, 9, 5, 7, 8, 7]

    }    
}
