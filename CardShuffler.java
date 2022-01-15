package shuffler;

import java.util.ArrayList;
import java.util.Collections;

public class CardShuffler {

	String[] deck = new String[52];

	public String[] setDeck() {
		
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] nonNumericValues = {"Ace", "Jack", "Queen", "King"};

		for(int i = 0; i < 52; i++) {
				
			if(i % 13 == 0) {
				
				deck[i] = nonNumericValues[0] + " of " + suits[i / 13];
								
			} else if (i % 13 < 10) {
					
				deck[i] = (i % 13) + " of " + suits[i / 13];
					
			} else {
					
				deck[i] = nonNumericValues[(i % 13) - 9] + " of " + suits[i / 13];
					
			}
				
		}
		
		return deck;
			
	}
	
	public String[] shuffleDeck() {
		
		ArrayList<String> arrListDeck = new ArrayList<String>();
		
		for(int i = 0 ; i < 52; i++) arrListDeck.add(deck[i]);
			
		for(int a = 0; a < 100; a++) Collections.shuffle(arrListDeck);
		
		for(int b = 0; b < 52; b++) deck[b] = arrListDeck.get(b);
		
		return deck;
		
	}
	
	public static void printDeck(String[] printDeck) {
		
		for(int i = 0; i < 52; i++) System.out.println(printDeck[i]);
		
	}
	
	public String[] getDeck() {
		
		return deck;
		
	}
	
	public static void main(String[] args) {

		CardShuffler deck = new CardShuffler();
		deck.setDeck();
		CardShuffler.printDeck(deck.shuffleDeck());
			
	}

}