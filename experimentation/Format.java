public class Format 
{
    public static void main(String [] args)
    {
        float f = 123434254.567f;
        System.out.printf("%4.2f\n",f);

        int i = 3;

        System.out.printf("%2$d %1$f %2$d\n",f,i); // argument number accessing

        // %[argument index $][flag][width][precision][conversion]

        String str = "Nazeer Basha is my father";

        System.out.printf(str);
        System.out.printf("%50s\n",str);
        System.out.printf("%50.12s",str);
    }
}
