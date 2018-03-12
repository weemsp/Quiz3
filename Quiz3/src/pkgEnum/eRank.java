package pkgEnum;

public enum eRank {

	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(
			13), ACE(14);

	public static final eRank[] ALL_RANKS = {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};
	
	private int iRankNbr;

	private eRank(int iRankNbr) {
		this.iRankNbr = iRankNbr;
	}

	public int getiRankNbr() {
		return iRankNbr;
	}

}