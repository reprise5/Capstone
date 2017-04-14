package PuzzPak;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 * @author Dani Marcoullier (reprise)
 * 2017
 */
public class LeaderboardForm extends javax.swing.JFrame {

    public LeaderboardForm() {
        initComponents();
    }
    
    //populates leaderboardform's jTables with results from the database.  Will populate every time the form is called.
    public void populate(){
        try {
            Connection con = DriverManager.getConnection(database.getDBhost(), database.getDBusername(), database.getDBpassword());
            Statement stmt = con.createStatement();
            
//            PRINT OUT HANGMANALLTIME RESULTSET TO CONSOLE.

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

            //Clear ALL tables before refreshing, preventing duplicates.
            try{
                //hangman all-time                                              ----all-time's
                rowNo = hangmanModel.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        hangmanModel.removeRow(i);
                    }
                }
                //tiktak all-time
                rowNo = tiktakModel.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        tiktakModel.removeRow(i);
                    }
                }
                //memorytiles 4x4 all-time
                rowNo = mt4x4Model.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        mt4x4Model.removeRow(i);
                    }
                }
                //memorytiles 6x6 all-time
                rowNo = mt6x6Model.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        mt6x6Model.removeRow(i);
                    }
                }
                
                //hangman top-10                                                ----top-1o's
                rowNo = hangman10Model.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        hangman10Model.removeRow(i);
                    }
                }
                //tiktak top-10
                rowNo = tiktak10Model.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        tiktak10Model.removeRow(i);
                    }
                }
                //memorytiles 4x4 top-10
                rowNo = mt4x410Model.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        mt4x410Model.removeRow(i);
                    }
                }
                //memorytiles 4x4 top-10
                rowNo = mt6x610Model.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        mt6x610Model.removeRow(i);
                    }
                }
                
                //player table
                rowNo = playersModel.getRowCount();
                if (rowNo > 0){
                    for (int i = rowNo - 1; i >= 0; i--) {
                        playersModel.removeRow(i);
                    }
                }
            }
            catch (Exception e){
                System.out.println("Already empty");     
            }                                                                
            
            //U P D A T E   H A N G M A N   A L L T I M E   J T A B L E         ----All-Time Tables
            String[] tableColumnsName = {"Username","Score","Date","Game"}; 
            hangmanModel = (DefaultTableModel) hangmanAlltimeTable.getModel();
            hangmanModel.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM HANGMANALLTIME ORDER BY SCORE DESC, DATE");

            rsmd = rs.getMetaData();
            
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                hangmanModel.addRow(records);
            }
            hangmanAlltimeTable.setModel(hangmanModel);
            
            //U P D A T E   T I K - T A K   A L L T I M E   J T A B L E
            tiktakModel = (DefaultTableModel) tiktakAlltimeTable.getModel();
            tiktakModel.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM TIKTAKALLTIME ORDER BY SCORE DESC, DATE");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                tiktakModel.addRow(records);
            }
            tiktakAlltimeTable.setModel(tiktakModel);
            
            //U P D A T E   M E M O R Y 4   A L L T I M E   J T A B L E
            mt4x4Model = (DefaultTableModel) MT4x4AlltimeTable.getModel();
            mt4x4Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM MEMORYT4X4ALLTIME ORDER BY SCORE DESC, DATE");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                mt4x4Model.addRow(records);
            }
            MT4x4AlltimeTable.setModel(mt4x4Model);
                        
            //U P D A T E   M E M O R Y 6  A L L T I M E   J T A B L E
            mt6x6Model = (DefaultTableModel) MT6x6AlltimeTable.getModel();
            mt6x6Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM MEMORYT6X6ALLTIME ORDER BY SCORE DESC, DATE");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                mt6x6Model.addRow(records);
            }
            MT6x6AlltimeTable.setModel(mt6x6Model);
            
            //U P D A T E   P L A Y E R S   J T A B L E
            String [] playerColumnsName = {"Username","Hangman","Tik-Tak","MemoryTiles 4x4","MemoryTiles 6x6"};
            playersModel = (DefaultTableModel) playersTable.getModel();
            playersModel.setColumnIdentifiers(playerColumnsName);

            rs = stmt.executeQuery("SELECT * FROM PLAYER ORDER BY USERNAME");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                playersModel.addRow(records);
            }
            playersTable.setModel(playersModel);
        
            //U P D A T E   H A N G M A N - 1 0   J T A B L E                   ----Top-10 Tables
            hangman10Model = (DefaultTableModel) hangmanTop10Table.getModel();
            hangman10Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM HANGMANALLTIME "
                    + "ORDER BY SCORE DESC, DATE "
                    + "FETCH FIRST 10 ROWS ONLY");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                hangman10Model.addRow(records);
            }
            hangmanTop10Table.setModel(hangman10Model);
            
            //U P D A T E   T I K T A K - 1 0   J T A B L E
            tiktak10Model = (DefaultTableModel) tiktakTop10Table.getModel();
            tiktak10Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM TIKTAKALLTIME "
                    + "ORDER BY SCORE DESC, DATE "
                    + "FETCH FIRST 10 ROWS ONLY");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                tiktak10Model.addRow(records);
            }
            tiktakTop10Table.setModel(tiktak10Model);
            
            //U P D A T E   M E M O R Y 4 x 4 - 1 0   J T A B L E
            mt4x410Model = (DefaultTableModel) MT4x4Top10Table.getModel();
            mt4x410Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM MEMORYT4X4ALLTIME "
                    + "ORDER BY SCORE DESC, DATE "
                    + "FETCH FIRST 10 ROWS ONLY");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                    
                }
                mt4x410Model.addRow(records);
            }
            MT4x4Top10Table.setModel(mt4x410Model);
                        
            //U P D A T E   M E M O R Y 6 x 6 - 1 0   J T A B L E
            mt6x610Model = (DefaultTableModel) MT6x6Top10Table.getModel();
            mt6x610Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM MEMORYT6X6ALLTIME "
                    + "ORDER BY SCORE DESC, DATE "
                    + "FETCH FIRST 10 ROWS ONLY");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                    
                }
                mt6x610Model.addRow(records);
            }
            MT6x6Top10Table.setModel(mt6x610Model);
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leaderboardTabbedPane = new javax.swing.JTabbedPane();
        hangmanATScrollPane = new javax.swing.JScrollPane();
        hangmanAlltimeTable = new javax.swing.JTable();
        tiktakATScrollPane = new javax.swing.JScrollPane();
        tiktakAlltimeTable = new javax.swing.JTable();
        mt4x4ATScrollPane = new javax.swing.JScrollPane();
        MT4x4AlltimeTable = new javax.swing.JTable();
        mt6x6ATScrollPane = new javax.swing.JScrollPane();
        MT6x6AlltimeTable = new javax.swing.JTable();
        hangman10ScrollPane = new javax.swing.JScrollPane();
        hangmanTop10Table = new javax.swing.JTable();
        tiktak10ScrollPane = new javax.swing.JScrollPane();
        tiktakTop10Table = new javax.swing.JTable();
        mt4x410ScrollPane = new javax.swing.JScrollPane();
        MT4x4Top10Table = new javax.swing.JTable();
        mt6x610ScrollPane = new javax.swing.JScrollPane();
        MT6x6Top10Table = new javax.swing.JTable();
        playersScrollPane = new javax.swing.JScrollPane();
        playersTable = new javax.swing.JTable();
        LeaderboardsBannerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Leaderboards");
        setBackground(new java.awt.Color(0, 162, 232));
        setIconImage(Toolkit.getDefaultToolkit().getImage(JFrame.class.getResource("/PuzzPak/images/icons/icon.png")));

        hangmanAlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hangmanAlltimeTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        hangmanATScrollPane.setViewportView(hangmanAlltimeTable);

        leaderboardTabbedPane.addTab("Hangman (All-Time)", hangmanATScrollPane);

        tiktakAlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tiktakATScrollPane.setViewportView(tiktakAlltimeTable);

        leaderboardTabbedPane.addTab("Tik-Tak (All-Time)", tiktakATScrollPane);

        MT4x4AlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mt4x4ATScrollPane.setViewportView(MT4x4AlltimeTable);

        leaderboardTabbedPane.addTab("MemoryTiles 4x4 (All-Time)", mt4x4ATScrollPane);

        MT6x6AlltimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mt6x6ATScrollPane.setViewportView(MT6x6AlltimeTable);

        leaderboardTabbedPane.addTab("MemoryTIles 6x6 (All-Time)", mt6x6ATScrollPane);

        hangmanTop10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ));
        hangman10ScrollPane.setViewportView(hangmanTop10Table);

        leaderboardTabbedPane.addTab("Hangman (Top-10)", hangman10ScrollPane);

        tiktakTop10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ));
        tiktak10ScrollPane.setViewportView(tiktakTop10Table);

        leaderboardTabbedPane.addTab("Tik-Tak (Top-10)", tiktak10ScrollPane);

        MT4x4Top10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date", "Game"
            }
        ));
        mt4x410ScrollPane.setViewportView(MT4x4Top10Table);

        leaderboardTabbedPane.addTab("MemoryTiles 4x4 (Top-10)", mt4x410ScrollPane);

        MT6x6Top10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mt6x610ScrollPane.setViewportView(MT6x6Top10Table);

        leaderboardTabbedPane.addTab("MemoryTIles 6x6 (Top-10)", mt6x610ScrollPane);

        playersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Hangman", "Tik-Tak", "MemoryTiles 4x4", "MemotyTiles 6x6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playersScrollPane.setViewportView(playersTable);

        leaderboardTabbedPane.addTab("Players", playersScrollPane);

        LeaderboardsBannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/leaderboardBanner.png"))); // NOI18N
        LeaderboardsBannerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaderboardBannermouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeaderboardsBannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leaderboardTabbedPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeaderboardsBannerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leaderboardTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //clicking the banner will refresh the leaderboards.
    private void leaderboardBannermouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboardBannermouseClicked
        System.out.println("REFRESHED");
        //Populate is designed to be run multiple times.  It will clear all tables and
        //re-populate if called a second time.
        populate();
    }//GEN-LAST:event_leaderboardBannermouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LeaderboardsBannerLabel;
    private javax.swing.JTable MT4x4AlltimeTable;
    private javax.swing.JTable MT4x4Top10Table;
    private javax.swing.JTable MT6x6AlltimeTable;
    private javax.swing.JTable MT6x6Top10Table;
    private javax.swing.JScrollPane hangman10ScrollPane;
    private javax.swing.JScrollPane hangmanATScrollPane;
    private javax.swing.JTable hangmanAlltimeTable;
    private javax.swing.JTable hangmanTop10Table;
    private javax.swing.JTabbedPane leaderboardTabbedPane;
    private javax.swing.JScrollPane mt4x410ScrollPane;
    private javax.swing.JScrollPane mt4x4ATScrollPane;
    private javax.swing.JScrollPane mt6x610ScrollPane;
    private javax.swing.JScrollPane mt6x6ATScrollPane;
    private javax.swing.JScrollPane playersScrollPane;
    private javax.swing.JTable playersTable;
    private javax.swing.JScrollPane tiktak10ScrollPane;
    private javax.swing.JScrollPane tiktakATScrollPane;
    private javax.swing.JTable tiktakAlltimeTable;
    private javax.swing.JTable tiktakTop10Table;
    // End of variables declaration//GEN-END:variables

    DatabaseControl database = new DatabaseControl("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    boolean connSuccess;
    
    ResultSetMetaData rsmd;
    ResultSet rs;
    int columnsNumber;
    int colNo, rowNo;
    DefaultTableModel hangmanModel, hangman10Model;
    DefaultTableModel tiktakModel, tiktak10Model;
    DefaultTableModel mt4x4Model, mt4x410Model;
    DefaultTableModel mt6x6Model, mt6x610Model;
    DefaultTableModel playersModel;
}
