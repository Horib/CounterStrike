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

        String url = "jdbc:postgresql://baasu.db.elephantsql.com:5432/rkdueovd";
        String username = "rkdueovd";
        String password = "SvqYboQsD6JGUT4oNtc3SpCLqTencJJj";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select * from Players");
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}