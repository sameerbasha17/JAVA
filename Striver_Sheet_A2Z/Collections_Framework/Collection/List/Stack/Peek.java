// Peek Operation : Used to see the top element/ recently pushed element.
import java.util.Stack;

public class Peek 
{
    public static void main(String ...args)
    {
        Stack <String> s = new Stack<>();

        s.add("Red brick");
        s.add("Yellow brick");
        s.add("White brick");
        s.add("Pink brick");

        System.out.println(s);   // [Red brick, Yellow brick, White brick, Pink brick]

        System.out.println(s.peek());   // Pink brick
        s.pop();
        s.pop();

        System.out.println(s);  // [Red brick, Yellow brick]
        
        System.out.println(s.peek());   // Yellow brick
    }    
}
