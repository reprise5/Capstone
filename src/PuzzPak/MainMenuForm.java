package PuzzPak;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 * @author reprise
 */
public class MainMenuForm extends javax.swing.JFrame {

    public MainMenuForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashLabel = new javax.swing.JLabel();
        hangmanButton = new javax.swing.JButton();
        memoryTiles4x4Button = new javax.swing.JButton();
        MemoryTiles6x6Button = new javax.swing.JButton();
        tikTakButton = new javax.swing.JButton();
        leaderboardsButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        loggedInAsLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        HangmanMenuItem = new javax.swing.JMenuItem();
        TiktakMenuItem = new javax.swing.JMenuItem();
        Memorytiles4x4MenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        viewLeaderboardMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        adminCornerMenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PUZZPAK - play, score, win!");
        setResizable(false);

        splashLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/PuzzPak Logo.png"))); // NOI18N

        hangmanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/HangmanBtn.png"))); // NOI18N
        hangmanButton.setPreferredSize(new java.awt.Dimension(85, 60));
        hangmanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hangmanButtonActionPerformed(evt);
            }
        });

        memoryTiles4x4Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/MT4x4.png"))); // NOI18N
        memoryTiles4x4Button.setPreferredSize(new java.awt.Dimension(85, 60));
        memoryTiles4x4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryTiles4x4ButtonActionPerformed(evt);
            }
        });

        MemoryTiles6x6Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/MT6x6.png"))); // NOI18N
        MemoryTiles6x6Button.setToolTipText("");
        MemoryTiles6x6Button.setPreferredSize(new java.awt.Dimension(85, 60));
        MemoryTiles6x6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoryTiles6x6ButtonActionPerformed(evt);
            }
        });

        tikTakButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/TikTakBtn.png"))); // NOI18N
        tikTakButton.setPreferredSize(new java.awt.Dimension(85, 60));
        tikTakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tikTakButtonActionPerformed(evt);
            }
        });

        leaderboardsButton.setFont(new java.awt.Font("Digital Readout Thick Upright", 0, 16)); // NOI18N
        leaderboardsButton.setText("L E A D E R B O A R D S");
        leaderboardsButton.setPreferredSize(new java.awt.Dimension(265, 40));
        leaderboardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardsButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Continue-As...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        loggedInAsLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        loggedInAsLabel.setText("Not logged in");

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Quit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Games");

        HangmanMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        HangmanMenuItem.setText("Hangman");
        jMenu3.add(HangmanMenuItem);

        TiktakMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, 0));
        TiktakMenuItem.setText("Tik-Tak");
        jMenu3.add(TiktakMenuItem);

        Memorytiles4x4MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, 0));
        Memorytiles4x4MenuItem.setText("MemoryTiles (easy)");
        jMenu3.add(Memorytiles4x4MenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, 0));
        jMenuItem1.setText("MemoryTiles (hard)");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Leaderboards");

        viewLeaderboardMenuItem.setText("View Leaderboards");
        jMenu4.add(viewLeaderboardMenuItem);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Help");

        adminCornerMenuItem.setText("Admin's Corner");
        adminCornerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCornerMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(adminCornerMenuItem);

        jMenu5.setText("About...");
        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(splashLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loggedInAsLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(leaderboardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hangmanButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tikTakButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(memoryTiles4x4Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemoryTiles6x6Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splashLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hangmanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryTiles4x4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemoryTiles6x6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tikTakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leaderboardsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(loggedInAsLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Launch Hangman game from the main menu
    private void hangmanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hangmanButtonActionPerformed
        hangman.setVisible(true);
    }//GEN-LAST:event_hangmanButtonActionPerformed

    //Launch Tik-Tak (ticTacToe Game) from the Main Menu
    private void tikTakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tikTakButtonActionPerformed

    }//GEN-LAST:event_tikTakButtonActionPerformed

    //Launch Memory Tiles 4x4 from the main menu
    private void memoryTiles4x4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryTiles4x4ButtonActionPerformed
        smallMT.setVisible(true);
    }//GEN-LAST:event_memoryTiles4x4ButtonActionPerformed

    //Launch Memory Tiles 6x6 from the main menu
    private void MemoryTiles6x6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoryTiles6x6ButtonActionPerformed
        largMT.setVisible(true);
    }//GEN-LAST:event_MemoryTiles6x6ButtonActionPerformed

    //Opens the View Database Main Menu.
    private void leaderboardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardsButtonActionPerformed
       leaderboards.setVisible(true);
        if(!database.connect() && this.isVisible()){
            JOptionPane.showMessageDialog(rootPane,
                "Failed to connect to the Leaderboards Database.\n"
              + "is it running?", 
                "Database Error", 
                WIDTH);
        } 
        else leaderboards.populate("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
        
    }//GEN-LAST:event_leaderboardsButtonActionPerformed

    //Launch ADMINFORM after typing in a passphrase.
    private void adminCornerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCornerMenuItemActionPerformed
        admin.setVisible(true);
    }//GEN-LAST:event_adminCornerMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try{
                username = JOptionPane.showInputDialog(rootPane, "Enter your username: ", "Who are you?", HEIGHT);
                hangman.setUsername(username);
                smallMT.setUsername(username);
                largMT.setUsername(username);
                //tiktak.setUsername(username);
                loggedInAsLabel.setText("Logged In As: " + username);
                
                if("".equals(username)){
                    username = "";
                    loggedInAsLabel.setText("Not logged in.");
                }
            }
            catch(NullPointerException e){
                System.out.println(e.getMessage());
                loggedInAsLabel.setText("Not logged in.");
                username = "";
            
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem HangmanMenuItem;
    private javax.swing.JButton MemoryTiles6x6Button;
    private javax.swing.JMenuItem Memorytiles4x4MenuItem;
    private javax.swing.JMenuItem TiktakMenuItem;
    private javax.swing.JMenuItem adminCornerMenuItem;
    private javax.swing.JButton hangmanButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton leaderboardsButton;
    private javax.swing.JLabel loggedInAsLabel;
    private javax.swing.JButton memoryTiles4x4Button;
    private javax.swing.JLabel splashLabel;
    private javax.swing.JButton tikTakButton;
    private javax.swing.JMenuItem viewLeaderboardMenuItem;
    // End of variables declaration//GEN-END:variables

    //GLOBALS
    String username = "";
    
    /* Games */
    LeaderboardForm leaderboards = new LeaderboardForm("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    DatabaseControl database     = new DatabaseControl("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    HangmanForm     hangman      = new HangmanForm();
    Memorytiles1    smallMT      = new Memorytiles1();
    Memorytiles2    largMT       = new Memorytiles2();
    //TikTak        tiktak       = new TikTak();
    
    /* other forms */
    AdminForm       admin        = new AdminForm();
    
}
