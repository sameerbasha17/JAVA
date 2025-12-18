public class CarriageReturn 
{
    public static void main(String [] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Loading: " + i);
        }
        System.out.print("\n\n");
        for(int i = 1; i <= 100; i++)
        {
            System.out.print("\rLoading: " + i);
            
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
            }
        }
    }
}
