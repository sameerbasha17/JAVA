import java.util.Vector;

public class VectorAddition 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();

        // Let's add new elements to the vector. Note : Every element in the vector/collection is a object.
        v.add("Sameer");
        v.add("Vishnu");
        v.add("Tharun");

        System.out.println(v);    // [Sameer, Vishnu, Tharun]

        // size of the vector
        System.out.println(v.size());       // 3
        System.out.println(v.capacity());   // 10

        // Lets add new elements in specified indices in the vector
        v.add(0,"Sister");

        System.out.println(v);    // [Sister, Sameer, Vishnu, Tharun]

        v.add(2,"Friend");

        System.out.println(v);   // [Sister, Sameer, Friend, Vishnu, Tharun]

        v.add("Jithu");

        System.out.println(v);  // [Sister, Sameer, Friend, Vishnu, Tharun, Jithu]
    }
}

/*
NOTE :
======
PS C:\Users\Sameer\Desktop\Courses\java\java\Striver_Sheet_A2Z\collections_framework\collection\List\vector> javac VectorAddition.java
Note: VectorAddition.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

Occured due to inuse of generics. Add can be retified using (Vector<String> v = new Vector<>();)
*/