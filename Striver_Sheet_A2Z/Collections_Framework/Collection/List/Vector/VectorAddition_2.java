import java.util.Vector;

public class VectorAddition_2
{
    public static void main(String [] args)
    {
        Vector<Integer> v1 = new Vector<>();

        for(int i = 0; i < 5; i++)
        {
            v1.add(i);
        }

        Vector<Integer> v2 = new Vector<>();
        v2.add(10);
        v2.add(20);
        v2.add(30);

        System.out.println("V1 : " + v1 +"\n" + "V2 : " + v2);
        /*
        V1 : [0, 1, 2, 3, 4]
        V2 : [10, 20, 30]
        */

        // Add two collections(vectors) using addAll()
        v1.addAll(v2);
        System.out.println(v1);    // [0, 1, 2, 3, 4, 10, 20, 30]

        System.out.println(v1.addAll(v2));  // true
        System.out.println(v1);    // [0, 1, 2, 3, 4, 10, 20, 30, 10, 20, 30]

        v1.addAll(v2);
        System.out.println(v1);    // [0, 1, 2, 3, 4, 10, 20, 30, 10, 20, 30, 10, 20, 30]

        // Add using index

        Vector <Integer> v3 = new Vector<>();
        v3.add(100);
        v3.add(200);
        System.out.println(v3);    // [100, 200]

        v1.addAll(1,v3);
        System.out.print(v1);   // [0, 100, 200, 1, 2, 3, 4, 10, 20, 30, 10, 20, 30, 10, 20, 30]
        
    }
}