// Update an element in the ArrayList collection
import java.util.ArrayList;

public class Updation
{
    public static void main(String [] args)
    {
        ArrayList <String> al1 =  new ArrayList<>();

        al1.add("Pen");
        al1.add("Pencil");
        al1.add("Paper");

        System.out.println(al1);  // [Pen, Pencil, Paper]

        // Let's change the "Paper" into "Bag"
        int index = al1.indexOf("Paper");   // indexOf() is a method used to find the index of specified object.
        al1.set(index,"Bag");

        System.out.println(al1);   // [Pen, Pencil, Bag]
    }
}

/*
Output : 
========
[Pen, Pencil, Paper]
[Pen, Pencil, Bag]

*/