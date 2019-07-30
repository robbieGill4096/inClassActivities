import java.lang.reflect.Array;
import java.util.Random;

public class DeckOfCards implements DeckOfCardsInterface {
	private int decksize = 52;
	private Card[] cardDeck = new Card[decksize];
	private int nextCard = 0;
	DeckOfCards(){
		//Write a constructor that creates the new deck of cards. The constructor 
		//will need a nested loop to go over all combinations of Suit and Rank values 
		//to create a card for each of the 52 possibilities.
		
		int number = 0;
		for(Suit s : Suit.values()) {
			
		 for(Rank r : Rank.values()) {
			
			Card card = new Card(s,r);
			 cardDeck[number] = card;
			 number += 1;
		     //Create new card and add it to your deck.
			 //then moves to the next card.
		  }
		}

	}
	
	@Override
	public void shuffle() {
		for(int i = 0; i < cardDeck.length; i++) {
			Random randomNum = new Random();
			int j = randomNum.nextInt(cardDeck.length);
			int jCopy = j;
			cardDeck[i] = cardDeck[j];
			cardDeck[jCopy] = cardDeck[i];
			
		}

	}

	@Override
	public Card draw() {
		// TODO Auto-generated method stub
		if( nextCard < decksize) {
		Card topOfDeck = cardDeck[nextCard];
		nextCard +=1;
		return topOfDeck;}
		else {
			return null;
		}
	}

	@Override
	public int numCardsRemaining() {
		// TODO Auto-generated method stub
		return decksize-nextCard;
	}

	@Override
	public int numCardsDealt() {
		// TODO Auto-generated method stub
		return nextCard;
	}

	@Override
	public Card[] dealtCards() {
		// Return a new array containing only cards that have been dealt.
		Card[] copydeck = new Card[nextCard];
		for(int x = 0; x < nextCard; x++){
			copydeck[x] = cardDeck[x];
			System.out.println(copydeck[x]);
		}
		return copydeck;
	}

	@Override
	public Card[] remainingCards() {
		// Return a new array containing only cards that have been dealt.
				Card[] copydeck = new Card[decksize-nextCard-1];
				for(int x = nextCard; x < copydeck.length; x++){
					copydeck[x] = cardDeck[x];
					System.out.println(copydeck[x]);
				}
				return copydeck;
	}

	public String toString() {
		//print all the cards in the deck.
		String stringCardDeck = "";
		for(Card card:cardDeck) {
		stringCardDeck += card.toString() +"\n";
	}
	return stringCardDeck;
}
}
