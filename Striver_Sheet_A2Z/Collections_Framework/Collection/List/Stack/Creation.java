// Stack Creation
import java.util.Stack;
public class Creation 
{
    public static void main(String [] args)
    {
        Stack<Integer> s = new Stack<>();
        System.out.println(s); // stack elements printed.  []
        System.out.println("Is stack is empty ? " + s.isEmpty());    // true
        System.out.println(s.size());       // 0
        System.out.println(s.capacity());   // 10
    }    

    
}
