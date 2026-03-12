// TASK : Using variable arguments find the sum of passed arguments.
package JAVA.Methods.Student_Challenge;
public class VASum 
{
    public static void main(String ...a)
    {
        System.out.println(sum(4,3,3,6,7,2,1));  // 26
        System.out.println(sum(2,2));  // 4
        System.out.println(sum());  // 0
    }    

    static int sum(int ...a)
    {
        int sum = 0;
        for(int element : a)
        {
            sum += element;
        }
        return sum;
    }
}
