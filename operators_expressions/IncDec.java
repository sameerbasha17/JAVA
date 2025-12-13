public class IncDec 
{
    public static void main(String [] args)
    {
        System.out.println("a = 5 ");
        int a = 5;
        a++;
        System.out.println("a++ = " + a);
        System.out.println();

        System.out.println("b = 7 ");
        int b = 7;
        ++b;
        System.out.println("++b = " + b);
        System.out.println();

        System.out.println("x = 9 and y = 0");
        int x = 9;
        int y = 0;
        y = x++;
        System.out.println("If y = x++ then x = " + x + " and y = " + y);
        System.out.println();

        System.out.println("p = 2 , q = 3 and r = 0 ");
        int p = 2;
        int q = 3;
        int r = 0;
        r = p++ + ++q + ++p;
        System.out.println("If r = p++ + ++q + ++p Then r = " + r);
        System.out.println();

        System.out.println("b = 9 where is a variable of byte datatype.");
        b = 9;
        b++;
        System.out.println("If b=b++ then b = " + b);
        System.out.println("Here we don't get any error like 'Possible lossy conversion from int to byte'. It's because, we use post increment operater which works on value i.e it don't add integer '1' externally ");
        System.out.println();

        System.out.println("c = 'A', where c is a variable of char datatype ");
        char c = 'A';
        c++;
        System.out.println("If c=c++ then c = " + c);

    }
}
