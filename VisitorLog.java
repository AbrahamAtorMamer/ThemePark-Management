package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class VisitorLog extends Frame
{
    TextField txtNumber,txtDays;
    Label lblNumber,lblDays;
    ThemeParkListener tk;
    VisitorLog()
    {
        super("Visitor's Log");
        this.setLayout(null);
        this.setBounds(50,50,1000,800);
        tk = new ThemeParkListener(this);
        txtNumber = new TextField();
        txtDays = new TextField();
        lblNumber = new Label("Number");
        lblDays = new Label("Days");
         lblNumber.setBounds(50,50,100,50);
         txtNumber.setBounds(160,50,100,50);
         lblDays.setBounds(50,100,100,50);
         txtDays.setBounds(160,100,100,50);

         add(txtDays);
         add(lblDays);
         add(txtNumber);
         add(lblNumber);

         addWindowListener(new WindowAdapter()
         {
           public void windowClosing(WindowEvent e)
           {
             System.exit(0);
           }
         });
         

     } 
}

