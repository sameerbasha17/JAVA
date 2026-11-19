package JAVA.JavaDoc_Annotations;
import java.lang.annotation.*;

@Repeatable(MyRepeatables.class)
public @interface MyRepeatable
{
    String name();
    String version();
}
