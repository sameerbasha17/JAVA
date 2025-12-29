import java.util.Scanner;
public class Test03 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("i = ");
        int i = sc.nextInt();
        if(50 <= i)
        {
            System.out.println("i is greater than 50");
        }
        else{
            System.out.println("i is less than 50");
        }
    }
}
