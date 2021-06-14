/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoadv;

/**
 *
 * @author Guilherme
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;
        
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinking about a number between 0 and 9...");
        while(true){
            System.out.println("The number to be guessed is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            
            if(p1.number == targetNumber && p2.number == targetNumber && p3.number == targetNumber)
            {
                System.out.println("All the players guessed right");
                break;
            }
            else if(p1.number == targetNumber && p2.number == targetNumber)
            {
                System.out.println("Player 1 and Player 2 won!");
                break;
            }
            else if(p1.number == targetNumber && p3.number == targetNumber){
                System.out.println("Player 1 and 3 won");
                break;
            }
            else if(p2.number == targetNumber && p3.number == targetNumber){
                System.out.println("Player 2 and 3 won");
                break;
            }
            else if(p1.number == targetNumber){
                System.out.println("Player 1 won!");
                break;
            }
            else if(p2.number == targetNumber){
                System.out.println("Player 2 won!");
                break;
            }
            else if(p3.number == targetNumber){
                System.out.println("Player 3 won!");
                break;
            }
            
        }
    } 
}
