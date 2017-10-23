import java.util.LinkedList;
import java.util.List;

public class Table {
	int tableID;
	String tableImage;
	List<Player> players = new LinkedList<Player>();
	int AICount;
	int playerCount;
	
	public Table(int tableID, String tableImage) {
		this.tableID = tableID;
		this.tableImage = tableImage;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
		playerCount++;
	}
	
	public void removePlayer(Player player) {
		this.players.remove(player);
		playerCount--;
	}
	
	public void addAI() {
		//TODO
		AICount++;
	}
	
	public void removeAI() {
		//TODO
		AICount--;
	}
	
	public int getTableID () {
		return tableID;
	}
	
	public int getPlayerCount () {
		return playerCount;
	}
	
	public int getAICount () {
		return AICount;
	}
	
	public List<Player> getPlayers () {
		return this.players;
	}
	
}
