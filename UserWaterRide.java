 package theme;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class UserWaterRide extends Frame
{
    JTextField txtName,txtAge,txtCountry;
    Button btnBuy;
    Label lblName,lblAge,lblCountry;
    ThemeParkListener tk; 
    UserWaterRide()
    {
        super("Water Ride Tickets");
        this.setLayout(null);
        this.setBounds(50,50,530,300);
        tk = new ThemeParkListener(this);
        txtName = new JTextField();
        txtAge = new JTextField();
        txtCountry = new JTextField();
        btnBuy = new Button("Purchase");
        lblName = new Label("Name");
        lblAge = new Label("Age");
        lblCountry = new Label("Country");
        lblName.setBounds(50,50,150,50);
        txtName.setBounds(210,50,300,50);
        lblAge.setBounds(50,110,150,50);
        txtAge.setBounds(210,110,100,50);
        lblCountry.setBounds(50,170,150,50);
        txtCountry.setBounds(210,170,100,50);
        btnBuy.setBounds(210,230,70,50);

        add(txtName);
        add(txtAge);
        add(txtCountry);
        add(lblName);
        add(lblAge);
        add(lblCountry);
        add(btnBuy);

        btnBuy.addActionListener(tk);
    }
}