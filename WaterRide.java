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
import javax.swing.table.DefaultTableModel;
public class WaterRide extends JFrame
{
    JTable table;
    ThemeParkListener tk; 
    WaterRide()
    {
        super("Water Ride");
        this.setBounds(50, 50, 700, 1000);
        tk=new ThemeParkListener(this);
        String[] columnNames = {"Name","Age","Country"};
        String[][] data = new String[3][10];
        DefaultTableModel dtm = new DefaultTableModel(data,columnNames);
        JTable table = new JTable(dtm);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        add(sp);

         try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
            String query = "SELECT * FROM `waterrideticket`";
           java.sql.Statement stmt=con.createStatement();
           ResultSet rs = stmt.executeQuery(query);
            dtm = (DefaultTableModel)table.getModel();
           dtm.setRowCount(0);
            String name,age,country;
           while(rs.next())
           {
               name = rs.getString("Name");
               age = rs.getString("Age");
               country = rs.getString("Country");
              String[] s = {name,age,country};
              dtm.addRow(s);
           }
         } catch (Exception e) {
            System.out.println(e);
         }
       
        
                 
        
        
    }
}