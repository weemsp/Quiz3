package pkgCore;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Card {
	//Due to GitHub difficulties, I was unable to procure my group's finished Lab 3 code, so I rewrote a few things.
	
	private eRank rank;
	private eSuit suit;
	
	public Card(eRank inRank, eSuit inSuit) {
		this.rank = inRank;
		this.suit = inSuit;
	}
	
	public eRank geteRank() {
		return this.rank;
	}
	
	public boolean isE(Object e) {
		if (e instanceof eRank) {
			return rank == (eRank) e;
		} else if (e instanceof eSuit) {
			return suit == (eSuit) e;
		}
		return false;
	}
	
	public int compareTo(Object o) {
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());
	}
}
