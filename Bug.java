//A bug is a sublclass of the organisms
class Bug extends Organism
{
	public static final int BREED= 8;	//Ticks to breed
	public static final int BSTARVE= 3;	//Ticks to starve

	private int starveTicks;	//Number of moves since last feeding
 	public Bug()
 	{
		super();
		starveTicks=0;
	}
	
	//Override from the Organism
	@Override
	public void move(int x,int y){}

	
}
