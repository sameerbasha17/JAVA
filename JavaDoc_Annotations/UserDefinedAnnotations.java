package JAVA.JavaDoc_Annotations;

import java.lang.annotation.*;

@Retention (RetentionPolicy.CLASS) // makes annotation avaliable in class file (others are SOURCE, RUNTIME)
@Documented  // makes annotation available in java doc
@Target(value = {ElementType.METHOD, ElementType.LOCAL_VARIABLE})  // Where this annotation can be applied
@Inherited 
@interface myAnno   // Provides mata data.
{
    String name();
    String version() default "9.0";  // Doesn't force to mention it.
    String date();
    String errors();
}

//@myAnno(name = "Sameer", version = "7.9", date = "18/11/2026", errors = "no")

public class UserDefinedAnnotations 
{
    @myAnno(name = "Sameer", version = "7.9", date = "18/11/2026", errors = "no")
    public static void main(String[] as) 
    {
        @myAnno(name = "Sameer", version = "7.9", date = "18/11/2026", errors = "no")
        int a;
    }
}
