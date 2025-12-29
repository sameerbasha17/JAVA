import java.util.Scanner;
public class Test02 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        String str = String.valueOf(number);
        
        /*if(str.endsWith("[0|2|4|6|8]"))
        {
            System.out.printf("%d is even number.",number);
        }
        else{
            System.out.printf("%s is odd number.", str);
        }
        
        endsWith() do not support regular expression. keep in mind that matches(),split(),replaceAll() takes regular expressions
        */

        if(str.matches(".*[0|2|4|6|8]"))
        {
            System.out.printf("%d is even number.",number);
        }
        else{
            System.out.printf("%s is odd number.", str);
        }

        sc.close();
    }
}
