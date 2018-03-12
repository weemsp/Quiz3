package pkgCore;
import java.util.ArrayList;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck(int numberOfDecks) {
		for (int i = 0; i < numberOfDecks; i++) {
			for (int j = 0; j < eRank.ALL_RANKS.length; j++) {
				for (int k = 0; k < eSuit.ALL_SUITS.length; k++) {
					this.cards.add(new Card(eRank.ALL_RANKS[j], eSuit.ALL_SUITS[k]));
				}
			}
		}
	}
	
	public int getRemaining(Object e) {
		int r=0;for(Card c:cards){if(c.isE(e))r++;}return r;
	}
}
