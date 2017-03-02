package PuzzPak;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 * @author reprise
 */
public class DatabaseControl {
    String host = "jdbc:derby://localhost:1527/dbname"; 
    String userID = "user";
    String password = "pass";
    Date tempdate = new Date();
    String date= new SimpleDateFormat("yyyy-MM-dd").format(tempdate);
    
    
    //Main Constructor
    public DatabaseControl(String userID, String password, String host){
        this.userID = userID;
        this.password = password;
        this.host = host;
    } 
    
    // Try a connection.
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
    public boolean addScore(String user, double score, String game){
        boolean success = false;
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            switch (game) {
                case "hangman":
                    stmt.executeUpdate("INSERT INTO HANGMANALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'hangman')");
                    System.out.println("INSERT INTO HANGMANALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'hangman')");
                    success = true;
                    break;
                case "tiktak":
                    stmt.executeUpdate("INSERT INTO TIKTAKALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'tiktak')");
                    System.out.println("INSERT INTO TIKTAKALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'tiktak')");
                    success = true;
                    break;
                case "mg4x4":
                    stmt.executeUpdate("INSERT INTO MEMORYT4X4ALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'mg4x4')");
                    System.out.println("INSERT INTO MEMORYT4X4ALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'mg4x4')");
                    success = true;
                    break;
                case "mg6x6":
                    stmt.executeUpdate("INSERT INTO MEMORYT6X6ALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'mg6x6')");
                    System.out.println("INSERT INTO MEMORYT6X6ALLTIME VALUES ('" + user + "', " + score + ", '" + date +"', 'mg6x6')");
                    success = true;
                    break;
                default:
                    success = false;
                    break;
            }
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
        }
        return success;
    }
    
    public String addRecord(String table, String user, double score, String game){
        String message = "";
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')");
            System.out.println("INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')");
            message = "SQL query:\"INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')\" was successful";
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            message = err.getMessage();
        }
        return message;
    }
        
    public String deleteRecord(String table, String attribute, String user){
        String message = "";
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("DELETE FROM " + table + " WHERE " + attribute + " = '" + user + "'");
            System.out.println("DELETE FROM " + table + " WHERE " + attribute + " = '" + user + "'");
            message = "SQL query:\"DELETE FROM " + table + " WHERE " + attribute + " = '" + user + "'\" was successful.";
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            message = err.getMessage();
        }
        return message;
    }
    public boolean removeDuplicateTuples(){
    
        return true;
    }
}