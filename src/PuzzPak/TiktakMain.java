package PuzzPak;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author reprise
 */
public class TiktakMain {
    boolean tie = false;
    boolean win = false;

    public void run() throws InterruptedException{
        
        /* Create new thread to prevent hangup */
        Thread thread = new Thread() {
            public void run() {
                /* create a new form and open it. */
                TikTakForm game = new TikTakForm();
                
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
                            Logger.getLogger(TiktakMain.class.getName()).log(Level.SEVERE, null, ex);
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
    } 
    
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
}
