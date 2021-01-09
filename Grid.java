//A foundation class for the GUI implementation
class Grid{
	//initialize the rows and columns for the grid
    private int rows; //to get recorded in the array for the  20x20 grid
    private int columns; //to get recorded in the array for the  20x20 grid
	
	//initialize the setter and getter
    public int getRows() 
	{
        return rows;
    }
    public void setRows(int rows)
	{
        this.rows=rows;
    }
    public int getColumns()
	{
        return columns;
    }
    public void setColumns(int columns)
	{
        this.columns=columns;
    }
}

