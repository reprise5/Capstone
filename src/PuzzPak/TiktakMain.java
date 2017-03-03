package PuzzPak;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author reprise
 */
public class TiktakMain {
    boolean tie = false;
    boolean win = false;
    //Main constructor
    public TiktakMain(){
       
    }
    
    public void run() throws InterruptedException{
        /* create a new form and open it. */
        TikTakForm game = new TikTakForm();
        game.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                int num = windowClosingSwitch(1);
                System.out.println("    <><> Form closing <><> (^_^)/");
            }
        });
        game.setVisible(true);
        
        /* keep track of the game */
        do{
            if (game.getPlayer() == 1){
                Thread.sleep(1100);
                
                win = game.checkWin2();
                tie = game.checkTie();
                
                if (!tie && !win){
                    game.playComputer();
                }
            }
        } while(windowClosingSwitch(0) == 0);
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
