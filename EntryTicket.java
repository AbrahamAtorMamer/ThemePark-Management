package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class EntryTicket extends JFrame
{
         
         Button btnDelete;
         JTable tale;
         ThemeParkListener tk;
         EntryTicket()
         {
             super("Entry Tickets");
             this.setBounds(50,50,1000,800);
             tk   = new ThemeParkListener(this);
             String[] columnNames = {"Name","Age","Country"};
             String[][] data = new String[3][10];
             DefaultTableModel dt = new DefaultTableModel(data,columnNames);
             JTable tale = new JTable(dt);
             tale.setBounds(30, 40, 200, 300);
             JScrollPane span = new JScrollPane(tale);
             add(span);
     
              try {
                 Class.forName("com.mysql.jdbc.Driver");  
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theme park managment?characterEncoding=utf8","root","");   
                 String query = "SELECT * FROM `entryticket`";
                java.sql.Statement stmt=con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                 dt = (DefaultTableModel)tale.getModel();
                dt.setRowCount(0);
                 String name,age,country;
                while(rs.next())
                {
                    name = rs.getString("Name");
                    age = rs.getString("Age");
                    country = rs.getString("Country");
                   String[] s = {name,age,country};
                   dt.addRow(s);
                }
              } catch (Exception e) {
                 System.out.println(e);
              }
      
          }

}