//has 2 subclass which are ant and bugs
//Is also " has a" some rules to followed by the organism
public class Organism
{
	//A function Override for the both organism to move.
	public void move(int x,int y){}
	
	private int column; //get the colum
	private int row;	//get the row

	public int getColumn()	//getter
	{
		return column;
	}
	public void setColumn(int column) //setter
	{
		this.column= column;
	}
	public int getRow()	//getter
	{
		return row;
	}
	public void setRow(int row)	//setter
	{
		this.row= row;
	}

}