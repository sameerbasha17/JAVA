// Pop Operation : Deletion of peek element.
import java.util.Stack;
public class Pop 
{
    public static void main(String [] args)
    {
        Stack <String> s  = new Stack<>();

        for(int i = 0; i < 5; i++)
        {
            s.push(String.valueOf((char)('A'+ i)));
        }

        System.out.println(s);  // [A, B, C, D, E]

        System.out.println(s.pop());  // E
        System.out.println(s);  // [A, B, C, D]

        s.pop();
        s.pop();
        s.pop();
        System.out.println("Is stack is empty ? : " + s.isEmpty());   // false
        s.pop();
        System.out.println("Is stack is empty ? : " + s.isEmpty());   // true
    }    
}
