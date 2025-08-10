package poker;

/** A virtual playing card. */

public class PlayingCard
{
	// Ranks
	
	static final int KING = 12;
	static final int QUEEN = 11;
	static final int JACK = 10;
	static final int TEN = 9;
	static final int NINE = 8;
	static final int EIGHT = 7;
	static final int SEVEN = 6;
	static final int SIX = 5;
	static final int FIVE = 4;
	static final int FOUR = 3;
	static final int THREE = 2;
	static final int TWO = 1;
	static final int ACE = 0;
	
	// Suits
	
	static final int SPADES = 3;
	static final int DIAMONDS = 2;
	static final int CLUBS = 1;
	static final int HEARTS = 0;
	
	// Attributes
	
	private int rank;
	private int suit;
	private String display;
	
	// Constructor
	
	public PlayingCard()
	{
		rank = -1;
		suit = -1;
		display = new String();
	}
	
	// Mutators
	
	/** Sets the rank of the card.
	 @param r the card's rank */
	
	public void setRank(int r)
	{
		rank = r;
	}
	
	/** Sets the suit of the card.
	 @param s the card's suit */
	
	public void setSuit(int s)
	{
		suit = s;
	}
	
	/** Sets the card's string representation.
	 @param c a Unicode string */
	
	public void setDisplay(String c)
	{
		display = c;
	}
	
	// Accessors
	
	/** Gets the card's rank.
	 @return rank */
	
	public int getRank()
	{
		return rank;
	}
	
	/** Gets the card's suit.
	 @return suit */
	
	public int getSuit()
	{
		return suit;
	}
	
	/** Gets the card's string representation.
	 @return a Unicode string */
	
	public String getDisplay()
	{
		return display;
	}
}
