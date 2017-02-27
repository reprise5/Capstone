package PuzzPak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author reprise
 */
public class databaseConnect {
    String host = "jdbc:derby://localhost:1527/dbname"; 
    String userID = "user";
    String password = "pass";
    
    
    //Main Constructor
    public databaseConnect(String userID, String password, String host){
        this.userID = userID;
        this.password = password;
        this.host = host;
    } 
    public boolean connect(){
        System.out.println(userID + " " + password + " " + host);
        try {
            Connection con = DriverManager.getConnection(host, userID, password);
            return true;
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            return false;
        }
    }
    
    //A game calls this to add user's name to the leaderboard database
    public void addScore(String game, String user, double score){

        //TEST POST:
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            //stmt.executeUpdate("INSERT INTO HANGMANALLTIME VALUES ('Reprise', 90.0, '2016-03-09')");
            //stmt.executeUpdate("DELETE FROM HANGMANALLTIME WHERE USERNAME = 'Reprise'");
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
        }
    }
}


