package com.neu.jan17.UI;

import com.neu.jan17.data.InventoryManager;
import com.neu.jan17.data.Vehicle;
import com.neu.jan17.data.Category;

import com.neu.jan17.search.Filter;
import com.neu.jan17.search.LiteralFilter;
import com.neu.jan17.search.RangeFilter;
import com.neu.jan17.search.SearchTool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class CustomerVehicleSearchScreen extends JFrame implements CustomerVehicleSearchInterface{
		private static final long serialVersionUID = 1L;
	
	private JPanel leftPanel,rightPanel,pane1,pane2,pane3,pane4,pane5,topPanel;
	private JButton homeBtn,viewDetails1,viewDetails2,viewDetails3,viewDetails4,viewDetails5,searchBtn,searchFilter;
	private JComboBox<String> filterYear,filterModel,filterMake,filterType,filterPrice,filterCategory,filterSort;

	private JLabel topPicture,vehicleLabel,yearLabel,modelLabel,makeLabel,typeLabel,priceLabel,categoryLabel;
	private JTextField searchBar;
	private JScrollPane scrollPane;
	private List<Filter> filters;
	private SearchTool searchTool;
	private InventoryManager inventoryManager;

	private List<JComboBox> comboboxes;
	private List<JLabel>label;


	public CustomerVehicleSearchScreen() throws Exception{

		super("Vehicle Search Screen");
		try{
			filters=new ArrayList<>();
			inventoryManager = new InventoryManager("data");
			searchTool=new SearchTool("data");
		}catch(Exception e) {
		}
		setSize(1800,1000);
		setLocation(10,10);
		
		rightPanel = new JPanel();
		leftPanel = new JPanel();
		topPanel=new JPanel();
		scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(leftPanel,BorderLayout.WEST);
		c.add(rightPanel,BorderLayout.CENTER);
		c.add(topPanel,BorderLayout.NORTH);
		c.add(scrollPane,BorderLayout.CENTER);
		
		setRightPanel();
		setLeftPanel();
		setTopPanel();
		setLayout();
		addListener();


		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	@Override
	public void setRightPanel() {

		rightPanel.setBackground(new Color(127, 179, 213));
		rightPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));

		//Setting scrollpane
		scrollPane.setViewportView(rightPanel);

		//Setting Panels
		pane1 = new JPanel();
		pane1.setBackground(new Color(235, 245, 251));
		pane1.setPreferredSize(new Dimension(1000, 120));

		pane2 = new JPanel();
		pane2.setBackground(new Color(235, 245, 251));
		pane2.setPreferredSize(new Dimension(1000, 120));

		pane3 = new JPanel();
		pane3.setBackground(new Color(235, 245, 251));
		pane3.setPreferredSize(new Dimension(1000, 120));

		pane4 = new JPanel();
		pane4.setBackground(new Color(235, 245, 251));
		pane4.setPreferredSize(new Dimension(1000, 120));

		pane5 = new JPanel();
		pane5.setBackground(new Color(235, 245, 251));
		pane5.setPreferredSize(new Dimension(1000, 120));


		viewDetails1 = new JButton("View Details");
		viewDetails1.setBackground(new Color(127, 179, 213));
		viewDetails2 = new JButton("View Details");
		viewDetails2.setBackground(new Color(127, 179, 213));
		viewDetails3 = new JButton("View Details");
		viewDetails3.setBackground(new Color(127, 179, 213));
		viewDetails4 = new JButton("View Details");
		viewDetails4.setBackground(new Color(127, 179, 213));
		viewDetails5 = new JButton("View Details");
		viewDetails5.setBackground(new Color(127, 179, 213));
	}

		@Override
		public void setLeftPanel() {


			leftPanel.setBackground(new Color(127, 179, 213));
			leftPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));

			//String[] year = {"Year:","<2014","2015","2016","2017",">2017"};
			Object items0[] = inventoryManager.getVehicleYearItems().toArray();
			filterYear = new JComboBox(items0);
			filterYear.setPreferredSize(new Dimension(180, 26));

			//String[] model = {"Model:","Model1","Model2","Model3","Model4","Model5"};

			Object items[] = inventoryManager.getVehicleModelItems().toArray();
			filterModel = new JComboBox(items);
			filterModel.setPreferredSize(new Dimension(180, 26));

			//String[] make = {"Make:","Make1","Make2","Make3","Make4","Make5"};
			Object items1[] = inventoryManager.getVehicleMakeItems().toArray();
			filterMake = new JComboBox(items1);
			filterMake.setPreferredSize(new Dimension(180, 26));

			//String[] type = {"Type:","Type1","Type2","Type3","Type4","Type5"};
			Object items2[] = inventoryManager.getVehicleBodyTypeItems().toArray();
			filterType = new JComboBox(items2);
			filterType.setPreferredSize(new Dimension(180, 26));

			String[] price = {"Price:", "0-10,000", "10,000-20,000", "20,000-30,000", "30,000-40,000", "40,000-50,000", "50,000-60,000"};
			filterPrice = new JComboBox<String>(price);
			filterPrice.setPreferredSize(new Dimension(180, 26));

			String[] category = {"Category:", "NEW", "USED", "Certified"};
			filterCategory = new JComboBox<String>(category);
			filterCategory.setPreferredSize(new Dimension(180, 26));

			String[] sortBy = {"Sort By:", "Year Asc", "Year Desc", "Price Asc", "Price Desc"};
			filterSort = new JComboBox<String>(sortBy);
			filterSort.setPreferredSize(new Dimension(180, 26));

			vehicleLabel = new JLabel("Search Vehicles");
			vehicleLabel.setFont(new Font("Serif", Font.PLAIN, 20));

			topPicture = new JLabel("Space for picture");
			topPicture.setFont(new Font("Serif", Font.PLAIN, 40));


		}

		@Override

		public void setTopPanel(){

			searchBar = new JTextField(30);

			topPanel.setBackground(new Color(41, 128, 185));
			topPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));

			//Setting buttons
			searchBtn = new JButton("Search");

			searchFilter = new JButton("Search");
			searchFilter.setPreferredSize(new Dimension(180, 25));

			homeBtn = new JButton("Home");
			homeBtn.setPreferredSize(new Dimension(150, 30));
			homeBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					new MainPage();
				}

			});
		}



	public void setLayout() {
		leftPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.insets = new Insets(10,30,2,15);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.weightx = 0.5;
		gc.weighty = 0.5;

		gc.gridx = 0;gc.gridy = 3;
		leftPanel.add(vehicleLabel,gc);

		gc.gridx = 0;gc.gridy = 4;
		leftPanel.add(filterModel,gc);

		gc.gridx = 0;gc.gridy = 5;
		leftPanel.add(filterMake,gc);

		gc.gridx = 0;gc.gridy = 6;
		leftPanel.add(filterYear,gc);

		gc.gridx = 0;gc.gridy = 7;
		leftPanel.add(filterType,gc);

		gc.gridx = 0;gc.gridy = 8;
		leftPanel.add(filterPrice,gc);
		
		
		gc.gridx = 0;gc.gridy = 9;
		leftPanel.add(filterCategory,gc);
		
		gc.weighty = 30;
		gc.gridx = 0;gc.gridy = 10;
		leftPanel.add(searchFilter,gc);

		topPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc1 = new GridBagConstraints();

		gc1.insets = new Insets(50,50,20,50);

		gc1.weightx = 0.5;gc1.weighty = 0.5;

		gc.gridx = 0;gc.gridy = 2;
		topPanel.add(topPicture,gc);

		gc1.anchor = GridBagConstraints.LAST_LINE_END;
		gc1.gridx = 12;gc1.gridy = 4;
		topPanel.add(searchBar,gc1);

		gc1.anchor = GridBagConstraints.LAST_LINE_START;
		gc1.gridx = 14;gc1.gridy = 4;
		topPanel.add(searchBtn,gc1);

		gc1.gridx = 2;gc1.gridy = 4;
		topPanel.add(homeBtn,gc1);
		
		gc1.gridx = 5;gc1.gridy= 4;
		topPanel.add(filterSort, gc1);


	}

	public Comparable[] valueToRange(String name,String value) {
		Comparable[] range = new Comparable[2];
		if(name.equals("year")) {
			range = new Integer[2];
			if(value.indexOf(">") >= 0) {
				range[0] = Integer.parseInt(value.substring(1));
				range[1] = Integer.MAX_VALUE;
			} else if(value.indexOf("<") >= 0) {
				range[0] = Integer.MIN_VALUE;
				range[1] = Integer.parseInt(value.substring(1));
			} else {
				range[0] = Integer.parseInt(value);
				range[1] = (Integer)range[0] + 1;
			}
		} else if(name.equals("price")) {
			range = new Float[2];
			range[0] = Float.parseFloat(value.split("-")[0]);
			range[1] = Float.parseFloat(value.split("-")[1]);
		}
		return range;
	}

	public void addListener() {
		searchFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchTool st = null;
				try {
					List<Filter> filters = new ArrayList<Filter>();
					 st = new SearchTool("data");

					comboboxes = new ArrayList<JComboBox>();
					comboboxes.add(filterYear);
					comboboxes.add(filterMake);
					comboboxes.add(filterModel);
					comboboxes.add(filterType);
					comboboxes.add(filterCategory);
					comboboxes.add(filterPrice);
				}
				catch (Exception e1)
				{

				}

				for (int i = 0; i < 6; i++) {
					if (!comboboxes.get(i).equals(0)) {
						String value = comboboxes.get(i).toString();
						String name = comboboxes.get(i).getName();
						Filter f;
						if (name.equals("price") || name.equals("year")) {
							Comparable[] range = valueToRange(name, value);
							f = new RangeFilter(comboboxes.get(i).getName(), range[0], range[1]);
						} else {
							if (name.equals("category")) {
								Category c;
								switch (value) {
									case "NEW":
										c = Category.NEW;
										break;
									case "USED":
										c = Category.USED;
										break;
									default:
										c = Category.CERTIFIED;
								}
								f = new LiteralFilter(comboboxes.get(i).getName(), c);
							} else {
								f = new LiteralFilter(comboboxes.get(i).getName(), value);
							}

						}
						filters.add(f);
					}
				}
				if (st.searchByFilters(filters)) {
					List<Vehicle> results = st.getResult();

					for (int i = 0; i < results.size(); i++) {
						Vehicle v = results.get(i);
						yearLabel.setText(v.getYear().toString());
						modelLabel.setText(v.getModel().toString());
						makeLabel.setText(v.getMake().toString());
						priceLabel.setText("Price: " + v.getPrice().toString());
						typeLabel.setText("Body Type: " + v.getBodyType().toString());
						categoryLabel.setText("Category: " + v.getCategory().toString());
					}

				}

				/*filters.add(new LiteralFilter("model",filterModel.getSelectedItem().toString()));
				searchTool.searchByFilters(filters);
				System.out.println(searchTool.getResult().size());
				Vehicle v=searchTool.getResult().get(0);*/


			}
		});
	}



		/*filterModel.addActionListener(e -> {

		});
	}*/




	public static void main(String[] args) throws Exception {

		CustomerVehicleSearchScreen screen = new CustomerVehicleSearchScreen();

	}


}
