package grid.controller;

import grid.model.Game;
import grid.view.*;
import javax.swing.JOptionPane;

public class GridController
{
	private Game [][] grid;
	private GridFrame appFrame;
	
	public GridController()
	{
		grid[0][4] = new Game();
		appFrame = new GridFrame(this);
	}
	
	private void fillGrid()
	{
		for(int row = 0; row < grid.length; row++)
		{
			for(int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new Game();
				appFrame = new GridFrame(this);
			}
		}
	}
	
	public GridFrame getAppFrame()
	{
		return appFrame;
	}

	public void start()
	{
		
	}
}
