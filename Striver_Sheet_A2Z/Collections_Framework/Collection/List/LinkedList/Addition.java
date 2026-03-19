// Adding elements in linkedlist.
import java.util.LinkedList;
public class Addition 
{
    public static void main(String[] args) 
    {
        LinkedList <Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(1,3);
        
        LinkedList <Integer> l2 = new LinkedList<>();
        l2.add(200);
        l1.addAll(l2);

        System.out.println("Linked List - 1 : " + l1);
        System.out.println("Linked List - 2 : " + l2);
    }    
}

/*
Output : 
========
Linked List - 1 : [1, 3, 2, 200]
Linked List - 2 : [200]

*/