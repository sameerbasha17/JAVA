package JAVA.Java.lang_Package;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class My
{
    public int i;
    protected float f;
    char c;
    private boolean bo;

    My() {}
    My(int x, int y){}

    public void display(){}
    private int show(){return 0;}
}

public class ReflectionPackage 
{
    public static void main(String[] as) 
    {
        Class c1 = My.class;

        My m = new My();
        Class c2 = m.getClass();

        System.out.println(c1.getName());  // Output : JAVA.Java.lang_Package.My

        Field fields[] = c1.getDeclaredFields();
        for(Field x : fields)
            System.out.println(x);

        /* Output : 
        ===========
        public int JAVA.Java.lang_Package.My.i
        protected float JAVA.Java.lang_Package.My.f
        char JAVA.Java.lang_Package.My.c
        private boolean JAVA.Java.lang_Package.My.bo */

        Constructor con[] = c1.getDeclaredConstructors();
        for(Constructor ct : con)
            System.out.println(ct);

        /* Output :
        ===========
        JAVA.Java.lang_Package.My()
        JAVA.Java.lang_Package.My(int,int) */

        Method meths[] = c1.getDeclaredMethods();
        for(Method meth : meths)
            System.out.println(meth);

        /* Output :
        ============
        private int JAVA.Java.lang_Package.My.show()
        public void JAVA.Java.lang_Package.My.display() */


    }
}
