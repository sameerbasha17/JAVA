import java.util.LinkedList;

public class Search 
{
    public static void main(String[] args) 
    {
        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.add("Friend ONE");
        linkedList.add("Friend Two");
        linkedList.add("Friend Three");
        linkedList.add("Friend Four");
        linkedList.add("Friend Five");
        linkedList.add("Friend Six");

        System.out.println(linkedList.contains("Friend ONE"));   // true

        System.out.println(linkedList.contains("Friend Seven"));  // false
    }    
}
