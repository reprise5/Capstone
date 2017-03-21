package PuzzPak;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
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
    
    //Adding a record to a table in the database 
    public String addRecord(String table, String user, double score, String game){
        String message = "";
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')");
            System.out.println("INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')");
            message = "SQL query: \"INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')\" was successful";
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            message = err.getMessage();
        }
        return message;
    }
    
    //Deleting record(s) from a table in the database    
    public String deleteRecord(String table, String attributeType, String attribute, int attrCode){
        String message = "";
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            //AttributeCode == 0 means attributeType is followed by a String or item between ' quotes.
            if (attrCode == 0){
                stmt.executeUpdate("DELETE FROM " + table + " WHERE " + attributeType + " = '" + attribute + "'");
                System.out.println("DELETE FROM " + table + " WHERE " + attributeType + " = '" + attribute + "'");
                message = "SQL query: \"DELETE FROM " + table + " WHERE " + attributeType + " = '" + attribute + "'\" was successful.";
            }
            
            //AtttributeCode == 1 means attributeType is followed by a numeric attribute.
            else if (attrCode == 1){
                int intAttribute = Integer.parseInt(attribute);
                
                stmt.executeUpdate("DELETE FROM " + table + " WHERE " + attributeType + " = " + intAttribute);
                System.out.println("DELETE FROM " + table + " WHERE " + attributeType + " = " + intAttribute);
                message = "SQL query: \"DELETE FROM " + table + " WHERE " + attributeType + " = " + intAttribute + "\" was successful.";
            
            }
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            message = err.getMessage();
        }
        return message;
    }
    
    //will update player's score in the player's table for a gertain game.  Only saves the player's top score for a game.
    public boolean updatePlayerAccount(String player, double score, String game){
        String columnValue;
        boolean success = false;
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            //if game == hangman,
            System.out.println("UPDATE PLAYER SET HANGMAN = 100 WHERE USERNAME = '" +player + "'");
            stmt.executeUpdate("UPDATE PLAYER SET HANGMAN = 100 WHERE USERNAME = '" +player + "'");

        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            success = false;
        }
        return success;
    }
    
    //wipes the table passed.  pass '*' for all.
    public boolean wipeTable(String table){
        boolean succ = false;
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();

            stmt.executeUpdate("DELETE FROM " + table);
            succ = true;
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            succ = false;
        }
        return succ;  
    }
    
    //Executing a freehand SQL query.
    public String executeQuery(String query){
        String message = "";
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate(query);
            System.out.println("SQL Query entered: " + query);
            message = "SQL query: \"" + query + "\" was successful";
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
            message = err.getMessage();
        }
        
        return message;
    }
    
    //Set new database Hostname
    public void setDBhost(String host){
        if (host != null)
            this.host = host;
    }
    
    //Set new database Username
    public void setDBusername(String userID){
        if (userID != null)
            this.userID = userID;
    }
    
    //Set new database Password
    public void setDBpassword(String password){
        if (password != null)
            this.password = password;
    }
    
    //Get current database Hostname
    public String getDBhost(){
        return host;
    }
    
    //Get current database Username
    public String getDBusername(){
        return userID;
    }
    
    //Get current database Password
    public String getDBpassword(){
        return password;
    }
}