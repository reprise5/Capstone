/**
 * This class is the bridge between a game (or anything else) and the database.
 * It has many functions, including adding users, testing connection, setting 
 * parameters for a new connection, updating, adding, and deleting records in 
 * batch or stand-alone.
 */


package PuzzPak;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 * @author Dani Marcoullier (reprise)
 * 2017
 */
public class DatabaseControl {
    String host = "jdbc:derby://localhost:1527/dbname"; 
    String userID = "user";
    String password = "pass";
    Date tempdate = new Date();
    String date = new SimpleDateFormat("yyyy-MM-dd").format(tempdate);
    
    
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
    
    //A game calls this to add user's name to the leaderboard database (for all time scores)
    public boolean addScore(String user, double score, String game, String table){
        boolean success = false;
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            //first try to add a new record from the start.
            //if this Query fails it's probably because a record exists for that user. It will fall to catch, & try and update an existing record.
            //if THAT fails, then it's probably a constraint thing (name is too long, etc.)
            stmt.executeUpdate("INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')");
            System.out.println("INSERT INTO " + table + " VALUES ('" + user + "', " + score + ", '" + date +"', '" + game + "')");
            success = true;
        }
        //OK, so the record exists already.  Try and update current user's post on the ALLTIME board.  
        catch (SQLException err1) {
            try {
                Connection con = DriverManager.getConnection(host, userID, password);
                Statement stmt = con.createStatement();
                
                System.out.println("\nUPDATE " + table + "\n" +
                    "SET SCORE = " + score + ", DATE = '" + date + "'\n" +
                    "WHERE SCORE IN (\n" +
                    "    SELECT SCORE \n" +
                    "    FROM " + table + "\n" +
                    "    WHERE USERNAME = '" + user + "' AND SCORE < " + score + "\n" +
                    ")");
                                
                stmt.executeUpdate("\nUPDATE " + table + "\n" +
                    "SET SCORE = " + score + ", DATE = '" + date + "'\n" +
                    "WHERE SCORE IN (\n" +
                    "    SELECT SCORE \n" +
                    "    FROM " + table + "\n" +
                    "    WHERE USERNAME = '" + user + "' AND SCORE < " + score + "\n" +
                    ")");
                
                System.out.println("ADDSCORE: update query executed for " + user);
            }
            
            //second catch.  the backup try failed.
            catch (SQLException err2) {
                System.out.println(err2.getMessage() + "\nADD_SCORE: databaseControl.addScore(); -err2");
            }
            //print error from first catch
            //System.out.println("ADD_SCORE:" + err1.getMessage());
        }
        return success;
    }
    
    //Adding a record to a table in the database (called from adminform)
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
            System.out.println("ADD_RECORD:" + err.getMessage());
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
            System.out.println("DELETE_RECORD: " + err.getMessage());
            message = err.getMessage();
        }
        return message;
    }
    
    //Add a new player to the database when they log in.  if they're already here, leave it be.
    public boolean addNewAccount(String username){ 
        boolean success;
        
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();
            
            /* BUG :
             * if it is initialized with 0's, and this new user posted a new score, it would overwrite adjacent tuples 
             * though it doesn't match the "where" conditional in the query
             * if it is initialized with 1's, this somehow doesn't happen. 
             */
            stmt.executeUpdate("INSERT INTO PLAYER (USERNAME, HANGMAN, TIKTAK, MT4x4, MT6x6) VALUES ('" + username + "', 1.0 ,1.0 ,1.0 ,1.0 )");
            System.out.println("INSERT INTO PLAYER (USERNAME, HANGMAN, TIKTAK, MT4x4, MT6x6) VALUES ('" + username + "', 1.0 ,1.0 ,1.0 ,1.0 )");
            
            success = true;
        }
        catch(SQLException err){
            success = false;
            //System.out.println("PROFILES: " + err.getMessage());
            System.out.println("PROFILES: Account already exists");
        }
        return success;
    }
    
    //will update player's score in the player's table for a gertain game.  Only saves the player's top score for a game.
    public boolean updatePlayerAccount(String player, double score, String game){
        boolean success = false;
        try {
            Connection con = DriverManager.getConnection(host, userID, password );
            Statement stmt = con.createStatement();

            //Update player table.  Set the value in the attribute (the game name) equal to the new score if the score for 
            //the player in that game is greater than the score saved already.
            System.out.println("\nUPDATE PLAYER\n" +
                            "SET " + game + " = " + score + "\n" +
                            "WHERE " + game + " IN (\n" +
                            "    SELECT " + game + "\n" +
                            "    FROM PLAYER\n" +
                            "    WHERE USERNAME = '" + player + "' AND " + game + " < " + score + "\n" +
                            ")");
            stmt.executeUpdate("UPDATE PLAYER " +
                            "SET " + game + " = " + score +
                            "WHERE " + game + " IN (" +
                            "    SELECT " + game +
                            "    FROM PLAYER" +
                            "    WHERE USERNAME = '" + player + "' AND " + game + " < " + score + ")");
        }
        catch (SQLException err) {
            System.out.println("UPDATE_PLAYER: " + err.getMessage());
            success = false;
        }
        return success;
    }
    
    //wipes the table passed.
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