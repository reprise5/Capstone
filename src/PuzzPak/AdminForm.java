package PuzzPak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author reprise
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        databaseTable = new javax.swing.JTable();
        queriesPanel = new javax.swing.JPanel();
        dumpHangmanButon = new javax.swing.JButton();
        DumpTIktakButton = new javax.swing.JButton();
        dumpMT4Button = new javax.swing.JButton();
        dumpMT6Button = new javax.swing.JButton();
        dumpAllButton = new javax.swing.JButton();
        deletefromLabel = new javax.swing.JLabel();
        insertintoLabel = new javax.swing.JLabel();
        attributeTextField = new javax.swing.JTextField();
        usernameTextfield = new javax.swing.JTextField();
        whereLabel1 = new javax.swing.JLabel();
        tablescombo1 = new javax.swing.JComboBox<>();
        tablesCombo2 = new javax.swing.JComboBox<>();
        atributeCombobox = new javax.swing.JComboBox<>();
        usernameLabel = new javax.swing.JLabel();
        scoreTextfield = new javax.swing.JTextField();
        scoreLabel = new javax.swing.JLabel();
        gameLabel = new javax.swing.JLabel();
        equalsLabel1 = new javax.swing.JLabel();
        gameCombobox = new javax.swing.JComboBox<>();
        syntaxLabel1 = new javax.swing.JLabel();
        syntaxLabel2 = new javax.swing.JLabel();
        syntaxLabel3 = new javax.swing.JLabel();
        syntaxLabel4 = new javax.swing.JLabel();
        executeDeleteFrom = new javax.swing.JButton();
        executeInsertInto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        adminConsole = new javax.swing.JTextField();
        consoleLabel = new javax.swing.JLabel();
        debugmodePanel = new javax.swing.JPanel();
        refreshTableButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin's Corner - PuzzPak Administrative Panel");

        databaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date Achieved", "Game"
            }
        ));
        jScrollPane1.setViewportView(databaseTable);

        adminTabbedPane.addTab("All Records", jScrollPane1);

        dumpHangmanButon.setText("Dump Hangman");
        dumpHangmanButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumpHangmanButonActionPerformed(evt);
            }
        });

        DumpTIktakButton.setText("Dump Tik Tak");
        DumpTIktakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DumpTIktakButtonActionPerformed(evt);
            }
        });

        dumpMT4Button.setText("Dump MT 4");
        dumpMT4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumpMT4ButtonActionPerformed(evt);
            }
        });

        dumpMT6Button.setText("Dump MT 6");
        dumpMT6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumpMT6ButtonActionPerformed(evt);
            }
        });

        dumpAllButton.setText("Dump All Records");
        dumpAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumpAllButtonActionPerformed(evt);
            }
        });

        deletefromLabel.setText("DELETE FROM ");

        insertintoLabel.setText("INSERT INTO");

        whereLabel1.setText("WHERE");

        tablescombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HANGMANALLTIME", "TIKTAKALLTIME", "MEMORYT4X4ALLTIME", "MEMORYT6X6ALLTIME" }));

        tablesCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HANGMANALLTIME", "TIKTAKALLTIME", "MEMORYT4X4ALLTIME", "MEMORYT6X6ALLTIME" }));

        atributeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "username", "score", "date", "game" }));

        usernameLabel.setText("username");

        scoreLabel.setText("score");

        gameLabel.setText("game");

        equalsLabel1.setText("=");

        gameCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hangman", "tiktak", "mg4x4", "mg6x6" }));

        syntaxLabel1.setText("('");

        syntaxLabel2.setText("' ,");

        syntaxLabel3.setText(", '");

        syntaxLabel4.setText("')");

        executeDeleteFrom.setText("Execute");
        executeDeleteFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeDeleteFromActionPerformed(evt);
            }
        });

        executeInsertInto.setText("Execute");

        adminConsole.setEditable(false);
        adminConsole.setBackground(new java.awt.Color(51, 51, 51));
        adminConsole.setFont(new java.awt.Font("Courier 10 Pitch", 0, 14)); // NOI18N
        adminConsole.setForeground(new java.awt.Color(0, 153, 0));
        adminConsole.setText("Waiting for command...");
        adminConsole.setToolTipText("");
        adminConsole.setAutoscrolls(false);
        adminConsole.setCaretColor(new java.awt.Color(0, 153, 0));
        adminConsole.setFocusable(false);

        consoleLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        consoleLabel.setText("SQL Query Execution Console");

        javax.swing.GroupLayout queriesPanelLayout = new javax.swing.GroupLayout(queriesPanel);
        queriesPanel.setLayout(queriesPanelLayout);
        queriesPanelLayout.setHorizontalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dumpHangmanButon)
                .addGap(18, 18, 18)
                .addComponent(DumpTIktakButton)
                .addGap(18, 18, 18)
                .addComponent(dumpMT4Button)
                .addGap(18, 18, 18)
                .addComponent(dumpMT6Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dumpAllButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletefromLabel)
                    .addComponent(insertintoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablesCombo2, 0, 213, Short.MAX_VALUE)
                    .addComponent(tablescombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queriesPanelLayout.createSequentialGroup()
                        .addComponent(syntaxLabel1)
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(queriesPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(syntaxLabel2)
                                        .addGap(68, 68, 68)
                                        .addComponent(syntaxLabel3)
                                        .addGap(3, 3, 3)
                                        .addComponent(gameCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(syntaxLabel4))
                                    .addGroup(queriesPanelLayout.createSequentialGroup()
                                        .addGap(182, 182, 182)
                                        .addComponent(attributeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(executeDeleteFrom)
                                    .addComponent(executeInsertInto)))
                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(usernameLabel)
                                .addGap(141, 141, 141)
                                .addComponent(gameLabel))))
                    .addGroup(queriesPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                .addComponent(whereLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atributeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equalsLabel1))
                            .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(queriesPanelLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(scoreLabel))
                                .addComponent(scoreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
            .addGroup(queriesPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queriesPanelLayout.createSequentialGroup()
                        .addComponent(consoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(queriesPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addGroup(queriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminConsole)
                .addContainerGap())
        );
        queriesPanelLayout.setVerticalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queriesPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletefromLabel)
                            .addComponent(tablescombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertintoLabel)
                            .addComponent(tablesCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queriesPanelLayout.createSequentialGroup()
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(whereLabel1)
                                .addComponent(atributeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(attributeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(equalsLabel1))
                            .addComponent(executeDeleteFrom))
                        .addGap(18, 18, 18)
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(syntaxLabel1)
                            .addComponent(syntaxLabel2)
                            .addComponent(syntaxLabel3)
                            .addComponent(syntaxLabel4)
                            .addComponent(executeInsertInto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(scoreLabel)
                            .addComponent(gameLabel))))
                .addGap(54, 54, 54)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(consoleLabel)
                .addGap(14, 14, 14)
                .addComponent(adminConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dumpHangmanButon)
                    .addComponent(DumpTIktakButton)
                    .addComponent(dumpMT4Button)
                    .addComponent(dumpMT6Button)
                    .addComponent(dumpAllButton))
                .addGap(22, 22, 22))
        );

        adminTabbedPane.addTab("Execute Queries", queriesPanel);

        javax.swing.GroupLayout debugmodePanelLayout = new javax.swing.GroupLayout(debugmodePanel);
        debugmodePanel.setLayout(debugmodePanelLayout);
        debugmodePanelLayout.setHorizontalGroup(
            debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        debugmodePanelLayout.setVerticalGroup(
            debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        adminTabbedPane.addTab("Enable Universal Debug Mode", debugmodePanel);

        refreshTableButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshTableButton.setForeground(new java.awt.Color(255, 255, 0));
        refreshTableButton.setText("*==== R E F R E S H    T A B L E ====*");
        refreshTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminTabbedPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(refreshTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Executing a DELETE into the database
    private void executeDeleteFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeDeleteFromActionPerformed

        int tableIndex = tablescombo1.getSelectedIndex();
        int attributeIndex = atributeCombobox.getSelectedIndex();

        attribute = attributeTextField.getText();
        
        if (tableIndex == 0){
            table = "HANGMANALLTIME";
        }
        else if (tableIndex == 1){
            table = "TIKTAKALLTIME";
        }
        else if (tableIndex == 2){
            table = "MEMORYT4X4ALLTIME";
        }
        else
            table = "MEMORYT6X6ALLTIME";
        
        
        if (attributeIndex == 0){
            attributeType = "username";
        }
        else if (attributeIndex == 1){
            attributeType = "score";
        }
        else if (attributeIndex == 2){
            attributeType = "date";
        }
        else
            attributeType = "game";
    
        message = database.deleteRecord(table, attributeType, attribute);
        adminConsole.setText(message);
    }//GEN-LAST:event_executeDeleteFromActionPerformed

    private void refreshTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableButtonActionPerformed
        try {
            Connection con = DriverManager.getConnection(host, userID, password);
            System.out.println("Connection is OK!");
            Statement stmt = con.createStatement();

            //Clear ALL tables before refreshing.
            try{
                //hangman all-time
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
            }
            catch (Exception e){
                System.out.println("Already empty");     
            }
            
            //U P D A T E   H A N G M A N   A L L T I M E   
            String[] tableColumnsName = {"Username","Score","Date","Game"}; 
            hangmanModel = (DefaultTableModel) databaseTable.getModel();
            hangmanModel.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM HANGMANALLTIME ORDER BY SCORE DESC");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                hangmanModel.addRow(records);
            }
            databaseTable.setModel(hangmanModel);
                        
            //U P D A T E   T I K - T A K   A L L T I M E
            tiktakModel = (DefaultTableModel) databaseTable.getModel();
            tiktakModel.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM TIKTAKALLTIME ORDER BY SCORE DESC");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                tiktakModel.addRow(records);
            }
            databaseTable.setModel(tiktakModel);
            
            //U P D A T E   M E M O R Y 4   A L L T I M E
            mt4x4Model = (DefaultTableModel) databaseTable.getModel();
            mt4x4Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM MEMORYT4X4ALLTIME ORDER BY SCORE DESC");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                mt4x4Model.addRow(records);
            }
            databaseTable.setModel(mt4x4Model);
            
            //U P D A T E   M E M O R Y 6  A L L T I M E   J T A B L E
            mt6x6Model = (DefaultTableModel) databaseTable.getModel();
            mt6x6Model.setColumnIdentifiers(tableColumnsName);

            rs = stmt.executeQuery("SELECT * FROM MEMORYT6X6ALLTIME ORDER BY SCORE DESC");

            rsmd = rs.getMetaData();
            colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] records = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    records[i] = rs.getString(i + 1);
                }
                mt6x6Model.addRow(records);
            }
            databaseTable.setModel(mt6x6Model);
        }
        catch (SQLException err) {
            System.out.println( err.getMessage());
        }
    }//GEN-LAST:event_refreshTableButtonActionPerformed

    private void dumpHangmanButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpHangmanButonActionPerformed
        int n = JOptionPane.showConfirmDialog(
            rootPane,
            "Permanently delete all hangman records?\n"
            + "You cannot undo this action.",
            "Record Deletion Confirmation",
            JOptionPane.YES_NO_OPTION
        );
        if(n == 0) database.wipeTable("HANGMANALLTIME");
    }//GEN-LAST:event_dumpHangmanButonActionPerformed

    private void DumpTIktakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DumpTIktakButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(
            rootPane,
            "Permanently delete all Tik-Tak records?\n"
            + "You cannot undo this action.",
            "Record Deletion Confirmation",
            JOptionPane.YES_NO_OPTION
        );
        if(n == 0) database.wipeTable("TIKTAKALLTIME"); 
    }//GEN-LAST:event_DumpTIktakButtonActionPerformed

    private void dumpMT4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpMT4ButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(
            rootPane,
            "Permanently delete all MemoryTiles 4x4 records?\n"
            + "You cannot undo this action.",
            "Record Deletion Confirmation",
            JOptionPane.YES_NO_OPTION
        );
        if(n == 0) database.wipeTable("MEMORYT4X4ALLTIME");
    }//GEN-LAST:event_dumpMT4ButtonActionPerformed

    private void dumpMT6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpMT6ButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(
            rootPane,
            "Permanently delete all MemoryTiles 6x6 records?\n"
            + "You cannot undo this action.",
            "Record Deletion Confirmation",
            JOptionPane.YES_NO_OPTION
        );
        if(n == 0) database.wipeTable("MEMORYT6X6ALLTIME");
    }//GEN-LAST:event_dumpMT6ButtonActionPerformed

    private void dumpAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpAllButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(
            rootPane,
            "WARNING: Permanently delete all database records?\n"
            + "This action is permanent.",
            "WARNING: Scores Annihilation",
            JOptionPane.YES_NO_OPTION
        );
        if(n == 0) database.wipeTable("*"); //<-- Did not test
    }//GEN-LAST:event_dumpAllButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DumpTIktakButton;
    private javax.swing.JTextField adminConsole;
    private javax.swing.JTabbedPane adminTabbedPane;
    private javax.swing.JComboBox<String> atributeCombobox;
    private javax.swing.JTextField attributeTextField;
    private javax.swing.JLabel consoleLabel;
    private javax.swing.JTable databaseTable;
    private javax.swing.JPanel debugmodePanel;
    private javax.swing.JLabel deletefromLabel;
    private javax.swing.JButton dumpAllButton;
    private javax.swing.JButton dumpHangmanButon;
    private javax.swing.JButton dumpMT4Button;
    private javax.swing.JButton dumpMT6Button;
    private javax.swing.JLabel equalsLabel1;
    private javax.swing.JButton executeDeleteFrom;
    private javax.swing.JButton executeInsertInto;
    private javax.swing.JComboBox<String> gameCombobox;
    private javax.swing.JLabel gameLabel;
    private javax.swing.JLabel insertintoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel queriesPanel;
    private javax.swing.JButton refreshTableButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextField scoreTextfield;
    private javax.swing.JLabel syntaxLabel1;
    private javax.swing.JLabel syntaxLabel2;
    private javax.swing.JLabel syntaxLabel3;
    private javax.swing.JLabel syntaxLabel4;
    private javax.swing.JComboBox<String> tablesCombo2;
    private javax.swing.JComboBox<String> tablescombo1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextfield;
    private javax.swing.JLabel whereLabel1;
    // End of variables declaration//GEN-END:variables
 
    //Database connection Variables
    DatabaseControl database = new DatabaseControl("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    boolean connSuccess;
    String host = "jdbc:derby://localhost:1527/PPleaderboard"; 
    String userID = "operator";
    String password = "westfield";
    
    //Local Background Variables
    String table = "...";
    String attributeType = "...";
    String attribute = "...";
    String message = "";
    
    //Jtable filling Variables
    ResultSetMetaData rsmd;
    ResultSet rs;
    int columnsNumber;
    int colNo, rowNo;
    DefaultTableModel hangmanModel;
    DefaultTableModel tiktakModel;
    DefaultTableModel mt4x4Model;
    DefaultTableModel mt6x6Model;


}
