// Variable Arguments when string

public class VAName 
{
    public static void main(String [] args)
    {
        show("Vishnu", "Tharun", "Jithu");    // Output : Vishnu Tharun Jithu

        show(1,"V","A","P","T","J");
    }

    static void show(String ...x)
    {
        for(String ele : x)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void show(int start, String ...S)
    {
        for(String name : S)
        {    
            System.out.println(start + ". " + name);
            start++;
        }
    }
    
}
/*
Output :
=========
Vishnu Tharun Jithu 
1. V
2. A
3. P
4. T
5. J

*/