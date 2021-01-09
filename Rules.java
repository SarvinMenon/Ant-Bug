//This class set rules for the organisms
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Rules
{
	//For the floor positioning and movement
	char ant='A';
    char bug='B';
    char empty='E';
	
	JLabel arr[][]= new JLabel[20][20];
	char floor[][]= new char[20][20]; 
	
	//Arraylist for the organisms so that they can add,remove during the rules implements
	ArrayList<Organism>ants;
	ArrayList<Organism>bugs;	
	
	Random rand= new Random();
	
	/*change*/
	Icon antpic= new ImageIcon("ant.png");
	Icon bugpic= new ImageIcon("bug.png");
	Icon emptypic= new ImageIcon("blank.png");
	
	Set<Organism>organism= new HashSet<Organism>();
	
	//Implement Singleton
	//a class must ensure that only single instance should be created and single object can be used by all other classes.
	private static Rules Singleton = new Rules();
		private Rules() 
		{
			blankspace();
			placeOrganism();
			sizeScreen();
		}
	public static Rules getRules()
	{
		return Singleton; 
	}
	
	// Places empty cells
	public void blankspace()
	{
		for (int x=0;x<20;x++)
		{
			for (int y=0;y<20;y++)
			{
				arr[x][y]= new JLabel(emptypic);
				floor[x][y]= empty;
			}
		}
	}
	
	public void placeOrganism()
	{
		int count= 0;
		while (count<105)
		{
			Organism placement= new Organism();
			int x= rand.nextInt(20);
			int y= rand.nextInt(20);
			placement.setColumn(x);
			placement.setRow(y);
			
			if (!organism.contains(placement))
			{
				organism.add(placement);
				count++;
			}
		}
		Iterator<Organism>iterate= organism.iterator(); 
		for(int i=0;i<5;i++)
		{
			Organism locations= iterate.next();
	        int x= locations.getRow();
	        int y= locations.getColumn();
	        arr[x][y]= new JLabel(bugpic);
			floor[x][y]= bug; 
		}
	    for (int i=0;i<100;i++)
		{
			Organism locations = iterate.next();
	        int x= locations.getRow();
	        int y= locations.getColumn();
	        arr[x][y]= new JLabel(antpic);
			floor[x][y]= ant;
		}
	}
	
	public void sizeScreen()
	{
		for (int x=0;x<20;x++)
		{
			for (int y=0;y<20;y++)
			{
				if (arr[x][y]!= null) 
				{
					arr[x][y].setSize(20, 20);
	                arr[x][y].setBorder(BorderFactory.createLineBorder(Color.PINK));
				}
			}
		}
	}
}