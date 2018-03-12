package business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author gruppe 3
 */

//Exercise D

public class ListLimiter {

    public static void ListLimiter() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an Int:");
        int listLimeter = scanner.nextInt();


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

            ResultSet rs1 = st.executeQuery("SELECT tournement.participants FROM tournement GROUP BY tournement.participants HAVING COUNT (tournement.participants) >= " + listLimeter + ";");

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


