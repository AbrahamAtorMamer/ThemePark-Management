package theme;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class VisitorLog extends Frame
{
    TextField txtNumber,txtDays;
    Label lblNumber,lblDays;
    ThemeParkListener tk;
    VisitorLog()
    {
        super("Visitor's Log");
        this.setLayout(null);
        this.setBounds(50,50,500,500);
        tk = new ThemeParkListener(this);
        txtNumber = new TextField();
        txtDays = new TextField();
        lblNumber = new Label("Number Of Visitors");
        lblDays = new Label("Highest Days");
         lblNumber.setBounds(50,50,130,50);
         txtNumber.setBounds(190,50,100,50);
         lblDays.setBounds(50,100,130,50);
         txtDays.setBounds(190,100,100,50);

         add(txtDays);
         add(lblDays);
         add(txtNumber);
         add(lblNumber);

 } 
}

