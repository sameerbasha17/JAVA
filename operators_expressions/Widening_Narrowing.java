public class Widening_Narrowing 
{
    public static void main (String [] args)
    {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5;
        double d = 6;
        char c = 7;
        boolean bo = true;


        b = b;
        s = b;
        i = b;
        l = b;
        f = b;
        d = b;
        // c = b;
        // bo = b;

        // b = s;
        s = s;
        i = s;
        l = s;
        f = s;
        d = s;
        // c = s;
        // bo = s;

        // b = i;
        // s = i;
        i = i;
        l = i;
        f = i;
        d = i;
        //c = i;
        //bo = i;

        //b = l;
        //s = l;
        //i = l;
        l = l;
        //f = l;
        d = l;
        //c = l;
        //bo = l;

        //b = f;
        //s = f;
        //i = f;
        //l = f;
        f = f;
        d = f;
        //c = f;
        //bo = f;

        //b = d; s =d; i =d ; l =d; f = d;
        d = d;
        // c = d,bo = d ;

        //b =c ; s = c;
        i = c;
        l = c;
        f = c;
        d = c;
        c = c;
        //bo = c;

        //bo = b, bo = s, bo = i, bo=l, bo = f, bo = d, c=bo;
        bo = bo;

        // We can do narrowing : coversion from larger datatype to lower datatype.
        b = (byte)s;
        i = (int) f;
        c = (char) b;
        f = (float) d;
        //bo = (boolean) i; i = (int) bo;
    }
}
