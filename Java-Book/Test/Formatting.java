public class Formatting 
{
    public static void main(String [] args)
    {
        int i = 889;
        long l = 9899898;
        byte b = 9;

        float f = 8997.980f;
        double d = 8970987.8909798;

        String s = "Happy morning to one and all";
        String str = "java";
        
        System.out.printf("\n%d\n", i);     // Default(Right justification)
        System.out.printf("%10d\n", i);  // Right justification
        System.out.printf("%-10d\n", i); // Left justification
        System.out.printf("%1d\n\n", i);    // Right justification 

        /*
        889
               889
        889       
        889
        */


        System.out.printf("%d\n", l);     // Default(Right justification)
        System.out.printf("%10d\n", l);  // Right justification
        System.out.printf("%-10d\n", l); // Left justification
        System.out.printf("%1d\n\n",l);    // Right justification
        /*
        9899898
           9899898
        9899898
        9899898
        */
        
        System.out.printf("%d\n", b);     // Default(Right justification)
        System.out.printf("%10d\n", b);  // Right justification
        System.out.printf("%-10dw\n", b); // Left justification
        System.out.printf("%1d\n\n",b);    // Right justification
        /*
        9
                 9
        9         w
        9
        */

        System.out.printf("%f\n", f);     // Default(Right justification)
        System.out.printf("%30f\n", f);  // Right justification
        System.out.printf("%-30fw\n", f); // Left justification
        System.out.printf("%1f\n\n",f);    // Right justification
        /*
        8997.980469
                           8997.980469
        8997.980469                   w
        8997.980469
        */
        
        System.out.printf("%.2f\n", f);     // Default(Right justification)
        System.out.printf("%30.3f\n", f);  // Right justification
        System.out.printf("%-30.3fw\n", f); // Left justification
        System.out.printf("%-1.1f\n\n",-f);    // Left justification
        /*
        8997.98
                              8997.980
        8997.980                      w
        -8998.0
        */

        System.out.println(s);
        System.out.printf("%s\n",s);
        System.out.printf("%30s\n",s);
        System.out.printf("%30S\n",s);
        
        /*
        Happy morning to one and all
        Happy morning to one and all
        Happy morning to one and all
        HAPPY MORNING TO ONE AND ALL
        */

        System.out.printf("%30.5s",s);

        /*
                                 Happy
        */
       
        System.out.printf("\n%S",str);
        System.out.printf("\n%.1s",str);
        
        /*
        JAVA
        j
        */
    }
}
