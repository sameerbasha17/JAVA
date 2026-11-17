package JAVA.Java.lang_Package;
/*
Notes :
=======
1) Object class is the mother of all classes in java (means each and every class inherit from Object class)
2) Object class provides methods like wait(), notify(), equals(Object o), toString(), hashCode().

*/

public class ObjectClass 
{
    public static void main(String[] as)
    {
        ObjectClass o1 = new ObjectClass();
        System.out.println(o1.hashCode());  // HashCode is a unique code for every object class

        ObjectClass o2 = new ObjectClass();
        System.out.println(o2.hashCode());

        System.out.print(o1.equals(o2));
    }
}

/*
Output :
========
925858445
798154996
false

*/