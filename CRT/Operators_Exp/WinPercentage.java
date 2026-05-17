/* 5. Winning Percentage of a Team
===================================
Concept: Win% = (Wins + 0.5 × Draws) / Total Matches × 100. The 0.5 factor gives half-credit for
draws.
*/
import java.util.Scanner;
public class WinPercentage 
{
    public static void main(String[] args)
    {
        System.out.println("Program: Find Winning Percentage of a team.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of wins : ");
        int wins = sc.nextInt();
        System.out.print("Enter number of draws : ");
        int draws = sc.nextInt();
        System.out.print("Enter number of loses : ");
        int loses = sc.nextInt();

        int totalMatches = wins + draws + loses;

        double winPer = ((wins + draws * 0.5) * 100) / (totalMatches);

        System.out.printf("Winning Percentage : %.2f",winPer);

        sc.close();

    }    
}

/*
Output : 
========
Program: Find Winning Percentage of a team.
Enter number of wins : 9
Enter number of draws : 2
Enter number of loses : 7
Winning Percentage : 55.56
*/