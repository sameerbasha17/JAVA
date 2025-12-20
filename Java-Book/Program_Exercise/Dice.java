/* Task : A and B are two players, In each turn a player throw a die and the number of dots(one of six faces) outcome will be the score
of that player. If the game consists of two turns. Use random method in Math class of java.lang package to generate random number and calculate
who win the game. */

public class Dice 
{
    public static void main(String [] args)
    {
        System.out.println("The Game begins ...");

        int aTotalScore = 0;
        int bTotalScore = 0;
        int gameNumber = 1;
        for (int i = 1; i < 3 ; i++)
        {
            System.out.printf("\nTurn : %d\n", gameNumber);
            
            System.out.printf("A throws dice.\n");
            int aScore = (int)((Math.random() * 10) % 6 + 1);
            System.out.println("Score : " + aScore);
            aTotalScore += aScore;

            System.out.println("B throws dice.");
            int bScore = (int)((Math.random() * 100) % 6 + 1);
            System.out.printf("Score : %d\n",bScore);
            bTotalScore += bScore;

            gameNumber++;

            if(i == 2)
            {
                if(aTotalScore == bTotalScore)
                {   
                    System.out.printf("A Score : %d and B Score : %d\n",aTotalScore,bTotalScore);
                    System.out.print("        Draw.         ");
                    return;
                }
                boolean result = aTotalScore > bTotalScore;
                if(result)
                    System.out.printf("A wins with score : %d over player B's %d points.\n",aTotalScore,bTotalScore);
                else
                    System.out.println("B wins with score : " + bTotalScore + " over player A's " + aTotalScore + " points.");
            }

            
        }
        System.out.println();
    }
}
