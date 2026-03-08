// Update a element in vector

import java.util.Vector;

public class VectorUpdate
{
    public static void main(String [] args)
    {
        Vector<String> v = new Vector<>();
        v.add("Sameer");
        v.add("Komarapudi");
        v.add("School");
        v.add("Wait");

        System.out.println(v); // [Sameer, Komarapudi, School, Wait]

        // Let's update the "Wait" into "Win" (Not deletion its replace).
        v.set(3,"Win");  
        System.out.println(v);     // [Sameer, Komarapudi, School, Win]
        
    }
}
/*
Output :
========
[Sameer, Komarapudi, School, Wait]
[Sameer, Komarapudi, School, Win]

*/