package PuzzPak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 * @author reprise
 */
public class LeaderboardForm extends javax.swing.JFrame {

    public LeaderboardForm(String userID, String password, String host) {
        this.userID = userID;
        this.password = password;
        this.host = host;
        initComponents();
    }
    
    public void populate(String userID, String password, String host){
        try {
            Connection con = DriverManager.getConnection(host, userID, password);
            System.out.println("Connection is OK!");
            Statement stmt = con.createStatement();
            //stmt.executeUpdate("INSERT INTO HANGMANALLTIME VALUES ('Reprise', 90.0, '2017-02-24', 'hangman')");
            //stmt.executeUpdate("INSERT INTO HANGMANALLTIME VALUES ('Tetra', 53.0, '2017-02-25', 'hangman')");
            //stmt.executeUpdate("DELETE FROM HANGMANALLTIME WHERE USERNAME = 'Reprise'");
            //stmt.executeUpdate("DELETE FROM HANGMANALLTIME WHERE USERNAME = 'Tetra'");
            
            //PRINT OUT HANGMANALLTIME RESULTSET TO CONSOLE.
//            ResultSet rs = stmt.executeQuery("SELECT * FROM HANGMANALLTIME");
//            rsmd = rs.getMetaData();
//            columnsNumber = rsmd.getColumnCount();
//            while (rs.next()) {
//                for (int i = 1; i <= columnsNumber; i++) {
//                    //if (i > 1) System.out.print(",  ");
//                    String columnValue = rs.getString(i);
//                    System.out.print(columnValue + " " ); // + rsmd.getColumnName(i)
//                }
//                System.out.println("");
//            }
            try{
                rowNo = model.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        model.removeRow(i);
                    }
                }
            }
            catch (Exception e){
                System.out.println("Already empty");     
            }
            
            //H A N G M A N   S H O W I N G ~ ~ ~ ~
            // TableModel definition
            String[] tableColumnsName = {"Username","Score","Date","Game"}; 
            model = (DefaultTableModel) hangmanAlltimeTable.getModel();
            model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM HANGMANALLTIME ORDER BY SCORE DESC");

            // Loop through the ResultSet and transfer in the Model
            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                model.addRow(records);
            }
            hangmanAlltimeTable.setModel(model);
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leaderboardTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        hangmanAlltimeTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tiktakAlltimeTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        MT4x4AlltimeTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        MT6x6AlltimeTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        hangmanTop10Table = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tiktakTop10Table = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        MT4x4Top10Table = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        MT6x6Top10Table = new javax.swing.JTable();
        leaderboardBanner = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("<><>Leaderboards<><>");

        hangmanAlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ));
        hangmanAlltimeTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jScrollPane1.setViewportView(hangmanAlltimeTable);

        leaderboardTabbedPane.addTab("Hangman (All-Time)", jScrollPane1);

        tiktakAlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ));
        jScrollPane2.setViewportView(tiktakAlltimeTable);

        leaderboardTabbedPane.addTab("Tik-Tak (All-Time)", jScrollPane2);

        MT4x4AlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(MT4x4AlltimeTable);

        leaderboardTabbedPane.addTab("MemoryTiles 4x4 (All-Time)", jScrollPane3);

        MT6x6AlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(MT6x6AlltimeTable);

        leaderboardTabbedPane.addTab("MemoryTIles 6x6 (All-Time)", jScrollPane4);

        hangmanTop10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ));
        jScrollPane5.setViewportView(hangmanTop10Table);

        leaderboardTabbedPane.addTab("Hangman (Top-10)", jScrollPane5);

        tiktakTop10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Score", "Date", "Game"
            }
        ));
        jScrollPane6.setViewportView(tiktakTop10Table);

        leaderboardTabbedPane.addTab("Tik-Tak (Top-10)", jScrollPane6);

        MT4x4Top10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(MT4x4Top10Table);

        leaderboardTabbedPane.addTab("MemoryTiles 4x4 (Top-10)", jScrollPane7);

        MT6x6Top10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(MT6x6Top10Table);

        leaderboardTabbedPane.addTab("MemoryTIles 6x6 (Top-10)", jScrollPane8);

        leaderboardBanner.setPreferredSize(new java.awt.Dimension(40, 20));
        leaderboardBanner.setText("label1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaderboardTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addComponent(leaderboardBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leaderboardBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leaderboardTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MT4x4AlltimeTable;
    private javax.swing.JTable MT4x4Top10Table;
    private javax.swing.JTable MT6x6AlltimeTable;
    private javax.swing.JTable MT6x6Top10Table;
    private javax.swing.JTable hangmanAlltimeTable;
    private javax.swing.JTable hangmanTop10Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private java.awt.Label leaderboardBanner;
    private javax.swing.JTabbedPane leaderboardTabbedPane;
    private javax.swing.JTable tiktakAlltimeTable;
    private javax.swing.JTable tiktakTop10Table;
    // End of variables declaration//GEN-END:variables

    databaseConnect database = new databaseConnect("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    boolean connSuccess;
    String host = "jdbc:derby://localhost:1527/dbname"; 
    String userID = "user";
    String password = "pass";
    
    ResultSetMetaData rsmd;
    int columnsNumber;
    int colNo, rowNo;
    DefaultTableModel model;
    ResultSet rs;
    
//    DefaultTableModel hangmanAlltimeModel   = (DefaultTableModel) hangmanAlltimeTable.getModel();
//    DefaultTableModel hangmanTop10Model     = (DefaultTableModel) hangmanTop10Table.getModel();

}
