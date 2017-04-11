package finalProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Screen2  extends JFrame {


			JPanel mainPanel, panel1, leftPanel,searchPanel, secondPanel;
			JButton viewDetails;
			JComboBox filterYear,filterModel,filterMake,filterType,filterPrice,filterCategory;
			JLabel mainLabel,labelYear,labelModel,labelMake,labelCategory,labelPrice,labelType;
			JTextField search;
			
			public Screen2(){
				mainPanel = new JPanel();
				secondPanel = new JPanel();
				panel1 = new JPanel();
				leftPanel = new JPanel();
				searchPanel = new JPanel();
				
				viewDetails = new JButton("View Details");
				
				search = new JTextField(10);
				
			//----------------------------------------------------------leftPanel Component
				
				String[] years = {"2013","2014"};
				filterYear = new JComboBox(years);
				
				String[] model = {"Volt","Malibu"};
				filterModel = new JComboBox(model);
				
				String[] make = {"Ford","Toyota"};
				filterMake = new JComboBox(make);
				
				String[] type = {"Car","MINI"};
				filterType = new JComboBox(type);
				
				String[] price = {"5000-10000","10000-15000"};
				filterPrice = new JComboBox(price);
				
				String[] category = {"new", "certified","used"};
				filterCategory = new JComboBox(category);
				
		   //-------------------------------------------------------------
				
				mainLabel = new JLabel("Car Details");
				labelYear = new JLabel("Year");
				labelModel = new JLabel("Model");
				labelMake = new JLabel("Make");
				labelCategory = new JLabel("Category");
				labelPrice = new JLabel("Price");
				labelType = new JLabel("Type");
				
				setLayout(null);
				this.setBounds(100,100,2500,2500);

			//--------------------------------------------------------set location	
				getContentPane().add(searchPanel);
				searchPanel.setBounds(300, 50, 100, 80);
				
				getContentPane().add(leftPanel);
				leftPanel.setBounds(50, 200, 100, 300);
				
				getContentPane().add(panel1);
				panel1.setBounds(300, 200, 1000, 100);
				
				
				//this.add(mainPanel);
				//mainPanel.add(mainLabel);
				//add(filterYear);
				
				searchPanel.add(search);
				
			//------------------------------------------------------leftPanel
				leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
				leftPanel.add(filterYear);
				leftPanel.add(filterCategory);
				leftPanel.add(filterModel);
				leftPanel.add(filterType);
				leftPanel.add(filterMake);
				leftPanel.add(filterPrice);
			
			//--------------------------------------------------------panel1
				panel1.setLayout(new BorderLayout(5,5));
				panel1.add("East",viewDetails);
				panel1.add("North", mainPanel);
				panel1.add("Center", secondPanel);
			
			//-------------------------------------------------mainPanel
				mainPanel.add(labelYear);
				mainPanel.add(labelType);
			
			//--------------------------------------------------secondPanel
				secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.Y_AXIS));
				secondPanel.add(labelCategory);
				secondPanel.add(labelMake);
				secondPanel.add(labelPrice);
				
				
				this.setVisible(true);
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);

			}
			
			public static void main(String[] args){
				 
				new Screen2();
				
				
			}
			
			
	}
