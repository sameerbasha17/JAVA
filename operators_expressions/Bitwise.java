public class Bitwise
{
    public static void main(String [] args)
    {

        byte a = 7, b=9;

        byte c;

        c = (byte) (a<<4);
        c = (byte) (c | b);

        System.out.println(c);
        System.out.println(String.format("%s", Integer.toBinaryString(c)));

        System.out.println((c & 0b11110000)>>4); // To find first number(four bits) on left side.

        System.out.println(( c & 0b00001111));   // To find the second number(four bits) on right side.
      
        
    }
}

/* 
Output : 
====== 
121
1111001
7
9
*/
