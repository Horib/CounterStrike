package business;

import java.sql.*;

/**
 *
 * @author gruppe 3
 */

//Exercise B

public class WinningPlayersAndCoaches {

    public static void WinsPlayersAndCoaches() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }

        String url = "jdbc:postgresql://baasu.db.elephantsql.com:5432/fcshwhrh";
        String username = "fcshwhrh";
        String password = "-sV1CsXjIa1RYzk7Z6yUxEgsdohJiLoa";
        //System.out.println("playerName\t\tNickName\tEmail\tTeamName\tCountry\tCoach\tTourName\tyear\tPrize\tParticipatingTeams\tWinner");

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();

            //ResultSet rs1 = st.executeQuery("select distinct team.email from team inner join tournement on team.tname = tournement.winner");
            ResultSet rs1 = st.executeQuery("Declare @Myvar varchar(200)SET @Myvar distinct team.email from team inner join tournement on team.tname = tournement.winner; Select players.names, coaches.names \n" +
                    "From ((@Myvar inner join coaches on coaches.email = @Myvar) Inner join players on players.email = @Myvar);");

            while (rs1.next()) {

                //System.out.print(rs1.getString(1) + "//");
                //System.out.print(rs1.getString(2) + "//");
                System.out.print(rs1.getString(1) + "\n");


            }
            rs1.close();
            db.close();
            st.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
