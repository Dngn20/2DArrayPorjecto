package grid.view;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import grid.controller.GridController;

public class GridPanel extends JPanel
{
	private SpringLayout baseLayout;
	private GridController baseController;
	private JLabel titleLabel;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JTextField rowInput;
	private JButton enter;
	private JTextField colInput;
	private JTable gridTable;
	private JScrollPane gridPane;


	public GridPanel(GridController baseController)
	{
		super();
		
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.rowLabel = new JLabel("Rows");
		this.columnLabel = new JLabel("Columns");
		this.rowInput = new JTextField(10);
		this.colInput = new JTextField(10);
		this.enter = new JButton("Enter");
		this.titleLabel= new JLabel("TacToeTic");
		
		
		setupListeners();
		setupTable();
		setupPanel();
		setupLayout();
		
	}
	
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String [] {"one","two","three", "four","five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
	}
	
	
	
	private void setupListeners()
	{
		enter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				
			}
		}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.darkGray);
		
		titleLabel.setFont(new Font("Malayalam MN", Font.PLAIN, 50));
		
		this.add(titleLabel);
		this.add(enter);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(rowInput);
		this.add(enter);
		this.add(colInput);
		
	}


	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rowInput, 3, SpringLayout.SOUTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rowInput, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, colInput, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 66, SpringLayout.SOUTH, colInput);
		baseLayout.putConstraint(SpringLayout.NORTH, colInput, 3, SpringLayout.SOUTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.WEST, enter, 66, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, enter, -79, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 120, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 34, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 10, SpringLayout.WEST, this);
	
	}



}
