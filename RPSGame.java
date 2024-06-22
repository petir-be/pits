package com.main;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RPSGame {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        gameNa();
        }
    
    public static void gameNa(){
        String[] option = new String[]{"rock","paper","scissor"};
        int user, computer, playerScore =0, computerScore =0;
        
        JOptionPane.showMessageDialog(null, "ROCK, PAPER, SCISSOR");
        
        while(playerScore < 3 && computerScore < 3){
            user = (int) JOptionPane.showOptionDialog(null, "ROCK, PAPER, SCISSOR", "nice", 0, 0, null, option, option[1]);
            
            computer = (int)(Math.random() * option.length );
            
            if(user == 3 && computer == 1 || computer > user){
                JOptionPane.showMessageDialog(null, "YOU LOSE!");
                computerScore++; 
            }
            else if(user > computer){
                JOptionPane.showMessageDialog(null, "YOU WIN!");
                playerScore++;
            }
            else{
                JOptionPane.showMessageDialog(null, "IT'S A TIE!!");
            }    
        }
        if(playerScore == 3){
            JOptionPane.showMessageDialog(null, "YOU WIN THE GAME!");
        }
        else{
            JOptionPane.showMessageDialog(null, "YOU LOSE the GAME!");
        }
    }
}
