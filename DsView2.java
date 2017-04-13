package Project;











import java.awt.BorderLayout;

import java.awt.CardLayout;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.FlowLayout;

import java.awt.GridBagLayout;

import java.awt.GridLayout;

import java.awt.Image;

import java.awt.Toolkit;

import javax.swing.BorderFactory;

import javax.swing.BoxLayout;

import javax.swing.GroupLayout;

import javax.swing.JButton;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.SpringLayout;

import javax.swing.ViewportLayout;

import javax.swing.border.Border;


 

public class DsView2 extends JFrame {

    JLabel logo,search; 

    JPanel top,left,right,display1,display2;

    Border border;

    

    DsView2(){

        super("Model selection");

        setLayout(new BorderLayout());

        border=BorderFactory.createLineBorder(Color.BLACK);

        //top panel

        

        top=new JPanel();

        top.setBorder(border);

        top.setLayout(new FlowLayout());

        Toolkit t=Toolkit.getDefaultToolkit();  

        Image i=t.getImage("p3.gif");

        logo=new JLabel("Logo");

        logo.setFont(new java.awt.Font("Tahoma", 1, 48));

        top.add(logo);

        JLabel empty=new JLabel("                                                           Search Here");

        top.add(empty);

        JTextField searchBox=new JTextField("",20);

        top.add(searchBox);






        add(top,BorderLayout.NORTH);

        

        //Left Panel

        

        left=new JPanel();

        left.setBorder(border);

        left.setLayout(null);

        JLabel searchV  = new JLabel("Search Vehicle:");

        searchV.setBounds(10, 10, 100, 30);

        

        JLabel filterLabel1 = new JLabel("Search Model:");

        filterLabel1.setBounds(10, 30, 100, 30);

        JComboBox modelFilter1 = new JComboBox();

        modelFilter1.addItem("ATS");
        modelFilter1.addItem("CTS");
        modelFilter1.addItem("Fiesta");

        modelFilter1.setBounds(10, 60, 100, 30);

        

        JLabel filterLabel2 = new JLabel("Search Make:");

        filterLabel2.setBounds(10, 90, 100, 30);

        JComboBox modelFilter2 = new JComboBox();

        modelFilter2.addItem("Toyota");

        modelFilter2.addItem("Chevrolet");

        modelFilter2.addItem("Ford");

        modelFilter2.setBounds(10, 120, 100, 30);

        

        JLabel filterLabel3 = new JLabel("Search Year :");

        filterLabel3.setBounds(10, 150, 100, 30);

        JComboBox modelFilter3 = new JComboBox();

        modelFilter3.addItem("2017");

        modelFilter3.addItem("2016");

        modelFilter3.addItem("2015");

        modelFilter3.setBounds(10, 180, 100, 30);

        

        JLabel filterLabel4 = new JLabel("Search Price :");

        filterLabel4.setBounds(10, 210, 100, 30);

        JComboBox modelFilter4 = new JComboBox();

        modelFilter4.addItem(">50,000");

        modelFilter4.addItem("20,000-50,000");

        modelFilter4.addItem("<20,000");

        modelFilter4.setBounds(10, 240, 100, 30);

        

        JLabel filterLabel5 = new JLabel("Sort By :");

        filterLabel5.setBounds(10, 270, 100, 30);

        JComboBox modelFilter5 = new JComboBox();

        modelFilter5.addItem("Year");

        modelFilter5.addItem("Model");

        modelFilter5.addItem("Price");

        modelFilter5.setBounds(10, 300, 100, 30);

        

        left.add(searchV);

        left.add(filterLabel1);

        left.add(modelFilter1);

        left.add(filterLabel2);

        left.add(modelFilter2);

        left.add(filterLabel3);

        left.add(modelFilter3);

        left.add(filterLabel4);

        left.add(modelFilter4);

        left.add(filterLabel5);

        left.add(modelFilter5);

        add(left,BorderLayout.WEST);

        

        //right Panel

        

        right=new JPanel();

        right.setBorder(border);

        right.setLayout(null);

        

        

        






        display1=new JPanel();

        display1.setLayout(null);

        display1.setBackground(Color.CYAN);

        

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

        display1.setBounds(10,40,600,80);

        right.add(display1);

        

        

        display2=new JPanel();

        display2.setLayout(null);

        display2.setBackground(Color.PINK);

        

        JButton dbtn1 = new JButton("Image here");

 

        dbtn1.setBounds(10, 10, 100, 50); 

        display2.add(dbtn1);

        

        JLabel ddetail1 = new JLabel("2017 Toyota");

        ddetail1.setBounds(150, 10, 100, 20);

        JLabel ddetail2 = new JLabel("MRP 32000");

        ddetail2.setBounds(150, 30, 100, 20);

        display2.add(ddetail1);

        display2.add(ddetail2);

        

        JButton dbtn2 = new JButton("View Details");

        dbtn2.setBounds(410, 20, 130, 30); 

        display2.add(dbtn2);

        

        display2.setBounds(10,150,600,80);
        
        right.add(display1);right.add(display2);

        

        add(right);

        

        left.setPreferredSize(new Dimension(200, 600));

        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();

        setSize(800,800);

        setVisible(true);

        setResizable(false);

    }

    public static void main(String[] arg){

        DsView2 ds=new DsView2();

    }

}