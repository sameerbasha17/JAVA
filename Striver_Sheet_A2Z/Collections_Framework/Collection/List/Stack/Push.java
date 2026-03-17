// Push Operation : Inserting a element in the stack. similar to add operation in vector.
import java.util.Stack;


public class Push 
{
    public static void main(String [] args)
    {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);   // [1, 2, 3]

        System.out.println(s.push(4));  //
    }    
}
