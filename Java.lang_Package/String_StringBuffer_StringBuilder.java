package JAVA.Java.lang_Package;

public class String_StringBuffer_StringBuilder 
{
    public static void main(String[] as) 
    {
        String str = "Sa";   // Faster, immutable
        StringBuffer str2 = new StringBuffer("Tp");   // Thread safe, Mutable, Inital Capacity = 16, slower than String, Contains extra methods like append(), insert()
        StringBuilder str3 = new StringBuilder("jv");  // Not Tread safe, rest is same as string buffer

        System.out.println(str.concat("as"));
        System.out.println(str2.append(" Forever"));
        System.out.println(str3.append(" Friends"));
    }    
}

/*
Output :
========
Saas
Tp Forever
jv Friends

*/