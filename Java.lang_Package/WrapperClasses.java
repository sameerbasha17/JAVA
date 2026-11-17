package JAVA.Java.lang_Package;

public class WrapperClasses 
{
    public static void main(String[] as) 
    {
        byte b = 12;
        Byte bb = b;
        //Byte bbb = Byte.valueOf(12);     error
        Byte bbbb = Byte.valueOf(b);

        int i = 9;
        Integer ii = Integer.valueOf(i); // AutoBoxing
        int iii = ii.intValue(); // unBoxing
    }
}
