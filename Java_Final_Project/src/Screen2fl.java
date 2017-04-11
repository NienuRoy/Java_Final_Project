/**
 * Created by kysft on 4/10/17.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen2 extends JFrame implements ActionListener {

    JPanel jpCenter, jpWest, jpNorth;
    JPanel jpShow1, jpShow2, jpShow3, jpShow4, jpShow5;

    JButton jbsearchCar, jbviewDetails;

    JComboBox jcbYear, jcbModel, jcbMake, jcbType, jcbPrice, jcbCategory;

    JLabel jblSearch, jblYear, jblModel, jblMake;

    JTextField jtfsearch;

    public Screen2() {
        //create main panel
        jpCenter = new JPanel();
        jpCenter.setBorder(BorderFactory.createLineBorder(Color.blue));
        jpNorth = new JPanel();
        jpWest = new JPanel();
        jpWest.setPreferredSize(new Dimension(300, 600));
        jpWest.setBorder(BorderFactory.createLineBorder(Color.red));


        //create show panel
        jpShow1 = new JPanel();
        jpShow1.setBorder(BorderFactory.createLineBorder(Color.red));
        jpShow2 = new JPanel();
        jpShow2.setBorder(BorderFactory.createLineBorder(Color.black));
        jpShow3 = new JPanel();
        jpShow3.setBorder(BorderFactory.createLineBorder(Color.black));
        jpShow4 = new JPanel();
        jpShow4.setBorder(BorderFactory.createLineBorder(Color.black));
        jpShow5 = new JPanel();
        jpShow5.setBorder(BorderFactory.createLineBorder(Color.black));

        //create button
        jbsearchCar = new JButton("Search NOW!");
        jbviewDetails = new JButton("View Details");

        //create JComboBox for west
        jcbYear = new JComboBox();
        jcbModel = new JComboBox();
        jcbMake = new JComboBox();
        jcbType = new JComboBox();
        jcbPrice = new JComboBox();
        jcbCategory = new JComboBox();

        //create text field
        jtfsearch = new JTextField();

        //create label for center to show search result
        jblSearch = new JLabel("Search Vehicles");
        jblYear = new JLabel("Year");
        jblModel = new JLabel("Model");
        jblMake = new JLabel("Make");

        //add to component, setup main structure
        this.add(jpNorth, BorderLayout.NORTH);
        this.add(jpWest, BorderLayout.WEST);
        this.add(jpCenter, BorderLayout.CENTER);

        //add to north
        jpNorth.setLayout(new GridLayout(1, 3, 10, 10));
        jpNorth.add(jblSearch);
        jpNorth.add(jtfsearch);
        jpNorth.add(jbsearchCar);

        //add to west
        jpWest.setLayout(new GridLayout(6, 1, 3, 3));
        jpWest.add(jcbYear);
        jpWest.add(jcbModel);
        jpWest.add(jcbMake);
        jpWest.add(jcbType);
        jpWest.add(jcbPrice);
        jpWest.add(jcbCategory);

        //add to center
        jpCenter.setLayout(new GridLayout(5, 1, 10, 10));
        jpCenter.add(jpShow1);
        jpCenter.add(jpShow2);
        jpCenter.add(jpShow3);
        jpCenter.add(jpShow4);
        jpCenter.add(jpShow5);
        jpShow1.add(jblSearch);
        jpShow1.add(jblYear);
        jpShow1.add(jblModel);
        jpShow1.add(jblSearch);
        jpShow1.add(jblMake);

        //for screen update
        this.setTitle("Let's finding your AMAZING Car!");
        this.setSize(4000, 5000);
        this.setLocation(10, 10);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jbsearchCar.addActionListener(this::actionPerformed);//to call search function
    }

    public String searchFunction() {
        return "";
    }

    public static void main(String[] args) {
        new Screen2();
    }

    public void actionPerformed(ActionEvent e) {
        jblSearch.setText(searchFunction());
    }
}

