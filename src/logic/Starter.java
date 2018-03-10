package logic;

import business.ListLimiter;
import business.ListTeamsAndPlayers;
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
        //todo add into excercise a and add team neame to the list

        //Exercise a
        System.out.println("\nList of all names of coaches and the team they belong to:");
        System.out.println("Not done yet...");
        //todo not done yet

        //Exercise b
        System.out.println("\nWinning players and coaches: ");
        WinningPlayersAndCoaches.WinsPlayersAndCoaches();

        //Excercise c
        System.out.println("\nList of all names of teams and the number of players on that team:");
        ListTeamsAndPlayers.ListTeamsAndPlayers();
        //todo needs the proper syntax

        //Exercise d
        System.out.println("\nList of all tournaments with at least x Teams attending:");
        ListLimiter.ListLimiter();
        //todo needs the proper syntax syntax
    }

}
