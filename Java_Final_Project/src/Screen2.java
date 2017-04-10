import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen2 extends JFrame{
	JPanel mainPanel;
	JButton viewDetails;
	JComboBox filterYear,filterModel,filterMake,filterType,filterPrice,filterCategory;
	JLabel mainLabel,labelYear,labelModel,labelMake;
	JPanel panel1;
	
	public Screen2(){
		mainPanel = new JPanel();
		viewDetails = new JButton("View Details");
		
		filterYear = new JComboBox();
		filterModel = new JComboBox();
		filterMake = new JComboBox();
		filterType = new JComboBox();
		filterPrice = new JComboBox();
		filterCategory = new JComboBox();
		
		mainLabel = new JLabel("Search Vehicles");
		labelYear = new JLabel("Year");
		labelModel = new JLabel("Model");
		labelMake = new JLabel("Make");
		
		panel1 = new JPanel();
		
		
		this.setSize(5000,5000);
		this.setLocation(10,10);
		
		this.add(mainPanel);
		mainPanel.add(viewDetails);
		mainPanel.add(mainLabel);
		//add(filterYear);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args){
		new Screen2();
		
	}
	
	
	

}
