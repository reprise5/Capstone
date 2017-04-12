/**
 * This is the computer player to Tic-Tac-Toe.  it acts as player 2
 * Who plays Naughts.  It prioritizes winning, then blocking. if all else fails,
 * it will guess to make a move.  It does not know how to detect or perform
 * forking (two possibilities for winning).
 * 
 * The labels for the move types like "LEFT COL" for example are visually represented
 * in a separate document.  It includes indeces and ID's.
 */

package PuzzPak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Dani Marcoullier (reprise)
 * 2017
 */
public class ComputerPlayer {
    //GLOBALS
    ArrayList<Character> pieces = new ArrayList<Character>(Arrays.asList('X','O'));
    Random randomGenerator = new Random();
    char[][] board;      //the internal gameboard
    int player;          //Who's turn it is.  0=Human, 1= Computer
    int ID;              //ID to return to the gameboard so it's tile can be flipped up.
    int randomNum;       //Random Num recieved from rollDice(), to help make a random move.
    private boolean done = false; //whether or not to done again (for playing random moves)
    
    //Main Constructor
    ComputerPlayer(char[][] board, int player){
        this.board = board;
        this.player = player;
    }
    
    public void showBoard(){
        System.out.println("this is computer Players copy of the board:");
        for (int b = 0; b < board.length; b++){
            System.out.println(board[b]);
        }                                 //      MY WORD! WE'RE ABOUT TO CRASH, CAP!
    }   //                                                (  ) (  )                           S  T  O  P
        //                                             ( )        ( )                         ---|##|---
    public int playTurn(char[][] board){  //                       ||\                           |##|
        //                                    [[  ]]_[[  ]]_[[  ]]<>|=\  CHOO CHOO ...AAAHHHH    |##|
        //                                     O  O  O   O  O   O --O =>                       <<#### 
        //           /==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/==/=<<####
        //                                                                                          ----can I win?
        //                                                                                          ----columns
        if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == '-'){      //LEFT COL 1
            board[2][0] = 'O';
            ID = 7;
        }
        else if(board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == '-'){ //LEFT COL 2
            board[1][0] = 'O';
            ID = 4;
        }
        else if(board[1][0] == 'O' && board[2][0] == 'O' && board[0][0] == '-'){ //LEFT COL 3
            board [0][0] = 'O';
            ID = 1;
        }
        else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == '-'){ //MIDD COL 1
            board [2][1] = 'O';
            ID = 8;
        }
        else if(board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] == '-'){ //MIDD COL 2
            board [1][1] = 'O';
            ID = 5;
        }
        else if(board[1][1] == 'O' && board[2][1] == 'O' && board[0][1] == '-'){ //MIDD COL 3
            board [0][1] = 'O';
            ID = 2;
        }
        else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == '-'){ //RIGT COL 1
            board [2][2] = 'O';
            ID = 9;
        }
        else if(board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == '-'){ //RIGT COL 2
            board [1][2] = 'O';
            ID = 6;
        }
        else if(board[1][2] == 'O' && board[2][2] == 'O' && board[0][2] == '-'){ //RIGT COL 3
            board [2][2] = 'O';
            ID = 3;
        }  //                                                                                   ----rows
        else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == '-'){ //TOP  ROW 1
            board [0][2] = 'O';
            ID = 3;
        }
        else if(board[0][0] == 'O' && board[0][2] == 'O' && board[0][1] == '-'){ //TOP  ROW 2
            board [0][1] = 'O';
            ID = 2;
        }
        else if(board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] == '-'){ //TOP  ROW 3
            board [0][0] = 'O';
            ID = 1;
        }
        else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == '-'){ //MIDL ROW 1
            board [1][2] = 'O';
            ID = 6;
        }
        else if(board[1][0] == 'O' && board[1][2] == 'O' && board[1][1] == '-'){ //MIDL ROW 2
            board [1][1] = 'O';
            ID = 5;
        }
        else if(board[1][2] == 'O' && board[2][2] == 'O' && board[1][0] == '-'){ //MIDL ROW 3
            board [1][0] = 'O';
            ID = 4;
        }
        else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == '-'){ //BTTM ROW 1
            board [2][2] = 'O';
            ID = 9;
        }
        else if(board[2][0] == 'O' && board[2][2] == 'O' && board[2][1] == '-'){ //BTTM ROW 2
            board [2][1] = 'O';
            ID = 8;
        }
        else if(board[2][1] == 'O' && board[2][2] == 'O' && board[2][0] == '-'){ //BTTM ROW 3
            board [2][0] = 'O';
            ID = 7;
        }  //                                                                                       ----diags
        else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == '-'){ //LEF DIAG 1
            board [2][0] = 'O';
            ID = 7;
        }
        else if(board[0][2] == 'O' && board[2][0] == 'O' && board[1][1] == '-'){ //LEF DIAG 2
            board [1][1] = 'O';
            ID = 5;
        }
        else if(board[1][1] == 'O' && board[2][0] == 'O' && board[0][2] == '-'){ //LEF DIAG 3
            board [0][2] = 'O';
            ID = 3;
        }
        else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == '-'){ //RIGT DIAG 1
            board [2][2] = 'O';
            ID = 9;
        }
        else if(board[0][0] == 'O' && board[2][2] == 'O' && board[1][1] == '-'){ //RIGT DIAG 2
            board [1][1] = 'O';
            ID = 5;
        }
        else if(board[1][1] == 'O' && board[2][2] == 'O' && board[0][0] == '-'){ //RIGT DIAG 3
            board [0][0] = 'O';
            ID = 1;
        }      //                                                                                   ----Should I block?
        else{  //                                                                                   ----columns
            if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == '-'){      //LEFT COL 1
                board[2][0] = 'O';
                ID = 7;
            }
            else if(board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == '-'){ //LEFT COL 2
                board[1][0] = 'O';
                ID = 4;
            }
            else if(board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == '-'){ //LEFT COL 3
                board [0][0] = 'O';        
                ID = 1;
            }
            else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == '-'){ //MIDD COL 1
                board [2][1] = 'O';
                ID = 8;
            }
            else if(board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == '-'){ //MIDD COL 2
                board [1][1] = 'O';
                ID = 5;
            }
            else if(board[1][1] == 'X' && board[2][1] == 'X' && board[0][1] == '-'){ //MIDD COL 3
                board [0][1] = 'O';
                ID = 2;
            }
            else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == '-'){ //RIGT COL 1
                board [2][2] = 'O';
                ID = 9;
            }
            else if(board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == '-'){ //RIGT COL 2
                board [1][2] = 'O';
                ID = 6;
            }
            else if(board[1][2] == 'X' && board[2][2] == 'X' && board[0][2] == '-'){ //RIGT COL 3
                board [0][2] = 'O';
                ID = 3;
            }  //                                                                                     ----rows
            else if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == '-'){ //TOP  ROW 1
                board [0][2] = 'O';
                ID = 3;
            }
            else if(board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == '-'){ //TOP  ROW 2
                board [0][1] = 'O';
                ID = 2;
            }
            else if(board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == '-'){ //TOP  ROW 3
                board [0][0] = 'O';
                ID = 1;
            }
            else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == '-'){ //MIDL ROW 1
                board [1][2] = 'O';
                ID = 6;
            }
            else if(board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == '-'){ //MIDL ROW 2
                board [1][1] = 'O';
                ID = 5;
            }
            else if(board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == '-'){ //MIDL ROW 3
                board [1][0] = 'O';
                ID = 4;
            }
            else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == '-'){ //BTTM ROW 1
                board [2][2] = 'O';
                ID = 9;
            }
            else if(board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == '-'){ //BTTM ROW 2
                board [2][1] = 'O';
                ID = 8;
            }
            else if(board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == '-'){ //BTTM ROW 3
                board [2][0] = 'O';
                ID = 7;
            }  //                                                                                   ----diags  
            else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == '-'){ //LEF DIAG 1
                board [2][0] = 'O';
                ID = 7;
            }
            else if(board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == '-'){ //LEF DIAG 2
                board [1][1] = 'O';
                ID = 5;
            }
            else if(board[1][1] == 'X' && board[2][0] == 'X' && board[0][2] == '-'){ //LEF DIAG 3
                board [0][2] = 'O';
                ID = 3;
            }
            else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == '-'){ //RIGT DIAG 1
                board [2][2] = 'O';
                ID = 9;
            }
            else if(board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == '-'){ //RIGT DIAG 2
                board [1][1] = 'O';
                ID = 5;
            }
            else if(board[1][1] == 'X' && board[2][2] == 'X' && board[0][0] == '-'){ //RIGT DIAG 3
                board [0][0] = 'O';
                ID = 1;
            }  //                                                                                   ----I Should guess.
            //if (X in this corner, or that, or that, or that, or middle, and not all 4)
                  //roll dice (for corner ID only)
                  //make move
                  //pass ID for icon flip           
            else {
                //PLAY A RANDOM MOVE (based on a roll of a dice)
                done = false;
                while(!done){
                    randomNum = rollDice();
                    System.out.println("DICE ROLL: " + randomNum);
                    
                    switch(randomNum){
                        case 0:
                            if(board[0][0] == '-'){
                                board[0][0] = 'O';
                                ID = 1;
                                done = true;
                            }
                            break;
                        case 1:
                            if(board[0][1] == '-'){
                                board[0][1] = 'O';
                                ID = 2;
                                done = true;
                            }
                            break;
                        case 2:
                            if(board[0][2] == '-'){
                                board[0][2] = 'O';
                                ID = 3;
                                done = true;
                            }
                            break;
                        case 3:
                            if(board[1][0] == '-'){
                                board[1][0] = 'O';
                                ID = 4;
                                done = true;
                            }
                            break;
                        case 4:
                            if(board[1][1] == '-'){
                                board[1][1] = 'O';
                                ID = 5;
                                done = true;
                            }
                            break;
                        case 5:
                            if(board[1][2] == '-'){
                                board[1][2] = 'O';
                                ID = 6;
                                done = true;
                            }
                            break;
                        case 6:
                            if(board[2][0] == '-'){
                                board[2][0] = 'O';
                                ID = 7;
                                done = true;
                            }
                            break;
                        case 7:
                            if(board[2][1] == '-'){
                                board[2][1] = 'O';
                                ID = 8;
                                done = true;
                            }
                            break;
                        case 8:
                            if(board[2][2] == '-'){
                                board[2][2] = 'O';
                                ID = 9;
                                done = true;
                            }
                            break;
                    } 
                } 
            }
        }
        showBoard();
        return ID;
    }
    private int rollDice(){
        int number;
        //there are 9 possibilities for a move.
        number = randomGenerator.nextInt(8);
        return number;
    }
}