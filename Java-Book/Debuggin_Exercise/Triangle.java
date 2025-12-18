/* Task : Debug the following program and run it.
public class triangle{
privateintbase;
privateintheight;
public void setValues (intB, intH)
    {Base = B;
    Height = H;}
    public static void main(String[] args){
    Triangle tr = new Triangle ( );
    tr.setValues(30, 70);
    System.out.prntln("Area of triangle = " + 0.5* tr.base *tr.height);
    }
} */

public class Triangle 
{
    private int base;
    private int height;
    
    public void setValues(int B, int H)
    {
        base = B;
        height = H;
    }

    public static void main(String [] args)
    {
        Triangle tr = new Triangle();
        tr.setValues(30, 70);
        System.out.println("Area of triangle = " + 0.5 * tr.base * tr.height);
    }
}

/* 
Output : 
========
Area of triangle = 1050.0
*/