
public class WarGames {

	public static void main(String[] args) {
		for(String arg: args) {
			
		}
		DeckOfCards playerOne = new DeckOfCards(); 
		playerOne.shuffle();
		DeckOfCards playerTwo = new DeckOfCards();
		playerTwo.shuffle();
		int roundCount = 0;
		
		//loop
		while roundCount < args{
		System.out.println("Round " + roundCount + "...");
		Card playerOneCard = playerOne.draw();
		Card playerTwoCard = playerTwo.draw();
		System.out.println("Player 1: " + playerOneCard);
		System.out.println("Player 2L " + playerTwoCard);
		int output = playerOneCard.compareTo(playerTwoCard);
		if (output) {
			System.out.println("Player 2 wins!");
		}
		if (output) {
			System.out.println("Player 1 wins!");
		}
		else {
			System.out.println("Tie!");
		}
		
		roundCount += 1;	
		}
	}
}
