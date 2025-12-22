/*TASK : Write a game program in which a random number generated between 0 and 1000 is the cash inflow to the person playing the game. 
Two people play the game five times and the winner is the one whose total cash is maximum and the program displays the winner.
*/ 
public class RandomGame 
{
    public static void main(String [] args)
    {
        int aTotalMoney = 0, bTotalMoney = 0, gamenumber = 1;
        for(int i = 1; i <=5; i ++)
        {
            System.out.println("Game Number : " + gamenumber); // i taken gamenumber variable for understandability, we can take i also instead of gamenumber.
            System.out.print("A's turn : ");
            int aMoney = (int)(Math.random() * 1001);
            aTotalMoney += aMoney;
            System.out.print("$ " + aMoney +"\n");

            System.out.print("B's turn : ");
            int bMoney = (int)(Math.random() * 1001);
            bTotalMoney = bTotalMoney + bMoney;
            System.out.print("$ " + bMoney + "\n\n");
            gamenumber++;
        }

        if(aTotalMoney == bTotalMoney)
        {
            System.out.println("---------- Draw ------------ ");
            return;
        }
        if(aTotalMoney > bTotalMoney)
            System.out.println("A win the game has $ " +aTotalMoney+ " total cash inflow.");
        else
            System.out.println("B win the game has $ " + bTotalMoney + " total cash inflow.");

    }
}
