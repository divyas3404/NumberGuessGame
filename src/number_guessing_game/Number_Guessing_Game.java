/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number_guessing_game;



/**
 *
 * @author Naruto
 */
public class Number_Guessing_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumberGuess().setVisible(true);
            }
        });
    }
    
}
