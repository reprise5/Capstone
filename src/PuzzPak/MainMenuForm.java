package PuzzPak;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Dani Marcoullier (reprise)
 * 2017
 */
public class MainMenuForm extends javax.swing.JFrame {
    public MainMenuForm() {
        //TikTak and Hangman have best-out-of-3-or-more post rules, which uses a windowListener.
        hangman.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                //call reset methods.
                System.out.println("Resetting Hangman Post Rules...");
                hangman.resetPostRule();
            }
        });  
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
        continueAsButton = new javax.swing.JButton();
        loggedInAsLabel = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        gamesMenu = new javax.swing.JMenu();
        hangmanMenuItem = new javax.swing.JMenuItem();
        tiktakMenuItem = new javax.swing.JMenuItem();
        memorytiles4x4MenuItem = new javax.swing.JMenuItem();
        memorytiles6x6MenuItem = new javax.swing.JMenuItem();
        leaderboardMenu = new javax.swing.JMenu();
        viewLeaderboardMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        adminCornerMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PUZZPAK - play, score, win!");
        setIconImage(Toolkit.getDefaultToolkit().getImage(JFrame.class.getResource("/PuzzPak/images/icons/icon.png")));
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

        continueAsButton.setText("Continue-As...");
        continueAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueAsButtonActionPerformed(evt);
            }
        });

        loggedInAsLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        loggedInAsLabel.setText("Not logged in");

        fileMenu.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Quit");
        fileMenu.add(jMenuItem2);

        mainMenuBar.add(fileMenu);

        gamesMenu.setText("Games");

        hangmanMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        hangmanMenuItem.setText("Hangman");
        hangmanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hangmanMenuItemActionPerformed(evt);
            }
        });
        gamesMenu.add(hangmanMenuItem);

        tiktakMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, 0));
        tiktakMenuItem.setText("Tik-Tak");
        tiktakMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiktakMenuItemActionPerformed(evt);
            }
        });
        gamesMenu.add(tiktakMenuItem);

        memorytiles4x4MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, 0));
        memorytiles4x4MenuItem.setText("MemoryTiles (easy)");
        memorytiles4x4MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorytiles4x4MenuItemActionPerformed(evt);
            }
        });
        gamesMenu.add(memorytiles4x4MenuItem);

        memorytiles6x6MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, 0));
        memorytiles6x6MenuItem.setText("MemoryTiles (hard)");
        memorytiles6x6MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorytiles6x6MenuItemActionPerformed(evt);
            }
        });
        gamesMenu.add(memorytiles6x6MenuItem);

        mainMenuBar.add(gamesMenu);

        leaderboardMenu.setText("Leaderboards");

        viewLeaderboardMenuItem.setText("View Leaderboards");
        viewLeaderboardMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLeaderboardMenuItemActionPerformed(evt);
            }
        });
        leaderboardMenu.add(viewLeaderboardMenuItem);

        mainMenuBar.add(leaderboardMenu);

        helpMenu.setText("Help");

        adminCornerMenuItem.setText("Settings");
        adminCornerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCornerMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(adminCornerMenuItem);

        aboutMenuItem.setText("About...");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

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
                                    .addComponent(continueAsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(continueAsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        /* Create new thread to prevent hangup */
        Thread thread = new Thread(username) {
            @Override
            public void run() {
                /* create a new form and open it. */
                TikTakForm game = new TikTakForm();
                game.setUsername(username);
                
                //TikTak and Hangman have best-out-of-3-or-more post rules, which uses a windowListener.
                game.addWindowListener(new WindowAdapter(){
                    @Override
                    public void windowClosing(WindowEvent e) {
                        int num = windowClosingSwitch(1);
                        System.out.println("Resetting Tik-Tak Post Rules...");
                    }
                });
                game.setVisible(true);
                
                /* keep track of the game */
                do{
                    if (game.getPlayer() == 1){
                        try {
                            Thread.sleep(1100);
                        } 
                        catch (InterruptedException ex) {
                            System.out.println(ex.getMessage());
                        }

                        win = game.checkWin2();
                        tie = game.checkTie();

                        if (!tie && !win){
                            game.playComputer();
                        }
                    }
                } while(windowClosingSwitch(0) == 0);
            }
        };
        thread.start();
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
                "Database Error", 0x1);
        } 
        else leaderboards.populate();
        
    }//GEN-LAST:event_leaderboardsButtonActionPerformed

    //when the user signs in, a username is created for them.
    public void createAccount(String username){
        
    }
    
    //Launch ADMINFORM after typing in a passphrase.
    private void adminCornerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCornerMenuItemActionPerformed
        admin.setVisible(true);
    }//GEN-LAST:event_adminCornerMenuItemActionPerformed

    //Log-In button.  A profile is created if the username is not in the DB.  if it is, simply save under their profile.
    private void continueAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueAsButtonActionPerformed
        try{
            Connection con = DriverManager.getConnection(database.getDBhost(), database.getDBusername(), database.getDBpassword());
            Statement stmt = con.createStatement();
            
            //username = JOptionPane.showInputDialog(rootPane, "Enter your username: ", "Who are you?", 3).toLowerCase();
            Object[] selectionValues = null;
            username = (String) JOptionPane.showInputDialog(rootPane, username, "Enter your username: ", 0, who, selectionValues, DISPOSE_ON_CLOSE);
            username = username.toLowerCase();
            
            if (username.length() < MAX_STRING_LENGTH && !username.equals("")){
                loggedInAsLabel.setText("Logged In As: " + username);
                loggedInAsLabel.setForeground(Color.BLACK);

                //handles account creation
                database.addNewAccount(username);

                /* Give everyone the user's name so they can all post properly */
                hangman.setUsername(username);
                smallMT.setUsername(username);
                largMT.setUsername(username);
                //tiktak gets the username when the form is opened. (it's in a seperate thread, so we can't access it here.)
            }
            else{
            loggedInAsLabel.setText("username cannot be Null.");
            loggedInAsLabel.setForeground(Color.red);
            }
        }
        catch(NullPointerException npe){
            System.out.println(npe.getMessage());
            loggedInAsLabel.setText("username cannot be Null.");
            loggedInAsLabel.setForeground(Color.red);
        }
        catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }//GEN-LAST:event_continueAsButtonActionPerformed

    //Display a dialog with information about this project.
    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(rootPane,
                "                                    PuzzPak\n"
              + "This is a Game Pack which provides 4 form games for you to play.\n"
              + "Play and score in each game. See how you measure up to other players\n"
              + "in the leaderboards: arcade style.  Source files can be found at:\n"
              + "           https://github.com/reprise5/SeniorProject\n", 
                "**About PUZZPAK**", WIDTH, null);
        
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    //Start Hangman Game through the menuBar
    private void hangmanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hangmanMenuItemActionPerformed
        hangmanButtonActionPerformed(evt);
    }//GEN-LAST:event_hangmanMenuItemActionPerformed
    
    //Start Tik-Tak Game through the menuBar
    private void tiktakMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiktakMenuItemActionPerformed
        tikTakButtonActionPerformed(evt);
    }//GEN-LAST:event_tiktakMenuItemActionPerformed

    //Start Memory Tiles 4x4 Game through the menuBar
    private void memorytiles4x4MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorytiles4x4MenuItemActionPerformed
        memoryTiles4x4ButtonActionPerformed(evt);
    }//GEN-LAST:event_memorytiles4x4MenuItemActionPerformed

    //Start Memory Tiles 4x4 Game through the menuBar
    private void memorytiles6x6MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorytiles6x6MenuItemActionPerformed
        MemoryTiles6x6ButtonActionPerformed(evt);
    }//GEN-LAST:event_memorytiles6x6MenuItemActionPerformed

    //open the leaderboard through the menuBar
    private void viewLeaderboardMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLeaderboardMenuItemActionPerformed
        leaderboardsButtonActionPerformed(evt);
    }//GEN-LAST:event_viewLeaderboardMenuItemActionPerformed

    //WindowClosing will pass a 1 to signify it's closing, to end do-while loop.
    //this probably doesn't work as intended.
    public static int windowClosingSwitch(int num){
        int numb = 0;
        System.out.print("");
        if (num == 0){
            //IGNORE THE 0 AT ALL COSTS
            return numb;
        }
        else{
            System.out.println("Close Signal Recieved.");
            numb = num;
            return numb;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MemoryTiles6x6Button;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem adminCornerMenuItem;
    private javax.swing.JButton continueAsButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu gamesMenu;
    private javax.swing.JButton hangmanButton;
    private javax.swing.JMenuItem hangmanMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu leaderboardMenu;
    private javax.swing.JButton leaderboardsButton;
    private javax.swing.JLabel loggedInAsLabel;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JButton memoryTiles4x4Button;
    private javax.swing.JMenuItem memorytiles4x4MenuItem;
    private javax.swing.JMenuItem memorytiles6x6MenuItem;
    private javax.swing.JLabel splashLabel;
    private javax.swing.JButton tikTakButton;
    private javax.swing.JMenuItem tiktakMenuItem;
    private javax.swing.JMenuItem viewLeaderboardMenuItem;
    // End of variables declaration//GEN-END:variables

    /* GLOBALS */
    String username = "";               //Global Username
    boolean win;                        //For tik-Tak
    boolean tie;                        //for Tik-Tak
    final int MAX_STRING_LENGTH = 15;   //this is the max size the username can be.  test this constraint before talking to DB.  otherwise throw exception.
    ImageIcon who = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/loginIcon.png")); //<-- Not using.
    
    /* Games */
    LeaderboardForm leaderboards = new LeaderboardForm(/*"operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard"*/);
    DatabaseControl database     = new DatabaseControl("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    HangmanForm     hangman      = new HangmanForm();
    Memorytiles1    smallMT      = new Memorytiles1();
    Memorytiles2    largMT       = new Memorytiles2();
    
    /* other forms */
    AdminForm       admin        = new AdminForm();   
}
