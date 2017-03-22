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
        executeDeleteFrom = new javax.swing.JButton();
        executeInsertInto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        adminConsole = new javax.swing.JTextField();
        consoleLabel = new javax.swing.JLabel();
        freehandQueryTextbox = new javax.swing.JTextField();
        freehandQueryLabel = new javax.swing.JLabel();
        executefreeHand = new javax.swing.JButton();
        dumpAllKey = new javax.swing.JCheckBox();
        valuesLabel = new javax.swing.JLabel();
        recordListingScrollPane = new javax.swing.JScrollPane();
        databaseTable = new javax.swing.JTable();
        debugmodePanel = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        hostTextField = new javax.swing.JTextField();
        usernameLabel2 = new javax.swing.JLabel();
        hostLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        saveDBconfigButton = new javax.swing.JButton();
        refreshTableButton = new javax.swing.JButton();
        rootLoginButton = new javax.swing.JButton();
        rootLoginLabel = new javax.swing.JLabel();
        rootPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin's Corner - PuzzPak Administrative Panel");

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

        dumpAllButton.setBackground(new java.awt.Color(204, 0, 0));
        dumpAllButton.setText(" Alle Datensätze löschen");
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

        executeDeleteFrom.setText("ausführen");
        executeDeleteFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeDeleteFromActionPerformed(evt);
            }
        });

        executeInsertInto.setText("ausführen");
        executeInsertInto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeInsertIntoActionPerformed(evt);
            }
        });

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

        freehandQueryTextbox.setFont(new java.awt.Font("Courier New", 1, 10)); // NOI18N

        freehandQueryLabel.setText("Enter a freehand Query");

        executefreeHand.setText("ausführen");
        executefreeHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executefreeHandActionPerformed(evt);
            }
        });

        dumpAllKey.setText("Insert Key");

        valuesLabel.setText("VALUES");

        javax.swing.GroupLayout queriesPanelLayout = new javax.swing.GroupLayout(queriesPanel);
        queriesPanel.setLayout(queriesPanelLayout);
        queriesPanelLayout.setHorizontalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queriesPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(consoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(queriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminConsole)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queriesPanelLayout.createSequentialGroup()
                        .addComponent(dumpHangmanButon)
                        .addGap(18, 18, 18)
                        .addComponent(DumpTIktakButton)
                        .addGap(18, 18, 18)
                        .addComponent(dumpMT4Button)
                        .addGap(18, 18, 18)
                        .addComponent(dumpMT6Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dumpAllKey)
                            .addComponent(dumpAllButton)))
                    .addGroup(queriesPanelLayout.createSequentialGroup()
                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deletefromLabel)
                                    .addComponent(insertintoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tablesCombo2, 0, 213, Short.MAX_VALUE)
                                    .addComponent(tablescombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(queriesPanelLayout.createSequentialGroup()
                                        .addComponent(valuesLabel)
                                        .addGap(7, 7, 7)
                                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usernameLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(scoreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(scoreLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(gameLabel)
                                                .addGap(150, 150, 150))
                                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                                .addComponent(gameCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(executeInsertInto))))
                                    .addGroup(queriesPanelLayout.createSequentialGroup()
                                        .addComponent(whereLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(atributeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(equalsLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(attributeTextField)
                                        .addGap(18, 18, 18)
                                        .addComponent(executeDeleteFrom))))
                            .addComponent(freehandQueryLabel)
                            .addGroup(queriesPanelLayout.createSequentialGroup()
                                .addComponent(freehandQueryTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(executefreeHand)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        queriesPanelLayout.setVerticalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queriesPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletefromLabel)
                    .addComponent(tablescombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whereLabel1)
                    .addComponent(atributeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalsLabel1)
                    .addComponent(attributeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(executeDeleteFrom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertintoLabel)
                    .addComponent(tablesCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(executeInsertInto)
                    .addComponent(valuesLabel)
                    .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreLabel)
                    .addComponent(gameLabel)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(freehandQueryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freehandQueryTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(executefreeHand))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consoleLabel)
                .addGap(18, 18, 18)
                .addComponent(adminConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dumpHangmanButon)
                    .addComponent(DumpTIktakButton)
                    .addComponent(dumpMT4Button)
                    .addComponent(dumpMT6Button)
                    .addComponent(dumpAllButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dumpAllKey))
        );

        adminTabbedPane.addTab("Execute Queries", queriesPanel);

        databaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Score", "Date Achieved", "Game"
            }
        ));
        recordListingScrollPane.setViewportView(databaseTable);

        adminTabbedPane.addTab("All Records", recordListingScrollPane);

        usernameTextField.setText("operator");

        passwordTextField.setText("westfield");

        hostTextField.setText("jdbc:derby://localhost:1527/PPleaderboard");

        usernameLabel2.setText("Username");

        hostLabel.setText("Host");

        passwordLabel.setText("Password");

        saveDBconfigButton.setText("Save Configuration");
        saveDBconfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDBconfigButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout debugmodePanelLayout = new javax.swing.GroupLayout(debugmodePanel);
        debugmodePanel.setLayout(debugmodePanelLayout);
        debugmodePanelLayout.setHorizontalGroup(
            debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, debugmodePanelLayout.createSequentialGroup()
                .addContainerGap(619, Short.MAX_VALUE)
                .addComponent(saveDBconfigButton)
                .addContainerGap())
            .addGroup(debugmodePanelLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(debugmodePanelLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(debugmodePanelLayout.createSequentialGroup()
                        .addGroup(debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hostLabel)
                            .addComponent(usernameLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hostTextField)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        debugmodePanelLayout.setVerticalGroup(
            debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debugmodePanelLayout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel2))
                .addGap(7, 7, 7)
                .addGroup(debugmodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(133, 133, 133)
                .addComponent(saveDBconfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adminTabbedPane.addTab("Database Settings", debugmodePanel);

        refreshTableButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshTableButton.setForeground(new java.awt.Color(255, 255, 0));
        refreshTableButton.setText("=== Datenbanktabelle aktualisieren ===");
        refreshTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableButtonActionPerformed(evt);
            }
        });

        rootLoginButton.setText("Log-In");
        rootLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootLoginButtonActionPerformed(evt);
            }
        });

        rootLoginLabel.setText("Admin Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminTabbedPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rootLoginLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rootPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rootLoginButton)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(refreshTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rootLoginButton)
                    .addComponent(rootPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rootLoginLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Executing a DELETE into the database
    private void executeDeleteFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeDeleteFromActionPerformed
        if(enteredPass.equals(passphrase)){
            int tableIndex = tablescombo1.getSelectedIndex();
            int attributeIndex = atributeCombobox.getSelectedIndex();
            int attrCode = -1;

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
                attrCode = 0;
            }
            else if (attributeIndex == 1){
                attributeType = "score";
                attrCode = 1;
            }
            else if (attributeIndex == 2){
                attributeType = "date";
                attrCode = 0;
            }
            else{
                attributeType = "game";
                attrCode = 0;
            }

            System.out.println("attr code is " + attrCode);
            message = database.deleteRecord(table, attributeType, attribute, attrCode);
            adminConsole.setText(message);
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_executeDeleteFromActionPerformed

    //Refresh the records in the Jtable from the database.
    private void refreshTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableButtonActionPerformed
        try {
            Connection con = DriverManager.getConnection(host, userID, password);
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

    //Clears all records from Hangman Alltime table.
    private void dumpHangmanButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpHangmanButonActionPerformed
        if(enteredPass.equals(passphrase)){
            int n = JOptionPane.showConfirmDialog(
                rootPane,
                "Permanently delete all hangman records?\n"
                + "You cannot undo this action.",
                "Record Deletion Confirmation",
                JOptionPane.YES_NO_OPTION
            );
            if(n == 0){
                database.wipeTable("HANGMANALLTIME");
                adminConsole.setText("Dumped all records in HANGMANALLTIME");
            }
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_dumpHangmanButonActionPerformed

    //Clears all records from Tik-Tak Alltime table.
    private void DumpTIktakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DumpTIktakButtonActionPerformed
        if(enteredPass.equals(passphrase)){
            int n = JOptionPane.showConfirmDialog(
                rootPane,
                "Permanently delete all Tik-Tak records?\n"
                + "You cannot undo this action.",
                "Record Deletion Confirmation",
                JOptionPane.YES_NO_OPTION
            );
            if(n == 0){
                database.wipeTable("TIKTAKALLTIME");
                adminConsole.setText("Dumped all records in TIKTAKALLTIME");
            } 
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_DumpTIktakButtonActionPerformed

    //Clears all records from MemmoryTiles 4x4 Alltime table.
    private void dumpMT4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpMT4ButtonActionPerformed
        if(enteredPass.equals(passphrase)){
            int n = JOptionPane.showConfirmDialog(
                rootPane,
                "Permanently delete all MemoryTiles 4x4 records?\n"
                + "You cannot undo this action.",
                "Record Deletion Confirmation",
                JOptionPane.YES_NO_OPTION
            );
            if(n == 0){
                database.wipeTable("MEMORYT4X4ALLTIME");
                adminConsole.setText("Dumped all records in MEMORYT4x4ALLTIME");
            }
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_dumpMT4ButtonActionPerformed

    //Clears all records from MemmoryTiles 6x6 Alltime table.
    private void dumpMT6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpMT6ButtonActionPerformed
        if(enteredPass.equals(passphrase)){
            int n = JOptionPane.showConfirmDialog(
                rootPane,
                "Permanently delete all MemoryTiles 6x6 records?\n"
                + "You cannot undo this action.",
                "Record Deletion Confirmation",
                JOptionPane.YES_NO_OPTION
            );
            if(n == 0){ 
                database.wipeTable("MEMORYT6X6ALLTIME");
                adminConsole.setText("Dumped all records in MEMORYT6x6ALLTIME");
            }
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_dumpMT6ButtonActionPerformed

    //Clears all records from ALL tables.
    private void dumpAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpAllButtonActionPerformed
        if(enteredPass.equals(passphrase)){
            int n = JOptionPane.showConfirmDialog(
                rootPane,
                "WARNING: Permanently delete all database records?\n"
                + "This action is permanent.",
                "WARNING: Scores Annihilation",
                JOptionPane.YES_NO_OPTION
            );
            if(n == 0 && dumpAllKey.isSelected()){
                //database.wipeTable("*"); //<-- Did not test
                adminConsole.setText("All records have been dumped from the database. :( ");
            } 
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_dumpAllButtonActionPerformed

    //Submitting a freehand query
    private void executefreeHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executefreeHandActionPerformed
        if(enteredPass.equals(passphrase)){
            message = database.executeQuery(freehandQueryTextbox.getText());
            adminConsole.setText(message);
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_executefreeHandActionPerformed

    //Login to do administrative tasks that other users aren't allowed to do.
    private void rootLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootLoginButtonActionPerformed
        enteredPass = rootPasswordField.getText();
        rootPasswordField.setText("");
    }//GEN-LAST:event_rootLoginButtonActionPerformed

    //Executing a INSERT into the database
    private void executeInsertIntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeInsertIntoActionPerformed
        if(enteredPass.equals(passphrase)){
            //execute the insert into.
        }
        else showPermissionDeniedDiag();
    }//GEN-LAST:event_executeInsertIntoActionPerformed

    //commit new Database connection information to memory
    private void saveDBconfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDBconfigButtonActionPerformed
        database.setDBhost(hostTextField.getText());
        database.setDBusername(usernameTextField.getText());
        database.setDBpassword(passwordTextField.getText());
        System.out.println("Connecting to new database at: "
                + "\nHOST:  " + hostTextField.getText()
                + "\nUSER:  " + usernameTextField.getText()
                + "\nPASS:  " + passwordTextField.getText()
        );
    }//GEN-LAST:event_saveDBconfigButtonActionPerformed

    private void showPermissionDeniedDiag(){
        JOptionPane.showMessageDialog(rootPane,
                "Admin privelages required to perform that action.\n"
              + "Sie haben keine Berechtigung diese Aktion auszuführen.\n", 
                "Permission Denied", 
                0, null
        );   
    }

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
    private javax.swing.JCheckBox dumpAllKey;
    private javax.swing.JButton dumpHangmanButon;
    private javax.swing.JButton dumpMT4Button;
    private javax.swing.JButton dumpMT6Button;
    private javax.swing.JLabel equalsLabel1;
    private javax.swing.JButton executeDeleteFrom;
    private javax.swing.JButton executeInsertInto;
    private javax.swing.JButton executefreeHand;
    private javax.swing.JLabel freehandQueryLabel;
    private javax.swing.JTextField freehandQueryTextbox;
    private javax.swing.JComboBox<String> gameCombobox;
    private javax.swing.JLabel gameLabel;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JTextField hostTextField;
    private javax.swing.JLabel insertintoLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JPanel queriesPanel;
    private javax.swing.JScrollPane recordListingScrollPane;
    private javax.swing.JButton refreshTableButton;
    private javax.swing.JButton rootLoginButton;
    private javax.swing.JLabel rootLoginLabel;
    private javax.swing.JPasswordField rootPasswordField;
    private javax.swing.JButton saveDBconfigButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextField scoreTextfield;
    private javax.swing.JComboBox<String> tablesCombo2;
    private javax.swing.JComboBox<String> tablescombo1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel2;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JTextField usernameTextfield;
    private javax.swing.JLabel valuesLabel;
    private javax.swing.JLabel whereLabel1;
    // End of variables declaration//GEN-END:variables
 
    //Database connection Variables
    DatabaseControl database = new DatabaseControl("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    boolean connSuccess;
    String host = "jdbc:derby://localhost:1527/PPleaderboard"; 
    String userID = "operator";
    String password = "westfield";
    
    //Global Background Variables
    String table = "...";
    String attributeType = "...";
    String attribute = "...";
    String message = "";
    String passphrase = "rzqxx5gv";
    String enteredPass = "";
    
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
