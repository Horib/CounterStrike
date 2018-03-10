package logic;

import business.NamesCoachesAndPlayers;
import business.WinningPlayersAndCoaches;


/*
	Run with:
	java -cp postgresql-42.2.1.jar:. DBTest
 */
public class Starter {

    public static void main(String[] args) {
        System.out.println("All player and coaches: ");
        NamesCoachesAndPlayers.playerAndCoachNames();

        System.out.println("\nWinning players and coaches: ");
        WinningPlayersAndCoaches.WinsPlayersAndCoaches();

    }

}
