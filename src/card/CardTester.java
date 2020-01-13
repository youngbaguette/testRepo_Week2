// line added
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
