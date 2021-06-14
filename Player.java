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
public class Player {
    int number = 0; // Este numero sera o palpite
    
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I am thinking in the number: " + number);
    }
    
}
