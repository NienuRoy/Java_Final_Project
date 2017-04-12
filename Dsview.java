package Project;






import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.Image;

import java.awt.Toolkit;

import javax.swing.JButton;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;



public class Dsview extends JFrame {

    JLabel logo,search; 

    JPanel top,left,right,display1,display2;

    JComboBox<String> modelFilter;

    

    Dsview(){

        super("Search Screen");

        setLayout(new BorderLayout());

        

        //top panel

        

        top=new JPanel();

        top.setLayout(new FlowLayout());

        Toolkit t=Toolkit.getDefaultToolkit();  

        Image i=t.getImage("p3.gif");

        logo=new JLabel("Logo");

        logo.setFont(new java.awt.Font("Tahoma", 1, 24));

        top.add(logo);

        add(top,BorderLayout.NORTH);

        

        //Left Panel

        

        left=new JPanel();

        left.setLayout(new GridLayout(10,0.1));

        JLabel searchV  = new JLabel("Search Vehicle:");

        

        JLabel filterLabel1 = new JLabel("Search Model:");

        

        JComboBox modelFilter1 = new JComboBox();

        modelFilter1.addItem("ATS");

        modelFilter1.addItem("CTS");

        modelFilter1.addItem("Fiesta");

        

        JLabel filterLabel2 = new JLabel("Search Make :");

        JComboBox modelFilter2 = new JComboBox();

        modelFilter2.addItem("Toyota");

        modelFilter2.addItem("Chevrolet");

        modelFilter2.addItem("Ford");

        

        JLabel filterLabel3 = new JLabel("Search Year :");

        JComboBox modelFilter3 = new JComboBox();

        modelFilter3.addItem("2017");

        modelFilter3.addItem("2016");

        modelFilter3.addItem("2015");

        

        JLabel filterLabel4 = new JLabel("Search Price:");

        JComboBox modelFilter4 = new JComboBox();

        modelFilter4.addItem(">50,000");

        modelFilter4.addItem("20,000-50,000");

        modelFilter4.addItem("<20,000");

        

        left.add(searchV);

        left.add(filterLabel1);

        left.add(modelFilter1);

        left.add(filterLabel2);

        left.add(modelFilter2);

        left.add(filterLabel3);

        left.add(modelFilter3);

        left.add(filterLabel4);

        left.add(modelFilter4);

        add(left,BorderLayout.WEST);

        

        //right Panel

        

        right=new JPanel();

        right.setLayout(new GridLayout(10,1));

        

        display1=new JPanel();

        display1.setLayout(null);

        display1.setBackground(Color.ORANGE);

        

        JButton btn1 = new JButton("Image here");

 

        btn1.setBounds(10, 10, 100, 50); 

        display1.add(btn1);

        

        JLabel detail1 = new JLabel("2017 Honda");

        detail1.setBounds(150, 10, 100, 20);

        JLabel detail2 = new JLabel("MRP 23000");

        detail2.setBounds(150, 30, 100, 20);

        display1.add(detail1);

        display1.add(detail2);

        

        JButton btn2 = new JButton("View Details");

                btn2.setBounds(410, 20, 130, 30); 

        display1.add(btn2);

        

        right.add(display1);

        

        

        display2=new JPanel();

        display2.setLayout(null);

        display2.setBackground(Color.ORANGE);

        

        JButton dbtn1 = new JButton("Image here");

 

        dbtn1.setBounds(10, 10, 100, 50); 

        display2.add(dbtn1);

        

        JLabel ddetail1 = new JLabel("2017 Honda");

        ddetail1.setBounds(150, 10, 100, 20);

        JLabel ddetail2 = new JLabel("MRP 23000");

        ddetail2.setBounds(150, 30, 100, 20);

        display2.add(ddetail1);

        display2.add(ddetail2);

        

        JButton dbtn2 = new JButton("View Details");

        dbtn2.setBounds(410, 20, 130, 30); 

        display2.add(dbtn2);

        

        right.add(display1);right.add(display2);

        

        add(right);

        

        left.setPreferredSize(new Dimension(200, 10));

        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();

        setSize(800,800);

        setVisible(true);

    }

    public static void main(String[] arg){

        Dsview ds=new Dsview();

    }

}


