
public class Card implements Comparable<Card>{

	//every card will have a rank and suit instance variable
	private Rank rank;
	private Suit suit;
	
	public Card(Suit Suit,Rank Rank) {
		this.rank = Rank;
		this.suit = Suit;
	}
	public Suit getSuit() {
		return this.suit;
	}
	public Rank getRank() {
		return this.rank;
	}
	
	//returns the faceValue of the cards rank.
	public int getValue() {
		return this.rank.getFaceValue();
	}
	

	
	@Override
	public int compareTo(Card alsCard) {
		
				int thisRank = this.getValue();
				int otherRank = alsCard.getValue();
				//if objects are equal
				if (thisRank == otherRank) {
				return 0;}
				if (thisRank < otherRank) {
				//value of this card is less than the value of the other card
				return -1;
				}
				if (thisRank > otherRank) {
				//value of this card is greater than the value of the other card.
				return 1;
				}
				return -1;
	}
	
// return a String in the format: “<rank> of <suit>”
	public String toString() {
		String returnString = "<" + rank + ">"+  " of " + "<" + suit + ">";
		return returnString;
		
	}
	

	

}
