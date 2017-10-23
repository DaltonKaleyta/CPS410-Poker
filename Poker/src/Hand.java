
public class Hand {
	int rating;
	Card[] cards = new Card[2];
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}

}
