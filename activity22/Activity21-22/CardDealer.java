
public class CardDealer {
//driver class for testing your DeckOfCards.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Card robbiesCard = new Card(Suit.Spades,Rank.Seven);
Card alsCard = new Card(Suit.Spades,Rank.Ten);
System.out.println(robbiesCard.compareTo(alsCard));
System.out.println(robbiesCard.toString());

DeckOfCards robbiesDeck = new DeckOfCards();
//robbiesDeck.shuffle();
//System.out.println(robbiesDeck.toString());
System.out.println(robbiesDeck.draw());
System.out.println(robbiesDeck.draw());
System.out.println(robbiesDeck.draw());
//System.out.println(robbiesDeck.dealtCards());
System.out.println(robbiesDeck.remainingCards());
	}

}
