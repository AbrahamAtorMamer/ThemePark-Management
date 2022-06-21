package theme;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.Statement;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class WaterRide extends JFrame
{
    JTable table;
    ThemeParkListener tk; 
    WaterRide()
    {
        super("Water Ride");
        this.setBounds(50, 50, 700, 1000);
        tk=new ThemeParkListener(this);
        table= new JTable();
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        add(sp);

         /*try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
            String query = "SELECT * FROM `waterrideticket`";
           java.sql.Statement stmt=con.createStatement();
           ResultSet rs = stmt.executeQuery(query);

           while(rs.next())
           {
          //String[][] data ={{"Jason","300","USA"},{"Fergie","33","Scotland"}};
            String[] columnNames = {"Name","Age","Country"};
              String name = rs.getString(1);
              String age = rs.getString(2);
              String country = rs.getString(3);
              String[][] data ={{name,age,country}};
            table = new JTable(data, columnNames);
            table.setBounds(30, 40, 200, 300);
            JScrollPane sp = new JScrollPane(table);
            add(sp);
           }
         } catch (Exception e) {
            //TODO: handle exception
         }*/
       
        
                 
        
        
    }
}