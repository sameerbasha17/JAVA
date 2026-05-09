public class XorAssign 
{
    public static void main(String[] args) 
    {
        int a = 3, b = 5;
        a ^= b ^= a ^= b;
        System.out.println(a + " " + b);    

        int x = 10;
        x += x *= 2;
        System.out.println("x = " + x);
    }    
}
