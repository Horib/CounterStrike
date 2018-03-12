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

        // Remove comments for the exercise you want to run.

        //System.out.println("All player and coaches: ");
        //NamesCoachesAndPlayers.playerAndCoachNames();
        //todo add into excercise a and add team neame to the list

        //Exercise A
        //System.out.println("\nList of all names of coaches and the team they belong to:");
        //System.out.println("Not done yet...");
        //todo not done yet

        //Exercise B
        //System.out.println("\nWinning players and coaches: ");
        //WinningPlayersAndCoaches.WinsPlayersAndCoaches();

        //Exercise C
        //System.out.println("\nList of all names of teams and the number of players on that team:");
        //ListTeamsAndPlayers.ListTeamsAndPlayers();
        //todo needs the proper syntax

        //Exercise D
        System.out.println("\nList of all tournaments with at least x Teams attending:");
        ListLimiter.ListLimiter();

    }

}
