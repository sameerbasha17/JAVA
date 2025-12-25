public class ArrayToString 
{
    public static void main(String [] args)
    {
        char c[] = {'a','B','c'};
        // System.out.println(c[1]);   output : B
        String strC = new String(c);
        System.out.println(strC); //aBc

        byte b[] = {75,28,37,47};
        // System.out.println(b);    output : [B@372f7a8d ... so use for loop access of array elements
        String strB = new String(b);
        System.out.println(strB);  //K%/

        int i[] = {87,9,89};
        //String strI = new String(i);   no method is available 
    }
}
