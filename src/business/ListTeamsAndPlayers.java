package business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gruppe 3
 */

//Exercise C

public class ListTeamsAndPlayers {

    public static void ListTeamsAndPlayers() {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }

        String url = "jdbc:postgresql://baasu.db.elephantsql.com:5432/fcshwhrh";
        String username = "fcshwhrh";
        String password = "-sV1CsXjIa1RYzk7Z6yUxEgsdohJiLoa";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();

            ResultSet rs1 = st.executeQuery("Select count (email) (Select distinct tname, email from team) Where tname = 'N1 --> Nx'");


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