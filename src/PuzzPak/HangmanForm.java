package PuzzPak;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author reprise
 */
public class HangmanForm extends javax.swing.JFrame {


    //init
    public HangmanForm(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hangScreenPanel = new javax.swing.JPanel();
        hangScreen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Cbutton = new javax.swing.JButton();
        Bbutton = new javax.swing.JButton();
        Dbutton = new javax.swing.JButton();
        Ebutton = new javax.swing.JButton();
        Fbutton = new javax.swing.JButton();
        Gbutton = new javax.swing.JButton();
        Ibutton = new javax.swing.JButton();
        Hbutton = new javax.swing.JButton();
        Jbutton = new javax.swing.JButton();
        Sbutton = new javax.swing.JButton();
        Rbutton = new javax.swing.JButton();
        Pbutton = new javax.swing.JButton();
        Qbutton = new javax.swing.JButton();
        Obutton = new javax.swing.JButton();
        Lbutton = new javax.swing.JButton();
        Mbutton = new javax.swing.JButton();
        Nbutton = new javax.swing.JButton();
        DifficultyLabel = new javax.swing.JLabel();
        triesLeftCountLabel = new javax.swing.JLabel();
        GuessthewordLabel = new javax.swing.JLabel();
        DifficultyCombobox = new javax.swing.JComboBox();
        triesLeftScreen = new javax.swing.JTextField();
        startGameButton = new javax.swing.JButton();
        Kbutton = new javax.swing.JButton();
        Abutton = new javax.swing.JButton();
        Tbutton = new javax.swing.JButton();
        Ubutton = new javax.swing.JButton();
        Vbutton = new javax.swing.JButton();
        Wbutton = new javax.swing.JButton();
        Xbutton = new javax.swing.JButton();
        Ybutton = new javax.swing.JButton();
        Zbutton = new javax.swing.JButton();
        GuessEnterButton = new javax.swing.JButton();
        GuessWordBox = new javax.swing.JTextField();
        letterTile1 = new javax.swing.JTextField();
        letterTile2 = new javax.swing.JTextField();
        letterTile3 = new javax.swing.JTextField();
        letterTile5 = new javax.swing.JTextField();
        letterTile4 = new javax.swing.JTextField();
        letterTile6 = new javax.swing.JTextField();
        letterTile7 = new javax.swing.JTextField();
        letterTile8 = new javax.swing.JTextField();
        letterTile9 = new javax.swing.JTextField();
        letterTile10 = new javax.swing.JTextField();
        letterTile12 = new javax.swing.JTextField();
        letterTile11 = new javax.swing.JTextField();
        LossesScreen = new javax.swing.JTextField();
        WinsScreen = new javax.swing.JTextField();
        WinsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        postScoreButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        SaveScoreMenuItem = new javax.swing.JMenuItem();
        AboutMenuOption = new javax.swing.JMenuItem();
        QuitGameMenuItem = new javax.swing.JMenuItem();
        GameMenu = new javax.swing.JMenu();
        StartGameMenuItem = new javax.swing.JMenuItem();
        ResetScoreMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hangman");
        setResizable(false);

        hangScreenPanel.setLayout(null);

        hangScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/post.png"))); // NOI18N
        hangScreen.setAutoscrolls(true);
        hangScreen.setFocusable(false);
        hangScreenPanel.add(hangScreen);
        hangScreen.setBounds(10, 0, 260, 280);
        hangScreen.getAccessibleContext().setAccessibleName("IMAGE");

        Cbutton.setText("C");
        Cbutton.setToolTipText("");
        Cbutton.setEnabled(false);
        Cbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuttonActionPerformed(evt);
            }
        });

        Bbutton.setText("B");
        Bbutton.setToolTipText("");
        Bbutton.setEnabled(false);
        Bbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuttonActionPerformed(evt);
            }
        });

        Dbutton.setText("D");
        Dbutton.setToolTipText("");
        Dbutton.setEnabled(false);
        Dbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DbuttonActionPerformed(evt);
            }
        });

        Ebutton.setText("E");
        Ebutton.setToolTipText("");
        Ebutton.setEnabled(false);
        Ebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EbuttonActionPerformed(evt);
            }
        });

        Fbutton.setText("F");
        Fbutton.setToolTipText("");
        Fbutton.setEnabled(false);
        Fbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FbuttonActionPerformed(evt);
            }
        });

        Gbutton.setText("G");
        Gbutton.setToolTipText("");
        Gbutton.setEnabled(false);
        Gbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbuttonActionPerformed(evt);
            }
        });

        Ibutton.setText("I");
        Ibutton.setToolTipText("");
        Ibutton.setEnabled(false);
        Ibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IbuttonActionPerformed(evt);
            }
        });

        Hbutton.setText("H");
        Hbutton.setToolTipText("");
        Hbutton.setEnabled(false);
        Hbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HbuttonActionPerformed(evt);
            }
        });

        Jbutton.setText("J");
        Jbutton.setToolTipText("");
        Jbutton.setEnabled(false);
        Jbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonActionPerformed(evt);
            }
        });

        Sbutton.setToolTipText("");
        Sbutton.setEnabled(false);
        Sbutton.setLabel("S");
        Sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbuttonActionPerformed(evt);
            }
        });

        Rbutton.setToolTipText("");
        Rbutton.setEnabled(false);
        Rbutton.setLabel("R");
        Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbuttonActionPerformed(evt);
            }
        });

        Pbutton.setToolTipText("");
        Pbutton.setEnabled(false);
        Pbutton.setLabel("P");
        Pbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PbuttonActionPerformed(evt);
            }
        });

        Qbutton.setText("Q");
        Qbutton.setToolTipText("");
        Qbutton.setEnabled(false);
        Qbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QbuttonActionPerformed(evt);
            }
        });

        Obutton.setToolTipText("");
        Obutton.setEnabled(false);
        Obutton.setLabel("O");
        Obutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObuttonActionPerformed(evt);
            }
        });

        Lbutton.setText("L");
        Lbutton.setToolTipText("");
        Lbutton.setEnabled(false);
        Lbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LbuttonActionPerformed(evt);
            }
        });

        Mbutton.setToolTipText("");
        Mbutton.setEnabled(false);
        Mbutton.setLabel("M");
        Mbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MbuttonActionPerformed(evt);
            }
        });

        Nbutton.setToolTipText("");
        Nbutton.setEnabled(false);
        Nbutton.setLabel("N");
        Nbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NbuttonActionPerformed(evt);
            }
        });

        DifficultyLabel.setText("Difficulty:");

        triesLeftCountLabel.setText("Tries Left:");

        GuessthewordLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GuessthewordLabel.setText("Guess the word:");

        DifficultyCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Medium", "Hard" }));

        triesLeftScreen.setEditable(false);
        triesLeftScreen.setFont(new java.awt.Font("Digital Readout Thick Upright", 0, 24)); // NOI18N
        triesLeftScreen.setFocusable(false);

        startGameButton.setBackground(new java.awt.Color(255, 51, 51));
        startGameButton.setText("START GAME");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        Kbutton.setText("K");
        Kbutton.setToolTipText("");
        Kbutton.setEnabled(false);
        Kbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KbuttonActionPerformed(evt);
            }
        });

        Abutton.setText("A");
        Abutton.setToolTipText("");
        Abutton.setEnabled(false);
        Abutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbuttonActionPerformed(evt);
            }
        });

        Tbutton.setToolTipText("");
        Tbutton.setEnabled(false);
        Tbutton.setLabel("T");
        Tbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbuttonActionPerformed(evt);
            }
        });

        Ubutton.setToolTipText("");
        Ubutton.setEnabled(false);
        Ubutton.setLabel("U");
        Ubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbuttonActionPerformed(evt);
            }
        });

        Vbutton.setToolTipText("");
        Vbutton.setEnabled(false);
        Vbutton.setLabel("V");
        Vbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VbuttonActionPerformed(evt);
            }
        });

        Wbutton.setToolTipText("");
        Wbutton.setEnabled(false);
        Wbutton.setLabel("W");
        Wbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WbuttonActionPerformed(evt);
            }
        });

        Xbutton.setToolTipText("");
        Xbutton.setEnabled(false);
        Xbutton.setLabel("X");
        Xbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XbuttonActionPerformed(evt);
            }
        });

        Ybutton.setToolTipText("");
        Ybutton.setEnabled(false);
        Ybutton.setLabel("Y");
        Ybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YbuttonActionPerformed(evt);
            }
        });

        Zbutton.setToolTipText("");
        Zbutton.setEnabled(false);
        Zbutton.setLabel("Z");
        Zbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZbuttonActionPerformed(evt);
            }
        });

        GuessEnterButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        GuessEnterButton.setText("Enter");
        GuessEnterButton.setEnabled(false);
        GuessEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuessEnterButtonActionPerformed(evt);
            }
        });

        GuessWordBox.setBackground(new java.awt.Color(255, 255, 204));
        GuessWordBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GuessWordBox.setEnabled(false);
        GuessWordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuessWordBoxActionPerformed(evt);
            }
        });

        letterTile1.setEditable(false);
        letterTile1.setBackground(new java.awt.Color(204, 204, 204));
        letterTile1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile1.setToolTipText("This is the word you need to guess.");
        letterTile1.setFocusable(false);
        letterTile1.setName(""); // NOI18N
        letterTile1.setRequestFocusEnabled(false);

        letterTile2.setEditable(false);
        letterTile2.setBackground(new java.awt.Color(204, 204, 204));
        letterTile2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile2.setToolTipText("This is the word you need to guess.");
        letterTile2.setFocusable(false);
        letterTile2.setName(""); // NOI18N
        letterTile2.setRequestFocusEnabled(false);

        letterTile3.setEditable(false);
        letterTile3.setBackground(new java.awt.Color(204, 204, 204));
        letterTile3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile3.setToolTipText("This is the word you need to guess.");
        letterTile3.setFocusable(false);
        letterTile3.setName(""); // NOI18N
        letterTile3.setRequestFocusEnabled(false);

        letterTile5.setEditable(false);
        letterTile5.setBackground(new java.awt.Color(204, 204, 204));
        letterTile5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile5.setToolTipText("This is the word you need to guess.");
        letterTile5.setFocusable(false);
        letterTile5.setName(""); // NOI18N
        letterTile5.setRequestFocusEnabled(false);

        letterTile4.setEditable(false);
        letterTile4.setBackground(new java.awt.Color(204, 204, 204));
        letterTile4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile4.setToolTipText("This is the word you need to guess.");
        letterTile4.setFocusable(false);
        letterTile4.setName(""); // NOI18N
        letterTile4.setRequestFocusEnabled(false);

        letterTile6.setEditable(false);
        letterTile6.setBackground(new java.awt.Color(204, 204, 204));
        letterTile6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile6.setToolTipText("This is the word you need to guess.");
        letterTile6.setFocusable(false);
        letterTile6.setName(""); // NOI18N
        letterTile6.setRequestFocusEnabled(false);

        letterTile7.setEditable(false);
        letterTile7.setBackground(new java.awt.Color(204, 204, 204));
        letterTile7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile7.setToolTipText("This is the word you need to guess.");
        letterTile7.setFocusable(false);
        letterTile7.setName(""); // NOI18N
        letterTile7.setRequestFocusEnabled(false);

        letterTile8.setEditable(false);
        letterTile8.setBackground(new java.awt.Color(204, 204, 204));
        letterTile8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile8.setToolTipText("This is the word you need to guess.");
        letterTile8.setFocusable(false);
        letterTile8.setName(""); // NOI18N
        letterTile8.setRequestFocusEnabled(false);

        letterTile9.setEditable(false);
        letterTile9.setBackground(new java.awt.Color(204, 204, 204));
        letterTile9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile9.setToolTipText("This is the word you need to guess.");
        letterTile9.setFocusable(false);
        letterTile9.setName(""); // NOI18N
        letterTile9.setRequestFocusEnabled(false);

        letterTile10.setEditable(false);
        letterTile10.setBackground(new java.awt.Color(204, 204, 204));
        letterTile10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile10.setToolTipText("This is the word you need to guess.");
        letterTile10.setFocusable(false);
        letterTile10.setName(""); // NOI18N
        letterTile10.setRequestFocusEnabled(false);

        letterTile12.setEditable(false);
        letterTile12.setBackground(new java.awt.Color(204, 204, 204));
        letterTile12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile12.setToolTipText("This is the word you need to guess.");
        letterTile12.setFocusable(false);
        letterTile12.setName(""); // NOI18N
        letterTile12.setRequestFocusEnabled(false);

        letterTile11.setEditable(false);
        letterTile11.setBackground(new java.awt.Color(204, 204, 204));
        letterTile11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        letterTile11.setToolTipText("This is the word you need to guess.");
        letterTile11.setFocusable(false);
        letterTile11.setName(""); // NOI18N
        letterTile11.setRequestFocusEnabled(false);

        LossesScreen.setEditable(false);
        LossesScreen.setFont(new java.awt.Font("Digital Readout Thick Upright", 0, 24)); // NOI18N
        LossesScreen.setFocusable(false);

        WinsScreen.setEditable(false);
        WinsScreen.setFont(new java.awt.Font("Digital Readout Thick Upright", 0, 24)); // NOI18N
        WinsScreen.setFocusable(false);

        WinsLabel.setText("WINS");

        jLabel1.setText("LOSSES");

        postScoreButton.setBackground(new java.awt.Color(255, 51, 51));
        postScoreButton.setText("POST SCORE");
        postScoreButton.setEnabled(false);
        postScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postScoreButtonActionPerformed(evt);
            }
        });

        FileMenu.setText("File");

        SaveScoreMenuItem.setText("Save Score");
        SaveScoreMenuItem.setToolTipText("Saves your current score to a file.");
        SaveScoreMenuItem.setEnabled(false);
        FileMenu.add(SaveScoreMenuItem);

        AboutMenuOption.setText("About...");
        AboutMenuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuOptionActionPerformed(evt);
            }
        });
        FileMenu.add(AboutMenuOption);

        QuitGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        QuitGameMenuItem.setText("Quit");
        QuitGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitGameMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(QuitGameMenuItem);

        jMenuBar1.add(FileMenu);

        GameMenu.setText("Game");

        StartGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        StartGameMenuItem.setText("Start New Game");
        StartGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(StartGameMenuItem);

        ResetScoreMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        ResetScoreMenuItem.setText("Reset Score");
        ResetScoreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetScoreMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(ResetScoreMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Post Score");
        GameMenu.add(jMenuItem1);

        jMenuBar1.add(GameMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hangScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(GuessthewordLabel)
                                                .addGap(181, 181, 181))
                                            .addComponent(GuessWordBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GuessEnterButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(letterTile1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(letterTile12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(triesLeftScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(triesLeftCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(188, 188, 188)
                                                .addComponent(DifficultyLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(WinsLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DifficultyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WinsScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(LossesScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(postScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Abutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ibutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Kbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ubutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Wbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Xbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ybutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Zbutton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Obutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Qbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sbutton)))))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hangScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DifficultyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DifficultyLabel))
                                .addGap(18, 18, 18)
                                .addComponent(startGameButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postScoreButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(WinsLabel)
                                    .addComponent(triesLeftCountLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LossesScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WinsScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(triesLeftScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(letterTile1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letterTile11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GuessWordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GuessthewordLabel))
                            .addComponent(GuessEnterButton))
                        .addGap(22, 22, 22)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cbutton)
                    .addComponent(Bbutton)
                    .addComponent(Dbutton)
                    .addComponent(Ebutton)
                    .addComponent(Fbutton)
                    .addComponent(Gbutton)
                    .addComponent(Hbutton)
                    .addComponent(Ibutton)
                    .addComponent(Jbutton)
                    .addComponent(Abutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mbutton)
                    .addComponent(Lbutton)
                    .addComponent(Nbutton)
                    .addComponent(Obutton)
                    .addComponent(Pbutton)
                    .addComponent(Qbutton)
                    .addComponent(Rbutton)
                    .addComponent(Sbutton)
                    .addComponent(Kbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vbutton)
                    .addComponent(Ubutton)
                    .addComponent(Wbutton)
                    .addComponent(Xbutton)
                    .addComponent(Ybutton)
                    .addComponent(Zbutton)
                    .addComponent(Tbutton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        DifficultyLabel.getAccessibleContext().setAccessibleName("DifficultyLabel");
        triesLeftCountLabel.getAccessibleContext().setAccessibleName(":");
        GuessWordBox.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=START-GAME-BUTTON-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed

        //"disable" or flip all of the letter tiles by making them all grey.  (they're actually all disabled always, so the user can't cheat.)
        letterTile1.setBackground(Color.lightGray);
        letterTile1.setText("");
        letterTile2.setBackground(Color.lightGray);
        letterTile2.setText("");
        letterTile3.setBackground(Color.lightGray);
        letterTile3.setText("");
        letterTile4.setBackground(Color.lightGray);
        letterTile4.setText("");
        letterTile5.setBackground(Color.lightGray);
        letterTile5.setText("");
        letterTile6.setBackground(Color.lightGray);
        letterTile6.setText("");
        letterTile7.setBackground(Color.lightGray);
        letterTile7.setText("");
        letterTile8.setBackground(Color.lightGray);
        letterTile8.setText("");
        letterTile9.setBackground(Color.lightGray);
        letterTile9.setText("");
        letterTile10.setBackground(Color.lightGray);
        letterTile10.setText("");
        letterTile11.setBackground(Color.lightGray);
        letterTile11.setText("");
        letterTile12.setBackground(Color.lightGray);
        letterTile12.setText("");

        //clear the guess word box, and the answer box.
        GuessWordBox.setText("");

        //set the wins and losses screens with the variable stored
        WinsScreen.setText(Integer.toString(winsCounter));
        LossesScreen.setText(Integer.toString(loseCounter));

        //re-enable all of the buttons, they are disabled until a new game is started.
        Abutton.setEnabled(true);
        Bbutton.setEnabled(true);
        Cbutton.setEnabled(true);
        Dbutton.setEnabled(true);
        Ebutton.setEnabled(true);
        Fbutton.setEnabled(true);
        Gbutton.setEnabled(true);
        Hbutton.setEnabled(true);
        Ibutton.setEnabled(true);
        Jbutton.setEnabled(true);
        Kbutton.setEnabled(true);
        Lbutton.setEnabled(true);
        Mbutton.setEnabled(true);
        Nbutton.setEnabled(true);
        Obutton.setEnabled(true);
        Pbutton.setEnabled(true);
        Qbutton.setEnabled(true);
        Rbutton.setEnabled(true);
        Sbutton.setEnabled(true);
        Tbutton.setEnabled(true);
        Ubutton.setEnabled(true);
        Vbutton.setEnabled(true);
        Wbutton.setEnabled(true);
        Xbutton.setEnabled(true);
        Ybutton.setEnabled(true);
        Zbutton.setEnabled(true);
        GuessEnterButton.setEnabled(true);
        GuessWordBox.setEnabled(true);
        GuessEnterButton.setEnabled(true);
        GuessWordBox.setEnabled(true);

        //set icon and tries counter
        hangScreen.setIcon(Post);
        chancesLeftCounter = 6;
        triesLeftScreen.setText("6");

        //get user requested difficulty. index 0 is easy, index 1 is medium, index 2 is hard.
        difficulty = DifficultyCombobox.getSelectedIndex();
        System.out.println("\ndifficulty index: " + difficulty );
        
        //Can they post their score yet?
        if (gamesCounter >= 3){
            postScoreButton.setEnabled(true);
        }
            
        switch (difficulty) {
            case 0:
                //easy game started
                
                //shuffle the bag and pick a word
                wordToGuess = game.doWordBag1();
                System.out.println("Word: " + wordToGuess);
                //Set up the guesser tiles.
                wordToGuessLength = wordToGuess.length();
                initializeTiles(wordToGuessLength);
                break;
            case 1:
                //medium game started
                
                //shuffle the bag and pick a word
                wordToGuess = game.doWordBag2();
                System.out.println("Word: " + wordToGuess);
                //Set up the guesser tiles.
                wordToGuessLength = wordToGuess.length();
                initializeTiles(wordToGuessLength);
                break;
            case 2:
                //hard game started
                
                //shuffle the bag and pick a word
                wordToGuess = game.doWordBag3();
                System.out.println("Word: " + wordToGuess);
                //Set up the guesser tiles.
                wordToGuessLength = wordToGuess.length();
                initializeTiles(wordToGuessLength);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_startGameButtonActionPerformed

    //A Button Press
    private void AbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbuttonActionPerformed
        letter = 'a';
        Abutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_AbuttonActionPerformed

    //Send in the word guessed in the text box
    private void GuessEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuessEnterButtonActionPerformed
        guessedWord = GuessWordBox.getText();
        guessedWord = guessedWord.toLowerCase();
        if (guessedWord.equals(wordToGuess)){
            //winner!
            disableGame();
            winsCounter++;
            WinsScreen.setText(Integer.toString(winsCounter));

            hangScreen.setIcon(Winner);
            gamesCounter++;
            
            showWord();
        }
        else{
            //wrong response, but game isn't over. remove a chance left.
            chancesLeftCounter--;
            triesLeftScreen.setText(Integer.toString(chancesLeftCounter));
            changeHangmanIcon();
            GuessWordBox.setText("");
            
            if (chancesLeftCounter == 0){
                showWord();
            }
        }
    }//GEN-LAST:event_GuessEnterButtonActionPerformed

    //B Button Press
    private void BbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuttonActionPerformed
        letter = 'b';
        Bbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_BbuttonActionPerformed

    //C Button Press
    private void CbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuttonActionPerformed
        letter = 'c';
        Cbutton.setEnabled(false);
        letterPress(letter);

    }//GEN-LAST:event_CbuttonActionPerformed

    //D Button Press
    private void DbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DbuttonActionPerformed
        letter = 'd';
        Dbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_DbuttonActionPerformed

    //E Button Press
    private void EbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EbuttonActionPerformed
        letter = 'e';
        Ebutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_EbuttonActionPerformed

    //F Button Press
    private void FbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FbuttonActionPerformed
        letter = 'f';
        Fbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_FbuttonActionPerformed

    //G Button Press
    private void GbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbuttonActionPerformed
        letter = 'g';
        Gbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_GbuttonActionPerformed

    //H Button Press
    private void HbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HbuttonActionPerformed
        letter = 'h';
        Hbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_HbuttonActionPerformed

    //I Button Press
    private void IbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IbuttonActionPerformed
        letter = 'i';
        Ibutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_IbuttonActionPerformed

    //J Button Press
    private void JbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonActionPerformed
        letter = 'j';
        Jbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_JbuttonActionPerformed

    //K Button Press
    private void KbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KbuttonActionPerformed
        letter = 'k';
        Kbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_KbuttonActionPerformed

    //L Button Press
    private void LbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LbuttonActionPerformed
        letter = 'l';     
        Lbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_LbuttonActionPerformed

    //M Button Press
    private void MbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MbuttonActionPerformed
        letter = 'm';
        Mbutton.setEnabled(false);
        letterPress(letter);
    }//GEN-LAST:event_MbuttonActionPerformed

    //N Button Press
    private void NbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NbuttonActionPerformed
        letter = 'n';        
        Nbutton.setEnabled(false);
        letterPress(letter);  
    }//GEN-LAST:event_NbuttonActionPerformed

    //O Button Press
    private void ObuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObuttonActionPerformed
        letter = 'o';
        Obutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_ObuttonActionPerformed

    //P Button Press
    private void PbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PbuttonActionPerformed
        letter = 'p';
        Pbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_PbuttonActionPerformed

    //Q Button Press
    private void QbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QbuttonActionPerformed
        letter = 'q';
        Qbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_QbuttonActionPerformed

    //R Button Press
    private void RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbuttonActionPerformed
        letter = 'r';
        Rbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_RbuttonActionPerformed

    //S Button Press
    private void SbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbuttonActionPerformed
        letter = 's';
        Sbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_SbuttonActionPerformed

    //T Button Press
    private void TbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbuttonActionPerformed
        letter = 't';
        Tbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_TbuttonActionPerformed

    //U Button Press
    private void UbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbuttonActionPerformed
        letter = 'u';
        Ubutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_UbuttonActionPerformed

    //V Button Press
    private void VbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VbuttonActionPerformed
        letter = 'v';
        Vbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_VbuttonActionPerformed

    //W Button Press
    private void WbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WbuttonActionPerformed
        letter = 'w';
        Wbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_WbuttonActionPerformed

    //X Button Press
    private void XbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XbuttonActionPerformed
        letter = 'x';
        Xbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_XbuttonActionPerformed

    //Y Button Press
    private void YbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YbuttonActionPerformed
        letter = 'y';
        Ybutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_YbuttonActionPerformed

    //Z Button Press
    private void ZbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZbuttonActionPerformed
        letter = 'z';
        Zbutton.setEnabled(false);
        letterPress(letter); 
    }//GEN-LAST:event_ZbuttonActionPerformed

    //File>Quit, Quits the game
    private void QuitGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitGameMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_QuitGameMenuItemActionPerformed

    //will call the code from the StartGame button, to begin a new game.
    private void StartGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameMenuItemActionPerformed
        startGameButtonActionPerformed(evt);
    }//GEN-LAST:event_StartGameMenuItemActionPerformed

    //Game>resetScore - resets win/loss counter back to zero.
    private void ResetScoreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetScoreMenuItemActionPerformed
        int n = JOptionPane.showConfirmDialog(
            rootPane,
            "You are about to reset your score.\n"
                    + "You worked hard for those wins...and losses.\n"
                    + "Are you sure you want to reset? There's no going back.",
            "Score reset confirmation",
            JOptionPane.YES_NO_OPTION
        );
        System.out.println("JOptionPane_ScoreReset var: " + n);
        
        if (n == 0){               
            loseCounter = 0;
            LossesScreen.setText(Integer.toString(loseCounter));

            winsCounter = 0;
            WinsScreen.setText(Integer.toString(winsCounter));
        }
    }//GEN-LAST:event_ResetScoreMenuItemActionPerformed

    //File>About... menu option.. just shows a dialog with a little bit of information about my project.
    private void AboutMenuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuOptionActionPerformed
        JOptionPane.showMessageDialog(rootPane,
                "                                        H A N G M A N             \n"
              + "This is a simple GUI Program involving the clasic game \"Hangman\".\n"
              + "This project was written entirely in Java by Danielle Marcoullier.\n"
              + "You can find out more about this project on Github at:            \n"
              + "           https://github.com/reprise5/Hangman                    \n", 
                "**About HANGMAN**", WIDTH, null);
    }//GEN-LAST:event_AboutMenuOptionActionPerformed

    //Post score to HANGMANALLTIMETABLE.
    private void postScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postScoreButtonActionPerformed
        //if no username set, they did not log-in.  Don't post.
        if (username.equals("")){
            JOptionPane.showMessageDialog(rootPane, "You must log in on the main page to post your score.", "Please log in", 2);
        }
        else {
            //if the score amounts to 0, do not post it.
            if(winsCounter != 0 && loseCounter != 0 || winsCounter != 0){
                score = ( (double)winsCounter / ((double)winsCounter + (double)loseCounter) * 100);

                    //add the score to its correct table, then update the player's account
                    database.addScore(username, score, "hangman", "HANGMANALLTIME");
                database.updatePlayerAccount(username, score, "HANGMAN");
                postScoreButton.setEnabled(false);
            }
            else{
                System.out.println("Did not post 0 score.");
                postScoreButton.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane, "You must achieve a score higher than 0 to\n participate in the leaderboards.", "Score too low", 0); 
            }
        }
    }//GEN-LAST:event_postScoreButtonActionPerformed

    private void GuessWordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuessWordBoxActionPerformed
        GuessEnterButtonActionPerformed(evt);
    }//GEN-LAST:event_GuessWordBoxActionPerformed

    //When the user presses a letter on the keypad, the game shoul react in this way:
    public void letterPress(char letter){
       
        correctResponse = game.testLetterResponse(letter);
        if (correctResponse){
            int index;

            index = wordToGuess.indexOf(letter);
            System.out.println("FirstInstanceIndex: " + index);
            //Send to switchTiles(); subroutine to flip the tiles with the button's letter, at the index found here.
            flipTile(index, String.valueOf(letter));

            while (index !=  -1) {
                index = wordToGuess.indexOf(letter, index + 1);
                System.out.println("NextInstanceIndex: " + index);
                flipTile(index, String.valueOf(letter));
            }
        }
        else{
            //they're wrong so take away a chance left.
            chancesLeftCounter--;
            triesLeftScreen.setText(Integer.toString(chancesLeftCounter));
            changeHangmanIcon();
            GuessWordBox.setText("");
        }
        if(!testTileWin(wordToGuessLength) && chancesLeftCounter == 0){
            
        }
    }
    
    //Update Global username Score recieved from continue-as...
    public boolean setUsername(String username){
        if(username != null){
            this.username = username;
            return true;
        }
        else return false;
    }
    
    //based on how many tries left, will update the hangman image.
    private void changeHangmanIcon(){
        switch (chancesLeftCounter){
            case 5: 
                hangScreen.setIcon(Wrong1);
                break;
            case 4: 
                hangScreen.setIcon(Wrong2);
                break;
            case 3: 
                hangScreen.setIcon(Wrong3);
                break;
            case 2: 
                hangScreen.setIcon(Wrong4);
                break;
            case 1: 
                hangScreen.setIcon(Wrong5);
                break;
            case 0: 
                //the game is over
                hangScreen.setIcon(Wrong6);
                //and then disable all of the buttons.  they will be re-enabled when the user clicks "start game".
                disableGame();

                //update the losses counter and screen
                loseCounter++;
                LossesScreen.setText(Integer.toString(loseCounter));
                
                gamesCounter++;     //for posting rules  
                break;
        }
    }
    
    //shows the correct word on the tiles when the game is over.
    public void showWord(){
        switch (wordToGuessLength){
            case 1:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                break;
            case 2:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                break;
            case 3:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                break;
            case 4:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());
                break;
            case 5:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                break;
            case 6:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                letterTile6.setText(Character.toString(wordToGuess.charAt(5)).toUpperCase());
                break;
            case 7:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                letterTile6.setText(Character.toString(wordToGuess.charAt(5)).toUpperCase());
                letterTile7.setText(Character.toString(wordToGuess.charAt(6)).toUpperCase());
                break;
            case 8:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                letterTile6.setText(Character.toString(wordToGuess.charAt(5)).toUpperCase());
                letterTile7.setText(Character.toString(wordToGuess.charAt(6)).toUpperCase());
                letterTile8.setText(Character.toString(wordToGuess.charAt(7)).toUpperCase());
                break;
            case 9:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                letterTile6.setText(Character.toString(wordToGuess.charAt(5)).toUpperCase());
                letterTile7.setText(Character.toString(wordToGuess.charAt(6)).toUpperCase());
                letterTile8.setText(Character.toString(wordToGuess.charAt(7)).toUpperCase());
                letterTile9.setText(Character.toString(wordToGuess.charAt(8)).toUpperCase());
                break;
            case 10:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                letterTile6.setText(Character.toString(wordToGuess.charAt(5)).toUpperCase());
                letterTile7.setText(Character.toString(wordToGuess.charAt(6)).toUpperCase());
                letterTile8.setText(Character.toString(wordToGuess.charAt(7)).toUpperCase());
                letterTile9.setText(Character.toString(wordToGuess.charAt(8)).toUpperCase());
                letterTile10.setText(Character.toString(wordToGuess.charAt(9)).toUpperCase());
                break;
            case 11:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                letterTile6.setText(Character.toString(wordToGuess.charAt(5)).toUpperCase());
                letterTile7.setText(Character.toString(wordToGuess.charAt(6)).toUpperCase());
                letterTile8.setText(Character.toString(wordToGuess.charAt(7)).toUpperCase());
                letterTile9.setText(Character.toString(wordToGuess.charAt(8)).toUpperCase());
                letterTile10.setText(Character.toString(wordToGuess.charAt(9)).toUpperCase());
                letterTile11.setText(Character.toString(wordToGuess.charAt(10)).toUpperCase());
                break;
            case 12:
                letterTile1.setText(Character.toString(wordToGuess.charAt(0)).toUpperCase());
                letterTile2.setText(Character.toString(wordToGuess.charAt(1)).toUpperCase());
                letterTile3.setText(Character.toString(wordToGuess.charAt(2)).toUpperCase());
                letterTile4.setText(Character.toString(wordToGuess.charAt(3)).toUpperCase());               
                letterTile5.setText(Character.toString(wordToGuess.charAt(4)).toUpperCase());
                letterTile6.setText(Character.toString(wordToGuess.charAt(5)).toUpperCase());
                letterTile7.setText(Character.toString(wordToGuess.charAt(6)).toUpperCase());
                letterTile8.setText(Character.toString(wordToGuess.charAt(7)).toUpperCase());
                letterTile9.setText(Character.toString(wordToGuess.charAt(8)).toUpperCase());
                letterTile10.setText(Character.toString(wordToGuess.charAt(9)).toUpperCase());
                letterTile11.setText(Character.toString(wordToGuess.charAt(10)).toUpperCase());
                letterTile12.setText(Character.toString(wordToGuess.charAt(11)).toUpperCase());
                break;
        }   
    }

    //based on how many letters in the secret word, it will "initialize" that many tiles with color and underscore.
    public void initializeTiles(int wordToGuessLength){
        switch (wordToGuessLength){
            case 1:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                break;
            case 2:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                break;
            case 3:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                break;
            case 4:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                break;
            case 5:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                break;
            case 6:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                letterTile6.setBackground(Color.cyan);
                letterTile6.setText("_");
                break;
            case 7:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                letterTile6.setBackground(Color.cyan);
                letterTile6.setText("_");
                letterTile7.setBackground(Color.cyan);
                letterTile7.setText("_");
                break;
            case 8:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                letterTile6.setBackground(Color.cyan);
                letterTile6.setText("_");
                letterTile7.setBackground(Color.cyan);
                letterTile7.setText("_");
                letterTile8.setBackground(Color.cyan);
                letterTile8.setText("_");
                break;
            case 9:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                letterTile6.setBackground(Color.cyan);
                letterTile6.setText("_");
                letterTile7.setBackground(Color.cyan);
                letterTile7.setText("_");
                letterTile8.setBackground(Color.cyan);
                letterTile8.setText("_");
                letterTile9.setBackground(Color.cyan);
                letterTile9.setText("_");
                break;
            case 10:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                letterTile6.setBackground(Color.cyan);
                letterTile6.setText("_");
                letterTile7.setBackground(Color.cyan);
                letterTile7.setText("_");
                letterTile8.setBackground(Color.cyan);
                letterTile8.setText("_");
                letterTile9.setBackground(Color.cyan);
                letterTile9.setText("_");
                letterTile10.setBackground(Color.cyan);
                letterTile10.setText("_");
                break;
            case 11:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                letterTile6.setBackground(Color.cyan);
                letterTile6.setText("_");
                letterTile7.setBackground(Color.cyan);
                letterTile7.setText("_");
                letterTile8.setBackground(Color.cyan);
                letterTile8.setText("_");
                letterTile9.setBackground(Color.cyan);
                letterTile9.setText("_");
                letterTile10.setBackground(Color.cyan);
                letterTile10.setText("_");
                letterTile11.setBackground(Color.cyan);
                letterTile11.setText("_");
                break;
            case 12:
                letterTile1.setBackground(Color.cyan);
                letterTile1.setText("_");
                letterTile2.setBackground(Color.cyan);
                letterTile2.setText("_");
                letterTile3.setBackground(Color.cyan);
                letterTile3.setText("_");
                letterTile4.setBackground(Color.cyan);
                letterTile4.setText("_");
                letterTile5.setBackground(Color.cyan);
                letterTile5.setText("_");
                letterTile6.setBackground(Color.cyan);
                letterTile6.setText("_");
                letterTile7.setBackground(Color.cyan);
                letterTile7.setText("_");
                letterTile8.setBackground(Color.cyan);
                letterTile8.setText("_");
                letterTile9.setBackground(Color.cyan);
                letterTile9.setText("_");
                letterTile10.setBackground(Color.cyan);
                letterTile10.setText("_");
                letterTile11.setBackground(Color.cyan);
                letterTile11.setText("_");
                letterTile12.setBackground(Color.cyan);
                letterTile12.setText("_");
                break;
        }
    }

    //Change a previously "activated" (underscore) tile into the letter it is supposed to be after the user guesses it right.
    public void flipTile(int index, String letter){
        switch (index){
            case 0:
                //flip tile 1 to the letter sent, at this index.
                letterTile1.setText(letter.toUpperCase());
                break;
            case 1:
                //flip tile 2 to the letter sent, at this index.
                letterTile2.setText(letter.toUpperCase());
                break;
            case 2:
                //flip tile 3 to the letter sent, at this index.
                letterTile3.setText(letter.toUpperCase());
                break;
            case 3:
                //flip tile 4 to the letter sent, at this index.
                letterTile4.setText(letter.toUpperCase());
                break;
            case 4:
                //flip tile 5 to the letter sent, at this index.
                letterTile5.setText(letter.toUpperCase());
                break;
            case 5:
                //flip tile 6 to the letter sent, at this index.
                letterTile6.setText(letter.toUpperCase());
                break;
            case 6:
                //flip tile 7 to the letter sent, at this index.
                letterTile7.setText(letter.toUpperCase());
                break;
            case 7:
                //flip tile 8 to the letter sent, at this index.
                letterTile8.setText(letter.toUpperCase());
                break;
            case 8:
                //flip tile 9 to the letter sent, at this index.
                letterTile9.setText(letter.toUpperCase());
                break;
            case 9:
                //flip tile 10 to the letter sent, at this index.
                letterTile10.setText(letter.toUpperCase());
                break;
            case 10:
                //flip tile 11 to the letter sent, at this index.
                letterTile11.setText(letter.toUpperCase());
                break;
            case 11:
                //flip tile 12 to the letter sent, at this index.
                letterTile12.setText(letter.toUpperCase());
                break;
        }
    }

    //tests if the user won by filling in tiles and not by typing the word in the box.
    public boolean testTileWin(int wordToGuessLength){
        boolean win = false;

        //based on how many tiles are initialized, or the wordToGuessLength, is how many tiles to check for underscores.
        switch (wordToGuessLength){
            case 1:
                //1 tile initialized, the word is 1 letter long. test that many tiles.
                if (!letterTile1.getText().equals("_")){
                    win = true;
                }
                break;
            case 2:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_")){
                    win = true;
                }
                break;
            case 3:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_")){
                    win = true;
                }
                break;
            case 4:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")){
                    win = true;
                }
                break;
            case 5:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_")){
                    win = true;
                }
                break;
            case 6:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_") && !letterTile6.getText().equals("_")){
                    win = true;
                }
                break;
            case 7:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_") && !letterTile6.getText().equals("_") && !letterTile7.getText().equals("_")){
                    win = true;
                }
                break;
            case 8:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_") && !letterTile6.getText().equals("_") && !letterTile7.getText().equals("_") && !letterTile8.getText().equals("_")){
                    win = true;
                }
                break;
            case 9:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_") && !letterTile6.getText().equals("_") && !letterTile7.getText().equals("_") && !letterTile8.getText().equals("_")
                        && !letterTile9.getText().equals("_")){
                    win = true;
                }
                break;
            case 10:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_") && !letterTile6.getText().equals("_") && !letterTile7.getText().equals("_") && !letterTile8.getText().equals("_")
                        && !letterTile9.getText().equals("_") && !letterTile10.getText().equals("_")){
                    win = true;
                }
                break;
            case 11:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_") && !letterTile6.getText().equals("_") && !letterTile7.getText().equals("_") && !letterTile8.getText().equals("_")
                        && !letterTile9.getText().equals("_") && !letterTile10.getText().equals("_") && !letterTile11.getText().equals("_")){
                    win = true;
                }
                break;
            case 12:
                if (!letterTile1.getText().equals("_") && !letterTile2.getText().equals("_") && !letterTile3.getText().equals("_") && !letterTile4.getText().equals("_")
                        && !letterTile5.getText().equals("_") && !letterTile6.getText().equals("_") && !letterTile7.getText().equals("_") && !letterTile8.getText().equals("_")
                        && !letterTile9.getText().equals("_") && !letterTile10.getText().equals("_") && !letterTile11.getText().equals("_") && !letterTile12.getText().equals("_")){
                    win = true;
                }
                break;
        } //end switch(wordToGuessLength)

        if (win){
            winsCounter++;
            WinsScreen.setText(Integer.toString(winsCounter));
            System.out.println("Games Played: " + gamesCounter);
            gamesCounter++;     //for posting rules.
            chancesLeftCounter = 0;
            disableGame();
            hangScreen.setIcon(Winner);
        }
        else if (!win && chancesLeftCounter == 0){
            showWord();
        }
        
        return win;
    }

    //simply disables the buttons and other graphical items.  used when the game has ended
    public void disableGame(){
        Abutton.setEnabled(false);
        Bbutton.setEnabled(false);
        Cbutton.setEnabled(false);
        Dbutton.setEnabled(false);
        Ebutton.setEnabled(false);
        Fbutton.setEnabled(false);
        Gbutton.setEnabled(false);
        Hbutton.setEnabled(false);
        Ibutton.setEnabled(false);
        Jbutton.setEnabled(false);
        Kbutton.setEnabled(false);
        Lbutton.setEnabled(false);
        Mbutton.setEnabled(false);
        Nbutton.setEnabled(false);
        Obutton.setEnabled(false);
        Pbutton.setEnabled(false);
        Qbutton.setEnabled(false);
        Rbutton.setEnabled(false);
        Sbutton.setEnabled(false);
        Tbutton.setEnabled(false);
        Ubutton.setEnabled(false);
        Vbutton.setEnabled(false);
        Wbutton.setEnabled(false);
        Xbutton.setEnabled(false);
        Ybutton.setEnabled(false);
        Zbutton.setEnabled(false);
        GuessEnterButton.setEnabled(false);
        GuessWordBox.setEnabled(false);
    }
    
    //Reset the game data so that it's a new Game-Day.  they must play at least 3 games to score.
    public void resetPostRule(){
        gamesCounter = 0;
        postScoreButton.setEnabled(false);
        
        loseCounter = 0;
        LossesScreen.setText(Integer.toString(loseCounter));

        winsCounter = 0;
        WinsScreen.setText(Integer.toString(winsCounter));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutMenuOption;
    private javax.swing.JButton Abutton;
    private javax.swing.JButton Bbutton;
    private javax.swing.JButton Cbutton;
    private javax.swing.JButton Dbutton;
    private javax.swing.JComboBox DifficultyCombobox;
    private javax.swing.JLabel DifficultyLabel;
    private javax.swing.JButton Ebutton;
    private javax.swing.JButton Fbutton;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu GameMenu;
    private javax.swing.JButton Gbutton;
    private javax.swing.JButton GuessEnterButton;
    private javax.swing.JTextField GuessWordBox;
    private javax.swing.JLabel GuessthewordLabel;
    private javax.swing.JButton Hbutton;
    private javax.swing.JButton Ibutton;
    private javax.swing.JButton Jbutton;
    private javax.swing.JButton Kbutton;
    private javax.swing.JButton Lbutton;
    private javax.swing.JTextField LossesScreen;
    private javax.swing.JButton Mbutton;
    private javax.swing.JButton Nbutton;
    private javax.swing.JButton Obutton;
    private javax.swing.JButton Pbutton;
    private javax.swing.JButton Qbutton;
    private javax.swing.JMenuItem QuitGameMenuItem;
    private javax.swing.JButton Rbutton;
    private javax.swing.JMenuItem ResetScoreMenuItem;
    private javax.swing.JMenuItem SaveScoreMenuItem;
    private javax.swing.JButton Sbutton;
    private javax.swing.JMenuItem StartGameMenuItem;
    private javax.swing.JButton Tbutton;
    private javax.swing.JButton Ubutton;
    private javax.swing.JButton Vbutton;
    private javax.swing.JButton Wbutton;
    private javax.swing.JLabel WinsLabel;
    private javax.swing.JTextField WinsScreen;
    private javax.swing.JButton Xbutton;
    private javax.swing.JButton Ybutton;
    private javax.swing.JButton Zbutton;
    private javax.swing.JLabel hangScreen;
    private javax.swing.JPanel hangScreenPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField letterTile1;
    private javax.swing.JTextField letterTile10;
    private javax.swing.JTextField letterTile11;
    private javax.swing.JTextField letterTile12;
    private javax.swing.JTextField letterTile2;
    private javax.swing.JTextField letterTile3;
    private javax.swing.JTextField letterTile4;
    private javax.swing.JTextField letterTile5;
    private javax.swing.JTextField letterTile6;
    private javax.swing.JTextField letterTile7;
    private javax.swing.JTextField letterTile8;
    private javax.swing.JTextField letterTile9;
    private javax.swing.JButton postScoreButton;
    private javax.swing.JButton startGameButton;
    private javax.swing.JLabel triesLeftCountLabel;
    private javax.swing.JTextField triesLeftScreen;
    // End of variables declaration//GEN-END:variables

    //GLOBAL VARIABLES:
    DatabaseControl database = new DatabaseControl("operator", "westfield", "jdbc:derby://localhost:1527/PPleaderboard");
    String username = "";           //Username of the person playing for posting to the leaderboard.
    double score = 0.0;             //The average wins vs losses to be sent to the database
    WordShuffle game = new WordShuffle();
    boolean correctResponse = false;//used to collect the returned value of testLetterResponse(String letter); checks if the char is in the word.
    boolean win = false;            //used to collect the returned value of testTileWin(int wordToGuessLength); did user fill all tiles?
    int difficulty = 0;             //difficulty index from the combo box.
    String wordToGuess = "";        //this is the word to test against.  the secret word.
    String guessedWord = "";        //what the user TYPED to guess.
    char letter;                    //guessed letter from a button
    int wordToGuessLength = 0;      //how long the wordToGuess is, used to draw the underscores.
    int chancesLeftCounter = 6;     //how many tries are left.  decrements with wrong attempts.
    int winsCounter = 0;            //tracks/tallies wins
    int loseCounter = 0;            //tracks/tallies losses
    int roundCounter = 0;           //Keeps track of how many games were played (won or lost, resets don't count).
    int gamesCounter = 0;           //tracks # of games won for post rules.  Must play min 3 games to post score.  reset when form closed.
    
    //Declaring icons used in hangScreen component.
    ImageIcon Post   = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/post.png"));
    ImageIcon Wrong1 = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/wrong1.png"));
    ImageIcon Wrong2 = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/wrong2.png"));
    ImageIcon Wrong3 = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/wrong3.png"));
    ImageIcon Wrong4 = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/wrong4.png"));
    ImageIcon Wrong5 = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/wrong5.png"));
    ImageIcon Wrong6 = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/wrong6.png"));
    ImageIcon Winner = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/hangman/a_winner.png"));
}
