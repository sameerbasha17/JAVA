// Search Operation : Number of element from top to bottom.
import java.util.Stack;

public class Search 
{

    
    public static void main(String [] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println(s.search(2));  // 3
    }    
}

