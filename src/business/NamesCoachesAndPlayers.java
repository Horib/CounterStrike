package business;
import java.sql.*;
public class NamesCoachesAndPlayers {

    /**
     *
     * @author gruppe 3
     */

    //Exercise A

public static void NamesCoachesAndPlayers(){
        
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
            
            ResultSet rs1 = st.executeQuery("select distinct tname, cname, pname from team, players, coaches where team.email = players.email ");
            
            
            
           
            while (rs1.next()) {
                
                System.out.print(rs1.getString(1) + " (Team) //");
                System.out.print(rs1.getString(2) + " (Coach) //");
                System.out.print(rs1.getString(3) + " (Player) \n");
            

            }
            rs1.close();
            db.close();
            st.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        }
        
    }
    


