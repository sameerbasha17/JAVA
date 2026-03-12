// TASK : Find the discount using Variable arguments.
package JAVA.Methods.Student_Challenge;
public class VADiscount 
{
    public static void main(String [] args)
    {
        System.out.println(discount(543.4,354,3,342));
        System.out.println(discount(3,323,34.2));
        System.out.println(discount(3,432,44,3,244));
        System.out.println(discount());
    }

    static double discount(double ...x)
    {
        int sum = 0;
        for(int i = 0; i < x.length; i++)
        {
            sum += x[i];
        }

        if(sum < 500) return sum * 0.10; //10 percent discount
        else if(sum >= 500 && sum < 1000) return sum * 0.15; // 15 % discount 
        else return sum * 0.20; // 20 % if total sum exceeds 999
        
    }
}
