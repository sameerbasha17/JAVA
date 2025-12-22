public class Series 
{
    public static void main(String [] args)
    {
        int n = 1;
        double sum=0;
        while((1.0/n) >= 0.001)
        {
            sum = sum + (1.0/n);
            n++;
        }
        System.out.println("Sum : " + sum);
    }
}
