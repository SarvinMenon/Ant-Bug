//Is a main class to played together with the GUI.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util. *;

public class GUI extends JFrame
{
	JLabel arr[][]= new JLabel[20][20];
	public GUI() throws HeadlessException
	{
		super("Ant&Bugs Game");
        final Icon antpic= new ImageIcon("ant.png");
        final Icon bugpic= new ImageIcon("bug.png");
        final Icon emptypic= new ImageIcon("blank.png");
        setSize(800,600);
        setLayout(new GridLayout(20,20));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
		//Implement blank spot by doing a "for loop" and print the image on it.
        for (int i=0;i<20;i++)
		{
			for (int j= 0;j<20;j++)
			{
                arr[i][j]= new JLabel(emptypic);
			}
        }

        //Randomizes location of objects (bugs and ants) in boxes 
		//Using DS "Set" to set unique values without order
		//orgs= ants and bugs
        final Random r= new Random();
        final Set<Grid>orgs= new HashSet<Grid>();
        int count= 0;
        while (count <105){
            final Grid l= new Grid();
            final int x= r.nextInt(20);
            final int y= r.nextInt(20);
            l.setColumns(x);
            l.setRows(y);
            if (!orgs.contains(l)) {
                orgs.add(l);
                count++;
            }
        }
		//To print the image of bug and ant.
        final Iterator<Grid> it= orgs.iterator(); 
		for (int i=0;i<5;i++)
		{
			final Grid p= it.next();
            final int x= p.getRows();
            final int y= p.getColumns();
            arr[x][y]= new JLabel(bugpic); 
		}
		
		for (int i=0;i<100;i++)
		{
			final Grid p= it.next();
            final int x= p.getRows();
            final int y= p.getColumns();
            arr[x][y] = new JLabel(antpic);
		}
		//To align the boxes and a border.
		for (int i=0;i<20;i++)
		{
			for (int j= 0; j < 20; j++)
			{
				if (arr[i][j] != null)
				{
					arr[i][j].setSize(20, 20);
					arr[i][j].setBorder(BorderFactory.createLineBorder(Color.PINK));
				}
			}
		}
        // Add each cell to "JLabel", and prints it
        for (int i=0;i<20;i++)
		{
			for (int j = 0; j < 20; j++)
			{
                add(arr[i][j]);
            }
        }
	}
	public static void main(final String[] args)
	{
		new GUI();
	}
}