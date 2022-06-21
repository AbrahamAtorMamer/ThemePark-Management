package theme;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
class RideTicket extends JFrame
{

    
    JTable tab;
    Button btnDelete;
    ThemeParkListener tk; 
    RideTicket()
    {
        super("Ride Tickets");
        this.setLayout(null);
        this.setBounds(50,50,1000,800);
        tk = new ThemeParkListener(this);
        String[] columnNames = {"Name","Age","Country"};
        String[][] data = new String[3][10];
        DefaultTableModel dm = new DefaultTableModel(data,columnNames);
        JTable tab = new JTable(dm);
        tab.setBounds(30, 40, 200, 300);
        JScrollPane pan = new JScrollPane(tab);
        add(pan);

         try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
            String query = "SELECT * FROM `rideticket`";
           java.sql.Statement stmt=con.createStatement();
           ResultSet rs = stmt.executeQuery(query);
            dm = (DefaultTableModel)tab.getModel();
           dm.setRowCount(0);
            String name,age,country;
           while(rs.next())
           {
               name = rs.getString("Name");
               age = rs.getString("Age");
               country = rs.getString("Country");
              String[] s = {name,age,country};
              dm.addRow(s);
           }
         } catch (Exception e) {
            System.out.println(e);
         }
 
        
       

    }

}