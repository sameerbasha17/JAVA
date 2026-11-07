package JAVA.Inner_Classes;

class Outer
{
    int x = 9;

    Inner i = new Inner();

    class Inner
    {
        int y = 17;

        public void innerDisplay()
        {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay()
    {
        //Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}


public class NestedInnerClass 
{
    public static void main(String[] as) 
    {
        // Outer o = new Outer();
        // o.outerDisplay();    

        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
    }
}

// Output :
// 9 17