/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author Sail Away
 */
public class CardTester {
    
    public static void main(String[] args) {
	
	Card tenOfDiamonds = new Card("Diamonds", 10);
	
	System.out.printf("Your card is a %d of %s.%n", tenOfDiamonds.getValue(), 
		tenOfDiamonds.getSuit());
	
    }
    
}
