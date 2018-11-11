
public enum Ranks {
	Ace(11,1),
	King(10),
	Queen(10),
	Jacks(10),
	Ten(10),
	Nine(9),
	Eight(8),
	Seven(7),
	Six(6),
	Five(5),
	Four(4),
	Three(3),
	Two(2);
	
	private int rank;
	
	public int getrank()
	{
		return this.rank;
	}
	
	private Ranks(int rank){
		this.rank = rank;
	}
	
	private Ranks(int hard, int soft) {
		if(soft == 0)
			{
				this.rank = hard;
			}
		else {
				this.rank = soft;
		}
			
	}
}
