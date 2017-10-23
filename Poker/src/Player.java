
public class Player {
	int chips;
	String username;
	String avatar;
	Hand hand;
	
	//Player constructor
	public Player(String gUsername, String gAvatar) {
		this.chips = 500;
		this.username = gUsername;
		this.avatar = gAvatar;
	}
	
	public void setChips(int chips) {
		this.chips = chips;
	}
	
	public int getChips() {
		return chips;
	}
	
	public void setHand(Hand hand) { 
		this.hand = hand;
	}
	
	public Hand getHand() {
		return hand;
	}
}
