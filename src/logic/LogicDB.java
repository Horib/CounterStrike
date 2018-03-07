package logic;

import java.sql.*;

/*
	Run with:
	java -cp postgresql-42.2.1.jar:. DBTest
 */
public class LogicDB {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }

        String url = "jdbc:postgresql://baasu.db.elephantsql.com:5432/fcshwhrh";
        String username = "fcshwhrh";
        String password = "-sV1CsXjIa1RYzk7Z6yUxEgsdohJiLoa";
        System.out.println("playerName\t\tEmail\tNickName\tTeamName\tCountry\tCoach\tTourName\tyear\tPrize\tParticipatingTeams\tWinner");

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select * from players, team, tournement");
            while (rs.next()) {
                
                System.out.print(rs.getString(1) + " | ");
                System.out.print(rs.getString(2) + " | ");
                System.out.print(rs.getString(3) + " | ");
                System.out.print(rs.getString(4) + " | ");
                System.out.print(rs.getString(5) + " | ");
                System.out.print(rs.getString(6) + " | ");
                System.out.print(rs.getString(7) + " | ");
                System.out.print(rs.getString(8) + " | ");
                System.out.print(rs.getString(9) + " | ");
                System.out.print(rs.getString(10) + " | ");
                System.out.print(rs.getString(11) + " \n ");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
