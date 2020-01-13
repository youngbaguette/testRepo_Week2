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
public class Card {

    private String msuit;
    private int mvalue;

    public Card(String suit, int value) {
	setSuit(suit);
	setValue(value);
    }

    public String getSuit() {
	return msuit;
    }

    public void setSuit(String suit) {
	msuit = suit;
    }

    public int getValue() {
	return mvalue;
    }

    public void setValue(int value) {
	if (value > 0 && value < 14) {
	    mvalue = value;
	}
	else {
	    throw new IllegalArgumentException("That is not a value of a card! "
		    + "It must an integer from 1 to 13.");
	}
    }
    
    
    
    
}
