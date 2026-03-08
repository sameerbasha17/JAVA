// Addition of elements in the arrayList collection.
import java.util.ArrayList;
import java.util.Vector;
import java.util.Arrays;

public class Addition 
{
    public static void main(String [] args)
    {
        ArrayList <String> al1 = new ArrayList<>();

        al1.add("alpha");
        al1.add("Beta");
        al1.add("Gama");

        System.out.println(al1);  // [alpha, Beta, Gama]

        // With specified index
        al1.add(2,"Delta");

        System.out.println(al1);  // [alpha, Beta, Delta, Gama]

        // With another collection
        ArrayList <String> al2 = new ArrayList<>();
        al2.add("Zeta");

        al1.addAll(al2);

        System.out.println(al1);   // [alpha, Beta, Delta, Gama, Zeta]

        Vector <String> v1 = new Vector<>();
        v1.add("Theta");

        al1.addAll(v1);
        System.out.println(al1);    // [alpha, Beta, Delta, Gama, Zeta, Theta]


    }    
}
